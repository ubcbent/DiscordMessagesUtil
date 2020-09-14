package Utils;

import MessageBeans.Message;
import Constants.Constants;

import java.io.FileNotFoundException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class MessageFileParser {

    public List<Message> parseMessages(String filepath){

        try{
            File file = new File(filepath);
            Scanner scan = new Scanner(file);
            List<Message> messages = new ArrayList<>();
            String line = scan.nextLine();
            //Move to first header
            while(!isHeader(line)){
                line = scan.nextLine();
            }
            while(scan.hasNextLine()){
                String user = retrieveUser(line);
                Timestamp time = retrieveTime(line);
                StringBuilder message = new StringBuilder();
                line = scan.nextLine();
                while(!isHeader(line) && scan.hasNextLine()){
                    message.append(line);
                    line = scan.nextLine();
                }
                messages.add(new Message(user,time, message.toString()));
            }
            return messages;
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            return null;
        }
    }

    private Timestamp retrieveTime(String headerLine){
        try{
            return new Timestamp(Constants.dateFormat.parse(headerLine.substring(1,15)).getTime());
        } catch (Exception e) {
            return null;
        }
    }
    private String retrieveUser(String headerLine){
        try{
            return headerLine.substring(17,headerLine.indexOf('#'));
        }catch(Exception e){
            return null;
        }
    }
    private boolean isHeader(String line){
        return retrieveTime(line)!=null && retrieveUser(line)!=null;
    }
}

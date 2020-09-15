package main.java.MessageBeans;

import java.sql.Timestamp;

public class Message {

    public Message(String user, Timestamp time, String content){
        this.user = user;
        this.time = time;
        this.content = content;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    private String user;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    private Timestamp time;
}

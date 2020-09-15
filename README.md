# DiscordMessagesUtil
Utility made to extend on Tyrrrz's DiscordChatExporter which can archive discord message histories into text files.
The purpose of this tool is to provide users with the ability to extract information and interesting data from discord message histories.

## Usage
Aside from compiling into a jar file to use as a framework, this project can be used as a fun activity to search through and view statistics about your discord message histories:
1. Use the [DiscordChatExporter](https://github.com/Tyrrrz/DiscordChatExporter/releases) to get a text file of the chat history of your choosing. Make sure the date format is set to "dd-MM-yy HH:mm", otherwise this won't work.
2. Create a testing/sandbox main method
3. Using the MessageFileParser class and the absolute path to your new file, get a list of Message objects.
4. Use the operation files as you see fit to filter, sort, map, and/or compare these messages.

## Future Possibilities
Any or all of the following features may appear in the future:
* More streamlined operation usage, rather than confusing method call nesting
* Natural Language Process integration, to allow more interesting analytics
* Integrated discord message history retrieval, to remove the DiscordChatExporter dependency
* UI and/or web integration for a direct user platform

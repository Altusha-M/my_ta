package com.assignment.my_ta.POJO;

public class Message {

    public Message(String messageText) {
        this.messageText = messageText;
    }

    public Message() {
    }

    String messageText;

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageText='" + messageText + '\'' +
                '}';
    }

}
package com.revature.SnailMailBE.models;

//This model class will help us model Mail data.
//We'll make Mail objects based on this Class to help us send data to/from the front end
public class Mail {

    //Fields -
    private String sender;
    private String recipient;
    private String subject;
    private String body;

    //Boilerplate code --- Constructors, Getters/Setters, toString
    //Right click -> Generate -> Choose the boilerplate you want to generate

    //Every Spring Bean needs a no-args constructor
    public Mail() {
    }

    public Mail(String sender, String subject, String recipient, String body) {
        this.sender = sender;
        this.subject = subject;
        this.recipient = recipient;
        this.body = body;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}

package com.diumotics.qms.qms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Thilini Hansika on 3/13/2019.
 */
@Entity
@Table(name = "Queue")
public class Queue {

    @Id
    private String ticketno;
    private String language;
    private String counterno;
    private String task;
    private String date;
    private String status;


    public Queue() {
    }

    public Queue(String ticketno, String language, String counterno, String task, String date, String status) {
        this.ticketno = ticketno;
        this.language = language;
        this.counterno = counterno;
        this.task = task;
        this.date = date;
        this.status = status;
    }

    public String getTicketno() {
        return ticketno;
    }

    public void setTicketno(String ticketno) {
        this.ticketno = ticketno;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCounterno() {
        return counterno;
    }

    public void setCounterno(String counterno) {
        this.counterno = counterno;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "ticketno='" + ticketno + '\'' +
                ", language='" + language + '\'' +
                ", counterno='" + counterno + '\'' +
                ", task='" + task + '\'' +
                ", date='" + date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

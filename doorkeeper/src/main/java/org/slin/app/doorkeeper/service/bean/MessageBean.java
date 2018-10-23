package org.slin.app.doorkeeper.service.bean;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MessageBean {
    private String message;
    private LocalDate date;

}

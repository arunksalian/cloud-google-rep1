package org.slin.app.doorkeeper.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
public class News {
    @Id
    public ObjectId _id;

    private String message;
    private LocalDate date;
}

package com.example.telebot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "data")
@Entity
public class User {
    @Id
    private Long chatId;
    private String firstname;
    private String lastname;
    private String username;
    private String passportPhoto1;
    private String passportPhoto2;
    private String registration;
    private String cardPhoto;

    private String phoneNumber;
    private String fullTitle;
    private String percentage;
    private String operationCost;
    private String clinicName;
    private String success;

    @Override
    public String toString() {
        return "Client " +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", registration='" + registration + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", fullTitle='" + fullTitle + '\'' +
                ", percentage='" + percentage + '\'' +
                ", operationCost='" + operationCost + '\'' +
                ", clinicName='" + clinicName + '\'' +
                '}';
    }
}

package com.cbd.clicker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


    @Service
    public class EmailService{

        private JavaMailSender emailSender;

        public EmailService(JavaMailSender emailSender) {
            this.emailSender = emailSender;
        }

        public void sendSimpleMessage() {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("marcinwypior7@gmail.com");
            message.setTo("kwiatkowski11marek5@gmail.com");
            message.setSubject("test maila");
            message.setText("text wiadomości");
            emailSender.send(message);
        }
    }


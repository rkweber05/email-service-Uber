package com.tech.challengeuber.core;

public interface EmailSenderUseCase {

    void sendEmail(String to, String subject, String body);
}

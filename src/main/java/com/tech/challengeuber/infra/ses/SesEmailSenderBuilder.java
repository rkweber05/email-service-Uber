package com.tech.challengeuber.infra.ses;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;

public class SesEmailSenderBuilder {
    private AmazonSimpleEmailService amazonSimpleEmailService;

    public SesEmailSenderBuilder setAmazonSimpleEmailService(AmazonSimpleEmailService amazonSimpleEmailService) {
        this.amazonSimpleEmailService = amazonSimpleEmailService;
        return this;
    }

    public SesEmailSender createSesEmailSender() {
        return new SesEmailSender(amazonSimpleEmailService);
    }
}
package pl.kodolamacz.hack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import pl.kodolamacz.hack.model.Candidate;
import pl.kodolamacz.hack.model.Employer;

/**
 * Created by lary8 on 12.07.2017.
 */


    @Service
    public class MailService {

        @Autowired
        private MailSender mailSender;


        public void sendEmail(Candidate candidate, Employer employer) {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("aksjofqwl@o2.pl");
            message.setTo(candidate.getEmail());

            message.setSubject("Wiadomość od :"+employer.getEmployerName());
            message.setText("Wiadomość testowa");

            mailSender.send(message);
        }

    }


package pl.kodolamacz.hack.service;

import org.springframework.stereotype.Service;
import pl.kodolamacz.hack.model.Message;
import pl.kodolamacz.hack.service.repository.MessageRepository;

/**
 * Created by lary8 on 13.07.2017.
 */@Service
public class MessageService {

MessageRepository messageRepository;


public Message send(){return messageRepository.sendMessage();}

public Message recive(){return messageRepository.reciveMessage();}



}

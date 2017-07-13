package pl.kodolamacz.hack.service.repository;

import pl.kodolamacz.hack.model.Message;

/**
 * Created by lary8 on 13.07.2017.
 */
public interface MessageRepository {


    Message sendMessage();
    Message reciveMessage();



}

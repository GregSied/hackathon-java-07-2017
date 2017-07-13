package pl.kodolamacz.hack.service.repository;

import org.springframework.data.repository.CrudRepository;

import pl.kodolamacz.hack.model.Message;

/**
 * Created by lary8 on 13.07.2017.
 */
public interface MessageRepository extends CrudRepository<Message, Long> {


    Message sendMessage();
    Message reciveMessage();



}

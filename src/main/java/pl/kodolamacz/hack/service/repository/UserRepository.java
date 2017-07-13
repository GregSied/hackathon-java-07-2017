package pl.kodolamacz.hack.service.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kodolamacz.hack.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByLogin(String login);

}

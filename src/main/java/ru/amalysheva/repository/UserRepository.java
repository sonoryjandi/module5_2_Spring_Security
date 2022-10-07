package ru.amalysheva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.amalysheva.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

//    Мы можем вручную прописать запрос к базе с помощью аннотации @Query
//    @Query(value = "SELECT nextval(pg_get_serial_sequence('t_user', 'id'))", nativeQuery = true)
//    Long getNextId();
}

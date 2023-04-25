package bej.challenge.chapter4.repository;

import bej.challenge.chapter4.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {
    @Query(value = "SELECT u FROM Users u WHERE userId = :userId")
    Users getById(@Param("userId") String userId);

}
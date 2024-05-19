package com.demo_bank_v1.repository;

import com.demo_bank_v1.models.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

    @Modifying
    @Query(value = "INSERT INTO users (first_name, last_name, email, password_, token, code_) VALUES " +
            "(:first_name, :last_name, :email, :password, :token, :code)", nativeQuery = true)
    @Transactional
    void registerUser(@Param("first_name") String first_name,
                      @Param("last_name") String last_name,
                      @Param("email") String email,
                      @Param("password") String password,
                      @Param("token") String token,
                      @Param("code") String code);

    @Modifying
    @Query(value = "UPDATE users SET token=null, code_=null, verified=1, verified_at=NOW(),updated_at=NOW() WHERE " +
            "token = :token AND code_ = :code", nativeQuery = true)
    @Transactional
    void verifyAccount(@Param("token") String token,
                       @Param("code") String code);

    @Query(value = "SELECT token FROM users WHERE token = :token", nativeQuery = true)
    String checkToken(@Param("token")String token);
}

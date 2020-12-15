package com.duowenjia.springboottest2.respository;

import com.duowenjia.springboottest2.entity.E_User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRespository extends JpaRepository<E_User,String> {
    @Query(value = "select new E_User (name,password,sex,aihao,shouji,youxiang) from E_User ")
    List<E_User> getAllUsers();
}

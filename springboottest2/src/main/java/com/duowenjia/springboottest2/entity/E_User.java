package com.duowenjia.springboottest2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class E_User {
    @Id
    String name;
    String password;
    String sex;
    String aihao;
    String shouji;
    String youxiang;
}

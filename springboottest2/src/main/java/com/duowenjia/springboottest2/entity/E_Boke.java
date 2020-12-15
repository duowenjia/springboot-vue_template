package com.duowenjia.springboottest2.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class E_Boke {
    @Id
    private String biaoti;
    private String neirong;
    private String name;
}

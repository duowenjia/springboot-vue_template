package com.duowenjia.springboottest2.respository;

import com.duowenjia.springboottest2.entity.E_Boke;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EBokeRespositoryTest {
    @Autowired
    private BokeRespository bokeRespository;
    @Autowired
    private UserRespository userRespository;
    @Test
    void findAll(){
        System.out.println(userRespository.findAll(PageRequest.of(0,1)));
    }
}

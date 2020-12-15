package com.duowenjia.springboottest2.respository;

import com.duowenjia.springboottest2.entity.E_Boke;
import com.duowenjia.springboottest2.entity.E_User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BokeRespository extends JpaRepository<E_Boke,String> {
    @Query(value="select new E_Boke(biaoti,neirong,name) from E_Boke where name=?1")
    List<E_Boke> findBokeByName(String name);

}

package com.tuyano.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.MyData;

@Repository
public interface MyDataRepository extends JpaRepository<MyData, Long>{

}

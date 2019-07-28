package com.example.demo.bo;

import com.example.demo.dao.mybatis.ManDao;
import com.example.dto.Man;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

@Service
public class ManBo {
    @Autowired
    private ManDao manDao;

    @Transactional(readOnly = true)
    public  List<Man> query() {
        return manDao.findMan();
    }


}

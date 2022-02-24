package com.example.demo.service.serviceImpl;

import com.example.demo.dao.StuDao;
import com.example.demo.entity.Stu;
import com.example.demo.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("stuService001")
public class StuServiceImpl implements StuService {

    //Autowired三种参数注入方式：

    //变量注入，不推荐
//    @Autowired
    private StuDao stuDao;

    //构造器注入
//    @Autowired
//    public StuServiceImpl(StuDao stuDao){
//        this.stuDao = stuDao;
//    }

    //set方法注入
    @Autowired
    public void setStuDao(StuDao stuDao){
        this.stuDao = stuDao;
    }

    @Override
    public Stu queryStuInfo(Integer id) {
        return stuDao.queryStuById(id);
    }
}

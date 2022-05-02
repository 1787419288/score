package com.lc.demo.service.impl;

import com.lc.demo.bean.Teacher;
import com.lc.demo.mapper.TeacherMapper;
import com.lc.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TeacherServiceImpl
 * @Deacription TODO
 * @Author daier
 * @Date 2021/1/6 1:15
 * @Version 1.0
 **/

@Service
public class TeacherServiceImpl  implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher login(String teaName, String teaPass) {
        return teacherMapper.selectTeacherByNameAndPass(teaName,teaPass);
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherMapper.selectAllTeacher();
    }

    @Override
    public int addTeacher(Teacher teacher) {
        return teacherMapper.insertTeacher(teacher);
    }

    @Override
    public int addTeacherHavePass(Teacher teacher) {
        return teacherMapper.insertTeacherHavaPass(teacher);
    }

    @Override
    public String selectIdByName(String teaName) {
        return teacherMapper.selectIdByName(teaName);
    }

    @Override
    public Teacher selectById(String teaId) {
        return teacherMapper.selectTeacherByStuId(teaId);
    }

    @Override
    public int deleTea(String teaId) {
        return teacherMapper.deleteTeaById(teaId);
    }

}

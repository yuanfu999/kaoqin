package com.aboluo.attend.service.impl;

import com.aboluo.attend.dao.AdminDao;
import com.aboluo.attend.pojo.Emp;
import com.aboluo.attend.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public int selectEmpCount() {
        return adminDao.selectEmpCount();
    }

    @Override
    public int selectAdminCount() {
        return adminDao.selectAdminCount();
    }

    @Override
    public List<Emp> selectAdminByPage(Map<String, Integer> index_map) {
        return adminDao.selectAdminByPage(index_map);
    }

    @Override
    public List<Emp> get_AdminByPage(Map<String, Integer> index_map) {
        return adminDao.get_AdminByPage(index_map);
    }

    @Override
    public Emp selectAdminById(int emp_id) {
        return adminDao.selectAdminById(emp_id);
    }

    @Override
    public int updateAdmin(Emp emp) {
        return adminDao.updateAdmin(emp);
    }

    @Override
    public int insertAdmin(Emp emp) {
        return adminDao.insertAdmin(emp);
    }

    @Override
    public int deleteEmp(int emp_id) {
        return adminDao.deleteEmp(emp_id);
    }

    @Override
    public int updateOwnInfo(Emp emp) {
        return adminDao.updateOwnInfo(emp);
    }

    @Override
    public int changePas(Emp emp) {
        return adminDao.changePas(emp);
    }

    @Override
    public int selectAdCount() {
        return adminDao.selectAdCount();
    }

    @Override
    public List<Emp> searchAdByContent(String content){
        return adminDao.searchAdByContent(content);
    }

    @Override
    public int getAdSearchCount(String content) {
        return adminDao.getAdSearchCount(content);
    }

    @Override
    public List<Emp> searchAdminByCondition(String dept, String gender, Integer disable, String page_info) {
        return adminDao.searchAdminByCondition(dept, gender, disable,page_info);
    }

    @Override
    public int getAdminCountByCondition(String dept, String gender, Integer disable,String page_info) {
        return adminDao.getAdminCountByCondition(dept,gender,disable, page_info);
    }

    @Override
    public List<Emp> searchByAdCondition(String dept, String gender, Integer disable) {
        return adminDao.searchByAdCondition(dept,gender,disable);
    }

    @Override
    public int searchByAdCount(String dept, String gender, Integer disable) {
        return adminDao.searchByAdCount(dept,gender,disable);
    }

    @Override
    public int getPoSearchCount(String content) {
        return adminDao.getPoSearchCount(content);
    }

    @Override
    public List<Emp> searchPoByContent(String content) {
        return adminDao.searchPoByContent(content);
    }


}

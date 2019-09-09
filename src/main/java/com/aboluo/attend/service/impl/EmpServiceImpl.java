package com.aboluo.attend.service.impl;

import com.aboluo.attend.dao.EmpDao;
import com.aboluo.attend.pojo.Emp;
import com.aboluo.attend.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("empService")
@Transactional
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;

    @Override
    public int insertEmp(Emp emp) {
        return empDao.insertEmp(emp);
    }

    @Override
    public int deleteEmp(int emp_id) {
        return empDao.deleteEmp(emp_id);
    }

    @Override
    public int updateEmp(Emp emp) {
        return empDao.updateEmp(emp);
    }

    @Override
    public Emp selectEmpById(int emp_id) {
        return empDao.selectEmpById(emp_id);
    }

    @Override
    public List<Emp> selectAllEmp() {
        return empDao.selectAllEmp();
    }

    @Override
    public int selectEmpCount() {
        return empDao.selectEmpCount();
    }

    @Override
    public List<Emp> searchByCondition(String dept, String gender, Integer disable) {
        return empDao.searchByCondition(dept, gender, disable);
    }


    @Override
    public Emp checkEmp(Emp emp) {
        return empDao.checkEmp(emp);
    }

    @Override
    public int register(Emp emp) {
        return empDao.register(emp);
    }

    @Override
    public int getSearchEmpCount(String dept, String gender, Integer disable) {
        return empDao.searchEmpCount(dept, gender, disable);
    }

    @Override
    public List<Emp> selectEmpByPage(Map<String, Integer> index_map) {
        return empDao.selectEmpByPage(index_map);
    }

    @Override
    public List<Emp> searchByContent(String content) {
        return empDao.searchByContent(content);
    }

    @Override
    public int getSearchCount(String content) {
        return empDao.getSearchCount(content);
    }

    @Override
    public int findEmp_id(Emp emp) {
        return empDao.findEmp_id(emp);
    }

    @Override
    public int getByContentCount(String content) {
        return empDao.getByContentCount(content);
    }


}

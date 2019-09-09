package com.aboluo.attend.service;

import com.aboluo.attend.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AdminService {

    /*获取管理员信息总条数*/
    int selectEmpCount();
    int selectAdminCount();
    /*分页获取员工信息*/
    List<Emp> selectAdminByPage(Map<String, Integer> index_map);

    List<Emp> get_AdminByPage(Map<String, Integer> index_map);

    Emp selectAdminById(int emp_id);

    int updateAdmin(Emp emp);

    int insertAdmin(Emp emp);

    int deleteEmp(int emp_id);

    int updateOwnInfo(Emp emp);

    int changePas(Emp emp);

    int selectAdCount();

    List<Emp> searchAdByContent(String content);

    int getAdSearchCount(String content);

    List<Emp> searchAdminByCondition(String dept, String gender, Integer disable, String page_info);

    int getAdminCountByCondition(String dept, String gender, Integer disable,String page_info);

    List<Emp> searchByAdCondition(@Param("dept") String dept, @Param("gender") String gender, @Param("disable") Integer disable);

    int searchByAdCount(@Param("dept") String dept, @Param("gender") String gender, @Param("disable") Integer disable);
    /*权限信息的模糊查询计数*/
    int getPoSearchCount(@Param("content") String content);

    /*权限信息的模糊查询*/
    List<Emp> searchPoByContent(@Param("content") String content);

}

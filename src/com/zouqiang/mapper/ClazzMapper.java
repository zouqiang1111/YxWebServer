package com.zouqiang.mapper;

import com.zouqiang.entity.Clazz;

/**
 * 邹强
 * 2018-4-3 10:03
 */
public interface ClazzMapper {
    /*
     *@Description
     *@CreatedDate 2018-4-3 1:36
     *@Param 
     *@Return 
     */
    //根据id查询班级信息
    Clazz selectClazzById(Integer id);
}

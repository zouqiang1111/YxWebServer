package com.zouqiang.mapper;

import com.zouqiang.entity.Person;

/**
 * 邹强
 * 2018-4-3 10:03
 */
public interface PersonMapper {
    /*
     *@Description 根据id查Person
     *@CreatedDate 2018-4-3 10:04
     *@Param id
     *@Return Person
     */
    Person selectPersonById(Integer id);
}

package com.standrad.commons.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/****
 * 通配映射不能动
 * @author hexb
 *
 * @param <T>
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T>{

}

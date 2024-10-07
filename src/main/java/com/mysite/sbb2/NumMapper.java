package com.mysite.sbb2;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NumMapper {
	Num getNumById(Integer id);

}

package com.example.mapper;

import org.apache.ibatis.annotations.Param;

import com.example.domain.ProVO;

public interface ProMapper {
	
	public void insert(ProVO vo);
	
	public void insertImage(@Param("image") String image, @Param("pcode") String pcode);
	
}

package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.ProVO;
import com.example.mapper.ProMapper;

@Service
public class ProService {
	@Autowired 
	ProMapper mapper;
	
	@Transactional
	public void insert(ProVO vo){
		mapper.insert(vo);
		for(String image:vo.getImages()){
			mapper.insertImage(vo.getPcode(), image);
		}
	}
}

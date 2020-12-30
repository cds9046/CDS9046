package com.example.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.domain.ProVO;
import com.example.service.ProService;

@Controller
public class ProController {
	@Autowired
	ProService service;
	
	@Resource(name="uploadPath")
	String path;
	
	@RequestMapping(value="insert", method=RequestMethod.POST)
	public void insertPost(ProVO vo, MultipartHttpServletRequest multi)throws Exception{
		//��ǥ�̹��� ���ε�
		MultipartFile file=multi.getFile("file");
		if(!file.isEmpty()){
			String image=System.currentTimeMillis() + "_" + file.getOriginalFilename();
			file.transferTo(new File(path + "/" + image));
			vo.setImage(image);
		}
		//÷���̹����� ���ε�
		List<MultipartFile> files=multi.getFiles("files");
		ArrayList<String> images=new ArrayList<>();
		for(MultipartFile f:files){
			if(!f.isEmpty()){
				String image="A" + System.currentTimeMillis() + "_" + file.getOriginalFilename();
				f.transferTo(new File(path + "/" + image));
				images.add(image);
			}
		}
		vo.setImages(images);
		service.insert(vo);
	}
	
	@RequestMapping("insert")
	public void insert(){
		
	}
}

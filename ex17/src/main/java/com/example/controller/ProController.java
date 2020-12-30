package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.domain.ProVO;
import com.example.service.ProService;

@Controller
public class ProController {
	@Autowired
	ProService service;
	
	@Resource(name = "uploadPath")
	String path;
	
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	@ResponseBody
	//vo는 상품 정보, multi 는 업로드 파일 정보
	public void insert(ProVO vo, MultipartHttpServletRequest multi) throws IllegalStateException, IOException{
		//대표이미지 업로드
		MultipartFile file = multi.getFile("file");
		if(!file.isEmpty()){
			String image = System.currentTimeMillis() + "_" + file.getOriginalFilename();
			file.transferTo(new File(path + "/" + "image"));
			vo.setImage(image);
		}
		//첨부 이미지 업로드
		List<MultipartFile> files = multi.getFiles("files");
		ArrayList<String> images = new ArrayList<>();
		for(MultipartFile f:files){
			if(!f.isEmpty()){
				String image = "A" + System.currentTimeMillis() + "_" + file.getOriginalFilename();
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

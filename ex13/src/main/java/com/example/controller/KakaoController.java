package com.example.controller;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.KakaoAPI;

@Controller
public class KakaoController {
	
	@RequestMapping(value="local.json") //데이터생성 매핑
	@ResponseBody
	public String localJson(String query)throws Exception{
		String text=URLEncoder.encode(query, "UTF-8");
		String apiURL = "https://dapi.kakao.com/v2/local/search/address.json?query=" + text;
		String result = KakaoAPI.search(apiURL);
		
		return result;
	}
	
	@RequestMapping("local")  //출력ㅍㅔ이지
	public String local(){
		return "local";
	}
}

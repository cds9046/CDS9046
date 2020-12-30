package com.example.controller;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.annotation.Resource;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.CGVVO;
import com.example.mapper.CGVMapper;

@Controller
public class CrawlingController {
	@RequestMapping("weather.json")
	@ResponseBody
	public ArrayList<HashMap<String,Object>> weatherJson(){
		ArrayList<HashMap<String,Object>> array = new ArrayList<>();
		try{
			Document doc = Jsoup.connect("https://www.daum.net/").get();
			//지역별기온출력
			Elements elements = doc.select(".list_weather");
			for(Element e: elements.select("li")){
				HashMap<String, Object> map = new HashMap<>();
				map.put("part", e.select(".txt_part").text());
				map.put("temper", e.select(".screen_out").text());
				array.add(map);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return array;
	}
	@RequestMapping("cgv.json")
	@ResponseBody
	public ArrayList<HashMap<String,Object>> cgvJson(){
		ArrayList<HashMap<String,Object>> array = new ArrayList<>();
		try{
			Document doc = Jsoup.connect("http://www.cgv.co.kr/movies/").get();
			Elements elements = doc.select(".sect-movie-chart ol");
			for(Element e:elements.select("li")){  //li가 여러개이므로 포문
				HashMap<String, Object> map = new HashMap<>();
				if(!e.select(".rank").text().equals("")){
					map.put("rank", e.select(".rank").text());
					map.put("image", e.select("img").attr("src"));
					map.put("title", e.select(".title").text());
					array.add(map);
				}		
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return array;
	}
	@RequestMapping("cgv")
	public void cgv(){
		
	}
	
	@Autowired
	CGVMapper mapper;
	
	@Resource(name="uploadPath")
	String path;
	
	@RequestMapping("insert")
	@ResponseBody
	public void insert(CGVVO vo, String fullImage){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date cdate = new Date();
		vo.setCdate(sdf.format(cdate));
		//이미지 다운로드
		try{
			URL url = new URL(fullImage);
			InputStream in = url.openStream();
			OutputStream out = new FileOutputStream(path + "/" +vo.getImage());
			FileCopyUtils.copy(in, out);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//System.out.println(vo.toString());
		mapper.insert(vo);
	}
}

package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CrawlingController {
	@RequestMapping("cgv.json")
	@ResponseBody
	public ArrayList<HashMap<String, Object>> cgv(){
		ArrayList<HashMap<String, Object>> array = new ArrayList<HashMap<String, Object>>();
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.cgv.co.kr/movies/");
		System.out.println("------------------------1111\n" + driver.getPageSource());
		
		//더보기 버튼 클릭
		WebElement btnMore = driver.findElement(By.className("btn-more-fontbold"));
		btnMore.click();
		System.out.println("--------------2222\n"+ driver.getPageSource());
		List<WebElement> listMore = driver .findElement(By.id("movie_more_container")).findElements(By.tagName("li"));
		System.out.println("데이터 갯수" + listMore.size());
		
		for(WebElement e:listMore){
			HashMap<String, Object> map = new HashMap<>();
			map.put("title", e.findElement(By.className("title")).getText());
			map.put("image", e.findElement(By.tagName("img")).getAttribute("src"));
			
			array.add(map);
		}
		
		return array;
	}
}

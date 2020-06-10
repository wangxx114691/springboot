package com.gupao.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.regex.Pattern;

@RestController
public class K8SController {

    @RequestMapping("/k8s")
    public String k8s(){
		return "hello K8s Jack";
    }

	public static void main(String[] args) throws ParseException {
		Pattern pattern = Pattern.compile("((((19|20)\\d{2})(0?(1|[3-9])|1[012])(0?[1-9]|[12]\\d|30))|(((19|20)\\d{2})(0?[13578]|1[02])31)|(((19|20)\\d{2})0?2(0?[1-9]|1\\d|2[0-8]))|((((19|20)([13579][26]|[2468][048]|0[48]))|(2000))0?229))$");
		if (!pattern.matcher("2019123").find()) {
			System.out.println("日期格式错误");
		}
	}
}

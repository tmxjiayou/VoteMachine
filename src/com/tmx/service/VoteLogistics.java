package com.tmx.service;

import java.util.ArrayList;

import com.tmx.bean.Person;

public class VoteLogistics {

	public static void displayInfo(ArrayList<Person> list) {
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getNumber()+":"+list.get(i).getName()+",票数："+list.get(i).getVoteNum());
		}
	}
	
	public static boolean isLegal(String string){
		String regex = "^[0-9]*$";
//		Pattern p = Pattern.compile(string);
//		Matcher m = p.matcher("[0-9]");
		if(string.matches(regex)) {
			int num = Integer.parseInt(string);
			if(num>=0&&num<=4)
				return true;
			else {
				System.out.println("此票无效，请输入正确的候选人代号！");
				return false;
			}
		}
		else {
			System.out.println("此票无效，请输入正确的候选人代号！");
			return false;
		}
			
		
	}
}

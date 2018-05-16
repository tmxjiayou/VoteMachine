package com.tmx.test;
import com.tmx.service.VoteLogistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.tmx.bean.Person;
public class VoteRun {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("张三",1,0));
		list.add(new Person("李四", 2, 0));
		list.add(new Person("王五", 3, 0));
		list.add(new Person("刘六", 4, 0));
		
		VoteLogistics.displayInfo(list);
		
		int num1 = 0,num2 = 0,num3 = 0,num4 = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("请输入班长候选人代号（数字0结束）：");
			String input = sc.next();
			if(VoteLogistics.isLegal(input)) {
				if(input.equals("0"))
					break;
				else {
					if(input.equals("1"))
						num1++;
					if(input.equals("2"))
						num2++;
					if(input.equals("3"))
						num3++;
					if(input.equals("4"))
						num4++;
				}
			}
		}
		
		list.get(0).setVoteNum(num1);
		list.get(1).setVoteNum(num2);
		list.get(2).setVoteNum(num3);
		list.get(3).setVoteNum(num4);
		
		VoteLogistics.displayInfo(list);
		
		Map<Integer, Person> map = new HashMap<>();
		for(int i=0;i<4;i++) {
			map.put(i, list.get(i));
		}
		Person winner = map.get(0);
		for (int j=1;j<4;j++) {
			if(map.get(j).getVoteNum()>=winner.getVoteNum())
				winner = map.get(j);
		}
		System.out.println("最终当选者：");
		System.out.println(winner.getNumber()+":"+winner.getName()+",票数"+winner.getVoteNum());
		sc.close();
	}
}

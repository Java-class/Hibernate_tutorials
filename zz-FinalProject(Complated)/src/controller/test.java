package controller;

import service.FoodService;
import service.FoodServiceImpl;
import service.GenderService;
import service.GenderServiceImpl;
import service.MemberService;
import service.MemberServiceImpl;
import service.MemberTypeService;
import service.MemberTypeServiceImpl;

import java.util.List;

import entity.*;

public class test {

	public static void main(String[] args) throws Exception {

		
		
	/*	MemberTypeService mts = new MemberTypeServiceImpl();
		MemberType mt = new MemberType();
		mt = mts.getMemberType(1);*/
		
		//mt.setTypeName("Lecturer");
		//mts.Add(mt);
		
		GenderService gs = new GenderServiceImpl();
		
		Gender g = new Gender();
		///g = gs.getGender(1);
		g.setGendertitle("مشترک");
		gs.Add(g);
		
	/*	Member m = new Member();
		m.setName("Mostafa");
		m.setFamily("Anbarmoo");
		m.setTaghziyeno("923500");
		m.setMemberno("91353130");
		m.setDetails("member details here");
		m.setStartdate("start_date");
		m.setEnddate("end_date");
		m.setGender(g);
		m.setMemtype(mt);
		
		MemberService ms = new MemberServiceImpl();
		ms.Add(m);
		
		*/
		/*Food f = new Food();
		f.setFoodname("gheymeh");
		
		FoodService fs = new FoodServiceImpl();
		
		fs.Add(f);
		
		List<Food> foods =fs.getAll();
		for(Food ff: foods)
			System.out.println(ff.toString());*/
		
		
		
		
	}
}

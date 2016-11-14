package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.FoodDao;
import dao.FoodDaoImpl;
import entity.Food;
import entity.Gender;
import entity.Member;
import entity.MemberType;
import service.FoodService;
import service.FoodServiceImpl;
import service.GenderService;
import service.GenderServiceImpl;
import service.MemberService;
import service.MemberServiceImpl;
import service.MemberTypeService;
import service.MemberTypeServiceImpl;

public class projectTest {

	public static void main(String[] args) 
	{
		
		Food food = new  Food();
		food.setFoodName("morgh");
		food.setBasePrice("2000");
		
		
		FoodService fs = new FoodServiceImpl();
		fs.Add(food);
		
		//int id=1;	
	//	food = fs.getFood(id); // make persistence
		//fs.Remove(food); // remove from DB
		
		/*Gender g = new Gender();
		g.setGendertitle("mard");
		
		GenderService gs = new GenderServiceImpl();
		gs.Add(g);
		
		
		
		MemberType mt = new MemberType();
		mt.setTypeName("Lecturer");
		
		MemberTypeService mts = new MemberTypeServiceImpl();
		mts.Add(mt);
		
		
		
		Member m = new Member();
		m.setName("Mahdi");
		m.setFamily("Mahdavi");
		m.setGender(g);
		m.setMemtype(mt);
		
		MemberService ms = new MemberServiceImpl();
		ms.Add(m);
		*/
		
		
	}

}

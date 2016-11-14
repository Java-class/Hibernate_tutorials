package MixStrategy;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import MixStrategy.MemberDao;
import model.Member;

public class Testing {
@SuppressWarnings("resource")
public static void main(String[] args) {
	
	
	ApplicationContext context = 
            new AnnotationConfigApplicationContext(HibernateConfiguration.class);
	
    //MemberDao dao=new MemberDao();
	
	MemberDao dao=context.getBean(MemberDao.class);
	Member e=new Member();
	e.setName("Ali");
	e.setFamily("Ahmadi");
	
	dao.saveMember(e);
	
	//dao.deleteMember(1);	
}
}

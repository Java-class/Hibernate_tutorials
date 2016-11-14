package ThirdStrategy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    @SuppressWarnings("resource")
	public static void main(String[] args)
    {
        ApplicationContext applicationContext = 
            new AnnotationConfigApplicationContext(JPAconfig.class);
        
        MemberService memberservice = applicationContext.getBean(MemberService.class);
        
       // Member member = new Member();
        Member member=applicationContext.getBean(Member.class);
        member.setName("thirdname");
        member.setFamily("thirdfamily");
    	memberservice.save(member);
   
    }
}

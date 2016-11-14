package SecondStrategy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				JPAconfig.class);
		
		MemberDaoJpaImpl dao = applicationContext.getBean(MemberDaoJpaImpl.class);

		Member member = new Member();
		member.setName("secondname");
		member.setFamily("secondfamily");

		dao.save(member);
	}

}
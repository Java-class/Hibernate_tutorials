package ThirdStrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Component
@Service
@Transactional
public class MemberServiceImpl implements MemberService {
    //@Autowired
	private MemberDao memberDao;
    
   @Autowired 
	public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
    
    @Override
    public void save(Member member) {
        memberDao.save(member);
    }

}

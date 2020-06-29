package co.kr.jo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.kr.jo.mapper.EmployeeMapper;
import co.kr.jo.vo.EmployeeVO;
import lombok.Setter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MapperTest {
	
	@Setter(onMethod_= {@Autowired})
	EmployeeMapper mapper;
	
	@Test
	public void joTest() {
		mapper.joList().forEach(i->System.out.println(i));
	}
	
	//@Test
	public void insertTest() {
		//mapper.save(new EmployeeVO(5,"이재오다",40,"그린컴퓨터"));
		EmployeeVO a = new EmployeeVO();
		a.setId(80);
		a.setDesignation("그린 컴퓨터다");
		a.setName("이재오 바보");
		a.setSalary(500);
		mapper.save(a);
	}
	
	@Test
	public void modifyTest() {
		//테이블에 있는 id를 사용해야 합니다. 없는 id는 의미없습니다. 
		mapper.update(new EmployeeVO(2,"홍길동님",5000,"그린컴퓨터입니다."));
	}

}

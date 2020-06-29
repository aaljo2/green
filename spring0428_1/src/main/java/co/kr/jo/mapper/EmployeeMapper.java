package co.kr.jo.mapper;

import java.util.List;

import co.kr.jo.vo.EmployeeVO;

public interface EmployeeMapper {
	
	public List<EmployeeVO> joList();
	public void save(EmployeeVO emp);
	public void update(EmployeeVO emp);

}

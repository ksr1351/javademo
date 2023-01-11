package java024_jdbc;

import java.util.List;

public class DepartmentsController {

	public DepartmentsController() {

	}
	
	public List<DepartmentsDTO> departmentAllExecute(){
		DepartmentsDAO dao = DepartmentsDAO.getInstance();
		return dao.listDepartments();
	}//end departmentAllExecute()
	
	public List<DepartmentsDTO> departmentSearchExecute(String data){
		DepartmentsDAO dao = DepartmentsDAO.getInstance();
		return dao.searchDepartments(data);
	}
}

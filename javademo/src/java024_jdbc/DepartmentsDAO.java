package java024_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//DAO : Data Access Object(데이터 접근 객체)
public class DepartmentsDAO {
	private Connection conn; // db접근하기 위해 private
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private DepartmentsDAO() { // singletone패턴에 접근

	}

	private static DepartmentsDAO dao = new DepartmentsDAO();

	public static DepartmentsDAO getInstance() { // getInstance() => (외부에서 객체 얻는)메소드
		return dao; // 비static인 자원에서는 static을 사용할 수 없다.
	}

	private Connection init() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver"); // 예외처리 필요
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);

	}

	private void exit() throws SQLException { // db작업 끝났으면 종료시켜주기
		if (rs != null)
			rs.close();

		if (stmt != null)
			stmt.close();

		if (pstmt != null)
			pstmt.close();

		if (conn != null)
			conn.close();
	}

	public List<DepartmentsDTO> listDepartments() {
		List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();
		try {
			conn = init();

			stmt = conn.createStatement();

			String sql = "SELECT * FROM departments ORDER BY department_id";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				DepartmentsDTO dto = new DepartmentsDTO(); // 각 행에 있는 값 들어감(String sql의 값)
				// ↑ While 문 밖에 넣어주면 마지막 값만 가져오게됨
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto);
			} // 각 컬럼의 값을 dto에 넣기 , aList에 다 넣어주기

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				exit(); // 데이터베이스로 들어가던 정보 종료
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return aList;
	}// end listDepartments()

	public List<DepartmentsDTO> searchDepartments(String data) {
		List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();

		try {
			conn = init();

			//stmt = conn.createStatement();

			//String sql = "SELECT * FROM departments WHERE upper(department_name) LIKE upper('%" + data + "%') ORDER BY department_id";
			
			//rs= stmt.executeQuery(sql);
			
			
			String sql = "SELECT * FROM departments WHERE upper(department_name) LIKE upper(?) ORDER BY department_id"; //쿼리문에서 변수를 참조하는 부분은 ?(물음표)를 넣어준다
			pstmt = conn.prepareStatement(sql); //변수를 참조해야할 경우가 생길 때 prepareStatment사용
			//LIKE upper => placeholder(1)
			pstmt.setString(1,"%" + data + "%"); //왼쪽에서 오른쪽으로 물음표가 있는 순서대로 
			rs = pstmt.executeQuery();
			
			
			while (rs.next()) {
				DepartmentsDTO dto = new DepartmentsDTO();
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return aList;

	} // end searchDepartments()

}// end class

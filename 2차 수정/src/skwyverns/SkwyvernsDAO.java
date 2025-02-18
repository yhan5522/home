package skwyverns;

import java.sql.*;
import java.util.ArrayList;
import skwyverns.SkwyvernsDTO;

public class SkwyvernsDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;

	/* MySQL 연결정보 */
	String jdbc_driver = "com.mysql.jdbc.Driver";
	
	String jdbc_url = "jdbc:mysql://127.0.0.1/jspdb?useSSL=true&verifyServerCertificate=false&serverTimezone=UTC";

	
	/******************************************************************************************/
	// DB연결 메서드
	/******************************************************************************************/
	void connect() {
		try {
			Class.forName(jdbc_driver);

			conn = DriverManager.getConnection(jdbc_url,"jspbook","1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	/******************************************************************************************/
	// DB 연결해제 메소드
	/******************************************************************************************/
	void disconnect() {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/******************************************************************************************/
	//입력 메서드
	/******************************************************************************************/
	public boolean insertDB(SkwyvernsDTO skwyvernsDTO) {
		
		
		connect();
		
		// id 는 자동 등록 되므로 입력하지 않는다.				
		String sql ="insert into skwyverns(title,name, memo) values(?,?,?)";
		
		try {
			
			pstmt = conn.prepareStatement(sql);

			// SQL문에 변수 입력
			pstmt.setString(1,skwyvernsDTO.getTitle());
			pstmt.setString(2,skwyvernsDTO.getName());
			pstmt.setString(3,skwyvernsDTO.getMemo());
			
			//SQL문 실행
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			disconnect();
		}
		return true;
	}
	
	
	/******************************************************************************************/
	//조회 메서드
	/******************************************************************************************/
	public ArrayList<SkwyvernsDTO> getDBList() {
		
		connect();
		
		ArrayList<SkwyvernsDTO> skwyvernsList = new ArrayList<SkwyvernsDTO>();
		
		String sql = "select id, title, name, memo from skwyverns";

		try {
			
			pstmt = conn.prepareStatement(sql);
			
			//SQL문 실행
			ResultSet rs = pstmt.executeQuery();

			while(rs.next()) {
				
				// DO 객체 생성
				SkwyvernsDTO skwyvernsDTO = new SkwyvernsDTO();
				
				// DB Select결과를 DO 객체에 저장
				skwyvernsDTO.setId(rs.getInt("id"));
				skwyvernsDTO.setTitle(rs.getString("title"));
				skwyvernsDTO.setName(rs.getString("name"));
				skwyvernsDTO.setMemo(rs.getString("memo"));
				
				skwyvernsList.add(skwyvernsDTO);
			}
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			disconnect();
		}
		return skwyvernsList;
	}

	/******************************************************************************************/
	// 조회 메서드
	/******************************************************************************************/
	public SkwyvernsDTO getDB(int id) {
		
		connect();
		
		SkwyvernsDTO skwyvernsDTO = new SkwyvernsDTO();
		
		String sql = "select * from skwyverns where id = ?";
		
		try {
			
			pstmt = conn.prepareStatement(sql);
			
			// SQL문에 조회조건 입력
			pstmt.setInt(1,id);

			//SQL문 실행
			ResultSet rs = pstmt.executeQuery();

			// 데이터가 하나만 있으므로 rs.next()를 한번만 실행 한다.
			rs.next();
			
			// DB Select결과를 DO 객체에 저장
			skwyvernsDTO.setId(rs.getInt("id"));
			skwyvernsDTO.setTitle(rs.getString("title"));
			skwyvernsDTO.setName(rs.getString("name"));
			skwyvernsDTO.setMemo(rs.getString("memo"));
			
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			disconnect();
		}
		return skwyvernsDTO;
	}


	/******************************************************************************************/
	// 수정 메서드
	/******************************************************************************************/
	public boolean updateDB(int id, SkwyvernsDTO skwyvernsDTO) {
		
		
		connect();
		
		// id로 매칭하여 update(내용부분과제목부분만수정가능)				
		String sql ="update skwyverns set title=? ,name=? ,memo=? where id=?";
		try {
			
			pstmt = conn.prepareStatement(sql);

			// SQL문에 변수 입력
			pstmt.setString(1,skwyvernsDTO.getTitle());
			pstmt.setString(2,skwyvernsDTO.getName());
			pstmt.setString(3,skwyvernsDTO.getMemo());
			pstmt.setInt(4,id);
		
			//SQL문 실행
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			disconnect();
		}
		return true;
	}
	
	
	/******************************************************************************************/
	// 삭제 메서드
	/******************************************************************************************/
	public boolean deleteDB(int id) {
		
		
		connect();
		
		// id로 매칭하여 delete				
		String sql ="delete from skwyverns where id=?";
		
		try {
			
			pstmt = conn.prepareStatement(sql);

			// SQL문에 변수 입력
			pstmt.setInt(1,id);
						
			//SQL문 실행
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
		}
		return true;
	}
	
	
}

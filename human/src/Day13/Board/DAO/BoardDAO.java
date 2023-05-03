package Day13.Board.DAO;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import Day13.JDBConnection;
import Day13.Board.DTO.Board;

public class BoardDAO extends JDBConnection  {
	
	// 데이터 목록 조회
	public List<Board> selectList() {
		
		LinkedList<Board> boardList = new LinkedList<>();
		
		// SQL
		String sql = " SELECT * "
				   + " FROM board ";
		
		try {
			
			stmt = con.createStatement();		// 쿼리 실행 객체 생성
			rs = stmt.executeQuery(sql);		// 쿼리 실행
			
			// 조회 결과를 리스트에 추가
			while( rs.next() ) {
				Board board = new Board();
				// 결과 데이터 가져오기
				// rs.getXXX( "컬럼명" ) --> 해당 컬럼의 데이터를 가져온다
				board.setBoardNo( rs.getInt("board_no") );
				board.setTitle( rs.getString("title") );
				board.setWriter( rs.getString("writer") );
				board.setContent( rs.getString("content") );
				board.setRegDate( rs.getTimestamp("reg_date") );
				board.setUpdDate( rs.getTimestamp("upd_date") );
				
				boardList.add(board);
			}
			
		} catch (SQLException e) {
			System.err.println("게시글 목록 조회 시, 예외 발생");
			e.printStackTrace();
		}
		
		return boardList;
	}

}












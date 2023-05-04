package Day13.Board.DTO;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor		// 기본생성자
public class Board {

	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private Date updDate;
	
	public Board( String title, String writer, String content ) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	
}

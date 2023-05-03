package Day13.Board.DTO;

import java.util.Date;

import lombok.Data;

@Data
public class Board {

	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private Date updDate;
	
}

package lombok;

import java.util.Date;

// @ : 어노테이션
// @Data
// - @RequiredArgsConstructor, @Getter, @Setter, 
//   @EqualsAndHashCode, @ToString

// @NoArgsConstructor			// 기본 생성자
// @AllArgsConstructor			// 모든 매개변수 생성자
// @RequiredArgsConstructor		// 필수 생성자
// @Getter							// getter
// @Setter							// setter
// @ToString						// toString
// @EqualsAndHashCode
@Data
public class Board {
	
	// @NonNull private final byte t;
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private Date updDate;
	
	
	
	
}

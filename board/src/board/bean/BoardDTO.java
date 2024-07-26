package board.bean;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor
//@RequiredArgsConstructor  @NonNull
//@Getter
//@Setter
@Data
public class BoardDTO {
	private int seq;
	private String id;
	private String name;
	private String subject;
	private String content;
	private String logtime; // String으로 잡고 쓸때 바꾸는게 나은가?
	

}

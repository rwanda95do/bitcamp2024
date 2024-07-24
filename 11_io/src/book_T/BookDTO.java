package book_T;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor   // 기본 생성자 만들기
@RequiredArgsConstructor  // 요청한 인자 생성자 만들기
@Getter  // getter
@Setter  // setter
public class BookDTO implements Serializable, Comparable<BookDTO>{
	@NonNull
	private String code;
	@NonNull
	private String title;
	@NonNull
	private String author;
	@NonNull
	private int price;
	@NonNull
	private int qty;
	private int total;
	

	
	@Override
	public String toString() {
		return code + "\t " + title + "\t " + author + "\t " + price + "\t "
				+ qty + "\t " + total;
	}
	
	
	// 책 제목으로 오름차순 정렬 
	@Override
	public int compareTo(BookDTO o) {
		
		return this.title.compareTo(o.title);
	}
}
// Lombok
	// 생성자, setter/getter, toString(), hashCode(), equals()등을 자동 생성 

package board.service;


import java.util.Scanner;
import board.bean.BoardDTO;
import board.dao.BoardDAO;

public class BoardWriteService implements Board{

	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		BoardDAO boardDAO = BoardDAO.getInstance();
		BoardDTO boardDTO = new BoardDTO();
		
		int seq = boardDTO.getSeq()+1;
		String id = null;
		String name = null;
		String subject = null;
		String content = null;		
		
		System.out.print("아이디 입력 : ");
		id = scan.next();
		System.out.print("이 름 입력 : ");
		name = scan.next();
		System.out.print("제 목 입력 : ");
		subject = scan.next();
		System.out.print("내 용 입력 : ");
		content = scan.next();
		
		boardDTO.setId(id);
		boardDTO.setName(name);
		boardDTO.setSubject(subject);
		boardDTO.setContent(content);

		
		
		//DB
		
		boardDAO.write(boardDTO);
		System.out.println("작성하신 글이 등록되었습니다.");
	}

}

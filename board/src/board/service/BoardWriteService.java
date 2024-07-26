package board.service;

import java.util.Date;
import java.util.Scanner;

import board.bean.BoardDTO;
import board.dao.BoardDAO;

public class BoardWriteService implements Board{

	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		BoardDAO boardDAO = BoardDAO.getInstance();
		BoardDTO boardDTO = null;
		
		String id = null;
		String name = null;
		String subject = null;
		String content = null;
		Date date = null;
		
		System.out.print("아이디 입력 : ");
		id = scan.next();
		System.out.print("이 름 입력 : ");
		name = scan.next();
		System.out.print("제 목 입력 : ");
		subject = scan.next();
		System.out.print("내 용 입력 : ");
		content = scan.next();
		
		boardDTO = new BoardDTO();
		boardDTO.setId(id);
		boardDTO.setName(name);
		boardDTO.setSubject(subject);
		boardDTO.setContent(content);
		boardDTO.setDate(date);
		
		//DB
		
		boardDAO.write();
		
	}

}

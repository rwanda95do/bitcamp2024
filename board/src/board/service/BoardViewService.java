package board.service;

import java.util.Scanner;

import board.bean.BoardDTO;
import board.dao.BoardDAO;

public class BoardViewService implements Board{

	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		
		BoardDAO boardDAO = BoardDAO.getInstance();
		
		System.out.print("글 번호 입력 : ");
		int seq = scan.nextInt();
		
		BoardDTO boardDTO = boardDAO.view(seq);

		System.out.print("글번호 : " + boardDTO.getSeq() + "\t");
		System.out.print("아이디 : " + boardDTO.getId() + "\t");
		System.out.println("이름 : " + boardDTO.getName() + "\t");
		System.out.println("날짜 : " + boardDTO.getLogtime() + "\t");
		System.out.println("내용 : " + boardDTO.getContent() + "\t");
	
		
	}

}

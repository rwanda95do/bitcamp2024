package board.service;

import board.dao.BoardDAO;

public class BoardListService implements Board{

	@Override
	public void execute() {
		BoardDAO boardDAO = BoardDAO.getInstance();
		
		System.out.println("----------------------------------------------");
		System.out.println("글번호 \t 제목 \t 아이디 \t 날짜");
		boardDAO.list();
		System.out.println("----------------------------------------------");
		
	}

}

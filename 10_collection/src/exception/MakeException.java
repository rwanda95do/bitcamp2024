package exception;

public class MakeException extends Exception {  // 사용자가 만든 예외처리 클래스

	private String errorMsg;
	
	public MakeException() {}  // 에러메세지가 없을 때
	public MakeException(String errorMsg) { // 에러메세지가 있을때
		super();
		this.errorMsg = errorMsg;
	}
	
	@Override
	public String toString() {  // 에러메세지 보여주기 
		return errorMsg;
	}
}

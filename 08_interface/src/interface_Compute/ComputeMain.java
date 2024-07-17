package interface_Compute;

public class ComputeMain extends ComputeService{
	public static void main(String[] args) {
		
		//menu() 소환!!!!!!!!!!! @_@
		ComputeService computeService = new ComputeService();
		computeService.menu();
		System.out.println("프로그램을 종료합니다.");
	}
}

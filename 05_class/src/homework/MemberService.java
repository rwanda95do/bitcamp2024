package homework;

import java.util.Scanner;

// 모든 일을 하는 클래스
public class MemberService {
	private MemberDTO[] ar = new MemberDTO[5];
	private Scanner scan = new Scanner(System.in);
	
	
	public void menu(){
		System.out.println("************");
		System.out.println("1.가입");
		System.out.println("2.출력");
		System.out.println("3.수정");
		System.out.println("4.탈퇴");
		System.out.println("5.끝내기");
		System.out.println("************");
		
		boolean exit = true;
		do {
			int num=0;
			System.out.print("번호: ");
			num = scan.nextInt();
			
			switch(num) {
			case 1: insert(); break;
			case 2: list(); break;
			case 3: update(); break;
			case 4: delete(); break;
			case 5: exit=false; break;
			default:  //지정된 숫자말고 다른 값이 들어왔을 때 
			}
						
		}while(exit);
	} // menu()
	
	public void insert(){
		int check=0;
		for(int i=0; i<ar.length;i++) {
			if(ar[i] == null) { // 가입하기
				ar[i] = new MemberDTO();
				System.out.println("이름 입력 : ");
				ar[i].setName(scan.next());
				System.out.println("나이 입력 : ");
				ar[i].setAge(scan.nextInt());
				System.out.println("핸드폰 입력 : ");
				ar[i].setPhoneNumber(scan.next());
				System.out.println("주소 입력 : ");
				ar[i].setAdress(scan.next());			
				
				System.out.println("회원 가입이 되었습니다.");		
				break;
			}else {
				check+=1;
				if(check==5) {
					System.out.println("5명의 정원이 꽉 찼습니다.");
				}
			}			
		} // for
	} // insert()
	
	public void list(){
		System.out.println("이름\t 나이\t 핸드폰\t 주소\t");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]!=null) {
				System.out.print(ar[i].getName() + "\t");
				System.out.print(ar[i].getAge() + "\t");
				System.out.print(ar[i].getPhoneNumber() + "\t");
				System.out.print(ar[i].getAdress() + "\t");
				System.out.println();
			}
		}
	} //list()
	
	public void update(){
		System.out.print("핸드폰 번호 입력 : ");
		String checkPhoneNumber=scan.next();
		
		for(int i=0; i<ar.length;i++) {
			if(ar[i].getPhoneNumber().equals(checkPhoneNumber)) {
				// 회원번호를 수정
				System.out.println("수정할 이름 입력 : ");
				ar[i].setName(scan.next());
				System.out.println("수정할 나이 입력 : ");
				ar[i].setAge(scan.nextInt());
				System.out.println("수정할 핸드폰 입력 : ");
				ar[i].setPhoneNumber(scan.next());
				System.out.println("수정할 주소 입력 : ");
				ar[i].setAdress(scan.next());	
				break;
			}else {
				System.out.println("찾는 회원이 없습니다.");
				break;
			}
		}
	} // update()
	
	public void delete(){
		System.out.print("핸드폰 번호 입력 : ");
		String checkPhoneNumber=scan.next();
		try {
			for(int i=0; i<ar.length;i++) {
				if(ar[i].getPhoneNumber().equals(checkPhoneNumber)) {
					ar[i]=null;
					break;
				}else {
					System.out.println("찾는 회원이 없습니다.");
					break;
				}			
			} // FOR			
		} catch (NullPointerException e) {System.out.println("회원이 존재하지 않습니다.");}
	}

	
	
} //MemberService CLASS 

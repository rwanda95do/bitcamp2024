package lambda;


public class LambdaMain01 {

	public void execute(Compute compute){ // Compute 인터페이스를 매개변수로 
		int x = 25;
		int y = 36;
		
		compute.calc(x, y); // 추상메서드 호출
		
	}
	
	public static void main(String[] args) {

		// execute함수가 static이 아니기 때문에 
		LambdaMain01 lambdaMain01 = new LambdaMain01();
		// 람다식 사용
			// 장점 : 같은 인터페이스지만 데이터 처리부가 바뀔수 있기 때문에 좋다?
		lambdaMain01.execute((x,y) -> {
			int result = x+y;
			System.out.println(x +"+" +y +"="+result);
		});
		
		lambdaMain01.execute((x,y)->{
			int result = x*y;
			System.out.println(x +"*" +y +"="+result);
		});
		
		
		
		/*// 람다식을 사용하지 않았을때
		lambdaMain01.execute(new Compute() {
			
			@Override
			public void calc(int x, int y) {
			
				
			}
		});  // 인터페이스는 그냥 new로 생성할 수 없기때문에
		//익명 이너 클래스를 이용해서 메소드 오버라이딩
		 */
	}

}

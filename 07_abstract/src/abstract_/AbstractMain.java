package abstract_;

public class AbstractMain extends AbstractTest{
	public static void main(String[] args) {
		
		AbstractTest at = new AbstractTest() {
			
			@Override
			void setName(String name) {
				super.name = "쿠브";
				
			}
		};
		
		
	}

	@Override
	void setName(String name) {
		// TODO Auto-generated method stub
		
	}
}

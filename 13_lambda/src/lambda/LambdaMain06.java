package lambda;


@FunctionalInterface
interface Comp{
	public int compare(String name, String irum); 
}


class Person06{
	public void order(Comp comp) {
		String name ="홍길동";
		String irum = "코난";
		
		int result = comp.compare(name, irum);
		
		if(result<0) {System.out.println(name+ ", " + irum);}
		else if(result>0) {System.out.println(irum+ ", " + name);}
		else {System.out.println(name+ ", " + irum +"같은 이름");}
	}
}



public class LambdaMain06 {

	public static void main(String[] args) {

		Person06 person06 = new Person06();
		
		person06.order((name, irum)->name.compareTo(irum));
		person06.order(String::compareTo);
	}

}

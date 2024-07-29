package lambda;

@FunctionalInterface  // 함수가 하나만 있어요
public interface Compute {

	public void calc(int x, int y);
}

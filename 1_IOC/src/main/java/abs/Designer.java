package abs;

public class Designer extends Emp{

	@Override
	public Emp getEmp() {
		return super.getEmp();
	}

	@Override
	public void work() {
		System.out.println("디자이너가 디자인을 합니다.");
	}
	
}

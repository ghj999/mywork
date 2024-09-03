package ex2_abstract;

public class Protoss extends Unit{

	// 생성자 단축키?
	public Protoss( String name, int energy, boolean fly ) {
		suepr.name = name;
		super.energy = energy;
		super.fly = fly;
		
	}
	
	@Override
	public void decEnergy() {
		super.energy = -1;
		
	}

}

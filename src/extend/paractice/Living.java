package extend.paractice;


public abstract class Living {
	//protected static final String Living = null;
	protected String name;
	protected int hp;
	protected int offensive;
	protected String skill;
	//public Living() {	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getOffensive() {
		return offensive;
	}
	
	public void setOffensive(int offensive) {
		this.offensive = offensive;
	}

	public String getSkill() {
		return skill;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public abstract void attack(Living target);{
	}
	
	
}

	


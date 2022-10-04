package extend.paractice;



public abstract class HumanO extends Living {

	protected String skill;

	public HumanO(String skill) {
		//this.name = name;
		//this.hp = hp;
		//this.offensive = offensive;
		this.skill = skill;
		
		
	}
	

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	
	public void attack(Living target) {
		System.out.println("人間のターン！");
		System.out.println(name + "が" + skill + "で攻撃!" + target + "に" + Rand.get(10) * this.offensive + "のダメージ！");
	}
	

}

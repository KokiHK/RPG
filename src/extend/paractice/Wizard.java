package extend.paractice;

public class Wizard extends Human {
	public String skill;

	public Wizard() {
		this.name = "魔法使い";
		this.hp = 180;
		this.offensive = 6;
		this.skill = "魔法";
	}

	@Override
	public void attack(Living target) {
		int hit = offensive * Rand.get(10);
		int h = target.getHp() - hit;
		target.setHp(h);
		System.out.println(this.name + "が" + this.skill + "で攻撃!" + target.name + "に" + offensive * Rand.get(10) + "のダメージ！");

	}

}

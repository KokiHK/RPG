package extend.paractice;

public class Slime extends Monster {
	public String skill;

	public Slime() {
		this.name = "スライム";
		this.hp = 40;
		this.offensive = 4;
		this.skill = "体当たり";
	}

	@Override
	public void attack(Living target) {
		int hit = offensive * Rand.get(10);
		int h = target.getHp() - hit;
		target.setHp(h);
		System.out.println(this.name + "が" + this.skill + "で攻撃!" + target.name + "に" + offensive * Rand.get(10) + "のダメージ！");

	}

}

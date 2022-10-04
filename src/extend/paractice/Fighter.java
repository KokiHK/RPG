package extend.paractice;

public class Fighter extends Human {
	public String skill;

	public Fighter() {

		this.name = "戦士";
		this.hp = 200;
		this.offensive = 8;
		this.skill = "ハンマー";
	}

	@Override
	public void attack(Living target) {
		int hit = offensive * Rand.get(10);
		int h = target.getHp() - hit;
		target.setHp(h);
		System.out.println(this.name + "が" + this.skill + "で攻撃!" + target.name + "に" + offensive * Rand.get(10) + "のダメージ！");

	}

}

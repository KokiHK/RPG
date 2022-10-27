package extend.paractice;

public class Brave extends Human {
	public String skill;

	public Brave() {
		this.name = "勇者";
		this.hp = 300;
		this.offensive = 4;
		this.skill = "剣";
	}

	@Override
	public void attack(Living target) {
		int hit = offensive * Rand.get(10);
		int h = target.getHp() - hit;
		target.setHp(h);
		System.out.println(this.name + "が" + this.skill + "で攻撃!" + target.name + "に" + offensive * Rand.get(10) + "のダメージ！");

	}
}

package extend.paractice;

public class Doragon extends Monster {
	public String skill;

	public Doragon() {
		this.name = "ドラゴン";
		this.hp = 220;
		this.offensive = 15;
		this.skill = "炎";
	}

	@Override
	public void attack(Living target) {
		int hit = offensive * Rand.get(10);
		int h = target.getHp() - hit;
		target.setHp(h);
		System.out.println(this.name + "が" + this.skill + "で攻撃!" + target.name + "に" + offensive * Rand.get(10) + "のダメージ！");

	}

}

package extend.paractice;

public class Oak extends Monster {
	public String skill;

	public Oak() {
		this.name = "オーク";
		this.hp = 20;
		this.offensive = 2;
		this.skill = "槍";
	}

	@Override
	public void attack(Living target) {
		int hit = offensive * Rand.get();
		int h = target.getHp() - hit;
		target.setHp(h);
		System.out.println(this.name + "が" + this.skill + "で攻撃!" + target + "に" + offensive * Rand.get() + "のダメージ！");

	}

}

package extend.paractice;

public class Fighter extends Human {public String skill;

	public Fighter() {
		
		this.name = "戦士";
		this.hp = 44;
		this.offensive = 8;
		this.skill = "ハンマー";
	}
		

	@Override
	public void attack(Living target) {
		int hit = (int)Math.round(offensive*Rand.get());
		int h = getHp() -hit;
		setHp(h);
		System.out.println( this.name + "が"+ this.skill +"で攻撃!" + target + "に"+ offensive*Rand.get() +"のダメージ！");
		
		
	}

}

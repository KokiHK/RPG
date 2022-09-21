package extend.paractice;

public class Wizard extends Human{

	public Wizard() {
		this.name = "魔法使い";
		this.hp = 58;
		this.offensive =6;
		this.skill = "魔法";
	}
		
		@Override
		public void attack(Living target) {
		System.out.println( this.name + "が"+ this.skill +"で攻撃!" + target + "に"+ Rand.get() +"のダメージ！");
	}
	
	
		
	}

	// TODO 自動生成されたコンストラクター・スタブ
	
		



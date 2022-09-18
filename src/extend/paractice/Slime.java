package extend.paractice;

public  class  Slime extends Monster{
	
	public Slime() {
		this.name = "スライム";
		this.hp = 20;
		this.offensive =2;
		this.skill = "体当たり";
		}
		
		
			@Override
			public void attack(Living target) {
			System.out.println( "モンスターのターン"+this.name + "が"+ this.skill +"で攻撃!" + target + "に"+ Rand.get(offensive) +"のダメージ！");
		}

}

package extend.paractice;

public  class Fighter extends Human{
	
	
	
	public Fighter() {
		this.name = "戦士";
		this.hp = 44;
		this.offensive =8;
		this.skill = "ハンマー";
	}
		
		@Override
		public void attack(Living target) {
			System.out.println( "人間のターン"+this.name + "が"+ this.skill +"で攻撃!" + target + "に"+ Rand.get(offensive) +"のダメージ！");
		}
		
}



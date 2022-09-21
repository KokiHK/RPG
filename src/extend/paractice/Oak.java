package extend.paractice;

public  class  Oak extends Monster{

	public Oak() {
		this.name = "オーク";
		this.hp = 20;
		this.offensive =2;
		this.skill ="槍";
	}
		
		@Override
		public void attack(Living target) {
		System.out.println(this.name + "が"+ this.skill +"で攻撃!" + target + "に"+ Rand.get() +"のダメージ！");
	}

}

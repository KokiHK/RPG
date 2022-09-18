package extend.paractice;

public  class Brave extends Human{

	public Brave() {
		this.name = "勇者";
		this.hp = 52;
		this.offensive =4;
		this.skill = "剣";
		}
		
		public void attack(Living target) {
			System.out.println( "人間のターン"+this.name + "が"+ this.skill +"で攻撃!" + target + "に"+ Rand.get(offensive) +"のダメージ！"); 
		}
}



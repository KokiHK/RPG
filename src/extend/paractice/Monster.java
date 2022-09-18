package extend.paractice;

public abstract class Monster extends Living{
	
	public Monster() {
		System.out.println("モンスターのターン！");
	}
	@Override
	public void attack(extend.paractice.Living target) {
		System.out.println( name + "が"+ skill +"で攻撃!" + target +"に"+Rand.get(offensive) +"のダメージ！");
		
		
		
	}

	
		
	}
	
	



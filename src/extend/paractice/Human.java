package extend.paractice;


public  abstract class Human extends Living {
	
		public  Human() {
			
			System.out.println("人間のターン！");
		}
	
	@Override
	public void attack(extend.paractice.Living target) {
		System.out.println( name + "が"+ skill +"で攻撃!" + target + "に"+ Rand.get(offensive) +"のダメージ！");
		
		
		
		
	}

	
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
		




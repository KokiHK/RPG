package extend.paractice;

public class  Doragon extends Monster{public String skill;
	public Doragon() {
		this.name = "ドラゴン";
		this.hp = 30;
		this.offensive =4;
		this.skill = "炎";
		}
		
	@Override
	public void attack(Living target) {
	System.out.println(this.name + "が"+ this.skill +"で攻撃!" + target + "に"+ Rand.get() +"のダメージ！");
}

}


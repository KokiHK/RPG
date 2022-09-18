package extend.paractice;

//import java.util.List;
//import java.util.Random;


public class RPGMain {

	public static void main(String[] args) {
		
		Fighter Fighter = new Fighter();
		Brave Brave = new Brave();
		Human Wizard = new Wizard();
		Monster Slime = new Slime();
		Monster Oak = new Oak();
		Monster Dragon = new Doragon();
		
		Brave.attack(Slime);
		Wizard.attack(Oak);
		Fighter.attack(Dragon);
		
		
		
		
		
		
		
		
		
		//List<String> Humanlist = new Arraylist<>();
		//Humanlist.add("勇者");
		//Humanlist.add("魔法使い");
		//Humanlist.add("戦士");
		
		//List<String> Monserlist = new Arraylist<>();
		//Monserlist.add("スライム");
		//Monserlist.add("オーク");
		//Monserlist.add("ドラゴン");
		
		//int index = new Random().nextInt(list.size());
		
		
		
		
		// TODO 自動生成されたメソッド・スタブ

	}

}

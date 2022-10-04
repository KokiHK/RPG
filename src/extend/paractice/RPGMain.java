package extend.paractice;

import java.util.ArrayList;
import java.util.List;

public class RPGMain {

	public static void main(String[] args) {
		//キャラクタークラスをオブジェクト化する
		//Human human = new Human();
		//Monster monster = new Monster();
		Human Brave = new Brave();
		Human Wizard = new Wizard();
		Human Fighter = new Fighter();
		Monster Oak = new Oak();
		Monster Doragon = new Doragon();
		Monster Slime = new Slime();

		//各グループをリスト化
		List<Human> Hlist = new ArrayList<>();
		Hlist.add(Brave);
		Hlist.add(Wizard);
		Hlist.add(Fighter);

		List<Monster> Mlist = new ArrayList<>();
		Mlist.add(Oak);
		Mlist.add(Slime);
		Mlist.add(Doragon);

		System.out.println("モンスターの群れが現れた");

		while (!Hlist.isEmpty() && !Mlist.isEmpty()) {

			Human human = Hlist.get(Rand.get(Hlist.size()));
			Monster monster = Mlist.get(Rand.get(Mlist.size()));
			
			//whileで空でないことが既知なためここでは選択時にif文を挿入しない

			if (!Hlist.isEmpty()) {
				System.out.println("人間のターン！");
				human.attack(monster);

				if (Mlist.contains(Oak) && Oak.hp <= 0) {
					Mlist.remove(Oak);
					System.out.println("オークは倒れた");
				}
				if (Mlist.contains(Slime) && Slime.hp <= 0) {
					Mlist.remove(Slime);
					System.out.println("スライムは倒れた");
				}

				if (Mlist.contains(Doragon) && Doragon.hp <= 0) {
					Mlist.remove(Doragon);
					System.out.println("ドラゴンは倒れた");
				}
			}

			human = Hlist.get(Rand.get(Hlist.size()));
			if (!Mlist.isEmpty()) {
				monster = Mlist.get(Rand.get(Mlist.size()));

				//モンスターがいない場合でも取得してしまうエラーを回避する
				//攻撃した側は必ずHPが減らない仕様のため今回は受け手側のみif文挿入した。
				
				System.out.println("モンスターのターン！");
				monster.attack(human);

				if (Hlist.contains(Brave) && Brave.hp <= 0) {
					Hlist.remove(Brave);
					System.out.println("勇者は倒れた");
				}

				if (Hlist.contains(Wizard) && Wizard.hp <= 0) {
					Hlist.remove(Wizard);
					System.out.println("魔法使いは倒れた");
				}

				if (Hlist.contains(Fighter) && Fighter.hp <= 0) {
					Hlist.remove(Fighter);
					System.out.println("戦士は倒れた");
				}
			}

		}

		if (Hlist.isEmpty()) {
			System.out.println("モンスターの勝利です");
		} else {
			System.out.println("勇者達の勝利です");
		}
	}
}

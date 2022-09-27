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

		//各リストから任意取得する
		Human human = Hlist.get(Rand.get(Hlist.size()));
		Monster monster = Mlist.get(Rand.get(Mlist.size()));
		//戦闘開始　人間かモンスターどちらかがリストからすべて消えたら終わり
		do {
			if (Brave.hp > 0) {
				System.out.println("人間のターン！");
				Brave.attack(monster);
			} else if (Brave.hp <= 0) {
				Hlist.remove(Brave);
				System.out.println("勇者は倒れた");

			}
			if (Oak.hp > 0) {
				System.out.println("モンスターのターン！");
				Oak.attack(human);
			} else if (Oak.hp <= 0) {
				Mlist.remove(Oak);
				System.out.println("オークは倒れた");
			}
			if (Wizard.hp > 0) {
				System.out.println("人間のターン！");
				Wizard.attack(monster);
			} else if (Wizard.hp <= 0) {
				Hlist.remove(Wizard);
				System.out.println("魔法使いは倒れた");

			}
			if (Doragon.hp > 0) {
				System.out.println("モンスターのターン！");
				Doragon.attack(human);
			} else if (Doragon.hp <= 0) {
				Mlist.remove(Doragon);
				System.out.println("ドラゴンは倒れた");

			}
			if (Fighter.hp > 0) {
				System.out.println("人間のターン！");
				Fighter.attack(monster);
			} else if (Fighter.hp <= 0) {
				Hlist.remove(Fighter);
				System.out.println("戦士は倒れた");

			}
			if (Slime.hp > 0) {
				System.out.println("モンスターのターン！");
				Slime.attack(human);
			} else if (Slime.hp <= 0) {
				Mlist.remove(Slime);
				System.out.println("スライムは倒れた");

			}
		} while ((Brave.hp == 0 && Wizard.hp == 0 && Fighter.hp == 0)
				|| (Oak.hp == 0 && Doragon.hp == 0 && Slime.hp == 0));

		if (Brave.hp > 0 || Wizard.hp > 0 || Fighter.hp > 0) {
			System.out.println("人間の勝利です");
		} else if (Oak.hp > 0 || Doragon.hp > 0 || Slime.hp > 0) {
			System.out.println("モンスターの勝利です");
		}
	}
}
//勇者が剣で攻撃！オークに80のダメージを与えた。

//モンスターのターン！
//スライムが体当たりで攻撃！勇者に32のダメージを与えた。
//人間のターン！
//魔法使いが魔法で攻撃！ドラゴンに60のダメージを与えた。
//モンスターのターン！
//ドラゴンが炎で攻撃！魔法使いに90のダメージを与えた。
//人間のターン！
//勇者が剣で攻撃！オークに0のダメージを与えた。
//モンスターのターン！
//オークが槍で攻撃！勇者に0のダメージを与えた。
//人間のターン！
//戦士が斧で攻撃！スライムに80のダメージを与えた。
//モンスターのターン！
//スライムが体当たりで攻撃！勇者に72のダメージを与えた。
//人間のターン！
//魔法使いが魔法で攻撃！オークに120のダメージを与えた。
//オークは倒れた。
//モンスターのターン！
//スライムが体当たりで攻撃！勇者に72のダメージを与えた。
//人間のターン！
//勇者が剣で攻撃！スライムに20のダメージを与えた。
//スライムは倒れた。
//モンスターのターン！
//ドラゴンが炎で攻撃！勇者に120のダメージを与えた。
//勇者は倒れた。
//人間のターン！
//戦士が斧で攻撃！ドラゴンに80のダメージを与えた。
//モンスターのターン！
//ドラゴンが炎で攻撃！魔法使いに0のダメージを与えた。
//人間のターン！
//戦士が斧で攻撃！ドラゴンに140のダメージを与えた。
//モンスターのターン！
//ドラゴンが炎で攻撃！魔法使いに75のダメージを与えた。
//魔法使いは倒れた。
//人間のターン！
//戦士が斧で攻撃！ドラゴンに0のダメージを与えた。
//モンスターのターン！
//ドラゴンが炎で攻撃！戦士に90のダメージを与えた。
//人間のターン！
//戦士が斧で攻撃！ドラゴンに100のダメージを与えた。
//ドラゴンは倒れた。
//勇者達は勝利した！

package extend.paractice;

import java.util.ArrayList;
import java.util.List;

public class RPGMain {

	public static void main(String[] args) {
		//キャラクターのパラメータをオブジェクト化する
		Brave h1 = new Brave();
		Wizard h2 = new Wizard();
		Fighter h3 = new Fighter();
		Oak m1 = new Oak();
		Doragon m2 = new Doragon();
		Slime m3 = new Slime();

		List<String> Hlist = new ArrayList<>();
		Hlist.add("勇者");
		Hlist.add("戦士");
		Hlist.add("魔法使い");

		List<String> Mlist = new ArrayList<>();
		Mlist.add("オーク");
		Mlist.add("スライム");
		Mlist.add("ドラゴン");

		System.out.println("人間のターン！");

		Living target = Mlist.get(0);
		h1.attack(target);
		target.setHp(target.getHp() - Rand.get() * h1.offensive);

		System.out.println("モンスターのターン!");

		m1.attack(target);
		target.setHp(target.getHp() - Rand.get() * m1.offensive);
		//抽象メソッドをHumanクラスから具体化しそれぞれのクラスでメソッドとして機能させる

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
	}
}

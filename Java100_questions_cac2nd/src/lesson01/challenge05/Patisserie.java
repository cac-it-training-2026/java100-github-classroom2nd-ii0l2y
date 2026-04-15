/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("\n本日のおすすめ商品です。\n");

		int cake1 = 30;
		int cake2 = 30;
		int cake3 = 30;

		System.out.println("シトロン    　\\250・・・残り" + cake1 + "個");
		System.out.println("ショコラ　    \\280・・・残り" + cake2 + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + cake3 + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		System.out.println("シトロン　>");
		String citronBuyCountStr = reader.readLine();
		int citronBuyCount = Integer.parseInt(citronBuyCountStr);

		System.out.println("ショコラ　>");
		String chocolateBuyCountStr = reader.readLine();
		int chocolateBuyCount = Integer.parseInt(chocolateBuyCountStr);

		System.out.println("ピスターシュ　>");
		String pistaBuyCountStr = reader.readLine();
		int pistaBuyCount = Integer.parseInt(pistaBuyCountStr);

		System.out.println("\nシトロン　" + citronBuyCount + "個");
		System.out.println("ショコラ　" + chocolateBuyCount + "個");
		System.out.println("ショコラ　" + pistaBuyCount + "個");

		int toalBuyCount = citronBuyCount + chocolateBuyCount + pistaBuyCount;
		int totalprice = 250 * citronBuyCount + 280 * chocolateBuyCount + 320 * pistaBuyCount;

		System.out.println("\n合計個数　" + toalBuyCount + "個");
		System.out.println("合計金額　" + totalprice + "円");
		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");
	}

}

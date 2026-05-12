/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		double citronBuyCount = Double.parseDouble(citronBuyCountStr);

		System.out.println("ショコラ　>");
		String chocolateBuyCountStr = reader.readLine();
		double chocolateBuyCount = Double.parseDouble(chocolateBuyCountStr);

		System.out.println("ピスターシュ　>");
		String pistaBuyCountStr = reader.readLine();
		double pistaBuyCount = Double.parseDouble(pistaBuyCountStr);

		System.out.println("\nシトロン　" + citronBuyCount + "個");
		System.out.println("ショコラ　" + chocolateBuyCount + "個");
		System.out.println("ショコラ　" + pistaBuyCount + "個");

		double toalBuyCount = citronBuyCount + chocolateBuyCount + pistaBuyCount;
		int totalprice = (int) (250 * citronBuyCount + 280 * chocolateBuyCount + 320 * pistaBuyCount);

		System.out.println("\n合計個数　" + toalBuyCount + "個");
		System.out.println("合計金額　" + totalprice + "円");
		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		cake1 = (int) (cake1 - citronBuyCount);
		cake2 = (int) (cake2 - chocolateBuyCount);
		cake3 = (int) (cake3 - pistaBuyCount);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン　    \\250・・・残り" + cake1 + "個");
		System.out.println("ショコラ    　\\280・・・残り" + cake2 + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + cake3 + "個");

	}

}

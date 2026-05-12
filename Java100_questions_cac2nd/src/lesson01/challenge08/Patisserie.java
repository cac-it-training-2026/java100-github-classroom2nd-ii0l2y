/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。\n");

		System.out.println("売り上げの割合");
		System.out.println("売上合計　\\" + totalprice);

		System.out.println("\n内訳\n");
		System.out.println("シトロン    　\\" + (int) (250 * citronBuyCount) + "・・・"
				+ (int) ((250 * citronBuyCount) / totalprice * 100) + "%");
		System.out.println("ショコラ    　\\" + (int) (280 * chocolateBuyCount) + "・・・"
				+ (int) ((280 * chocolateBuyCount) / totalprice * 100) + "%");
		System.out.println("ピスターシュ　\\" + (int) (320 * pistaBuyCount) + "・・・"
				+ (int) ((320 * pistaBuyCount) / totalprice * 100) + "%");
	}

}

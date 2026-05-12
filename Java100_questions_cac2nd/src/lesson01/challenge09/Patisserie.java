/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		double totalBuyCount = citronBuyCount + chocolateBuyCount + pistaBuyCount;
		int totalprice = (int) (250 * citronBuyCount + 280 * chocolateBuyCount + 320 * pistaBuyCount);

		System.out.println("\n合計個数　" + totalBuyCount + "個");
		System.out.println("合計金額　" + totalprice + "円");
		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		cake1 = (int) (cake1 - citronBuyCount);
		cake2 = (int) (cake2 - chocolateBuyCount);
		cake3 = (int) (cake3 - pistaBuyCount);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン    　\\250・・・残り" + cake1 + "個");
		System.out.println("ショコラ　    \\280・・・残り" + cake2 + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + cake3 + "個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。\n");

		System.out.println("売り上げの割合");
		System.out.println("売上合計　\\" + totalprice);

		System.out.println("\n内訳\n");
		System.out.println("シトロン    　\\" + (int) (250 * citronBuyCount) + "・・・"
				+ (int) ((250 * citronBuyCount) / totalprice * 100) + "%");
		System.out.println("ショコラ　    \\" + (int) (280 * chocolateBuyCount) + "・・・"
				+ (int) ((280 * chocolateBuyCount) / totalprice * 100) + "%");
		System.out.println("ピスターシュ　\\" + (int) (320 * pistaBuyCount) + "・・・"
				+ (int) ((320 * pistaBuyCount) / totalprice * 100) + "%");

		int citronPercentage = (int) ((250 * citronBuyCount) / totalprice * 100);
		int chocolatPercentage = (int) ((280 * chocolateBuyCount) / totalprice * 100);
		int pistachePercentage = (int) ((320 * pistaBuyCount) / totalprice * 100);

		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");
		System.out.println("シトロンの味　    ・・・" + citronPercentage + "%");
		System.out.println("ショコラの味　    ・・・" + chocolatPercentage + "%");
		System.out.println("ピスターシュの味　・・・" + pistachePercentage + "%");

		System.out.println("\nが楽しめます！\n");
		System.out.println("\n値段は\\" + ((totalprice / (int) totalBuyCount) / 10 * 10) + "です。");
	}

}

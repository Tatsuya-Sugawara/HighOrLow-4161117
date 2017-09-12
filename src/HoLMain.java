import java.util.Random;
import java.util.Scanner;

public class HoLMain{
	final static int eight = 8;
	public static void main(String[] args){
		boolean end = false;
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int x;
		while(end == false){
			int card = rnd.nextInt(12) + 1;
			System.out.println("初期値は8です");
			System.out.print("High=1 Low=2：");
			x = sc.nextInt();
			if(x == 1){
				if(card >= eight){
					System.out.println("数値は"+card);
					System.out.println("正解");
				}
				else{
					System.out.println("数値は"+card);
					System.out.println("不正解");
				}
			}
			else if(x == 2){
				if(card < eight){
					System.out.println("数値は"+card);
					System.out.println("正解");
				}
				else{
					System.out.println("数値は"+card);
					System.out.println("不正解");
				}
			}
			else{
				System.out.println("1か2を入力してください");
			}
			System.out.print("続ける=1 終わる=1以外の数字");
			int check = sc.nextInt();
			if(check != 1){
				end = true;
			}
		}
		System.exit(0);
	}
}

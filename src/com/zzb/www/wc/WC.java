package com.zzb.www.wc;
import java.io.IOException;
import java.util.Scanner;

public class WC
{

	public static void main(String[] args) throws IOException
	{
		while (true)
		{
			System.out.println("指令说明：");
			System.out.println("**************************************");
			System.out.println("wc.exe -c 返回文件 test.c 的字符数：");
			System.out.println("wc.exe -w 返回文件 test.c 的词的数目 ");
			System.out.println("wc.exe -l 返回文件 test.c 的行数");
			System.out.println("wc.exe -a 返回文件 test.c 的空行，代码行，注释行");
			System.out.println("**************************************");
			System.out.println("输入指令：");

			Scanner input = new Scanner(System.in); // 从键盘上输入指令并执行
			String commend = input.nextLine();
			switch (commend)
			{
			case "-c":
				CharCount ch = new CharCount();
				break;
			case "-w":
				WordCount wc = new WordCount();
				break;
			case "-l":
				LineCount line = new LineCount();
				break;
			case "-a":
				Complex cp = new Complex();
				break;
			default:
				System.out.println("指令错误，请重新输入：");
				break;
			}

		}
	}
}
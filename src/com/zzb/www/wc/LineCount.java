package com.zzb.www.wc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//-l指令实现
public class LineCount
{
	LineCount() throws IOException
	{
		System.out.println("输入路径：");
		Scanner input = new Scanner(System.in);
		String path = input.nextLine();
		BufferedReader fis = new BufferedReader(new FileReader(path));
		int lineCount = 0;
		while (fis.readLine() != null)// 当前行不为空时，行数+1
		{ 
			lineCount++;
		}
		System.out.println("行数：" + lineCount);
		fis.close();

	}
}
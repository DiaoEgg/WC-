package com.zzb.www.wc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//-c指令实现
public class CharCount
{
	String REGEX1 = "\\S";//匹配任何非空白字符。
	String REGEX2 = "\\s";//匹配任何空白字符，包括空格、制表符、换页符等。

	CharCount() throws IOException
	{
		System.out.println("输入路径：");
		Scanner input = new Scanner(System.in);
		String path = input.nextLine();
		BufferedReader fis = new BufferedReader(new FileReader(path));//将数据读至缓冲区。
		int charCount = 0, charCount1 = 0, charCount2 = 0;
		String w;
		Pattern p1 = Pattern.compile(REGEX1);// 匹配合适的字符
		Pattern p2 = Pattern.compile(REGEX2);// 匹配合适的字符
		while ((w = fis.readLine()) != null)
		{
			Matcher m1 = p1.matcher(w);
			Matcher m2 = p2.matcher(w);
			while (m1.find()) // 找到对应字符时字符数+1
				charCount1++;
			while (m2.find()) // 找到对应字符时字符数+1
				charCount2++;
		}
		charCount = charCount1 + charCount2;
		System.out.println("字符数：" + charCount);
		fis.close();
	}

}

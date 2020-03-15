package com.zzb.www.wc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//-a指令实现
public class Complex
{

	Complex() throws IOException
	{
		System.out.println("输入路径：");
		Scanner a = new Scanner(System.in);
		String path = a.nextLine();
		BufferedReader fis = new BufferedReader(new FileReader(path));
		int spaceCount = 0;
		int noteCount = 0;
		int codeCount = 0;
		boolean state = false;
		String c;
		while ((c = fis.readLine()) != null)
		{
			if (c.contains("/*"))
			{ // 多行注释开始标记
				noteCount++;
				state = true;
			} else if (state)
			{
				noteCount++;
				if (c.contains("*/"))
				{ // 多行注释结束标记
					state = false;
				}
			} else if (c.contains("//"))
			{ // 单行注释标记
				noteCount++;
			} else if (c.trim().length() > 1)//trim方法会去掉字符串首尾的空格
			{ // 判定为代码行条件
				codeCount++;
			} else
			{
				spaceCount++;
			}
		}

		fis.close();
		System.out.println("空白行：" + spaceCount);
		System.out.println("注释行：" + noteCount);
		System.out.println("代码行：" + codeCount);
	}
}
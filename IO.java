package com.xk.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte [] buf=new byte[10];
		for(int i=0;i<buf.length;i++) {
			buf[i]=(byte) i;
		}
		int i=1564651;
		try {
			//输出一个文本
			DataOutputStream out= new DataOutputStream(
				new BufferedOutputStream(                //创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
					new FileOutputStream("a.dat")));     // 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
			out.writeInt(i);     //将指定字节写入此文件输出流。
			out.close();         //关闭
			//读取一个文本
			DataInputStream in=new DataInputStream(
					new BufferedInputStream(            //创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
							new FileInputStream("a.dat")));   //读取本地目录下的的文本
			int j= in.readInt();        //从此字节输入流中给定偏移量处开始将各字节读取到指定的 byte 数组中。
			System.out.println(j);      
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

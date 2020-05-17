package chapter01;


import java.io.*;
public class DisplayCharacterBlock {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		byte[] b = new byte[(127-31)*2];	// 바이트 기억공간을 할당한다
		
		int index = 0;
		
		for (int i = 32; i < 127; i++) {
			// 배열에 32부터 126까지 바이트 데이터 및 '\t' 데이터를 저장한다
			
			b[index++] = (byte)i;	// 정수를 바이트(0에서 255) 값으로 캐스트한다
			
			if(i%8 == 7)
				b[index++] = (byte)'\n';	// 8개의 데이터 다음에는 new line을 삽입한다
			else
				b[index++] = (byte)'\t';
		}
		
		b[index++] = (byte)'\n';
		
		System.out.write(b);
		
	}

}

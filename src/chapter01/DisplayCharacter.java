package chapter01;
import java.io.*;
public class DisplayCharacter {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
			
		for (int i = 32; i < 127; i++) {
			
			System.out.write(i);	//32~127 정수값을 화면에 출력
			
			if (i%8 == 7) 
				System.out.write('\n');
			else
				System.out.write('\t');
		}
		System.out.write('\n');
	}

}

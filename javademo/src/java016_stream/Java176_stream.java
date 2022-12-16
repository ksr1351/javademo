package java016_stream; //DAY15 [2022.12.05.MON]

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 직렬화(Serializable)
 * 1. 객체를 연속적인 데이터로 변화하는 것이다.
 * 	  반대로 역직렬화이다.
 * 2. 객체의 멤버변수들의 값을 일렬로 나열하는 것이다.
 * 3. 객체를 저장하기 위해서는 객체를 직렬화 해야 한다.
 * 4. 객체를 저장한다는 것은 객체의 멤버변수의 값을 저장한다는 것이다.
 * 5. 객체를 직렬화하여 입출력 할 수 있는 스트림
 * 	  ObjectInputStream, ObjectOutputStream
 * 6. 직렬화에서 제외할 멤버변수는 transient를 선언한다.
 */

public class Java176_stream {

	public static void main(String[] args) throws IOException {
		
		File file = new File("src/java016_stream/phone.dat"); //객체를 저장할 확장자 dat
		FileOutputStream fo = null;
		FileInputStream fi = null;
		
		//객체로 저장하기 위한 스티림
		ObjectOutputStream os = null;
		ObjectInputStream oi = null;
		
		try {
			fo = new FileOutputStream(file);
			os = new ObjectOutputStream(fo);
			
			//java.io.NotSerializableException : 객체에 직렬확 안되어 있으면 Exception이 발생한다.
			// : java에서 객체를 생성해서 저장하기 위해서는 직렬화가 필요하다. (implements Serializable)
			Phone p = new Phone("android", 5000); //객체생성
			os.writeObject(p);
			
			String s = new String("java");
			os.writeObject(s);
			
			System.out.println("객체저장");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			os.close();
			fo.close();
		}
		
///////////////////////////////////////////////////////////////////////////////////////////////
		
		fi = new FileInputStream(file);
		oi = new ObjectInputStream(fi);
		//객체를 저장한 순서대로 읽어와야 한다.
		try {
			Phone p = (Phone) oi.readObject(); //저장될때는 업캐스팅 되기 때문에 가져올때 다운캐스팅을 해준다.
			System.out.println(p);
			
			String s = (String) oi.readObject();
			System.out.println(s);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			oi.close();
			fi.close();
		}
		
	}//end main()

}//end class

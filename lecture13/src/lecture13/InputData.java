package lecture13;

import java.util.ArrayList;
import java.util.Scanner;

public class InputData {
	public ArrayList<Schema> makeArr(){
		ArrayList<Schema> arrSchema = new ArrayList<Schema>();
		int numberOfMember = -1;
		String id = null;
		String password = null;
		String name = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원구분(admin-1 : member-0)");
		numberOfMember = sc.nextInt();
		System.out.println("id : ");
		id = sc.next();
		System.out.println("password : ");
		password = sc.next();
		System.out.println("name : ");
		name = sc.next();
		
		arrSchema.add(new Schema(numberOfMember, id, password, name));
		
		return arrSchema;
		
	}
}

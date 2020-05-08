import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FileIn {
	ArrayList<String[]> list = new ArrayList<String[]>();
	ArrayList<String> username = new ArrayList<String>();

	String[] userarr1 = new String[3];
	String[] user1 = new String[3];

	String name;
	String num;
	String mail;

	void input() {
		try {

			BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream("d:person.txt")));
			String user = input.readLine();
			Userinfo info = new Userinfo();
			userarr1 = user.split(",");
			
			info.setName(userarr1[0]);
			info.setNum(userarr1[1]);
			info.setMail(userarr1[2]);
			
			if (!username.contains(info.getName())) {
				user1[0] = info.getName();
				user1[1] = info.getNum();
				user1[2] = info.getMail();
				list.add(user1);
			}
			
			
			for (int j = 0; j < 5; j++) {
				if (username.get(j).equals(list.get(j).equals(username))) {
					
				}
			}
		
			
			
//			user = input.readLine();
//			Userinfo info1 = new Userinfo(name, num, mail);
//			userarr1 = user.split(",");
//			info1.setName(userarr1[0]);
//			info1.setNum(userarr1[1]);
//			info1.setMail(userarr1[2]);
//
//			user = input.readLine();
//			Userinfo info2 = new Userinfo(name, num, mail);
//			userarr1 = user.split(",");
//			info2.setName(userarr1[0]);
//			info2.setNum(userarr1[1]);
//			info2.setMail(userarr1[2]);
//
//			user = input.readLine();
//			Userinfo info3 = new Userinfo(name, num, mail);
//			userarr1 = user.split(",");
//			info3.setName(userarr1[0]);
//			info3.setNum(userarr1[1]);
//			info3.setMail(userarr1[2]);
//			
//			user = input.readLine();
//			Userinfo info4 = new Userinfo(name, num, mail);
//			userarr1 = user.split(",");
//			info4.setName(userarr1[0]);
//			info4.setNum(userarr1[1]);
//			info4.setMail(userarr1[2]);

//			username.add(info.getName());
//			usernum.add(info.getNum());
//			usermail.add(info.getMail());

//			System.out.println(list.toString());
//
//			user = input.readLine(); // 두번째부터 불러온다
//			userarr2 = user.split(",");
//			name = userarr2[0];
//			num = userarr2[1];
//			mail = userarr2[2];
//			list.add(userarr2);
//
//			System.out.println(list);
//			if (!username.contains(name)) {
//				username.add(name);
//				usernum.add(num);
//				usermail.add(mail);
//			}

//			user = input.readLine(); // 두번째부터 불러온다
//			userarr = user.split(",");
//			name = userarr[0];
//			num = userarr[1];
//			mail = userarr[2];
//			if (!username.contains(name)) {
//				Userinfo info2 = new Userinfo(name, num, mail);
//				username.add(info2.getName());
//				usernum.add(info2.getNum());
//				usermail.add(info2.getMail());
//			}
//			user = input.readLine(); // 두번째부터 불러온다
//			userarr = user.split(",");
//			name = userarr[0];
//			num = userarr[1];
//			mail = userarr[2];
//			if (!username.contains(name)) {
//				Userinfo info3 = new Userinfo(name, num, mail);
//				username.add(info3.getName());
//				usernum.add(info3.getNum());
//				usermail.add(info3.getMail());
//			}
//			user = input.readLine(); // 두번째부터 불러온다
//			userarr = user.split(",");
//			name = userarr[0];
//			num = userarr[1];
//			mail = userarr[2];
//			if (!username.contains(name)) {
//				Userinfo info4 = new Userinfo(name, num, mail);
//				username.add(info4.getName());
//				usernum.add(info4.getNum());
//				usermail.add(info4.getMail());
//			}
//			user = input.readLine(); // 두번째부터 불러온다
//			userarr = user.split(",");
//			name = userarr[0];
//			num = userarr[1];
//			mail = userarr[2];
//			if (!username.contains(name)) {
//				Userinfo info5 = new Userinfo(name, num, mail);
//				username.add(info5.getName());
//				usernum.add(info5.getNum());
//				usermail.add(info5.getMail());
//			}
//			
//
//		

//			for (int i = 0; i < username.size(); i++) {
//				System.out.println(list.get(0));
//			}

		} catch (

		FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e + "==> 오류발생");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e + "==> 오류발생");
		}
	}

}

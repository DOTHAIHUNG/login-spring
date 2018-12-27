package model;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List <User> users;

    static {
        users = new ArrayList <>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("Trung");
        u1.setAccount("trungdien");
        u1.setEmail("trungcho@gmail.com");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(18);
        u2.setName("Phu");
        u2.setEmail("phu@gmail.com");
        u2.setAccount("phu123");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(20);
        u3.setName("LamAnh");
        u3.setAccount("lanh");
        u3.setEmail("lamanh@gmail.com");
        u3.setPassword("123456");
        users.add(u3);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }

}

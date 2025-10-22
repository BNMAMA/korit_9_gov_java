package com.korit.study.ch23;

import java.util.ArrayList;

class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

class VipUser extends User {
    public VipUser(String username, String password) {
        super(username, password);
    }
}

class GoldUser extends User {
    public GoldUser(String username, String password) {
        super(username, password);
    }
}

public class WildcardMain {
    public static void main(String[] args) {
        WildcardMain main = new WildcardMain();
//        ArrayList<String> names = new ArrayList<>();
//        names.add("김준일");
//        names.add("김준이");
//        names.add("김준삼");
///       main.printAll(names);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("test1", "1234"));
        users.add(new User("test2", "5678"));
        users.add(new User("test3", "1111"));
        main.printAll(users);

        ArrayList<VipUser> vipUsers = new ArrayList<>();
        vipUsers.add(new VipUser("vip1", "1234"));
        vipUsers.add(new VipUser("vip2", "5678"));
        vipUsers.add(new VipUser("vip3", "1111"));
//        main.printAll(vipUsers);
        //User객체를 상속 받아서 printAll 메소드를 사용할 수 있다.

        ArrayList<GoldUser> goldUsers = new ArrayList<>();
        goldUsers.add(new GoldUser("vip1", "1234"));
        goldUsers.add(new GoldUser("vip2", "5678"));
        goldUsers.add(new GoldUser("vip3", "1111"));
        main.printAll(goldUsers);
    }

    //와일드카드는 결국 뭐가 올지 모르기 때문에 Object를 사용할 수 밖에 없음
    public void printAll(ArrayList<? super GoldUser> list) { //<super>GoldUser - User - Object(제일 부모 클래스)

        for (Object s : list) {

            System.out.println(s);
        }
        list.get(0); //자료형이 뭔지 파악을 해줌(capture)
    }

    /**
     * 와일드 카드 >>>> '?' 기호
     * 어떤 타입인지 알 수 없다. 즉 모든 타입을 유추하여 받을 수 있는 방법

     * 상한 경계 와일드카드: extends >>> ? extends User
     * 최대 업캐스팅 가능한 범위를 User로 하겠다. 즉, 상한선을 정하겠다라는 의미

     * 하한 경계 와일드카드: super >>> ? super GoldUser
     * 해당 객체부터 상위로 모든 범위를 지정하겠다. 즉, Object부터 GoldUser객체까지 하한선을 정하겠다 라는 의미
    * */

}

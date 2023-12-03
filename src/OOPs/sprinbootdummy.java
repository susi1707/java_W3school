package OOPs;

import java.util.List;

class User{
    private String userId;
    private String name;
    private int age;
    private long pNumber;

    public User() {
    }

    public User(String userId, String name, int age, long pNumber) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.pNumber = pNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getpNumber() {
        return pNumber;
    }

    public void setpNumber(long pNumber) {
        this.pNumber = pNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", pNumber=" + pNumber +
                '}';
    }
    public User getUserId(List<User> users,String id){
        for (User res: users) {
           if(res.getUserId() .equals(id)){
               return res;
           }
        }
        return null;
    }
}
public class sprinbootdummy {
    public static void main(String[] args) {
User users = new User();
        List<User> user = List.of(
                  new User("1", "susi", 23, 32234234)
                , new User("2", "susi", 24, 1232234234)
                , new User("3", "susi", 25, 667343334)
                , new User("4", "susi", 26, 576234234)
                , new User("5", "susi", 27, 978834234));
        System.out.println(users.getUserId(user,"1"));



    }


}

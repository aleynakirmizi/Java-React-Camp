package homework1;

public class UserManager extends User {
    public void singIn(User user){
        System.out.println("Merhaba "+ user.getFirst_name()+" hoşgeldin !");
    }
    public void signOut(User user){
        System.out.println(user.getFirst_name()+" sistemden çıkışın yapıldı!");
    }
}

public class Main {
    public static void main(String[] args){

        LoginTest login = new LoginTest();
        System.out.println("-------------");
        System.out.println("Starting test...");
       login.loginWithValidCredentials();
           login.loginWithInvalidCredentials();

            WishList wish = new WishList();
            wish.Wishlist();
        RegisterTest register = new RegisterTest();
        register.Register();



    }
}

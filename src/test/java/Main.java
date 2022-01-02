public class Main {
    public static void main(String[] args){

        SearchIcon search = new SearchIcon();
        System.out.println("-------------");
        System.out.println("Starting test...");
        search.SearchIcon();

        DeleteProduct delete = new DeleteProduct();
        delete.DeleteProductFromCart();
        Checkout checkout = new Checkout();
        checkout.CheckoutButton();

        SortBy sort = new SortBy();
        sort.SortTest();



    }
}

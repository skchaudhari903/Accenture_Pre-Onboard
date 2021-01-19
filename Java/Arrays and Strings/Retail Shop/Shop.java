import java.util.Scanner;

public class Shop{
    private String shopName,shopAddress;
    private String[] products;
    public Shop(){}
        public Shop(String shopName,String shopAddress,String products[]){
            this.shopName = shopName;
            this.shopAddress = shopAddress;
            this.products = products;
        }
        public void setShopName(String shopName1){
            this.shopName = shopName1;
        }
        public String getShopName(){
            return this.shopName;
        }
        public void setShopAddress(String shopAddress1){
            this.shopAddress = shopAddress1;
        }
            public String getShopAddress(){
            return this.shopAddress;
        }
        public void setProducts(String[] products){
            this.products = products;
        }
        public String[] getProducts(){
            return this.products;
        }
        public boolean checkProductAvailability(String productname){
            boolean contains = false;
            for(int i =0; i < products.length; i++){
                if(products[i].equalsIgnoreCase(productname)){
                    contains = true;
                    break;
                }
            }
            return contains;
        }
        
        public static void main(String args[]) throws Exception{
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the shopname:");
            String shopName=scn.nextLine();
            System.out.println("Enter the shop address:");
            String shopAddress=scn.nextLine();
            System.out.println("Enter number of products:");
            int n  =scn.nextInt();
            String products[] = new String[n+1];
            for(int i = 0;i <= n; i++)
                products[i]=scn.nextLine();
            System.out.println("Enter the product to be searched:");
            String productName=scn.nextLine();
            Shop ob = new Shop(shopName,shopAddress,products);
            if(ob.checkProductAvailability(productName))
                System.out.println("Product is available at "+shopName+", "+shopAddress+".");
            else
            System.out.println("Product is not available at "+shopName+", "+shopAddress+".");
         }
}
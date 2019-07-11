package serenity.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.*;
import java.util.List;
import java.util.Map;

class User {
    private List<Map<String,Map<String,String>>> address;
    private List<Map<String,Map<String,String>>> homePage;
    private List<Map<String,Map<String,String>>> loginPage;
    private List<Map<String,Map<String,String>>> productListPage;
    private List<Map<String,Map<String,String>>> productPage;
    private List<Map<String,Map<String,String>>> cartPage;
    private List<Map<String,Map<String,String>>> basketPage;
    private List<Map<String,Map<String,String>>> checkoutPage;
    public List<Map<String,Map<String,String>>> getAddress() {
        return address;
    }
    public void setAddress(List<Map<String,Map<String,String>>> address) {
        this.address = address;
    }
    public List<Map<String, Map<String, String>>> getHomePage() {
        return homePage;
    }

    public void setHomePage(List<Map<String, Map<String, String>>> homePage) {
        this.homePage = homePage;
    }

    public List<Map<String, Map<String, String>>> getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(List<Map<String, Map<String, String>>> loginPage) {
        this.loginPage = loginPage;
    }

    public List<Map<String, Map<String, String>>> getProductListPage() {
        return productListPage;
    }

    public void setProductListPage(List<Map<String, Map<String, String>>> productListPage) {
        this.productListPage = productListPage;
    }

    public List<Map<String, Map<String, String>>> getProductPage() {
        return productPage;
    }

    public void setProductPage(List<Map<String, Map<String, String>>> productPage) {
        this.productPage = productPage;
    }

    public List<Map<String, Map<String, String>>> getCartPage() {
        return cartPage;
    }

    public void setCartPage(List<Map<String, Map<String, String>>> cartPage) {
        this.cartPage = cartPage;
    }

    public List<Map<String, Map<String, String>>> getBasketPage() {
        return basketPage;
    }

    public void setBasketPage(List<Map<String, Map<String, String>>> basketPage) {
        this.basketPage = basketPage;
    }

    public List<Map<String, Map<String, String>>> getCheckoutPage() {
        return checkoutPage;
    }

    public void setCheckoutPage(List<Map<String, Map<String, String>>> checkoutPage) {
        this.checkoutPage = checkoutPage;
    }


}



public class demoClass {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            String fileName = "Locators.yml";
            User user = mapper.readValue(new File(System.getProperty("user.dir") + "//src//test/resources//" + fileName), User.class);
            String yamlObjects= ReflectionToStringBuilder.toString(user, ToStringStyle.MULTI_LINE_STYLE);
            System.out.println(user.getHomePage());
            List<Map<String,Map<String,String>>> h1 = user.getHomePage();
            for(int i = 0;i<h1.size();i++) {
            for(Map.Entry<String,Map<String,String>> mapEntry :user.getHomePage().get(i).entrySet()) {
                if(mapEntry.getKey().equals("xpath")) {
                    Map<String,String> h2 = mapEntry.getValue();
                    for(Map.Entry<String,String> mapEntry2:h2.entrySet()) {
                        if(mapEntry2.getKey().equals("homePageLoginLink")) {
                            System.out.println(mapEntry2.getValue());
                        }
                    }
                }
            }}
            /*HashMap<String,String> hashMap = new HashMap<String,String>();
            String[] loc;
            for(int i = 0 ; i<yamlLine.length;i++) {
                //System.out.println(yamlLine[1]);
                loc = yamlLine[1].split("ID=");
                hashMap.put(loc[0],loc[1]);
                System.out.println(hashMap.get(loc[0]));
            } */



        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

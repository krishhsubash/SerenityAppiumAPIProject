package serenity.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class YamlUtil {

    private List<Map<String,Map<String,String>>> address;
    private List<Map<String,Map<String,String>>> homePage;
    private List<Map<String,Map<String,String>>> loginPage;
    private List<Map<String,Map<String,String>>> productListPage;
    private List<Map<String,Map<String,String>>> productPage;
    private List<Map<String,Map<String,String>>> cartPage;
    private List<Map<String,Map<String,String>>> basketPage;
    private List<Map<String,Map<String,String>>> checkoutPage;

    public List<Map<String, Map<String, String>>> getAddress() {
        return address;
    }

    public void setAddress(List<Map<String, Map<String, String>>> address) {
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

    public String readLocators(String locateBy,String pageName,String locatorName) throws IOException {
        String pageLocators = null;
        FileReader reader=new FileReader(System.getProperty("user.dir") + "//src//test/resources//prop.properties");
        Properties p=new Properties();
        p.load(reader);
        String fileName = p.getProperty("locatorsFileName");
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        YamlUtil ymlUtil=mapper.readValue(new File(System.getProperty("user.dir") + "//src//test/resources//" + fileName), YamlUtil.class);
        String yamlObjects = ReflectionToStringBuilder.toString(ymlUtil, ToStringStyle.MULTI_LINE_STYLE);
        List<Map<String, Map<String, String>>> h1=null;
        if(pageName.equals("homePage")) {
            h1= ymlUtil.getHomePage();
        }
        else if(pageName.equals("loginPage")) {
            h1= ymlUtil.getLoginPage();
        }
        else if(pageName.equals("productListPage")) {
            h1= ymlUtil.getProductListPage();
        }
        else if(pageName.equals("productPage")) {
            h1= ymlUtil.getProductPage();
        }
        else if(pageName.equals("BasketPage")) {
            h1= ymlUtil.getBasketPage();
        }
        else if(pageName.equals("cartPage")) {
            h1= ymlUtil.getCartPage();
        }
        else if(pageName.equals("checkoutPage")) {
            h1= ymlUtil.getCheckoutPage();
        }
        for(int i = 0;i<h1.size();i++) {
            for (Map.Entry<String, Map<String, String>> mapEntry : h1.get(i).entrySet()) {
                if (mapEntry.getKey().equals("ID") && locateBy.equals("ID")) {
                    Map<String, String> h2 = mapEntry.getValue();
                    for (Map.Entry<String, String> mapEntry2 : h2.entrySet()) {
                        if (mapEntry2.getKey().equals(locatorName)) {
                            pageLocators = mapEntry2.getValue();
                        }
                    }
                }
                else if (mapEntry.getKey().equals("xpath") && locateBy.equals("xpath")) {
                    Map<String, String> h2 = mapEntry.getValue();
                    for (Map.Entry<String, String> mapEntry2 : h2.entrySet()) {
                        if (mapEntry2.getKey().equals(locatorName)) {
                            pageLocators = mapEntry2.getValue();
                        }
                    }
                }
            }
        }
        return pageLocators;
    }
}

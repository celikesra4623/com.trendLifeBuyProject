package pages.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PageAdmin_ProductList {

    public PageAdmin_ProductList(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='nav_title'])[6]")
    public WebElement dropDownProdocts;

    @FindBy(xpath = "//a[text()='Product List']")
    public WebElement linkDDMProdocts_ProductsList;

    @FindBy(xpath = "//a[@id='product_list_id']")
    public WebElement listHeaderProductList;

    @FindBy(xpath = "//a[@id='product_alert_id']")
    public WebElement listHeaderAlertList;

    @FindBy(xpath = "//a[@id='product_stock_out_id']")
    public WebElement listHeaderOutOfStockList;

    @FindBy(xpath = "//a[@id='product_disabled_id']")
    public WebElement listHeaderDisabledProductList;

    @FindBy(xpath = "//a[@id='product_sku_id']")
    public WebElement listHeaderProductBySKUList;

    @FindBy(xpath = "(//div[@class='dataTables_info'])[1]")
    public WebElement dataTableResultInfo;
    @FindBy(xpath = "(//div[@class='dataTables_info'])[2]")
    public WebElement dataTableResultInfo2;
    @FindBy(xpath = "(//div[@class='dataTables_info'])[3]")
    public WebElement dataTableResultInfo3;
    @FindBy(xpath = "(//div[@class='dataTables_info'])[4]")
    public WebElement dataTableResultInfo4;
    @FindBy(xpath = "(//div[@class='dataTables_info'])[5]")
    public WebElement dataTableResultInfo5;

    @FindBy(xpath = "//input[@aria-controls='mainProductTable']")
    public WebElement fieldQuickSearch;

    @FindBy(xpath = "(//div[@class='slider round'])[1]")
    public WebElement checkboxStatusColumFirstProduct;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement toastMessage;

    @FindBy(xpath = "(//div[@class='dropdown CRM_dropdown'])[1]")
    public WebElement buttonSelect;

    @FindBy(xpath = "//*[@id=\"mainProductTable\"]/tbody/tr[1]/td[8]/div/div/a[1]")
    public WebElement ddmSelect_View;

    @FindBy(xpath = "//*[@id=\"mainProductTable\"]/tbody/tr[1]/td[8]/div/div/a[2]")
    public WebElement ddmSelect_Edit;

    @FindBy(xpath = "//*[@id=\"mainProductTable\"]/tbody/tr[1]/td[8]/div/div/a[3]")
    public WebElement ddmSelect_Clone;

    @FindBy(xpath = "//*[@id=\"mainProductTable\"]/tbody/tr[1]/td[8]/div/div/a[4]")
    public WebElement ddmSelect_Delete;

    @FindBy(xpath = "//*[@id=\"productDetails\"]/div/div/div[1]/h4")
    public WebElement viewProductTitle;








    /*****************************************************************************************************************/

    public List<WebElement> headerList()  {
        List<WebElement> listHeader=new ArrayList<>();

        listHeader.add(listHeaderProductList);
        listHeader.add(listHeaderAlertList);
        listHeader.add(listHeaderOutOfStockList);
        listHeader.add(listHeaderDisabledProductList);
        listHeader.add(listHeaderProductBySKUList);

        return listHeader;
    }

    List<String> expListItem = Arrays.asList("Product List", "Alert List",
            "Out Of Stock List", "Disabled Product List", "Product By SKU");

    public List<String> dataTableInfoStringList()  {
        List<String> dataTableInfo=new ArrayList<>();
        dataTableInfo.add(dataTableResultInfo.getText());
        dataTableInfo.add(dataTableResultInfo2.getText());
        dataTableInfo.add(dataTableResultInfo3.getText());
        dataTableInfo.add(dataTableResultInfo4.getText());
        dataTableInfo.add(dataTableResultInfo5.getText());

        return dataTableInfo;
    }

}

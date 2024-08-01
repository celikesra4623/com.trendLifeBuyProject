package pojos.US017_Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true) //In order not to give an error if one of the data is ignored

public class CreateUpdateDeleteTestItem {


/*      from Swagger/Post/create CTestItem/Model

    {Jump to definition
        createdBy	string
        createdDate	string($date-time)
        defaultValMax	string
        defaultValMin	string
        description	string
        id	integer($int64)
            name	string
        price*	number
        minimum: 0
        exclusiveMinimum: false}
    */


    private String createdBy;
    private String createdDate;
    private String defaultValMax;
    private String defaultValMin;
    private String description;
    private Integer id;
    private String name;
    private String price;

    public CreateUpdateDeleteTestItem() {
    }

    public CreateUpdateDeleteTestItem(String createdBy, String createdDate, String defaultValMax, String defaultValMin, String description, Integer id, String name, String price) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.defaultValMax = defaultValMax;
        this.defaultValMin = defaultValMin;
        this.description = description;
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getDefaultValMax() {
        return defaultValMax;
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    public String getDefaultValMin() {
        return defaultValMin;
    }

    public void setDefaultValMin(String defaultValMin) {
        this.defaultValMin = defaultValMin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CreateUpdateDeleteTestItem{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", defaultValMax='" + defaultValMax + '\'' +
                ", defaultValMin='" + defaultValMin + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

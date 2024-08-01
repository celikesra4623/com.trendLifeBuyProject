package pojos.US016_Pojo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class RoomCreateUpdateDelete {
/*
{
  "createdBy": "string",
  "createdDate": "2022-03-25T07:54:08.787Z",
  "description": "string",
  "id": 0,
  "price": 0,
  "roomNumber": 0,
  "roomType": "TWIN",
  "status": true
}

 */
    private String createdBy;
    //private String createdDate;
    private String description;
    private int price;
    private int roomNumber;
    private String roomType;
    private boolean status;

    public RoomCreateUpdateDelete() {
    }

    public RoomCreateUpdateDelete(String createdBy, String description, int price, int roomNumber, String roomType, boolean status) {
        this.createdBy = createdBy;
        this.description = description;
        this.price = price;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

//    public String getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(String createdDate) {
//        this.createdDate = createdDate;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RoomCreateUpdateDelete{" +
                "description='" + description + '\'' +
                ", id=" +
                ", price=" + price +
                ", roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", status=" + status +
                '}';
    }
}

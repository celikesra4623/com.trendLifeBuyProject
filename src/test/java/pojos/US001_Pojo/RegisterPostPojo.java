package pojos.US001_Pojo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class RegisterPostPojo {

   /* {
        "id": 77858,
            "login": "florencio.rogahn",
            "firstName": "King",
            "lastName": "Williamson",
            "ssn": "427-84-4039",
            "email": "janine.pouros@gmail.com",
            "imageUrl": null,
            "activated": false,
            "langKey": "en",
            "createdBy": "anonymousUser",
            "createdDate": "2022-04-19T13:58:01.221718Z",
            "lastModifiedBy": "anonymousUser",
            "lastModifiedDate": "2022-04-19T13:58:01.221718Z",
            "authorities": [
                  ]
    }   */

    private String imageUrl;
    private Boolean activated;
    private String createdBy;
    private String createdDate;
    private String lastModifiedBy;
    private String lastModifiedDate;
    private String login;
    private String firstName;
    private String lastName;
    private String ssn;
    private String email;
    private String password;
    private String langKey;
    private String authorities[];




}

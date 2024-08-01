package pojos.US001_Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class RegisterPojo {

      /*{
        "id": 4,
        "login": "bakalim",
        "firstName": "hastamisin",
        "lastName": "hastaa",
        "ssn": "856-45-6776",
        "email": "hastapasta@gmail.com",
        "imageUrl": null,
        "activated": true,
        "langKey": "en",
        "createdBy": "system",
        "createdDate": null,
        "lastModifiedBy": "gulbahce",
        "lastModifiedDate": "2022-03-16T21:47:51.486972Z",
        "authorities": [
            "ROLE_PATIENT"
        ]
         }  */

   private String login;
   private String firstName;
   private String lastName;
   private String ssn;
   private String email;
   private String password;
   private String langKey;



}

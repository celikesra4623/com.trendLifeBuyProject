package pojos.US027_Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
    //https://medunna.com/api/c-messages

    /*
    {
        "id": 77075,
        "name": "Orhan Baba",
        "email": "orhanbaba@medunna.com",
        "subject": "arabesk",
        "message": "Bitsin bu hasret"
    }
     */
    private String name;
    private String email;
    private String subject;
    private String message;
}

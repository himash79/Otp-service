package lk.himash.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasswordResetRequestDto {

    //end-user mobile
    private String phoneNumber;
    private String userName;
    private String oneTimePassword;

}

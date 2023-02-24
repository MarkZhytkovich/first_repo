package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDetailsModel {
    private Occupation occupation;
    private MaritalStatus maritalStatus;
    private Education education;
}

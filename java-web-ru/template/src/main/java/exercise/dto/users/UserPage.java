package exercise.dto.users;

import exercise.model.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

// BEGIN
@Getter
@AllArgsConstructor
public class UserPage {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
// END

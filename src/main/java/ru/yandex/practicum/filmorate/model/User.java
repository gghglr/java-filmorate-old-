package ru.yandex.practicum.filmorate.model;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class User {

    private Integer id;
    private String email;
    private String login;
    private String name;
    private LocalDate birthday; //"2000-08-20"
    /* json for user
    {
    "email": "alex-yurlovmail.ru",
    "login": "gghglr",
    "name": "lesha",
    "birthday": "2000-08-20"
}
     */
    public void setName(String name){
        this.name = name;
    }

}

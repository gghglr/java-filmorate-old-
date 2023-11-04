package ru.yandex.practicum.filmorate.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class Film {

    private Integer id;
    private String name;
    private String description;
    private LocalDate releaseDate;
    private Long duration;
    /*json for film
    {
    "name": "Lesha",
    "description": "qweqwe",
    "releaseDate":  "2000-08-20",
    "duration": 200
    }
     */
}

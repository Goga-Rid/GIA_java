package org.example.demoexam;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Partner {
    private String type;
    private String name;
    private int rate;
    private String address;
    private String nameDirector;
    private String phone;
    private String email;
}

package com.pawdly.partners.model;

import lombok.*;

@NoArgsConstructor
@Getter
@ToString
public class Member {
    @NonNull
    private int mbId;
    @NonNull
    private String hp;
    private String password;
    private String email;
}

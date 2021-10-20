package com.pawdly.partners.dto;

import com.pawdly.partners.model.Member;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
    private String hp;
    private String password;
    private String email;

    public MemberDto(Member member) {
        this.hp = member.getHp();
        this.password = member.getPassword();
        this.email = member.getEmail();
    }
}

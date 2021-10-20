package com.pawdly.partners.service;

import com.pawdly.partners.model.Member;
import org.springframework.stereotype.Service;

public interface MemberService {
    //가입하기
    //중복아이디찾기
    Member selectMemberById(String hp);
    //로그인하기
}

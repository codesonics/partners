package com.pawdly.partners.service;

import com.pawdly.partners.model.Member;
import com.pawdly.partners.repository.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberMapper memberMapper;

    @Override
    public Member selectMemberById(String id) {
        return memberMapper.selectMemberById(id);
    }
}

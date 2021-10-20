package com.pawdly.partners.component;

import com.pawdly.partners.model.Member;
import com.pawdly.partners.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class InitRunner implements ApplicationRunner {

    @Autowired
    private MemberService service;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Member member = service.selectMemberById("01096591368");

        System.out.println(member.toString());
    }
}

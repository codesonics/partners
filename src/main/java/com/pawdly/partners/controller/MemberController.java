package com.pawdly.partners.controller;

import com.pawdly.partners.dto.MemberDto;
import com.pawdly.partners.dto.ResponeData;
import com.pawdly.partners.model.Member;
import com.pawdly.partners.repository.MemberMapper;
import com.pawdly.partners.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping
    private String join(){
        return "member/join";
    }

    @ResponseBody
    @GetMapping("/find")
    private ResponeData<?> find(@RequestParam String id){
        Member member = memberService.selectMemberById(id);
        if(member != null){
            MemberDto result = new MemberDto(member);
            return new ResponeData<>(true, "데이터 가져오기 성공", result);
        }else{
            return new ResponeData<>(false, "데이터 가져오기 실패", null);
        }

    }
}

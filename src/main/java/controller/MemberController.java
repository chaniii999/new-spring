package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.MemberService;

@Service
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}

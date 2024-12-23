package org.art.gallery.backend.controller;

import org.art.gallery.backend.entity.Item;
import org.art.gallery.backend.entity.Member;
import org.art.gallery.backend.repository.ItemRepository;
import org.art.gallery.backend.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AccountContoller {

    @Autowired
    MemberRepository memberRepository;

    @PostMapping("/api/account/login")
    public int login(@RequestBody Map<String, String> params){
        Member member = memberRepository.findByEmailAndPassword(params.get("email"), params.get("password"));
        System.out.println(member);
        if(member == null) return 0;
        return member.getId();
    }

}

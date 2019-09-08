package io.wayne.store.account.svc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/account")
@Slf4j
public class AccountController {

    @GetMapping("ping")
    public String ping(){
        return "pong";
    }
}

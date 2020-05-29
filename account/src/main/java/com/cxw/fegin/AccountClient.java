package com.cxw.fegin;

import com.cxw.openapi.account.IAccountClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign/account/")
public class AccountClient implements IAccountClient {
    @PostMapping("/getAccount")
    @Override
    public String getAccount() {
        return "aaaa";
    }
}

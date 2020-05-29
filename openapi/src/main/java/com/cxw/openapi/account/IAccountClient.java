package com.cxw.openapi.account;


import com.cxw.openapi.account.fallback.AccountFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value ="account",fallbackFactory = AccountFallback.class)
public interface IAccountClient {

    @PostMapping("/feign/account/getAccount")
    String getAccount();
}



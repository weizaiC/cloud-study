package com.cxw.openapi.account.fallback;

import com.cxw.openapi.account.IAccountClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class AccountFallback implements FallbackFactory<IAccountClient> {

    @Override
    public IAccountClient create(Throwable throwable) {
      return   new IAccountClient() {

            @Override
            public String getAccount() {
                return null;
            }
        };
    }
}

package com.example.advance.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryV0 {
    public void save(String itemId) {
        if(itemId.equals("ex")){
            throw new IllegalArgumentException("μμΈλ°μ");
        }
        sleep(1000);
    }

    public void sleep(int millies) {
        try {
            Thread.sleep(millies);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

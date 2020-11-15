package com.axs.core;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CmisApplicationTests {

    @Test
    void contextLoads() {
    }

    static ThreadLocal<String> locals = new ThreadLocal<>();
    public static void main(String[] args) {

        locals.set("123");
    }

}

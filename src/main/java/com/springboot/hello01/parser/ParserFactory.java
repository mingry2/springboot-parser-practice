package com.springboot.hello01.parser;

import com.springboot.hello01.domain.Hospital;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // springboot 적용
public class ParserFactory {

    @Bean
    public ReadLineContext<Hospital> hospitalReadLineContext() {
        return new ReadLineContext<Hospital>(new HospitalParser());
    }
}

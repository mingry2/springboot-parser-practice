package com.springboot.hello01.parser;

/*
 어떤 원본파일을 들고와서 데이터를 가공할지 모름
 매번 해당하는 파일의 parser 파일을 만들어서 가공하는 것보다
 Parser 인터페이스를 작성해놓으면 좋다
 */
public interface Parser<T> {
    T parse(String str);

}


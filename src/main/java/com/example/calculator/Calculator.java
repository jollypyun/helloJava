package com.example.calculator;

import java.util.List;

public class Calculator {
    // 공변성(covariant) : 자신이 상속받은 부모 객체로 타입을 변화시킬 수 있다.
    // 제네릭의 공변성은 extends 키워드를 사용해서 사용이 가능하다.
    // 읽기는 가능하나 쓰기는 불가능하게 하여 런타임 중 에러가 발생하는 것을 막는다.
    public Number sum(List<? extends Number> numbers) {
//        numbers.add(55); 컴파일 오류
        long sum = 0;
        for(Number number : numbers) {
            sum += number.longValue();
        }
        return sum;
    }

    // 반공변성(contravariant)
    // 쓰기 가능
    // Integer 상위의 부모 객체(Numbers)를 파라미터로 받을 수 있다. 이 때 런타임에러는 나지 않는다.
    // Integer형이 아닌 Numbers 하위 타입이 오는 경우에는 ClassCastException이 발생
    public void addNumber(List<? super Integer> numbers) {
        numbers.add(6);
    }
}

package com.devujin.springcorebasics.discount;

import com.devujin.springcorebasics.member.Grade;
import com.devujin.springcorebasics.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}

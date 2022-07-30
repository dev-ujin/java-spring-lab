package com.devujin.springcorebasics.discount;

import com.devujin.springcorebasics.member.Member;

public interface DiscountPolicy {
    /**
     *
     * @return discount price
     */
    int discount(Member member, int price);
}

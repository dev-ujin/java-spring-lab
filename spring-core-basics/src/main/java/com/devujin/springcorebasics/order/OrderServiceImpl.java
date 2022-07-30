package com.devujin.springcorebasics.order;

import com.devujin.springcorebasics.discount.DiscountPolicy;
import com.devujin.springcorebasics.discount.FixDiscountPolicy;
import com.devujin.springcorebasics.member.Member;
import com.devujin.springcorebasics.member.MemberRepository;
import com.devujin.springcorebasics.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}

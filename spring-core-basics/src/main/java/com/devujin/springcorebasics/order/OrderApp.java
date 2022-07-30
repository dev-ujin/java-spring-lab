package com.devujin.springcorebasics.order;

import com.devujin.springcorebasics.member.Grade;
import com.devujin.springcorebasics.member.Member;
import com.devujin.springcorebasics.member.MemberService;
import com.devujin.springcorebasics.member.MemberServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "member1", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "item1", 10000);

        System.out.println("order: " + order);
        System.out.println("order.calculatePrice: " + order.calculatePrice());
    }
}

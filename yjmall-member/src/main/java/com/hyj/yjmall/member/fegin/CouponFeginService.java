package com.hyj.yjmall.member.fegin;

import com.hyj.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("yjmall-coupon")
public interface CouponFeginService {
    @RequestMapping("/coupon/smscoupon/member/list")
    public R menberCoupons();
}

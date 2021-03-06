package com.atguigu.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.sms.entity.FlashPromotion;
import com.atguigu.gmall.sms.mapper.FlashPromotionMapper;
import com.atguigu.gmall.sms.service.FlashPromotionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 限时购表 服务实现类
 * </p>
 *
 * @author lyg
 * @since 2020-03-03
 */
@Service
@Component
public class FlashPromotionServiceImpl extends ServiceImpl<FlashPromotionMapper, FlashPromotion> implements FlashPromotionService {

}

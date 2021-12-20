package com.chinamobile.rt.ws.bdoc_demo.conditional;/**
 * @Title
 * @Author Administrator
 * @Date 2021-08-18 11:17
 * @Description
 * @Since V1.1
 */

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Title
 * @Author Administrator
 * @Date 2021-08-18 11:17
 * @Description
 * @Since V1.0
 */
public class RTConditonal implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        return 1==1?true:false;
    }
}

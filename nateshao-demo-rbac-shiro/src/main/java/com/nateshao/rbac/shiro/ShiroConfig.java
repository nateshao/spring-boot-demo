package com.nateshao.rbac.shiro;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    @Bean
    public IniRealm iniRealm() {
        // 配置内存用户和角色
        return new IniRealm("[users]\nadmin=admin,admin\nuser=user,user\n[roles]\nadmin=*");
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean filter = new ShiroFilterFactoryBean();
        filter.setSecurityManager(securityManager);
        filter.setLoginUrl("/login");
        Map<String, String> map = new LinkedHashMap<>();
        map.put("/admin/**", "authc, roles[admin]");
        map.put("/user/**", "authc, roles[user,admin]");
        map.put("/**", "anon");
        filter.setFilterChainDefinitionMap(map);
        return filter;
    }
} 
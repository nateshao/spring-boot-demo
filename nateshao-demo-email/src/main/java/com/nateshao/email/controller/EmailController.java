package com.nateshao.email.controller;

import com.nateshao.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public String send(@RequestParam String to, @RequestParam String subject, @RequestParam String content) {
        emailService.sendSimpleMail(to, subject, content);
        return "邮件已发送";
    }
} 
package com.ict.finalproject.controller;

import com.ict.finalproject.dto.JoinDTO;
import com.ict.finalproject.service.JoinService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@Slf4j
public class JoinController {

    @Autowired
    private JoinService service;

    @PostMapping("/join")
    public String joinProcess(JoinDTO joinDTO) {
       service.joinProcess(joinDTO);

        return "ok";
    }

}

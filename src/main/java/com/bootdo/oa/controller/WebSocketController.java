package com.bootdo.oa.controller;

import com.bootdo.system.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {
	@Autowired
	SimpMessagingTemplate template;

	@Autowired
    SessionService sessionService;
}
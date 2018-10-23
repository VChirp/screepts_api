package com.screepts.screepts_api.conroller;

import com.screepts.screepts_api.model.dto.ResponseDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public ResponseDto initRequest(){

        return new ResponseDto("Hello, Screeps!");
    }

}

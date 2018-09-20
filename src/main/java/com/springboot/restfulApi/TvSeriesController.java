package com.springboot.restfulApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/tvseries")
public class TvSeriesController {

    @GetMapping
    public List<TvSeriesDto> getAll(){
        List<TvSeriesDto> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        //calendar.set(2016,10,2);
        calendar.set(2016,Calendar.OCTOBER,2,0,0);
        //System.out.println(calendar.getTime());
        list.add(new TvSeriesDto(1,"WestCity",2,calendar.getTime()));
        return list;
    }
}




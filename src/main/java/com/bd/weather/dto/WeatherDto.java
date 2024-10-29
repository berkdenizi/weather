package com.bd.weather.dto;

import com.bd.weather.model.WeatherEntity;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record WeatherDto (
        String cityName,
        String country,
        Integer temperature,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
        LocalDateTime updatetedTime
) {
    public static WeatherDto convert(WeatherEntity entity) {
        return new WeatherDto(entity.getCityName(), entity.getCountry(), entity.getTemperature(), entity.getUpdatedTime());
    }
}

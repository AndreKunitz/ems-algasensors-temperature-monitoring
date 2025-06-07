package com.akunitz.algasensors.temperature.monitoring.api.config.web;

import io.hypersistence.tsid.TSID;
import org.springframework.core.convert.converter.Converter;

public class StringToTSIDWebConverter implements Converter<String, TSID> {

    @Override
    public TSID convert(String source) {
        try {
            return TSID.from(source);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid TSID format: " + source, e);
        }
    }
}

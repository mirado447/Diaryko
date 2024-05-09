package com.journal.diaryko.service.utils;

import lombok.NoArgsConstructor;
import java.util.Map;

@NoArgsConstructor
public class EnumMapperUtils {
    public static <T, U> U mapEnum(T input, Map<T, U> enumMap) {
        if (input == null) {
            return null;
        }
        return enumMap.get(input);
    }
}

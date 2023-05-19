package com.cej;

import com.cej.abase.domain.Ac01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Ac01> ac01s = new ArrayList<>();

        List<Ac01> ac01sOrder = ac01s.stream()
                .filter(p -> "陈恩杰".equals(p.getAac003()))
                .collect(Collectors.toList());
    }
}

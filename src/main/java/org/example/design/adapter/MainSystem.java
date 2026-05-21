package org.example.design.adapter;

import org.example.design.adapter.impl.SystemAdapter;
import org.example.design.adapter.impl.SystemHpImpl;
import org.example.design.adapter.system.SystemHp;
import org.example.design.adapter.system.SystemLenovo;

public class MainSystem {
    public static void main(String[] args) {

        SystemLenovo lenovo = new SystemAdapter(new SystemHpImpl());
        lenovo.run();

    }
}

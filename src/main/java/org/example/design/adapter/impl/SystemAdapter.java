package org.example.design.adapter.impl;

import org.example.design.adapter.system.SystemHp;
import org.example.design.adapter.system.SystemLenovo;

public class SystemAdapter implements SystemLenovo {

    private SystemHp hp;

    public SystemAdapter(SystemHp hp) {
        this.hp = hp;
    }

    @Override
    public void run() {
        hp.run();
        System.out.println("Running with Adaptor");
    }
}

package org.example.design.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        SystemConfig config = new SystemConfig();
        config.setName("MySystem");
        config.setPort("8081");
        config.setIp("11.233.23.123");

        System.out.println(config);

        SystemConfig config1 = (SystemConfig) config.clone();
        System.out.println(config);
    }
}

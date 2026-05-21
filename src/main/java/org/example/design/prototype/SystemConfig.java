package org.example.design.prototype;

public class SystemConfig implements Cloneable {
    private String name;
    private String ip;
    private String port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    // DEEP COPY
    @Override
    public Object clone() throws CloneNotSupportedException {
        SystemConfig config = new SystemConfig();
        config.setIp(this.ip);
        config.setPort(this.port);
        config.setName(this.name);
        return config;
    }

    @Override
    public String toString() {
        return "SystemConfig{" +
                "name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}

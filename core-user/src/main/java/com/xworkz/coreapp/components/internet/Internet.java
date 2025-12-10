package com.xworkz.coreapp.components.internet;


import org.springframework.stereotype.Component;

@Component
public class Internet {
    private int internetId;
    private  String name;

    public Internet(){
        System.out.println("Internet const is invoked..");
    }

    public int getInternetId() {
        return internetId;
    }

    public void setInternetId(int internetId) {
        this.internetId = internetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Internet{" +
                "internetId=" + internetId +
                ", name='" + name + '\'' +
                '}';
    }
}

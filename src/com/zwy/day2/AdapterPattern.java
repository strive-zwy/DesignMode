package com.zwy.day2;

/**
 * @Author ：zwy
 * @Date ：2020/12/21 19:07
 * @Version ：1.0
 * @Description ：设计模式 - 6、适配器模式
 *                就像两个国家的人进行交流时需要一个翻译，这个翻译就是适配器的角色
 **/

public class AdapterPattern {

    public static void main(String[] args) {
        System.out.println(new Adapter(new Speaker()).tanslate());
    }
}

class Speaker{
    public String speak(){
        return "我在演讲！";
    }
}

interface Translator{
    public String tanslate();
}

class Adapter implements Translator{
    private Speaker speaker;

    public Adapter(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public String tanslate() {
        String result = speaker.speak();
        //翻译
        return result;
    }
}

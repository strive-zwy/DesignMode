package com.zwy.day3;

/**
 * @Author ：zwy
 * @Date ：2021/1/13 16:18
 * @Version ：1.0
 * @Description ：设计模式 - 8、外观模式
 **/

public class FacadePattern {
    public static void main(String[] args) {
        System.out.println(new Facade().prove());;
    }
}

class SubFlow1{
    boolean isTrue(){
        return true;
    }
}
class SubFlow2{
    boolean isOk(){
        return true;
    }
}
class SubFlow3{
    boolean isGoodMan(){
        return true;
    }
}

class Facade{
    SubFlow1 s1 = new SubFlow1();
    SubFlow2 s2 = new SubFlow2();
    SubFlow3 s3 = new SubFlow3();

    boolean prove(){
        return s1.isTrue()&&s2.isOk()&&s3.isGoodMan();
    }
}

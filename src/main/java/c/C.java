package c;

import a.B;

/**
 * @Author layman
 * @Date 2021/3/4 15:25
 */
public class C extends B {

    public static void main(String[] args) {
        /*B b = new B();
        b.foo()*/

    }

    public void f(){
        // 通过super使用父类的protected方法
        super.foo();
        foo();
    }
}

package org.example.builder.example1;

/**
 * 建造者模式说明：
 * 1. 可以直接用lombok 的 <code>@Builder</code> 注解来实现
 * 2. 主要就是链式调用，对于构造器参数很多的情况，这种方式，对于每个参数的设置，比较清晰
 * 3. 主要就是静态内部类 <code>Builder</code> 实现链式调用
 *
 */
public class MainDemo {
    public static void main(String[] args) {
        GameCharacter hhy = new GameCharacter.Builder()
                .name("hhy")
                .health(100)
                .armor(100)
                .weapon(500)
                .build();
        System.out.println(hhy.toString());
    }
}

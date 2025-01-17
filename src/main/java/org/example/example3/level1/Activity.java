package org.example.example3.level1;

/**
 * 别关注太多：问题有2
 * 1. 构造器繁杂
 * 2. 某些组件构造，有依赖关系（或者说顺序）
 * -> 考虑用建造者 builder 重构
 */
public class Activity implements ActivityInterface{
    private String type;
    private Long id;
    private String name;
    private Integer scene;
    private String material;

    public Activity(String type0) {
        this.type = type0;

        if ("period".equals(type0)) {
            id = 0L;
        }
    }

    public Activity(String type0, Long id0) {
        this.type = type0;
        this.id = id0;
    }

    public Activity(String type0, Long id0, Integer scene0) {
        this.type = type0;
        this.id = id0;
        this.scene = scene0;
    }

    public Activity(String type0, String name, Integer scene0, String material0) {
        this.type = type0;
        this.scene = scene0;
        this.material = material0;

        // name构建依赖于活动type
        if ("period".equals(type0)) {
            this.id = 0L;
            this.name = "period" + name;
        }
        else {
            this.name = "normal" + name;
        }
    }

    @Override
    public void participate(Long userId) {

    }
}

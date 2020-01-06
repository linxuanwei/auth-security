package org.seven.domain;

/**
 * @author Seven.Lin
 * @date 2020/1/6 15:56
 */
public enum GenderEnum {
    BOY("男", "boy"), GIRL("女", "girl"), UNKNOW("未知", "unknow");

    private String name;
    private String index;

    GenderEnum(String name, String index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public static GenderEnum getGender(String i) {
        for (GenderEnum g : GenderEnum.values()) {
            if (i.equals(g.getIndex())) {
                return g;
            }
        }
        return null;
    }

}

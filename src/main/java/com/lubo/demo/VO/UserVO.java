package com.lubo.demo.VO;

/**
 * @Author wangyifan
 * @Create 2019/10/22 10:15 AM
 */
public class UserVO {

    Integer id;
    String name;

    public UserVO() {

    }

    public UserVO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

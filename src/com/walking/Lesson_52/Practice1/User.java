package com.walking.Lesson_52.Practice1;

import java.util.List;

public class User {

    private Integer userId;
    private List<Integer> integerList;

    public User(Integer userId, List<Integer> integerList) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

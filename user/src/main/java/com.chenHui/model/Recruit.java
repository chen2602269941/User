package com.chenHui.model;
/*招聘*/
public class Recruit {
    private Integer recruit_id;
    private String recruit_position;//职位
    private String recruit_job;//职务
    private String recruit_technology;//所需技术
    private Double recruit_wages;//工资
    private Integer recruit_requireNum;//需要人数


    public Recruit() {
    }

    public Integer getRecruit_id() {
        return recruit_id;
    }

    public void setRecruit_id(Integer recruit_id) {
        this.recruit_id = recruit_id;
    }

    public String getRecruit_position() {
        return recruit_position;
    }

    public void setRecruit_position(String recruit_position) {
        this.recruit_position = recruit_position;
    }

    public String getRecruit_job() {
        return recruit_job;
    }

    public void setRecruit_job(String recruit_job) {
        this.recruit_job = recruit_job;
    }

    public String getRecruit_technology() {
        return recruit_technology;
    }

    public void setRecruit_technology(String recruit_technology) {
        this.recruit_technology = recruit_technology;
    }

    public Double getRecruit_wages() {
        return recruit_wages;
    }

    public void setRecruit_wages(Double recruit_wages) {
        this.recruit_wages = recruit_wages;
    }

    public Integer getRecruit_requireNum() {
        return recruit_requireNum;
    }

    public void setRecruit_requireNum(Integer recruit_requireNum) {
        this.recruit_requireNum = recruit_requireNum;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "recruit_id=" + recruit_id +
                ", recruit_position='" + recruit_position + '\'' +
                ", recruit_job='" + recruit_job + '\'' +
                ", recruit_technology='" + recruit_technology + '\'' +
                ", recruit_wages=" + recruit_wages +
                ", recruit_requireNum=" + recruit_requireNum +
                '}';
    }
}

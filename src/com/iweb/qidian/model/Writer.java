package com.iweb.qidian.model;

import java.sql.Timestamp;

public class Writer {
    private Timestamp createtime;
    private Integer issign;
   private  String waccount;
    private String wname;


    private Integer wno;
    private String wpasswd;

    public String getWpasswd() {
        return wpasswd;
    }

    public void setWpasswd(String wpasswd) {
        this.wpasswd = wpasswd;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Integer getIssign() {
        return issign;
    }

    public void setIssign(Integer issign) {
        this.issign = issign;
    }

    public String getWaccount() {
        return waccount;
    }

    public void setWaccount(String waccount) {
        this.waccount = waccount;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public Integer getWno() {
        return wno;
    }

    public void setWno(Integer wno) {
        this.wno = wno;
    }


}

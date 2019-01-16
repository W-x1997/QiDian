package com.iweb.qidian.model;

import java.sql.Time;
import java.sql.Timestamp;

public class Chapter {
    private Integer bno;
    private String chname;
   private  Integer chno;
   private String churl;
   private Timestamp createtime;
   private Integer nextid;

    public String getChname() {
        return chname;
    }

    public Integer getChno() {
        return chno;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public Integer getNextid() {
        return nextid;
    }

    public Integer getPreid() {
        return preid;
    }

    public Integer getWordcount() {
        return wordcount;
    }

    private Integer preid;
    private Integer vno;
    private Integer wordcount;

    public Integer getBno() {
        return bno;
    }

    public void setBno(Integer bno) {
        this.bno = bno;
    }



    public void setChname(String chname) {
        this.chname = chname;
    }



    public void setChno(Integer chno) {
        this.chno = chno;
    }

    public String getChurl() {
        return churl;
    }

    public void setChurl(String churl) {
        this.churl = churl;
    }



    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }



    public void setNextid(Integer nextid) {
        this.nextid = nextid;
    }



    public void setPreid(Integer preid) {
        this.preid = preid;
    }

    public Integer getVno() {
        return vno;
    }

    public void setVno(Integer vno) {
        this.vno = vno;
    }



    public void setWordcount(Integer wordcount) {
        this.wordcount = wordcount;
    }
}

package com.iweb.qidian.model;

import java.sql.Timestamp;

public class Volume {
    private Integer bno;

    private  Integer chaptercount;

    private Timestamp createtime;
    private String vname;
    private Integer vno;
    private Integer wordcount;

    public Integer getBno() {
        return bno;
    }

    public void setBno(Integer bno) {
        this.bno = bno;
    }

    public Integer getChaptercount() {
        return chaptercount;
    }

    public void setChaptercount(Integer chaptercount) {
        this.chaptercount = chaptercount;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public Integer getVno() {
        return vno;
    }

    public void setVno(Integer vno) {
        this.vno = vno;
    }

    public Integer getWordcount() {
        return wordcount;
    }

    public void setWordcount(Integer wordcount) {
        this.wordcount = wordcount;
    }
}

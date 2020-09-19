package com.sjz.management.entity.query;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class JournalQuery
{
    private String journalName;

    /**
     * 期刊作者
     */
    private String journalAuthor;


    private Date begin;


    private Date end;

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public String getJournalAuthor() {
        return journalAuthor;
    }

    public void setJournalAuthor(String journalAuthor) {
        this.journalAuthor = journalAuthor;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "JournalQuery{" +
                "journalName='" + journalName + '\'' +
                ", journalAuthor='" + journalAuthor + '\'' +
                ", begin=" + begin +
                ", end=" + end +
                '}';
    }
}

package com.rawsanj.springdata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Sanjay on 9/11/2016.
 */
@Entity
public class GroupChatHeartBeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date heartBeatTime;

    private String url;

    public GroupChatHeartBeat() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getHeartBeatTime() {
        return heartBeatTime;
    }

    public void setHeartBeatTime(Date heartBeatTime) {
        this.heartBeatTime = heartBeatTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GroupChatHeartBeat(Date heartBeatTime, String url) {
        this.heartBeatTime = heartBeatTime;
        this.url = url;
    }

    @Override
    public String toString() {
        return "GroupChatHeartBeat{" +
                "id=" + id +
                ", heartBeatTime=" + heartBeatTime +
                ", url='" + url + '\'' +
                '}';
    }
}

package com.spring.gateway.persistent.entity;

import java.util.Date;

/**
 * Created by Steven on 2017/2/14.
 */
public class GroovyScript {

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public Date getLastUpdateTime() {
        return last_update_time;
    }

    public void setLastUpdateTime(Date last_update_time) {
        this.last_update_time = last_update_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String script;

    private Date last_update_time;

    private int id;

    public String getScriptName() {
        return script_name;
    }

    public void setScriptName(String script_name) {
        this.script_name = script_name;
    }


    private String script_name;


    private boolean is_active;

    private String hash_code;




}
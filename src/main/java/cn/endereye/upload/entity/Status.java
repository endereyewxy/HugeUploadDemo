package cn.endereye.upload.entity;

import lombok.Data;

@Data
public class Status {
    private int    uuid;
    private String name;
    private String time;
    private int    finishCount;
    private int    remainCount;

    public void completeOne() {
        finishCount++;
        remainCount--;
    }
}

package com.wang.p2p.base.domain;

public class SystemDictionary extends BaseDomain{
    private String sn ;//数据字典分类编码
    private String title ;//数据字典分类名称

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

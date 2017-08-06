package com.wang.p2p.base.domain;

public class SystemDictionaryItem extends BaseDomain{
    private Long parentId;//数据字典明细对应的分类id
    private String title;//数据字典明细显示名称
    private int sequence;//数据字典明细在该分类中的排序


    public Long getParentId() {
        return parentId;
    }
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getSequence() {
        return sequence;
    }
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}

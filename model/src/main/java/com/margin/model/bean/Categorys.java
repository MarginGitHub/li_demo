package com.margin.model.bean;

import java.util.List;

/**
 * Created by margin on 17-9-23.
 */

public class Categorys {

    /**
     * resultCode : 1
     * resultMsg : success
     * reqId : 20228065-eef4-4a54-8426-31b663482cb0
     * systemTime : 1492218570221
     * categoryList : [{"categoryId":"4","name":"娱乐","color":"#E966AE"},{"categoryId":"1","name":"社会","color":"#F04A50"}]
     */

    private int resultCode;
    private String resultMsg;
    private String reqId;
    private String systemTime;
    private List<CategoryItem> categoryList;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }

    public List<CategoryItem> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CategoryItem> categoryList) {
        this.categoryList = categoryList;
    }

    public static class CategoryItem {
        /**
         * categoryId : 4
         * name : 娱乐
         * color : #E966AE
         */

        private String categoryId;
        private String name;
        private String color;

        public String getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}

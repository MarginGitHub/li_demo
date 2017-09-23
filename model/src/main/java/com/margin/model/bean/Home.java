package com.margin.model.bean;

import java.util.List;

/**
 * Created by margin on 17-9-23.
 */

public class Home {

    /**
     * resultCode : 1
     * resultMsg : success
     * reqId : b79c9436-4d59-4452-a7ad-20836d15b8ab
     * systemTime : 1492218827264
     * areaList : [{"area_id":"100001","expInfo":{"algorighm_exp_id":"","front_exp_id":"0","s_value":"b79c9436-4d59-4452-a7ad-20836d15b8ab_2153673381279278"}}]
     * dataList : [{"nodeType":"1","nodeName":"头条","isOrder":"","nodeLogo":"","nodeDesc":"","moreId":"","contList":[{"contId":"1064396","name":"周末推片：速8与西游的王牌之战！","pic":"http://image.pearvideo.com/cont/20170414/cont-1064396-10256904.jpg","nodeInfo":{"nodeId":"18","name":"文娱小队长","logoImg":"http://image1.pearvideo.com/node/18-10027897-logo.jpg"}}]}]
     */

    private String resultCode;
    private String resultMsg;
    private String reqId;
    private String systemTime;
    private List<AreaListBean> areaList;
    private List<DataListBean> dataList;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
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

    public List<AreaListBean> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<AreaListBean> areaList) {
        this.areaList = areaList;
    }

    public List<DataListBean> getDataList() {
        return dataList;
    }

    public void setDataList(List<DataListBean> dataList) {
        this.dataList = dataList;
    }

    public static class AreaListBean {
        /**
         * area_id : 100001
         * expInfo : {"algorighm_exp_id":"","front_exp_id":"0","s_value":"b79c9436-4d59-4452-a7ad-20836d15b8ab_2153673381279278"}
         */

        private String area_id;
        private ExpInfoBean expInfo;

        public String getArea_id() {
            return area_id;
        }

        public void setArea_id(String area_id) {
            this.area_id = area_id;
        }

        public ExpInfoBean getExpInfo() {
            return expInfo;
        }

        public void setExpInfo(ExpInfoBean expInfo) {
            this.expInfo = expInfo;
        }

        public static class ExpInfoBean {
            /**
             * algorighm_exp_id :
             * front_exp_id : 0
             * s_value : b79c9436-4d59-4452-a7ad-20836d15b8ab_2153673381279278
             */

            private String algorighm_exp_id;
            private String front_exp_id;
            private String s_value;

            public String getAlgorighm_exp_id() {
                return algorighm_exp_id;
            }

            public void setAlgorighm_exp_id(String algorighm_exp_id) {
                this.algorighm_exp_id = algorighm_exp_id;
            }

            public String getFront_exp_id() {
                return front_exp_id;
            }

            public void setFront_exp_id(String front_exp_id) {
                this.front_exp_id = front_exp_id;
            }

            public String getS_value() {
                return s_value;
            }

            public void setS_value(String s_value) {
                this.s_value = s_value;
            }
        }
    }

    public static class DataListBean {
        /**
         * nodeType : 1
         * nodeName : 头条
         * isOrder :
         * nodeLogo :
         * nodeDesc :
         * moreId :
         * contList : [{"contId":"1064396","name":"周末推片：速8与西游的王牌之战！","pic":"http://image.pearvideo.com/cont/20170414/cont-1064396-10256904.jpg","nodeInfo":{"nodeId":"18","name":"文娱小队长","logoImg":"http://image1.pearvideo.com/node/18-10027897-logo.jpg"}}]
         */

        private String nodeType;
        private String nodeName;
        private String isOrder;
        private String nodeLogo;
        private String nodeDesc;
        private String moreId;
        private List<ContListBean> contList;

        public String getNodeType() {
            return nodeType;
        }

        public void setNodeType(String nodeType) {
            this.nodeType = nodeType;
        }

        public String getNodeName() {
            return nodeName;
        }

        public void setNodeName(String nodeName) {
            this.nodeName = nodeName;
        }

        public String getIsOrder() {
            return isOrder;
        }

        public void setIsOrder(String isOrder) {
            this.isOrder = isOrder;
        }

        public String getNodeLogo() {
            return nodeLogo;
        }

        public void setNodeLogo(String nodeLogo) {
            this.nodeLogo = nodeLogo;
        }

        public String getNodeDesc() {
            return nodeDesc;
        }

        public void setNodeDesc(String nodeDesc) {
            this.nodeDesc = nodeDesc;
        }

        public String getMoreId() {
            return moreId;
        }

        public void setMoreId(String moreId) {
            this.moreId = moreId;
        }

        public List<ContListBean> getContList() {
            return contList;
        }

        public void setContList(List<ContListBean> contList) {
            this.contList = contList;
        }

        public static class ContListBean {
            /**
             * contId : 1064396
             * name : 周末推片：速8与西游的王牌之战！
             * pic : http://image.pearvideo.com/cont/20170414/cont-1064396-10256904.jpg
             * nodeInfo : {"nodeId":"18","name":"文娱小队长","logoImg":"http://image1.pearvideo.com/node/18-10027897-logo.jpg"}
             */

            private String contId;
            private String name;
            private String pic;
            private NodeInfoBean nodeInfo;

            public String getContId() {
                return contId;
            }

            public void setContId(String contId) {
                this.contId = contId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public NodeInfoBean getNodeInfo() {
                return nodeInfo;
            }

            public void setNodeInfo(NodeInfoBean nodeInfo) {
                this.nodeInfo = nodeInfo;
            }

            public static class NodeInfoBean {
                /**
                 * nodeId : 18
                 * name : 文娱小队长
                 * logoImg : http://image1.pearvideo.com/node/18-10027897-logo.jpg
                 */

                private String nodeId;
                private String name;
                private String logoImg;

                public String getNodeId() {
                    return nodeId;
                }

                public void setNodeId(String nodeId) {
                    this.nodeId = nodeId;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getLogoImg() {
                    return logoImg;
                }

                public void setLogoImg(String logoImg) {
                    this.logoImg = logoImg;
                }
            }
        }
    }
}

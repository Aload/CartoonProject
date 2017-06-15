package com.autism.timeclub.splash;

/**
 * Author：i5 on 2017/6/14 17:58
 * Used:Timeclub
 */
public class LanchBean {
    /**
     * ad : {"adsImg":"https://videoimg.ifenghui.com/adsImg/2017/06/14/Whs6YSkfbw.jpg","adsTitle":"","adsType":5,"channel":"","content":"By 用户","createTime":"2017-06-14 17:32:06","flag_id":"1","id":162,"imgPath":"https://videoimg.ifenghui.com/adsImg/2017/06/14/Kz2XMMKxTW.jpg","orderBy":0,"platform":"1,2","pos":0,"status":1,"url":"313712","useType":"2","version":""}
     */

    private AdBean ad;

    public AdBean getAd() {
        return ad;
    }

    public void setAd(AdBean ad) {
        this.ad = ad;
    }

    public static class AdBean {
        /**
         * adsImg : https://videoimg.ifenghui.com/adsImg/2017/06/14/Whs6YSkfbw.jpg
         * adsTitle :
         * adsType : 5
         * channel :
         * content : By 用户
         * createTime : 2017-06-14 17:32:06
         * flag_id : 1
         * id : 162
         * imgPath : https://videoimg.ifenghui.com/adsImg/2017/06/14/Kz2XMMKxTW.jpg
         * orderBy : 0
         * platform : 1,2
         * pos : 0
         * status : 1
         * url : 313712
         * useType : 2
         * version :
         */

        private String adsImg;
        private String adsTitle;
        private int adsType;
        private String channel;
        private String content;
        private String createTime;
        private String flag_id;
        private int id;
        private String imgPath;
        private int orderBy;
        private String platform;
        private int pos;
        private int status;
        private String url;
        private String useType;
        private String version;

        public String getAdsImg() {
            return adsImg;
        }

        public void setAdsImg(String adsImg) {
            this.adsImg = adsImg;
        }

        public String getAdsTitle() {
            return adsTitle;
        }

        public void setAdsTitle(String adsTitle) {
            this.adsTitle = adsTitle;
        }

        public int getAdsType() {
            return adsType;
        }

        public void setAdsType(int adsType) {
            this.adsType = adsType;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getFlag_id() {
            return flag_id;
        }

        public void setFlag_id(String flag_id) {
            this.flag_id = flag_id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImgPath() {
            return imgPath;
        }

        public void setImgPath(String imgPath) {
            this.imgPath = imgPath;
        }

        public int getOrderBy() {
            return orderBy;
        }

        public void setOrderBy(int orderBy) {
            this.orderBy = orderBy;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public int getPos() {
            return pos;
        }

        public void setPos(int pos) {
            this.pos = pos;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUseType() {
            return useType;
        }

        public void setUseType(String useType) {
            this.useType = useType;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }
}

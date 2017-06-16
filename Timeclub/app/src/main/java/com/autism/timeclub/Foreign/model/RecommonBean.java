package com.autism.timeclub.Foreign.model;

import java.util.List;

/**
 * Author：autism on 2017/6/15 16:58
 * Used:Timeclub
 */
public class RecommonBean {

    private List<AdsBean> ads;
    private List<GroupBean> group;
    private List<OldAdsBean> oldAds;

    public List<AdsBean> getAds() {
        return ads;
    }

    public void setAds(List<AdsBean> ads) {
        this.ads = ads;
    }

    public List<GroupBean> getGroup() {
        return group;
    }

    public void setGroup(List<GroupBean> group) {
        this.group = group;
    }

    public List<OldAdsBean> getOldAds() {
        return oldAds;
    }

    public void setOldAds(List<OldAdsBean> oldAds) {
        this.oldAds = oldAds;
    }

    public static class AdsBean {
        /**
         * id : 286
         * adsImg : https://videoimg.ifenghui.com/adsImg/2017/06/12/sE6GcAxWsJ.png?x-oss-process=image/resize,m_fill,w_828,h_331,limit_0/auto-orient,1/quality,Q_90/format,jpg
         * content : 锋绘友人帐
         * adsType : 1
         * url : http://dongman.ifenghui.com/index.php?m=Index&a=pagemake&id=133
         * orderBy : 100
         * createTime : 2017-06-12 11:26:51
         * status : 1
         * adsTitle : 锋绘友人帐
         * channel :
         * pos : 0
         * useType : 1
         * imgPath : https://videoimg.ifenghui.com/adsImg/2017/06/12/aMRHd8wTER.png?x-oss-process=image/resize,m_fill,w_1125,h_450,limit_d0/auto-orient,1/quality,Q_90/format,jpg
         * platform : 1,2
         * version :
         * flag_id : 1
         * flag : {"id":1,"msg":"活动","colorType":5}
         */

        private int id;
        private String adsImg;
        private String content;
        private int adsType;
        private String url;
        private int orderBy;
        private String createTime;
        private int status;
        private String adsTitle;
        private String channel;
        private int pos;
        private String useType;
        private String imgPath;
        private String platform;
        private String version;
        private String flag_id;
        private FlagBean flag;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAdsImg() {
            return adsImg;
        }

        public void setAdsImg(String adsImg) {
            this.adsImg = adsImg;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getAdsType() {
            return adsType;
        }

        public void setAdsType(int adsType) {
            this.adsType = adsType;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getOrderBy() {
            return orderBy;
        }

        public void setOrderBy(int orderBy) {
            this.orderBy = orderBy;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getAdsTitle() {
            return adsTitle;
        }

        public void setAdsTitle(String adsTitle) {
            this.adsTitle = adsTitle;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public int getPos() {
            return pos;
        }

        public void setPos(int pos) {
            this.pos = pos;
        }

        public String getUseType() {
            return useType;
        }

        public void setUseType(String useType) {
            this.useType = useType;
        }

        public String getImgPath() {
            return imgPath;
        }

        public void setImgPath(String imgPath) {
            this.imgPath = imgPath;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getFlag_id() {
            return flag_id;
        }

        public void setFlag_id(String flag_id) {
            this.flag_id = flag_id;
        }

        public FlagBean getFlag() {
            return flag;
        }

        public void setFlag(FlagBean flag) {
            this.flag = flag;
        }

        public static class FlagBean {
            /**
             * id : 1
             * msg : 活动
             * colorType : 5
             */

            private int id;
            private String msg;
            private int colorType;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMsg() {
                return msg;
            }

            public void setMsg(String msg) {
                this.msg = msg;
            }

            public int getColorType() {
                return colorType;
            }

            public void setColorType(int colorType) {
                this.colorType = colorType;
            }
        }
    }

    public static class GroupBean {
        /**
         * id : 1
         * name : 锋绘娘推荐
         * status : 1
         * style : 1
         * icon : https://videooss.ifenghui.com/homeGroupIcon/2017/06/07/kcCXTEEfbz.png
         * useType : 1
         * type : 103
         * webIcon : 2016/11/14/1479102618141.png
         * is_show : 1
         * groupId : 1
         * statuss : [{"status":{"id":325998,"userId":29,"targetType":1,"targetValue":440324,"content":"诚哥不可能出轨，诚哥只可能出柜！【萌娘说-80】","createTime":"2017-06-14 18:41:00","likeCount":58,"commentCount":7,"restatusId":0,"collectCount":4,"isNew":0,"catId":"0","statusClick":4061,"baseClick":"3859","status":1,"originalPic":"https://videoimg.ifenghui.com/status/2017/06/14/cE5TQbbNxZ.jpg?x-oss-process=image/resize,m_fill,w_640,h_360,limit_1/auto-orient,0/quality,q_90","topic":"","giftCount":0,"shareCount":0,"details":"","comment":"","imgPath":"","blurredImg":"https://videoimg.ifenghui.com/status/2017/06/14/cE5TQbbNxZ.jpg?x-oss-process=image/resize,m_fill,w_240,h_240,limit_1/auto-orient,0/quality,q_90","thumbImg":"https://videoimg.ifenghui.com/status/2017/06/14/cE5TQbbNxZ.jpg?x-oss-process=image/resize,m_lfit,w_240,limit_1/auto-orient,0/quality,q_85/format,jpg","data":{"id":440324,"fileName":"https://videooss.ifenghui.com/video/2017/06/14/4ZDbkXjZnp.mp4","createTime":"2017-06-14 18:41:00","typeId":10,"commentCount":0,"recommentCount":0,"audio":null,"bmg":null,"storyCode":null,"status":10,"userId":29,"storyId":31804,"subjectId":0,"intro":"诚哥不可能出轨，诚哥只可能出柜！【萌娘说-80】","videoLength":"453","isPublish":1,"isDel":0,"videoClick":14,"baseClick":0,"likeSum":53,"classId":0,"clubId":0,"topic":"","chinaOnly":"0","storyVideoNum":"80","likeCount":53,"imgPath":"https://videooss.ifenghui.com/video/2017/06/14/4ZDbkXjZnp.jpg","blurredImg":"https://videoimg.ifenghui.com/video/2017/06/14/4ZDbkXjZnp.jpg?x-oss-process=image/resize,m_fill,w_240,h_240,limit_1/auto-orient,0/quality,q_90","storCode":null,"isPubish":0}}},{"status":{"id":325874,"userId":188242,"targetType":1,"targetValue":440312,"content":"画江湖之杯莫停28父子相残","createTime":"2017-06-14 12:02:54","likeCount":7,"commentCount":3,"restatusId":0,"collectCount":1,"isNew":0,"catId":"0","statusClick":401,"baseClick":"367","status":1,"originalPic":"https://videoimg.ifenghui.com/status/2017/06/14/dsHnbihsYY.jpg?x-oss-process=image/resize,m_fill,w_640,h_360,limit_1/auto-orient,0/quality,q_90","topic":"","giftCount":0,"shareCount":1,"details":"","comment":"","imgPath":"","blurredImg":"https://videoimg.ifenghui.com/status/2017/06/14/dsHnbihsYY.jpg?x-oss-process=image/resize,m_fill,w_240,h_240,limit_1/auto-orient,0/quality,q_90","thumbImg":"https://videoimg.ifenghui.com/status/2017/06/14/dsHnbihsYY.jpg?x-oss-process=image/resize,m_lfit,w_240,limit_1/auto-orient,0/quality,q_85/format,jpg","data":{"id":440312,"fileName":"https://videooss.ifenghui.com/video/2017/06/14/P544YyfxDi.mp4","createTime":"2017-06-14 12:02:54","typeId":10,"commentCount":0,"recommentCount":0,"audio":null,"bmg":null,"storyCode":null,"status":10,"userId":188242,"storyId":29266,"subjectId":0,"intro":"画江湖之杯莫停28父子相残","videoLength":"1294","isPublish":1,"isDel":0,"videoClick":1,"baseClick":0,"likeSum":5,"classId":0,"clubId":0,"topic":"","chinaOnly":"0","storyVideoNum":"28","likeCount":5,"imgPath":"https://videooss.ifenghui.com/video/2017/06/14/P544YyfxDi.jpg","blurredImg":"https://videoimg.ifenghui.com/video/2017/06/14/P544YyfxDi.jpg?x-oss-process=image/resize,m_fill,w_240,h_240,limit_1/auto-orient,0/quality,q_90","storCode":null,"isPubish":0}}},{"status":{"id":325923,"userId":260105,"targetType":2,"targetValue":945774,"content":"《魔法咪路咪路》\n日语：ミルモでポン!","createTime":"2017-06-14 14:27:55","likeCount":29,"commentCount":10,"restatusId":0,"collectCount":2,"isNew":0,"catId":"0","statusClick":2654,"baseClick":"2588","status":1,"originalPic":"https://videoimg.ifenghui.com/status/2017/06/14/9045769c659d462e8125d1821604562c.jpg?x-oss-process=image/resize,m_fill,w_640,h_360,limit_1/auto-orient,0/quality,q_90","topic":"","giftCount":0,"shareCount":0,"details":"わがまま☆フェアリー ミルモでポン!\n咪路 (ミルモ)「黄色头发的」\n莉露姆 (リルム)「绿色头发的」\n姆路（ムルモ)「粉色头发的」\n亞西吉（ヤシチ，ゆきじ）「黑色头发的」\n大家都知道这些可爱的小精灵吗？❛∨❛?\n《黄毛，绿毛，粉毛，黑毛》","comment":"","imgPath":"","blurredImg":"https://videoimg.ifenghui.com/status/2017/06/14/9045769c659d462e8125d1821604562c.jpg?x-oss-process=image/resize,m_fill,w_240,h_240,limit_1/auto-orient,0/quality,q_90","thumbImg":"https://videoimg.ifenghui.com/status/2017/06/14/9045769c659d462e8125d1821604562c.jpg?x-oss-process=image/resize,m_lfit,w_240,limit_1/auto-orient,0/quality,q_85/format,jpg","data":{"id":945774,"imgPath":"https://videoimg.ifenghui.com/userBack/90/9045769c659d462e8125d1821604562c.jpg","userId":260105,"status":1,"createTime":"2017-06-14 14:27:55","name":"《魔法咪路咪路》\n日语：ミルモでポン!","type":1,"rateType":4,"width":1080,"height":810,"imgClick":10,"commentCount":0,"likeCount":0,"filePath":"https://videooss.ifenghui.com/userBack/b1/b1103ab1507b4e7cb45ef2341a366027.txt","clubId":0,"paintVer":"3","blurredImg":"https://videoimg.ifenghui.com/userBack/90/9045769c659d462e8125d1821604562c.jpg?x-oss-process=image/resize,m_fill,w_240,h_240,limit_1/auto-orient,0/quality,q_90","topic":"","shareUrl":"https://dongman.ifenghui.com/index.php?m=Index&a=shareImage&vid=945774","ver":3}}},{"status":{"id":326062,"userId":359975,"targetType":1,"targetValue":440331,"content":"《达拉崩吧》【阿影音乐搬运】","createTime":"2017-06-14 20:10:26","likeCount":16,"commentCount":2,"restatusId":0,"collectCount":0,"isNew":0,"catId":"37","statusClick":1795,"baseClick":"1715","status":1,"originalPic":"https://videoimg.ifenghui.com/status/2017/06/14/3c54dc2d63adfb0c831c6ed4fa77cf05.jpg?x-oss-process=image/resize,m_fill,w_640,h_360,limit_1/auto-orient,0/quality,q_90","topic":"","giftCount":0,"shareCount":0,"details":"魔性《达拉崩吧》欢迎品尝|。\u2022ω\u2022)っ♪\n(声音合成，鬼畜，魔性过敏者勿食)","comment":"","imgPath":"","blurredImg":"https://videoimg.ifenghui.com/status/2017/06/14/3c54dc2d63adfb0c831c6ed4fa77cf05.jpg?x-oss-process=image/resize,m_fill,w_240,h_240,limit_1/auto-orient,0/quality,q_90","thumbImg":"https://videoimg.ifenghui.com/status/2017/06/14/3c54dc2d63adfb0c831c6ed4fa77cf05.jpg?x-oss-process=image/resize,m_lfit,w_240,limit_1/auto-orient,0/quality,q_85/format,jpg","data":{"id":440331,"fileName":"https://videooss.ifenghui.com/video/2017/06/14/3c54dc2d63adfb0c831c6ed4fa77cf05.mp4","createTime":"2017-06-14 20:10:24","typeId":10,"commentCount":0,"recommentCount":0,"audio":null,"bmg":null,"storyCode":null,"status":10,"userId":359975,"storyId":-1,"subjectId":5,"intro":"《达拉崩吧》【阿影音乐搬运】","videoLength":"216","isPublish":1,"isDel":0,"videoClick":14,"baseClick":0,"likeSum":10,"classId":37,"clubId":0,"topic":"","chinaOnly":"0","storyVideoNum":"0","likeCount":10,"imgPath":"https://videooss.ifenghui.com/video/2017/06/14/3c54dc2d63adfb0c831c6ed4fa77cf05.jpg","blurredImg":"https://videoimg.ifenghui.com/video/2017/06/14/3c54dc2d63adfb0c831c6ed4fa77cf05.jpg?x-oss-process=image/resize,m_fill,w_240,h_240,limit_1/auto-orient,0/quality,q_90","storCode":null,"isPubish":0}}}]
         * ads : []
         */

        private String id;
        private String name;
        private String status;
        private int style;
        private String icon;
        private String useType;
        private String type;
        private String webIcon;
        private String is_show;
        private int groupId;
        private List<StatussBean> statuss;
        private List<RecommonAdBean> ads;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getStyle() {
            return style;
        }

        public void setStyle(int style) {
            this.style = style;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getUseType() {
            return useType;
        }

        public void setUseType(String useType) {
            this.useType = useType;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getWebIcon() {
            return webIcon;
        }

        public void setWebIcon(String webIcon) {
            this.webIcon = webIcon;
        }

        public String getIs_show() {
            return is_show;
        }

        public void setIs_show(String is_show) {
            this.is_show = is_show;
        }

        public int getGroupId() {
            return groupId;
        }

        public void setGroupId(int groupId) {
            this.groupId = groupId;
        }

        public List<StatussBean> getStatuss() {
            return statuss;
        }

        public void setStatuss(List<StatussBean> statuss) {
            this.statuss = statuss;
        }

        public List<RecommonAdBean> getAds() {
            return ads;
        }

        public void setAds(List<RecommonAdBean> ads) {
            this.ads = ads;
        }

        public static class StatussBean {
            /**
             * status : {"id":325998,"userId":29,"targetType":1,"targetValue":440324,"content":"诚哥不可能出轨，诚哥只可能出柜！【萌娘说-80】","createTime":"2017-06-14 18:41:00","likeCount":58,"commentCount":7,"restatusId":0,"collectCount":4,"isNew":0,"catId":"0","statusClick":4061,"baseClick":"3859","status":1,"originalPic":"https://videoimg.ifenghui.com/status/2017/06/14/cE5TQbbNxZ.jpg?x-oss-process=image/resize,m_fill,w_640,h_360,limit_1/auto-orient,0/quality,q_90","topic":"","giftCount":0,"shareCount":0,"details":"","comment":"","imgPath":"","blurredImg":"https://videoimg.ifenghui.com/status/2017/06/14/cE5TQbbNxZ.jpg?x-oss-process=image/resize,m_fill,w_240,h_240,limit_1/auto-orient,0/quality,q_90","thumbImg":"https://videoimg.ifenghui.com/status/2017/06/14/cE5TQbbNxZ.jpg?x-oss-process=image/resize,m_lfit,w_240,limit_1/auto-orient,0/quality,q_85/format,jpg","data":{"id":440324,"fileName":"https://videooss.ifenghui.com/video/2017/06/14/4ZDbkXjZnp.mp4","createTime":"2017-06-14 18:41:00","typeId":10,"commentCount":0,"recommentCount":0,"audio":null,"bmg":null,"storyCode":null,"status":10,"userId":29,"storyId":31804,"subjectId":0,"intro":"诚哥不可能出轨，诚哥只可能出柜！【萌娘说-80】","videoLength":"453","isPublish":1,"isDel":0,"videoClick":14,"baseClick":0,"likeSum":53,"classId":0,"clubId":0,"topic":"","chinaOnly":"0","storyVideoNum":"80","likeCount":53,"imgPath":"https://videooss.ifenghui.com/video/2017/06/14/4ZDbkXjZnp.jpg","blurredImg":"https://videoimg.ifenghui.com/video/2017/06/14/4ZDbkXjZnp.jpg?x-oss-process=image/resize,m_fill,w_240,h_240,limit_1/auto-orient,0/quality,q_90","storCode":null,"isPubish":0}}
             */

            private StatusBean status;

            public StatusBean getStatus() {
                return status;
            }

            public void setStatus(StatusBean status) {
                this.status = status;
            }

            public static class StatusBean {
                /**
                 * id : 325998
                 * userId : 29
                 * targetType : 1
                 * targetValue : 440324
                 * content : 诚哥不可能出轨，诚哥只可能出柜！【萌娘说-80】
                 * createTime : 2017-06-14 18:41:00
                 * likeCount : 58
                 * commentCount : 7
                 * restatusId : 0
                 * collectCount : 4
                 * isNew : 0
                 * catId : 0
                 * statusClick : 4061
                 * baseClick : 3859
                 * status : 1
                 * originalPic : https://videoimg.ifenghui.com/status/2017/06/14/cE5TQbbNxZ.jpg?x-oss-process=image/resize,m_fill,w_640,h_360,limit_1/auto-orient,0/quality,q_90
                 * topic :
                 * giftCount : 0
                 * shareCount : 0
                 * details :
                 * comment :
                 * imgPath :
                 * blurredImg : https://videoimg.ifenghui.com/status/2017/06/14/cE5TQbbNxZ.jpg?x-oss-process=image/resize,m_fill,w_240,h_240,limit_1/auto-orient,0/quality,q_90
                 * thumbImg : https://videoimg.ifenghui.com/status/2017/06/14/cE5TQbbNxZ.jpg?x-oss-process=image/resize,m_lfit,w_240,limit_1/auto-orient,0/quality,q_85/format,jpg
                 * data : {"id":440324,"fileName":"https://videooss.ifenghui.com/video/2017/06/14/4ZDbkXjZnp.mp4","createTime":"2017-06-14 18:41:00","typeId":10,"commentCount":0,"recommentCount":0,"audio":null,"bmg":null,"storyCode":null,"status":10,"userId":29,"storyId":31804,"subjectId":0,"intro":"诚哥不可能出轨，诚哥只可能出柜！【萌娘说-80】","videoLength":"453","isPublish":1,"isDel":0,"videoClick":14,"baseClick":0,"likeSum":53,"classId":0,"clubId":0,"topic":"","chinaOnly":"0","storyVideoNum":"80","likeCount":53,"imgPath":"https://videooss.ifenghui.com/video/2017/06/14/4ZDbkXjZnp.jpg","blurredImg":"https://videoimg.ifenghui.com/video/2017/06/14/4ZDbkXjZnp.jpg?x-oss-process=image/resize,m_fill,w_240,h_240,limit_1/auto-orient,0/quality,q_90","storCode":null,"isPubish":0}
                 */

                private int id;
                private int userId;
                private int targetType;
                private int targetValue;
                private String content;
                private String createTime;
                private int likeCount;
                private int commentCount;
                private int restatusId;
                private int collectCount;
                private int isNew;
                private String catId;
                private int statusClick;
                private String baseClick;
                private int status;
                private String originalPic;
                private String topic;
                private int giftCount;
                private int shareCount;
                private String details;
                private String comment;
                private String imgPath;
                private String blurredImg;
                private String thumbImg;
                private DataBean data;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public int getTargetType() {
                    return targetType;
                }

                public void setTargetType(int targetType) {
                    this.targetType = targetType;
                }

                public int getTargetValue() {
                    return targetValue;
                }

                public void setTargetValue(int targetValue) {
                    this.targetValue = targetValue;
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

                public int getLikeCount() {
                    return likeCount;
                }

                public void setLikeCount(int likeCount) {
                    this.likeCount = likeCount;
                }

                public int getCommentCount() {
                    return commentCount;
                }

                public void setCommentCount(int commentCount) {
                    this.commentCount = commentCount;
                }

                public int getRestatusId() {
                    return restatusId;
                }

                public void setRestatusId(int restatusId) {
                    this.restatusId = restatusId;
                }

                public int getCollectCount() {
                    return collectCount;
                }

                public void setCollectCount(int collectCount) {
                    this.collectCount = collectCount;
                }

                public int getIsNew() {
                    return isNew;
                }

                public void setIsNew(int isNew) {
                    this.isNew = isNew;
                }

                public String getCatId() {
                    return catId;
                }

                public void setCatId(String catId) {
                    this.catId = catId;
                }

                public int getStatusClick() {
                    return statusClick;
                }

                public void setStatusClick(int statusClick) {
                    this.statusClick = statusClick;
                }

                public String getBaseClick() {
                    return baseClick;
                }

                public void setBaseClick(String baseClick) {
                    this.baseClick = baseClick;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getOriginalPic() {
                    return originalPic;
                }

                public void setOriginalPic(String originalPic) {
                    this.originalPic = originalPic;
                }

                public String getTopic() {
                    return topic;
                }

                public void setTopic(String topic) {
                    this.topic = topic;
                }

                public int getGiftCount() {
                    return giftCount;
                }

                public void setGiftCount(int giftCount) {
                    this.giftCount = giftCount;
                }

                public int getShareCount() {
                    return shareCount;
                }

                public void setShareCount(int shareCount) {
                    this.shareCount = shareCount;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }

                public String getComment() {
                    return comment;
                }

                public void setComment(String comment) {
                    this.comment = comment;
                }

                public String getImgPath() {
                    return imgPath;
                }

                public void setImgPath(String imgPath) {
                    this.imgPath = imgPath;
                }

                public String getBlurredImg() {
                    return blurredImg;
                }

                public void setBlurredImg(String blurredImg) {
                    this.blurredImg = blurredImg;
                }

                public String getThumbImg() {
                    return thumbImg;
                }

                public void setThumbImg(String thumbImg) {
                    this.thumbImg = thumbImg;
                }

                public DataBean getData() {
                    return data;
                }

                public void setData(DataBean data) {
                    this.data = data;
                }

                public static class DataBean {
                    /**
                     * id : 440324
                     * fileName : https://videooss.ifenghui.com/video/2017/06/14/4ZDbkXjZnp.mp4
                     * createTime : 2017-06-14 18:41:00
                     * typeId : 10
                     * commentCount : 0
                     * recommentCount : 0
                     * audio : null
                     * bmg : null
                     * storyCode : null
                     * status : 10
                     * userId : 29
                     * storyId : 31804
                     * subjectId : 0
                     * intro : 诚哥不可能出轨，诚哥只可能出柜！【萌娘说-80】
                     * videoLength : 453
                     * isPublish : 1
                     * isDel : 0
                     * videoClick : 14
                     * baseClick : 0
                     * likeSum : 53
                     * classId : 0
                     * clubId : 0
                     * topic :
                     * chinaOnly : 0
                     * storyVideoNum : 80
                     * likeCount : 53
                     * imgPath : https://videooss.ifenghui.com/video/2017/06/14/4ZDbkXjZnp.jpg
                     * blurredImg : https://videoimg.ifenghui.com/video/2017/06/14/4ZDbkXjZnp.jpg?x-oss-process=image/resize,m_fill,w_240,h_240,limit_1/auto-orient,0/quality,q_90
                     * storCode : null
                     * isPubish : 0
                     */

                    private int id;
                    private String fileName;
                    private String createTime;
                    private int typeId;
                    private int commentCount;
                    private int recommentCount;
                    private Object audio;
                    private Object bmg;
                    private Object storyCode;
                    private int status;
                    private int userId;
                    private int storyId;
                    private int subjectId;
                    private String intro;
                    private String videoLength;
                    private int isPublish;
                    private int isDel;
                    private int videoClick;
                    private int baseClick;
                    private int likeSum;
                    private int classId;
                    private int clubId;
                    private String topic;
                    private String chinaOnly;
                    private String storyVideoNum;
                    private int likeCount;
                    private String imgPath;
                    private String blurredImg;
                    private Object storCode;
                    private int isPubish;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getFileName() {
                        return fileName;
                    }

                    public void setFileName(String fileName) {
                        this.fileName = fileName;
                    }

                    public String getCreateTime() {
                        return createTime;
                    }

                    public void setCreateTime(String createTime) {
                        this.createTime = createTime;
                    }

                    public int getTypeId() {
                        return typeId;
                    }

                    public void setTypeId(int typeId) {
                        this.typeId = typeId;
                    }

                    public int getCommentCount() {
                        return commentCount;
                    }

                    public void setCommentCount(int commentCount) {
                        this.commentCount = commentCount;
                    }

                    public int getRecommentCount() {
                        return recommentCount;
                    }

                    public void setRecommentCount(int recommentCount) {
                        this.recommentCount = recommentCount;
                    }

                    public Object getAudio() {
                        return audio;
                    }

                    public void setAudio(Object audio) {
                        this.audio = audio;
                    }

                    public Object getBmg() {
                        return bmg;
                    }

                    public void setBmg(Object bmg) {
                        this.bmg = bmg;
                    }

                    public Object getStoryCode() {
                        return storyCode;
                    }

                    public void setStoryCode(Object storyCode) {
                        this.storyCode = storyCode;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    public int getUserId() {
                        return userId;
                    }

                    public void setUserId(int userId) {
                        this.userId = userId;
                    }

                    public int getStoryId() {
                        return storyId;
                    }

                    public void setStoryId(int storyId) {
                        this.storyId = storyId;
                    }

                    public int getSubjectId() {
                        return subjectId;
                    }

                    public void setSubjectId(int subjectId) {
                        this.subjectId = subjectId;
                    }

                    public String getIntro() {
                        return intro;
                    }

                    public void setIntro(String intro) {
                        this.intro = intro;
                    }

                    public String getVideoLength() {
                        return videoLength;
                    }

                    public void setVideoLength(String videoLength) {
                        this.videoLength = videoLength;
                    }

                    public int getIsPublish() {
                        return isPublish;
                    }

                    public void setIsPublish(int isPublish) {
                        this.isPublish = isPublish;
                    }

                    public int getIsDel() {
                        return isDel;
                    }

                    public void setIsDel(int isDel) {
                        this.isDel = isDel;
                    }

                    public int getVideoClick() {
                        return videoClick;
                    }

                    public void setVideoClick(int videoClick) {
                        this.videoClick = videoClick;
                    }

                    public int getBaseClick() {
                        return baseClick;
                    }

                    public void setBaseClick(int baseClick) {
                        this.baseClick = baseClick;
                    }

                    public int getLikeSum() {
                        return likeSum;
                    }

                    public void setLikeSum(int likeSum) {
                        this.likeSum = likeSum;
                    }

                    public int getClassId() {
                        return classId;
                    }

                    public void setClassId(int classId) {
                        this.classId = classId;
                    }

                    public int getClubId() {
                        return clubId;
                    }

                    public void setClubId(int clubId) {
                        this.clubId = clubId;
                    }

                    public String getTopic() {
                        return topic;
                    }

                    public void setTopic(String topic) {
                        this.topic = topic;
                    }

                    public String getChinaOnly() {
                        return chinaOnly;
                    }

                    public void setChinaOnly(String chinaOnly) {
                        this.chinaOnly = chinaOnly;
                    }

                    public String getStoryVideoNum() {
                        return storyVideoNum;
                    }

                    public void setStoryVideoNum(String storyVideoNum) {
                        this.storyVideoNum = storyVideoNum;
                    }

                    public int getLikeCount() {
                        return likeCount;
                    }

                    public void setLikeCount(int likeCount) {
                        this.likeCount = likeCount;
                    }

                    public String getImgPath() {
                        return imgPath;
                    }

                    public void setImgPath(String imgPath) {
                        this.imgPath = imgPath;
                    }

                    public String getBlurredImg() {
                        return blurredImg;
                    }

                    public void setBlurredImg(String blurredImg) {
                        this.blurredImg = blurredImg;
                    }

                    public Object getStorCode() {
                        return storCode;
                    }

                    public void setStorCode(Object storCode) {
                        this.storCode = storCode;
                    }

                    public int getIsPubish() {
                        return isPubish;
                    }

                    public void setIsPubish(int isPubish) {
                        this.isPubish = isPubish;
                    }
                }
            }
        }
    }

    public static class OldAdsBean {
        /**
         * id : 136
         * adsImg : https://videoimg.ifenghui.com/adsImg/2016/06/12/575ce21b762b91006560806.jpg?x-oss-process=image/resize,m_fill,w_828,h_331,limit_0/auto-orient,1/quality,Q_90/format,jpg
         * content : 油菜花们的精彩小课堂，一般人才不告诉ta~
         * adsType : 9
         * url : 49
         * orderBy : 0
         * createTime : 2016-06-12 12:16:27
         * status : 2
         * adsTitle : 油菜花小课堂
         * channel :
         * pos : 0
         * useType : 1
         * imgPath : https://videoimg.ifenghui.com/adsImg/2016/06/12/575ce21b7664a1391587265.jpg?x-oss-process=image/resize,m_fill,w_1125,h_450,limit_d0/auto-orient,1/quality,Q_90/format,jpg
         * platform : 1,2
         * version : null
         * flag_id : 0
         */

        private int id;
        private String adsImg;
        private String content;
        private int adsType;
        private String url;
        private int orderBy;
        private String createTime;
        private int status;
        private String adsTitle;
        private String channel;
        private int pos;
        private String useType;
        private String imgPath;
        private String platform;
        private Object version;
        private String flag_id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAdsImg() {
            return adsImg;
        }

        public void setAdsImg(String adsImg) {
            this.adsImg = adsImg;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getAdsType() {
            return adsType;
        }

        public void setAdsType(int adsType) {
            this.adsType = adsType;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getOrderBy() {
            return orderBy;
        }

        public void setOrderBy(int orderBy) {
            this.orderBy = orderBy;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getAdsTitle() {
            return adsTitle;
        }

        public void setAdsTitle(String adsTitle) {
            this.adsTitle = adsTitle;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public int getPos() {
            return pos;
        }

        public void setPos(int pos) {
            this.pos = pos;
        }

        public String getUseType() {
            return useType;
        }

        public void setUseType(String useType) {
            this.useType = useType;
        }

        public String getImgPath() {
            return imgPath;
        }

        public void setImgPath(String imgPath) {
            this.imgPath = imgPath;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public Object getVersion() {
            return version;
        }

        public void setVersion(Object version) {
            this.version = version;
        }

        public String getFlag_id() {
            return flag_id;
        }

        public void setFlag_id(String flag_id) {
            this.flag_id = flag_id;
        }
    }
}

package com.autism.timeclub.Foreign.model;

import java.util.List;

/**
 * Author：autism on 2017/6/22 17:37
 * Used:Timeclub
 */
public class LikeBean {

    /**
     * otherComments : [{"id":1339155,"userId":370080,"targetType":6,"targetValue":330180,"repliedId":0,"content":"6","createTime":"2017-06-22 16:58:30","commentType":0,"likeCount":0,"parentId":0,"floor":7,"isLike":0,"repContent":"","user":{"id":370080,"nick":"兦 ","avatar":"https://q.qlogo.cn/qqapp/1101325372/F46CC3A2A48811562F7D87FFB78D0F6D/100","sex":0,"vip":0,"title":"","userRank":3,"isFollow":0,"isBlack":0,"isHuiyuan":0,"teacherIntro":"","userRankIcon":"https://videooss.ifenghui.com//userRankIcon%2Fmem_vip0.png"}},{"id":1338244,"userId":178294,"targetType":6,"targetValue":330180,"repliedId":0,"content":"好看(｡･ω･｡)ﾉ♡","createTime":"2017-06-22 04:02:37","commentType":0,"likeCount":0,"parentId":0,"floor":6,"isLike":0,"repContent":"","user":{"id":178294,"nick":"黑煞风","avatar":"https://videoimg.ifenghui.com/avatar/2016/04/16/5711f2103faa1.jpg@1e_150w_150h.jpg","sex":1,"vip":0,"title":"","userRank":2,"isFollow":0,"isBlack":0,"isHuiyuan":0,"teacherIntro":"","userRankIcon":"https://videooss.ifenghui.com//userRankIcon%2Fmem_vip0.png"}},{"id":1338214,"userId":91581,"targetType":6,"targetValue":330180,"repliedId":0,"content":"棒棒哒","createTime":"2017-06-22 02:01:36","commentType":0,"likeCount":0,"parentId":0,"floor":5,"isLike":0,"repContent":"","user":{"id":91581,"nick":"® 二次元 小酉","avatar":"https://q.qlogo.cn/qqapp/1101325372/E60AEED7FAE0267FB8F8D796C77D01EF/100","sex":0,"vip":0,"title":"","userRank":1,"isFollow":0,"isBlack":0,"isHuiyuan":0,"teacherIntro":"","userRankIcon":"https://videooss.ifenghui.com//userRankIcon%2Fmem_vip0.png"}},{"id":1338085,"userId":410252,"targetType":6,"targetValue":330180,"repliedId":0,"content":"6","createTime":"2017-06-21 23:00:28","commentType":0,"likeCount":0,"parentId":0,"floor":4,"isLike":0,"repContent":"","user":{"id":410252,"nick":"红月之恋","avatar":"https://wx.qlogo.cn/mmopen/UxCHfWPia5roLark3bwibSV5GNoqQiafA15EyY9afLa4dy1y8FCj3LmrmMN6azFB9tIpMf5ZuyXRnJccCFMgFGYbHIZ4wVwacR5/0","sex":1,"vip":0,"title":"","userRank":1,"isFollow":0,"isBlack":0,"isHuiyuan":0,"teacherIntro":"","userRankIcon":"https://videooss.ifenghui.com//userRankIcon%2Fmem_vip0.png"}},{"id":1337968,"userId":340232,"targetType":6,"targetValue":330180,"repliedId":0,"content":"桌子","createTime":"2017-06-21 21:42:32","commentType":0,"likeCount":0,"parentId":0,"floor":3,"isLike":0,"repContent":"","user":{"id":340232,"nick":"柚子小悠","avatar":"https://q.qlogo.cn/qqapp/1101325372/D75324AF88392039B4C0E0565937B040/100","sex":1,"vip":0,"title":"","userRank":1,"isFollow":0,"isBlack":0,"isHuiyuan":0,"teacherIntro":"","userRankIcon":"https://videooss.ifenghui.com//userRankIcon%2Fmem_vip0.png"}},{"id":1337702,"userId":391582,"targetType":6,"targetValue":330180,"repliedId":0,"content":"板凳\n萌新求眼熟","createTime":"2017-06-21 19:42:44","commentType":0,"likeCount":0,"parentId":0,"floor":2,"isLike":0,"repContent":"","user":{"id":391582,"nick":"在下无名～","avatar":"https://q.qlogo.cn/qqapp/1101325372/51531B56C34B48D9A831EDC7275414EB/100","sex":0,"vip":0,"title":"","userRank":1,"isFollow":0,"isBlack":0,"isHuiyuan":0,"teacherIntro":"","userRankIcon":"https://videooss.ifenghui.com//userRankIcon%2Fmem_vip0.png"}},{"id":1337618,"userId":300847,"targetType":6,"targetValue":330180,"repliedId":0,"content":"沙发","createTime":"2017-06-21 19:07:15","commentType":0,"likeCount":0,"parentId":0,"floor":1,"isLike":0,"repContent":"","user":{"id":300847,"nick":"『奈兮』","avatar":"https://videoimg.ifenghui.com/avatar/2017/06/18/5f683ac2bbb24d5bbaf50488fb8a99a9.jpg","sex":1,"vip":0,"title":"","userRank":4,"isFollow":0,"isBlack":0,"isHuiyuan":0,"teacherIntro":"","userRankIcon":"https://videooss.ifenghui.com//userRankIcon%2Fmem_vip0.png"}}]
     * count : 7
     * nextpage : false
     */

    private int count;
    private boolean nextpage;
    private List<OtherCommentsBean> otherComments;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isNextpage() {
        return nextpage;
    }

    public void setNextpage(boolean nextpage) {
        this.nextpage = nextpage;
    }

    public List<OtherCommentsBean> getOtherComments() {
        return otherComments;
    }

    public void setOtherComments(List<OtherCommentsBean> otherComments) {
        this.otherComments = otherComments;
    }

    public static class OtherCommentsBean {
        /**
         * id : 1339155
         * userId : 370080
         * targetType : 6
         * targetValue : 330180
         * repliedId : 0
         * content : 6
         * createTime : 2017-06-22 16:58:30
         * commentType : 0
         * likeCount : 0
         * parentId : 0
         * floor : 7
         * isLike : 0
         * repContent :
         * user : {"id":370080,"nick":"兦 ","avatar":"https://q.qlogo.cn/qqapp/1101325372/F46CC3A2A48811562F7D87FFB78D0F6D/100","sex":0,"vip":0,"title":"","userRank":3,"isFollow":0,"isBlack":0,"isHuiyuan":0,"teacherIntro":"","userRankIcon":"https://videooss.ifenghui.com//userRankIcon%2Fmem_vip0.png"}
         */

        private int id;
        private int userId;
        private int targetType;
        private int targetValue;
        private int repliedId;
        private String content;
        private String createTime;
        private int commentType;
        private int likeCount;
        private int parentId;
        private int floor;
        private int isLike;
        private String repContent;
        private UserBean user;

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

        public int getRepliedId() {
            return repliedId;
        }

        public void setRepliedId(int repliedId) {
            this.repliedId = repliedId;
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

        public int getCommentType() {
            return commentType;
        }

        public void setCommentType(int commentType) {
            this.commentType = commentType;
        }

        public int getLikeCount() {
            return likeCount;
        }

        public void setLikeCount(int likeCount) {
            this.likeCount = likeCount;
        }

        public int getParentId() {
            return parentId;
        }

        public void setParentId(int parentId) {
            this.parentId = parentId;
        }

        public int getFloor() {
            return floor;
        }

        public void setFloor(int floor) {
            this.floor = floor;
        }

        public int getIsLike() {
            return isLike;
        }

        public void setIsLike(int isLike) {
            this.isLike = isLike;
        }

        public String getRepContent() {
            return repContent;
        }

        public void setRepContent(String repContent) {
            this.repContent = repContent;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class UserBean {
            /**
             * id : 370080
             * nick : 兦
             * avatar : https://q.qlogo.cn/qqapp/1101325372/F46CC3A2A48811562F7D87FFB78D0F6D/100
             * sex : 0
             * vip : 0
             * title :
             * userRank : 3
             * isFollow : 0
             * isBlack : 0
             * isHuiyuan : 0
             * teacherIntro :
             * userRankIcon : https://videooss.ifenghui.com//userRankIcon%2Fmem_vip0.png
             */

            private int id;
            private String nick;
            private String avatar;
            private int sex;
            private int vip;
            private String title;
            private int userRank;
            private int isFollow;
            private int isBlack;
            private int isHuiyuan;
            private String teacherIntro;
            private String userRankIcon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public int getVip() {
                return vip;
            }

            public void setVip(int vip) {
                this.vip = vip;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getUserRank() {
                return userRank;
            }

            public void setUserRank(int userRank) {
                this.userRank = userRank;
            }

            public int getIsFollow() {
                return isFollow;
            }

            public void setIsFollow(int isFollow) {
                this.isFollow = isFollow;
            }

            public int getIsBlack() {
                return isBlack;
            }

            public void setIsBlack(int isBlack) {
                this.isBlack = isBlack;
            }

            public int getIsHuiyuan() {
                return isHuiyuan;
            }

            public void setIsHuiyuan(int isHuiyuan) {
                this.isHuiyuan = isHuiyuan;
            }

            public String getTeacherIntro() {
                return teacherIntro;
            }

            public void setTeacherIntro(String teacherIntro) {
                this.teacherIntro = teacherIntro;
            }

            public String getUserRankIcon() {
                return userRankIcon;
            }

            public void setUserRankIcon(String userRankIcon) {
                this.userRankIcon = userRankIcon;
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botski.selenium;

/**
 *
 * @author HungThuy
 */
public class Post {

    private String posterName;
    private String description;
    private long numLikes;
    private String time;
    private String privacy;
    private String posterLink;
    private String linkToComment;
    private String linkToLike;
    private String linkToLikers;
    private String linkToReport;
    private String groupLink;
    private String linkToShare;
    private String linkToMore;
    private long numComents;

    public Post() {
        this.posterName = "";
        this.description = "";
        this.numLikes = 0;
        this.time = "";
        this.privacy = "";
        this.posterLink = "";
        this.linkToComment = "";
        this.linkToLike = "";
        this.linkToLikers = "";
        this.linkToReport = "";
        this.groupLink = "";
        this.linkToShare = "";
        this.linkToMore = "";
        this.numComents = 0;
    }

    public String getPosterName() {
        return posterName;
    }

    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(long numLikes) {
        this.numLikes = numLikes;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getPosterLink() {
        return posterLink;
    }

    public void setPosterLink(String posterLink) {
        this.posterLink = posterLink;
    }

    public String getLinkToComment() {
        return linkToComment;
    }

    public void setLinkToComment(String linkToComment) {
        this.linkToComment = linkToComment;
    }

    public String getLinkToLike() {
        return linkToLike;
    }

    public void setLinkToLike(String linkToLike) {
        this.linkToLike = linkToLike;
    }

    public String getLinkToLikers() {
        return linkToLikers;
    }

    public void setLinkToLikers(String linkToLikers) {
        this.linkToLikers = linkToLikers;
    }

    public String getLinkToReport() {
        return linkToReport;
    }

    public void setLinkToReport(String linkToReport) {
        this.linkToReport = linkToReport;
    }

    public String getGroupLink() {
        return groupLink;
    }

    public void setGroupLink(String groupLink) {
        this.groupLink = groupLink;
    }

    public String getLinkToShare() {
        return linkToShare;
    }

    public void setLinkToShare(String linkToShare) {
        this.linkToShare = linkToShare;
    }

    public String getLinkToMore() {
        return linkToMore;
    }

    public void setLinkToMore(String linkToMore) {
        this.linkToMore = linkToMore;
    }

    public long getNumComents() {
        return numComents;
    }

    public void setNumComents(long numComents) {
        this.numComents = numComents;
    }
    
    
}

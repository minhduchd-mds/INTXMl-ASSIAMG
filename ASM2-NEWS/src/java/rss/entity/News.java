/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss.entity;

public class News {

    private String title;
    private String description;
    private String link;
    private String author; // null
    private String guid; // null
    private String pubDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public News(String title, String description, String link, String author, String guid, String pubDate) {
        this.title = title;
        this.description = description;
        this.link = link;
        this.author = author;
        this.guid = guid;
        this.pubDate = pubDate;
    }

    public News() {
    }
    
     @Override
        public String toString() {
                return "FeedMessage {\n\ttitle: " + title + ", \n\tdescription: " + description
                    + ", \n\tlink: " + link + ", \n\tauthor: " + author + ", \n\tguid: " + guid 
                    + ", \n\tpubDate:" + pubDate + "\n}\n";
        }


}

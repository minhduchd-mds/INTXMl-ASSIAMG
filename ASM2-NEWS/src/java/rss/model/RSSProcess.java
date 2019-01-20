/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss.model;

import java.util.LinkedList;
import java.util.List;
import rss.entity.Feed;
import rss.entity.News;

/**
 *
 * @author quanglinh
 */
public class RSSProcess {
    private static String newsPage = "https://dantri.com.vn/trangchu.rss";
    
    public List<News> getNews() {
        RSSFeedParser parser = new RSSFeedParser(newsPage);
        Feed feed = parser.readFeed();
        System.out.println(feed);
        return feed.getMessages();
    }
}

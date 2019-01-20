/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import rss.entity.Feed;
import rss.entity.FeedMessage;
import rss.entity.News;

/**
 *
 * @author dominhduc
 */
public class Write {
      public static void main(String[] args) {
        // create the rss feed
        String copyright = "Copyright MDS";
        String title = "RSS feeds with Java";
        String description = " Java Information";
        String language = "en";
        String link = "https://dantri.com.vn/xa-hoi";
        Calendar cal = new GregorianCalendar();
        Date creationDate = cal.getTime();
        SimpleDateFormat date_format = new SimpleDateFormat(
                "EEE', 'dd' 'MMM' 'yyyy' 'HH:mm:ss' 'Z", Locale.US);
        String pubdate = date_format.format(creationDate);
        Feed rssFeeder = new Feed(title, link, description, language,
                copyright, pubdate);

        // now add one example entry
        News feed = new News();
        feed.setTitle("RSSFeed");
        feed.setDescription("This is a description");
        feed.setAuthor("nonsense@somewhere.de (Lars Vogel)");
        feed.setGuid("https://dantri.com.vn/xa-hoi/phong-su-ky-su.rss");
        feed.setLink("https://dantri.com.vn/xa-hoi/phong-su-ky-su.rss");
        rssFeeder.getMessages().add(feed);

        // now write the file
        RSSFeedWriter writer = new RSSFeedWriter(rssFeeder, "articles.rss");
        try {
            writer.write();
        } catch (Exception e) {
        }
    }

}

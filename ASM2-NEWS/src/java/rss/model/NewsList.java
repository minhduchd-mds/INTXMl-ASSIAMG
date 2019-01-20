/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss.model;

import rss.entity.Feed;
import rss.entity.News;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import freemarker.template.utility.Execute;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author quanglinh
 */
public class NewsList extends ActionSupport {
    private List<News> newsList;

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    @Override
    public String execute() throws Exception {
        newsList = new RSSProcess().getNews();
        return SUCCESS;
    }
    
    
}

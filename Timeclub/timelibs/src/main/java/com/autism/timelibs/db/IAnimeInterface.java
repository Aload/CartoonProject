package com.autism.timelibs.db;

/**
 * Author：autism on 2017/6/15 14:30
 * Used:Timeclub
 */
public interface IAnimeInterface {
    String DATABASE_NAME = "Cartoon.db";
    String WORLD_DB = "anime_table";
    String SQL = "create table+" + WORLD_DB + " (_id integer PRIMARY KEY AUTOINCREMENT NOT NULL,text name,varchar time);";

    //热门json
    String HOTTAB = "hot_tab";

    //推荐
    String COMMENT = "comment_tab";

    //关注
    String ATTENTION="attention";
}

package com.github.tvboxgo.www.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.github.tvboxgo.www.cache.Cache;
import com.github.tvboxgo.www.cache.CacheDao;
import com.github.tvboxgo.www.cache.VodCollect;
import com.github.tvboxgo.www.cache.VodCollectDao;
import com.github.tvboxgo.www.cache.VodRecord;
import com.github.tvboxgo.www.cache.VodRecordDao;


/**
 * 类描述:
 *
 * @author pj567
 * @since 2020/5/15
 */
@Database(entities = {Cache.class, VodRecord.class, VodCollect.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract CacheDao getCacheDao();

    public abstract VodRecordDao getVodRecordDao();

    public abstract VodCollectDao getVodCollectDao();
}

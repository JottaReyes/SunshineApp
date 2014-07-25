package mobile.com.sunshineapp;

import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;

import mobile.com.sunshineapp.data.WeatherDbHelper;

/**
 * Created by jorge.reyes on 25/07/2014.
 */
public class TestDb extends AndroidTestCase {
    public static final String LOG_TAG = TestDb.class.getSimpleName();

    public void testCreateDb() throws Throwable {
        mContext.deleteDatabase(WeatherDbHelper.DATABASE_NAME);
        SQLiteDatabase db = new WeatherDbHelper(
                this.mContext).getWritableDatabase();
        assertEquals(true, db.isOpen());
        db.close();
    }
}

package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.Constants;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.messages.Region;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness", "Range"})
public final class j extends b implements com.salesforce.marketingcloud.storage.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65028e = "regions";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65029f = "region_messages";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f65030g = com.salesforce.marketingcloud.g.a("RegionDbStorage");

    public j(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    private static ContentValues a(Region region, Message message) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("region_id", region.id());
        contentValues.put(Constants.MessagePayloadKeys.MSGID_SERVER, message.id());
        return contentValues;
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE regions(id TEXT PRIMARY KEY, latitude TEXT, longitude TEXT, radius INTEGER, beacon_guid TEXT, beacon_major INTEGER, beacon_minor INTEGER, description TEXT, name TEXT, location_type INTEGER, is_inside SMALLINT);");
    }

    private static ContentValues c(Region region, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", region.id());
        contentValues.put("latitude", cVar.a(String.valueOf(region.center().latitude())));
        contentValues.put("longitude", cVar.a(String.valueOf(region.center().longitude())));
        contentValues.put("radius", Integer.valueOf(region.radius()));
        contentValues.put("beacon_guid", cVar.a(region.proximityUuid()));
        contentValues.put("beacon_major", Integer.valueOf(region.major()));
        contentValues.put("beacon_minor", Integer.valueOf(region.minor()));
        contentValues.put("description", cVar.a(region.description()));
        contentValues.put("name", cVar.a(region.name()));
        contentValues.put("location_type", Integer.valueOf(region.regionType()));
        contentValues.put("is_inside", Integer.valueOf(com.salesforce.marketingcloud.internal.j.a(region) ? 1 : 0));
        return contentValues;
    }

    private static boolean e(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT region_id,message_id FROM region_messages");
            return true;
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.e(f65030g, e5, "%s is invalid", f65029f);
            return false;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.l
    @NonNull
    public List<String> d(int i10) {
        List<String> listEmptyList = Collections.emptyList();
        Cursor cursorRawQuery = this.f64976c.rawQuery("SELECT id FROM regions WHERE location_type=?", new String[]{String.valueOf(i10)});
        if (cursorRawQuery != null) {
            if (cursorRawQuery.moveToFirst()) {
                ArrayList arrayList = new ArrayList();
                int columnIndex = cursorRawQuery.getColumnIndex("id");
                do {
                    arrayList.add(cursorRawQuery.getString(columnIndex));
                } while (cursorRawQuery.moveToNext());
                listEmptyList = arrayList;
            }
            cursorRawQuery.close();
        }
        return listEmptyList;
    }

    @Override // com.salesforce.marketingcloud.storage.l
    public Region f(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        Cursor cursorRawQuery = this.f64976c.rawQuery("SELECT * FROM regions WHERE id=?", new String[]{Region.MAGIC_REGION_ID});
        Region regionA = null;
        if (cursorRawQuery != null) {
            if (cursorRawQuery.moveToFirst()) {
                try {
                    regionA = com.salesforce.marketingcloud.internal.j.a(new LatLon(Double.valueOf(cVar.b(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("latitude")))).doubleValue(), Double.valueOf(cVar.b(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("longitude")))).doubleValue()), cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("radius")));
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.b(f65030g, e5, "Unable to read magic region from DB.", new Object[0]);
                }
            }
            cursorRawQuery.close();
        }
        return regionA;
    }

    @Override // com.salesforce.marketingcloud.storage.l
    public int g(int i10) {
        return this.f64976c.delete(f65028e, "location_type=?", new String[]{String.valueOf(i10)});
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return f65028e;
    }

    private static boolean f(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT id,latitude,longitude,radius,beacon_guid,beacon_major,beacon_minor,description,name,location_type,is_inside FROM regions");
            return true;
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.e(f65030g, e5, "%s is invalid", f65028e);
            return false;
        }
    }

    public static boolean g(SQLiteDatabase sQLiteDatabase) {
        boolean zF = f(sQLiteDatabase);
        if (!zF) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS regions");
                b(sQLiteDatabase);
                zF = f(sQLiteDatabase);
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(f65030g, e5, "Unable to recover %s", f65028e);
            }
        }
        boolean zE = e(sQLiteDatabase);
        if (zF && !zE) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS region_messages");
                a(sQLiteDatabase);
                zE = e(sQLiteDatabase);
            } catch (Exception e7) {
                com.salesforce.marketingcloud.g.b(f65030g, e7, "Unable to recover %s", f65029f);
            }
        }
        return zF && zE;
    }

    @Override // com.salesforce.marketingcloud.storage.l
    public Region a(String str, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        Cursor cursorRawQuery = this.f64976c.rawQuery("SELECT * FROM regions WHERE id=?", new String[]{str});
        Region regionC = null;
        if (cursorRawQuery != null) {
            regionC = cursorRawQuery.moveToFirst() ? d.c(cursorRawQuery, cVar) : null;
            cursorRawQuery.close();
        }
        return regionC;
    }

    @Override // com.salesforce.marketingcloud.storage.l
    @NonNull
    public List<String> c(@NonNull String str, int i10) {
        ArrayList arrayList;
        Cursor cursorRawQuery = this.f64976c.rawQuery("SELECT message_id FROM region_messages INNER JOIN messages on region_messages.message_id = messages.id WHERE region_id = ? AND messages.message_type = ?", new String[]{str, String.valueOf(i10)});
        if (cursorRawQuery.moveToFirst()) {
            arrayList = new ArrayList(cursorRawQuery.getCount());
            int columnIndex = cursorRawQuery.getColumnIndex(Constants.MessagePayloadKeys.MSGID_SERVER);
            do {
                arrayList.add(cursorRawQuery.getString(columnIndex));
            } while (cursorRawQuery.moveToNext());
        } else {
            arrayList = null;
        }
        cursorRawQuery.close();
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    @Override // com.salesforce.marketingcloud.storage.l
    public void d() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_inside", (Integer) 0);
        this.f64976c.update(f65028e, contentValues, null, null);
    }

    public static void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS regions");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS region_messages");
    }

    public static void d(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
        a(sQLiteDatabase);
    }

    @Override // com.salesforce.marketingcloud.storage.l
    @NonNull
    public List<Region> a(int i10, com.salesforce.marketingcloud.util.c cVar) {
        List<Region> listEmptyList = Collections.emptyList();
        Cursor cursorRawQuery = this.f64976c.rawQuery("SELECT * FROM regions WHERE location_type=?", new String[]{String.valueOf(i10)});
        if (cursorRawQuery != null) {
            if (cursorRawQuery.moveToFirst()) {
                ArrayList arrayList = new ArrayList(cursorRawQuery.getCount());
                do {
                    Region regionC = d.c(cursorRawQuery, cVar);
                    if (regionC != null) {
                        arrayList.add(regionC);
                    }
                } while (cursorRawQuery.moveToNext());
                listEmptyList = arrayList;
            }
            cursorRawQuery.close();
        }
        return listEmptyList;
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE region_messages (region_id TEXT,  message_id TEXT, FOREIGN KEY (region_id) REFERENCES regions(id) ON DELETE CASCADE, PRIMARY KEY (region_id, message_id));");
    }

    @Override // com.salesforce.marketingcloud.storage.l
    public void a(@NonNull Region region, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        this.f64976c.insertWithOnConflict(f65028e, null, c(region, cVar), 5);
        if (region.messages().isEmpty()) {
            return;
        }
        Iterator<Message> it = region.messages().iterator();
        while (it.hasNext()) {
            this.f64976c.insertWithOnConflict(f65029f, null, a(region, it.next()), 5);
        }
    }

    @Override // com.salesforce.marketingcloud.storage.l
    public void a(@NonNull String str, boolean z10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_inside", Integer.valueOf(z10 ? 1 : 0));
        this.f64976c.update(f65028e, contentValues, "id=?", new String[]{str});
    }
}

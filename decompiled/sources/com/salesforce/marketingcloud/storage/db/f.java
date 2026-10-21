package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness", "Range"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class f extends b implements com.salesforce.marketingcloud.storage.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64982e = "in_app_messages";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f64983f = "iam_state";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f64984g = "iam_view";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f64985h = "iam_state_init";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f64986i = com.salesforce.marketingcloud.g.a("InAppMessageDbStorage");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f64987j = "id IN (%s) AND (display_count < display_limit) AND (start_date IS NULL OR start_date < ?) AND (end_date IS NULL OR end_date > ?) ORDER BY   priority ASC,  modified_date DESC LIMIT 1";

    public f(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    private static ContentValues b(InAppMessage inAppMessage, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", inAppMessage.id());
        contentValues.put("priority", Integer.valueOf(inAppMessage.priority()));
        contentValues.put("start_date", inAppMessage.startDateUtc() != null ? Long.valueOf(inAppMessage.startDateUtc().getTime()) : null);
        contentValues.put("end_date", inAppMessage.endDateUtc() != null ? Long.valueOf(inAppMessage.endDateUtc().getTime()) : null);
        contentValues.put("modified_date", Long.valueOf(inAppMessage.modifiedDateUtc().getTime()));
        contentValues.put("display_limit", Integer.valueOf(inAppMessage.displayLimit()));
        InAppMessage.Media media = inAppMessage.media();
        if (media != null && !TextUtils.isEmpty(media.url())) {
            contentValues.put("media_url", cVar.a(media.url()));
        }
        contentValues.put("message_json", cVar.a(com.salesforce.marketingcloud.internal.a.b(inAppMessage).toString()));
        return contentValues;
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE in_app_messages(id TEXT PRIMARY KEY, priority INTEGER DEFAULT 999, start_date INTEGER DEFAULT NULL, end_date INTEGER DEFAULT NULL, modified_date INTEGER DEFAULT NULL, display_limit INTEGER DEFAULT 1, media_url TEXT DEFAULT NULL, message_json TEXT);");
    }

    public static void e(SQLiteDatabase sQLiteDatabase) {
        h(sQLiteDatabase);
        f(sQLiteDatabase);
        g(sQLiteDatabase);
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS iam_state_init");
    }

    private static void f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS iam_state");
    }

    private static void g(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS iam_view");
    }

    private static void h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS in_app_messages");
    }

    public static void i(SQLiteDatabase sQLiteDatabase) {
        d(sQLiteDatabase);
        a(sQLiteDatabase);
        b(sQLiteDatabase);
        c(sQLiteDatabase);
    }

    private static boolean j(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT id,display_count FROM iam_state");
            return false;
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.e(f64986i, e5, "%s is invalid", f64983f);
            return true;
        }
    }

    private static boolean k(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT id,priority,start_date,end_date,modified_date,display_limit,media_url,message_json FROM in_app_messages");
            return false;
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.e(f64986i, e5, "%s is invalid", f64982e);
            return true;
        }
    }

    private static boolean l(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT id,priority,start_date,end_date,modified_date,display_limit,message_json,display_count FROM iam_view");
            return false;
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.e(f64986i, e5, "%s is invalid", f64984g);
            return true;
        }
    }

    public static boolean m(SQLiteDatabase sQLiteDatabase) {
        boolean z10;
        if (k(sQLiteDatabase)) {
            sQLiteDatabase.beginTransaction();
            try {
                try {
                    h(sQLiteDatabase);
                    d(sQLiteDatabase);
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.b(f64986i, e5, "Unable to recover %s", f64982e);
                }
                sQLiteDatabase.endTransaction();
                if (k(sQLiteDatabase)) {
                    return false;
                }
            } catch (Throwable th2) {
                sQLiteDatabase.endTransaction();
                throw th2;
            }
        }
        if (j(sQLiteDatabase)) {
            sQLiteDatabase.beginTransaction();
            try {
                try {
                    f(sQLiteDatabase);
                    a(sQLiteDatabase);
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable th3) {
                    sQLiteDatabase.endTransaction();
                    throw th3;
                }
            } catch (Exception e7) {
                com.salesforce.marketingcloud.g.b(f64986i, e7, "Unable to recover %s", f64983f);
            }
            sQLiteDatabase.endTransaction();
            if (j(sQLiteDatabase)) {
                return false;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (l(sQLiteDatabase)) {
            try {
                g(sQLiteDatabase);
                c(sQLiteDatabase);
            } catch (Exception e10) {
                com.salesforce.marketingcloud.g.b(f64986i, e10, "Unable to recover %s", f64984g);
            }
            if (l(sQLiteDatabase)) {
                return false;
            }
        }
        try {
            if (!c.a(sQLiteDatabase, "trigger", f64985h)) {
                if (z10) {
                }
                return true;
            }
            try {
                b(sQLiteDatabase);
            } catch (Exception e11) {
                com.salesforce.marketingcloud.g.b(f64986i, e11, "Unable to recover %s", f64985h);
            }
            if (c.a(sQLiteDatabase, "trigger", f64985h)) {
                return false;
            }
            sQLiteDatabase.execSQL("INSERT OR IGNORE INTO iam_state(id) SELECT id FROM in_app_messages;");
        } catch (Exception e12) {
            com.salesforce.marketingcloud.g.b(f64986i, e12, "Unable to correct relationship between iam data and iam state.", new Object[0]);
        }
        return true;
    }

    @Override // com.salesforce.marketingcloud.storage.g
    public int a(@NonNull InAppMessage inAppMessage, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        ContentValues contentValuesB = b(inAppMessage, cVar);
        if (this.f64976c.update(f64982e, contentValuesB, "id = ?", new String[]{inAppMessage.id()}) != 0) {
            return 2;
        }
        this.f64976c.insert(f64982e, null, contentValuesB);
        return 1;
    }

    @Override // com.salesforce.marketingcloud.storage.g
    @NonNull
    public List<String> c(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        ArrayList arrayList = null;
        Cursor cursorA = a(f64982e, new String[]{"media_url"}, "media_url IS NOT NULL", null);
        try {
            if (cursorA.moveToFirst()) {
                arrayList = new ArrayList(cursorA.getCount());
                do {
                    String strA = a(cursorA, cVar);
                    if (strA != null) {
                        arrayList.add(strA);
                    }
                } while (cursorA.moveToNext());
            }
            cursorA.close();
            return arrayList != null ? arrayList : Collections.emptyList();
        } catch (Throwable th2) {
            cursorA.close();
            throw th2;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return null;
    }

    @Nullable
    private static InAppMessage b(@NonNull Cursor cursor, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        try {
            return new InAppMessage(new JSONObject(cVar.b(cursor.getString(cursor.getColumnIndex("message_json")))));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f64986i, e5, "Unable to retrieve InAppMessage from db cursor", new Object[0]);
            return null;
        }
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE VIEW iam_view AS SELECT in_app_messages.id,in_app_messages.priority,in_app_messages.start_date,in_app_messages.end_date,in_app_messages.modified_date,in_app_messages.display_limit,in_app_messages.message_json,iam_state.display_count FROM in_app_messages INNER JOIN iam_state ON iam_state.id = in_app_messages.id;");
    }

    @Override // com.salesforce.marketingcloud.storage.g
    public int a(@NonNull Collection<String> collection) {
        if (collection.size() == 0) {
            return this.f64976c.delete(f64982e, null, null);
        }
        try {
            return a(f64982e, collection);
        } catch (SQLException unused) {
            com.salesforce.marketingcloud.g.e(f64986i, "Unable to clean up %s table.", f64982e);
            return 0;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.g
    @Nullable
    public InAppMessage a(@NonNull String str, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        Cursor cursorA = a(f64982e, new String[]{"message_json"}, "id = ?", new String[]{str});
        InAppMessage inAppMessageB = null;
        if (cursorA != null) {
            inAppMessageB = cursorA.moveToFirst() ? b(cursorA, cVar) : null;
            cursorA.close();
        }
        return inAppMessageB;
    }

    @Override // com.salesforce.marketingcloud.storage.g
    @NonNull
    public JSONArray b(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        JSONArray jSONArray = new JSONArray();
        Cursor cursorA = a(f64984g, new String[]{"message_json", "display_count"}, null, null);
        if (cursorA != null) {
            try {
                if (cursorA.moveToFirst()) {
                    int columnIndex = cursorA.getColumnIndex("message_json");
                    int columnIndex2 = cursorA.getColumnIndex("display_count");
                    do {
                        try {
                            JSONObject jSONObject = new JSONObject(cVar.b(cursorA.getString(columnIndex)));
                            jSONObject.put("displayCount", cursorA.getInt(columnIndex2));
                            jSONArray.put(jSONObject);
                        } catch (Exception e5) {
                            com.salesforce.marketingcloud.g.b(f64986i, e5, "Unable to read message information from cursor.", new Object[0]);
                        }
                    } while (cursorA.moveToNext());
                }
                cursorA.close();
            } catch (Throwable th2) {
                cursorA.close();
                throw th2;
            }
        }
        return jSONArray;
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TRIGGER iam_state_init AFTER INSERT ON in_app_messages BEGIN INSERT INTO iam_state (id) VALUES (NEW.id); END;");
    }

    @Override // com.salesforce.marketingcloud.storage.g
    @Nullable
    public InAppMessage a(@NonNull Collection<String> collection, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        InAppMessage inAppMessageB = null;
        if (collection.size() > 0) {
            this.f64976c.beginTransaction();
            b(f64984g, collection);
            String strA = c.a(f64987j, c.a("SELECT %1$s.id FROM %1$s LEFT JOIN tmp_%1$s ON %1$s.id = tmp_%1$s.id WHERE tmp_%1$s.id IS NOT NULL", f64984g));
            String strValueOf = String.valueOf(System.currentTimeMillis());
            Cursor cursorA = a(f64984g, new String[]{"message_json"}, strA, new String[]{strValueOf, strValueOf});
            if (cursorA != null) {
                inAppMessageB = cursorA.moveToFirst() ? b(cursorA, cVar) : null;
                cursorA.close();
            }
            h(f64984g);
            this.f64976c.setTransactionSuccessful();
            this.f64976c.endTransaction();
        }
        return inAppMessageB;
    }

    @Nullable
    private static String a(@NonNull Cursor cursor, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        try {
            return cVar.b(cursor.getString(cursor.getColumnIndex("media_url")));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f64986i, e5, "Unable to retrieve media_url from db cursor", new Object[0]);
            return null;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.g
    public void b(@NonNull String str, int i10) {
        if (str == null || i10 < 0) {
            return;
        }
        this.f64976c.execSQL("UPDATE iam_state SET display_count = MAX(display_count, ?) WHERE id = ?", new Object[]{Integer.valueOf(i10), str});
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE iam_state(id TEXT PRIMARY KEY, display_count integer default 0, FOREIGN KEY (id) REFERENCES in_app_messages(id) ON DELETE CASCADE);");
    }

    @Override // com.salesforce.marketingcloud.storage.g
    public void a(@NonNull InAppMessage inAppMessage) {
        if (inAppMessage != null) {
            this.f64976c.execSQL("UPDATE iam_state SET display_count = display_count + 1 WHERE id = ?", new String[]{inAppMessage.id()});
        }
    }
}

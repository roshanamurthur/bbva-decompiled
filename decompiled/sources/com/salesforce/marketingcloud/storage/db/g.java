package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness", "Range"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class g extends b implements com.salesforce.marketingcloud.storage.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64988e = "inbox_messages";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f64989f = "(start_date IS NULL OR start_date<?) AND (end_date IS NULL OR end_date>?)";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f64990g = com.salesforce.marketingcloud.g.a("InboxMessageDbStorage");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f64991h = {"id", "start_date", "is_deleted", "is_read", "message_hash", "is_dirty"};

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64992a;

        static {
            int[] iArr = new int[com.salesforce.marketingcloud.storage.h.a.values().length];
            f64992a = iArr;
            try {
                iArr[com.salesforce.marketingcloud.storage.h.a.READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64992a[com.salesforce.marketingcloud.storage.h.a.UNREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64992a[com.salesforce.marketingcloud.storage.h.a.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64992a[com.salesforce.marketingcloud.storage.h.a.NOT_DELETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public g(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE inbox_messages(id TEXT PRIMARY KEY, start_date INTEGER DEFAULT NULL, end_date INTEGER DEFAULT NULL, is_deleted INTEGER DEFAULT 0, is_read INTEGER DEFAULT 0, is_dirty INTEGER DEFAULT 0, message_hash TEXT DEFAULT NULL, message_json TEXT);");
    }

    private static String c(com.salesforce.marketingcloud.storage.h.a aVar) {
        String str;
        StringBuilder sbA = androidx.fragment.app.a.a(101, f64989f);
        int i10 = a.f64992a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            str = " AND is_read=? AND is_deleted=?";
        } else {
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException("Unknown MessageStatus while getting message counts.");
            }
            str = " AND is_deleted=?";
        }
        sbA.append(str);
        return sbA.toString();
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public int a(@NonNull com.salesforce.marketingcloud.storage.h.a aVar) {
        return (int) DatabaseUtils.queryNumEntries(this.f64976c, f64988e, c(aVar), b(aVar));
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public void d(@NonNull String str) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("is_dirty", (Integer) 1);
        contentValues.put("is_deleted", (Integer) 1);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        a(contentValues, "id=? AND (start_date IS NULL OR start_date<?) AND (end_date IS NULL OR end_date>?) AND is_deleted=0", new String[]{str, strValueOf, strValueOf});
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public void e(@NonNull String str) {
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.f64976c.execSQL("UPDATE inbox_messages SET   is_read = 1,  is_dirty = CASE WHEN is_dirty=1 OR is_deleted=0 THEN 1 ELSE 0 END WHERE   id=? AND (start_date IS NULL OR start_date<?) AND (end_date IS NULL OR end_date>?) AND is_read=0", new String[]{str, strValueOf, strValueOf});
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public void f() {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("is_dirty", (Integer) 1);
        contentValues.put("is_deleted", (Integer) 1);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        a(contentValues, "(start_date IS NULL OR start_date<?) AND (end_date IS NULL OR end_date>?) AND is_deleted=0", new String[]{strValueOf, strValueOf});
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public com.salesforce.marketingcloud.storage.h.b g(@NonNull String str) {
        Cursor cursorA = a(f64991h, "id=?", new String[]{str});
        com.salesforce.marketingcloud.storage.h.b bVarA = null;
        if (cursorA != null) {
            bVarA = cursorA.moveToFirst() ? a(cursorA) : null;
            cursorA.close();
        }
        return bVarA;
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public int k() {
        return i(null);
    }

    @Override // com.salesforce.marketingcloud.storage.h
    @NonNull
    public List<com.salesforce.marketingcloud.storage.h.b> l() {
        ArrayList arrayList = null;
        Cursor cursorA = a(f64991h, "is_dirty=1", (String[]) null);
        if (cursorA != null) {
            if (cursorA.moveToFirst()) {
                ArrayList arrayList2 = new ArrayList(cursorA.getCount());
                do {
                    arrayList2.add(a(cursorA));
                } while (cursorA.moveToNext());
                arrayList = arrayList2;
            }
            cursorA.close();
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public void m() {
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.f64976c.execSQL("UPDATE inbox_messages SET   is_read = 1,  is_dirty = CASE WHEN is_dirty=1 OR is_deleted=0 THEN 1 ELSE 0 END WHERE (start_date IS NULL OR start_date<?) AND (end_date IS NULL OR end_date>?) AND is_read=0", new String[]{strValueOf, strValueOf});
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return f64988e;
    }

    public static boolean d(SQLiteDatabase sQLiteDatabase) {
        boolean zC = c(sQLiteDatabase);
        if (zC) {
            return zC;
        }
        try {
            a(sQLiteDatabase);
            b(sQLiteDatabase);
            return c(sQLiteDatabase);
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f64990g, e5, "Unable to recover %s", f64988e);
            return zC;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.h
    @WorkerThread
    public int a(@NonNull List<String> list) {
        if (list.size() == 0) {
            return a((String) null, (String[]) null);
        }
        try {
            return a(o(), list);
        } catch (Exception unused) {
            com.salesforce.marketingcloud.g.e(f64990g, "Unable to clean up %s table.", o());
            return 0;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public void b(@NonNull String[] strArr) {
        if (strArr.length > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_dirty", (Integer) 0);
            try {
                a(contentValues, Arrays.asList(strArr));
            } catch (Exception unused) {
                com.salesforce.marketingcloud.g.e(f64990g, "Unable to update %s table.", o());
            }
        }
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public boolean f(@NonNull String str) {
        return DatabaseUtils.queryNumEntries(this.f64976c, f64988e, "id=?", new String[]{str}) > 0;
    }

    @Override // com.salesforce.marketingcloud.storage.h
    @NonNull
    public List<InboxMessage> g(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        return a(a((String[]) null, (String) null, (String[]) null), cVar);
    }

    private static String[] b(com.salesforce.marketingcloud.storage.h.a aVar) {
        String[] strArr;
        String strValueOf = String.valueOf(System.currentTimeMillis());
        int i10 = a.f64992a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            strArr = new String[4];
            strArr[0] = strValueOf;
            strArr[1] = strValueOf;
            strArr[2] = aVar != com.salesforce.marketingcloud.storage.h.a.READ ? "0" : "1";
            strArr[3] = "0";
        } else {
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException("Unknown MessageStatus while getting message counts.");
            }
            strArr = new String[3];
            strArr[0] = strValueOf;
            strArr[1] = strValueOf;
            strArr[2] = aVar != com.salesforce.marketingcloud.storage.h.a.DELETED ? "0" : "1";
        }
        return strArr;
    }

    @Override // com.salesforce.marketingcloud.storage.h
    @Nullable
    public InboxMessage a(@NonNull String str, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        Cursor cursorA = a(null, "id=?", new String[]{str}, null, null, null, "1");
        InboxMessage inboxMessageA = null;
        if (cursorA != null) {
            inboxMessageA = cursorA.moveToFirst() ? d.a(cursorA, cVar) : null;
            cursorA.close();
        }
        return inboxMessageA;
    }

    @NonNull
    private static com.salesforce.marketingcloud.storage.h.b a(@NonNull Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("start_date");
        return new com.salesforce.marketingcloud.storage.h.b(cursor.getString(cursor.getColumnIndex("id")), cursor.getString(cursor.getColumnIndex("message_hash")), cursor.isNull(columnIndex) ? null : new Date(cursor.getLong(columnIndex)), cursor.getInt(cursor.getColumnIndex("is_read")) == 1, cursor.getInt(cursor.getColumnIndex("is_deleted")) == 1, cursor.getInt(cursor.getColumnIndex("is_dirty")) == 1);
    }

    @NonNull
    private static List<InboxMessage> a(@NonNull Cursor cursor, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        List<InboxMessage> listEmptyList = Collections.emptyList();
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                ArrayList arrayList = new ArrayList();
                do {
                    InboxMessage inboxMessageA = d.a(cursor, cVar);
                    if (inboxMessageA != null) {
                        arrayList.add(inboxMessageA);
                    }
                } while (cursor.moveToNext());
                listEmptyList = arrayList;
            }
            cursor.close();
        }
        return listEmptyList;
    }

    @Override // com.salesforce.marketingcloud.storage.h
    @NonNull
    public List<InboxMessage> a(@NonNull com.salesforce.marketingcloud.util.c cVar, com.salesforce.marketingcloud.storage.h.a aVar) {
        return a(a(null, c(aVar), b(aVar), null, null, "IFNULL(start_date, " + System.currentTimeMillis() + ") DESC"), cVar);
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS inbox_messages");
    }

    @Override // com.salesforce.marketingcloud.storage.h
    public void a(@NonNull InboxMessage inboxMessage, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        ContentValues contentValuesA = d.a(inboxMessage, cVar);
        if (a(contentValuesA, "id = ?", new String[]{inboxMessage.id()}) == 0) {
            a(contentValuesA);
        }
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT id,start_date,end_date,is_deleted,is_read,is_dirty,message_hash,message_json FROM inbox_messages");
            return true;
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.e(f64990g, e5, "%s is invalid", f64988e);
            return false;
        }
    }
}

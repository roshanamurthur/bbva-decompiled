package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.messages.Region;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness", "Range"})
public final class a extends b implements com.salesforce.marketingcloud.storage.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64960e = "analytic_item";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f64962g = "CREATE TABLE analytic_item (id INTEGER PRIMARY KEY AUTOINCREMENT, event_date VARCHAR, analytic_product_type INTEGER, analytic_type INTEGER, value INTEGER, ready_to_send SMALLINT, object_ids VARCHAR, enc_json_pi_payload VARCHAR, enc_json_et_payload VARCHAR, predictive_intelligence_identifier VARCHAR DEFAULT NULL);";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @VisibleForTesting
    static final int f64963h = 1000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f64961f = {"id", C0270a.f64967c, C0270a.f64973i, C0270a.f64968d, "value", C0270a.f64970f, C0270a.f64969e, C0270a.f64972h, C0270a.f64971g, "predictive_intelligence_identifier"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f64964i = com.salesforce.marketingcloud.g.a("AnalyticItemDbStorage");

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.storage.db.a$a, reason: collision with other inner class name */
    public static class C0270a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f64965a = "id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f64966b = "value";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f64967c = "event_date";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f64968d = "analytic_type";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f64969e = "object_ids";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f64970f = "ready_to_send";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f64971g = "enc_json_et_payload";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f64972h = "enc_json_pi_payload";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f64973i = "analytic_product_type";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f64974j = "predictive_intelligence_identifier";
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    private static ContentValues c(@NonNull com.salesforce.marketingcloud.analytics.b bVar, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        String strA;
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0270a.f64967c, com.salesforce.marketingcloud.util.l.a(bVar.b()));
        contentValues.put(C0270a.f64973i, Integer.valueOf(bVar.j()));
        contentValues.put(C0270a.f64968d, Integer.valueOf(bVar.a()));
        contentValues.put("value", Integer.valueOf(bVar.g()));
        contentValues.put(C0270a.f64970f, Integer.valueOf(bVar.h() ? 1 : 0));
        contentValues.put(C0270a.f64969e, new JSONArray((Collection) bVar.i()).toString());
        if (bVar.c() != null) {
            contentValues.put(C0270a.f64971g, cVar.a(bVar.c()));
        }
        if (bVar.j() == 1) {
            contentValues.put("predictive_intelligence_identifier", cVar.a(bVar.f()));
            strA = cVar.a(bVar.e());
        } else {
            contentValues.put("predictive_intelligence_identifier", (String) null);
            strA = "";
        }
        contentValues.put(C0270a.f64972h, strA);
        return contentValues;
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public int a(int i10) {
        return a(a("%s = ? AND %s NOT IN (%s)", C0270a.f64973i, C0270a.f64968d, TextUtils.join(",", com.salesforce.marketingcloud.analytics.b.E)), new String[]{String.valueOf(i10)});
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public int b(int i10) {
        return a(a("%s = ? AND %s IN (%s)", C0270a.f64973i, C0270a.f64968d, TextUtils.join(",", com.salesforce.marketingcloud.analytics.b.E)), new String[]{String.valueOf(i10)});
    }

    @Override // com.salesforce.marketingcloud.storage.a
    @NonNull
    public List<com.salesforce.marketingcloud.analytics.b> d(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        return b(0, cVar);
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public int e(int i10) {
        return a(a("%s = ?", C0270a.f64973i), new String[]{String.valueOf(i10)});
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public int h() {
        return h(0);
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public int i() {
        return h(1);
    }

    @Override // com.salesforce.marketingcloud.storage.a
    @NonNull
    public List<com.salesforce.marketingcloud.analytics.b> m(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        return b(a(f64961f, a("(%1$s=? OR %1$s=?) AND %2$s=?", C0270a.f64968d, C0270a.f64970f), new String[]{String.valueOf(13), String.valueOf(11), String.valueOf(0)}), cVar);
    }

    @Override // com.salesforce.marketingcloud.storage.a
    @NonNull
    public List<com.salesforce.marketingcloud.analytics.b> n(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        return b(1, cVar);
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return f64960e;
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
            com.salesforce.marketingcloud.g.b(f64964i, e5, "Unable to recover %s", f64960e);
            return zC;
        }
    }

    private int h(int i10) {
        return (int) DatabaseUtils.queryNumEntries(this.f64976c, f64960e, a("%s=%s", C0270a.f64973i, Integer.valueOf(i10)));
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public int a(String[] strArr) {
        return i(a("%s IN (%s)", "id", TextUtils.join(",", strArr)));
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public int b(com.salesforce.marketingcloud.analytics.b bVar, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        return a(c(bVar, cVar), a("%s = ?", "id"), new String[]{String.valueOf(bVar.d())});
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public boolean c(int i10) {
        return DatabaseUtils.queryNumEntries(this.f64976c, o(), a("(%1$s=? OR %1$s=?) AND %2$s=? AND %3$s=? AND %4$s=?", C0270a.f64968d, C0270a.f64973i, "value", C0270a.f64970f), new String[]{String.valueOf(4), String.valueOf(5), String.valueOf(i10), String.valueOf(0), String.valueOf(0)}) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    private static com.salesforce.marketingcloud.analytics.b a(Cursor cursor, @Nullable com.salesforce.marketingcloud.util.c cVar) {
        String strOptString;
        String str;
        com.salesforce.marketingcloud.analytics.b bVarA;
        try {
            int i10 = cursor.getInt(cursor.getColumnIndex(C0270a.f64968d));
            int i11 = cursor.getInt(cursor.getColumnIndex(C0270a.f64973i)) == 0 ? 0 : 1;
            Date dateF = com.salesforce.marketingcloud.util.l.f(cursor.getString(cursor.getColumnIndex(C0270a.f64967c)));
            boolean z10 = cursor.getInt(cursor.getColumnIndex(C0270a.f64970f)) == 1;
            ?? EmptyList = Collections.emptyList();
            JSONArray jSONArray = new JSONArray(cursor.getString(cursor.getColumnIndex(C0270a.f64969e)));
            if (jSONArray.length() > 0) {
                EmptyList = new ArrayList();
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    EmptyList.add(jSONArray.getString(i12));
                }
            }
            ?? r10 = EmptyList;
            if (cVar != null) {
                String strB = cVar.b(cursor.getString(cursor.getColumnIndex(C0270a.f64971g)));
                strOptString = !TextUtils.isEmpty(strB) ? new JSONObject(strB).optString("requestId") : null;
                str = strB;
            } else {
                strOptString = null;
                str = null;
            }
            if (!TextUtils.isEmpty(strOptString)) {
                bVarA = com.salesforce.marketingcloud.analytics.b.a(dateF, i11, i10, r10, strOptString, z10);
            } else if (r10.size() > 0) {
                bVarA = com.salesforce.marketingcloud.analytics.b.a(dateF, i11, i10, (List<String>) r10, z10);
            } else {
                bVarA = com.salesforce.marketingcloud.analytics.b.a(dateF, i11, i10);
                bVarA.a(z10);
            }
            bVarA.a(cursor.getInt(cursor.getColumnIndex("id")));
            bVarA.b(cursor.getInt(cursor.getColumnIndex("value")));
            bVarA.b(str);
            if (i11 == 1 && cVar != null) {
                bVarA.d(cVar.b(cursor.getString(cursor.getColumnIndex("predictive_intelligence_identifier"))));
                String string = cursor.getString(cursor.getColumnIndex(C0270a.f64972h));
                if (!TextUtils.isEmpty(string)) {
                    bVarA.c(cVar.b(string));
                }
            }
            return bVarA;
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f64964i, e5, "Failed to create our analytic item from storage.", new Object[0]);
            return null;
        }
    }

    private List<com.salesforce.marketingcloud.analytics.b> b(int i10, @Nullable com.salesforce.marketingcloud.util.c cVar) {
        return b(a(f64961f, a("(%1$s=? OR %1$s=?) AND %2$s=? AND %3$s=? AND %4$s=?", C0270a.f64968d, C0270a.f64973i, "value", C0270a.f64970f), new String[]{String.valueOf(4), String.valueOf(5), String.valueOf(i10), String.valueOf(0), String.valueOf(0)}, null, null, a("%s ASC", "id")), cVar);
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement(c.a("SELECT %s FROM %s", TextUtils.join(",", f64961f), f64960e));
            return true;
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.e(f64964i, e5, "%s is invalid", f64960e);
            return false;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.a
    @NonNull
    public List<com.salesforce.marketingcloud.analytics.b> h(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        return b(a(f64961f, a("%s=? AND %s=?", C0270a.f64973i, C0270a.f64970f), new String[]{String.valueOf(1), String.valueOf(1)}, null, null, a("%s ASC", C0270a.f64967c)), cVar);
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    @VisibleForTesting
    public List<com.salesforce.marketingcloud.analytics.b> b(Cursor cursor, @Nullable com.salesforce.marketingcloud.util.c cVar) {
        List<com.salesforce.marketingcloud.analytics.b> listEmptyList = Collections.emptyList();
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                ArrayList arrayList = new ArrayList();
                do {
                    com.salesforce.marketingcloud.analytics.b bVarA = a(cursor, cVar);
                    if (bVarA != null) {
                        arrayList.add(bVarA);
                    } else {
                        int i10 = cursor.getInt(cursor.getColumnIndex("id"));
                        if (i10 >= 0) {
                            a(a("%s = ?", "id"), new String[]{String.valueOf(i10)});
                        }
                    }
                } while (cursor.moveToNext());
                listEmptyList = arrayList;
            }
            cursor.close();
        }
        return listEmptyList;
    }

    @Override // com.salesforce.marketingcloud.storage.a
    @NonNull
    public List<com.salesforce.marketingcloud.analytics.b> a(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        return b(a(f64961f, a("%s=? AND %s=?", C0270a.f64973i, C0270a.f64970f), new String[]{String.valueOf(0), "1"}, null, null, a("%s ASC", "id")), cVar);
    }

    @Override // com.salesforce.marketingcloud.storage.a
    @NonNull
    public List<com.salesforce.marketingcloud.analytics.b> b(@NonNull Region region, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        return b(a(f64961f, a("(%1$s=? OR %1$s=?) AND %2$s LIKE ? AND %3$s=?", C0270a.f64968d, C0270a.f64969e, C0270a.f64970f), new String[]{String.valueOf(13), String.valueOf(11), a("%%%s%%", region.id()), String.valueOf(0)}), cVar);
    }

    private void a(int i10, int i11, int i12) throws Exception {
        i(a("%s IN ( SELECT %s FROM %s WHERE %s=%d ORDER BY %s ASC LIMIT %d )", "id", "id", f64960e, C0270a.f64973i, Integer.valueOf(i12), "id", Integer.valueOf((i10 + 1) - i11)));
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f64962g);
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS analytic_item");
    }

    @Override // com.salesforce.marketingcloud.storage.a
    public void a(com.salesforce.marketingcloud.analytics.b bVar, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        int i10 = bVar.j() == 0 ? 0 : 1;
        int iH = h(i10);
        if (iH + 1 > 1000) {
            a(iH, 1000, i10);
        }
        bVar.a((int) a(c(bVar, cVar)));
    }
}

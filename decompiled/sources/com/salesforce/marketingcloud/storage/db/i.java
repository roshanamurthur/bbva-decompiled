package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.messages.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
public final class i extends b implements com.salesforce.marketingcloud.storage.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65000e = "messages";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f65002g = "CREATE TABLE messages (id VARCHAR PRIMARY KEY, title VARCHAR, alert VARCHAR, sound VARCHAR, mediaUrl VARCHAR, mediaAlt VARCHAR, open_direct VARCHAR, start_date VARCHAR, end_date VARCHAR, message_type INTEGER, content_type INTEGER, url VARCHAR, custom VARCHAR, keys VARCHAR, period_show_count INTEGER, last_shown_date VARCHAR, next_allowed_show VARCHAR, show_count INTEGER, message_limit INTEGER, rolling_period SMALLINT, period_type INTEGER, number_of_periods INTEGER, messages_per_period INTEGER, proximity INTEGER, notify_id INTEGER );";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f65001f = {"id", "title", "alert", "sound", a.f65008e, a.f65009f, a.f65010g, "start_date", "end_date", "message_type", "content_type", "url", "custom", "keys", a.f65017o, a.f65019q, a.f65020r, a.f65018p, a.f65021s, a.f65022t, a.f65023u, a.f65024v, a.f65025w, a.f65026x, a.f65027y};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f65003h = com.salesforce.marketingcloud.g.a("MessageDbStorage");

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f65004a = "id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f65005b = "title";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f65006c = "alert";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f65007d = "sound";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f65008e = "mediaUrl";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f65009f = "mediaAlt";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f65010g = "open_direct";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f65011h = "start_date";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f65012i = "end_date";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f65013j = "message_type";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f65014k = "content_type";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f65015l = "url";
        public static final String m = "custom";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f65016n = "keys";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f65017o = "period_show_count";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f65018p = "show_count";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f65019q = "last_shown_date";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f65020r = "next_allowed_show";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f65021s = "message_limit";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f65022t = "rolling_period";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String f65023u = "period_type";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String f65024v = "number_of_periods";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String f65025w = "messages_per_period";

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f65026x = "proximity";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f65027y = "notify_id";
    }

    public i(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    private static ContentValues b(Message message, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", message.id());
        contentValues.put("title", cVar.a(message.title()));
        contentValues.put("alert", cVar.a(message.alert()));
        contentValues.put("sound", message.sound());
        if (message.media() != null) {
            contentValues.put(a.f65008e, cVar.a(message.media().url()));
            contentValues.put(a.f65009f, cVar.a(message.media().altText()));
        }
        contentValues.put("start_date", com.salesforce.marketingcloud.util.l.a(message.startDateUtc()));
        contentValues.put("end_date", com.salesforce.marketingcloud.util.l.a(message.endDateUtc()));
        contentValues.put("message_type", Integer.valueOf(message.messageType()));
        contentValues.put("content_type", Integer.valueOf(message.contentType()));
        contentValues.put("url", cVar.a(message.url()));
        contentValues.put("custom", cVar.a(message.custom()));
        contentValues.put(a.f65025w, Integer.valueOf(message.messagesPerPeriod()));
        contentValues.put(a.f65024v, Integer.valueOf(message.numberOfPeriods()));
        contentValues.put(a.f65023u, Integer.valueOf(message.periodType()));
        contentValues.put(a.f65022t, Integer.valueOf(message.isRollingPeriod() ? 1 : 0));
        contentValues.put(a.f65021s, Integer.valueOf(message.messageLimit()));
        contentValues.put(a.f65026x, Integer.valueOf(message.proximity()));
        contentValues.put(a.f65010g, cVar.a(message.openDirect()));
        contentValues.put("keys", cVar.a(com.salesforce.marketingcloud.util.l.a(message.customKeys())));
        contentValues.put(a.f65020r, com.salesforce.marketingcloud.util.l.a(com.salesforce.marketingcloud.internal.f.b(message)));
        contentValues.put(a.f65017o, Integer.valueOf(com.salesforce.marketingcloud.internal.f.d(message)));
        contentValues.put(a.f65027y, Integer.valueOf(com.salesforce.marketingcloud.internal.f.c(message)));
        contentValues.put(a.f65018p, Integer.valueOf(com.salesforce.marketingcloud.internal.f.e(message)));
        contentValues.put(a.f65019q, com.salesforce.marketingcloud.util.l.a(com.salesforce.marketingcloud.internal.f.a(message)));
        return contentValues;
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement(c.a("SELECT %s FROM %s", TextUtils.join(",", f65001f), "messages"));
            return true;
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.e(f65003h, e5, "%s is invalid", "messages");
            return false;
        }
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
            com.salesforce.marketingcloud.g.b(f65003h, e5, "Unable to recover %s", "messages");
            return zC;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.k
    public int a(@NonNull String str) {
        return a(a("%s = ?", "id"), new String[]{str});
    }

    @Override // com.salesforce.marketingcloud.storage.k
    public int f(int i10) {
        return a(a("%s = ?", "message_type"), new String[]{String.valueOf(i10)});
    }

    @Override // com.salesforce.marketingcloud.storage.k
    @NonNull
    public List<Message> j(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        List<Message> listEmptyList = Collections.emptyList();
        Cursor cursorA = a(f65001f, a(3, 4));
        if (cursorA != null) {
            if (cursorA.moveToFirst()) {
                ArrayList arrayList = new ArrayList(cursorA.getCount());
                do {
                    Message messageB = d.b(cursorA, cVar);
                    if (messageB != null) {
                        arrayList.add(messageB);
                    }
                } while (cursorA.moveToNext());
                listEmptyList = arrayList;
            }
            cursorA.close();
        }
        return listEmptyList;
    }

    @Override // com.salesforce.marketingcloud.storage.k
    @NonNull
    public List<Message> k(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        List<Message> listEmptyList = Collections.emptyList();
        Cursor cursorA = a(f65001f, a(5));
        if (cursorA != null) {
            if (cursorA.moveToFirst()) {
                ArrayList arrayList = new ArrayList(cursorA.getCount());
                do {
                    Message messageB = d.b(cursorA, cVar);
                    if (messageB != null) {
                        arrayList.add(messageB);
                    }
                } while (cursorA.moveToNext());
                listEmptyList = arrayList;
            }
            cursorA.close();
        }
        return listEmptyList;
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return "messages";
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f65002g);
    }

    @Override // com.salesforce.marketingcloud.storage.k
    public int a(@NonNull String str, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.f65027y, Integer.valueOf(i10));
        return a(contentValues, a("%s = ?", "id"), new String[]{str});
    }

    @Override // com.salesforce.marketingcloud.storage.k
    public Message a(@NonNull String str, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        Cursor cursorA = a(f65001f, a("%s = ?", "id"), new String[]{str}, null, null, null, "1");
        Message messageB = null;
        if (cursorA != null) {
            messageB = cursorA.moveToFirst() ? d.b(cursorA, cVar) : null;
            cursorA.close();
        }
        return messageB;
    }

    private static String a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    private String a(int... iArr) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (int i10 : iArr) {
            if (z10) {
                sb2.append("message_type IN(");
                z10 = false;
            } else {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(i10);
        }
        sb2.append(");");
        return sb2.toString();
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS messages");
    }

    @Override // com.salesforce.marketingcloud.storage.k
    public void a(@NonNull Message message, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        ContentValues contentValuesB = b(message, cVar);
        if (a(contentValuesB, a("%s = ?", "id"), new String[]{message.id()}) == 0) {
            a(contentValuesB);
        }
    }
}

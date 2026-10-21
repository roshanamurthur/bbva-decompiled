package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.registration.Registration;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
public final class k extends b implements com.salesforce.marketingcloud.storage.m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65031e = "registration";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f65032f = {"id", a.f65035b, a.f65036c, a.f65037d, a.f65038e, a.f65039f, a.f65040g, a.f65041h, a.f65042i, a.f65043j, a.f65044k, a.f65045l, a.m, a.f65047o, "device_id", a.f65049q, a.f65050r, a.f65051s, "locale"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f65033g = "CREATE TABLE registration (id INTEGER PRIMARY KEY AUTOINCREMENT, platform VARCHAR, subscriber_key VARCHAR, et_app_id VARCHAR, timezone INTEGER, dst SMALLINT, tags VARCHAR, attributes VARCHAR, platform_version VARCHAR, push_enabled SMALLINT, location_enabled SMALLINT, proximity_enabled SMALLINT, hwid VARCHAR, system_token VARCHAR, device_id VARCHAR, app_version VARCHAR, sdk_version VARCHAR, signed_string VARCHAR, locale VARCHAR );";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f65034a = "id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f65035b = "platform";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f65036c = "subscriber_key";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f65037d = "et_app_id";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f65038e = "timezone";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f65039f = "dst";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f65040g = "tags";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f65041h = "attributes";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f65042i = "platform_version";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f65043j = "push_enabled";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f65044k = "location_enabled";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f65045l = "proximity_enabled";
        public static final String m = "hwid";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f65046n = "locale";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f65047o = "system_token";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f65048p = "device_id";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f65049q = "app_version";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f65050r = "sdk_version";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f65051s = "signed_string";
    }

    public k(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    private static String a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    private static ContentValues c(Registration registration, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.f65036c, cVar.a(registration.contactKey()));
        contentValues.put(a.f65051s, cVar.a(registration.signedString()));
        contentValues.put(a.f65037d, cVar.a(registration.appId()));
        contentValues.put(a.f65047o, cVar.a(registration.systemToken()));
        contentValues.put(a.f65040g, cVar.a(com.salesforce.marketingcloud.util.l.a(registration.tags())));
        contentValues.put(a.f65041h, cVar.a(com.salesforce.marketingcloud.util.l.a(registration.attributes())));
        contentValues.put("device_id", registration.deviceId());
        contentValues.put(a.f65035b, registration.platform());
        contentValues.put(a.f65038e, Integer.valueOf(registration.timeZone()));
        contentValues.put(a.f65039f, Integer.valueOf(registration.dst() ? 1 : 0));
        contentValues.put(a.f65042i, registration.platformVersion());
        contentValues.put(a.f65043j, Integer.valueOf(registration.pushEnabled() ? 1 : 0));
        contentValues.put(a.f65044k, Integer.valueOf(registration.locationEnabled() ? 1 : 0));
        contentValues.put(a.f65045l, Integer.valueOf(registration.proximityEnabled() ? 1 : 0));
        contentValues.put(a.m, registration.hwid());
        contentValues.put("locale", registration.locale());
        contentValues.put(a.f65049q, registration.appVersion());
        contentValues.put(a.f65050r, registration.sdkVersion());
        return contentValues;
    }

    @Override // com.salesforce.marketingcloud.storage.m
    public int b(Registration registration, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        return a(c(registration, cVar), a("%s = ?", "id"), new String[]{String.valueOf(com.salesforce.marketingcloud.internal.k.a(registration))});
    }

    @Override // com.salesforce.marketingcloud.storage.m
    public int e() {
        return i(null);
    }

    @Override // com.salesforce.marketingcloud.storage.m
    public int g() {
        return i(a("%1$s NOT IN ( SELECT %1$s FROM ( SELECT %1$s FROM %2$s ORDER BY %1$s DESC LIMIT 1))", "id", o()));
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return f65031e;
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS registration");
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f65033g);
    }

    public static boolean c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement(a("SELECT %s FROM %s", TextUtils.join(",", f65032f), f65031e));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.m
    @Nullable
    public Registration e(@NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        Cursor cursorA = a(f65032f, null, null, null, null, a("%s DESC", "id"), "1");
        Registration registrationD = null;
        if (cursorA != null) {
            registrationD = cursorA.moveToFirst() ? d.d(cursorA, cVar) : null;
            cursorA.close();
        }
        return registrationD;
    }

    @Override // com.salesforce.marketingcloud.storage.m
    public void a(Registration registration, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        com.salesforce.marketingcloud.internal.k.a(registration, (int) a(c(registration, cVar)));
    }
}

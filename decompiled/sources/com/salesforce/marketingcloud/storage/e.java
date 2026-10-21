package com.salesforce.marketingcloud.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import android.preference.PreferenceManager;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
abstract class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final int f65077d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f65078e = "DEFAULT_SHARED_PREFERENCES";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f65079f = "et_207_preference_migration_complete";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f65081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f65082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final String f65076c = com.salesforce.marketingcloud.g.a("Storage");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static AtomicBoolean f65080g = new AtomicBoolean(false);

    public e(@NonNull String str, @NonNull String str2) {
        this.f65081a = (String) com.salesforce.marketingcloud.util.j.a((String) com.salesforce.marketingcloud.util.j.a(str, "Application ID is null."), "Application ID is empty.");
        this.f65082b = (String) com.salesforce.marketingcloud.util.j.a((String) com.salesforce.marketingcloud.util.j.a(str2, "Access Token is null."), "Access Token is empty.");
    }

    @Nullable
    private Object a(@NonNull com.salesforce.marketingcloud.util.c cVar, String str, Type type) {
        SharedPreferences sharedPreferences = a().getSharedPreferences("ETPush", 0);
        String str2 = null;
        try {
            String string = sharedPreferences.getString(String.format("%s_enc", str), null);
            if (string == null) {
                string = sharedPreferences.getString(str, null);
            }
            if (string != null) {
                try {
                    string = cVar.b(string);
                    com.salesforce.marketingcloud.g.c(f65076c, "Found encrypted value for %s", str);
                } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
                    com.salesforce.marketingcloud.g.c(f65076c, "Found unencrypted value for %s", str);
                }
            }
            str2 = string;
        } catch (Exception unused2) {
        }
        return str2 != null ? str2 : a(str, type);
    }

    private void c(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        Map<String, String> mapC;
        String[] strArr = {c.f64950c, c.f64949b, c.f64951d};
        for (int i10 = 0; i10 < 3; i10++) {
            String str = strArr[i10];
            try {
                String str2 = f65076c;
                com.salesforce.marketingcloud.g.c(str2, "Migrating %s ...", str);
                Object objA = a(cVar, str, String.class);
                if (c.f64949b.equals(str) && (mapC = com.salesforce.marketingcloud.util.l.c((String) objA)) != null) {
                    mapC.remove("_ETSDKVersion");
                    objA = com.salesforce.marketingcloud.util.l.a(mapC);
                }
                if (objA == null || AbstractJsonLexerKt.NULL.equals(objA)) {
                    com.salesforce.marketingcloud.g.c(str2, "Value was \"null\" and will not be migrated.", new Object[0]);
                } else {
                    com.salesforce.marketingcloud.g.c(str2, "Writing %s to encrypted preferences ...", str);
                    c().putString(str, String.valueOf(objA));
                }
                com.salesforce.marketingcloud.g.c(str2, "Done with %s.", str);
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(f65076c, e5, "Unable to migrate %s", str);
            }
        }
    }

    @NonNull
    private String d() {
        return com.salesforce.marketingcloud.util.l.e(Settings.Secure.getString(a().getContentResolver(), "android_id") + Constant.DASH_STRING + a().getPackageName());
    }

    public abstract Context a();

    public abstract void a(Context context, int i10, int i11);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract com.salesforce.marketingcloud.util.c b();

    public final void b(Context context, int i10, int i11) {
        String[] strArrDatabaseList;
        if (i10 != -1 || (strArrDatabaseList = context.databaseList()) == null) {
            return;
        }
        for (String str : strArrDatabaseList) {
            if ("etdb.db".equals(str)) {
                a(context, this.f65081a, this.f65082b);
                return;
            }
        }
    }

    public abstract c c();

    public abstract SQLiteOpenHelper e();

    public abstract SharedPreferences f();

    @Nullable
    private Object a(String str, Type type) {
        String[] strArr = {"ETPush", "et_registration_cache", "~!Registration", "~!ETPush", "~!ETLocationManager", "etpushSDK@ETPush", "etpushsdk@ETLocationManager", f65078e};
        for (int i10 = 0; i10 < 8; i10++) {
            String str2 = strArr[i10];
            SharedPreferences defaultSharedPreferences = f65078e.equals(str2) ? PreferenceManager.getDefaultSharedPreferences(a()) : a().getSharedPreferences(str2, 0);
            if (defaultSharedPreferences.contains(str)) {
                try {
                    if (type == Boolean.class) {
                        return Boolean.valueOf(defaultSharedPreferences.getBoolean(str, false));
                    }
                    if (type == String.class) {
                        return defaultSharedPreferences.getString(str, null);
                    }
                } catch (ClassCastException unused) {
                }
            }
        }
        return null;
    }

    private void b(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        boolean zBooleanValue;
        SharedPreferences.Editor editorEdit = f().edit();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("et_geo_enabled_key", Boolean.class);
        arrayMap.put("et_proximity_enabled_key", Boolean.class);
        arrayMap.put("et_push_enabled", Boolean.class);
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Type type = (Type) entry.getValue();
            String str2 = f65076c;
            com.salesforce.marketingcloud.g.c(str2, "Migrating %s ...", str);
            try {
                Object objA = a(cVar, str, type);
                if (objA != null) {
                    if (type == Boolean.class) {
                        if (objA instanceof Boolean) {
                            zBooleanValue = ((Boolean) objA).booleanValue();
                        } else if (objA instanceof String) {
                            zBooleanValue = Boolean.valueOf((String) objA).booleanValue();
                        } else {
                            com.salesforce.marketingcloud.g.c(str2, "Unknown Type for %s. Preference will not be migrated.", str);
                        }
                        editorEdit.putBoolean(str, zBooleanValue);
                    } else {
                        com.salesforce.marketingcloud.g.c(str2, "Key '%s' with value of '%s' was not written to preferences.", str, objA);
                    }
                }
                com.salesforce.marketingcloud.g.c(str2, "Done with %s.", str);
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(f65076c, e5, "Unable to migrate %s", str);
            }
        }
        editorEdit.apply();
    }

    private void a(Context context, String str, String str2) {
        try {
            try {
                boolean andSet = f65080g.getAndSet(true);
                boolean z10 = f().getBoolean(f65079f, false);
                if (!andSet && !z10) {
                    com.salesforce.marketingcloud.util.i iVar = new com.salesforce.marketingcloud.util.i(context, str, str2, d());
                    try {
                        iVar.b(context.getSharedPreferences("ETPush", 0).getString("et_device_id_cache_enc", null));
                        a(iVar);
                        com.salesforce.marketingcloud.g.c(f65076c, "Old data migrations completed without exception.", new Object[0]);
                    } catch (Exception unused) {
                        com.salesforce.marketingcloud.g.a(f65076c, "Unable to verify old encryption.  Moving on without migrating data.", new Object[0]);
                    }
                }
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(f65076c, e5, "Data migration failed", new Object[0]);
            }
        } finally {
            f().edit().putBoolean(f65079f, true).apply();
            f65080g.set(false);
        }
    }

    public final void a(@NonNull com.salesforce.marketingcloud.util.c cVar) throws GeneralSecurityException, UnsupportedEncodingException {
        String str = f65076c;
        com.salesforce.marketingcloud.g.c(str, "Migrating SharedPreferences ...", new Object[0]);
        c(cVar);
        b(cVar);
        com.salesforce.marketingcloud.g.c(str, "Finished migrating SharedPreferences.", new Object[0]);
    }
}

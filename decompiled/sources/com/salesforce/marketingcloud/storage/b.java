package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
public abstract class b extends e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final String f64942k = "create_date";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f64943l = "storagedb.db";
    private static final String m = "ETSharedPrefs";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f64944n = "mcsdk_%s";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final String f64945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final Context f64946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final com.salesforce.marketingcloud.util.c f64947j;

    public b(@NonNull Context context, @NonNull com.salesforce.marketingcloud.util.c cVar, @NonNull String str, @NonNull String str2) {
        super(str, str2);
        this.f64946i = context;
        this.f64947j = cVar;
        this.f64945h = str;
        if (!g() && i() && j()) {
            try {
                h();
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(e.f65076c, e5, "Unable to migrate data to BU specific storage", new Object[0]);
            }
        }
    }

    public static String a(String str) {
        return String.format(Locale.ENGLISH, f64944n, str);
    }

    private boolean g() {
        File databasePath = this.f64946i.getDatabasePath(com.salesforce.marketingcloud.storage.db.l.a(this.f64945h));
        return databasePath != null && databasePath.exists();
    }

    private void h() {
        File databasePath = this.f64946i.getDatabasePath(f64943l);
        if (databasePath != null && databasePath.exists()) {
            try {
                if (!databasePath.renameTo(new File(databasePath.getParent(), com.salesforce.marketingcloud.storage.db.l.a(this.f64945h)))) {
                    com.salesforce.marketingcloud.g.b(e.f65076c, "Unable to rename storagedb.db to BU specific naming scheme", new Object[0]);
                }
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(e.f65076c, e5, "Unable to rename storagedb.db to BU specific naming scheme", new Object[0]);
            }
        }
        File file = new File(this.f64946i.getApplicationInfo().dataDir, "shared_prefs/");
        if (file.exists()) {
            File file2 = new File(file, "ETCustomerPrefs.xml");
            if (file2.exists()) {
                try {
                    if (!file2.renameTo(new File(file, c.a.a(this.f64945h) + ".xml"))) {
                        com.salesforce.marketingcloud.g.b(e.f65076c, "Unable to rename ETCustomerPrefs.xml to BU specific naming scheme", new Object[0]);
                    }
                } catch (Exception e7) {
                    com.salesforce.marketingcloud.g.b(e.f65076c, e7, "Unable to rename ETCustomerPrefs.xml to BU specific naming scheme", new Object[0]);
                }
            }
            File file3 = new File(file, "ETSharedPrefs.xml");
            if (file3.exists()) {
                try {
                    if (file3.renameTo(new File(file, a(this.f64945h) + ".xml"))) {
                        return;
                    }
                    com.salesforce.marketingcloud.g.b(e.f65076c, "Unable to rename ETSharedPrefs.xml to BU specific naming scheme", new Object[0]);
                } catch (Exception e10) {
                    com.salesforce.marketingcloud.g.b(e.f65076c, e10, "Unable to rename ETSharedPrefs.xml to BU specific naming scheme", new Object[0]);
                }
            }
        }
    }

    private boolean i() {
        File databasePath = this.f64946i.getDatabasePath(f64943l);
        return databasePath != null && databasePath.exists();
    }

    private boolean j() {
        return a(this.f64946i.getSharedPreferences(m, 0));
    }

    public abstract boolean a(SharedPreferences sharedPreferences);
}

package com.huawei.hms.feature.install;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hms.feature.utils.Logger;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50388a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50389b = "key_deferred_uninstall_modules";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f50390c = "hms_df_uninstall_feature";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f50391d;

    public a(Context context) {
        this.f50391d = context;
    }

    private final SharedPreferences b() {
        return this.f50391d.getSharedPreferences(f50390c, 0);
    }

    public final synchronized Set<String> a() {
        try {
        } catch (Exception unused) {
            return new HashSet();
        }
        return b().getStringSet(f50389b, new HashSet());
    }

    public final synchronized void a(Collection<String> collection) {
        Set<String> setA = a();
        Iterator<String> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (setA.remove(it.next())) {
                z10 = true;
            }
        }
        if (z10) {
            try {
                b().edit().putStringSet(f50389b, setA).apply();
            } catch (Exception e5) {
                Logger.w(f50388a, "deleteModules", e5);
            }
        }
    }

    public final synchronized void b(Collection<String> collection) {
        Set<String> setA = a();
        Iterator<String> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (setA.add(it.next())) {
                z10 = true;
            }
        }
        if (z10) {
            try {
                b().edit().putStringSet(f50389b, setA).apply();
            } catch (Exception e5) {
                Logger.w(f50388a, "recordModules", e5);
            }
        }
    }
}

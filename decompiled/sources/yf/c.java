package yf;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: KeysMap.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f94801a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94802b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94803c;

    public c(int i10) {
        this.f94803c = i10;
    }

    public static String b(int i10, String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i10 ? strTrim.substring(0, i10) : strTrim;
    }

    @NonNull
    public final synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f94801a));
    }

    public final synchronized boolean c(String str, String str2) {
        try {
            if (str == null) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String strB = b(this.f94803c, str);
            if (this.f94801a.size() >= this.f94802b && !this.f94801a.containsKey(strB)) {
                Logger.getLogger().w("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f94802b);
                return false;
            }
            String strB2 = b(this.f94803c, str2);
            if (CommonUtils.nullSafeEquals((String) this.f94801a.get(strB), strB2)) {
                return false;
            }
            HashMap map = this.f94801a;
            if (str2 == null) {
                strB2 = "";
            }
            map.put(strB, strB2);
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(Map<String, String> map) {
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strB = b(this.f94803c, key);
                if (this.f94801a.size() < this.f94802b || this.f94801a.containsKey(strB)) {
                    String value = entry.getValue();
                    this.f94801a.put(strB, value == null ? "" : b(this.f94803c, value));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                Logger.getLogger().w("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f94802b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

package com.fasterxml.jackson.core.util;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class InternCache extends ConcurrentHashMap<String, String> {
    public static final InternCache instance = new InternCache();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Object f43151p0;

    public InternCache() {
        super(180, 0.8f, 4);
        this.f43151p0 = new Object();
    }

    public String intern(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.f43151p0) {
                try {
                    if (size() >= 180) {
                        clear();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }
}

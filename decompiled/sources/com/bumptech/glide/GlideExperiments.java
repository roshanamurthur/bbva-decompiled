package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class GlideExperiments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, Object> f38013a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f38014a = new HashMap();
    }

    public GlideExperiments(a aVar) {
        this.f38013a = Collections.unmodifiableMap(new HashMap(aVar.f38014a));
    }

    public boolean isEnabled(Class<Object> cls) {
        return this.f38013a.containsKey(cls);
    }
}

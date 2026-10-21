package com.google.i18n.phonenumbers.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: RegexCache.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends LinkedHashMap<Object, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ RegexCache.a f49344p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RegexCache.a aVar, int i10) {
        super(i10, 0.75f, true);
        this.f49344p0 = aVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Object, Object> entry) {
        return size() > this.f49344p0.f49343b;
    }
}

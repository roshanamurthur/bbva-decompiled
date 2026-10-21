package com.google.i18n.phonenumbers.internal;

import androidx.datastore.preferences.protobuf.e;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class RegexCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<String, Pattern> f49341a;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.google.i18n.phonenumbers.internal.a f49342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49343b;

        public final synchronized void a(Object obj, Pattern pattern) {
            this.f49342a.put(obj, pattern);
        }
    }

    public RegexCache(int i10) {
        a<String, Pattern> aVar = new a<>();
        aVar.f49343b = i10;
        aVar.f49342a = new com.google.i18n.phonenumbers.internal.a(aVar, e.b(i10, 4, 3, 1));
        this.f49341a = aVar;
    }

    public Pattern getPatternForRegex(String str) {
        Object obj;
        a<String, Pattern> aVar = this.f49341a;
        synchronized (aVar) {
            obj = aVar.f49342a.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        this.f49341a.a(str, patternCompile);
        return patternCompile;
    }
}

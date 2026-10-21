package com.bbva.cellscore.reactor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ReactionContainer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f27040a = new HashMap();

    public static String a(Object obj, String str) {
        StringBuilder sbD = androidx.camera.core.impl.utils.c.d(str);
        sbD.append(obj.hashCode());
        return sbD.toString();
    }

    public boolean containsPage(String str, Object obj) {
        return this.f27040a.containsKey(a(obj, str));
    }

    public Set<Map.Entry<String, T>> entrySet() {
        return this.f27040a.entrySet();
    }

    public T get(String str, Object obj) {
        return (T) this.f27040a.get(a(obj, str));
    }

    public void put(String str, Object obj, T t10) {
        this.f27040a.put(a(obj, str), t10);
    }

    public void remove(String str, Object obj) {
        this.f27040a.remove(a(obj, str));
    }

    public Collection<T> values() {
        return this.f27040a.values();
    }
}

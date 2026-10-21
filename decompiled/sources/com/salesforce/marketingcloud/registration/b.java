package com.salesforce.marketingcloud.registration;

import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes11.dex */
class b implements Map<String, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, String> f64871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeMap<String, String> f64872b;

    public b() {
        this.f64871a = new HashMap<>();
        this.f64872b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String get(Object obj) {
        String str = this.f64872b.get(obj);
        if (str != null) {
            return this.f64871a.get(str);
        }
        return null;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String remove(Object obj) {
        return this.f64871a.remove(this.f64872b.remove(obj));
    }

    @Override // java.util.Map
    public void clear() {
        this.f64871a.clear();
        this.f64872b.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f64872b.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f64871a.containsValue(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<Map.Entry<String, String>> entrySet() {
        return this.f64871a.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f64871a.isEmpty();
    }

    @Override // java.util.Map
    @NonNull
    public Set<String> keySet() {
        return this.f64871a.keySet();
    }

    @Override // java.util.Map
    public void putAll(@NonNull Map<? extends String, ? extends String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public int size() {
        return this.f64871a.size();
    }

    @Override // java.util.Map
    @NonNull
    public Collection<String> values() {
        return this.f64871a.values();
    }

    public b(Map<String, String> map) {
        this();
        if (map != null) {
            this.f64871a.putAll(map);
            for (String str : this.f64871a.keySet()) {
                this.f64872b.put(str, str);
            }
        }
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String put(String str, String str2) {
        if (str == null) {
            return null;
        }
        String str3 = this.f64872b.get(str);
        String strRemove = str3 != null ? this.f64871a.remove(str3) : null;
        this.f64872b.put(str, str);
        this.f64871a.put(str, str2);
        return strRemove;
    }
}

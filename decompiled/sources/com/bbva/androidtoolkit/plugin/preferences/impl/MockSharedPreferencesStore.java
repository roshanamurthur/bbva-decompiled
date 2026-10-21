package com.bbva.androidtoolkit.plugin.preferences.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bbva.androidtoolkit.plugin.preferences.PreferencesStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public class MockSharedPreferencesStore implements PreferencesStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f26546a = new HashMap();

    public final Object a(Object obj, @NonNull String str) {
        HashMap map = this.f26546a;
        return map.containsKey(str) ? map.get(str) : obj;
    }

    public final void b(Object obj, @NonNull String str) {
        this.f26546a.put(str, obj);
    }

    @Override // com.bbva.androidtoolkit.plugin.preferences.PreferencesStore
    public Map<String, ?> getAll() {
        return this.f26546a;
    }

    @Override // com.bbva.androidtoolkit.plugin.preferences.PreferencesStore
    public boolean getBoolean(@NonNull String str, boolean z10) {
        return ((Boolean) a(Boolean.valueOf(z10), str)).booleanValue();
    }

    @Override // com.bbva.androidtoolkit.plugin.preferences.PreferencesStore
    public double getDouble(@NonNull String str, double d2) {
        return ((Double) a(Double.valueOf(d2), str)).doubleValue();
    }

    @Override // com.bbva.androidtoolkit.plugin.preferences.PreferencesStore
    public int getInt(@NonNull String str, int i10) {
        return ((Integer) a(Integer.valueOf(i10), str)).intValue();
    }

    @Override // com.bbva.androidtoolkit.plugin.preferences.PreferencesStore
    public long getLong(@NonNull String str, long j10) {
        return ((Long) a(Long.valueOf(j10), str)).longValue();
    }

    @Override // com.bbva.androidtoolkit.plugin.preferences.PreferencesStore
    public String getString(@NonNull String str, String str2) {
        return (String) a(str2, str);
    }

    @Override // com.bbva.androidtoolkit.plugin.preferences.PreferencesStore
    public Set<String> getStringSetNoCipher(@NonNull String str, Set<String> set) {
        return (Set) a(set, str);
    }

    @Override // com.bbva.androidtoolkit.plugin.preferences.PreferencesStore
    public boolean remove(@NonNull String str) {
        return this.f26546a.remove(str) != null;
    }

    @Override // com.bbva.androidtoolkit.plugin.preferences.PreferencesStore
    public boolean removeAll() {
        this.f26546a.clear();
        return true;
    }

    @Override // com.bbva.androidtoolkit.plugin.preferences.PreferencesStore
    public boolean save(@NonNull String str, boolean z10) {
        b(Boolean.valueOf(z10), str);
        return true;
    }

    @Override // com.bbva.androidtoolkit.plugin.preferences.PreferencesStore
    public boolean save(@NonNull String str, String str2) {
        b(str2, str);
        return true;
    }

    @Override // com.bbva.androidtoolkit.plugin.preferences.PreferencesStore
    public boolean save(@NonNull String str, int i10) {
        b(Integer.valueOf(i10), str);
        return true;
    }

    @Override // com.bbva.androidtoolkit.plugin.preferences.PreferencesStore
    public boolean save(@NonNull String str, long j10) {
        b(Long.valueOf(j10), str);
        return true;
    }

    @Override // com.bbva.androidtoolkit.plugin.preferences.PreferencesStore
    public boolean save(@NonNull String str, double d2) {
        b(Double.valueOf(d2), str);
        return true;
    }

    @Override // com.bbva.androidtoolkit.plugin.preferences.PreferencesStore
    public void save(@NonNull String str, Set<String> set) {
        b(set, str);
    }
}

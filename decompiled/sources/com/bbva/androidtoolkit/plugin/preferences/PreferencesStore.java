package com.bbva.androidtoolkit.plugin.preferences;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface PreferencesStore {
    Map<String, ?> getAll();

    boolean getBoolean(@NonNull String str, boolean z10);

    double getDouble(@NonNull String str, double d2);

    int getInt(@NonNull String str, int i10);

    long getLong(@NonNull String str, long j10);

    String getString(@NonNull String str, String str2);

    Set<String> getStringSetNoCipher(@NonNull String str, Set<String> set);

    boolean remove(@NonNull String str);

    boolean removeAll();

    void save(@NonNull String str, Set<String> set);

    boolean save(@NonNull String str, double d2);

    boolean save(@NonNull String str, int i10);

    boolean save(@NonNull String str, long j10);

    boolean save(@NonNull String str, String str2);

    boolean save(@NonNull String str, boolean z10);
}

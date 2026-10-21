package com.bbva.tohu.android.core.utils;

import android.content.SharedPreferences;
import androidx.core.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class SharedPreferencesManager {
    private SharedPreferences sharedPreferences;

    public SharedPreferencesManager(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public <T> List<Pair<String, T>> buildTuple(String str, T t10) {
        return Arrays.asList(Pair.create(str, t10));
    }

    public boolean deleteAll() {
        return this.sharedPreferences.edit().clear().commit();
    }

    public void removeEntryByKey(String str) {
        this.sharedPreferences.edit().remove(str).commit();
    }

    public Boolean retrieveBoolean(String str) {
        return Boolean.valueOf(this.sharedPreferences.getBoolean(str, false));
    }

    public int retrieveInt(String str) {
        return this.sharedPreferences.getInt(str, 0);
    }

    public String retrieveString(String str) {
        return this.sharedPreferences.getString(str, null);
    }

    public Set<String> retrieveStringSet(String str) {
        return this.sharedPreferences.getStringSet(str, null);
    }

    public <T> void store(List<Pair<String, T>> list) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        for (Pair<String, T> pair : list) {
            String str = pair.first;
            T t10 = pair.second;
            if (t10 == null) {
                editorEdit.putString(str, null);
            } else if (t10.getClass().isAssignableFrom(String.class)) {
                editorEdit.putString(str, (String) t10);
            } else if (t10.getClass().isAssignableFrom(Integer.class)) {
                editorEdit.putInt(str, ((Integer) t10).intValue());
            } else {
                if (!t10.getClass().isAssignableFrom(Boolean.class)) {
                    throw new TypeNotPresentException(t10.getClass().getName(), new RuntimeException("Not implemented sharedProperties storage for class "));
                }
                editorEdit.putBoolean(str, ((Boolean) t10).booleanValue());
            }
        }
        editorEdit.commit();
    }

    public void storeSetString(String str, Set<String> set) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putStringSet(str, set);
        editorEdit.commit();
    }

    public void storeString(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    public String retrieveString(String str, String str2) {
        return this.sharedPreferences.getString(str, str2);
    }
}

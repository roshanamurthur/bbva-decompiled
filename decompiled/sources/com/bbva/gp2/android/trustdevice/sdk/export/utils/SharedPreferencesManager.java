package com.bbva.gp2.android.trustdevice.sdk.export.utils;

import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import bk.d;
import com.bbva.component.dm.naturalauth.Constants;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedPreferencesManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J3\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\t0\u00070\u0006\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u0002H\t¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\bJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bJ\u0018\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bJ\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00182\u0006\u0010\n\u001a\u00020\bJ*\u0010\u0019\u001a\u00020\u0010\"\b\b\u0000\u0010\t*\u00020\u00012\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\t0\u00070\u0006J\u001c\u0010\u001b\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0018J\u0016\u0010\u001d\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/utils/SharedPreferencesManager;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "buildTuple", "", "Lkotlin/Pair;", "", ExifInterface.GPS_DIRECTION_TRUE, "key", "value", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;", Constants.deleteAll, "", "removeEntryByKey", "", "retrieveBoolean", "(Ljava/lang/String;)Ljava/lang/Boolean;", "retrieveInt", "", "retrieveString", "defaultValue", "retrieveStringSet", "", "store", "propertyTuples", "storeSetString", "stringSet", "storeString", "stringValue", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class SharedPreferencesManager {

    @NotNull
    private final SharedPreferences sharedPreferences;

    public SharedPreferencesManager(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    @NotNull
    public final <T> List<Pair<String, T>> buildTuple(@NotNull String key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        return d.listOf(new Pair(key, value));
    }

    public boolean deleteAll() {
        return this.sharedPreferences.edit().clear().commit();
    }

    public final void removeEntryByKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.sharedPreferences.edit().remove(key).commit();
    }

    @Nullable
    public final Boolean retrieveBoolean(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Boolean.valueOf(this.sharedPreferences.getBoolean(key, false));
    }

    public final int retrieveInt(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sharedPreferences.getInt(key, 0);
    }

    @Nullable
    public final String retrieveString(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sharedPreferences.getString(key, null);
    }

    @Nullable
    public final Set<String> retrieveStringSet(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sharedPreferences.getStringSet(key, null);
    }

    public final <T> void store(@NotNull List<? extends Pair<String, ? extends T>> propertyTuples) {
        Intrinsics.checkNotNullParameter(propertyTuples, "propertyTuples");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        for (Pair<String, ? extends T> pair : propertyTuples) {
            String first = pair.getFirst();
            T second = pair.getSecond();
            if (second.getClass().isAssignableFrom(String.class)) {
                Intrinsics.checkNotNull(second, "null cannot be cast to non-null type kotlin.String");
                editorEdit.putString(first, (String) second);
            } else if (second.getClass().isAssignableFrom(Integer.TYPE)) {
                Intrinsics.checkNotNull(second, "null cannot be cast to non-null type kotlin.Int");
                editorEdit.putInt(first, ((Integer) second).intValue());
            } else {
                if (!second.getClass().isAssignableFrom(Boolean.TYPE)) {
                    throw new TypeNotPresentException(second.getClass().getName(), new RuntimeException("Not implemented sharedProperties storage for class "));
                }
                Intrinsics.checkNotNull(second, "null cannot be cast to non-null type kotlin.Boolean");
                editorEdit.putBoolean(first, ((Boolean) second).booleanValue());
            }
        }
        editorEdit.commit();
    }

    public final void storeSetString(@NotNull String key, @NotNull Set<String> stringSet) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(stringSet, "stringSet");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putStringSet(key, stringSet);
        editorEdit.commit();
    }

    public final void storeString(@NotNull String key, @NotNull String stringValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(stringValue, "stringValue");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString(key, stringValue);
        editorEdit.commit();
    }

    @Nullable
    public final String retrieveString(@NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return this.sharedPreferences.getString(key, defaultValue);
    }
}

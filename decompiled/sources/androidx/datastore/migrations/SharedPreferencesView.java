package androidx.datastore.migrations;

import android.content.SharedPreferences;
import bk.p;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedPreferencesMigration.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fJ\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fJ\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesView;", "", "", "key", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "defValue", "getBoolean", "", "getFloat", "", "getInt", "", "getLong", "getString", "", "defValues", "getStringSet", "", "getAll", "Landroid/content/SharedPreferences;", "prefs", "keySet", "<init>", "(Landroid/content/SharedPreferences;Ljava/util/Set;)V", "datastore_release"}, k = 1, mv = {1, 5, 1})
public final class SharedPreferencesView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f20759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Set<String> f20760b;

    public SharedPreferencesView(@NotNull SharedPreferences prefs, @Nullable Set<String> set) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.f20759a = prefs;
        this.f20760b = set;
    }

    public static /* synthetic */ String getString$default(SharedPreferencesView sharedPreferencesView, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return sharedPreferencesView.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(SharedPreferencesView sharedPreferencesView, String str, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        return sharedPreferencesView.getStringSet(str, set);
    }

    public final void a(String str) {
        Set<String> set = this.f20760b;
        if (set != null && !set.contains(str)) {
            throw new IllegalStateException(Intrinsics.stringPlus("Can't access key outside migration: ", str).toString());
        }
    }

    public final boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        a(key);
        return this.f20759a.contains(key);
    }

    @NotNull
    public final Map<String, Object> getAll() {
        Map<String, ?> all = this.f20759a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.f20760b;
            if (set == null || set.contains(key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = CollectionsKt___CollectionsKt.toSet((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean getBoolean(@NotNull String key, boolean defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        a(key);
        return this.f20759a.getBoolean(key, defValue);
    }

    public final float getFloat(@NotNull String key, float defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        a(key);
        return this.f20759a.getFloat(key, defValue);
    }

    public final int getInt(@NotNull String key, int defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        a(key);
        return this.f20759a.getInt(key, defValue);
    }

    public final long getLong(@NotNull String key, long defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        a(key);
        return this.f20759a.getLong(key, defValue);
    }

    @Nullable
    public final String getString(@NotNull String key, @Nullable String defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        a(key);
        return this.f20759a.getString(key, defValue);
    }

    @Nullable
    public final Set<String> getStringSet(@NotNull String key, @Nullable Set<String> defValues) {
        Intrinsics.checkNotNullParameter(key, "key");
        a(key);
        Set<String> stringSet = this.f20759a.getStringSet(key, defValues);
        if (stringSet == null) {
            return null;
        }
        return CollectionsKt___CollectionsKt.toMutableSet(stringSet);
    }
}

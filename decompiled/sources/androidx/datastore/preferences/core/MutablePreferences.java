package androidx.datastore.preferences.core;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\t\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010-\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00100(\u0012\b\b\u0002\u0010.\u001a\u00020\u000b¢\u0006\u0004\b/\u00100J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u001d\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002J&\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J,\u0010\u0013\u001a\u00020\u0002\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u00020\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0011\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0001H\u0086\u0002J\u0015\u0010\u0018\u001a\u00020\u00022\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0086\u0002J\u0015\u0010\u001b\u001a\u00020\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0086\u0002J)\u0010\u001e\u001a\u00020\u00022\u001a\u0010\u001d\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00190\u001c\"\u0006\u0012\u0002\b\u00030\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b \u0010\u000eJ\u0006\u0010!\u001a\u00020\u0002J\u0013\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010%\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020&H\u0016R*\u0010-\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00100(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00061"}, d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "Landroidx/datastore/preferences/core/Preferences;", "", "checkNotFrozen$datastore_preferences_core", "()V", "checkNotFrozen", "freeze$datastore_preferences_core", "freeze", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/preferences/core/Preferences$Key;", "key", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "get", "(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;", "", "", "asMap", "value", SetCommand.ID, "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", "setUnchecked$datastore_preferences_core", "setUnchecked", "prefs", "plusAssign", "Landroidx/datastore/preferences/core/Preferences$Pair;", "pair", "minusAssign", "", "pairs", "putAll", "([Landroidx/datastore/preferences/core/Preferences$Pair;)V", RemoveCommand.ID, ClearCommand.ID, "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "a", "Ljava/util/Map;", "getPreferencesMap$datastore_preferences_core", "()Ljava/util/Map;", "preferencesMap", "startFrozen", "<init>", "(Ljava/util/Map;Z)V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
public final class MutablePreferences extends Preferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<Preferences.Key<?>, Object> preferencesMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f20774b;

    /* JADX INFO: compiled from: Preferences.kt */
    public static final class a extends Lambda implements Function1<Map.Entry<Preferences.Key<?>, Object>, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f20775p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry<Preferences.Key<?>, Object> entry) {
            Map.Entry<Preferences.Key<?>, Object> entry2 = entry;
            Intrinsics.checkNotNullParameter(entry2, "entry");
            return "  " + entry2.getKey().getName() + " = " + entry2.getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutablePreferences() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    @NotNull
    public Map<Preferences.Key<?>, Object> asMap() {
        Map<Preferences.Key<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.preferencesMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    public final void checkNotFrozen$datastore_preferences_core() {
        if (!(!this.f20774b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final void clear() {
        checkNotFrozen$datastore_preferences_core();
        this.preferencesMap.clear();
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public <T> boolean contains(@NotNull Preferences.Key<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.preferencesMap.containsKey(key);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof MutablePreferences)) {
            return false;
        }
        return Intrinsics.areEqual(this.preferencesMap, ((MutablePreferences) other).preferencesMap);
    }

    public final void freeze$datastore_preferences_core() {
        this.f20774b.set(true);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    @Nullable
    public <T> T get(@NotNull Preferences.Key<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.preferencesMap.get(key);
    }

    @NotNull
    public final Map<Preferences.Key<?>, Object> getPreferencesMap$datastore_preferences_core() {
        return this.preferencesMap;
    }

    public int hashCode() {
        return this.preferencesMap.hashCode();
    }

    public final void minusAssign(@NotNull Preferences.Key<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core();
        remove(key);
    }

    public final void plusAssign(@NotNull Preferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        checkNotFrozen$datastore_preferences_core();
        this.preferencesMap.putAll(prefs.asMap());
    }

    public final void putAll(@NotNull Preferences.Pair<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        checkNotFrozen$datastore_preferences_core();
        for (Preferences.Pair<?> pair : pairs) {
            setUnchecked$datastore_preferences_core(pair.getKey$datastore_preferences_core(), pair.getValue$datastore_preferences_core());
        }
    }

    public final <T> T remove(@NotNull Preferences.Key<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core();
        return (T) this.preferencesMap.remove(key);
    }

    public final <T> void set(@NotNull Preferences.Key<T> key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        setUnchecked$datastore_preferences_core(key, value);
    }

    public final void setUnchecked$datastore_preferences_core(@NotNull Preferences.Key<?> key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core();
        if (value == null) {
            remove(key);
            return;
        }
        boolean z10 = value instanceof Set;
        Map<Preferences.Key<?>, Object> map = this.preferencesMap;
        if (!z10) {
            map.put(key, value);
            return;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt___CollectionsKt.toSet((Iterable) value));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(key, setUnmodifiableSet);
    }

    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f20775p0, 24, null);
    }

    public /* synthetic */ MutablePreferences(Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    public final void plusAssign(@NotNull Preferences.Pair<?> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        checkNotFrozen$datastore_preferences_core();
        putAll(pair);
    }

    public MutablePreferences(@NotNull Map<Preferences.Key<?>, Object> preferencesMap, boolean z10) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.preferencesMap = preferencesMap;
        this.f20774b = new AtomicBoolean(z10);
    }
}

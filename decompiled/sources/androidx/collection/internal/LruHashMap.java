package androidx.collection.internal;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LruHashMap.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u001f\b\u0016\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b\u0017\u0010\u001aJ\u001a\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u0006R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR#\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Landroidx/collection/internal/LruHashMap;", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", PutCommand.ID, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", RemoveCommand.ID, "", "isEmpty", "()Z", "", "", "getEntries", "()Ljava/util/Set;", "entries", "", "initialCapacity", "", "loadFactor", "<init>", "(IF)V", "original", "(Landroidx/collection/internal/LruHashMap;)V", "collection"}, k = 1, mv = {1, 8, 0})
public final class LruHashMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap<K, V> f2538a;

    public LruHashMap() {
        this(0, 0.0f, 3, null);
    }

    @Nullable
    public final V get(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f2538a.get(key);
    }

    @NotNull
    public final Set<Map.Entry<K, V>> getEntries() {
        Set<Map.Entry<K, V>> setEntrySet = this.f2538a.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "map.entries");
        return setEntrySet;
    }

    public final boolean isEmpty() {
        return this.f2538a.isEmpty();
    }

    @Nullable
    public final V put(@NotNull K key, @NotNull V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f2538a.put(key, value);
    }

    @Nullable
    public final V remove(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f2538a.remove(key);
    }

    public LruHashMap(int i10, float f6) {
        this.f2538a = new LinkedHashMap<>(i10, f6, true);
    }

    public /* synthetic */ LruHashMap(int i10, float f6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10, (i11 & 2) != 0 ? 0.75f : f6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LruHashMap(@NotNull LruHashMap<? extends K, V> original) {
        this(0, 0.0f, 3, null);
        Intrinsics.checkNotNullParameter(original, "original");
        for (Map.Entry<? extends K, V> entry : original.getEntries()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}

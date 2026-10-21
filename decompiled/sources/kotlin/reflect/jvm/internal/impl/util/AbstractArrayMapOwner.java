package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ArrayMapOwner.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractArrayMapOwner<K, V> implements Iterable<V>, KMappedMarker {

    /* JADX INFO: compiled from: ArrayMapOwner.kt */
    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f82060a;

        public AbstractArrayMapAccessor(int i10) {
            this.f82060a = i10;
        }

        @Nullable
        public final T extractValue(@NotNull AbstractArrayMapOwner<K, V> thisRef) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            return thisRef.getArrayMap().get(this.f82060a);
        }
    }

    @NotNull
    public abstract ArrayMap<V> getArrayMap();

    @NotNull
    public abstract TypeRegistry<K, V> getTypeRegistry();

    public final boolean isEmpty() {
        return getArrayMap().getSize() == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<V> iterator() {
        return getArrayMap().iterator();
    }

    public abstract void registerComponent(@NotNull String str, @NotNull V v3);

    public final void registerComponent(@NotNull KClass<? extends K> tClass, @NotNull V value) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        Intrinsics.checkNotNullParameter(value, "value");
        String qualifiedName = tClass.getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName);
        registerComponent(qualifiedName, value);
    }
}

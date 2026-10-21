package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class ArrayMap<T> implements Iterable<T>, KMappedMarker {
    public ArrayMap() {
    }

    public /* synthetic */ ArrayMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract T get(int i10);

    public abstract int getSize();

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract void set(int i10, @NotNull T t10);
}

package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class OneElementArrayMap<T> extends ArrayMap<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final T f82076p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f82077q0;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ArrayMap.kt */
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f82078p0 = true;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ OneElementArrayMap<T> f82079q0;

        public AnonymousClass1(OneElementArrayMap<T> oneElementArrayMap) {
            this.f82079q0 = oneElementArrayMap;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f82078p0;
        }

        @Override // java.util.Iterator
        @NotNull
        public T next() {
            if (!this.f82078p0) {
                throw new NoSuchElementException();
            }
            this.f82078p0 = false;
            return this.f82079q0.getValue();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneElementArrayMap(@NotNull T value, int i10) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f82076p0 = value;
        this.f82077q0 = i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    public T get(int i10) {
        if (i10 == this.f82077q0) {
            return this.f82076p0;
        }
        return null;
    }

    public final int getIndex() {
        return this.f82077q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return 1;
    }

    @NotNull
    public final T getValue() {
        return this.f82076p0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i10, @NotNull T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }
}

package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleInternalHelper {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a implements Supplier<NoSuchElementException> {
        private static final /* synthetic */ a[] $VALUES;
        public static final a INSTANCE;

        static {
            a aVar = new a("INSTANCE", 0);
            INSTANCE = aVar;
            $VALUES = new a[]{aVar};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final NoSuchElementException get() throws Throwable {
            return new NoSuchElementException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b implements Function<SingleSource, Publisher> {
        private static final /* synthetic */ b[] $VALUES;
        public static final b INSTANCE;

        static {
            b bVar = new b("INSTANCE", 0);
            INSTANCE = bVar;
            $VALUES = new b[]{bVar};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Publisher apply(SingleSource singleSource) throws Throwable {
            return new SingleToFlowable(singleSource);
        }
    }

    public static final class c<T> implements Iterable<Flowable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Iterable<? extends SingleSource<? extends T>> f77806p0;

        public c(Iterable<? extends SingleSource<? extends T>> iterable) {
            this.f77806p0 = iterable;
        }

        @Override // java.lang.Iterable
        public final Iterator<Flowable<T>> iterator() {
            return new d(this.f77806p0.iterator());
        }
    }

    public static final class d<T> implements Iterator<Flowable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Iterator<? extends SingleSource<? extends T>> f77807p0;

        public d(Iterator<? extends SingleSource<? extends T>> it) {
            this.f77807p0 = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f77807p0.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return new SingleToFlowable(this.f77807p0.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public SingleInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static Supplier<NoSuchElementException> emptyThrower() {
        return a.INSTANCE;
    }

    public static <T> Iterable<? extends Flowable<T>> iterableToFlowable(Iterable<? extends SingleSource<? extends T>> iterable) {
        return new c(iterable);
    }

    public static <T> Function<SingleSource<? extends T>, Publisher<? extends T>> toFlowable() {
        return b.INSTANCE;
    }
}

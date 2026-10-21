package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleInternalHelper {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a implements Callable<NoSuchElementException> {
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

        @Override // java.util.concurrent.Callable
        public final NoSuchElementException call() throws Exception {
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

        @Override // io.reactivex.functions.Function
        public final Publisher apply(SingleSource singleSource) throws Exception {
            return new SingleToFlowable(singleSource);
        }
    }

    public static final class c<T> implements Iterable<Flowable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Iterable<? extends SingleSource<? extends T>> f73528p0;

        public c(Iterable<? extends SingleSource<? extends T>> iterable) {
            this.f73528p0 = iterable;
        }

        @Override // java.lang.Iterable
        public final Iterator<Flowable<T>> iterator() {
            return new d(this.f73528p0.iterator());
        }
    }

    public static final class d<T> implements Iterator<Flowable<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Iterator<? extends SingleSource<? extends T>> f73529p0;

        public d(Iterator<? extends SingleSource<? extends T>> it) {
            this.f73529p0 = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f73529p0.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return new SingleToFlowable(this.f73529p0.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e implements Function<SingleSource, Observable> {
        private static final /* synthetic */ e[] $VALUES;
        public static final e INSTANCE;

        static {
            e eVar = new e("INSTANCE", 0);
            INSTANCE = eVar;
            $VALUES = new e[]{eVar};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }

        @Override // io.reactivex.functions.Function
        public final Observable apply(SingleSource singleSource) throws Exception {
            return new SingleToObservable(singleSource);
        }
    }

    public SingleInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Callable<NoSuchElementException> emptyThrower() {
        return a.INSTANCE;
    }

    public static <T> Iterable<? extends Flowable<T>> iterableToFlowable(Iterable<? extends SingleSource<? extends T>> iterable) {
        return new c(iterable);
    }

    public static <T> Function<SingleSource<? extends T>, Publisher<? extends T>> toFlowable() {
        return b.INSTANCE;
    }

    public static <T> Function<SingleSource<? extends T>, Observable<? extends T>> toObservable() {
        return e.INSTANCE;
    }
}

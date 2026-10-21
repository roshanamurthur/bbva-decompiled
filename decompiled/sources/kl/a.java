package kl;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a<T, K> extends AbstractIterator<T> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Iterator<T> f79367r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Function1<T, K> f79368s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final HashSet<K> f79369t0;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Iterator<? extends T> source, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.f79367r0 = source;
        this.f79368s0 = keySelector;
        this.f79369t0 = new HashSet<>();
    }

    @Override // kotlin.collections.AbstractIterator
    public final void computeNext() {
        T next;
        do {
            Iterator<T> it = this.f79367r0;
            if (!it.hasNext()) {
                done();
                return;
            } else {
                next = it.next();
            }
        } while (!this.f79369t0.add(this.f79368s0.invoke(next)));
        setNext(next);
    }
}

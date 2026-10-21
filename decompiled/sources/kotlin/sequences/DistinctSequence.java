package kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0002¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/DistinctSequence;", ExifInterface.GPS_DIRECTION_TRUE, "K", "Lkotlin/sequences/Sequence;", "", "iterator", "source", "Lkotlin/Function1;", "keySelector", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class DistinctSequence<T, K> implements Sequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Sequence<T> f82122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<T, K> f82123b;

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctSequence(@NotNull Sequence<? extends T> source, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.f82122a = source;
        this.f82123b = keySelector;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new kl.a(this.f82122a.iterator(), this.f82123b);
    }
}

package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0096\u0002J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lkotlin/sequences/a;", "Lkotlin/sequences/Sequence;", "", "Lkotlin/sequences/DropTakeSequence;", "", "iterator", "", "n", "drop", "take", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
final class a implements Sequence, DropTakeSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f82272a = new a();

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator iterator() {
        return EmptyIterator.INSTANCE;
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public a drop(int n7) {
        return f82272a;
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public a take(int n7) {
        return f82272a;
    }
}

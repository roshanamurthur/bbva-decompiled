package bk;

import androidx.appcompat.widget.o1;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.ReversedList;
import kotlin.collections.ReversedListReadOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes12.dex */
public class h extends g {
    @NotNull
    public static final <T> List<T> asReversed(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new ReversedListReadOnly(list);
    }

    @JvmName(name = "asReversedMutable")
    @NotNull
    public static <T> List<T> asReversedMutable(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new ReversedList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reverseElementIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i10) {
        if (new IntRange(0, CollectionsKt__CollectionsKt.getLastIndex(list)).contains(i10)) {
            return CollectionsKt__CollectionsKt.getLastIndex(list) - i10;
        }
        StringBuilder sbC = o1.c("Element index ", i10, " must be in range [");
        sbC.append(new IntRange(0, CollectionsKt__CollectionsKt.getLastIndex(list)));
        sbC.append("].");
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reverseIteratorIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i10) {
        return CollectionsKt__CollectionsKt.getLastIndex(list) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reversePositionIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i10) {
        if (new IntRange(0, list.size()).contains(i10)) {
            return list.size() - i10;
        }
        StringBuilder sbC = o1.c("Position index ", i10, " must be in range [");
        sbC.append(new IntRange(0, list.size()));
        sbC.append("].");
        throw new IndexOutOfBoundsException(sbC.toString());
    }
}

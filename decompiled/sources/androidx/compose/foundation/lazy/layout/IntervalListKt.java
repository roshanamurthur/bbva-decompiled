package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: IntervalList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,216:1\n48#2:217\n523#2:218\n523#2:219\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n*L\n192#1:217\n197#1:218\n206#1:219\n*E\n"})
public final class IntervalListKt {
    public static final int access$binarySearch(MutableVector mutableVector, int i10) {
        int size = mutableVector.getSize() - 1;
        int i11 = 0;
        while (i11 < size) {
            int iA = androidx.appcompat.widget.a.a(size, i11, 2, i11);
            int startIndex = ((IntervalList.Interval) mutableVector.getContent()[iA]).getStartIndex();
            if (startIndex != i10) {
                if (startIndex < i10) {
                    i11 = iA + 1;
                    if (i10 < ((IntervalList.Interval) mutableVector.getContent()[i11]).getStartIndex()) {
                    }
                } else {
                    size = iA - 1;
                }
            }
            return iA;
        }
        return i11;
    }
}

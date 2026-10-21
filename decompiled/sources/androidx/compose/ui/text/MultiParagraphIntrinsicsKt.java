package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MultiParagraphIntrinsics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,152:1\n35#2,3:153\n38#2,2:160\n40#2:163\n33#3,4:156\n38#3:162\n151#3,5:164\n38#3:169\n156#3:170\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n*L\n141#1:153,3\n141#1:160,2\n141#1:163\n141#1:156,4\n141#1:162\n141#1:164,5\n141#1:169\n141#1:170\n*E\n"})
public final class MultiParagraphIntrinsicsKt {
    public static final List access$getLocalPlaceholders(List list, int i10, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            AnnotatedString.Range range = (AnnotatedString.Range) obj;
            if (AnnotatedStringKt.intersect(i10, i11, range.getStart(), range.getEnd())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            AnnotatedString.Range range2 = (AnnotatedString.Range) arrayList.get(i13);
            if (i10 > range2.getStart() || range2.getEnd() > i11) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
            }
            arrayList2.add(new AnnotatedString.Range(range2.getItem(), range2.getStart() - i10, range2.getEnd() - i10));
        }
        return arrayList2;
    }
}

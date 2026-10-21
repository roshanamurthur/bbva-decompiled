package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import n1.b;

/* JADX INFO: compiled from: Savers.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n70#2:424\n70#2:426\n70#2:428\n55#2,2:430\n55#2,2:433\n55#2,2:436\n55#2,2:439\n70#2:442\n1#3:423\n1#3:425\n1#3:427\n1#3:429\n1#3:432\n1#3:435\n1#3:438\n1#3:441\n1#3:443\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n*L\n160#1:422\n161#1:424\n162#1:426\n163#1:428\n167#1:430,2\n171#1:433,2\n175#1:436,2\n179#1:439,2\n183#1:442\n160#1:423\n161#1:425\n162#1:427\n163#1:429\n167#1:432\n171#1:435\n175#1:438\n179#1:441\n183#1:443\n*E\n"})
public final class SaversKt$AnnotationRangeSaver$2 extends Lambda implements Function1<Object, AnnotatedString.Range<? extends Object>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final SaversKt$AnnotationRangeSaver$2 f17687p0 = new SaversKt$AnnotationRangeSaver$2(1);

    /* JADX INFO: compiled from: Savers.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Paragraph.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Span.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.VerbatimTts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.Url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.String.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final AnnotatedString.Range<? extends Object> invoke(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        ParagraphStyle paragraphStyleRestore = null;
        b bVar = obj != null ? (b) obj : null;
        Intrinsics.checkNotNull(bVar);
        Object obj2 = list.get(2);
        Integer num = obj2 != null ? (Integer) obj2 : null;
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        Object obj3 = list.get(3);
        Integer num2 = obj3 != null ? (Integer) obj3 : null;
        Intrinsics.checkNotNull(num2);
        int iIntValue2 = num2.intValue();
        Object obj4 = list.get(4);
        String str = obj4 != null ? (String) obj4 : null;
        Intrinsics.checkNotNull(str);
        int i10 = WhenMappings.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i10 == 1) {
            Object obj5 = list.get(1);
            Saver<ParagraphStyle, Object> paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
            if (!Intrinsics.areEqual(obj5, Boolean.FALSE) && obj5 != null) {
                paragraphStyleRestore = paragraphStyleSaver.restore(obj5);
            }
            Intrinsics.checkNotNull(paragraphStyleRestore);
            return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
        }
        if (i10 == 2) {
            Object obj6 = list.get(1);
            Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
            if (!Intrinsics.areEqual(obj6, Boolean.FALSE) && obj6 != null) {
                paragraphStyleRestore = spanStyleSaver.restore(obj6);
            }
            Intrinsics.checkNotNull(paragraphStyleRestore);
            return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
        }
        if (i10 == 3) {
            Object obj7 = list.get(1);
            Saver saver = SaversKt.f17671d;
            if (!Intrinsics.areEqual(obj7, Boolean.FALSE) && obj7 != null) {
                paragraphStyleRestore = (VerbatimTtsAnnotation) saver.restore(obj7);
            }
            Intrinsics.checkNotNull(paragraphStyleRestore);
            return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
        }
        if (i10 != 4) {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            Object obj8 = list.get(1);
            paragraphStyleRestore = obj8 != null ? (String) obj8 : null;
            Intrinsics.checkNotNull(paragraphStyleRestore);
            return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
        }
        Object obj9 = list.get(1);
        Saver saver2 = SaversKt.f17672e;
        if (!Intrinsics.areEqual(obj9, Boolean.FALSE) && obj9 != null) {
            paragraphStyleRestore = (UrlAnnotation) saver2.restore(obj9);
        }
        Intrinsics.checkNotNull(paragraphStyleRestore);
        return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
    }
}

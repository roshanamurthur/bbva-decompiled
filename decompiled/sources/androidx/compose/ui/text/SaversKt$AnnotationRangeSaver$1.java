package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import n1.b;

/* JADX INFO: compiled from: Savers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SaversKt$AnnotationRangeSaver$1 extends Lambda implements Function2<SaverScope, AnnotatedString.Range<? extends Object>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final SaversKt$AnnotationRangeSaver$1 f17686p0 = new SaversKt$AnnotationRangeSaver$1(2);

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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SaverScope saverScope, AnnotatedString.Range<? extends Object> range) {
        b bVar;
        Object objSave;
        SaverScope Saver = saverScope;
        AnnotatedString.Range<? extends Object> it = range;
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        Object item = it.getItem();
        if (item instanceof ParagraphStyle) {
            bVar = b.Paragraph;
        } else if (item instanceof SpanStyle) {
            bVar = b.Span;
        } else if (item instanceof VerbatimTtsAnnotation) {
            bVar = b.VerbatimTts;
        } else {
            bVar = item instanceof UrlAnnotation ? b.Url : b.String;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i10 == 1) {
            Object item2 = it.getItem();
            Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
            objSave = SaversKt.save((ParagraphStyle) item2, SaversKt.getParagraphStyleSaver(), Saver);
        } else if (i10 == 2) {
            Object item3 = it.getItem();
            Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
            objSave = SaversKt.save((SpanStyle) item3, SaversKt.getSpanStyleSaver(), Saver);
        } else if (i10 == 3) {
            Object item4 = it.getItem();
            Intrinsics.checkNotNull(item4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
            objSave = SaversKt.save((VerbatimTtsAnnotation) item4, SaversKt.f17671d, Saver);
        } else if (i10 == 4) {
            Object item5 = it.getItem();
            Intrinsics.checkNotNull(item5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
            objSave = SaversKt.save((UrlAnnotation) item5, SaversKt.f17672e, Saver);
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            objSave = SaversKt.save(it.getItem());
        }
        return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(bVar), objSave, SaversKt.save(Integer.valueOf(it.getStart())), SaversKt.save(Integer.valueOf(it.getEnd())), SaversKt.save(it.getTag()));
    }
}

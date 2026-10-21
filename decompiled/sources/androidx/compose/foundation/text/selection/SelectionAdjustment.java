package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ?\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "", "adjust", "Landroidx/compose/ui/text/TextRange;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "newRawSelectionRange", "previousHandleOffset", "", "isStartHandle", "", "previousSelectionRange", "adjust-ZXO7KMw", "(Landroidx/compose/ui/text/TextLayoutResult;JIZLandroidx/compose/ui/text/TextRange;)J", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SelectionAdjustment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f6315a;

    /* JADX INFO: compiled from: SelectionAdjustment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;", "", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "b", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getNone", "()Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "None", "c", "getCharacter", "Character", "d", "getWord", "Word", "e", "getParagraph", "Paragraph", "f", "getCharacterWithWordAccelerate", "CharacterWithWordAccelerate", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f6315a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SelectionAdjustment$Companion$None$1 f6316b = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$None$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* JADX INFO: renamed from: adjust-ZXO7KMw */
            public long mo610adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @Nullable TextRange previousSelectionRange) {
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                return newRawSelectionRange;
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final SelectionAdjustment$Companion$Character$1 f6317c = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Character$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* JADX INFO: renamed from: adjust-ZXO7KMw */
            public long mo610adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @Nullable TextRange previousSelectionRange) {
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                if (TextRange.m3961getCollapsedimpl(newRawSelectionRange)) {
                    return SelectionAdjustmentKt.ensureAtLeastOneChar(textLayoutResult.getLayoutInput().getText().getText(), TextRange.m3967getStartimpl(newRawSelectionRange), StringsKt__StringsKt.getLastIndex(textLayoutResult.getLayoutInput().getText()), isStartHandle, previousSelectionRange != null ? TextRange.m3966getReversedimpl(previousSelectionRange.getF17768a()) : false);
                }
                return newRawSelectionRange;
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final SelectionAdjustment$Companion$Word$1 f6318d = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1

            /* JADX INFO: compiled from: SelectionAdjustment.kt */
            public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Integer, TextRange> {
                public a(Object obj) {
                    super(1, obj, TextLayoutResult.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public final TextRange invoke(Integer num) {
                    return TextRange.m3955boximpl(((TextLayoutResult) this.receiver).m3942getWordBoundaryjx7JFs(num.intValue()));
                }
            }

            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* JADX INFO: renamed from: adjust-ZXO7KMw */
            public long mo610adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @Nullable TextRange previousSelectionRange) {
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                return SelectionAdjustment.Companion.m611access$adjustByBoundaryDvylE(SelectionAdjustment.Companion.f6315a, textLayoutResult, newRawSelectionRange, new a(textLayoutResult));
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final SelectionAdjustment$Companion$Paragraph$1 f6319e = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1

            /* JADX INFO: compiled from: SelectionAdjustment.kt */
            public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Integer, TextRange> {
                public a(AnnotatedString annotatedString) {
                    super(1, annotatedString, StringHelpersKt.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final TextRange invoke(Integer num) {
                    return TextRange.m3955boximpl(StringHelpersKt.getParagraphBoundary((CharSequence) this.receiver, num.intValue()));
                }
            }

            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* JADX INFO: renamed from: adjust-ZXO7KMw */
            public long mo610adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @Nullable TextRange previousSelectionRange) {
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                return SelectionAdjustment.Companion.m611access$adjustByBoundaryDvylE(SelectionAdjustment.Companion.f6315a, textLayoutResult, newRawSelectionRange, new a(textLayoutResult.getLayoutInput().getText()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final SelectionAdjustment$Companion$CharacterWithWordAccelerate$1 f6320f = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$CharacterWithWordAccelerate$1
            public static int a(TextLayoutResult textLayoutResult, int i10, int i11, int i12, boolean z10, boolean z11) {
                long jM3942getWordBoundaryjx7JFs = textLayoutResult.m3942getWordBoundaryjx7JFs(i10);
                int iM3967getStartimpl = textLayoutResult.getLineForOffset(TextRange.m3967getStartimpl(jM3942getWordBoundaryjx7JFs)) == i11 ? TextRange.m3967getStartimpl(jM3942getWordBoundaryjx7JFs) : textLayoutResult.getLineStart(i11);
                int iM3962getEndimpl = textLayoutResult.getLineForOffset(TextRange.m3962getEndimpl(jM3942getWordBoundaryjx7JFs)) == i11 ? TextRange.m3962getEndimpl(jM3942getWordBoundaryjx7JFs) : TextLayoutResult.getLineEnd$default(textLayoutResult, i11, false, 2, null);
                if (iM3967getStartimpl == i12) {
                    return iM3962getEndimpl;
                }
                if (iM3962getEndimpl == i12) {
                    return iM3967getStartimpl;
                }
                int i13 = (iM3967getStartimpl + iM3962getEndimpl) / 2;
                if (z10 ^ z11) {
                    if (i10 <= i13) {
                        return iM3967getStartimpl;
                    }
                } else if (i10 < i13) {
                    return iM3967getStartimpl;
                }
                return iM3962getEndimpl;
            }

            public static int b(TextLayoutResult textLayoutResult, int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
                if (i10 == i11) {
                    return i12;
                }
                int lineForOffset = textLayoutResult.getLineForOffset(i10);
                if (lineForOffset != textLayoutResult.getLineForOffset(i12)) {
                    return a(textLayoutResult, i10, lineForOffset, i13, z10, z11);
                }
                if (i11 != -1 && (i10 == i11 || (!(z10 ^ z11) ? i10 > i11 : i10 < i11))) {
                    return i10;
                }
                long jM3942getWordBoundaryjx7JFs = textLayoutResult.m3942getWordBoundaryjx7JFs(i12);
                return (i12 == TextRange.m3967getStartimpl(jM3942getWordBoundaryjx7JFs) || i12 == TextRange.m3962getEndimpl(jM3942getWordBoundaryjx7JFs)) ? a(textLayoutResult, i10, lineForOffset, i13, z10, z11) : i10;
            }

            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* JADX INFO: renamed from: adjust-ZXO7KMw */
            public long mo610adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @Nullable TextRange previousSelectionRange) {
                int iB;
                int iB2;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                if (previousSelectionRange == null) {
                    return SelectionAdjustment.Companion.f6315a.getWord().mo610adjustZXO7KMw(textLayoutResult, newRawSelectionRange, previousHandleOffset, isStartHandle, previousSelectionRange);
                }
                if (TextRange.m3961getCollapsedimpl(newRawSelectionRange)) {
                    return SelectionAdjustmentKt.ensureAtLeastOneChar(textLayoutResult.getLayoutInput().getText().getText(), TextRange.m3967getStartimpl(newRawSelectionRange), StringsKt__StringsKt.getLastIndex(textLayoutResult.getLayoutInput().getText()), isStartHandle, TextRange.m3966getReversedimpl(previousSelectionRange.getF17768a()));
                }
                if (isStartHandle) {
                    iB2 = b(textLayoutResult, TextRange.m3967getStartimpl(newRawSelectionRange), previousHandleOffset, TextRange.m3967getStartimpl(previousSelectionRange.getF17768a()), TextRange.m3962getEndimpl(newRawSelectionRange), true, TextRange.m3966getReversedimpl(newRawSelectionRange));
                    iB = TextRange.m3962getEndimpl(newRawSelectionRange);
                } else {
                    int iM3967getStartimpl = TextRange.m3967getStartimpl(newRawSelectionRange);
                    iB = b(textLayoutResult, TextRange.m3962getEndimpl(newRawSelectionRange), previousHandleOffset, TextRange.m3962getEndimpl(previousSelectionRange.getF17768a()), TextRange.m3967getStartimpl(newRawSelectionRange), false, TextRange.m3966getReversedimpl(newRawSelectionRange));
                    iB2 = iM3967getStartimpl;
                }
                return TextRangeKt.TextRange(iB2, iB);
            }
        };

        /* JADX INFO: renamed from: access$adjustByBoundary--Dv-ylE, reason: not valid java name */
        public static final long m611access$adjustByBoundaryDvylE(Companion companion, TextLayoutResult textLayoutResult, long j10, Function1 function1) {
            companion.getClass();
            if (textLayoutResult.getLayoutInput().getText().length() == 0) {
                return TextRange.INSTANCE.m3972getZerod9O1mEE();
            }
            int lastIndex = StringsKt__StringsKt.getLastIndex(textLayoutResult.getLayoutInput().getText());
            long f17768a = ((TextRange) function1.invoke(Integer.valueOf(kotlin.ranges.c.coerceIn(TextRange.m3967getStartimpl(j10), 0, lastIndex)))).getF17768a();
            long f17768a2 = ((TextRange) function1.invoke(Integer.valueOf(kotlin.ranges.c.coerceIn(TextRange.m3962getEndimpl(j10), 0, lastIndex)))).getF17768a();
            return TextRangeKt.TextRange(TextRange.m3966getReversedimpl(j10) ? TextRange.m3962getEndimpl(f17768a) : TextRange.m3967getStartimpl(f17768a), TextRange.m3966getReversedimpl(j10) ? TextRange.m3967getStartimpl(f17768a2) : TextRange.m3962getEndimpl(f17768a2));
        }

        @NotNull
        public final SelectionAdjustment getCharacter() {
            return f6317c;
        }

        @NotNull
        public final SelectionAdjustment getCharacterWithWordAccelerate() {
            return f6320f;
        }

        @NotNull
        public final SelectionAdjustment getNone() {
            return f6316b;
        }

        @NotNull
        public final SelectionAdjustment getParagraph() {
            return f6319e;
        }

        @NotNull
        public final SelectionAdjustment getWord() {
            return f6318d;
        }
    }

    /* JADX INFO: renamed from: adjust-ZXO7KMw, reason: not valid java name */
    long mo610adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @Nullable TextRange previousSelectionRange);
}

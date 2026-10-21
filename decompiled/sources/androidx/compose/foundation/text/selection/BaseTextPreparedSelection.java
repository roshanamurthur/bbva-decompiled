package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0007\b \u0018\u0000 ]*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001]B4\u0012\u0006\u00104\u001a\u00020/\u0012\u0006\u0010:\u001a\u000205\u0012\b\u0010@\u001a\u0004\u0018\u00010;\u0012\u0006\u0010F\u001a\u00020A\u0012\u0006\u0010L\u001a\u00020Gø\u0001\u0001¢\u0006\u0004\b[\u0010\\J@\u0010\n\u001a\u00028\u0000\"\u0004\b\u0001\u0010\u0003*\u00028\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0084\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0004J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0004J\r\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\r\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0013J&\u0010\u0018\u001a\u00028\u00002\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00028\u00002\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\u001a\u0010\u0019J\u0006\u0010\u001b\u001a\u00020\fJ\u0006\u0010\u001c\u001a\u00020\fJ\r\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u0013J\r\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u0013J\r\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010\u0013J\r\u0010 \u001a\u00028\u0000¢\u0006\u0004\b \u0010\u0013J\u000f\u0010!\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b#\u0010\"J\r\u0010$\u001a\u00028\u0000¢\u0006\u0004\b$\u0010\u0013J\r\u0010%\u001a\u00028\u0000¢\u0006\u0004\b%\u0010\u0013J\r\u0010&\u001a\u00028\u0000¢\u0006\u0004\b&\u0010\u0013J\r\u0010'\u001a\u00028\u0000¢\u0006\u0004\b'\u0010\u0013J\u000f\u0010(\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b(\u0010\"J\r\u0010)\u001a\u00028\u0000¢\u0006\u0004\b)\u0010\u0013J\u000f\u0010*\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b*\u0010\"J\r\u0010+\u001a\u00028\u0000¢\u0006\u0004\b+\u0010\u0013J\r\u0010,\u001a\u00028\u0000¢\u0006\u0004\b,\u0010\u0013J\r\u0010-\u001a\u00028\u0000¢\u0006\u0004\b-\u0010\u0013J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010\u0013R\u0017\u00104\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010:\u001a\u0002058\u0006ø\u0001\u0001ø\u0001\u0002ø\u0001\u0003¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010@\u001a\u0004\u0018\u00010;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010F\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010L\u001a\u00020G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR+\u0010Q\u001a\u0002058\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0002ø\u0001\u0003¢\u0006\u0012\n\u0004\bM\u00107\u001a\u0004\bN\u00109\"\u0004\bO\u0010PR\"\u0010V\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u00101\u001a\u0004\bS\u00103\"\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y\u0082\u0002\u0016\n\u0005\b\u009920\u0001\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", ExifInterface.GPS_DIRECTION_TRUE, "", "U", "", "resetCachedX", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "apply", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "", TypedValues.CycleType.S_WAVE_OFFSET, "setCursor", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "setSelection", "selectAll", "()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "deselect", "moveCursorLeft", "moveCursorRight", "or", "collapseLeftOr", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "collapseRightOr", "getPrecedingCharacterIndex", "getNextCharacterIndex", "moveCursorToHome", "moveCursorToEnd", "moveCursorLeftByWord", "moveCursorRightByWord", "getNextWordOffset", "()Ljava/lang/Integer;", "getPreviousWordOffset", "moveCursorPrevByParagraph", "moveCursorNextByParagraph", "moveCursorUpByLine", "moveCursorDownByLine", "getLineStartByOffset", "moveCursorToLineStart", "getLineEndByOffset", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "selectMovement", "Landroidx/compose/ui/text/AnnotatedString;", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getOriginalText", "()Landroidx/compose/ui/text/AnnotatedString;", "originalText", "Landroidx/compose/ui/text/TextRange;", "b", "J", "getOriginalSelection-d9O1mEE", "()J", "originalSelection", "Landroidx/compose/ui/text/TextLayoutResult;", "c", "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/text/input/OffsetMapping;", "d", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "e", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "state", "f", "getSelection-d9O1mEE", "setSelection-5zc-tL8", "(J)V", "selection", "g", "getAnnotatedString", "setAnnotatedString", "(Landroidx/compose/ui/text/AnnotatedString;)V", "annotatedString", "", "getText$foundation_release", "()Ljava/lang/String;", "text", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n73#1,8:433\n73#1,8:441\n73#1,8:449\n73#1,8:457\n73#1,8:465\n73#1,8:473\n73#1,8:481\n73#1,8:489\n73#1,8:497\n73#1,8:505\n73#1,8:513\n73#1,8:521\n73#1,6:529\n80#1:536\n73#1,8:537\n73#1,8:545\n73#1,8:553\n74#1,7:561\n74#1,7:568\n73#1,8:575\n73#1,8:583\n73#1,8:591\n73#1,8:599\n74#1,7:607\n1#2:535\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n91#1:433,8\n95#1:441,8\n99#1:449,8\n107#1:457,8\n118#1:465,8\n134#1:473,8\n158#1:481,8\n163#1:489,8\n168#1:497,8\n172#1:505,8\n176#1:513,8\n184#1:521,8\n194#1:529,6\n194#1:536\n200#1:537,8\n204#1:545,8\n208#1:553,8\n212#1:561,7\n216#1:568,7\n222#1:575,8\n228#1:583,8\n232#1:591,8\n240#1:599,8\n249#1:607,7\n*E\n"})
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    public static final int NoCharacterFound = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnnotatedString originalText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long originalSelection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TextLayoutResult layoutResult;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OffsetMapping offsetMapping;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextPreparedSelectionState state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public long selection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public AnnotatedString annotatedString;

    public BaseTextPreparedSelection(AnnotatedString originalText, long j10, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState state, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(originalText, "originalText");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(state, "state");
        this.originalText = originalText;
        this.originalSelection = j10;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping;
        this.state = state;
        this.selection = j10;
        this.annotatedString = originalText;
    }

    public static /* synthetic */ BaseTextPreparedSelection apply$default(BaseTextPreparedSelection baseTextPreparedSelection, Object obj, boolean z10, Function1 block, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        Intrinsics.checkNotNullParameter(block, "block");
        if (z10) {
            baseTextPreparedSelection.getState().resetCachedX();
        }
        if (baseTextPreparedSelection.getText$foundation_release().length() > 0) {
            block.invoke(obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (BaseTextPreparedSelection) obj;
    }

    public final boolean a() {
        ResolvedTextDirection paragraphDirection;
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            paragraphDirection = textLayoutResult.getParagraphDirection(this.offsetMapping.originalToTransformed(TextRange.m3962getEndimpl(this.selection)));
        } else {
            paragraphDirection = null;
        }
        return paragraphDirection != ResolvedTextDirection.Rtl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <U> T apply(U u2, boolean z10, @NotNull Function1<? super U, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (z10) {
            getState().resetCachedX();
        }
        if (getText$foundation_release().length() > 0) {
            block.invoke(u2);
        }
        Intrinsics.checkNotNull(u2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (T) u2;
    }

    public final int b(TextLayoutResult textLayoutResult, int i10) {
        int iM3962getEndimpl = TextRange.m3962getEndimpl(this.selection);
        OffsetMapping offsetMapping = this.offsetMapping;
        int iOriginalToTransformed = offsetMapping.originalToTransformed(iM3962getEndimpl);
        TextPreparedSelectionState textPreparedSelectionState = this.state;
        if (textPreparedSelectionState.getCachedX() == null) {
            textPreparedSelectionState.setCachedX(Float.valueOf(textLayoutResult.getCursorRect(iOriginalToTransformed).getLeft()));
        }
        int lineForOffset = textLayoutResult.getLineForOffset(iOriginalToTransformed) + i10;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return getText$foundation_release().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        Float cachedX = textPreparedSelectionState.getCachedX();
        Intrinsics.checkNotNull(cachedX);
        float fFloatValue = cachedX.floatValue();
        return ((!a() || fFloatValue < textLayoutResult.getLineRight(lineForOffset)) && (a() || fFloatValue > textLayoutResult.getLineLeft(lineForOffset))) ? offsetMapping.transformedToOriginal(textLayoutResult.m3940getOffsetForPositionk4lQ0M(OffsetKt.Offset(cachedX.floatValue(), lineBottom))) : textLayoutResult.getLineEnd(lineForOffset, true);
    }

    public final void c() {
        int nextCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    @NotNull
    public final T collapseLeftOr(@NotNull Function1<? super T, Unit> or) {
        Intrinsics.checkNotNullParameter(or, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m3961getCollapsedimpl(this.selection)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                or.invoke(this);
            } else if (a()) {
                setCursor(TextRange.m3965getMinimpl(this.selection));
            } else {
                setCursor(TextRange.m3964getMaximpl(this.selection));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T collapseRightOr(@NotNull Function1<? super T, Unit> or) {
        Intrinsics.checkNotNullParameter(or, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m3961getCollapsedimpl(this.selection)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                or.invoke(this);
            } else if (a()) {
                setCursor(TextRange.m3964getMaximpl(this.selection));
            } else {
                setCursor(TextRange.m3965getMinimpl(this.selection));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void d() {
        Integer nextWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (nextWordOffset = getNextWordOffset()) != null) {
            setCursor(nextWordOffset.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    @NotNull
    public final T deselect() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(TextRange.m3962getEndimpl(this.selection));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void e() {
        int precedingCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    public final void f() {
        Integer previousWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (previousWordOffset = getPreviousWordOffset()) != null) {
            setCursor(previousWordOffset.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @Nullable
    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    @Nullable
    public final Integer getLineEndByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        int iM3964getMaximpl = TextRange.m3964getMaximpl(this.selection);
        OffsetMapping offsetMapping = this.offsetMapping;
        return Integer.valueOf(offsetMapping.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(offsetMapping.originalToTransformed(iM3964getMaximpl)), true)));
    }

    @Nullable
    public final Integer getLineStartByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        int iM3965getMinimpl = TextRange.m3965getMinimpl(this.selection);
        OffsetMapping offsetMapping = this.offsetMapping;
        return Integer.valueOf(offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(offsetMapping.originalToTransformed(iM3965getMinimpl)))));
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.annotatedString.getText(), TextRange.m3962getEndimpl(this.selection));
    }

    @Nullable
    public final Integer getNextWordOffset() {
        int length;
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        int iM3962getEndimpl = TextRange.m3962getEndimpl(this.selection);
        OffsetMapping offsetMapping = this.offsetMapping;
        int iOriginalToTransformed = offsetMapping.originalToTransformed(iM3962getEndimpl);
        while (true) {
            AnnotatedString annotatedString = this.originalText;
            if (iOriginalToTransformed < annotatedString.length()) {
                long jM3942getWordBoundaryjx7JFs = textLayoutResult.m3942getWordBoundaryjx7JFs(kotlin.ranges.c.coerceAtMost(iOriginalToTransformed, getText$foundation_release().length() - 1));
                if (TextRange.m3962getEndimpl(jM3942getWordBoundaryjx7JFs) > iOriginalToTransformed) {
                    length = offsetMapping.transformedToOriginal(TextRange.m3962getEndimpl(jM3942getWordBoundaryjx7JFs));
                    break;
                }
                iOriginalToTransformed++;
            } else {
                length = annotatedString.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    @NotNull
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    /* JADX INFO: renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getOriginalSelection() {
        return this.originalSelection;
    }

    @NotNull
    public final AnnotatedString getOriginalText() {
        return this.originalText;
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.annotatedString.getText(), TextRange.m3962getEndimpl(this.selection));
    }

    @Nullable
    public final Integer getPreviousWordOffset() {
        int iTransformedToOriginal;
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        int iM3962getEndimpl = TextRange.m3962getEndimpl(this.selection);
        OffsetMapping offsetMapping = this.offsetMapping;
        for (int iOriginalToTransformed = offsetMapping.originalToTransformed(iM3962getEndimpl); iOriginalToTransformed > 0; iOriginalToTransformed--) {
            long jM3942getWordBoundaryjx7JFs = textLayoutResult.m3942getWordBoundaryjx7JFs(kotlin.ranges.c.coerceAtMost(iOriginalToTransformed, getText$foundation_release().length() - 1));
            if (TextRange.m3967getStartimpl(jM3942getWordBoundaryjx7JFs) < iOriginalToTransformed) {
                iTransformedToOriginal = offsetMapping.transformedToOriginal(TextRange.m3967getStartimpl(jM3942getWordBoundaryjx7JFs));
                return Integer.valueOf(iTransformedToOriginal);
            }
        }
        iTransformedToOriginal = 0;
        return Integer.valueOf(iTransformedToOriginal);
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    @NotNull
    public final TextPreparedSelectionState getState() {
        return this.state;
    }

    @NotNull
    public final String getText$foundation_release() {
        return this.annotatedString.getText();
    }

    @NotNull
    public final T moveCursorDownByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(b(textLayoutResult, 1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorLeft() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (a()) {
                e();
            } else {
                c();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorLeftByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (a()) {
                f();
            } else {
                d();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorNextByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(StringHelpersKt.findParagraphEnd(getText$foundation_release(), TextRange.m3964getMaximpl(this.selection)));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorPrevByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(StringHelpersKt.findParagraphStart(getText$foundation_release(), TextRange.m3965getMinimpl(this.selection)));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorRight() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (a()) {
                c();
            } else {
                e();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorRightByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (a()) {
                d();
            } else {
                f();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorToEnd() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getText$foundation_release().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorToHome() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(0);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorToLineEnd() {
        Integer lineEndByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (lineEndByOffset = getLineEndByOffset()) != null) {
            setCursor(lineEndByOffset.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorToLineLeftSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (a()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorToLineRightSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (a()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorToLineStart() {
        Integer lineStartByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (lineStartByOffset = getLineStartByOffset()) != null) {
            setCursor(lineStartByOffset.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T moveCursorUpByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(b(textLayoutResult, -1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T selectAll() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setSelection(0, getText$foundation_release().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T selectMovement() {
        if (getText$foundation_release().length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m3967getStartimpl(this.originalSelection), TextRange.m3962getEndimpl(this.selection));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void setAnnotatedString(@NotNull AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(annotatedString, "<set-?>");
        this.annotatedString = annotatedString;
    }

    public final void setCursor(int offset) {
        setSelection(offset, offset);
    }

    public final void setSelection(int start, int end) {
        this.selection = TextRangeKt.TextRange(start, end);
    }

    /* JADX INFO: renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m600setSelection5zctL8(long j10) {
        this.selection = j10;
    }
}

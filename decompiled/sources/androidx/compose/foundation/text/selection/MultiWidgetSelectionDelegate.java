package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MultiWidgetSelectionDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010(\u001a\u00020#\u0012\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0)\u0012\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0)¢\u0006\u0004\b-\u0010.J_\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\n\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016J(\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J \u0010!\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\b\u0010\"\u001a\u00020\u001aH\u0016R\u001a\u0010(\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;", "Landroidx/compose/foundation/text/selection/Selectable;", "Landroidx/compose/ui/geometry/Offset;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "", "isStartHandle", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Lkotlin/Pair;", "updateSelection-qCDeeow", "(JJLandroidx/compose/ui/geometry/Offset;ZLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;)Lkotlin/Pair;", "updateSelection", "getSelectAllSelection", "selection", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getHandlePosition", "getLayoutCoordinates", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getRangeOfLineContaining", "getLastVisibleOffset", "", "a", "J", "getSelectableId", "()J", "selectableId", "Lkotlin/Function0;", "coordinatesCallback", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResultCallback", "<init>", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1#2:298\n*E\n"})
public final class MultiWidgetSelectionDelegate implements Selectable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long selectableId;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<LayoutCoordinates> f6305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function0<TextLayoutResult> f6306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TextLayoutResult f6307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6308e;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiWidgetSelectionDelegate(long j10, @NotNull Function0<? extends LayoutCoordinates> coordinatesCallback, @NotNull Function0<TextLayoutResult> layoutResultCallback) {
        Intrinsics.checkNotNullParameter(coordinatesCallback, "coordinatesCallback");
        Intrinsics.checkNotNullParameter(layoutResultCallback, "layoutResultCallback");
        this.selectableId = j10;
        this.f6305b = coordinatesCallback;
        this.f6306c = layoutResultCallback;
        this.f6308e = -1;
    }

    public final synchronized int a(TextLayoutResult textLayoutResult) {
        int lineCount;
        try {
            if (this.f6307d != textLayoutResult) {
                if (!textLayoutResult.getDidOverflowHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                    lineCount = textLayoutResult.getLineCount() - 1;
                } else {
                    lineCount = kotlin.ranges.c.coerceAtMost(textLayoutResult.getLineForVerticalPosition(IntSize.m4548getHeightimpl(textLayoutResult.getSize())), textLayoutResult.getLineCount() - 1);
                    while (textLayoutResult.getLineTop(lineCount) >= IntSize.m4548getHeightimpl(textLayoutResult.getSize())) {
                        lineCount--;
                    }
                }
                this.f6308e = textLayoutResult.getLineEnd(lineCount, true);
                this.f6307d = textLayoutResult;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6308e;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @NotNull
    public Rect getBoundingBox(int offset) {
        TextLayoutResult textLayoutResultInvoke = this.f6306c.invoke();
        if (textLayoutResultInvoke == null) {
            return Rect.INSTANCE.getZero();
        }
        int length = textLayoutResultInvoke.getLayoutInput().getText().length();
        return length < 1 ? Rect.INSTANCE.getZero() : textLayoutResultInvoke.getBoundingBox(kotlin.ranges.c.coerceIn(offset, 0, length - 1));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public long mo602getHandlePositiondBAh8RU(@NotNull Selection selection, boolean isStartHandle) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        if ((isStartHandle && selection.getStart().getSelectableId() != getSelectableId()) || (!isStartHandle && selection.getEnd().getSelectableId() != getSelectableId())) {
            return Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        if (getLayoutCoordinates() == null) {
            return Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        TextLayoutResult textLayoutResultInvoke = this.f6306c.invoke();
        if (textLayoutResultInvoke == null) {
            return Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResultInvoke, kotlin.ranges.c.coerceIn((isStartHandle ? selection.getStart() : selection.getEnd()).getOffset(), 0, a(textLayoutResultInvoke)), isStartHandle, selection.getHandlesCrossed());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public int getLastVisibleOffset() {
        TextLayoutResult textLayoutResultInvoke = this.f6306c.invoke();
        if (textLayoutResultInvoke == null) {
            return 0;
        }
        return a(textLayoutResultInvoke);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @Nullable
    public LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinatesInvoke = this.f6305b.invoke();
        if (layoutCoordinatesInvoke == null || !layoutCoordinatesInvoke.isAttached()) {
            return null;
        }
        return layoutCoordinatesInvoke;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public long mo603getRangeOfLineContainingjx7JFs(int offset) {
        TextLayoutResult textLayoutResultInvoke = this.f6306c.invoke();
        if (textLayoutResultInvoke == null) {
            return TextRange.INSTANCE.m3972getZerod9O1mEE();
        }
        int iA = a(textLayoutResultInvoke);
        if (iA < 1) {
            return TextRange.INSTANCE.m3972getZerod9O1mEE();
        }
        int lineForOffset = textLayoutResultInvoke.getLineForOffset(kotlin.ranges.c.coerceIn(offset, 0, iA - 1));
        return TextRangeKt.TextRange(textLayoutResultInvoke.getLineStart(lineForOffset), textLayoutResultInvoke.getLineEnd(lineForOffset, true));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @Nullable
    public Selection getSelectAllSelection() {
        TextLayoutResult textLayoutResultInvoke = this.f6306c.invoke();
        if (textLayoutResultInvoke == null) {
            return null;
        }
        return MultiWidgetSelectionDelegateKt.a(TextRangeKt.TextRange(0, textLayoutResultInvoke.getLayoutInput().getText().length()), false, getSelectableId(), textLayoutResultInvoke);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long getSelectableId() {
        return this.selectableId;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @NotNull
    public AnnotatedString getText() {
        TextLayoutResult textLayoutResultInvoke = this.f6306c.invoke();
        return textLayoutResultInvoke == null ? new AnnotatedString("", null, null, 6, null) : textLayoutResultInvoke.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @NotNull
    /* JADX INFO: renamed from: updateSelection-qCDeeow, reason: not valid java name */
    public Pair<Selection, Boolean> mo604updateSelectionqCDeeow(long startHandlePosition, long endHandlePosition, @Nullable Offset previousHandlePosition, boolean isStartHandle, @NotNull LayoutCoordinates containerLayoutCoordinates, @NotNull SelectionAdjustment adjustment, @Nullable Selection previousSelection) {
        Intrinsics.checkNotNullParameter(containerLayoutCoordinates, "containerLayoutCoordinates");
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        if (previousSelection != null && (getSelectableId() != previousSelection.getStart().getSelectableId() || getSelectableId() != previousSelection.getEnd().getSelectableId())) {
            throw new IllegalArgumentException("The given previousSelection doesn't belong to this selectable.".toString());
        }
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return new Pair<>(null, Boolean.FALSE);
        }
        TextLayoutResult textLayoutResultInvoke = this.f6306c.invoke();
        if (textLayoutResultInvoke == null) {
            return new Pair<>(null, Boolean.FALSE);
        }
        long jMo3582localPositionOfR5De75A = containerLayoutCoordinates.mo3582localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m2291getZeroF1C5BW0());
        return MultiWidgetSelectionDelegateKt.m607getTextSelectionInfoyM0VcXU(textLayoutResultInvoke, Offset.m2279minusMKHz9U(startHandlePosition, jMo3582localPositionOfR5De75A), Offset.m2279minusMKHz9U(endHandlePosition, jMo3582localPositionOfR5De75A), previousHandlePosition != null ? Offset.m2264boximpl(Offset.m2279minusMKHz9U(previousHandlePosition.getF15533a(), jMo3582localPositionOfR5De75A)) : null, getSelectableId(), adjustment, previousSelection, isStartHandle);
    }
}

package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.z1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextLayoutResult.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010<\u001a\u000207\u0012\u0006\u0010*\u001a\u00020)ø\u0001\u0001¢\u0006\u0004\bY\u0010ZJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tJ\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0002J\u001b\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u0002J\u001e\u0010!\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u0002J\u0016\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002J'\u0010-\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u0013\u0010/\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00100\u001a\u00020\u0002H\u0016J\b\u00102\u001a\u000201H\u0016R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010<\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010*\u001a\u00020)8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010E\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010H\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010DR\u001f\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0011\u0010Q\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010S\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bR\u0010PR\u0011\u0010U\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bT\u0010PR\u0011\u0010X\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bV\u0010W\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "", "", "lineIndex", "getLineStart", "", "visibleEnd", "getLineEnd", "isLineEllipsized", "", "getLineTop", "getLineBottom", "getLineLeft", "getLineRight", TypedValues.CycleType.S_WAVE_OFFSET, "getLineForOffset", "vertical", "getLineForVerticalPosition", "usePrimaryDirection", "getHorizontalPosition", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "getBidiRunDirection", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "Landroidx/compose/ui/text/TextLayoutInput;", "layoutInput", "Landroidx/compose/ui/unit/IntSize;", "size", "copy-O0kMr_c", "(Landroidx/compose/ui/text/TextLayoutInput;J)Landroidx/compose/ui/text/TextLayoutResult;", "copy", "other", "equals", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "Landroidx/compose/ui/text/TextLayoutInput;", "getLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "Landroidx/compose/ui/text/MultiParagraph;", "b", "Landroidx/compose/ui/text/MultiParagraph;", "getMultiParagraph", "()Landroidx/compose/ui/text/MultiParagraph;", "multiParagraph", "c", "J", "getSize-YbymL2g", "()J", "d", "F", "getFirstBaseline", "()F", "firstBaseline", "e", "getLastBaseline", "lastBaseline", "", "f", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "placeholderRects", "getDidOverflowHeight", "()Z", "didOverflowHeight", "getDidOverflowWidth", "didOverflowWidth", "getHasVisualOverflow", "hasVisualOverflow", "getLineCount", "()I", "lineCount", "<init>", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/MultiParagraph;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class TextLayoutResult {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextLayoutInput layoutInput;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MultiParagraph multiParagraph;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long size;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float firstBaseline;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final float lastBaseline;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Rect> placeholderRects;

    public TextLayoutResult(TextLayoutInput layoutInput, MultiParagraph multiParagraph, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(layoutInput, "layoutInput");
        Intrinsics.checkNotNullParameter(multiParagraph, "multiParagraph");
        this.layoutInput = layoutInput;
        this.multiParagraph = multiParagraph;
        this.size = j10;
        this.firstBaseline = multiParagraph.getFirstBaseline();
        this.lastBaseline = multiParagraph.getLastBaseline();
        this.placeholderRects = multiParagraph.getPlaceholderRects();
    }

    /* JADX INFO: renamed from: copy-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m3938copyO0kMr_c$default(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i10 & 2) != 0) {
            j10 = textLayoutResult.size;
        }
        return textLayoutResult.m3939copyO0kMr_c(textLayoutInput, j10);
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResult textLayoutResult, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return textLayoutResult.getLineEnd(i10, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-O0kMr_c, reason: not valid java name */
    public final TextLayoutResult m3939copyO0kMr_c(@NotNull TextLayoutInput layoutInput, long size) {
        Intrinsics.checkNotNullParameter(layoutInput, "layoutInput");
        return new TextLayoutResult(layoutInput, this.multiParagraph, size, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) other;
        return Intrinsics.areEqual(this.layoutInput, textLayoutResult.layoutInput) && Intrinsics.areEqual(this.multiParagraph, textLayoutResult.multiParagraph) && IntSize.m4547equalsimpl0(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && Intrinsics.areEqual(this.placeholderRects, textLayoutResult.placeholderRects);
    }

    @NotNull
    public final ResolvedTextDirection getBidiRunDirection(int offset) {
        return this.multiParagraph.getBidiRunDirection(offset);
    }

    @NotNull
    public final Rect getBoundingBox(int offset) {
        return this.multiParagraph.getBoundingBox(offset);
    }

    @NotNull
    public final Rect getCursorRect(int offset) {
        return this.multiParagraph.getCursorRect(offset);
    }

    public final boolean getDidOverflowHeight() {
        MultiParagraph multiParagraph = this.multiParagraph;
        return multiParagraph.getDidExceedMaxLines() || ((float) IntSize.m4548getHeightimpl(this.size)) < multiParagraph.getHeight();
    }

    public final boolean getDidOverflowWidth() {
        return ((float) IntSize.m4549getWidthimpl(this.size)) < this.multiParagraph.getWidth();
    }

    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public final boolean getHasVisualOverflow() {
        return getDidOverflowWidth() || getDidOverflowHeight();
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        return this.multiParagraph.getHorizontalPosition(offset, usePrimaryDirection);
    }

    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    @NotNull
    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float getLineBottom(int lineIndex) {
        return this.multiParagraph.getLineBottom(lineIndex);
    }

    public final int getLineCount() {
        return this.multiParagraph.getLineCount();
    }

    public final int getLineEnd(int lineIndex, boolean visibleEnd) {
        return this.multiParagraph.getLineEnd(lineIndex, visibleEnd);
    }

    public final int getLineForOffset(int offset) {
        return this.multiParagraph.getLineForOffset(offset);
    }

    public final int getLineForVerticalPosition(float vertical) {
        return this.multiParagraph.getLineForVerticalPosition(vertical);
    }

    public final float getLineLeft(int lineIndex) {
        return this.multiParagraph.getLineLeft(lineIndex);
    }

    public final float getLineRight(int lineIndex) {
        return this.multiParagraph.getLineRight(lineIndex);
    }

    public final int getLineStart(int lineIndex) {
        return this.multiParagraph.getLineStart(lineIndex);
    }

    public final float getLineTop(int lineIndex) {
        return this.multiParagraph.getLineTop(lineIndex);
    }

    @NotNull
    public final MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m3940getOffsetForPositionk4lQ0M(long position) {
        return this.multiParagraph.m3869getOffsetForPositionk4lQ0M(position);
    }

    @NotNull
    public final ResolvedTextDirection getParagraphDirection(int offset) {
        return this.multiParagraph.getParagraphDirection(offset);
    }

    @NotNull
    public final Path getPathForRange(int start, int end) {
        return this.multiParagraph.getPathForRange(start, end);
    }

    @NotNull
    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m3942getWordBoundaryjx7JFs(int offset) {
        return this.multiParagraph.m3870getWordBoundaryjx7JFs(offset);
    }

    public int hashCode() {
        return this.placeholderRects.hashCode() + z1.a(this.lastBaseline, z1.a(this.firstBaseline, (IntSize.m4550hashCodeimpl(this.size) + ((this.multiParagraph.hashCode() + (this.layoutInput.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final boolean isLineEllipsized(int lineIndex) {
        return this.multiParagraph.isLineEllipsized(lineIndex);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TextLayoutResult(layoutInput=");
        sb2.append(this.layoutInput);
        sb2.append(", multiParagraph=");
        sb2.append(this.multiParagraph);
        sb2.append(", size=");
        sb2.append((Object) IntSize.m4552toStringimpl(this.size));
        sb2.append(", firstBaseline=");
        sb2.append(this.firstBaseline);
        sb2.append(", lastBaseline=");
        sb2.append(this.lastBaseline);
        sb2.append(", placeholderRects=");
        return a.c(sb2, this.placeholderRects, RootService.CLOSE_BRACKET);
    }
}

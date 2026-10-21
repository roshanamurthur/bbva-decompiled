package androidx.compose.ui.text;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MultiParagraph.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u001b\u001a\u00020\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0007\u0012\b\b\u0002\u0010!\u001a\u00020\u0007¢\u0006\u0004\bE\u0010FJ\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0002J\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0002J\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002J\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0002J\n\u0010\b\u001a\u00020\u0007*\u00020\u0007J\n\u0010\t\u001a\u00020\u0007*\u00020\u0007J\u0017\u0010\r\u001a\u00020\n*\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u000f\u001a\u00020\u000e*\u00020\u000eJ\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0010J\u0017\u0010\u000f\u001a\u00020\u0011*\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\fJ\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u0007HÆ\u0001J\t\u0010$\u001a\u00020#HÖ\u0001J\t\u0010%\u001a\u00020\u0002HÖ\u0001J\u0013\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u001b\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00106R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010.\u001a\u0004\b8\u00100\"\u0004\b9\u00106R\"\u0010 \u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010!\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\u0011\u0010D\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bC\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006G"}, d2 = {"Landroidx/compose/ui/text/ParagraphInfo;", "", "", "toLocalIndex", "toGlobalIndex", "toLocalLineIndex", "toGlobalLineIndex", "", "toGlobalYPosition", "toLocalYPosition", "Landroidx/compose/ui/geometry/Offset;", "toLocal-MK-Hz9U", "(J)J", "toLocal", "Landroidx/compose/ui/geometry/Rect;", "toGlobal", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/text/TextRange;", "toGlobal-GEjPoXI", "Landroidx/compose/ui/text/Paragraph;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "paragraph", "startIndex", "endIndex", "startLineIndex", "endLineIndex", "top", "bottom", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Landroidx/compose/ui/text/Paragraph;", "getParagraph", "()Landroidx/compose/ui/text/Paragraph;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getStartIndex", "()I", "c", "getEndIndex", "d", "getStartLineIndex", "setStartLineIndex", "(I)V", "e", "getEndLineIndex", "setEndLineIndex", "f", "F", "getTop", "()F", "setTop", "(F)V", "g", "getBottom", "setBottom", "getLength", "length", "<init>", "(Landroidx/compose/ui/text/Paragraph;IIIIFF)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ParagraphInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Paragraph paragraph;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int startIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int endIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int startLineIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int endLineIndex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float top;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public float bottom;

    public ParagraphInfo(@NotNull Paragraph paragraph, int i10, int i11, int i12, int i13, float f6, float f10) {
        Intrinsics.checkNotNullParameter(paragraph, "paragraph");
        this.paragraph = paragraph;
        this.startIndex = i10;
        this.endIndex = i11;
        this.startLineIndex = i12;
        this.endLineIndex = i13;
        this.top = f6;
        this.bottom = f10;
    }

    public static /* synthetic */ ParagraphInfo copy$default(ParagraphInfo paragraphInfo, Paragraph paragraph, int i10, int i11, int i12, int i13, float f6, float f10, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            paragraph = paragraphInfo.paragraph;
        }
        if ((i14 & 2) != 0) {
            i10 = paragraphInfo.startIndex;
        }
        int i15 = i10;
        if ((i14 & 4) != 0) {
            i11 = paragraphInfo.endIndex;
        }
        int i16 = i11;
        if ((i14 & 8) != 0) {
            i12 = paragraphInfo.startLineIndex;
        }
        int i17 = i12;
        if ((i14 & 16) != 0) {
            i13 = paragraphInfo.endLineIndex;
        }
        int i18 = i13;
        if ((i14 & 32) != 0) {
            f6 = paragraphInfo.top;
        }
        float f11 = f6;
        if ((i14 & 64) != 0) {
            f10 = paragraphInfo.bottom;
        }
        return paragraphInfo.copy(paragraph, i15, i16, i17, i18, f11, f10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    @NotNull
    public final ParagraphInfo copy(@NotNull Paragraph paragraph, int startIndex, int endIndex, int startLineIndex, int endLineIndex, float top, float bottom) {
        Intrinsics.checkNotNullParameter(paragraph, "paragraph");
        return new ParagraphInfo(paragraph, startIndex, endIndex, startLineIndex, endLineIndex, top, bottom);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) other;
        return Intrinsics.areEqual(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && Float.compare(this.top, paragraphInfo.top) == 0 && Float.compare(this.bottom, paragraphInfo.bottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final int getLength() {
        return this.endIndex - this.startIndex;
    }

    @NotNull
    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.bottom) + z1.a(this.top, ((((((((this.paragraph.hashCode() * 31) + this.startIndex) * 31) + this.endIndex) * 31) + this.startLineIndex) * 31) + this.endLineIndex) * 31, 31);
    }

    public final void setBottom(float f6) {
        this.bottom = f6;
    }

    public final void setEndLineIndex(int i10) {
        this.endLineIndex = i10;
    }

    public final void setStartLineIndex(int i10) {
        this.startLineIndex = i10;
    }

    public final void setTop(float f6) {
        this.top = f6;
    }

    @NotNull
    public final Rect toGlobal(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.m2312translatek4lQ0M(OffsetKt.Offset(0.0f, this.top));
    }

    /* JADX INFO: renamed from: toGlobal-GEjPoXI, reason: not valid java name */
    public final long m3874toGlobalGEjPoXI(long j10) {
        return TextRangeKt.TextRange(toGlobalIndex(TextRange.m3967getStartimpl(j10)), toGlobalIndex(TextRange.m3962getEndimpl(j10)));
    }

    public final int toGlobalIndex(int i10) {
        return i10 + this.startIndex;
    }

    public final int toGlobalLineIndex(int i10) {
        return i10 + this.startLineIndex;
    }

    public final float toGlobalYPosition(float f6) {
        return f6 + this.top;
    }

    /* JADX INFO: renamed from: toLocal-MK-Hz9U, reason: not valid java name */
    public final long m3875toLocalMKHz9U(long j10) {
        return OffsetKt.Offset(Offset.m2275getXimpl(j10), Offset.m2276getYimpl(j10) - this.top);
    }

    public final int toLocalIndex(int i10) {
        int i11 = this.endIndex;
        int i12 = this.startIndex;
        return c.coerceIn(i10, i12, i11) - i12;
    }

    public final int toLocalLineIndex(int i10) {
        return i10 - this.startLineIndex;
    }

    public final float toLocalYPosition(float f6) {
        return f6 - this.top;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.paragraph);
        sb2.append(", startIndex=");
        sb2.append(this.startIndex);
        sb2.append(", endIndex=");
        sb2.append(this.endIndex);
        sb2.append(", startLineIndex=");
        sb2.append(this.startLineIndex);
        sb2.append(", endLineIndex=");
        sb2.append(this.endLineIndex);
        sb2.append(", top=");
        sb2.append(this.top);
        sb2.append(", bottom=");
        return u.i(sb2, this.bottom, RootService.CLOSE_BRACKET);
    }

    @NotNull
    public final Path toGlobal(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        path.mo2412translatek4lQ0M(OffsetKt.Offset(0.0f, this.top));
        return path;
    }

    public /* synthetic */ ParagraphInfo(Paragraph paragraph, int i10, int i11, int i12, int i13, float f6, float f10, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(paragraph, i10, i11, (i14 & 8) != 0 ? -1 : i12, (i14 & 16) != 0 ? -1 : i13, (i14 & 32) != 0 ? -1.0f : f6, (i14 & 64) != 0 ? -1.0f : f10);
    }
}

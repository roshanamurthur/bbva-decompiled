package androidx.compose.ui.text.android.animation;

import androidx.activity.a;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SegmentBreaker.kt */
/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003JE\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019¨\u0006&"}, d2 = {"Landroidx/compose/ui/text/android/animation/Segment;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "startOffset", "endOffset", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getStartOffset", "()I", "b", "getEndOffset", "c", "getLeft", "d", "getTop", "e", "getRight", "f", "getBottom", "<init>", "(IIIIII)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Segment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int startOffset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int endOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int left;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int top;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int right;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int bottom;

    public Segment(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.startOffset = i10;
        this.endOffset = i11;
        this.left = i12;
        this.top = i13;
        this.right = i14;
        this.bottom = i15;
    }

    public static /* synthetic */ Segment copy$default(Segment segment, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i10 = segment.startOffset;
        }
        if ((i16 & 2) != 0) {
            i11 = segment.endOffset;
        }
        int i17 = i11;
        if ((i16 & 4) != 0) {
            i12 = segment.left;
        }
        int i18 = i12;
        if ((i16 & 8) != 0) {
            i13 = segment.top;
        }
        int i19 = i13;
        if ((i16 & 16) != 0) {
            i14 = segment.right;
        }
        int i20 = i14;
        if ((i16 & 32) != 0) {
            i15 = segment.bottom;
        }
        return segment.copy(i10, i17, i18, i19, i20, i15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStartOffset() {
        return this.startOffset;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEndOffset() {
        return this.endOffset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    @NotNull
    public final Segment copy(int startOffset, int endOffset, int left, int top, int right, int bottom) {
        return new Segment(startOffset, endOffset, left, top, right, bottom);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) other;
        return this.startOffset == segment.startOffset && this.endOffset == segment.endOffset && this.left == segment.left && this.top == segment.top && this.right == segment.right && this.bottom == segment.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getEndOffset() {
        return this.endOffset;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getStartOffset() {
        return this.startOffset;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((((((this.startOffset * 31) + this.endOffset) * 31) + this.left) * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Segment(startOffset=");
        sb2.append(this.startOffset);
        sb2.append(", endOffset=");
        sb2.append(this.endOffset);
        sb2.append(", left=");
        sb2.append(this.left);
        sb2.append(", top=");
        sb2.append(this.top);
        sb2.append(", right=");
        sb2.append(this.right);
        sb2.append(", bottom=");
        return a.d(sb2, this.bottom, RootService.CLOSE_BRACKET);
    }
}

package com.bbva.document.scanner.camera;

import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Dimensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/bbva/document/scanner/camera/FramePosition;", "", "", "component1", "component2", "component3", "component4", Parameters.DIRECTION.LEFT, "top", "width", "height", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLeft", "()I", "b", "getTop", "c", "getWidth", "d", "getHeight", "<init>", "(IIII)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class FramePosition {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int height;

    public FramePosition(int i10, int i11, int i12, int i13) {
        this.left = i10;
        this.top = i11;
        this.width = i12;
        this.height = i13;
    }

    public static /* synthetic */ FramePosition copy$default(FramePosition framePosition, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = framePosition.left;
        }
        if ((i14 & 2) != 0) {
            i11 = framePosition.top;
        }
        if ((i14 & 4) != 0) {
            i12 = framePosition.width;
        }
        if ((i14 & 8) != 0) {
            i13 = framePosition.height;
        }
        return framePosition.copy(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final FramePosition copy(int left, int top, int width, int height) {
        return new FramePosition(left, top, width, height);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FramePosition)) {
            return false;
        }
        FramePosition framePosition = (FramePosition) other;
        return this.left == framePosition.left && this.top == framePosition.top && this.width == framePosition.width && this.height == framePosition.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.width) * 31) + this.height;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FramePosition(left=");
        sb2.append(this.left);
        sb2.append(", top=");
        sb2.append(this.top);
        sb2.append(", width=");
        sb2.append(this.width);
        sb2.append(", height=");
        return a.c(sb2, this.height, ")");
    }
}

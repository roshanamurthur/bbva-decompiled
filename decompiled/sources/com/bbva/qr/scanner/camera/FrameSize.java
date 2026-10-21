package com.bbva.qr.scanner.camera;

import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CameraOptions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bbva/qr/scanner/camera/FrameSize;", "", "", "component1", "component2", "width", "height", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getWidth", "()I", "b", "getHeight", "<init>", "(II)V", "qr_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class FrameSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int height;

    public FrameSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public static /* synthetic */ FrameSize copy$default(FrameSize frameSize, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = frameSize.width;
        }
        if ((i12 & 2) != 0) {
            i11 = frameSize.height;
        }
        return frameSize.copy(i10, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final FrameSize copy(int width, int height) {
        return new FrameSize(width, height);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrameSize)) {
            return false;
        }
        FrameSize frameSize = (FrameSize) other;
        return this.width == frameSize.width && this.height == frameSize.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FrameSize(width=");
        sb2.append(this.width);
        sb2.append(", height=");
        return a.c(sb2, this.height, ")");
    }
}

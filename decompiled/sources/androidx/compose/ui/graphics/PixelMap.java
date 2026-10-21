package androidx.compose.ui.graphics;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PixelMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0016\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/PixelMap;", "", "", "x", "y", "Landroidx/compose/ui/graphics/Color;", "get-WaAFU9c", "(II)J", "get", "", "a", "[I", "getBuffer", "()[I", "buffer", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getWidth", "()I", "width", "c", "getHeight", "height", "d", "getBufferOffset", "bufferOffset", "e", "getStride", "stride", "<init>", "([IIIII)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class PixelMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final int[] buffer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int height;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int bufferOffset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int stride;

    public PixelMap(@NotNull int[] buffer, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        this.width = i10;
        this.height = i11;
        this.bufferOffset = i12;
        this.stride = i13;
    }

    /* JADX INFO: renamed from: get-WaAFU9c, reason: not valid java name */
    public final long m2762getWaAFU9c(int x4, int y7) {
        return ColorKt.Color(this.buffer[(y7 * this.stride) + this.bufferOffset + x4]);
    }

    @NotNull
    public final int[] getBuffer() {
        return this.buffer;
    }

    public final int getBufferOffset() {
        return this.bufferOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getStride() {
        return this.stride;
    }

    public final int getWidth() {
        return this.width;
    }
}

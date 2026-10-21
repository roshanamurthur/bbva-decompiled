package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ImageBitmap.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0014\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0013\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmapConfig;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "value", "constructor-impl", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class ImageBitmapConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15661b = m2685constructorimpl(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15662c = m2685constructorimpl(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15663d = m2685constructorimpl(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f15664e = m2685constructorimpl(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f15665f = m2685constructorimpl(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int value;

    /* JADX INFO: compiled from: ImageBitmap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;", "", "()V", "Alpha8", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getAlpha8-_sVssgQ", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Argb8888", "getArgb8888-_sVssgQ", "F16", "getF16-_sVssgQ", "Gpu", "getGpu-_sVssgQ", "Rgb565", "getRgb565-_sVssgQ", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAlpha8-_sVssgQ, reason: not valid java name */
        public final int m2691getAlpha8_sVssgQ() {
            return ImageBitmapConfig.f15662c;
        }

        /* JADX INFO: renamed from: getArgb8888-_sVssgQ, reason: not valid java name */
        public final int m2692getArgb8888_sVssgQ() {
            return ImageBitmapConfig.f15661b;
        }

        /* JADX INFO: renamed from: getF16-_sVssgQ, reason: not valid java name */
        public final int m2693getF16_sVssgQ() {
            return ImageBitmapConfig.f15664e;
        }

        /* JADX INFO: renamed from: getGpu-_sVssgQ, reason: not valid java name */
        public final int m2694getGpu_sVssgQ() {
            return ImageBitmapConfig.f15665f;
        }

        /* JADX INFO: renamed from: getRgb565-_sVssgQ, reason: not valid java name */
        public final int m2695getRgb565_sVssgQ() {
            return ImageBitmapConfig.f15663d;
        }
    }

    public /* synthetic */ ImageBitmapConfig(int i10) {
        this.value = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImageBitmapConfig m2684boximpl(int i10) {
        return new ImageBitmapConfig(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2686equalsimpl(int i10, Object obj) {
        return (obj instanceof ImageBitmapConfig) && i10 == ((ImageBitmapConfig) obj).m2690unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2687equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2689toStringimpl(int i10) {
        if (m2687equalsimpl0(i10, f15661b)) {
            return "Argb8888";
        }
        if (m2687equalsimpl0(i10, f15662c)) {
            return "Alpha8";
        }
        if (m2687equalsimpl0(i10, f15663d)) {
            return "Rgb565";
        }
        if (m2687equalsimpl0(i10, f15664e)) {
            return "F16";
        }
        return m2687equalsimpl0(i10, f15665f) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2686equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m2688hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m2689toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2690unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m2685constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2688hashCodeimpl(int i10) {
        return i10;
    }
}

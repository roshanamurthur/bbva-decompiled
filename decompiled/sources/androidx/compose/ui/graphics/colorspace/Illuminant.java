package androidx.compose.ui.graphics.colorspace;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Illuminant.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0014\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u001a\u0010%\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Illuminant;", "", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "a", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getA", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "b", "getB", "B", "c", "getC", "C", "d", "getD50", "D50", "e", "getD55", "D55", "f", "getD60", "D60", "g", "getD65", "D65", "h", "getD75", "D75", "i", "getE", ExifInterface.LONGITUDE_EAST, "", "j", "[F", "getD50Xyz$ui_graphics_release", "()[F", "D50Xyz", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class Illuminant {

    @NotNull
    public static final Illuminant INSTANCE = new Illuminant();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final WhitePoint A = new WhitePoint(0.44757f, 0.40745f);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final WhitePoint B = new WhitePoint(0.34842f, 0.35161f);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final WhitePoint C = new WhitePoint(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final WhitePoint D50 = new WhitePoint(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final WhitePoint D55 = new WhitePoint(0.33242f, 0.34743f);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final WhitePoint D60 = new WhitePoint(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final WhitePoint D65 = new WhitePoint(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final WhitePoint D75 = new WhitePoint(0.29902f, 0.31485f);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final WhitePoint E = new WhitePoint(0.33333f, 0.33333f);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final float[] D50Xyz = {0.964212f, 1.0f, 0.825188f};

    @NotNull
    public final WhitePoint getA() {
        return A;
    }

    @NotNull
    public final WhitePoint getB() {
        return B;
    }

    @NotNull
    public final WhitePoint getC() {
        return C;
    }

    @NotNull
    public final WhitePoint getD50() {
        return D50;
    }

    @NotNull
    public final float[] getD50Xyz$ui_graphics_release() {
        return D50Xyz;
    }

    @NotNull
    public final WhitePoint getD55() {
        return D55;
    }

    @NotNull
    public final WhitePoint getD60() {
        return D60;
    }

    @NotNull
    public final WhitePoint getD65() {
        return D65;
    }

    @NotNull
    public final WhitePoint getD75() {
        return D75;
    }

    @NotNull
    public final WhitePoint getE() {
        return E;
    }
}

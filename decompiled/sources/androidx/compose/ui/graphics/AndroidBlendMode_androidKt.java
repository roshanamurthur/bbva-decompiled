package androidx.compose.ui.graphics;

import android.graphics.PorterDuff;
import android.os.Build;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidBlendMode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\n*\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/BlendMode;", "isSupported-s9anfk8", "(I)Z", "toAndroidBlendMode", "Landroid/graphics/BlendMode;", "toAndroidBlendMode-s9anfk8", "(I)Landroid/graphics/BlendMode;", "toPorterDuffMode", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode-s9anfk8", "(I)Landroid/graphics/PorterDuff$Mode;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidBlendMode_androidKt {
    /* JADX INFO: renamed from: isSupported-s9anfk8, reason: not valid java name */
    public static final boolean m2366isSupporteds9anfk8(int i10) {
        return Build.VERSION.SDK_INT >= 29 || BlendMode.m2428equalsimpl0(i10, BlendMode.INSTANCE.m2459getSrcOver0nO6VwU()) || m2368toPorterDuffModes9anfk8(i10) != PorterDuff.Mode.SRC_OVER;
    }

    @RequiresApi(29)
    @NotNull
    /* JADX INFO: renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final android.graphics.BlendMode m2367toAndroidBlendModes9anfk8(int i10) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        if (BlendMode.m2428equalsimpl0(i10, companion.m2432getClear0nO6VwU())) {
            return android.graphics.BlendMode.CLEAR;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2455getSrc0nO6VwU())) {
            return android.graphics.BlendMode.SRC;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2438getDst0nO6VwU())) {
            return android.graphics.BlendMode.DST;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2459getSrcOver0nO6VwU())) {
            return android.graphics.BlendMode.SRC_OVER;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2442getDstOver0nO6VwU())) {
            return android.graphics.BlendMode.DST_OVER;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2457getSrcIn0nO6VwU())) {
            return android.graphics.BlendMode.SRC_IN;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2440getDstIn0nO6VwU())) {
            return android.graphics.BlendMode.DST_IN;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2458getSrcOut0nO6VwU())) {
            return android.graphics.BlendMode.SRC_OUT;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2441getDstOut0nO6VwU())) {
            return android.graphics.BlendMode.DST_OUT;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2456getSrcAtop0nO6VwU())) {
            return android.graphics.BlendMode.SRC_ATOP;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2439getDstAtop0nO6VwU())) {
            return android.graphics.BlendMode.DST_ATOP;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2460getXor0nO6VwU())) {
            return android.graphics.BlendMode.XOR;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2451getPlus0nO6VwU())) {
            return android.graphics.BlendMode.PLUS;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2448getModulate0nO6VwU())) {
            return android.graphics.BlendMode.MODULATE;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2453getScreen0nO6VwU())) {
            return android.graphics.BlendMode.SCREEN;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2450getOverlay0nO6VwU())) {
            return android.graphics.BlendMode.OVERLAY;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2436getDarken0nO6VwU())) {
            return android.graphics.BlendMode.DARKEN;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2446getLighten0nO6VwU())) {
            return android.graphics.BlendMode.LIGHTEN;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2435getColorDodge0nO6VwU())) {
            return android.graphics.BlendMode.COLOR_DODGE;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2434getColorBurn0nO6VwU())) {
            return android.graphics.BlendMode.COLOR_BURN;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2444getHardlight0nO6VwU())) {
            return android.graphics.BlendMode.HARD_LIGHT;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2454getSoftlight0nO6VwU())) {
            return android.graphics.BlendMode.SOFT_LIGHT;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2437getDifference0nO6VwU())) {
            return android.graphics.BlendMode.DIFFERENCE;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2443getExclusion0nO6VwU())) {
            return android.graphics.BlendMode.EXCLUSION;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2449getMultiply0nO6VwU())) {
            return android.graphics.BlendMode.MULTIPLY;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2445getHue0nO6VwU())) {
            return android.graphics.BlendMode.HUE;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2452getSaturation0nO6VwU())) {
            return android.graphics.BlendMode.SATURATION;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2433getColor0nO6VwU())) {
            return android.graphics.BlendMode.COLOR;
        }
        return BlendMode.m2428equalsimpl0(i10, companion.m2447getLuminosity0nO6VwU()) ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    @NotNull
    /* JADX INFO: renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final PorterDuff.Mode m2368toPorterDuffModes9anfk8(int i10) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        if (BlendMode.m2428equalsimpl0(i10, companion.m2432getClear0nO6VwU())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2455getSrc0nO6VwU())) {
            return PorterDuff.Mode.SRC;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2438getDst0nO6VwU())) {
            return PorterDuff.Mode.DST;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2459getSrcOver0nO6VwU())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2442getDstOver0nO6VwU())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2457getSrcIn0nO6VwU())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2440getDstIn0nO6VwU())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2458getSrcOut0nO6VwU())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2441getDstOut0nO6VwU())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2456getSrcAtop0nO6VwU())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2439getDstAtop0nO6VwU())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2460getXor0nO6VwU())) {
            return PorterDuff.Mode.XOR;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2451getPlus0nO6VwU())) {
            return PorterDuff.Mode.ADD;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2453getScreen0nO6VwU())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2450getOverlay0nO6VwU())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2436getDarken0nO6VwU())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (BlendMode.m2428equalsimpl0(i10, companion.m2446getLighten0nO6VwU())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return BlendMode.m2428equalsimpl0(i10, companion.m2448getModulate0nO6VwU()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}

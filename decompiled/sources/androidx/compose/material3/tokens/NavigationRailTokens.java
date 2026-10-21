package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NavigationRailTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u001c\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bp\u0010qR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R \u0010\u001c\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010%\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00104\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010\u0019\u001a\u0004\b3\u0010\u001bR\u0017\u00107\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u0010!R \u0010:\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b8\u0010\u0019\u001a\u0004\b9\u0010\u001bR \u0010=\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\u0019\u001a\u0004\b<\u0010\u001bR\u0017\u0010@\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u0017\u0010F\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R\u0017\u0010L\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006R\u0017\u0010O\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010\u0004\u001a\u0004\bN\u0010\u0006R\u0017\u0010R\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010\u0006R\u0017\u0010U\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006R\u0017\u0010[\u001a\u00020V8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010^\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010\u0004\u001a\u0004\b]\u0010\u0006R\u0017\u0010a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b_\u0010\u0004\u001a\u0004\b`\u0010\u0006R\u0017\u0010d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u0010\u0004\u001a\u0004\bc\u0010\u0006R \u0010g\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\be\u0010\u0019\u001a\u0004\bf\u0010\u001bR\u0017\u0010j\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010\u0004\u001a\u0004\bi\u0010\u0006R \u0010l\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0019\u001a\u0004\bk\u0010\u001bR\u0017\u0010o\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bm\u0010\u001f\u001a\u0004\bn\u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Landroidx/compose/material3/tokens/NavigationRailTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveFocusIconColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveFocusIconColor", "b", "getActiveFocusLabelTextColor", "ActiveFocusLabelTextColor", "c", "getActiveHoverIconColor", "ActiveHoverIconColor", "d", "getActiveHoverLabelTextColor", "ActiveHoverLabelTextColor", "e", "getActiveIconColor", "ActiveIconColor", "f", "getActiveIndicatorColor", "ActiveIndicatorColor", "Landroidx/compose/ui/unit/Dp;", "g", "F", "getActiveIndicatorHeight-D9Ej5fM", "()F", "ActiveIndicatorHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "h", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getActiveIndicatorShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveIndicatorShape", "i", "getActiveIndicatorWidth-D9Ej5fM", "ActiveIndicatorWidth", "j", "getActiveLabelTextColor", "ActiveLabelTextColor", "k", "getActivePressedIconColor", "ActivePressedIconColor", "l", "getActivePressedLabelTextColor", "ActivePressedLabelTextColor", "m", "getContainerColor", "ContainerColor", "n", "getContainerElevation-D9Ej5fM", "ContainerElevation", "o", "getContainerShape", "ContainerShape", "p", "getContainerWidth-D9Ej5fM", "ContainerWidth", "q", "getIconSize-D9Ej5fM", "IconSize", "r", "getInactiveFocusIconColor", "InactiveFocusIconColor", "s", "getInactiveFocusLabelTextColor", "InactiveFocusLabelTextColor", "t", "getInactiveHoverIconColor", "InactiveHoverIconColor", "u", "getInactiveHoverLabelTextColor", "InactiveHoverLabelTextColor", SharedPrefsStorage.VERSION_KEY, "getInactiveIconColor", "InactiveIconColor", "w", "getInactiveLabelTextColor", "InactiveLabelTextColor", "x", "getInactivePressedIconColor", "InactivePressedIconColor", "y", "getInactivePressedLabelTextColor", "InactivePressedLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "z", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getMenuFocusIconColor", "MenuFocusIconColor", "B", "getMenuHoverIconColor", "MenuHoverIconColor", "C", "getMenuIconColor", "MenuIconColor", "D", "getMenuIconSize-D9Ej5fM", "MenuIconSize", ExifInterface.LONGITUDE_EAST, "getMenuPressedIconColor", "MenuPressedIconColor", "getNoLabelActiveIndicatorHeight-D9Ej5fM", "NoLabelActiveIndicatorHeight", "G", "getNoLabelActiveIndicatorShape", "NoLabelActiveIndicatorShape", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationRailTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRailTokens.kt\nandroidx/compose/material3/tokens/NavigationRailTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,57:1\n164#2:58\n164#2:59\n164#2:60\n164#2:61\n164#2:62\n164#2:63\n*S KotlinDebug\n*F\n+ 1 NavigationRailTokens.kt\nandroidx/compose/material3/tokens/NavigationRailTokens\n*L\n30#1:58\n32#1:59\n39#1:60\n40#1:61\n53#1:62\n55#1:63\n*E\n"})
public final class NavigationRailTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens MenuFocusIconColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens MenuHoverIconColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens MenuIconColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public static final float MenuIconSize;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens MenuPressedIconColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final float NoLabelActiveIndicatorHeight;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens NoLabelActiveIndicatorShape;

    @NotNull
    public static final NavigationRailTokens INSTANCE = new NavigationRailTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveFocusIconColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveFocusLabelTextColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveHoverIconColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveHoverLabelTextColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveIconColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveIndicatorColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final float ActiveIndicatorHeight;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ActiveIndicatorShape;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final float ActiveIndicatorWidth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveLabelTextColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActivePressedIconColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActivePressedLabelTextColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerElevation;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerWidth;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final float IconSize;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveFocusIconColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveFocusLabelTextColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveHoverIconColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveHoverLabelTextColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveIconColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveLabelTextColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactivePressedIconColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactivePressedLabelTextColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens LabelTextFont;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSecondaryContainer;
        ActiveFocusIconColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        ActiveFocusLabelTextColor = colorSchemeKeyTokens2;
        ActiveHoverIconColor = colorSchemeKeyTokens;
        ActiveHoverLabelTextColor = colorSchemeKeyTokens2;
        ActiveIconColor = colorSchemeKeyTokens;
        ActiveIndicatorColor = ColorSchemeKeyTokens.SecondaryContainer;
        ActiveIndicatorHeight = Dp.m4389constructorimpl((float) 32.0d);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ActiveIndicatorShape = shapeKeyTokens;
        float f6 = (float) 56.0d;
        ActiveIndicatorWidth = Dp.m4389constructorimpl(f6);
        ActiveLabelTextColor = colorSchemeKeyTokens2;
        ActivePressedIconColor = colorSchemeKeyTokens;
        ActivePressedLabelTextColor = colorSchemeKeyTokens2;
        ContainerColor = ColorSchemeKeyTokens.Surface;
        ContainerElevation = ElevationTokens.INSTANCE.m1636getLevel0D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerNone;
        ContainerWidth = Dp.m4389constructorimpl((float) 80.0d);
        float f10 = (float) 24.0d;
        IconSize = Dp.m4389constructorimpl(f10);
        InactiveFocusIconColor = colorSchemeKeyTokens2;
        InactiveFocusLabelTextColor = colorSchemeKeyTokens2;
        InactiveHoverIconColor = colorSchemeKeyTokens2;
        InactiveHoverLabelTextColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        InactiveIconColor = colorSchemeKeyTokens3;
        InactiveLabelTextColor = colorSchemeKeyTokens3;
        InactivePressedIconColor = colorSchemeKeyTokens2;
        InactivePressedLabelTextColor = colorSchemeKeyTokens2;
        LabelTextFont = TypographyKeyTokens.LabelMedium;
        MenuFocusIconColor = colorSchemeKeyTokens2;
        MenuHoverIconColor = colorSchemeKeyTokens2;
        MenuIconColor = colorSchemeKeyTokens3;
        MenuIconSize = Dp.m4389constructorimpl(f10);
        MenuPressedIconColor = colorSchemeKeyTokens2;
        NoLabelActiveIndicatorHeight = Dp.m4389constructorimpl(f6);
        NoLabelActiveIndicatorShape = shapeKeyTokens;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveFocusIconColor() {
        return ActiveFocusIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveFocusLabelTextColor() {
        return ActiveFocusLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveHoverIconColor() {
        return ActiveHoverIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveHoverLabelTextColor() {
        return ActiveHoverLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveIconColor() {
        return ActiveIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* JADX INFO: renamed from: getActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m1795getActiveIndicatorHeightD9Ej5fM() {
        return ActiveIndicatorHeight;
    }

    @NotNull
    public final ShapeKeyTokens getActiveIndicatorShape() {
        return ActiveIndicatorShape;
    }

    /* JADX INFO: renamed from: getActiveIndicatorWidth-D9Ej5fM, reason: not valid java name */
    public final float m1796getActiveIndicatorWidthD9Ej5fM() {
        return ActiveIndicatorWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveLabelTextColor() {
        return ActiveLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActivePressedIconColor() {
        return ActivePressedIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActivePressedLabelTextColor() {
        return ActivePressedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1797getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* JADX INFO: renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1798getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1799getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveFocusIconColor() {
        return InactiveFocusIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveFocusLabelTextColor() {
        return InactiveFocusLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveHoverIconColor() {
        return InactiveHoverIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveHoverLabelTextColor() {
        return InactiveHoverLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveIconColor() {
        return InactiveIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveLabelTextColor() {
        return InactiveLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactivePressedIconColor() {
        return InactivePressedIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactivePressedLabelTextColor() {
        return InactivePressedLabelTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuFocusIconColor() {
        return MenuFocusIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuHoverIconColor() {
        return MenuHoverIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuIconColor() {
        return MenuIconColor;
    }

    /* JADX INFO: renamed from: getMenuIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1800getMenuIconSizeD9Ej5fM() {
        return MenuIconSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuPressedIconColor() {
        return MenuPressedIconColor;
    }

    /* JADX INFO: renamed from: getNoLabelActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m1801getNoLabelActiveIndicatorHeightD9Ej5fM() {
        return NoLabelActiveIndicatorHeight;
    }

    @NotNull
    public final ShapeKeyTokens getNoLabelActiveIndicatorShape() {
        return NoLabelActiveIndicatorShape;
    }
}

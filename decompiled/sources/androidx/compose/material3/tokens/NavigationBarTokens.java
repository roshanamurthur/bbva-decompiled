package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NavigationBarTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b_\u0010`R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R \u0010\u001c\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010%\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00104\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010\u0019\u001a\u0004\b3\u0010\u001bR \u00107\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0019\u001a\u0004\b6\u0010\u001bR\u0017\u0010:\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010!R\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R \u0010@\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010\u0019\u001a\u0004\b?\u0010\u001bR\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u0017\u0010F\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R\u0017\u0010L\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006R\u0017\u0010O\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010\u0004\u001a\u0004\bN\u0010\u0006R\u0017\u0010R\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010\u0006R\u0017\u0010U\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006R\u0017\u0010X\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0006R\u0017\u0010^\u001a\u00020Y8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Landroidx/compose/material3/tokens/NavigationBarTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveFocusIconColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveFocusIconColor", "b", "getActiveFocusLabelTextColor", "ActiveFocusLabelTextColor", "c", "getActiveHoverIconColor", "ActiveHoverIconColor", "d", "getActiveHoverLabelTextColor", "ActiveHoverLabelTextColor", "e", "getActiveIconColor", "ActiveIconColor", "f", "getActiveIndicatorColor", "ActiveIndicatorColor", "Landroidx/compose/ui/unit/Dp;", "g", "F", "getActiveIndicatorHeight-D9Ej5fM", "()F", "ActiveIndicatorHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "h", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getActiveIndicatorShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveIndicatorShape", "i", "getActiveIndicatorWidth-D9Ej5fM", "ActiveIndicatorWidth", "j", "getActiveLabelTextColor", "ActiveLabelTextColor", "k", "getActivePressedIconColor", "ActivePressedIconColor", "l", "getActivePressedLabelTextColor", "ActivePressedLabelTextColor", "m", "getContainerColor", "ContainerColor", "n", "getContainerElevation-D9Ej5fM", "ContainerElevation", "o", "getContainerHeight-D9Ej5fM", "ContainerHeight", "p", "getContainerShape", "ContainerShape", "q", "getContainerSurfaceTintLayerColor", "ContainerSurfaceTintLayerColor", "r", "getIconSize-D9Ej5fM", "IconSize", "s", "getInactiveFocusIconColor", "InactiveFocusIconColor", "t", "getInactiveFocusLabelTextColor", "InactiveFocusLabelTextColor", "u", "getInactiveHoverIconColor", "InactiveHoverIconColor", SharedPrefsStorage.VERSION_KEY, "getInactiveHoverLabelTextColor", "InactiveHoverLabelTextColor", "w", "getInactiveIconColor", "InactiveIconColor", "x", "getInactiveLabelTextColor", "InactiveLabelTextColor", "y", "getInactivePressedIconColor", "InactivePressedIconColor", "z", "getInactivePressedLabelTextColor", "InactivePressedLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationBarTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBarTokens.kt\nandroidx/compose/material3/tokens/NavigationBarTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,51:1\n164#2:52\n164#2:53\n164#2:54\n164#2:55\n*S KotlinDebug\n*F\n+ 1 NavigationBarTokens.kt\nandroidx/compose/material3/tokens/NavigationBarTokens\n*L\n30#1:52\n32#1:53\n38#1:54\n41#1:55\n*E\n"})
public final class NavigationBarTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens LabelTextFont;

    @NotNull
    public static final NavigationBarTokens INSTANCE = new NavigationBarTokens();

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
    public static final float ContainerHeight;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final float IconSize;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveFocusIconColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveFocusLabelTextColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveHoverIconColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveHoverLabelTextColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveIconColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveLabelTextColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactivePressedIconColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactivePressedLabelTextColor;

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
        ActiveIndicatorShape = ShapeKeyTokens.CornerFull;
        ActiveIndicatorWidth = Dp.m4389constructorimpl((float) 64.0d);
        ActiveLabelTextColor = colorSchemeKeyTokens2;
        ActivePressedIconColor = colorSchemeKeyTokens;
        ActivePressedLabelTextColor = colorSchemeKeyTokens2;
        ContainerColor = ColorSchemeKeyTokens.Surface;
        ContainerElevation = ElevationTokens.INSTANCE.m1638getLevel2D9Ej5fM();
        ContainerHeight = Dp.m4389constructorimpl((float) 80.0d);
        ContainerShape = ShapeKeyTokens.CornerNone;
        ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
        IconSize = Dp.m4389constructorimpl((float) 24.0d);
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
    public final float m1784getActiveIndicatorHeightD9Ej5fM() {
        return ActiveIndicatorHeight;
    }

    @NotNull
    public final ShapeKeyTokens getActiveIndicatorShape() {
        return ActiveIndicatorShape;
    }

    /* JADX INFO: renamed from: getActiveIndicatorWidth-D9Ej5fM, reason: not valid java name */
    public final float m1785getActiveIndicatorWidthD9Ej5fM() {
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
    public final float m1786getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1787getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return ContainerSurfaceTintLayerColor;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1788getIconSizeD9Ej5fM() {
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
}

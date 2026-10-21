package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimaryNavigationTabTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\be\u0010fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R \u0010\u0019\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR \u0010\u001c\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010(\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b'\u0010\fR\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R \u00107\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\n\u001a\u0004\b6\u0010\fR \u0010:\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b8\u0010\n\u001a\u0004\b9\u0010\fR\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u0017\u0010@\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u0017\u0010F\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R\u0017\u0010L\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006R\u0017\u0010O\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010\u0004\u001a\u0004\bN\u0010\u0006R\u0017\u0010R\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010\u0006R\u0017\u0010U\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006R\u0017\u0010X\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0006R\u0017\u0010[\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010\u0004\u001a\u0004\bZ\u0010\u0006R\u0017\u0010^\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010\u0004\u001a\u0004\b]\u0010\u0006R\u0017\u0010d\u001a\u00020_8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006g"}, d2 = {"Landroidx/compose/material3/tokens/PrimaryNavigationTabTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveIndicatorColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIndicatorColor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getActiveIndicatorHeight-D9Ej5fM", "()F", "ActiveIndicatorHeight", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "c", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getActiveIndicatorShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "ActiveIndicatorShape", "d", "getContainerColor", "ContainerColor", "e", "getContainerElevation-D9Ej5fM", "ContainerElevation", "f", "getContainerHeight-D9Ej5fM", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "g", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "h", "getDividerColor", "DividerColor", "i", "getDividerHeight-D9Ej5fM", "DividerHeight", "j", "getActiveFocusIconColor", "ActiveFocusIconColor", "k", "getActiveHoverIconColor", "ActiveHoverIconColor", "l", "getActiveIconColor", "ActiveIconColor", "m", "getActivePressedIconColor", "ActivePressedIconColor", "n", "getIconAndLabelTextContainerHeight-D9Ej5fM", "IconAndLabelTextContainerHeight", "o", "getIconSize-D9Ej5fM", "IconSize", "p", "getInactiveFocusIconColor", "InactiveFocusIconColor", "q", "getInactiveHoverIconColor", "InactiveHoverIconColor", "r", "getInactiveIconColor", "InactiveIconColor", "s", "getInactivePressedIconColor", "InactivePressedIconColor", "t", "getActiveFocusLabelTextColor", "ActiveFocusLabelTextColor", "u", "getActiveHoverLabelTextColor", "ActiveHoverLabelTextColor", SharedPrefsStorage.VERSION_KEY, "getActiveLabelTextColor", "ActiveLabelTextColor", "w", "getActivePressedLabelTextColor", "ActivePressedLabelTextColor", "x", "getInactiveFocusLabelTextColor", "InactiveFocusLabelTextColor", "y", "getInactiveHoverLabelTextColor", "InactiveHoverLabelTextColor", "z", "getInactiveLabelTextColor", "InactiveLabelTextColor", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getInactivePressedLabelTextColor", "InactivePressedLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "B", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrimaryNavigationTabTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryNavigationTabTokens.kt\nandroidx/compose/material3/tokens/PrimaryNavigationTabTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,53:1\n164#2:54\n164#2:55\n164#2:56\n164#2:57\n164#2:58\n164#2:59\n*S KotlinDebug\n*F\n+ 1 PrimaryNavigationTabTokens.kt\nandroidx/compose/material3/tokens/PrimaryNavigationTabTokens\n*L\n26#1:54\n27#1:55\n30#1:56\n33#1:57\n38#1:58\n39#1:59\n*E\n"})
public final class PrimaryNavigationTabTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactivePressedLabelTextColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens LabelTextFont;

    @NotNull
    public static final PrimaryNavigationTabTokens INSTANCE = new PrimaryNavigationTabTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveIndicatorColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float ActiveIndicatorHeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final RoundedCornerShape ActiveIndicatorShape;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerElevation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DividerColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final float DividerHeight;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveFocusIconColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveHoverIconColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveIconColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActivePressedIconColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final float IconAndLabelTextContainerHeight;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final float IconSize;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveFocusIconColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveHoverIconColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveIconColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactivePressedIconColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveFocusLabelTextColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveHoverLabelTextColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveLabelTextColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActivePressedLabelTextColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveFocusLabelTextColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveHoverLabelTextColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveLabelTextColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        float f6 = (float) 3.0d;
        ActiveIndicatorHeight = Dp.m4389constructorimpl(f6);
        ActiveIndicatorShape = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(Dp.m4389constructorimpl(f6));
        ContainerColor = ColorSchemeKeyTokens.Surface;
        ContainerElevation = ElevationTokens.INSTANCE.m1636getLevel0D9Ej5fM();
        ContainerHeight = Dp.m4389constructorimpl((float) 48.0d);
        ContainerShape = ShapeKeyTokens.CornerNone;
        DividerColor = ColorSchemeKeyTokens.SurfaceVariant;
        DividerHeight = Dp.m4389constructorimpl((float) 1.0d);
        ActiveFocusIconColor = colorSchemeKeyTokens;
        ActiveHoverIconColor = colorSchemeKeyTokens;
        ActiveIconColor = colorSchemeKeyTokens;
        ActivePressedIconColor = colorSchemeKeyTokens;
        IconAndLabelTextContainerHeight = Dp.m4389constructorimpl((float) 64.0d);
        IconSize = Dp.m4389constructorimpl((float) 24.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        InactiveFocusIconColor = colorSchemeKeyTokens2;
        InactiveHoverIconColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        InactiveIconColor = colorSchemeKeyTokens3;
        InactivePressedIconColor = colorSchemeKeyTokens2;
        ActiveFocusLabelTextColor = colorSchemeKeyTokens;
        ActiveHoverLabelTextColor = colorSchemeKeyTokens;
        ActiveLabelTextColor = colorSchemeKeyTokens;
        ActivePressedLabelTextColor = colorSchemeKeyTokens;
        InactiveFocusLabelTextColor = colorSchemeKeyTokens2;
        InactiveHoverLabelTextColor = colorSchemeKeyTokens2;
        InactiveLabelTextColor = colorSchemeKeyTokens3;
        InactivePressedLabelTextColor = colorSchemeKeyTokens2;
        LabelTextFont = TypographyKeyTokens.TitleSmall;
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
    public final float m1913getActiveIndicatorHeightD9Ej5fM() {
        return ActiveIndicatorHeight;
    }

    @NotNull
    public final RoundedCornerShape getActiveIndicatorShape() {
        return ActiveIndicatorShape;
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
    public final float m1914getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1915getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDividerColor() {
        return DividerColor;
    }

    /* JADX INFO: renamed from: getDividerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1916getDividerHeightD9Ej5fM() {
        return DividerHeight;
    }

    /* JADX INFO: renamed from: getIconAndLabelTextContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1917getIconAndLabelTextContainerHeightD9Ej5fM() {
        return IconAndLabelTextContainerHeight;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1918getIconSizeD9Ej5fM() {
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

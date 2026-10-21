package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NavigationDrawerTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b1\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\br\u0010sR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R \u0010\u001c\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010%\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u0017\u00101\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010!R\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u0014\u00106\u001a\u0002058\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0019R\u0017\u00109\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b7\u0010\u001f\u001a\u0004\b8\u0010!R\u0017\u0010<\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010\u0004\u001a\u0004\b;\u0010\u0006R \u0010?\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0019\u001a\u0004\b>\u0010\u001bR\u0017\u0010B\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010\u0004\u001a\u0004\bA\u0010\u0006R\u0017\u0010H\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR \u0010K\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bI\u0010\u0019\u001a\u0004\bJ\u0010\u001bR\u0017\u0010N\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010\u0004\u001a\u0004\bM\u0010\u0006R\u0017\u0010Q\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010\u0004\u001a\u0004\bP\u0010\u0006R\u0017\u0010T\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u0010\u0004\u001a\u0004\bS\u0010\u0006R\u0017\u0010W\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010\u0004\u001a\u0004\bV\u0010\u0006R\u0017\u0010Z\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bX\u0010\u0004\u001a\u0004\bY\u0010\u0006R\u0017\u0010]\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b[\u0010\u0004\u001a\u0004\b\\\u0010\u0006R\u0017\u0010`\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b^\u0010\u0004\u001a\u0004\b_\u0010\u0006R\u0017\u0010c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\ba\u0010\u0004\u001a\u0004\bb\u0010\u0006R\u0017\u0010f\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bd\u0010E\u001a\u0004\be\u0010GR\u0017\u0010i\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bg\u0010\u0004\u001a\u0004\bh\u0010\u0006R\u0017\u0010l\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bj\u0010E\u001a\u0004\bk\u0010GR \u0010n\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0019\u001a\u0004\bm\u0010\u001bR \u0010q\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bo\u0010\u0019\u001a\u0004\bp\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, d2 = {"Landroidx/compose/material3/tokens/NavigationDrawerTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveFocusIconColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveFocusIconColor", "b", "getActiveFocusLabelTextColor", "ActiveFocusLabelTextColor", "c", "getActiveHoverIconColor", "ActiveHoverIconColor", "d", "getActiveHoverLabelTextColor", "ActiveHoverLabelTextColor", "e", "getActiveIconColor", "ActiveIconColor", "f", "getActiveIndicatorColor", "ActiveIndicatorColor", "Landroidx/compose/ui/unit/Dp;", "g", "F", "getActiveIndicatorHeight-D9Ej5fM", "()F", "ActiveIndicatorHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "h", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getActiveIndicatorShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveIndicatorShape", "i", "getActiveIndicatorWidth-D9Ej5fM", "ActiveIndicatorWidth", "j", "getActiveLabelTextColor", "ActiveLabelTextColor", "k", "getActivePressedIconColor", "ActivePressedIconColor", "l", "getActivePressedLabelTextColor", "ActivePressedLabelTextColor", "m", "getBottomContainerShape", "BottomContainerShape", "n", "getContainerColor", "ContainerColor", "", "ContainerHeightPercent", "o", "getContainerShape", "ContainerShape", "p", "getContainerSurfaceTintLayerColor", "ContainerSurfaceTintLayerColor", "q", "getContainerWidth-D9Ej5fM", "ContainerWidth", "r", "getHeadlineColor", "HeadlineColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "s", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getHeadlineFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "HeadlineFont", "t", "getIconSize-D9Ej5fM", "IconSize", "u", "getInactiveFocusIconColor", "InactiveFocusIconColor", SharedPrefsStorage.VERSION_KEY, "getInactiveFocusLabelTextColor", "InactiveFocusLabelTextColor", "w", "getInactiveHoverIconColor", "InactiveHoverIconColor", "x", "getInactiveHoverLabelTextColor", "InactiveHoverLabelTextColor", "y", "getInactiveIconColor", "InactiveIconColor", "z", "getInactiveLabelTextColor", "InactiveLabelTextColor", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getInactivePressedIconColor", "InactivePressedIconColor", "B", "getInactivePressedLabelTextColor", "InactivePressedLabelTextColor", "C", "getLabelTextFont", "LabelTextFont", "D", "getLargeBadgeLabelColor", "LargeBadgeLabelColor", ExifInterface.LONGITUDE_EAST, "getLargeBadgeLabelFont", "LargeBadgeLabelFont", "getModalContainerElevation-D9Ej5fM", "ModalContainerElevation", "G", "getStandardContainerElevation-D9Ej5fM", "StandardContainerElevation", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationDrawerTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawerTokens.kt\nandroidx/compose/material3/tokens/NavigationDrawerTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,58:1\n164#2:59\n164#2:60\n164#2:61\n164#2:62\n*S KotlinDebug\n*F\n+ 1 NavigationDrawerTokens.kt\nandroidx/compose/material3/tokens/NavigationDrawerTokens\n*L\n30#1:59\n32#1:60\n41#1:61\n44#1:62\n*E\n"})
public final class NavigationDrawerTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactivePressedIconColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactivePressedLabelTextColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens LabelTextFont;
    public static final float ContainerHeightPercent = 100.0f;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens LargeBadgeLabelColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens LargeBadgeLabelFont;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final float ModalContainerElevation;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final float StandardContainerElevation;

    @NotNull
    public static final NavigationDrawerTokens INSTANCE = new NavigationDrawerTokens();

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
    public static final ShapeKeyTokens BottomContainerShape;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerWidth;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HeadlineColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens HeadlineFont;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final float IconSize;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveFocusIconColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveFocusLabelTextColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveHoverIconColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveHoverLabelTextColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveIconColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveLabelTextColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSecondaryContainer;
        ActiveFocusIconColor = colorSchemeKeyTokens;
        ActiveFocusLabelTextColor = colorSchemeKeyTokens;
        ActiveHoverIconColor = colorSchemeKeyTokens;
        ActiveHoverLabelTextColor = colorSchemeKeyTokens;
        ActiveIconColor = colorSchemeKeyTokens;
        ActiveIndicatorColor = ColorSchemeKeyTokens.SecondaryContainer;
        ActiveIndicatorHeight = Dp.m4389constructorimpl((float) 56.0d);
        ActiveIndicatorShape = ShapeKeyTokens.CornerFull;
        ActiveIndicatorWidth = Dp.m4389constructorimpl((float) 336.0d);
        ActiveLabelTextColor = colorSchemeKeyTokens;
        ActivePressedIconColor = colorSchemeKeyTokens;
        ActivePressedLabelTextColor = colorSchemeKeyTokens;
        BottomContainerShape = ShapeKeyTokens.CornerLargeTop;
        ContainerColor = ColorSchemeKeyTokens.Surface;
        ContainerShape = ShapeKeyTokens.CornerLargeEnd;
        ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
        ContainerWidth = Dp.m4389constructorimpl((float) 360.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        HeadlineColor = colorSchemeKeyTokens2;
        HeadlineFont = TypographyKeyTokens.TitleSmall;
        IconSize = Dp.m4389constructorimpl((float) 24.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        InactiveFocusIconColor = colorSchemeKeyTokens3;
        InactiveFocusLabelTextColor = colorSchemeKeyTokens3;
        InactiveHoverIconColor = colorSchemeKeyTokens3;
        InactiveHoverLabelTextColor = colorSchemeKeyTokens3;
        InactiveIconColor = colorSchemeKeyTokens2;
        InactiveLabelTextColor = colorSchemeKeyTokens2;
        InactivePressedIconColor = colorSchemeKeyTokens3;
        InactivePressedLabelTextColor = colorSchemeKeyTokens3;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.LabelLarge;
        LabelTextFont = typographyKeyTokens;
        LargeBadgeLabelColor = colorSchemeKeyTokens2;
        LargeBadgeLabelFont = typographyKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ModalContainerElevation = elevationTokens.m1637getLevel1D9Ej5fM();
        StandardContainerElevation = elevationTokens.m1636getLevel0D9Ej5fM();
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
    public final float m1789getActiveIndicatorHeightD9Ej5fM() {
        return ActiveIndicatorHeight;
    }

    @NotNull
    public final ShapeKeyTokens getActiveIndicatorShape() {
        return ActiveIndicatorShape;
    }

    /* JADX INFO: renamed from: getActiveIndicatorWidth-D9Ej5fM, reason: not valid java name */
    public final float m1790getActiveIndicatorWidthD9Ej5fM() {
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
    public final ShapeKeyTokens getBottomContainerShape() {
        return BottomContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return ContainerSurfaceTintLayerColor;
    }

    /* JADX INFO: renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1791getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHeadlineColor() {
        return HeadlineColor;
    }

    @NotNull
    public final TypographyKeyTokens getHeadlineFont() {
        return HeadlineFont;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1792getIconSizeD9Ej5fM() {
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
    public final ColorSchemeKeyTokens getLargeBadgeLabelColor() {
        return LargeBadgeLabelColor;
    }

    @NotNull
    public final TypographyKeyTokens getLargeBadgeLabelFont() {
        return LargeBadgeLabelFont;
    }

    /* JADX INFO: renamed from: getModalContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1793getModalContainerElevationD9Ej5fM() {
        return ModalContainerElevation;
    }

    /* JADX INFO: renamed from: getStandardContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1794getStandardContainerElevationD9Ej5fM() {
        return StandardContainerElevation;
    }
}

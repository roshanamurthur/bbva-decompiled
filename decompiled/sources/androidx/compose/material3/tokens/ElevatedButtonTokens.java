package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ElevatedButtonTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b!\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bT\u0010UR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R \u0010\u001f\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u0014\u0010!\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\nR\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006R\u0014\u0010%\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\nR \u0010(\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b'\u0010\fR\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010.\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\n\u001a\u0004\b-\u0010\fR\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u0017\u0010:\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010=\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b<\u0010\fR\u0017\u0010@\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u0014\u0010D\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010\nR\u0017\u0010G\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010\u0004\u001a\u0004\bF\u0010\u0006R\u0017\u0010J\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010\u0004\u001a\u0004\bI\u0010\u0006R\u0017\u0010M\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010\u0004\u001a\u0004\bL\u0010\u0006R \u0010P\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bN\u0010\n\u001a\u0004\bO\u0010\fR\u0017\u0010S\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010\u0004\u001a\u0004\bR\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"Landroidx/compose/material3/tokens/ElevatedButtonTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "c", "getContainerHeight-D9Ej5fM", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "d", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "e", "getContainerSurfaceTintLayerColor", "ContainerSurfaceTintLayerColor", "f", "getDisabledContainerColor", "DisabledContainerColor", "g", "getDisabledContainerElevation-D9Ej5fM", "DisabledContainerElevation", "", "DisabledContainerOpacity", "h", "getDisabledLabelTextColor", "DisabledLabelTextColor", "DisabledLabelTextOpacity", "i", "getFocusContainerElevation-D9Ej5fM", "FocusContainerElevation", "j", "getFocusLabelTextColor", "FocusLabelTextColor", "k", "getHoverContainerElevation-D9Ej5fM", "HoverContainerElevation", "l", "getHoverLabelTextColor", "HoverLabelTextColor", "m", "getLabelTextColor", "LabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "n", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "o", "getPressedContainerElevation-D9Ej5fM", "PressedContainerElevation", "p", "getPressedLabelTextColor", "PressedLabelTextColor", "q", "getDisabledIconColor", "DisabledIconColor", "DisabledIconOpacity", "r", "getFocusIconColor", "FocusIconColor", "s", "getHoverIconColor", "HoverIconColor", "t", "getIconColor", "IconColor", "u", "getIconSize-D9Ej5fM", "IconSize", SharedPrefsStorage.VERSION_KEY, "getPressedIconColor", "PressedIconColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nElevatedButtonTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElevatedButtonTokens.kt\nandroidx/compose/material3/tokens/ElevatedButtonTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,49:1\n164#2:50\n164#2:51\n*S KotlinDebug\n*F\n+ 1 ElevatedButtonTokens.kt\nandroidx/compose/material3/tokens/ElevatedButtonTokens\n*L\n26#1:50\n47#1:51\n*E\n"})
public final class ElevatedButtonTokens {
    public static final float DisabledContainerOpacity = 0.12f;
    public static final float DisabledIconOpacity = 0.38f;
    public static final float DisabledLabelTextOpacity = 0.38f;

    @NotNull
    public static final ElevatedButtonTokens INSTANCE = new ElevatedButtonTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledContainerColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final float DisabledContainerElevation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledLabelTextColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final float FocusContainerElevation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FocusLabelTextColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final float HoverContainerElevation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HoverLabelTextColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens LabelTextColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens LabelTextFont;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final float PressedContainerElevation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PressedLabelTextColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledIconColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FocusIconColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HoverIconColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens IconColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final float IconSize;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PressedIconColor;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m1637getLevel1D9Ej5fM();
        ContainerHeight = Dp.m4389constructorimpl((float) 40.0d);
        ContainerShape = ShapeKeyTokens.CornerFull;
        ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledContainerColor = colorSchemeKeyTokens;
        DisabledContainerElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        DisabledLabelTextColor = colorSchemeKeyTokens;
        FocusContainerElevation = elevationTokens.m1637getLevel1D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Primary;
        FocusLabelTextColor = colorSchemeKeyTokens2;
        HoverContainerElevation = elevationTokens.m1638getLevel2D9Ej5fM();
        HoverLabelTextColor = colorSchemeKeyTokens2;
        LabelTextColor = colorSchemeKeyTokens2;
        LabelTextFont = TypographyKeyTokens.LabelLarge;
        PressedContainerElevation = elevationTokens.m1637getLevel1D9Ej5fM();
        PressedLabelTextColor = colorSchemeKeyTokens2;
        DisabledIconColor = colorSchemeKeyTokens;
        FocusIconColor = colorSchemeKeyTokens2;
        HoverIconColor = colorSchemeKeyTokens2;
        IconColor = colorSchemeKeyTokens2;
        IconSize = Dp.m4389constructorimpl((float) 18.0d);
        PressedIconColor = colorSchemeKeyTokens2;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1622getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1623getContainerHeightD9Ej5fM() {
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

    @NotNull
    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1624getDisabledContainerElevationD9Ej5fM() {
        return DisabledContainerElevation;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledIconColor() {
        return DisabledIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return DisabledLabelTextColor;
    }

    /* JADX INFO: renamed from: getFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1625getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusIconColor() {
        return FocusIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusLabelTextColor() {
        return FocusLabelTextColor;
    }

    /* JADX INFO: renamed from: getHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1626getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverIconColor() {
        return HoverIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverLabelTextColor() {
        return HoverLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1627getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLabelTextColor() {
        return LabelTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    /* JADX INFO: renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1628getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPressedIconColor() {
        return PressedIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPressedLabelTextColor() {
        return PressedLabelTextColor;
    }
}

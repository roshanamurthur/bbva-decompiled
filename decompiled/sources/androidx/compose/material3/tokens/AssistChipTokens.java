package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AssistChipTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b!\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bm\u0010nR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R \u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001e\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010!\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012R \u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006R\u0017\u0010'\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b%\u0010\u0010\u001a\u0004\b&\u0010\u0012R \u0010*\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\u0004\u001a\u0004\b)\u0010\u0006R\u0014\u0010+\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0004R \u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R \u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00104\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R \u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u0017\u0010:\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b8\u0010\u0010\u001a\u0004\b9\u0010\u0012R\u0014\u0010;\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u0004R\u0017\u0010>\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010\u0010\u001a\u0004\b=\u0010\u0012R\u0017\u0010A\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010\u0010\u001a\u0004\b@\u0010\u0012R \u0010D\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bB\u0010\u0004\u001a\u0004\bC\u0010\u0006R\u0017\u0010G\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bE\u0010\u0010\u001a\u0004\bF\u0010\u0012R\u0017\u0010J\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bH\u0010\u0010\u001a\u0004\bI\u0010\u0012R\u0017\u0010M\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bK\u0010\u0010\u001a\u0004\bL\u0010\u0012R\u0017\u0010S\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010V\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bT\u0010\u0010\u001a\u0004\bU\u0010\u0012R\u0017\u0010Y\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bW\u0010\u0010\u001a\u0004\bX\u0010\u0012R\u0014\u0010Z\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\bZ\u0010\u0004R\u0017\u0010]\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b[\u0010\u0010\u001a\u0004\b\\\u0010\u0012R\u0017\u0010`\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b^\u0010\u0010\u001a\u0004\b_\u0010\u0012R\u0017\u0010c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\ba\u0010\u0010\u001a\u0004\bb\u0010\u0012R\u0017\u0010f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bd\u0010\u0010\u001a\u0004\be\u0010\u0012R \u0010i\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bg\u0010\u0004\u001a\u0004\bh\u0010\u0006R\u0017\u0010l\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bj\u0010\u0010\u001a\u0004\bk\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006o"}, d2 = {"Landroidx/compose/material3/tokens/AssistChipTokens;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getContainerHeight-D9Ej5fM", "()F", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "b", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerSurfaceTintLayerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerSurfaceTintLayerColor", "d", "getDisabledLabelTextColor", "DisabledLabelTextColor", "", "DisabledLabelTextOpacity", "e", "getDraggedContainerElevation-D9Ej5fM", "DraggedContainerElevation", "f", "getDraggedLabelTextColor", "DraggedLabelTextColor", "g", "getElevatedContainerColor", "ElevatedContainerColor", "h", "getElevatedContainerElevation-D9Ej5fM", "ElevatedContainerElevation", "i", "getElevatedDisabledContainerColor", "ElevatedDisabledContainerColor", "j", "getElevatedDisabledContainerElevation-D9Ej5fM", "ElevatedDisabledContainerElevation", "ElevatedDisabledContainerOpacity", "k", "getElevatedFocusContainerElevation-D9Ej5fM", "ElevatedFocusContainerElevation", "l", "getElevatedHoverContainerElevation-D9Ej5fM", "ElevatedHoverContainerElevation", "m", "getElevatedPressedContainerElevation-D9Ej5fM", "ElevatedPressedContainerElevation", "n", "getFlatContainerElevation-D9Ej5fM", "FlatContainerElevation", "o", "getFlatDisabledOutlineColor", "FlatDisabledOutlineColor", "FlatDisabledOutlineOpacity", "p", "getFlatFocusOutlineColor", "FlatFocusOutlineColor", "q", "getFlatOutlineColor", "FlatOutlineColor", "r", "getFlatOutlineWidth-D9Ej5fM", "FlatOutlineWidth", "s", "getFocusLabelTextColor", "FocusLabelTextColor", "t", "getHoverLabelTextColor", "HoverLabelTextColor", "u", "getLabelTextColor", "LabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", SharedPrefsStorage.VERSION_KEY, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "w", "getPressedLabelTextColor", "PressedLabelTextColor", "x", "getDisabledIconColor", "DisabledIconColor", "DisabledIconOpacity", "y", "getDraggedIconColor", "DraggedIconColor", "z", "getFocusIconColor", "FocusIconColor", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getHoverIconColor", "HoverIconColor", "B", "getIconColor", "IconColor", "C", "getIconSize-D9Ej5fM", "IconSize", "D", "getPressedIconColor", "PressedIconColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAssistChipTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssistChipTokens.kt\nandroidx/compose/material3/tokens/AssistChipTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,58:1\n164#2:59\n164#2:60\n164#2:61\n*S KotlinDebug\n*F\n+ 1 AssistChipTokens.kt\nandroidx/compose/material3/tokens/AssistChipTokens\n*L\n24#1:59\n44#1:60\n56#1:61\n*E\n"})
public final class AssistChipTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HoverIconColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens IconColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final float IconSize;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PressedIconColor;
    public static final float DisabledIconOpacity = 0.38f;
    public static final float DisabledLabelTextOpacity = 0.38f;
    public static final float ElevatedDisabledContainerOpacity = 0.12f;
    public static final float FlatDisabledOutlineOpacity = 0.12f;

    @NotNull
    public static final AssistChipTokens INSTANCE = new AssistChipTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerHeight = Dp.m4389constructorimpl((float) 32.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerSmall;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledLabelTextColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final float DraggedContainerElevation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DraggedLabelTextColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ElevatedContainerColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final float ElevatedContainerElevation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ElevatedDisabledContainerColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final float ElevatedDisabledContainerElevation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final float ElevatedFocusContainerElevation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final float ElevatedHoverContainerElevation;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final float ElevatedPressedContainerElevation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final float FlatContainerElevation;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FlatDisabledOutlineColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FlatFocusOutlineColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FlatOutlineColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final float FlatOutlineWidth;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FocusLabelTextColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HoverLabelTextColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens LabelTextColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens LabelTextFont;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PressedLabelTextColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledIconColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DraggedIconColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FocusIconColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledLabelTextColor = colorSchemeKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DraggedContainerElevation = elevationTokens.m1640getLevel4D9Ej5fM();
        DraggedLabelTextColor = colorSchemeKeyTokens;
        ElevatedContainerColor = ColorSchemeKeyTokens.Surface;
        ElevatedContainerElevation = elevationTokens.m1637getLevel1D9Ej5fM();
        ElevatedDisabledContainerColor = colorSchemeKeyTokens;
        ElevatedDisabledContainerElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        ElevatedFocusContainerElevation = elevationTokens.m1637getLevel1D9Ej5fM();
        ElevatedHoverContainerElevation = elevationTokens.m1638getLevel2D9Ej5fM();
        ElevatedPressedContainerElevation = elevationTokens.m1637getLevel1D9Ej5fM();
        FlatContainerElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        FlatDisabledOutlineColor = colorSchemeKeyTokens;
        FlatFocusOutlineColor = colorSchemeKeyTokens;
        FlatOutlineColor = ColorSchemeKeyTokens.Outline;
        FlatOutlineWidth = Dp.m4389constructorimpl((float) 1.0d);
        FocusLabelTextColor = colorSchemeKeyTokens;
        HoverLabelTextColor = colorSchemeKeyTokens;
        LabelTextColor = colorSchemeKeyTokens;
        LabelTextFont = TypographyKeyTokens.LabelLarge;
        PressedLabelTextColor = colorSchemeKeyTokens;
        DisabledIconColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Primary;
        DraggedIconColor = colorSchemeKeyTokens2;
        FocusIconColor = colorSchemeKeyTokens2;
        HoverIconColor = colorSchemeKeyTokens2;
        IconColor = colorSchemeKeyTokens2;
        IconSize = Dp.m4389constructorimpl((float) 18.0d);
        PressedIconColor = colorSchemeKeyTokens2;
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1503getContainerHeightD9Ej5fM() {
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
    public final ColorSchemeKeyTokens getDisabledIconColor() {
        return DisabledIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return DisabledLabelTextColor;
    }

    /* JADX INFO: renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1504getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDraggedIconColor() {
        return DraggedIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDraggedLabelTextColor() {
        return DraggedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getElevatedContainerColor() {
        return ElevatedContainerColor;
    }

    /* JADX INFO: renamed from: getElevatedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1505getElevatedContainerElevationD9Ej5fM() {
        return ElevatedContainerElevation;
    }

    @NotNull
    public final ColorSchemeKeyTokens getElevatedDisabledContainerColor() {
        return ElevatedDisabledContainerColor;
    }

    /* JADX INFO: renamed from: getElevatedDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1506getElevatedDisabledContainerElevationD9Ej5fM() {
        return ElevatedDisabledContainerElevation;
    }

    /* JADX INFO: renamed from: getElevatedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1507getElevatedFocusContainerElevationD9Ej5fM() {
        return ElevatedFocusContainerElevation;
    }

    /* JADX INFO: renamed from: getElevatedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1508getElevatedHoverContainerElevationD9Ej5fM() {
        return ElevatedHoverContainerElevation;
    }

    /* JADX INFO: renamed from: getElevatedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1509getElevatedPressedContainerElevationD9Ej5fM() {
        return ElevatedPressedContainerElevation;
    }

    /* JADX INFO: renamed from: getFlatContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1510getFlatContainerElevationD9Ej5fM() {
        return FlatContainerElevation;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFlatDisabledOutlineColor() {
        return FlatDisabledOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFlatFocusOutlineColor() {
        return FlatFocusOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFlatOutlineColor() {
        return FlatOutlineColor;
    }

    /* JADX INFO: renamed from: getFlatOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1511getFlatOutlineWidthD9Ej5fM() {
        return FlatOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusIconColor() {
        return FocusIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusLabelTextColor() {
        return FocusLabelTextColor;
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
    public final float m1512getIconSizeD9Ej5fM() {
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

    @NotNull
    public final ColorSchemeKeyTokens getPressedIconColor() {
        return PressedIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPressedLabelTextColor() {
        return PressedLabelTextColor;
    }
}

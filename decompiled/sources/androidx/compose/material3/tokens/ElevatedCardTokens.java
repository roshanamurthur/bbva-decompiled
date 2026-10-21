package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ElevatedCardTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0016\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u001c\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u0014\u0010\u001e\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR \u0010!\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\fR \u0010$\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b#\u0010\fR \u0010'\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010\fR\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0004\u001a\u0004\b)\u0010\u0006R \u0010-\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b,\u0010\fR \u00100\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\n\u001a\u0004\b/\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/material3/tokens/ElevatedCardTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "d", "getContainerSurfaceTintLayerColor", "ContainerSurfaceTintLayerColor", "e", "getDisabledContainerColor", "DisabledContainerColor", "f", "getDisabledContainerElevation-D9Ej5fM", "DisabledContainerElevation", "", "DisabledContainerOpacity", "g", "getDraggedContainerElevation-D9Ej5fM", "DraggedContainerElevation", "h", "getFocusContainerElevation-D9Ej5fM", "FocusContainerElevation", "i", "getHoverContainerElevation-D9Ej5fM", "HoverContainerElevation", "j", "getIconColor", "IconColor", "k", "getIconSize-D9Ej5fM", "IconSize", "l", "getPressedContainerElevation-D9Ej5fM", "PressedContainerElevation", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nElevatedCardTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElevatedCardTokens.kt\nandroidx/compose/material3/tokens/ElevatedCardTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,37:1\n164#2:38\n*S KotlinDebug\n*F\n+ 1 ElevatedCardTokens.kt\nandroidx/compose/material3/tokens/ElevatedCardTokens\n*L\n35#1:38\n*E\n"})
public final class ElevatedCardTokens {
    public static final float DisabledContainerOpacity = 0.38f;

    @NotNull
    public static final ElevatedCardTokens INSTANCE = new ElevatedCardTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledContainerColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final float DisabledContainerElevation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final float DraggedContainerElevation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final float FocusContainerElevation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final float HoverContainerElevation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens IconColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final float IconSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final float PressedContainerElevation;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Surface;
        ContainerColor = colorSchemeKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m1637getLevel1D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerMedium;
        ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
        DisabledContainerColor = colorSchemeKeyTokens;
        DisabledContainerElevation = elevationTokens.m1637getLevel1D9Ej5fM();
        DraggedContainerElevation = elevationTokens.m1640getLevel4D9Ej5fM();
        FocusContainerElevation = elevationTokens.m1637getLevel1D9Ej5fM();
        HoverContainerElevation = elevationTokens.m1638getLevel2D9Ej5fM();
        IconColor = ColorSchemeKeyTokens.Primary;
        IconSize = Dp.m4389constructorimpl((float) 24.0d);
        PressedContainerElevation = elevationTokens.m1637getLevel1D9Ej5fM();
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1629getContainerElevationD9Ej5fM() {
        return ContainerElevation;
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
    public final float m1630getDisabledContainerElevationD9Ej5fM() {
        return DisabledContainerElevation;
    }

    /* JADX INFO: renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1631getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    /* JADX INFO: renamed from: getFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1632getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    /* JADX INFO: renamed from: getHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1633getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    @NotNull
    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1634getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* JADX INFO: renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1635getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }
}

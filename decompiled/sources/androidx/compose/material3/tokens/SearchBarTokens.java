package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SearchBarTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0017\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR \u0010\u0019\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\"\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012R\u0017\u0010%\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010.\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010\u0010\u001a\u0004\b-\u0010\u0012R\u0017\u00101\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u0010\u0010\u001a\u0004\b0\u0010\u0012R\u0017\u00104\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b2\u0010\u0010\u001a\u0004\b3\u0010\u0012R\u0017\u00107\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*R\u0017\u0010:\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b8\u0010\u0010\u001a\u0004\b9\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Landroidx/compose/material3/tokens/SearchBarTokens;", "", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getAvatarShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "AvatarShape", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getAvatarSize-D9Ej5fM", "()F", "AvatarSize", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "d", "getContainerElevation-D9Ej5fM", "ContainerElevation", "e", "getContainerHeight-D9Ej5fM", "ContainerHeight", "f", "getContainerShape", "ContainerShape", "g", "getContainerSurfaceTintLayerColor", "ContainerSurfaceTintLayerColor", "h", "getHoverSupportingTextColor", "HoverSupportingTextColor", "i", "getInputTextColor", "InputTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "j", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getInputTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "InputTextFont", "k", "getLeadingIconColor", "LeadingIconColor", "l", "getPressedSupportingTextColor", "PressedSupportingTextColor", "m", "getSupportingTextColor", "SupportingTextColor", "n", "getSupportingTextFont", "SupportingTextFont", "o", "getTrailingIconColor", "TrailingIconColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSearchBarTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBarTokens.kt\nandroidx/compose/material3/tokens/SearchBarTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,40:1\n164#2:41\n164#2:42\n*S KotlinDebug\n*F\n+ 1 SearchBarTokens.kt\nandroidx/compose/material3/tokens/SearchBarTokens\n*L\n26#1:41\n29#1:42\n*E\n"})
public final class SearchBarTokens {

    @NotNull
    public static final SearchBarTokens INSTANCE = new SearchBarTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens AvatarShape;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float AvatarSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerElevation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerHeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HoverSupportingTextColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InputTextColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens InputTextFont;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens LeadingIconColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PressedSupportingTextColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SupportingTextColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens SupportingTextFont;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TrailingIconColor;

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        AvatarShape = shapeKeyTokens;
        AvatarSize = Dp.m4389constructorimpl((float) 30.0d);
        ContainerColor = ColorSchemeKeyTokens.Surface;
        ContainerElevation = ElevationTokens.INSTANCE.m1639getLevel3D9Ej5fM();
        ContainerHeight = Dp.m4389constructorimpl((float) 56.0d);
        ContainerShape = shapeKeyTokens;
        ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurfaceVariant;
        HoverSupportingTextColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        InputTextColor = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        InputTextFont = typographyKeyTokens;
        LeadingIconColor = colorSchemeKeyTokens2;
        PressedSupportingTextColor = colorSchemeKeyTokens;
        SupportingTextColor = colorSchemeKeyTokens;
        SupportingTextFont = typographyKeyTokens;
        TrailingIconColor = colorSchemeKeyTokens;
    }

    @NotNull
    public final ShapeKeyTokens getAvatarShape() {
        return AvatarShape;
    }

    /* JADX INFO: renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m1922getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1923getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1924getContainerHeightD9Ej5fM() {
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
    public final ColorSchemeKeyTokens getHoverSupportingTextColor() {
        return HoverSupportingTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputTextColor() {
        return InputTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getInputTextFont() {
        return InputTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLeadingIconColor() {
        return LeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPressedSupportingTextColor() {
        return PressedSupportingTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSupportingTextColor() {
        return SupportingTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getSupportingTextFont() {
        return SupportingTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTrailingIconColor() {
        return TrailingIconColor;
    }
}

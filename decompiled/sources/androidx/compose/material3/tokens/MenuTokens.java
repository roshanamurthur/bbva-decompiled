package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MenuTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b4\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bZ\u0010[R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R \u0010\u0019\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006R\u0017\u00103\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006R\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u0004\u001a\u0004\b5\u0010\u0006R\u0014\u00107\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\nR\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u0017\u0010@\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R \u0010C\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\fR\u0017\u0010F\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R\u0014\u0010J\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010\nR\u0017\u0010M\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010\u0004\u001a\u0004\bL\u0010\u0006R\u0017\u0010P\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010\u0004\u001a\u0004\bO\u0010\u0006R\u0017\u0010S\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010\u0004\u001a\u0004\bR\u0010\u0006R\u0017\u0010V\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010\u0004\u001a\u0004\bU\u0010\u0006R \u0010Y\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bW\u0010\n\u001a\u0004\bX\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Landroidx/compose/material3/tokens/MenuTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "d", "getContainerSurfaceTintLayerColor", "ContainerSurfaceTintLayerColor", "e", "getListItemContainerHeight-D9Ej5fM", "ListItemContainerHeight", "f", "getListItemDisabledLabelTextColor", "ListItemDisabledLabelTextColor", "", "ListItemDisabledLabelTextOpacity", "g", "getListItemFocusLabelTextColor", "ListItemFocusLabelTextColor", "h", "getListItemHoverLabelTextColor", "ListItemHoverLabelTextColor", "i", "getListItemLabelTextColor", "ListItemLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "j", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getListItemLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "ListItemLabelTextFont", "k", "getListItemPressedLabelTextColor", "ListItemPressedLabelTextColor", "l", "getListItemSelectedContainerColor", "ListItemSelectedContainerColor", "m", "getListItemDisabledLeadingIconColor", "ListItemDisabledLeadingIconColor", "ListItemDisabledLeadingIconOpacity", "n", "getListItemLeadingFocusIconColor", "ListItemLeadingFocusIconColor", "o", "getListItemLeadingHoverIconColor", "ListItemLeadingHoverIconColor", "p", "getListItemLeadingIconColor", "ListItemLeadingIconColor", "q", "getListItemLeadingIconSize-D9Ej5fM", "ListItemLeadingIconSize", "r", "getListItemLeadingPressedIconColor", "ListItemLeadingPressedIconColor", "s", "getListItemDisabledTrailingIconColor", "ListItemDisabledTrailingIconColor", "ListItemDisabledTrailingIconOpacity", "t", "getListItemTrailingFocusIconColor", "ListItemTrailingFocusIconColor", "u", "getListItemTrailingHoverIconColor", "ListItemTrailingHoverIconColor", SharedPrefsStorage.VERSION_KEY, "getListItemTrailingPressedIconColor", "ListItemTrailingPressedIconColor", "w", "getListItemTrailingIconColor", "ListItemTrailingIconColor", "x", "getListItemTrailingIconSize-D9Ej5fM", "ListItemTrailingIconSize", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenuTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuTokens.kt\nandroidx/compose/material3/tokens/MenuTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,52:1\n164#2:53\n164#2:54\n164#2:55\n*S KotlinDebug\n*F\n+ 1 MenuTokens.kt\nandroidx/compose/material3/tokens/MenuTokens\n*L\n28#1:53\n42#1:54\n50#1:55\n*E\n"})
public final class MenuTokens {
    public static final float ListItemDisabledLabelTextOpacity = 0.38f;
    public static final float ListItemDisabledLeadingIconOpacity = 0.38f;
    public static final float ListItemDisabledTrailingIconOpacity = 0.38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemDisabledLabelTextColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemFocusLabelTextColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemHoverLabelTextColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemLabelTextColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens ListItemLabelTextFont;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemPressedLabelTextColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemSelectedContainerColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemDisabledLeadingIconColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemLeadingFocusIconColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemLeadingHoverIconColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemLeadingIconColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final float ListItemLeadingIconSize;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemLeadingPressedIconColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemDisabledTrailingIconColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemTrailingFocusIconColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemTrailingHoverIconColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemTrailingPressedIconColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemTrailingIconColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final float ListItemTrailingIconSize;

    @NotNull
    public static final MenuTokens INSTANCE = new MenuTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerElevation = ElevationTokens.INSTANCE.m1638getLevel2D9Ej5fM();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerExtraSmall;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final float ListItemContainerHeight = Dp.m4389constructorimpl((float) 48.0d);

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        ListItemDisabledLabelTextColor = colorSchemeKeyTokens;
        ListItemFocusLabelTextColor = colorSchemeKeyTokens;
        ListItemHoverLabelTextColor = colorSchemeKeyTokens;
        ListItemLabelTextColor = colorSchemeKeyTokens;
        ListItemLabelTextFont = TypographyKeyTokens.LabelLarge;
        ListItemPressedLabelTextColor = colorSchemeKeyTokens;
        ListItemSelectedContainerColor = ColorSchemeKeyTokens.SurfaceVariant;
        ListItemDisabledLeadingIconColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        ListItemLeadingFocusIconColor = colorSchemeKeyTokens2;
        ListItemLeadingHoverIconColor = colorSchemeKeyTokens2;
        ListItemLeadingIconColor = colorSchemeKeyTokens2;
        float f6 = (float) 24.0d;
        ListItemLeadingIconSize = Dp.m4389constructorimpl(f6);
        ListItemLeadingPressedIconColor = colorSchemeKeyTokens2;
        ListItemDisabledTrailingIconColor = colorSchemeKeyTokens;
        ListItemTrailingFocusIconColor = colorSchemeKeyTokens2;
        ListItemTrailingHoverIconColor = colorSchemeKeyTokens2;
        ListItemTrailingPressedIconColor = colorSchemeKeyTokens2;
        ListItemTrailingIconColor = colorSchemeKeyTokens2;
        ListItemTrailingIconSize = Dp.m4389constructorimpl(f6);
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1780getContainerElevationD9Ej5fM() {
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

    /* JADX INFO: renamed from: getListItemContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1781getListItemContainerHeightD9Ej5fM() {
        return ListItemContainerHeight;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemDisabledLabelTextColor() {
        return ListItemDisabledLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemDisabledLeadingIconColor() {
        return ListItemDisabledLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemDisabledTrailingIconColor() {
        return ListItemDisabledTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemFocusLabelTextColor() {
        return ListItemFocusLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemHoverLabelTextColor() {
        return ListItemHoverLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemLabelTextColor() {
        return ListItemLabelTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getListItemLabelTextFont() {
        return ListItemLabelTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemLeadingFocusIconColor() {
        return ListItemLeadingFocusIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemLeadingHoverIconColor() {
        return ListItemLeadingHoverIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemLeadingIconColor() {
        return ListItemLeadingIconColor;
    }

    /* JADX INFO: renamed from: getListItemLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1782getListItemLeadingIconSizeD9Ej5fM() {
        return ListItemLeadingIconSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemLeadingPressedIconColor() {
        return ListItemLeadingPressedIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemPressedLabelTextColor() {
        return ListItemPressedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemSelectedContainerColor() {
        return ListItemSelectedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemTrailingFocusIconColor() {
        return ListItemTrailingFocusIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemTrailingHoverIconColor() {
        return ListItemTrailingHoverIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemTrailingIconColor() {
        return ListItemTrailingIconColor;
    }

    /* JADX INFO: renamed from: getListItemTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1783getListItemTrailingIconSizeD9Ej5fM() {
        return ListItemTrailingIconSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemTrailingPressedIconColor() {
        return ListItemTrailingPressedIconColor;
    }
}

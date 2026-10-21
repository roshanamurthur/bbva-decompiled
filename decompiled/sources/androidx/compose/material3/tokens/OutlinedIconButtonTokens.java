package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OutlinedIconButtonTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b0\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0017\u0010\u0018\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0017\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR \u0010 \u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\fR\u0017\u0010#\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010\u0012R\u0017\u0010&\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b%\u0010\u0012R\u0017\u0010)\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010\u0010\u001a\u0004\b(\u0010\u0012R\u0017\u0010,\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010\u0010\u001a\u0004\b+\u0010\u0012R\u0017\u0010/\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010\u0010\u001a\u0004\b.\u0010\u0012R\u0017\u00102\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b0\u0010\u0010\u001a\u0004\b1\u0010\u0012R\u0017\u00105\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b3\u0010\u0010\u001a\u0004\b4\u0010\u0012R\u0017\u00108\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b6\u0010\u0010\u001a\u0004\b7\u0010\u0012R\u0017\u0010;\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b9\u0010\u0010\u001a\u0004\b:\u0010\u0012R \u0010>\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b<\u0010\n\u001a\u0004\b=\u0010\fR\u0017\u0010A\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010\u0010\u001a\u0004\b@\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/material3/tokens/OutlinedIconButtonTokens;", "", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getContainerSize-D9Ej5fM", "()F", "ContainerSize", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getDisabledColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledColor", "", "DisabledOpacity", "d", "getDisabledSelectedContainerColor", "DisabledSelectedContainerColor", "DisabledSelectedContainerOpacity", "e", "getDisabledUnselectedOutlineColor", "DisabledUnselectedOutlineColor", "DisabledUnselectedOutlineOpacity", "f", "getSize-D9Ej5fM", "Size", "g", "getSelectedContainerColor", "SelectedContainerColor", "h", "getSelectedFocusColor", "SelectedFocusColor", "i", "getSelectedHoverColor", "SelectedHoverColor", "j", "getSelectedColor", "SelectedColor", "k", "getSelectedPressedColor", "SelectedPressedColor", "l", "getUnselectedFocusColor", "UnselectedFocusColor", "m", "getUnselectedHoverColor", "UnselectedHoverColor", "n", "getUnselectedColor", "UnselectedColor", "o", "getUnselectedOutlineColor", "UnselectedOutlineColor", "p", "getUnselectedOutlineWidth-D9Ej5fM", "UnselectedOutlineWidth", "q", "getUnselectedPressedColor", "UnselectedPressedColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutlinedIconButtonTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedIconButtonTokens.kt\nandroidx/compose/material3/tokens/OutlinedIconButtonTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,45:1\n164#2:46\n164#2:47\n164#2:48\n*S KotlinDebug\n*F\n+ 1 OutlinedIconButtonTokens.kt\nandroidx/compose/material3/tokens/OutlinedIconButtonTokens\n*L\n25#1:46\n32#1:47\n42#1:48\n*E\n"})
public final class OutlinedIconButtonTokens {
    public static final float DisabledOpacity = 0.38f;
    public static final float DisabledSelectedContainerOpacity = 0.12f;
    public static final float DisabledUnselectedOutlineOpacity = 0.12f;

    @NotNull
    public static final OutlinedIconButtonTokens INSTANCE = new OutlinedIconButtonTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerFull;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerSize = Dp.m4389constructorimpl((float) 40.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledSelectedContainerColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledUnselectedOutlineColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final float Size;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedContainerColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedFocusColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedHoverColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedPressedColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedFocusColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedHoverColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedOutlineColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final float UnselectedOutlineWidth;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedPressedColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledColor = colorSchemeKeyTokens;
        DisabledSelectedContainerColor = colorSchemeKeyTokens;
        DisabledUnselectedOutlineColor = colorSchemeKeyTokens;
        Size = Dp.m4389constructorimpl((float) 24.0d);
        SelectedContainerColor = ColorSchemeKeyTokens.InverseSurface;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.InverseOnSurface;
        SelectedFocusColor = colorSchemeKeyTokens2;
        SelectedHoverColor = colorSchemeKeyTokens2;
        SelectedColor = colorSchemeKeyTokens2;
        SelectedPressedColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedFocusColor = colorSchemeKeyTokens3;
        UnselectedHoverColor = colorSchemeKeyTokens3;
        UnselectedColor = colorSchemeKeyTokens3;
        UnselectedOutlineColor = ColorSchemeKeyTokens.Outline;
        UnselectedOutlineWidth = Dp.m4389constructorimpl((float) 1.0d);
        UnselectedPressedColor = colorSchemeKeyTokens;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* JADX INFO: renamed from: getContainerSize-D9Ej5fM, reason: not valid java name */
    public final float m1823getContainerSizeD9Ej5fM() {
        return ContainerSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledColor() {
        return DisabledColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSelectedContainerColor() {
        return DisabledSelectedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledUnselectedOutlineColor() {
        return DisabledUnselectedOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedColor() {
        return SelectedColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusColor() {
        return SelectedFocusColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverColor() {
        return SelectedHoverColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedColor() {
        return SelectedPressedColor;
    }

    /* JADX INFO: renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m1824getSizeD9Ej5fM() {
        return Size;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedColor() {
        return UnselectedColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusColor() {
        return UnselectedFocusColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverColor() {
        return UnselectedHoverColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return UnselectedOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1825getUnselectedOutlineWidthD9Ej5fM() {
        return UnselectedOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedColor() {
        return UnselectedPressedColor;
    }
}

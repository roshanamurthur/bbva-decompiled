package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FilledIconButtonTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b5\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bJ\u0010KR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010(\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b'\u0010\u0012R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u0017\u0010@\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u0017\u0010F\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/material3/tokens/FilledIconButtonTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "b", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/ui/unit/Dp;", "c", "F", "getContainerSize-D9Ej5fM", "()F", "ContainerSize", "d", "getDisabledContainerColor", "DisabledContainerColor", "", "DisabledContainerOpacity", "e", "getDisabledColor", "DisabledColor", "DisabledOpacity", "f", "getFocusColor", "FocusColor", "g", "getHoverColor", "HoverColor", "h", "getColor", "Color", "i", "getSize-D9Ej5fM", "Size", "j", "getPressedColor", "PressedColor", "k", "getSelectedContainerColor", "SelectedContainerColor", "l", "getToggleSelectedFocusColor", "ToggleSelectedFocusColor", "m", "getToggleSelectedHoverColor", "ToggleSelectedHoverColor", "n", "getToggleSelectedColor", "ToggleSelectedColor", "o", "getToggleSelectedPressedColor", "ToggleSelectedPressedColor", "p", "getToggleUnselectedFocusColor", "ToggleUnselectedFocusColor", "q", "getToggleUnselectedHoverColor", "ToggleUnselectedHoverColor", "r", "getToggleUnselectedColor", "ToggleUnselectedColor", "s", "getToggleUnselectedPressedColor", "ToggleUnselectedPressedColor", "t", "getUnselectedContainerColor", "UnselectedContainerColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFilledIconButtonTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilledIconButtonTokens.kt\nandroidx/compose/material3/tokens/FilledIconButtonTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,47:1\n164#2:48\n164#2:49\n*S KotlinDebug\n*F\n+ 1 FilledIconButtonTokens.kt\nandroidx/compose/material3/tokens/FilledIconButtonTokens\n*L\n26#1:48\n34#1:49\n*E\n"})
public final class FilledIconButtonTokens {
    public static final float DisabledContainerOpacity = 0.12f;
    public static final float DisabledOpacity = 0.38f;

    @NotNull
    public static final FilledIconButtonTokens INSTANCE = new FilledIconButtonTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledContainerColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FocusColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HoverColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens Color;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final float Size;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PressedColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedContainerColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ToggleSelectedFocusColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ToggleSelectedHoverColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ToggleSelectedColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ToggleSelectedPressedColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ToggleUnselectedFocusColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ToggleUnselectedHoverColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ToggleUnselectedColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ToggleUnselectedPressedColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedContainerColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ContainerColor = colorSchemeKeyTokens;
        ContainerShape = ShapeKeyTokens.CornerFull;
        ContainerSize = Dp.m4389constructorimpl((float) 40.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        DisabledContainerColor = colorSchemeKeyTokens2;
        DisabledColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnPrimary;
        FocusColor = colorSchemeKeyTokens3;
        HoverColor = colorSchemeKeyTokens3;
        Color = colorSchemeKeyTokens3;
        Size = Dp.m4389constructorimpl((float) 24.0d);
        PressedColor = colorSchemeKeyTokens3;
        SelectedContainerColor = colorSchemeKeyTokens;
        ToggleSelectedFocusColor = colorSchemeKeyTokens3;
        ToggleSelectedHoverColor = colorSchemeKeyTokens3;
        ToggleSelectedColor = colorSchemeKeyTokens3;
        ToggleSelectedPressedColor = colorSchemeKeyTokens3;
        ToggleUnselectedFocusColor = colorSchemeKeyTokens;
        ToggleUnselectedHoverColor = colorSchemeKeyTokens;
        ToggleUnselectedColor = colorSchemeKeyTokens;
        ToggleUnselectedPressedColor = colorSchemeKeyTokens;
        UnselectedContainerColor = ColorSchemeKeyTokens.SurfaceVariant;
    }

    @NotNull
    public final ColorSchemeKeyTokens getColor() {
        return Color;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* JADX INFO: renamed from: getContainerSize-D9Ej5fM, reason: not valid java name */
    public final float m1720getContainerSizeD9Ej5fM() {
        return ContainerSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledColor() {
        return DisabledColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusColor() {
        return FocusColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverColor() {
        return HoverColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPressedColor() {
        return PressedColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    /* JADX INFO: renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m1721getSizeD9Ej5fM() {
        return Size;
    }

    @NotNull
    public final ColorSchemeKeyTokens getToggleSelectedColor() {
        return ToggleSelectedColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getToggleSelectedFocusColor() {
        return ToggleSelectedFocusColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getToggleSelectedHoverColor() {
        return ToggleSelectedHoverColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getToggleSelectedPressedColor() {
        return ToggleSelectedPressedColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getToggleUnselectedColor() {
        return ToggleUnselectedColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getToggleUnselectedFocusColor() {
        return ToggleUnselectedFocusColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getToggleUnselectedHoverColor() {
        return ToggleUnselectedHoverColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getToggleUnselectedPressedColor() {
        return ToggleUnselectedPressedColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedContainerColor() {
        return UnselectedContainerColor;
    }
}

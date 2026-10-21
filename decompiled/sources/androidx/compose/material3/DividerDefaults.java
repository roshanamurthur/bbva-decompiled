package androidx.compose.material3;

import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Divider.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/DividerDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getThickness-D9Ej5fM", "()F", "Thickness", "Landroidx/compose/ui/graphics/Color;", "getColor", "(Landroidx/compose/runtime/Composer;I)J", "color", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class DividerDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final DividerDefaults INSTANCE = new DividerDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float Thickness = DividerTokens.INSTANCE.m1621getThicknessD9Ej5fM();

    @Composable
    @JvmName(name = "getColor")
    public final long getColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(77461041);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(77461041, i10, -1, "androidx.compose.material3.DividerDefaults.<get-color> (Divider.kt:67)");
        }
        long color = ColorSchemeKt.toColor(DividerTokens.INSTANCE.getColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* JADX INFO: renamed from: getThickness-D9Ej5fM, reason: not valid java name */
    public final float m1082getThicknessD9Ej5fM() {
        return Thickness;
    }
}

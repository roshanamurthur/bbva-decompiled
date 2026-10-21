package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\n8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/DrawerDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getElevation-D9Ej5fM", "()F", "Elevation", "", "ScrimOpacity", "Landroidx/compose/ui/graphics/Color;", "getScrimColor", "(Landroidx/compose/runtime/Composer;I)J", "scrimColor", "<init>", "()V", "material_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,956:1\n154#2:957\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerDefaults\n*L\n784#1:957\n*E\n"})
public final class DrawerDefaults {
    public static final int $stable = 0;
    public static final float ScrimOpacity = 0.32f;

    @NotNull
    public static final DrawerDefaults INSTANCE = new DrawerDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float Elevation = Dp.m4389constructorimpl(16);

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m749getElevationD9Ej5fM() {
        return Elevation;
    }

    @Composable
    @JvmName(name = "getScrimColor")
    public final long getScrimColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(617225966);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(617225966, i10, -1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:787)");
        }
        long jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jM2507copywmQWz5c$default;
    }
}

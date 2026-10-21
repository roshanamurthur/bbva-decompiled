package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.bbva.ui.component.menu.model.BaseMenuItem;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContentAlpha.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0011\u0010\t\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\f"}, d2 = {"Landroidx/compose/material/ContentAlpha;", "", "", "getHigh", "(Landroidx/compose/runtime/Composer;I)F", "high", "getMedium", "medium", "getDisabled", BaseMenuItem.STATE_DISABLED, "<init>", "()V", "material_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContentAlpha.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,132:1\n76#2:133\n*S KotlinDebug\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n*L\n77#1:133\n*E\n"})
public final class ContentAlpha {
    public static final int $stable = 0;

    @NotNull
    public static final ContentAlpha INSTANCE = new ContentAlpha();

    @Composable
    public static float a(float f6, float f10, Composer composer, int i10) {
        composer.startReplaceableGroup(-1528360391);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1528360391, i10, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:70)");
        }
        long jM2518unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
        if (!MaterialTheme.INSTANCE.getColors(composer, 6).isLight() ? ColorKt.m2559luminance8_81llA(jM2518unboximpl) >= 0.5d : ColorKt.m2559luminance8_81llA(jM2518unboximpl) <= 0.5d) {
            f6 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return f6;
    }

    @Composable
    @JvmName(name = "getDisabled")
    public final float getDisabled(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(621183615);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(621183615, i10, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:56)");
        }
        float fA = a(0.38f, 0.38f, composer, ((i10 << 6) & 896) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fA;
    }

    @Composable
    @JvmName(name = "getHigh")
    public final float getHigh(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(629162431);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(629162431, i10, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:34)");
        }
        float fA = a(1.0f, 0.87f, composer, ((i10 << 6) & 896) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fA;
    }

    @Composable
    @JvmName(name = "getMedium")
    public final float getMedium(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1999054879);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1999054879, i10, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:45)");
        }
        float fA = a(0.74f, 0.6f, composer, ((i10 << 6) & 896) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fA;
    }
}

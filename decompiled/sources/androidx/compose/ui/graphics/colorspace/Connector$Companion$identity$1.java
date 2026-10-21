package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Connector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"androidx/compose/ui/graphics/colorspace/Connector$Companion$identity$1", "Landroidx/compose/ui/graphics/colorspace/Connector;", "transform", "", SharedPrefsStorage.VERSION_KEY, "transformToColor", "Landroidx/compose/ui/graphics/Color;", "r", "", "g", "b", "a", "transformToColor-wmQWz5c$ui_graphics_release", "(FFFF)J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Connector$Companion$identity$1 extends Connector {
    @Override // androidx.compose.ui.graphics.colorspace.Connector
    @NotNull
    public float[] transform(@NotNull float[] v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        return v3;
    }

    @Override // androidx.compose.ui.graphics.colorspace.Connector
    /* JADX INFO: renamed from: transformToColor-wmQWz5c$ui_graphics_release */
    public long mo2875transformToColorwmQWz5c$ui_graphics_release(float r3, float g6, float b10, float a10) {
        return ColorKt.Color(r3, g6, b10, a10, getDestination());
    }
}

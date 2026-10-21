package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ElevationOverlay.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/ElevationOverlay;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalElevationOverlay", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalElevationOverlay", "Landroidx/compose/ui/unit/Dp;", "b", "getLocalAbsoluteElevation", "LocalAbsoluteElevation", "material_release"}, k = 2, mv = {1, 8, 0})
public final class ElevationOverlayKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<ElevationOverlay> f7137a = CompositionLocalKt.staticCompositionLocalOf(b.f7140p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Dp> f7138b = CompositionLocalKt.compositionLocalOf$default(null, a.f7139p0, 1, null);

    /* JADX INFO: compiled from: ElevationOverlay.kt */
    @SourceDebugExtension({"SMAP\nElevationOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/ElevationOverlayKt$LocalAbsoluteElevation$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,102:1\n154#2:103\n*S KotlinDebug\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/ElevationOverlayKt$LocalAbsoluteElevation$1\n*L\n101#1:103\n*E\n"})
    public static final class a extends Lambda implements Function0<Dp> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7139p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Dp invoke() {
            return Dp.m4387boximpl(Dp.m4389constructorimpl(0));
        }
    }

    /* JADX INFO: compiled from: ElevationOverlay.kt */
    public static final class b extends Lambda implements Function0<ElevationOverlay> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f7140p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ ElevationOverlay invoke() {
            return h0.h0.f68791a;
        }
    }

    /* JADX INFO: renamed from: access$calculateForegroundColor-CLU3JFs, reason: not valid java name */
    public static final long m761access$calculateForegroundColorCLU3JFs(long j10, float f6, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1613340891, i10, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:86)");
        }
        long jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorsKt.m731contentColorForek8zF_U(j10, composer, i10 & 14), ((((float) Math.log(f6 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM2507copywmQWz5c$default;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteElevation() {
        return f7138b;
    }

    @NotNull
    public static final ProvidableCompositionLocal<ElevationOverlay> getLocalElevationOverlay() {
        return f7137a;
    }
}

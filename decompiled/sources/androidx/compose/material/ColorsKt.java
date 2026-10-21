package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Colors.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u008b\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u008b\u0001\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u001f\u0010\u0016\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0014\u0010\u001b\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0000\" \u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0018\u0010$\u001a\u00020\u0000*\u00020\r8Fø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "Landroidx/compose/material/Colors;", "lightColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "darkColors-2qZNXz8", "darkColors", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "other", "", "updateColorsFrom", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColors", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "primarySurface", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,337:1\n658#2:338\n646#2:339\n76#3:340\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n*L\n297#1:338\n297#1:339\n297#1:340\n*E\n"})
public final class ColorsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Colors> f7015a = CompositionLocalKt.staticCompositionLocalOf(a.f7016p0);

    /* JADX INFO: compiled from: Colors.kt */
    public static final class a extends Lambda implements Function0<Colors> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7016p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Colors invoke() {
            return ColorsKt.m735lightColors2qZNXz8$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        }
    }

    /* JADX INFO: renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m730contentColorFor4WTKRHQ(@NotNull Colors contentColorFor, long j10) {
        Intrinsics.checkNotNullParameter(contentColorFor, "$this$contentColorFor");
        if (Color.m2509equalsimpl0(j10, contentColorFor.m713getPrimary0d7_KjU())) {
            return contentColorFor.m710getOnPrimary0d7_KjU();
        }
        if (Color.m2509equalsimpl0(j10, contentColorFor.m714getPrimaryVariant0d7_KjU())) {
            return contentColorFor.m710getOnPrimary0d7_KjU();
        }
        if (Color.m2509equalsimpl0(j10, contentColorFor.m715getSecondary0d7_KjU())) {
            return contentColorFor.m711getOnSecondary0d7_KjU();
        }
        if (Color.m2509equalsimpl0(j10, contentColorFor.m716getSecondaryVariant0d7_KjU())) {
            return contentColorFor.m711getOnSecondary0d7_KjU();
        }
        if (Color.m2509equalsimpl0(j10, contentColorFor.m706getBackground0d7_KjU())) {
            return contentColorFor.m708getOnBackground0d7_KjU();
        }
        if (Color.m2509equalsimpl0(j10, contentColorFor.m717getSurface0d7_KjU())) {
            return contentColorFor.m712getOnSurface0d7_KjU();
        }
        return Color.m2509equalsimpl0(j10, contentColorFor.m707getError0d7_KjU()) ? contentColorFor.m709getOnError0d7_KjU() : Color.INSTANCE.m2544getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* JADX INFO: renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m731contentColorForek8zF_U(long j10, @Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441849991, i10, -1, "androidx.compose.material.contentColorFor (Colors.kt:295)");
        }
        long jM730contentColorFor4WTKRHQ = m730contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j10);
        if (jM730contentColorFor4WTKRHQ == Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
            jM730contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM730contentColorFor4WTKRHQ;
    }

    @NotNull
    /* JADX INFO: renamed from: darkColors-2qZNXz8, reason: not valid java name */
    public static final Colors m732darkColors2qZNXz8(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new Colors(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, false, null);
    }

    /* JADX INFO: renamed from: darkColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m733darkColors2qZNXz8$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        long jColor = (i10 & 1) != 0 ? ColorKt.Color(4290479868L) : j10;
        long jColor2 = (i10 & 2) != 0 ? ColorKt.Color(4281794739L) : j11;
        long jColor3 = (i10 & 4) != 0 ? ColorKt.Color(4278442694L) : j12;
        return m732darkColors2qZNXz8(jColor, jColor2, jColor3, (i10 & 8) != 0 ? jColor3 : j13, (i10 & 16) != 0 ? ColorKt.Color(4279374354L) : j14, (i10 & 32) != 0 ? ColorKt.Color(4279374354L) : j15, (i10 & 64) != 0 ? ColorKt.Color(4291782265L) : j16, (i10 & 128) != 0 ? Color.INSTANCE.m2534getBlack0d7_KjU() : j17, (i10 & 256) != 0 ? Color.INSTANCE.m2534getBlack0d7_KjU() : j18, (i10 & 512) != 0 ? Color.INSTANCE.m2545getWhite0d7_KjU() : j19, (i10 & 1024) != 0 ? Color.INSTANCE.m2545getWhite0d7_KjU() : j20, (i10 & 2048) != 0 ? Color.INSTANCE.m2534getBlack0d7_KjU() : j21);
    }

    @NotNull
    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return f7015a;
    }

    public static final long getPrimarySurface(@NotNull Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        return colors.isLight() ? colors.m713getPrimary0d7_KjU() : colors.m717getSurface0d7_KjU();
    }

    @NotNull
    /* JADX INFO: renamed from: lightColors-2qZNXz8, reason: not valid java name */
    public static final Colors m734lightColors2qZNXz8(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new Colors(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, true, null);
    }

    /* JADX INFO: renamed from: lightColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m735lightColors2qZNXz8$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        return m734lightColors2qZNXz8((i10 & 1) != 0 ? ColorKt.Color(4284612846L) : j10, (i10 & 2) != 0 ? ColorKt.Color(4281794739L) : j11, (i10 & 4) != 0 ? ColorKt.Color(4278442694L) : j12, (i10 & 8) != 0 ? ColorKt.Color(4278290310L) : j13, (i10 & 16) != 0 ? Color.INSTANCE.m2545getWhite0d7_KjU() : j14, (i10 & 32) != 0 ? Color.INSTANCE.m2545getWhite0d7_KjU() : j15, (i10 & 64) != 0 ? ColorKt.Color(4289724448L) : j16, (i10 & 128) != 0 ? Color.INSTANCE.m2545getWhite0d7_KjU() : j17, (i10 & 256) != 0 ? Color.INSTANCE.m2534getBlack0d7_KjU() : j18, (i10 & 512) != 0 ? Color.INSTANCE.m2534getBlack0d7_KjU() : j19, (i10 & 1024) != 0 ? Color.INSTANCE.m2534getBlack0d7_KjU() : j20, (i10 & 2048) != 0 ? Color.INSTANCE.m2545getWhite0d7_KjU() : j21);
    }

    public static final void updateColorsFrom(@NotNull Colors colors, @NotNull Colors other) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        colors.m725setPrimary8_81llA$material_release(other.m713getPrimary0d7_KjU());
        colors.m726setPrimaryVariant8_81llA$material_release(other.m714getPrimaryVariant0d7_KjU());
        colors.m727setSecondary8_81llA$material_release(other.m715getSecondary0d7_KjU());
        colors.m728setSecondaryVariant8_81llA$material_release(other.m716getSecondaryVariant0d7_KjU());
        colors.m718setBackground8_81llA$material_release(other.m706getBackground0d7_KjU());
        colors.m729setSurface8_81llA$material_release(other.m717getSurface0d7_KjU());
        colors.m719setError8_81llA$material_release(other.m707getError0d7_KjU());
        colors.m722setOnPrimary8_81llA$material_release(other.m710getOnPrimary0d7_KjU());
        colors.m723setOnSecondary8_81llA$material_release(other.m711getOnSecondary0d7_KjU());
        colors.m720setOnBackground8_81llA$material_release(other.m708getOnBackground0d7_KjU());
        colors.m724setOnSurface8_81llA$material_release(other.m712getOnSurface0d7_KjU());
        colors.m721setOnError8_81llA$material_release(other.m709getOnError0d7_KjU());
        colors.setLight$material_release(other.isLight());
    }
}

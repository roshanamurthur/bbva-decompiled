package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import com.adobe.marketing.mobile.EventDataKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0004¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR#\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0014\u0015\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/Paint;", "p", "", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "a", "J", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "<init>", "()V", "Companion", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/SolidColor;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public abstract class Brush {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long intrinsicSize;

    /* JADX INFO: compiled from: Brush.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J_\u0010\u0003\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0003\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0012J_\u0010\u0013\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u0013\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0019J_\u0010\u001a\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010\u001a\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001fJK\u0010 \u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J-\u0010 \u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010#J_\u0010$\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u000fJA\u0010$\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/Brush$Companion;", "", "()V", "horizontalGradient", "Landroidx/compose/ui/graphics/Brush;", "colorStops", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "startX", "endX", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "horizontalGradient-8A-3gB4", "([Lkotlin/Pair;FFI)Landroidx/compose/ui/graphics/Brush;", "colors", "", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/Brush;", "linearGradient", EventDataKeys.Lifecycle.LIFECYCLE_START, "Landroidx/compose/ui/geometry/Offset;", "end", "linearGradient-mHitzGk", "([Lkotlin/Pair;JJI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/Brush;", "radialGradient", "center", "radius", "radialGradient-P_Vx-Ks", "([Lkotlin/Pair;JFI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JFI)Landroidx/compose/ui/graphics/Brush;", "sweepGradient", "sweepGradient-Uv8p0NA", "([Lkotlin/Pair;J)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;J)Landroidx/compose/ui/graphics/Brush;", "verticalGradient", "startY", "endY", "verticalGradient-8A-3gB4", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n1#2:670\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m2463horizontalGradient8A3gB4$default(Companion companion, List list, float f6, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f6 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = TileMode.INSTANCE.m2828getClamp3opZhB0();
            }
            return companion.m2473horizontalGradient8A3gB4((List<Color>) list, f6, f10, i10);
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m2466linearGradientmHitzGk$default(Companion companion, Pair[] pairArr, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = Offset.INSTANCE.m2291getZeroF1C5BW0();
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                j11 = Offset.INSTANCE.m2289getInfiniteF1C5BW0();
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i10 = TileMode.INSTANCE.m2828getClamp3opZhB0();
            }
            return companion.m2476linearGradientmHitzGk((Pair<Float, Color>[]) pairArr, j12, j13, i10);
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m2468radialGradientP_VxKs$default(Companion companion, Pair[] pairArr, long j10, float f6, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f6 = Float.POSITIVE_INFINITY;
            }
            float f10 = f6;
            if ((i11 & 8) != 0) {
                i10 = TileMode.INSTANCE.m2828getClamp3opZhB0();
            }
            return companion.m2478radialGradientP_VxKs((Pair<Float, Color>[]) pairArr, j11, f10, i10);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m2470sweepGradientUv8p0NA$default(Companion companion, Pair[] pairArr, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
            }
            return companion.m2480sweepGradientUv8p0NA((Pair<Float, Color>[]) pairArr, j10);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m2471verticalGradient8A3gB4$default(Companion companion, List list, float f6, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f6 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = TileMode.INSTANCE.m2828getClamp3opZhB0();
            }
            return companion.m2481verticalGradient8A3gB4((List<Color>) list, f6, f10, i10);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m2473horizontalGradient8A3gB4(@NotNull List<Color> colors, float startX, float endX, int tileMode) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return m2475linearGradientmHitzGk(colors, OffsetKt.Offset(startX, 0.0f), OffsetKt.Offset(endX, 0.0f), tileMode);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m2476linearGradientmHitzGk(@NotNull Pair<Float, Color>[] colorStops, long start, long end, int tileMode) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair : colorStops) {
                arrayList.add(Color.m2498boximpl(pair.getSecond().m2518unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, start, end, tileMode, null);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m2478radialGradientP_VxKs(@NotNull Pair<Float, Color>[] colorStops, long center, float radius, int tileMode) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair : colorStops) {
                arrayList.add(Color.m2498boximpl(pair.getSecond().m2518unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new RadialGradient(arrayList, arrayList2, center, radius, tileMode, null);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m2480sweepGradientUv8p0NA(@NotNull Pair<Float, Color>[] colorStops, long center) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair : colorStops) {
                arrayList.add(Color.m2498boximpl(pair.getSecond().m2518unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new SweepGradient(center, arrayList, arrayList2, null);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m2481verticalGradient8A3gB4(@NotNull List<Color> colors, float startY, float endY, int tileMode) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return m2475linearGradientmHitzGk(colors, OffsetKt.Offset(0.0f, startY), OffsetKt.Offset(0.0f, endY), tileMode);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m2474horizontalGradient8A3gB4(@NotNull Pair<Float, Color>[] colorStops, float startX, float endX, int tileMode) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            return m2476linearGradientmHitzGk((Pair<Float, Color>[]) Arrays.copyOf(colorStops, colorStops.length), OffsetKt.Offset(startX, 0.0f), OffsetKt.Offset(endX, 0.0f), tileMode);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m2482verticalGradient8A3gB4(@NotNull Pair<Float, Color>[] colorStops, float startY, float endY, int tileMode) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            return m2476linearGradientmHitzGk((Pair<Float, Color>[]) Arrays.copyOf(colorStops, colorStops.length), OffsetKt.Offset(0.0f, startY), OffsetKt.Offset(0.0f, endY), tileMode);
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m2464horizontalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f6, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f6 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = TileMode.INSTANCE.m2828getClamp3opZhB0();
            }
            return companion.m2474horizontalGradient8A3gB4((Pair<Float, Color>[]) pairArr, f6, f10, i10);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m2469sweepGradientUv8p0NA$default(Companion companion, List list, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
            }
            return companion.m2479sweepGradientUv8p0NA((List<Color>) list, j10);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m2472verticalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f6, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f6 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = TileMode.INSTANCE.m2828getClamp3opZhB0();
            }
            return companion.m2482verticalGradient8A3gB4((Pair<Float, Color>[]) pairArr, f6, f10, i10);
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m2467radialGradientP_VxKs$default(Companion companion, List list, long j10, float f6, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f6 = Float.POSITIVE_INFINITY;
            }
            float f10 = f6;
            if ((i11 & 8) != 0) {
                i10 = TileMode.INSTANCE.m2828getClamp3opZhB0();
            }
            return companion.m2477radialGradientP_VxKs((List<Color>) list, j11, f10, i10);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m2475linearGradientmHitzGk(@NotNull List<Color> colors, long start, long end, int tileMode) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new LinearGradient(colors, null, start, end, tileMode, null);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m2477radialGradientP_VxKs(@NotNull List<Color> colors, long center, float radius, int tileMode) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new RadialGradient(colors, null, center, radius, tileMode, null);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m2479sweepGradientUv8p0NA(@NotNull List<Color> colors, long center) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new SweepGradient(center, colors, null, null);
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m2465linearGradientmHitzGk$default(Companion companion, List list, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = Offset.INSTANCE.m2291getZeroF1C5BW0();
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                j11 = Offset.INSTANCE.m2289getInfiniteF1C5BW0();
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i10 = TileMode.INSTANCE.m2828getClamp3opZhB0();
            }
            return companion.m2475linearGradientmHitzGk((List<Color>) list, j12, j13, i10);
        }
    }

    public /* synthetic */ Brush(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo2461applyToPq9zytI(long size, @NotNull Paint p4, float alpha);

    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name and from getter */
    public long getIntrinsicSize() {
        return this.intrinsicSize;
    }

    public Brush() {
        this.intrinsicSize = Size.INSTANCE.m2352getUnspecifiedNHjbRc();
    }
}

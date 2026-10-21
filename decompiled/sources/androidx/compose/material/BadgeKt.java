package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Badge.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u001aU\u0010\t\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001aU\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\"\u001d\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u001d\u0010\u001a\u001a\u00020\u00128\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u001d\u0010\u001d\u001a\u00020\u00128\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016\"\u001d\u0010 \u001a\u00020\u00128\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u001d\u0010#\u001a\u00020\u00128\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "badge", "Landroidx/compose/ui/Modifier;", "modifier", "content", "BadgedBox", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/RowScope;", "Badge-eopBjH0", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Badge", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getBadgeRadius", "()F", "BadgeRadius", "b", "getBadgeWithContentRadius", "BadgeWithContentRadius", "d", "getBadgeWithContentHorizontalPadding", "BadgeWithContentHorizontalPadding", "e", "getBadgeWithContentHorizontalOffset", "BadgeWithContentHorizontalOffset", "f", "getBadgeHorizontalOffset", "BadgeHorizontalOffset", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,187:1\n78#2,11:188\n78#2,11:221\n91#2:253\n78#2,11:261\n91#2:293\n91#2:298\n78#2,11:302\n91#2:334\n456#3,8:199\n464#3,3:213\n456#3,8:232\n464#3,3:246\n467#3,3:250\n456#3,8:272\n464#3,3:286\n467#3,3:290\n467#3,3:295\n456#3,8:313\n464#3,3:327\n467#3,3:331\n4144#4,6:207\n4144#4,6:240\n4144#4,6:280\n4144#4,6:321\n67#5,5:216\n72#5:249\n76#5:254\n66#5,6:255\n72#5:289\n76#5:294\n92#6:299\n64#6:340\n64#6:342\n77#7,2:300\n79#7:330\n83#7:335\n154#8:336\n154#8:337\n154#8:338\n154#8:339\n154#8:341\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt\n*L\n64#1:188,11\n66#1:221,11\n66#1:253\n71#1:261,11\n71#1:293\n64#1:298\n140#1:302,11\n140#1:334\n64#1:199,8\n64#1:213,3\n66#1:232,8\n66#1:246,3\n66#1:250,3\n71#1:272,8\n71#1:286,3\n71#1:290,3\n64#1:295,3\n140#1:313,8\n140#1:327,3\n140#1:331,3\n64#1:207,6\n66#1:240,6\n71#1:280,6\n140#1:321,6\n66#1:216,5\n66#1:249\n66#1:254\n71#1:255,6\n71#1:289\n71#1:294\n142#1:299\n182#1:340\n186#1:342\n140#1:300,2\n140#1:330\n140#1:335\n169#1:336\n172#1:337\n178#1:338\n182#1:339\n186#1:341\n*E\n"})
public final class BadgeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f6757a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f6760d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f6762f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f6758b = Dp.m4389constructorimpl(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f6759c = TextUnitKt.getSp(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f6761e = Dp.m4389constructorimpl(-Dp.m4389constructorimpl(6));

    /* JADX INFO: compiled from: Badge.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f6763p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RowScope f6764q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f6765r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function3 function3, RowScopeInstance rowScopeInstance, int i10) {
            super(2);
            this.f6763p0 = function3;
            this.f6764q0 = rowScopeInstance;
            this.f6765r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1784526485, iIntValue, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous> (Badge.kt:156)");
                }
                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                TextKt.ProvideTextStyle(button.m3985copyv2rsoow((16252927 & 1) != 0 ? button.spanStyle.m3927getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? button.spanStyle.getFontSize() : BadgeKt.f6759c, (16252927 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (16252927 & 256) != 0 ? button.spanStyle.getBaselineShift() : null, (16252927 & 512) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (16252927 & 1024) != 0 ? button.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? button.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (16252927 & 32768) != 0 ? button.paragraphStyle.getTextAlign() : null, (16252927 & 65536) != 0 ? button.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? button.platformStyle : null, (16252927 & 1048576) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? button.paragraphStyle.getLineBreak() : null, (16252927 & 4194304) != 0 ? button.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null), ComposableLambdaKt.composableLambda(composer2, 915155142, true, new t(this.f6763p0, this.f6764q0, 6, this.f6765r0)), composer2, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Badge.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6766p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f6767q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f6768r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f6769s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f6770t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f6771u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, long j10, long j11, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f6766p0 = modifier;
            this.f6767q0 = j10;
            this.f6768r0 = j11;
            this.f6769s0 = function3;
            this.f6770t0 = i10;
            this.f6771u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            BadgeKt.m668BadgeeopBjH0(this.f6766p0, this.f6767q0, this.f6768r0, this.f6769s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6770t0 | 1), this.f6771u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Badge.kt */
    @SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt$BadgedBox$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n223#2,2:188\n223#2,2:190\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt$BadgedBox$2\n*L\n79#1:188,2\n85#1:190,2\n*E\n"})
    public static final class c implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f6772a = new c();

        /* JADX INFO: compiled from: Badge.kt */
        public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Placeable f6773p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ MeasureScope f6774q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Placeable f6775r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Placeable placeable, MeasureScope measureScope, Placeable placeable2) {
                super(1);
                this.f6773p0 = placeable;
                this.f6774q0 = measureScope;
                this.f6775r0 = placeable2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope layout = placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable placeable = this.f6773p0;
                int width = placeable.getWidth();
                float badgeRadius = BadgeKt.getBadgeRadius();
                MeasureScope measureScope = this.f6774q0;
                float badgeWithContentHorizontalOffset = width > measureScope.mo413roundToPx0680j_4(badgeRadius) * 2 ? BadgeKt.getBadgeWithContentHorizontalOffset() : BadgeKt.getBadgeHorizontalOffset();
                Placeable.PlacementScope.placeRelative$default(layout, this.f6775r0, 0, 0, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(layout, this.f6773p0, measureScope.mo413roundToPx0680j_4(badgeWithContentHorizontalOffset) + this.f6775r0.getWidth(), (-placeable.getHeight()) / 2, 0.0f, 4, null);
                return Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.a(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.b(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            List<? extends Measurable> list = measurables;
            for (Measurable measurable : list) {
                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "badge")) {
                    Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
                    for (Measurable measurable2 : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "anchor")) {
                            Placeable placeableMo3575measureBRTryo1 = measurable2.mo3575measureBRTryo0(j10);
                            return Layout.layout(placeableMo3575measureBRTryo1.getWidth(), placeableMo3575measureBRTryo1.getHeight(), bk.q.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(placeableMo3575measureBRTryo1.get(AlignmentLineKt.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(placeableMo3575measureBRTryo1.get(AlignmentLineKt.getLastBaseline())))), new a(placeableMo3575measureBRTryo0, Layout, placeableMo3575measureBRTryo1));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.c(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.d(this, intrinsicMeasureScope, list, i10);
        }
    }

    /* JADX INFO: compiled from: Badge.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f6776p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6777q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f6778r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f6779s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f6780t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function4, int i10, int i11) {
            super(2);
            this.f6776p0 = function3;
            this.f6777q0 = modifier;
            this.f6778r0 = function4;
            this.f6779s0 = i10;
            this.f6780t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            BadgeKt.BadgedBox(this.f6776p0, this.f6777q0, this.f6778r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6779s0 | 1), this.f6780t0);
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 4;
        f6757a = Dp.m4389constructorimpl(f6);
        f6760d = Dp.m4389constructorimpl(f6);
        f6762f = Dp.m4389constructorimpl(-Dp.m4389constructorimpl(f6));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x0151  */
    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    /* JADX WARN: Code duplicated, block: B:89:0x0166  */
    /* JADX WARN: Code duplicated, block: B:91:0x0174  */
    /* JADX WARN: Code duplicated, block: B:94:0x0190  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b8  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Badge-eopBjH0, reason: not valid java name */
    public static final void m668BadgeeopBjH0(@Nullable Modifier modifier, long j10, long j11, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        long jM707getError0d7_KjU;
        long jM731contentColorForek8zF_U;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4;
        Modifier modifier3;
        float f6;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2 function2C;
        RowScopeInstance rowScopeInstance;
        long j12;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1133484502);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            jM707getError0d7_KjU = j10;
            i12 |= ((i11 & 2) == 0 && composerStartRestartGroup.changed(jM707getError0d7_KjU)) ? 32 : 16;
        } else {
            jM707getError0d7_KjU = j10;
        }
        if ((i10 & 896) == 0) {
            jM731contentColorForek8zF_U = j11;
            i12 |= ((i11 & 4) == 0 && composerStartRestartGroup.changed(jM731contentColorForek8zF_U)) ? 256 : 128;
        } else {
            jM731contentColorForek8zF_U = j11;
        }
        int i14 = i11 & 8;
        if (i14 == 0) {
            if ((i10 & 7168) == 0) {
                function4 = function3;
                i12 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
            }
            if ((i12 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        jM707getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m707getError0d7_KjU();
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM707getError0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i14 != 0) {
                        function4 = null;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1133484502, i12, -1, "androidx.compose.material.Badge (Badge.kt:129)");
                }
                if (function4 != null) {
                    f6 = f6758b;
                } else {
                    f6 = f6757a;
                }
                RoundedCornerShape roundedCornerShapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(f6);
                float f10 = f6 * 2;
                Modifier modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(ClipKt.clip(BackgroundKt.m121backgroundbw27NRU(SizeKt.m319defaultMinSizeVpY3zN4(modifier3, Dp.m4389constructorimpl(f10), Dp.m4389constructorimpl(f10)), jM707getError0d7_KjU, roundedCornerShapeM482RoundedCornerShape0680j_4), roundedCornerShapeM482RoundedCornerShape0680j_4), f6760d, 0.0f, 2, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM298paddingVpY3zN4$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(521574215);
                if (function4 != null) {
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1784526485, true, new a(function4, rowScopeInstance, i12)), composerStartRestartGroup, 56);
                }
                if (androidx.databinding.e.e(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            j12 = jM731contentColorForek8zF_U;
            function5 = function4;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, jM707getError0d7_KjU, j12, function5, i10, i11));
        }
        i12 |= 3072;
        function4 = function3;
        if ((i12 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    jM707getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m707getError0d7_KjU();
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM707getError0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i14 != 0) {
                    function4 = null;
                }
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    jM707getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m707getError0d7_KjU();
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM707getError0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i14 != 0) {
                    function4 = null;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133484502, i12, -1, "androidx.compose.material.Badge (Badge.kt:129)");
            }
            if (function4 != null) {
                f6 = f6758b;
            } else {
                f6 = f6757a;
            }
            RoundedCornerShape roundedCornerShapeM482RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(f6);
            float f11 = f6 * 2;
            Modifier modifierM298paddingVpY3zN4$default2 = PaddingKt.m298paddingVpY3zN4$default(ClipKt.clip(BackgroundKt.m121backgroundbw27NRU(SizeKt.m319defaultMinSizeVpY3zN4(modifier3, Dp.m4389constructorimpl(f11), Dp.m4389constructorimpl(f11)), jM707getError0d7_KjU, roundedCornerShapeM482RoundedCornerShape0680j_5), roundedCornerShapeM482RoundedCornerShape0680j_5), f6760d, 0.0f, 2, null);
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM298paddingVpY3zN4$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRowMeasurePolicy2, composerM2074constructorimpl, currentCompositionLocalMap2);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(521574215);
            if (function4 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1784526485, true, new a(function4, rowScopeInstance, i12)), composerStartRestartGroup, 56);
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    jM707getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m707getError0d7_KjU();
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM707getError0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i14 != 0) {
                    function4 = null;
                }
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    jM707getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m707getError0d7_KjU();
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM707getError0d7_KjU, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i14 != 0) {
                    function4 = null;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133484502, i12, -1, "androidx.compose.material.Badge (Badge.kt:129)");
            }
            if (function4 != null) {
                f6 = f6758b;
            } else {
                f6 = f6757a;
            }
            RoundedCornerShape roundedCornerShapeM482RoundedCornerShape0680j_6 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(f6);
            float f12 = f6 * 2;
            Modifier modifierM298paddingVpY3zN4$default3 = PaddingKt.m298paddingVpY3zN4$default(ClipKt.clip(BackgroundKt.m121backgroundbw27NRU(SizeKt.m319defaultMinSizeVpY3zN4(modifier3, Dp.m4389constructorimpl(f12), Dp.m4389constructorimpl(f12)), jM707getError0d7_KjU, roundedCornerShapeM482RoundedCornerShape0680j_6), roundedCornerShapeM482RoundedCornerShape0680j_6), f6760d, 0.0f, 2, null);
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center3 = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(center3, centerVertically3, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM298paddingVpY3zN4$default3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyRowMeasurePolicy3, composerM2074constructorimpl, currentCompositionLocalMap3);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(521574215);
            if (function4 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1784526485, true, new a(function4, rowScopeInstance, i12)), composerStartRestartGroup, 56);
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        j12 = jM731contentColorForek8zF_U;
        function5 = function4;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, jM707getError0d7_KjU, j12, function5, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x0154  */
    /* JADX WARN: Code duplicated, block: B:63:0x0160  */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    /* JADX WARN: Code duplicated, block: B:67:0x0175  */
    /* JADX WARN: Code duplicated, block: B:69:0x0183  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x0207  */
    /* JADX WARN: Code duplicated, block: B:76:0x020b  */
    /* JADX WARN: Code duplicated, block: B:79:0x021c  */
    /* JADX WARN: Code duplicated, block: B:81:0x022a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0267  */
    /* JADX WARN: Code duplicated, block: B:89:0x0273  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BadgedBox(@NotNull Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> badge, @Nullable Modifier modifier, @NotNull Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM2074constructorimpl2;
        Function2 function2C;
        int currentCompositeKeyHash3;
        Function0<ComposeUiNode> constructor3;
        Composer composerM2074constructorimpl3;
        Function2 function2C2;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(859805272);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(badge) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            } else if ((i10 & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(859805272, i12, -1, "androidx.compose.material.BadgedBox (Badge.kt:58)");
                }
                c cVar = c.f6772a;
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
                int i15 = (((i12 & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl, cVar, companion.getSetMeasurePolicy());
                Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
                }
                ai.a.j((i15 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierLayoutId = LayoutIdKt.layoutId(companion2, "anchor");
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Alignment center = companion3.getCenter();
                int i16 = ((i12 << 3) & 7168) | 54;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i17 = i16 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, (i17 & 14) | (i17 & 112));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierLayoutId);
                int i18 = ((((i16 << 3) & 112) << 9) & 7168) | 6;
                Modifier modifier5 = modifier3;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl2, currentCompositionLocalMap2);
                if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C);
                }
                ai.a.j((i18 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                content.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i16 >> 6) & 112) | 6));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion2, "badge");
                int i19 = ((i12 << 9) & 7168) | 6;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i20 = i19 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, (i20 & 112) | (i20 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierLayoutId2);
                int i21 = ((((i19 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C2 = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl3, currentCompositionLocalMap3);
                if (composerM2074constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C2);
                }
                ai.a.j((i21 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                badge.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i19 >> 6) & 112) | 6));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(badge, modifier4, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146) {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(859805272, i12, -1, "androidx.compose.material.BadgedBox (Badge.kt:58)");
            }
            c cVar2 = c.f6772a;
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifier3);
            int i110 = (((i12 & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, cVar2, companion4.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            ai.a.j((i110 >> 3) & 112, function3ModifierMaterializerOf4, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier modifierLayoutId3 = LayoutIdKt.layoutId(companion5, "anchor");
            Alignment.Companion companion6 = Alignment.INSTANCE;
            Alignment center2 = companion6.getCenter();
            int i111 = ((i12 << 3) & 7168) | 54;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i112 = i111 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, (i112 & 14) | (i112 & 112));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierLayoutId3);
            int i113 = ((((i111 << 3) & 112) << 9) & 7168) | 6;
            Modifier modifier6 = modifier3;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion4, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl2, currentCompositionLocalMap5);
            if (composerM2074constructorimpl2.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C);
            }
            ai.a.j((i113 >> 3) & 112, function3ModifierMaterializerOf5, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            content.invoke(boxScopeInstance2, composerStartRestartGroup, Integer.valueOf(((i111 >> 6) & 112) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierLayoutId4 = LayoutIdKt.layoutId(companion5, "badge");
            int i114 = ((i12 << 9) & 7168) | 6;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i22 = i114 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion6.getTopStart(), false, composerStartRestartGroup, (i22 & 112) | (i22 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor3 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierLayoutId4);
            int i23 = ((((i114 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C2 = com.google.android.gms.measurement.internal.a.c(companion4, composerM2074constructorimpl3, measurePolicyRememberBoxMeasurePolicy4, composerM2074constructorimpl3, currentCompositionLocalMap6);
            if (composerM2074constructorimpl3.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C2);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C2);
            }
            ai.a.j((i23 >> 3) & 112, function3ModifierMaterializerOf6, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            badge.invoke(boxScopeInstance2, composerStartRestartGroup, Integer.valueOf(((i114 >> 6) & 112) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier6;
        } else {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(859805272, i12, -1, "androidx.compose.material.BadgedBox (Badge.kt:58)");
            }
            c cVar3 = c.f6772a;
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            constructor = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifier3);
            int i115 = (((i12 & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, cVar3, companion7.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap7, companion7.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion7.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            ai.a.j((i115 >> 3) & 112, function3ModifierMaterializerOf7, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier.Companion companion8 = Modifier.INSTANCE;
            Modifier modifierLayoutId5 = LayoutIdKt.layoutId(companion8, "anchor");
            Alignment.Companion companion9 = Alignment.INSTANCE;
            Alignment center3 = companion9.getCenter();
            int i116 = ((i12 << 3) & 7168) | 54;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i117 = i116 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, (i117 & 14) | (i117 & 112));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierLayoutId5);
            int i118 = ((((i116 << 3) & 112) << 9) & 7168) | 6;
            Modifier modifier7 = modifier3;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion7, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy5, composerM2074constructorimpl2, currentCompositionLocalMap8);
            if (composerM2074constructorimpl2.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C);
            }
            ai.a.j((i118 >> 3) & 112, function3ModifierMaterializerOf8, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            content.invoke(boxScopeInstance3, composerStartRestartGroup, Integer.valueOf(((i116 >> 6) & 112) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierLayoutId6 = LayoutIdKt.layoutId(companion8, "badge");
            int i119 = ((i12 << 9) & 7168) | 6;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i24 = i119 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion9.getTopStart(), false, composerStartRestartGroup, (i24 & 112) | (i24 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor3 = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierLayoutId6);
            int i25 = ((((i119 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C2 = com.google.android.gms.measurement.internal.a.c(companion7, composerM2074constructorimpl3, measurePolicyRememberBoxMeasurePolicy6, composerM2074constructorimpl3, currentCompositionLocalMap9);
            if (composerM2074constructorimpl3.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C2);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C2);
            }
            ai.a.j((i25 >> 3) & 112, function3ModifierMaterializerOf9, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            badge.invoke(boxScopeInstance3, composerStartRestartGroup, Integer.valueOf(((i119 >> 6) & 112) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier7;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(badge, modifier4, content, i10, i11));
    }

    public static final float getBadgeHorizontalOffset() {
        return f6762f;
    }

    public static final float getBadgeRadius() {
        return f6757a;
    }

    public static final float getBadgeWithContentHorizontalOffset() {
        return f6761e;
    }

    public static final float getBadgeWithContentHorizontalPadding() {
        return f6760d;
    }

    public static final float getBadgeWithContentRadius() {
        return f6758b;
    }
}

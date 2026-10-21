package androidx.compose.material3;

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
import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
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
import androidx.compose.ui.graphics.Shape;
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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aU\u0010\t\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001aU\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\"\u001d\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u001d\u0010\u001a\u001a\u00020\u00128\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u001d\u0010\u001d\u001a\u00020\u00128\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016\"\u001d\u0010 \u001a\u00020\u00128\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "badge", "Landroidx/compose/ui/Modifier;", "modifier", "content", "BadgedBox", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/RowScope;", "Badge-eopBjH0", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Badge", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getBadgeWithContentHorizontalPadding", "()F", "BadgeWithContentHorizontalPadding", "b", "getBadgeWithContentHorizontalOffset", "BadgeWithContentHorizontalOffset", "c", "getBadgeWithContentVerticalOffset", "BadgeWithContentVerticalOffset", "d", "getBadgeOffset", "BadgeOffset", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,207:1\n74#2:208\n75#2,11:210\n75#2:237\n76#2,11:239\n89#2:267\n75#2:275\n76#2,11:277\n89#2:305\n88#2:310\n75#2:313\n76#2,11:315\n89#2:343\n76#3:209\n76#3:238\n76#3:276\n76#3:314\n456#4,11:221\n460#4,13:250\n473#4,3:264\n460#4,13:288\n473#4,3:302\n467#4,3:307\n460#4,13:326\n473#4,3:340\n68#5,5:232\n73#5:263\n77#5:268\n67#5,6:269\n73#5:301\n77#5:306\n79#6,2:311\n81#6:339\n85#6:344\n154#7:345\n154#7:346\n154#7:348\n154#7:350\n64#8:347\n64#8:349\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt\n*L\n67#1:208\n67#1:210,11\n69#1:237\n69#1:239,11\n69#1:267\n74#1:275\n74#1:277,11\n74#1:305\n67#1:310\n154#1:313\n154#1:315,11\n154#1:343\n67#1:209\n69#1:238\n74#1:276\n154#1:314\n67#1:221,11\n69#1:250,13\n69#1:264,3\n74#1:288,13\n74#1:302,3\n67#1:307,3\n154#1:326,13\n154#1:340,3\n69#1:232,5\n69#1:263\n69#1:268\n74#1:269,6\n74#1:301\n74#1:306\n154#1:311,2\n154#1:339\n154#1:344\n197#1:345\n201#1:346\n202#1:348\n206#1:350\n201#1:347\n202#1:349\n*E\n"})
public final class BadgeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f9368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f9369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f9370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f9371d = Dp.m4389constructorimpl(0);

    /* JADX INFO: compiled from: Badge.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f9372p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RowScope f9373q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f9374r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function3 function3, RowScopeInstance rowScopeInstance, int i10) {
            super(2);
            this.f9372p0 = function3;
            this.f9373q0 = rowScopeInstance;
            this.f9374r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(5609066, iIntValue, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous> (Badge.kt:172)");
                }
                TextKt.ProvideTextStyle(IncludeFontPaddingHelper_androidKt.copyAndSetFontPadding(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), BadgeTokens.INSTANCE.getLargeLabelTextFont()), false), ComposableLambdaKt.composableLambda(composer2, -1175098791, true, new j(this.f9372p0, this.f9373q0, 6, this.f9374r0)), composer2, 48);
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
        public final /* synthetic */ Modifier f9375p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f9376q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f9377r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f9378s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f9379t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f9380u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, long j10, long j11, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f9375p0 = modifier;
            this.f9376q0 = j10;
            this.f9377r0 = j11;
            this.f9378s0 = function3;
            this.f9379t0 = i10;
            this.f9380u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            BadgeKt.m920BadgeeopBjH0(this.f9375p0, this.f9376q0, this.f9377r0, this.f9378s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9379t0 | 1), this.f9380u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Badge.kt */
    @SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt$BadgedBox$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n223#2,2:208\n223#2,2:210\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt$BadgedBox$2\n*L\n82#1:208,2\n88#1:210,2\n*E\n"})
    public static final class c implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f9381a = new c();

        /* JADX INFO: compiled from: Badge.kt */
        public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Placeable f9382p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ MeasureScope f9383q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Placeable f9384r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Placeable placeable, MeasureScope measureScope, Placeable placeable2) {
                super(1);
                this.f9382p0 = placeable;
                this.f9383q0 = measureScope;
                this.f9384r0 = placeable2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope layout = placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable placeable = this.f9382p0;
                int width = placeable.getWidth();
                float fM1514getSizeD9Ej5fM = BadgeTokens.INSTANCE.m1514getSizeD9Ej5fM();
                MeasureScope measureScope = this.f9383q0;
                boolean z10 = width > measureScope.mo413roundToPx0680j_4(fM1514getSizeD9Ej5fM);
                float badgeWithContentHorizontalOffset = z10 ? BadgeKt.getBadgeWithContentHorizontalOffset() : BadgeKt.getBadgeOffset();
                float badgeWithContentVerticalOffset = z10 ? BadgeKt.getBadgeWithContentVerticalOffset() : BadgeKt.getBadgeOffset();
                Placeable.PlacementScope.placeRelative$default(layout, this.f9384r0, 0, 0, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(layout, this.f9382p0, measureScope.mo413roundToPx0680j_4(badgeWithContentHorizontalOffset) + this.f9384r0.getWidth(), measureScope.mo413roundToPx0680j_4(badgeWithContentVerticalOffset) + ((-placeable.getHeight()) / 2), 0.0f, 4, null);
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
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f9385p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9386q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f9387r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f9388s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f9389t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function4, int i10, int i11) {
            super(2);
            this.f9385p0 = function3;
            this.f9386q0 = modifier;
            this.f9387r0 = function4;
            this.f9388s0 = i10;
            this.f9389t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            BadgeKt.BadgedBox(this.f9385p0, this.f9386q0, this.f9387r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9388s0 | 1), this.f9389t0);
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 4;
        f9368a = Dp.m4389constructorimpl(f6);
        f9369b = Dp.m4389constructorimpl(-Dp.m4389constructorimpl(f6));
        f9370c = Dp.m4389constructorimpl(-Dp.m4389constructorimpl(f6));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01da  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x0102  */
    /* JADX WARN: Code duplicated, block: B:86:0x0123  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:90:0x017c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0188  */
    /* JADX WARN: Code duplicated, block: B:94:0x018c  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b2  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Badge-eopBjH0, reason: not valid java name */
    public static final void m920BadgeeopBjH0(@Nullable Modifier modifier, long j10, long j11, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        long containerColor;
        long jM1014contentColorForek8zF_U;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4;
        Modifier modifier3;
        BadgeTokens badgeTokens;
        float fM1514getSizeD9Ej5fM;
        Shape shape;
        Modifier modifierM298paddingVpY3zN4$default;
        Function0<ComposeUiNode> constructor;
        RowScopeInstance rowScopeInstance;
        long j12;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1298144073);
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
            containerColor = j10;
            i12 |= ((i11 & 2) == 0 && composerStartRestartGroup.changed(containerColor)) ? 32 : 16;
        } else {
            containerColor = j10;
        }
        if ((i10 & 896) == 0) {
            jM1014contentColorForek8zF_U = j11;
            i12 |= ((i11 & 4) == 0 && composerStartRestartGroup.changed(jM1014contentColorForek8zF_U)) ? 256 : 128;
        } else {
            jM1014contentColorForek8zF_U = j11;
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
                        containerColor = BadgeDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
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
                    ComposerKt.traceEventStart(1298144073, i12, -1, "androidx.compose.material3.Badge (Badge.kt:139)");
                }
                badgeTokens = BadgeTokens.INSTANCE;
                if (function4 != null) {
                    fM1514getSizeD9Ej5fM = badgeTokens.m1513getLargeSizeD9Ej5fM();
                } else {
                    fM1514getSizeD9Ej5fM = badgeTokens.m1514getSizeD9Ej5fM();
                }
                if (function4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(1947275116);
                    shape = ShapesKt.toShape(BadgeTokens.INSTANCE.getLargeShape(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1947275170);
                    shape = ShapesKt.toShape(BadgeTokens.INSTANCE.getShape(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                Modifier modifierClip = ClipKt.clip(BackgroundKt.m121backgroundbw27NRU(SizeKt.m319defaultMinSizeVpY3zN4(modifier3, fM1514getSizeD9Ej5fM, fM1514getSizeD9Ej5fM), containerColor, shape), shape);
                if (function4 != null) {
                    modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(Modifier.INSTANCE, f9368a, 0.0f, 2, null);
                } else {
                    modifierM298paddingVpY3zN4$default = Modifier.INSTANCE;
                }
                Modifier modifierThen = modifierClip.then(modifierM298paddingVpY3zN4$default);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
                Modifier modifier4 = modifier3;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1947275771);
                if (function4 != null) {
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM1014contentColorForek8zF_U))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 5609066, true, new a(function4, rowScopeInstance, i12)), composerStartRestartGroup, 56);
                }
                if (androidx.databinding.e.e(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            j12 = containerColor;
            function5 = function4;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, j12, jM1014contentColorForek8zF_U, function5, i10, i11));
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
                    containerColor = BadgeDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
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
                    containerColor = BadgeDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i14 != 0) {
                    function4 = null;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1298144073, i12, -1, "androidx.compose.material3.Badge (Badge.kt:139)");
            }
            badgeTokens = BadgeTokens.INSTANCE;
            if (function4 != null) {
                fM1514getSizeD9Ej5fM = badgeTokens.m1513getLargeSizeD9Ej5fM();
            } else {
                fM1514getSizeD9Ej5fM = badgeTokens.m1514getSizeD9Ej5fM();
            }
            if (function4 != null) {
                composerStartRestartGroup.startReplaceableGroup(1947275116);
                shape = ShapesKt.toShape(BadgeTokens.INSTANCE.getLargeShape(), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(1947275170);
                shape = ShapesKt.toShape(BadgeTokens.INSTANCE.getShape(), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            }
            Modifier modifierClip2 = ClipKt.clip(BackgroundKt.m121backgroundbw27NRU(SizeKt.m319defaultMinSizeVpY3zN4(modifier3, fM1514getSizeD9Ej5fM, fM1514getSizeD9Ej5fM), containerColor, shape), shape);
            if (function4 != null) {
                modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(Modifier.INSTANCE, f9368a, 0.0f, 2, null);
            } else {
                modifierM298paddingVpY3zN4$default = Modifier.INSTANCE;
            }
            Modifier modifierThen2 = modifierClip2.then(modifierM298paddingVpY3zN4$default);
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, composerStartRestartGroup, 54);
            Density density2 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierThen2);
            Modifier modifier5 = modifier3;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl2, measurePolicyRowMeasurePolicy2, composerM2074constructorimpl2, density2));
            ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1947275771);
            if (function4 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM1014contentColorForek8zF_U))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 5609066, true, new a(function4, rowScopeInstance, i12)), composerStartRestartGroup, 56);
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier5;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    containerColor = BadgeDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
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
                    containerColor = BadgeDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i14 != 0) {
                    function4 = null;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1298144073, i12, -1, "androidx.compose.material3.Badge (Badge.kt:139)");
            }
            badgeTokens = BadgeTokens.INSTANCE;
            if (function4 != null) {
                fM1514getSizeD9Ej5fM = badgeTokens.m1513getLargeSizeD9Ej5fM();
            } else {
                fM1514getSizeD9Ej5fM = badgeTokens.m1514getSizeD9Ej5fM();
            }
            if (function4 != null) {
                composerStartRestartGroup.startReplaceableGroup(1947275116);
                shape = ShapesKt.toShape(BadgeTokens.INSTANCE.getLargeShape(), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(1947275170);
                shape = ShapesKt.toShape(BadgeTokens.INSTANCE.getShape(), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            }
            Modifier modifierClip3 = ClipKt.clip(BackgroundKt.m121backgroundbw27NRU(SizeKt.m319defaultMinSizeVpY3zN4(modifier3, fM1514getSizeD9Ej5fM, fM1514getSizeD9Ej5fM), containerColor, shape), shape);
            if (function4 != null) {
                modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(Modifier.INSTANCE, f9368a, 0.0f, 2, null);
            } else {
                modifierM298paddingVpY3zN4$default = Modifier.INSTANCE;
            }
            Modifier modifierThen3 = modifierClip3.then(modifierM298paddingVpY3zN4$default);
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center3 = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(center3, centerVertically3, composerStartRestartGroup, 54);
            Density density3 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierThen3);
            Modifier modifier6 = modifier3;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl3, measurePolicyRowMeasurePolicy3, composerM2074constructorimpl3, density3));
            ai.a.j(0, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1947275771);
            if (function4 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM1014contentColorForek8zF_U))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 5609066, true, new a(function4, rowScopeInstance, i12)), composerStartRestartGroup, 56);
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier6;
        }
        j12 = containerColor;
        function5 = function4;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, j12, jM1014contentColorForek8zF_U, function5, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x0169  */
    /* JADX WARN: Code duplicated, block: B:58:0x0175  */
    /* JADX WARN: Code duplicated, block: B:59:0x0179  */
    /* JADX WARN: Code duplicated, block: B:62:0x020a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0216  */
    /* JADX WARN: Code duplicated, block: B:66:0x021a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0263  */
    /* JADX WARN: Code duplicated, block: B:73:0x026d  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BadgedBox(@NotNull Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> badge, @Nullable Modifier modifier, @NotNull Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        Modifier modifier3;
        Function0<ComposeUiNode> constructor;
        Modifier modifier4;
        Function0<ComposeUiNode> constructor2;
        Function0<ComposeUiNode> constructor3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1404022535);
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
                    ComposerKt.traceEventStart(1404022535, i12, -1, "androidx.compose.material3.BadgedBox (Badge.kt:61)");
                }
                c cVar = c.f9381a;
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier3);
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
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl, cVar, companion.getSetMeasurePolicy());
                Updater.m2081setimpl(composerM2074constructorimpl, density, companion.getSetDensity());
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                Updater.m2081setimpl(composerM2074constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                ai.a.j((i15 >> 3) & 112, function3MaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierLayoutId = LayoutIdKt.layoutId(companion2, "anchor");
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Alignment center = companion3.getCenter();
                int i16 = ((i12 << 3) & 7168) | 54;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i17 = i16 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, (i17 & 14) | (i17 & 112));
                Density density2 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                modifier4 = modifier3;
                constructor2 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierLayoutId);
                int i18 = ((((i16 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl2, density2));
                ai.a.j((i18 >> 3) & 112, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
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
                Density density3 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor3 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierLayoutId2);
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
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl3, density3));
                ai.a.j((i21 >> 3) & 112, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
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
                ComposerKt.traceEventStart(1404022535, i12, -1, "androidx.compose.material3.BadgedBox (Badge.kt:61)");
            }
            c cVar2 = c.f9381a;
            Density density4 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifier3);
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
            Composer composerM2074constructorimpl4 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl4, cVar2, companion4.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl4, density4, companion4.getSetDensity());
            Updater.m2081setimpl(composerM2074constructorimpl4, layoutDirection4, companion4.getSetLayoutDirection());
            Updater.m2081setimpl(composerM2074constructorimpl4, viewConfiguration4, companion4.getSetViewConfiguration());
            ai.a.j((i110 >> 3) & 112, function3MaterializerOf4, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier modifierLayoutId3 = LayoutIdKt.layoutId(companion5, "anchor");
            Alignment.Companion companion6 = Alignment.INSTANCE;
            Alignment center2 = companion6.getCenter();
            int i111 = ((i12 << 3) & 7168) | 54;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i112 = i111 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, (i112 & 14) | (i112 & 112));
            Density density5 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            modifier4 = modifier3;
            constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierLayoutId3);
            int i113 = ((((i111 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl5 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl5, layoutDirection5, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl5, density5));
            ai.a.j((i113 >> 3) & 112, function3MaterializerOf5, androidx.appcompat.widget.g0.b(companion4, composerM2074constructorimpl5, viewConfiguration5, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
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
            Density density6 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor3 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierLayoutId4);
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
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl6 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl6, layoutDirection6, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl6, measurePolicyRememberBoxMeasurePolicy4, composerM2074constructorimpl6, density6));
            ai.a.j((i23 >> 3) & 112, function3MaterializerOf6, androidx.appcompat.widget.g0.b(companion4, composerM2074constructorimpl6, viewConfiguration6, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
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
        } else {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1404022535, i12, -1, "androidx.compose.material3.BadgedBox (Badge.kt:61)");
            }
            c cVar3 = c.f9381a;
            Density density7 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            constructor = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifier3);
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
            Composer composerM2074constructorimpl7 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl7, cVar3, companion7.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl7, density7, companion7.getSetDensity());
            Updater.m2081setimpl(composerM2074constructorimpl7, layoutDirection7, companion7.getSetLayoutDirection());
            Updater.m2081setimpl(composerM2074constructorimpl7, viewConfiguration7, companion7.getSetViewConfiguration());
            ai.a.j((i115 >> 3) & 112, function3MaterializerOf7, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier.Companion companion8 = Modifier.INSTANCE;
            Modifier modifierLayoutId5 = LayoutIdKt.layoutId(companion8, "anchor");
            Alignment.Companion companion9 = Alignment.INSTANCE;
            Alignment center3 = companion9.getCenter();
            int i116 = ((i12 << 3) & 7168) | 54;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i117 = i116 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, (i117 & 14) | (i117 & 112));
            Density density8 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            modifier4 = modifier3;
            constructor2 = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierLayoutId5);
            int i118 = ((((i116 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl8 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl8, layoutDirection8, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion7, composerM2074constructorimpl8, measurePolicyRememberBoxMeasurePolicy5, composerM2074constructorimpl8, density8));
            ai.a.j((i118 >> 3) & 112, function3MaterializerOf8, androidx.appcompat.widget.g0.b(companion7, composerM2074constructorimpl8, viewConfiguration8, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
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
            Density density9 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor3 = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierLayoutId6);
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
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl9 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl9, layoutDirection9, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion7, composerM2074constructorimpl9, measurePolicyRememberBoxMeasurePolicy6, composerM2074constructorimpl9, density9));
            ai.a.j((i25 >> 3) & 112, function3MaterializerOf9, androidx.appcompat.widget.g0.b(companion7, composerM2074constructorimpl9, viewConfiguration9, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
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
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(badge, modifier4, content, i10, i11));
    }

    public static final float getBadgeOffset() {
        return f9371d;
    }

    public static final float getBadgeWithContentHorizontalOffset() {
        return f9369b;
    }

    public static final float getBadgeWithContentHorizontalPadding() {
        return f9368a;
    }

    public static final float getBadgeWithContentVerticalOffset() {
        return f9370c;
    }
}

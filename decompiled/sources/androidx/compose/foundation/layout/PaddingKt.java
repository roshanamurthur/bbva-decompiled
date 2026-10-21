package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.adobe.marketing.mobile.EventDataKeys;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import com.mastercard.sonic.androidsvg.SVGParser;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0001¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0001¢\u0006\u0002\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a!\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aA\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", EventDataKeys.Lifecycle.LIFECYCLE_START, "top", "end", "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", Parameters.DIRECTION.LEFT, Parameters.DIRECTION.RIGHT, "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n154#2:472\n154#2:473\n154#2:474\n154#2:475\n154#2:476\n154#2:477\n154#2:478\n154#2:479\n154#2:480\n154#2:481\n154#2:482\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n50#1:468\n51#1:469\n52#1:470\n53#1:471\n83#1:472\n84#1:473\n156#1:474\n157#1:475\n158#1:476\n159#1:477\n275#1:478\n285#1:479\n286#1:480\n287#1:481\n288#1:482\n*E\n"})
public final class PaddingKt {

    /* JADX INFO: compiled from: Padding.kt */
    public static final class a extends Lambda implements Function1<InspectorInfo, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f4308p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f4309q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f4310r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f4311s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f6, float f10, float f11, float f12) {
            super(1);
            this.f4308p0 = f6;
            this.f4309q0 = f10;
            this.f4310r0 = f11;
            this.f4311s0 = f12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InspectorInfo inspectorInfo) {
            InspectorInfo inspectorInfo2 = inspectorInfo;
            androidx.activity.a.b(this.f4310r0, androidx.activity.a.b(this.f4309q0, androidx.activity.a.b(this.f4308p0, androidx.activity.a.c(inspectorInfo2, "$this$$receiver", "absolutePadding"), Parameters.DIRECTION.LEFT, inspectorInfo2), "top", inspectorInfo2), Parameters.DIRECTION.RIGHT, inspectorInfo2).set("bottom", Dp.m4387boximpl(this.f4311s0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Padding.kt */
    public static final class b extends Lambda implements Function1<InspectorInfo, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f4312p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f4313q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f4314r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f4315s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f6, float f10, float f11, float f12) {
            super(1);
            this.f4312p0 = f6;
            this.f4313q0 = f10;
            this.f4314r0 = f11;
            this.f4315s0 = f12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InspectorInfo inspectorInfo) {
            InspectorInfo inspectorInfo2 = inspectorInfo;
            androidx.activity.a.b(this.f4314r0, androidx.activity.a.b(this.f4313q0, androidx.activity.a.b(this.f4312p0, androidx.activity.a.c(inspectorInfo2, "$this$$receiver", "padding"), EventDataKeys.Lifecycle.LIFECYCLE_START, inspectorInfo2), "top", inspectorInfo2), "end", inspectorInfo2).set("bottom", Dp.m4387boximpl(this.f4315s0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Padding.kt */
    public static final class c extends Lambda implements Function1<InspectorInfo, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f4316p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f4317q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f6, float f10) {
            super(1);
            this.f4316p0 = f6;
            this.f4317q0 = f10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InspectorInfo inspectorInfo) {
            InspectorInfo inspectorInfo2 = inspectorInfo;
            androidx.activity.a.b(this.f4316p0, androidx.activity.a.c(inspectorInfo2, "$this$$receiver", "padding"), "horizontal", inspectorInfo2).set("vertical", Dp.m4387boximpl(this.f4317q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Padding.kt */
    public static final class d extends Lambda implements Function1<InspectorInfo, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f4318p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f6) {
            super(1);
            this.f4318p0 = f6;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InspectorInfo inspectorInfo) {
            InspectorInfo $receiver = inspectorInfo;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            $receiver.setName("padding");
            $receiver.setValue(Dp.m4387boximpl(this.f4318p0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Padding.kt */
    public static final class e extends Lambda implements Function1<InspectorInfo, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f4319p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PaddingValues paddingValues) {
            super(1);
            this.f4319p0 = paddingValues;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InspectorInfo inspectorInfo) {
            androidx.activity.a.c(inspectorInfo, "$this$$receiver", "padding").set("paddingValues", this.f4319p0);
            return Unit.INSTANCE;
        }
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m289PaddingValues0680j_4(float f6) {
        return new PaddingValuesImpl(f6, f6, f6, f6, null);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m290PaddingValuesYgX7TsA(float f6, float f10) {
        return new PaddingValuesImpl(f6, f10, f6, f10, null);
    }

    /* JADX INFO: renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m291PaddingValuesYgX7TsA$default(float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.m4389constructorimpl(0);
        }
        return m290PaddingValuesYgX7TsA(f6, f10);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m292PaddingValuesa9UjIt4(float f6, float f10, float f11, float f12) {
        return new PaddingValuesImpl(f6, f10, f11, f12, null);
    }

    /* JADX INFO: renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m293PaddingValuesa9UjIt4$default(float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f11 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f12 = Dp.m4389constructorimpl(0);
        }
        return m292PaddingValuesa9UjIt4(f6, f10, f11, f12);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final Modifier m294absolutePaddingqDBjuR0(@NotNull Modifier absolutePadding, float f6, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(absolutePadding, "$this$absolutePadding");
        return absolutePadding.then(new PaddingElement(f6, f10, f11, f12, false, new a(f6, f10, f11, f12)));
    }

    /* JADX INFO: renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m295absolutePaddingqDBjuR0$default(Modifier modifier, float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f11 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f12 = Dp.m4389constructorimpl(0);
        }
        return m294absolutePaddingqDBjuR0(modifier, f6, f10, f11, f12);
    }

    @Stable
    public static final float calculateEndPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo303calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo302calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateStartPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo302calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo303calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    @NotNull
    public static final Modifier padding(@NotNull Modifier modifier, @NotNull PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return modifier.then(new PaddingValuesElement(paddingValues, new e(paddingValues)));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m296padding3ABfNKs(@NotNull Modifier padding, float f6) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingElement(f6, f6, f6, f6, true, new d(f6)));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m297paddingVpY3zN4(@NotNull Modifier padding, float f6, float f10) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingElement(f6, f10, f6, f10, true, new c(f6, f10)));
    }

    /* JADX INFO: renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m298paddingVpY3zN4$default(Modifier modifier, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.m4389constructorimpl(0);
        }
        return m297paddingVpY3zN4(modifier, f6, f10);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m299paddingqDBjuR0(@NotNull Modifier padding, float f6, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingElement(f6, f10, f11, f12, true, new b(f6, f10, f11, f12)));
    }

    /* JADX INFO: renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m300paddingqDBjuR0$default(Modifier modifier, float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f11 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f12 = Dp.m4389constructorimpl(0);
        }
        return m299paddingqDBjuR0(modifier, f6, f10, f11, f12);
    }
}

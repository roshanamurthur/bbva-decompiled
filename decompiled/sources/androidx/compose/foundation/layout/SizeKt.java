package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0004\u001a)\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\n\u001a-\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\n\u001aA\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0004\u001a!\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0004\u001a!\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0004\u001a)\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\n\u001a!\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\r\u001a-\u0010$\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\n\u001a-\u0010&\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\n\u001aA\u0010(\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u0019\u001a\u0016\u0010+\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)H\u0007\u001a\u0016\u0010,\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)H\u0007\u001a\u0016\u0010-\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)H\u0007\u001a \u00102\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00101\u001a\u000200H\u0007\u001a \u00104\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010/\u001a\u0002032\b\b\u0002\u00101\u001a\u000200H\u0007\u001a \u00106\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010/\u001a\u0002052\b\b\u0002\u00101\u001a\u000200H\u0007\u001a-\u00108\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00069"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "width", "width-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "height", "height-3ABfNKs", "size", "size-3ABfNKs", "size-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/DpSize;", "size-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "min", VDVideoSelfieConfiguration.MAX, "widthIn-VpY3zN4", "widthIn", "heightIn-VpY3zN4", "heightIn", "minWidth", "minHeight", "maxWidth", "maxHeight", "sizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "sizeIn", "requiredWidth-3ABfNKs", "requiredWidth", "requiredHeight-3ABfNKs", "requiredHeight", "requiredSize-3ABfNKs", "requiredSize", "requiredSize-VpY3zN4", "requiredSize-6HolHcs", "requiredWidthIn-VpY3zN4", "requiredWidthIn", "requiredHeightIn-VpY3zN4", "requiredHeightIn", "requiredSizeIn-qDBjuR0", "requiredSizeIn", "", "fraction", "fillMaxWidth", "fillMaxHeight", "fillMaxSize", "Landroidx/compose/ui/Alignment$Horizontal;", "align", "", "unbounded", "wrapContentWidth", "Landroidx/compose/ui/Alignment$Vertical;", "wrapContentHeight", "Landroidx/compose/ui/Alignment;", "wrapContentSize", "defaultMinSize-VpY3zN4", "defaultMinSize", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1110:1\n135#2:1111\n135#2:1112\n135#2:1113\n135#2:1114\n135#2:1115\n135#2:1116\n135#2:1117\n135#2:1118\n135#2:1119\n135#2:1120\n135#2:1121\n135#2:1122\n135#2:1123\n135#2:1124\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n60#1:1111\n84#1:1112\n110#1:1113\n137#1:1114\n175#1:1115\n198#1:1116\n225#1:1117\n256#1:1118\n284#1:1119\n314#1:1120\n341#1:1121\n380#1:1122\n404#1:1123\n433#1:1124\n*E\n"})
public final class SizeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final FillElement f4370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final FillElement f4371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final FillElement f4372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final WrapContentElement f4373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final WrapContentElement f4374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final WrapContentElement f4375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final WrapContentElement f4376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final WrapContentElement f4377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final WrapContentElement f4378i;

    static {
        FillElement.Companion companion = FillElement.f4242e;
        f4370a = companion.width(1.0f);
        f4371b = companion.height(1.0f);
        f4372c = companion.size(1.0f);
        WrapContentElement.Companion companion2 = WrapContentElement.f4474g;
        Alignment.Companion companion3 = Alignment.INSTANCE;
        f4373d = companion2.width(companion3.getCenterHorizontally(), false);
        f4374e = companion2.width(companion3.getStart(), false);
        f4375f = companion2.height(companion3.getCenterVertically(), false);
        f4376g = companion2.height(companion3.getTop(), false);
        f4377h = companion2.size(companion3.getCenter(), false);
        f4378i = companion2.size(companion3.getTopStart(), false);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m319defaultMinSizeVpY3zN4(@NotNull Modifier defaultMinSize, float f6, float f10) {
        Intrinsics.checkNotNullParameter(defaultMinSize, "$this$defaultMinSize");
        return defaultMinSize.then(new UnspecifiedConstraintsElement(f6, f10));
    }

    /* JADX INFO: renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m320defaultMinSizeVpY3zN4$default(Modifier modifier, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        return m319defaultMinSizeVpY3zN4(modifier, f6, f10);
    }

    @Stable
    @NotNull
    public static final Modifier fillMaxHeight(@NotNull Modifier modifier, float f6) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(f6 == 1.0f ? f4371b : FillElement.f4242e.height(f6));
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = 1.0f;
        }
        return fillMaxHeight(modifier, f6);
    }

    @Stable
    @NotNull
    public static final Modifier fillMaxSize(@NotNull Modifier modifier, float f6) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(f6 == 1.0f ? f4372c : FillElement.f4242e.size(f6));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = 1.0f;
        }
        return fillMaxSize(modifier, f6);
    }

    @Stable
    @NotNull
    public static final Modifier fillMaxWidth(@NotNull Modifier modifier, float f6) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(f6 == 1.0f ? f4370a : FillElement.f4242e.width(f6));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = 1.0f;
        }
        return fillMaxWidth(modifier, f6);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: height-3ABfNKs, reason: not valid java name */
    public static final Modifier m321height3ABfNKs(@NotNull Modifier height, final float f6) {
        Intrinsics.checkNotNullParameter(height, "$this$height");
        return height.then(new SizeElement(0.0f, f6, 0.0f, f6, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("height");
                inspectorInfo.setValue(Dp.m4387boximpl(f6));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m322heightInVpY3zN4(@NotNull Modifier heightIn, final float f6, final float f10) {
        Intrinsics.checkNotNullParameter(heightIn, "$this$heightIn");
        return heightIn.then(new SizeElement(0.0f, f6, 0.0f, f10, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.b(f6, androidx.activity.a.c(inspectorInfo, "$this$null", "heightIn"), "min", inspectorInfo).set(VDVideoSelfieConfiguration.MAX, Dp.m4387boximpl(f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5));
    }

    /* JADX INFO: renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m323heightInVpY3zN4$default(Modifier modifier, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        return m322heightInVpY3zN4(modifier, f6, f10);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final Modifier m324requiredHeight3ABfNKs(@NotNull Modifier requiredHeight, final float f6) {
        Intrinsics.checkNotNullParameter(requiredHeight, "$this$requiredHeight");
        return requiredHeight.then(new SizeElement(0.0f, f6, 0.0f, f6, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("requiredHeight");
                inspectorInfo.setValue(Dp.m4387boximpl(f6));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredHeightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m325requiredHeightInVpY3zN4(@NotNull Modifier requiredHeightIn, final float f6, final float f10) {
        Intrinsics.checkNotNullParameter(requiredHeightIn, "$this$requiredHeightIn");
        return requiredHeightIn.then(new SizeElement(0.0f, f6, 0.0f, f10, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.b(f6, androidx.activity.a.c(inspectorInfo, "$this$null", "requiredHeightIn"), "min", inspectorInfo).set(VDVideoSelfieConfiguration.MAX, Dp.m4387boximpl(f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5));
    }

    /* JADX INFO: renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m326requiredHeightInVpY3zN4$default(Modifier modifier, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        return m325requiredHeightInVpY3zN4(modifier, f6, f10);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final Modifier m327requiredSize3ABfNKs(@NotNull Modifier requiredSize, final float f6) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return requiredSize.then(new SizeElement(f6, f6, f6, f6, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("requiredSize");
                inspectorInfo.setValue(Dp.m4387boximpl(f6));
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredSize-6HolHcs, reason: not valid java name */
    public static final Modifier m328requiredSize6HolHcs(@NotNull Modifier requiredSize, long j10) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return m329requiredSizeVpY3zN4(requiredSize, DpSize.m4487getWidthD9Ej5fM(j10), DpSize.m4485getHeightD9Ej5fM(j10));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m329requiredSizeVpY3zN4(@NotNull Modifier requiredSize, final float f6, final float f10) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return requiredSize.then(new SizeElement(f6, f10, f6, f10, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.b(f6, androidx.activity.a.c(inspectorInfo, "$this$null", "requiredSize"), "width", inspectorInfo).set("height", Dp.m4387boximpl(f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m330requiredSizeInqDBjuR0(@NotNull Modifier requiredSizeIn, final float f6, final float f10, final float f11, final float f12) {
        Intrinsics.checkNotNullParameter(requiredSizeIn, "$this$requiredSizeIn");
        return requiredSizeIn.then(new SizeElement(f6, f10, f11, f12, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.b(f11, androidx.activity.a.b(f10, androidx.activity.a.b(f6, androidx.activity.a.c(inspectorInfo, "$this$null", "requiredSizeIn"), "minWidth", inspectorInfo), "minHeight", inspectorInfo), "maxWidth", inspectorInfo).set("maxHeight", Dp.m4387boximpl(f12));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX INFO: renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m331requiredSizeInqDBjuR0$default(Modifier modifier, float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            f11 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 8) != 0) {
            f12 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        return m330requiredSizeInqDBjuR0(modifier, f6, f10, f11, f12);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final Modifier m332requiredWidth3ABfNKs(@NotNull Modifier requiredWidth, final float f6) {
        Intrinsics.checkNotNullParameter(requiredWidth, "$this$requiredWidth");
        return requiredWidth.then(new SizeElement(f6, 0.0f, f6, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("requiredWidth");
                inspectorInfo.setValue(Dp.m4387boximpl(f6));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredWidthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m333requiredWidthInVpY3zN4(@NotNull Modifier requiredWidthIn, final float f6, final float f10) {
        Intrinsics.checkNotNullParameter(requiredWidthIn, "$this$requiredWidthIn");
        return requiredWidthIn.then(new SizeElement(f6, 0.0f, f10, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.b(f6, androidx.activity.a.c(inspectorInfo, "$this$null", "requiredWidthIn"), "min", inspectorInfo).set(VDVideoSelfieConfiguration.MAX, Dp.m4387boximpl(f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10));
    }

    /* JADX INFO: renamed from: requiredWidthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m334requiredWidthInVpY3zN4$default(Modifier modifier, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        return m333requiredWidthInVpY3zN4(modifier, f6, f10);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: size-3ABfNKs, reason: not valid java name */
    public static final Modifier m335size3ABfNKs(@NotNull Modifier size, final float f6) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return size.then(new SizeElement(f6, f6, f6, f6, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("size");
                inspectorInfo.setValue(Dp.m4387boximpl(f6));
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: size-6HolHcs, reason: not valid java name */
    public static final Modifier m336size6HolHcs(@NotNull Modifier size, long j10) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return m337sizeVpY3zN4(size, DpSize.m4487getWidthD9Ej5fM(j10), DpSize.m4485getHeightD9Ej5fM(j10));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: size-VpY3zN4, reason: not valid java name */
    public static final Modifier m337sizeVpY3zN4(@NotNull Modifier size, final float f6, final float f10) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return size.then(new SizeElement(f6, f10, f6, f10, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.b(f6, androidx.activity.a.c(inspectorInfo, "$this$null", "size"), "width", inspectorInfo).set("height", Dp.m4387boximpl(f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m338sizeInqDBjuR0(@NotNull Modifier sizeIn, final float f6, final float f10, final float f11, final float f12) {
        Intrinsics.checkNotNullParameter(sizeIn, "$this$sizeIn");
        return sizeIn.then(new SizeElement(f6, f10, f11, f12, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.b(f11, androidx.activity.a.b(f10, androidx.activity.a.b(f6, androidx.activity.a.c(inspectorInfo, "$this$null", "sizeIn"), "minWidth", inspectorInfo), "minHeight", inspectorInfo), "maxWidth", inspectorInfo).set("maxHeight", Dp.m4387boximpl(f12));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX INFO: renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m339sizeInqDBjuR0$default(Modifier modifier, float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            f11 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 8) != 0) {
            f12 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        return m338sizeInqDBjuR0(modifier, f6, f10, f11, f12);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: width-3ABfNKs, reason: not valid java name */
    public static final Modifier m340width3ABfNKs(@NotNull Modifier width, final float f6) {
        Intrinsics.checkNotNullParameter(width, "$this$width");
        return width.then(new SizeElement(f6, 0.0f, f6, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("width");
                inspectorInfo.setValue(Dp.m4387boximpl(f6));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m341widthInVpY3zN4(@NotNull Modifier widthIn, final float f6, final float f10) {
        Intrinsics.checkNotNullParameter(widthIn, "$this$widthIn");
        return widthIn.then(new SizeElement(f6, 0.0f, f10, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.b(f6, androidx.activity.a.c(inspectorInfo, "$this$null", "widthIn"), "min", inspectorInfo).set(VDVideoSelfieConfiguration.MAX, Dp.m4387boximpl(f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10));
    }

    /* JADX INFO: renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m342widthInVpY3zN4$default(Modifier modifier, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.INSTANCE.m4409getUnspecifiedD9Ej5fM();
        }
        return m341widthInVpY3zN4(modifier, f6, f10);
    }

    @Stable
    @NotNull
    public static final Modifier wrapContentHeight(@NotNull Modifier modifier, @NotNull Alignment.Vertical align, boolean z10) {
        WrapContentElement wrapContentElementHeight;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.INSTANCE;
        if (!Intrinsics.areEqual(align, companion.getCenterVertically()) || z10) {
            wrapContentElementHeight = (!Intrinsics.areEqual(align, companion.getTop()) || z10) ? WrapContentElement.f4474g.height(align, z10) : f4376g;
        } else {
            wrapContentElementHeight = f4375f;
        }
        return modifier.then(wrapContentElementHeight);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            vertical = Alignment.INSTANCE.getCenterVertically();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return wrapContentHeight(modifier, vertical, z10);
    }

    @Stable
    @NotNull
    public static final Modifier wrapContentSize(@NotNull Modifier modifier, @NotNull Alignment align, boolean z10) {
        WrapContentElement size;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.INSTANCE;
        if (!Intrinsics.areEqual(align, companion.getCenter()) || z10) {
            size = (!Intrinsics.areEqual(align, companion.getTopStart()) || z10) ? WrapContentElement.f4474g.size(align, z10) : f4378i;
        } else {
            size = f4377h;
        }
        return modifier.then(size);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            alignment = Alignment.INSTANCE.getCenter();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return wrapContentSize(modifier, alignment, z10);
    }

    @Stable
    @NotNull
    public static final Modifier wrapContentWidth(@NotNull Modifier modifier, @NotNull Alignment.Horizontal align, boolean z10) {
        WrapContentElement wrapContentElementWidth;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.INSTANCE;
        if (!Intrinsics.areEqual(align, companion.getCenterHorizontally()) || z10) {
            wrapContentElementWidth = (!Intrinsics.areEqual(align, companion.getStart()) || z10) ? WrapContentElement.f4474g.width(align, z10) : f4374e;
        } else {
            wrapContentElementWidth = f4373d;
        }
        return modifier.then(wrapContentElementWidth);
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            horizontal = Alignment.INSTANCE.getCenterHorizontally();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return wrapContentWidth(modifier, horizontal, z10);
    }
}

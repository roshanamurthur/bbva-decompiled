package androidx.compose.material.pullrefresh;

import androidx.activity.a;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import j0.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PullRefresh.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001at\u0010\u0000\u001a\u00020\u0001*\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u000321\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"pullRefresh", "Landroidx/compose/ui/Modifier;", "onPull", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "pullDelta", "onRelease", "Lkotlin/Function2;", "flingVelocity", "Lkotlin/coroutines/Continuation;", "", "enabled", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPullRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,119:1\n135#2:120\n146#2:121\n135#2:122\n146#2:123\n*S KotlinDebug\n*F\n+ 1 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n*L\n47#1:120\n47#1:121\n82#1:122\n82#1:123\n*E\n"})
public final class PullRefreshKt {

    /* JADX INFO: compiled from: PullRefresh.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Float, Float> {
        public a(Object obj) {
            super(1, obj, PullRefreshState.class, "onPull", "onPull$material_release(F)F", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f6) {
            return Float.valueOf(((PullRefreshState) this.receiver).onPull$material_release(f6.floatValue()));
        }
    }

    /* JADX INFO: compiled from: PullRefresh.kt */
    public /* synthetic */ class b extends AdaptedFunctionReference implements Function2<Float, Continuation<? super Float>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Float f6, Continuation<? super Float> continuation) {
            return PullRefreshKt.access$pullRefresh$lambda$1$onRelease((PullRefreshState) this.receiver, f6.floatValue(), continuation);
        }
    }

    public static final /* synthetic */ Object access$pullRefresh$lambda$1$onRelease(PullRefreshState pullRefreshState, float f6, Continuation continuation) {
        return Boxing.boxFloat(pullRefreshState.onRelease$material_release(f6));
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final Modifier pullRefresh(@NotNull Modifier modifier, @NotNull final PullRefreshState state, final boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                a.c(inspectorInfo, "$this$null", "pullRefresh").set("state", state);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("enabled", Boolean.valueOf(z10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), pullRefresh(Modifier.INSTANCE, new a(state), new b(2, state, PullRefreshState.class, "onRelease", "onRelease$material_release(F)F", 4), z10));
    }

    public static /* synthetic */ Modifier pullRefresh$default(Modifier modifier, PullRefreshState pullRefreshState, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return pullRefresh(modifier, pullRefreshState, z10);
    }

    public static /* synthetic */ Modifier pullRefresh$default(Modifier modifier, Function1 function1, Function2 function2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return pullRefresh(modifier, function1, function2, z10);
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final Modifier pullRefresh(@NotNull Modifier modifier, @NotNull final Function1<? super Float, Float> onPull, @NotNull final Function2<? super Float, ? super Continuation<? super Float>, ? extends Object> onRelease, final boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onPull, "onPull");
        Intrinsics.checkNotNullParameter(onRelease, "onRelease");
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                a.c(inspectorInfo, "$this$null", "pullRefresh").set("onPull", onPull);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onRelease", onRelease);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("enabled", Boolean.valueOf(z10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, new f(onPull, onRelease, z10), null, 2, null));
    }
}

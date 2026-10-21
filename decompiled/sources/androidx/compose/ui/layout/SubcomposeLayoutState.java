package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,B\t\b\u0016¢\u0006\u0004\b+\u0010\u000bB\u0011\b\u0017\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b+\u0010/J*\u0010\b\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000bR1\u0010\u0016\u001a\u0019\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R1\u0010\u001a\u001a\u0019\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015RK\u0010 \u001a0\u0012\u0004\u0012\u00020\u0010\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u000f¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u00118\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015RK\u0010$\u001a0\u0012\u0004\u0012\u00020\u0010\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u000f¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u00118\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\u001a\u0010&\u001a\u00020%8GX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u000b\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState;", "", "slotId", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "forceRecomposeChildren$ui_release", "()V", "forceRecomposeChildren", "disposeCurrentNodes$ui_release", "disposeCurrentNodes", "Lkotlin/Function2;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/ExtensionFunctionType;", "c", "Lkotlin/jvm/functions/Function2;", "getSetRoot$ui_release", "()Lkotlin/jvm/functions/Function2;", "setRoot", "Landroidx/compose/runtime/CompositionContext;", "d", "getSetCompositionContext$ui_release", "setCompositionContext", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "e", "getSetMeasurePolicy$ui_release", "setMeasurePolicy", "Landroidx/compose/ui/layout/SubcomposeIntermediateMeasureScope;", "f", "getSetIntermediateMeasurePolicy$ui_release", "setIntermediateMeasurePolicy", "", "isInLookaheadScope", "()Z", "isInLookaheadScope$annotations", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "", "maxSlotsToRetainForReuse", "(I)V", "PrecomposedSlotHandle", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class SubcomposeLayoutState {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SubcomposeSlotReusePolicy f16688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public LayoutNodeSubcompositionsState f16689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f16690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f16691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final c f16692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final b f16693f;

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J%\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "", "placeablesCount", "", "getPlaceablesCount", "()I", "dispose", "", "premeasure", FirebaseAnalytics.Param.INDEX, "constraints", "Landroidx/compose/ui/unit/Constraints;", "premeasure-0kLqBqw", "(IJ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PrecomposedSlotHandle {
        void dispose();

        int getPlaceablesCount();

        /* JADX INFO: renamed from: premeasure-0kLqBqw */
        void mo3590premeasure0kLqBqw(int index, long constraints);
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class a extends Lambda implements Function2<LayoutNode, CompositionContext, Unit> {
        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, CompositionContext compositionContext) {
            CompositionContext it = compositionContext;
            Intrinsics.checkNotNullParameter(layoutNode, "$this$null");
            Intrinsics.checkNotNullParameter(it, "it");
            SubcomposeLayoutState.this.a().setCompositionContext(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class b extends Lambda implements Function2<LayoutNode, Function2<? super SubcomposeIntermediateMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> {
        public b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, Function2<? super SubcomposeIntermediateMeasureScope, ? super Constraints, ? extends MeasureResult> function2) {
            Function2<? super SubcomposeIntermediateMeasureScope, ? super Constraints, ? extends MeasureResult> it = function2;
            Intrinsics.checkNotNullParameter(layoutNode, "$this$null");
            Intrinsics.checkNotNullParameter(it, "it");
            SubcomposeLayoutState.this.a().setIntermediateMeasurePolicy$ui_release(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class c extends Lambda implements Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> {
        public c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function2) {
            LayoutNode layoutNode2 = layoutNode;
            Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> it = function2;
            Intrinsics.checkNotNullParameter(layoutNode2, "$this$null");
            Intrinsics.checkNotNullParameter(it, "it");
            layoutNode2.setMeasurePolicy(SubcomposeLayoutState.this.a().createMeasurePolicy(it));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class d extends Lambda implements Function2<LayoutNode, SubcomposeLayoutState, Unit> {
        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
            LayoutNode layoutNode2 = layoutNode;
            SubcomposeLayoutState it = subcomposeLayoutState;
            Intrinsics.checkNotNullParameter(layoutNode2, "$this$null");
            Intrinsics.checkNotNullParameter(it, "it");
            LayoutNodeSubcompositionsState subcompositionsState = layoutNode2.getSubcompositionsState();
            SubcomposeLayoutState subcomposeLayoutState2 = SubcomposeLayoutState.this;
            if (subcompositionsState == null) {
                subcompositionsState = new LayoutNodeSubcompositionsState(layoutNode2, subcomposeLayoutState2.f16688a);
                layoutNode2.setSubcompositionsState$ui_release(subcompositionsState);
            }
            subcomposeLayoutState2.f16689b = subcompositionsState;
            subcomposeLayoutState2.a().makeSureStateIsConsistent();
            subcomposeLayoutState2.a().setSlotReusePolicy(subcomposeLayoutState2.f16688a);
            return Unit.INSTANCE;
        }
    }

    public SubcomposeLayoutState(@NotNull SubcomposeSlotReusePolicy slotReusePolicy) {
        Intrinsics.checkNotNullParameter(slotReusePolicy, "slotReusePolicy");
        this.f16688a = slotReusePolicy;
        this.f16690c = new d();
        this.f16691d = new a();
        this.f16692e = new c();
        this.f16693f = new b();
    }

    public final LayoutNodeSubcompositionsState a() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f16689b;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final void disposeCurrentNodes$ui_release() {
        a().disposeCurrentNodes();
    }

    public final void forceRecomposeChildren$ui_release() {
        a().forceRecomposeChildren();
    }

    @NotNull
    public final Function2<LayoutNode, CompositionContext, Unit> getSetCompositionContext$ui_release() {
        return this.f16691d;
    }

    @NotNull
    public final Function2<LayoutNode, Function2<? super SubcomposeIntermediateMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> getSetIntermediateMeasurePolicy$ui_release() {
        return this.f16693f;
    }

    @NotNull
    public final Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> getSetMeasurePolicy$ui_release() {
        return this.f16692e;
    }

    @NotNull
    public final Function2<LayoutNode, SubcomposeLayoutState, Unit> getSetRoot$ui_release() {
        return this.f16690c;
    }

    @ExperimentalComposeUiApi
    public final boolean isInLookaheadScope() {
        return a().isInLookaheadScope();
    }

    @NotNull
    public final PrecomposedSlotHandle precompose(@Nullable Object slotId, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return a().precompose(slotId, content);
    }

    public SubcomposeLayoutState() {
        this(e.f16711a);
    }

    @Deprecated(message = "This constructor is deprecated", replaceWith = @ReplaceWith(expression = "SubcomposeLayoutState(SubcomposeSlotReusePolicy(maxSlotsToRetainForReuse))", imports = {"androidx.compose.ui.layout.SubcomposeSlotReusePolicy"}))
    public SubcomposeLayoutState(int i10) {
        this(SubcomposeLayoutKt.SubcomposeSlotReusePolicy(i10));
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void isInLookaheadScope$annotations() {
    }
}

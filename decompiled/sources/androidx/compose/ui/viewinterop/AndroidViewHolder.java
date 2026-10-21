package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.core.c0;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B:\u0012\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001\u0012\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u0001\u0012\u0007\u0010\u0092\u0001\u001a\u00020\u000b\u0012\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001\u0012\u0006\u0010E\u001a\u00020\u0004¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0014J\u0006\u0010\u000f\u001a\u00020\u0007J0\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0014J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0014J\b\u0010\u001c\u001a\u00020\u0007H\u0014J\u001e\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0018\u0010%\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0016J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u000bH\u0014J\u0012\u0010*\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010(H\u0016J\b\u0010+\u001a\u00020\u0010H\u0016J(\u0010.\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000bH\u0016J\b\u0010/\u001a\u00020\u000bH\u0016J(\u00100\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000bH\u0016J\u0018\u00101\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u000bH\u0016J@\u00107\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u001dH\u0016J8\u00107\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000bH\u0016J0\u0010:\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u000bH\u0016J(\u0010>\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0006\u00106\u001a\u00020\u0010H\u0016J \u0010?\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;H\u0016J\b\u0010@\u001a\u00020\u0010H\u0016R\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR6\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00070F2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070F8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR6\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00070F2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00070F8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010I\u001a\u0004\bQ\u0010K\"\u0004\bR\u0010MR6\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00070F2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00070F8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010I\u001a\u0004\bU\u0010K\"\u0004\bV\u0010MR*\u0010_\u001a\u00020X2\u0006\u0010G\u001a\u00020X8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R0\u0010g\u001a\u0010\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u0007\u0018\u00010`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR*\u0010o\u001a\u00020h2\u0006\u0010G\u001a\u00020h8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR0\u0010s\u001a\u0010\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u0007\u0018\u00010`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bp\u0010b\u001a\u0004\bq\u0010d\"\u0004\br\u0010fR.\u0010{\u001a\u0004\u0018\u00010t2\b\u0010G\u001a\u0004\u0018\u00010t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR2\u0010\u0083\u0001\u001a\u0004\u0018\u00010|2\b\u0010G\u001a\u0004\u0018\u00010|8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R4\u0010\u0087\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010`8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010b\u001a\u0005\b\u0085\u0001\u0010d\"\u0005\b\u0086\u0001\u0010fR\u001d\u0010\u008d\u0001\u001a\u00030\u0088\u00018\u0006¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u0097\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "", "onReuse", "onDeactivate", "onRelease", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "remeasure", "", "changed", "l", "t", "r", "b", "onLayout", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "disallowIntercept", "requestDisallowInterceptTouchEvent", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "child", "target", "onDescendantInvalidated", "visibility", "onWindowVisibilityChanged", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "shouldDelayChildPressedState", "axes", "type", "onStartNestedScroll", "getNestedScrollAxes", "onNestedScrollAccepted", "onStopNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "onNestedScroll", "dx", "dy", "onNestedPreScroll", "", "velocityX", "velocityY", "onNestedFling", "onNestedPreFling", "isNestedScrollingEnabled", "q0", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lkotlin/Function0;", "value", "r0", "Lkotlin/jvm/functions/Function0;", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "update", "<set-?>", "t0", "getReset", "setReset", "reset", "u0", "getRelease", "setRelease", "release", "Landroidx/compose/ui/Modifier;", "v0", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "modifier", "Lkotlin/Function1;", "w0", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "Landroidx/compose/ui/unit/Density;", "x0", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density", "y0", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Landroidx/lifecycle/LifecycleOwner;", "E0", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "F0", "Landroidx/savedstate/SavedStateRegistryOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "savedStateRegistryOwner", "J0", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "Landroidx/compose/ui/node/LayoutNode;", "O0", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroid/content/Context;", "context", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "compositeKeyHash", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback {

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @Nullable
    public LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @Nullable
    public SavedStateRegistryOwner savedStateRegistryOwner;

    @NotNull
    public final SnapshotStateObserver G0;

    @NotNull
    public final h H0;

    @NotNull
    public final m I0;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @Nullable
    public Function1<? super Boolean, Unit> onRequestDisallowInterceptTouchEvent;

    @NotNull
    public final int[] K0;
    public int L0;
    public int M0;

    @NotNull
    public final NestedScrollingParentHelper N0;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @NotNull
    public final LayoutNode layoutNode;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NestedScrollDispatcher f18329p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final View view;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> update;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f18332s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> reset;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> release;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public Modifier modifier;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Modifier, Unit> onModifierChanged;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Density density;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Density, Unit> onDensityChanged;

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    public static final class a extends Lambda implements Function1<Modifier, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f18338p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f18339q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LayoutNode layoutNode, Modifier modifier) {
            super(1);
            this.f18338p0 = layoutNode;
            this.f18339q0 = modifier;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Modifier modifier) {
            Modifier it = modifier;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f18338p0.setModifier(it.then(this.f18339q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    public static final class b extends Lambda implements Function1<Density, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f18340p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LayoutNode layoutNode) {
            super(1);
            this.f18340p0 = layoutNode;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Density density) {
            Density it = density;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f18340p0.setDensity(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    public static final class c extends Lambda implements Function1<Owner, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f18342q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LayoutNode layoutNode) {
            super(1);
            this.f18342q0 = layoutNode;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Owner owner) {
            Owner owner2 = owner;
            Intrinsics.checkNotNullParameter(owner2, "owner");
            AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            if (androidComposeView != null) {
                androidComposeView.addAndroidView(androidViewHolder, this.f18342q0);
            }
            if (androidViewHolder.getView().getParent() != androidViewHolder) {
                androidViewHolder.addView(androidViewHolder.getView());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    public static final class d extends Lambda implements Function1<Owner, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Owner owner) {
            Owner owner2 = owner;
            Intrinsics.checkNotNullParameter(owner2, "owner");
            AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            if (androidComposeView != null) {
                androidComposeView.removeAndroidView(androidViewHolder);
            }
            androidViewHolder.removeAllViewsInLayout();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    public static final class e extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f18344p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    @SourceDebugExtension({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,572:1\n245#2:573\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2\n*L\n318#1:573\n*E\n"})
    public static final class f extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f18345p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AndroidViewHolder f18346q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
            super(1);
            this.f18345p0 = layoutNode;
            this.f18346q0 = androidViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope drawBehind = drawScope;
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            Canvas canvas = drawBehind.getDrawContext().getCanvas();
            Owner owner = this.f18345p0.getOwner();
            AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
            if (androidComposeView != null) {
                androidComposeView.drawAndroidView(this.f18346q0, AndroidCanvas_androidKt.getNativeCanvas(canvas));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    public static final class g extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f18348q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(LayoutNode layoutNode) {
            super(1);
            this.f18348q0 = layoutNode;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidViewHolder_androidKt.access$layoutAccordingTo(AndroidViewHolder.this, this.f18348q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    public static final class h extends Lambda implements Function1<AndroidViewHolder, Unit> {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AndroidViewHolder androidViewHolder) {
            AndroidViewHolder it = androidViewHolder;
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
            androidViewHolder2.getHandler().post(new androidx.compose.ui.platform.g(1, androidViewHolder2.I0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY, 527}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f18350p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f18351q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ AndroidViewHolder f18352r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f18353s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z10, AndroidViewHolder androidViewHolder, long j10, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f18351q0 = z10;
            this.f18352r0 = androidViewHolder;
            this.f18353s0 = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.f18351q0, this.f18352r0, this.f18353s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f18350p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z10 = this.f18351q0;
                AndroidViewHolder androidViewHolder = this.f18352r0;
                if (z10) {
                    NestedScrollDispatcher nestedScrollDispatcher = androidViewHolder.f18329p0;
                    long j10 = this.f18353s0;
                    long jM4625getZero9UxMQ8M = Velocity.INSTANCE.m4625getZero9UxMQ8M();
                    this.f18350p0 = 2;
                    if (nestedScrollDispatcher.m3380dispatchPostFlingRZ2iAVY(j10, jM4625getZero9UxMQ8M, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    NestedScrollDispatcher nestedScrollDispatcher2 = androidViewHolder.f18329p0;
                    long jM4625getZero9UxMQ8M2 = Velocity.INSTANCE.m4625getZero9UxMQ8M();
                    long j11 = this.f18353s0;
                    this.f18350p0 = 1;
                    if (nestedScrollDispatcher2.m3380dispatchPostFlingRZ2iAVY(jM4625getZero9UxMQ8M2, j11, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {540}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f18354p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f18356r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j10, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f18356r0 = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AndroidViewHolder.this.new j(this.f18356r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f18354p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                NestedScrollDispatcher nestedScrollDispatcher = AndroidViewHolder.this.f18329p0;
                this.f18354p0 = 1;
                if (nestedScrollDispatcher.m3382dispatchPreFlingQWom1Mo(this.f18356r0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    public static final class k extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final k f18357p0 = new k(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    public static final class l extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l f18358p0 = new l(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    public static final class m extends Lambda implements Function0<Unit> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            if (androidViewHolder.f18332s0) {
                androidViewHolder.G0.observeReads(androidViewHolder, androidViewHolder.H0, androidViewHolder.getUpdate());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    public static final class n extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
        public n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function0<? extends Unit> function0) {
            Function0<? extends Unit> command = function0;
            Intrinsics.checkNotNullParameter(command, "command");
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            if (androidViewHolder.getHandler().getLooper() == Looper.myLooper()) {
                command.invoke();
            } else {
                androidViewHolder.getHandler().post(new c0(command, 1));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    public static final class o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f18366p0 = new o(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidViewHolder(@NotNull Context context, @Nullable CompositionContext compositionContext, int i10, @NotNull NestedScrollDispatcher dispatcher, @NotNull View view) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f18329p0 = dispatcher;
        this.view = view;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.update = o.f18366p0;
        this.reset = l.f18358p0;
        this.release = k.f18357p0;
        Modifier.Companion companion = Modifier.INSTANCE;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.G0 = new SnapshotStateObserver(new n());
        this.H0 = new h();
        this.I0 = new m();
        this.K0 = new int[2];
        this.L0 = Integer.MIN_VALUE;
        this.M0 = Integer.MIN_VALUE;
        this.N0 = new NestedScrollingParentHelper(this);
        Object[] objArr = 0 == true ? 1 : 0;
        final LayoutNode layoutNode = new LayoutNode(false, objArr, 3, null);
        layoutNode.setInteropViewFactoryHolder$ui_release(this);
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(companion, AndroidViewHolder_androidKt.f18367a, dispatcher), true, e.f18344p0), this), new f(this, layoutNode)), new g(layoutNode));
        layoutNode.setCompositeKeyHash(i10);
        layoutNode.setModifier(this.modifier.then(modifierOnGloballyPositioned));
        this.onModifierChanged = new a(layoutNode, modifierOnGloballyPositioned);
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new b(layoutNode);
        layoutNode.setOnAttach$ui_release(new c(layoutNode));
        layoutNode.setOnDetach$ui_release(new d());
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5

            /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
            public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public static final a f18361p0 = new a(1);

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope layout = placementScope;
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
            public static final class b extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ AndroidViewHolder f18362p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ LayoutNode f18363q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
                    super(1);
                    this.f18362p0 = androidViewHolder;
                    this.f18363q0 = layoutNode;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope layout = placementScope;
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    AndroidViewHolder_androidKt.access$layoutAccordingTo(this.f18362p0, this.f18363q0);
                    return Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                AndroidViewHolder androidViewHolder = this.f18359a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder.measure(AndroidViewHolder.access$obtainMeasureSpec(androidViewHolder, 0, i11, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return androidViewHolder.getMeasuredHeight();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder = this.f18359a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, AndroidViewHolder.access$obtainMeasureSpec(androidViewHolder, 0, i11, layoutParams.height));
                return androidViewHolder.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo113measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                AndroidViewHolder androidViewHolder = this.f18359a;
                if (androidViewHolder.getChildCount() == 0) {
                    return MeasureScope.CC.q(measure, Constraints.m4359getMinWidthimpl(j10), Constraints.m4358getMinHeightimpl(j10), null, a.f18361p0, 4, null);
                }
                if (Constraints.m4359getMinWidthimpl(j10) != 0) {
                    androidViewHolder.getChildAt(0).setMinimumWidth(Constraints.m4359getMinWidthimpl(j10));
                }
                if (Constraints.m4358getMinHeightimpl(j10) != 0) {
                    androidViewHolder.getChildAt(0).setMinimumHeight(Constraints.m4358getMinHeightimpl(j10));
                }
                int iM4359getMinWidthimpl = Constraints.m4359getMinWidthimpl(j10);
                int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(j10);
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                int iAccess$obtainMeasureSpec = AndroidViewHolder.access$obtainMeasureSpec(androidViewHolder, iM4359getMinWidthimpl, iM4357getMaxWidthimpl, layoutParams.width);
                int iM4358getMinHeightimpl = Constraints.m4358getMinHeightimpl(j10);
                int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(j10);
                ViewGroup.LayoutParams layoutParams2 = androidViewHolder.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2);
                androidViewHolder.measure(iAccess$obtainMeasureSpec, AndroidViewHolder.access$obtainMeasureSpec(androidViewHolder, iM4358getMinHeightimpl, iM4356getMaxHeightimpl, layoutParams2.height));
                return MeasureScope.CC.q(measure, androidViewHolder.getMeasuredWidth(), androidViewHolder.getMeasuredHeight(), null, new b(androidViewHolder, layoutNode), 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                AndroidViewHolder androidViewHolder = this.f18359a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder.measure(AndroidViewHolder.access$obtainMeasureSpec(androidViewHolder, 0, i11, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return androidViewHolder.getMeasuredHeight();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder = this.f18359a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, AndroidViewHolder.access$obtainMeasureSpec(androidViewHolder, 0, i11, layoutParams.height));
                return androidViewHolder.getMeasuredWidth();
            }
        });
        this.layoutNode = layoutNode;
    }

    public static final int access$obtainMeasureSpec(AndroidViewHolder androidViewHolder, int i10, int i11, int i12) {
        androidViewHolder.getClass();
        if (i12 >= 0 || i10 == i11) {
            return View.MeasureSpec.makeMeasureSpec(kotlin.ranges.c.coerceIn(i12, i10, i11), 1073741824);
        }
        if (i12 != -2 || i11 == Integer.MAX_VALUE) {
            return (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(@Nullable Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.K0;
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], getWidth() + i10, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @Nullable
    /* JADX INFO: renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    @Nullable
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Nullable
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.N0.getNestedScrollAxes();
    }

    @Nullable
    public final Function1<Density, Unit> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    @Nullable
    public final Function1<Modifier, Unit> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    @NotNull
    public final Function0<Unit> getRelease() {
        return this.release;
    }

    @NotNull
    public final Function0<Unit> getReset() {
        return this.reset;
    }

    @Nullable
    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    @NotNull
    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @Nullable
    public ViewParent invalidateChildInParent(@Nullable int[] location, @Nullable Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        this.layoutNode.invalidateLayer$ui_release();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G0.start();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(@NotNull View child, @NotNull View target) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        super.onDescendantInvalidated(child, target);
        this.layoutNode.invalidateLayer$ui_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SnapshotStateObserver snapshotStateObserver = this.G0;
        snapshotStateObserver.stop();
        snapshotStateObserver.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l6, int t10, int r3, int b10) {
        this.view.layout(0, 0, r3 - l6, b10 - t10);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        View view = this.view;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.L0 = widthMeasureSpec;
        this.M0 = heightMeasureSpec;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NotNull View target, float velocityX, float velocityY, boolean consumed) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f18329p0.getCoroutineScope(), null, null, new i(consumed, this, VelocityKt.Velocity(AndroidViewHolder_androidKt.access$toComposeVelocity(velocityX), AndroidViewHolder_androidKt.access$toComposeVelocity(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NotNull View target, float velocityX, float velocityY) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f18329p0.getCoroutineScope(), null, null, new j(VelocityKt.Velocity(AndroidViewHolder_androidKt.access$toComposeVelocity(velocityX), AndroidViewHolder_androidKt.access$toComposeVelocity(velocityY)), null), 3, null);
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NotNull View target, int dx, int dy, @NotNull int[] consumed, int type) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            long jM3383dispatchPreScrollOzD1aCk = this.f18329p0.m3383dispatchPreScrollOzD1aCk(OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(dx), AndroidViewHolder_androidKt.access$toComposeOffset(dy)), AndroidViewHolder_androidKt.access$toNestedScrollSource(type));
            consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2275getXimpl(jM3383dispatchPreScrollOzD1aCk));
            consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2276getYimpl(jM3383dispatchPreScrollOzD1aCk));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NotNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, @NotNull int[] consumed) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            long jM3381dispatchPostScrollDzOQY0M = this.f18329p0.m3381dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(dxConsumed), AndroidViewHolder_androidKt.access$toComposeOffset(dyConsumed)), OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(dxUnconsumed), AndroidViewHolder_androidKt.access$toComposeOffset(dyUnconsumed)), AndroidViewHolder_androidKt.access$toNestedScrollSource(type));
            consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2275getXimpl(jM3381dispatchPostScrollDzOQY0M));
            consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2276getYimpl(jM3381dispatchPostScrollDzOQY0M));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NotNull View child, @NotNull View target, int axes, int type) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        this.N0.onNestedScrollAccepted(child, target, axes, type);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        View view = this.view;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NotNull View child, @NotNull View target, int axes, int type) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NotNull View target, int type) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.N0.onStopNestedScroll(target, type);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    public final void remeasure() {
        int i10;
        int i11 = this.L0;
        if (i11 == Integer.MIN_VALUE || (i10 = this.M0) == Integer.MIN_VALUE) {
            return;
        }
        measure(i11, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        Function1<? super Boolean, Unit> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void setDensity(@NotNull Density value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != this.density) {
            this.density = value;
            Function1<? super Density, Unit> function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(value);
            }
        }
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(@NotNull Modifier value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != this.modifier) {
            this.modifier = value;
            Function1<? super Modifier, Unit> function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(value);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@Nullable Function1<? super Density, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui_release(@Nullable Function1<? super Modifier, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    public final void setRelease(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.release = function0;
    }

    public final void setReset(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.reset = function0;
    }

    public final void setSavedStateRegistryOwner(@Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    public final void setUpdate(@NotNull Function0<Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.update = value;
        this.f18332s0 = true;
        this.I0.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NotNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (isNestedScrollingEnabled()) {
            this.f18329p0.m3381dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(dxConsumed), AndroidViewHolder_androidKt.access$toComposeOffset(dyConsumed)), OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(dxUnconsumed), AndroidViewHolder_androidKt.access$toComposeOffset(dyUnconsumed)), AndroidViewHolder_androidKt.access$toNestedScrollSource(type));
        }
    }
}

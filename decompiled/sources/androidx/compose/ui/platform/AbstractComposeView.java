package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.Owner;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010H\u001a\u00020G\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I\u0012\b\b\u0002\u0010K\u001a\u00020\u000e¢\u0006\u0004\bL\u0010MJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000f\u0010\t\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\b\u0010\r\u001a\u00020\u0004H\u0014J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH\u0004J7\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\b\u0010!\u001a\u00020\u0015H\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0015H\u0016J\u0012\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u000eH\u0016J\"\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000eH\u0016J\u001c\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016J$\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016J$\u0010+\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010)H\u0014J,\u0010+\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020\u0015H\u0014J\b\u0010-\u001a\u00020\u0015H\u0016R(\u00104\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010.8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b0\u00101\"\u0004\b2\u00103R(\u00109\u001a\u0004\u0018\u00010\u00022\b\u0010/\u001a\u0004\u0018\u00010\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b5\u00106\"\u0004\b7\u00108R0\u0010B\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00158F@FX\u0087\u000e¢\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b@\u0010A\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020\u00158TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u0010=R\u0011\u0010F\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bE\u0010=¨\u0006N"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/runtime/CompositionContext;", "parent", "", "setParentCompositionContext", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "strategy", "setViewCompositionStrategy", "Content", "(Landroidx/compose/runtime/Composer;I)V", "createComposition", "disposeComposition", "onAttachedToWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "internalOnMeasure$ui_release", "(II)V", "internalOnMeasure", "", "changed", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "onLayout", "internalOnLayout$ui_release", "(ZIIII)V", "internalOnLayout", "layoutDirection", "onRtlPropertiesChanged", "isTransitionGroup", "setTransitionGroup", "Landroid/view/View;", "child", "addView", FirebaseAnalytics.Param.INDEX, "width", "height", "Landroid/view/ViewGroup$LayoutParams;", "params", "addViewInLayout", "preventRequestLayout", "shouldDelayChildPressedState", "Landroid/os/IBinder;", "value", "q0", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "s0", "Landroidx/compose/runtime/CompositionContext;", "setParentContext", "(Landroidx/compose/runtime/CompositionContext;)V", "parentContext", "u0", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeView.android.kt\nandroidx/compose/ui/platform/AbstractComposeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,448:1\n1#2:449\n*E\n"})
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public WeakReference<CompositionContext> f16961p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public IBinder previousAttachedWindowToken;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Composition f16963r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CompositionContext parentContext;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f16965t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public boolean showLayoutBounds;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f16967w0;

    /* JADX INFO: compiled from: ComposeView.android.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-656146368, iIntValue, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:250)");
                }
                AbstractComposeView.this.Content(composer2, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbstractComposeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setParentContext(CompositionContext compositionContext) {
        if (this.parentContext != compositionContext) {
            this.parentContext = compositionContext;
            if (compositionContext != null) {
                this.f16961p0 = null;
            }
            Composition composition = this.f16963r0;
            if (composition != null) {
                composition.dispose();
                this.f16963r0 = null;
                if (isAttachedToWindow()) {
                    b();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.f16961p0 = null;
        }
    }

    @Composable
    @UiComposable
    public abstract void Content(@Nullable Composer composer, int i10);

    public final void a() {
        if (this.v0) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View child) {
        a();
        super.addView(child);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(@Nullable View child, int index, @Nullable ViewGroup.LayoutParams params) {
        a();
        return super.addViewInLayout(child, index, params);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.runtime.CompositionContext] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.runtime.CompositionContext] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.runtime.CompositionContext] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.runtime.Recomposer] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23 */
    public final void b() {
        CompositionContext compositionContext;
        if (this.f16963r0 == null) {
            try {
                this.v0 = true;
                ?? FindViewTreeCompositionContext = this.parentContext;
                if (FindViewTreeCompositionContext == 0) {
                    FindViewTreeCompositionContext = WindowRecomposer_androidKt.findViewTreeCompositionContext(this);
                    if (FindViewTreeCompositionContext != 0) {
                        ?? r4 = (!(FindViewTreeCompositionContext instanceof Recomposer) || ((Recomposer) FindViewTreeCompositionContext).getCurrentState().getValue().compareTo(Recomposer.State.ShuttingDown) > 0) ? FindViewTreeCompositionContext : 0;
                        if (r4 != 0) {
                            this.f16961p0 = new WeakReference<>(r4);
                        }
                    } else {
                        FindViewTreeCompositionContext = 0;
                    }
                    if (FindViewTreeCompositionContext == 0) {
                        WeakReference<CompositionContext> weakReference = this.f16961p0;
                        if (weakReference == null || (compositionContext = weakReference.get()) == null) {
                            FindViewTreeCompositionContext = compositionContext;
                            FindViewTreeCompositionContext = 0;
                        } else if (compositionContext instanceof Recomposer) {
                            if (((Recomposer) compositionContext).getCurrentState().getValue().compareTo(Recomposer.State.ShuttingDown) > 0) {
                                FindViewTreeCompositionContext = compositionContext;
                                FindViewTreeCompositionContext = compositionContext;
                            } else {
                                FindViewTreeCompositionContext = compositionContext;
                                FindViewTreeCompositionContext = 0;
                            }
                        }
                        if (FindViewTreeCompositionContext == 0) {
                            FindViewTreeCompositionContext = WindowRecomposer_androidKt.getWindowRecomposer(this);
                            ?? r3 = (!(FindViewTreeCompositionContext instanceof Recomposer) || FindViewTreeCompositionContext.getCurrentState().getValue().compareTo(Recomposer.State.ShuttingDown) > 0) ? FindViewTreeCompositionContext : 0;
                            if (r3 != 0) {
                                this.f16961p0 = new WeakReference<>(r3);
                            }
                        }
                    }
                }
                this.f16963r0 = Wrapper_androidKt.setContent(this, FindViewTreeCompositionContext, ComposableLambdaKt.composableLambdaInstance(-656146368, true, new a()));
            } finally {
                this.v0 = false;
            }
        }
    }

    public final void createComposition() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        b();
    }

    public final void disposeComposition() {
        Composition composition = this.f16963r0;
        if (composition != null) {
            composition.dispose();
        }
        this.f16963r0 = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.f16963r0 != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(widthMeasureSpec)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(heightMeasureSpec)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.f16967w0 || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        internalOnLayout$ui_release(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        b();
        internalOnMeasure$ui_release(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(layoutDirection);
    }

    public final void setParentCompositionContext(@Nullable CompositionContext parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.f16967w0 = true;
    }

    public final void setViewCompositionStrategy(@NotNull ViewCompositionStrategy strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Function0<Unit> function0 = this.f16965t0;
        if (function0 != null) {
            function0.invoke();
        }
        this.f16965t0 = strategy.installFor(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbstractComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View child, int index) {
        a();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(@Nullable View child, int index, @Nullable ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        a();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbstractComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        this.f16965t0 = ViewCompositionStrategy.INSTANCE.getDefault().installFor(this);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View child, int width, int height) {
        a();
        super.addView(child, width, height);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@Nullable View child, @Nullable ViewGroup.LayoutParams params) {
        a();
        super.addView(child, params);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View child, int index, @Nullable ViewGroup.LayoutParams params) {
        a();
        super.addView(child, index, params);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}

package l0;

import android.R;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetWindow\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,571:1\n76#2:572\n102#2,2:573\n1#3:575\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetWindow\n*L\n514#1:572\n514#1:573,2\n*E\n"})
public final class g2 extends AbstractComposeView implements ViewTreeObserver.OnGlobalLayoutListener, ViewRootForInspector {

    @NotNull
    public final WindowManager E0;

    @NotNull
    public final WindowManager.LayoutParams F0;

    @NotNull
    public final MutableState G0;
    public boolean H0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f82575x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final View f82576y0;

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f82578q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(2);
            this.f82578q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82578q0 | 1);
            g2.this.Content(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g2(@NotNull Function0<Unit> onDismissRequest, @NotNull View composeView, @NotNull UUID saveId) {
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(saveId, "saveId");
        Context context = composeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "composeView.context");
        super(context, null, 0, 6, null);
        this.f82575x0 = onDismissRequest;
        this.f82576y0 = composeView;
        setId(R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(composeView));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(composeView));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(composeView));
        setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Popup:" + saveId);
        setClipChildren(false);
        Object systemService = composeView.getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.E0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388691;
        layoutParams.type = 1000;
        layoutParams.width = mk.c.roundToInt(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.setTitle(composeView.getContext().getResources().getString(androidx.compose.ui.R.string.default_popup_window_title));
        layoutParams.token = composeView.getApplicationWindowToken();
        layoutParams.flags = (layoutParams.flags & (-163841)) | 512;
        this.F0 = layoutParams;
        this.G0 = SnapshotStateKt.mutableStateOf$default(ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1039getLambda3$material3_release(), null, 2, null);
    }

    public static /* synthetic */ void setCustomContent$default(g2 g2Var, CompositionContext compositionContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            compositionContext = null;
        }
        g2Var.setCustomContent(compositionContext, function2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public final void Content(@Nullable Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-463309699);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-463309699, i10, -1, "androidx.compose.material3.ModalBottomSheetWindow.Content (ModalBottomSheet.android.kt:519)");
        }
        ((Function2) this.G0.getValue()).invoke(composerStartRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(i10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getKeyCode() == 4) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                this.f82575x0.invoke();
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.H0;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public final /* synthetic */ AbstractComposeView getSubCompositionView() {
        return androidx.compose.ui.platform.l1.a(this);
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public final /* synthetic */ View getViewRoot() {
        return androidx.compose.ui.platform.l1.b(this);
    }

    public final void setCustomContent(@Nullable CompositionContext compositionContext, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (compositionContext != null) {
            setParentCompositionContext(compositionContext);
        }
        this.G0.setValue(content);
        this.H0 = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
    }
}

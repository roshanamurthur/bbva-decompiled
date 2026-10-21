package androidx.compose.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material/internal/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,475:1\n154#2:476\n1#3:477\n81#4:478\n107#4,2:479\n81#4:481\n107#4,2:482\n81#4:484\n81#4:485\n107#4,2:486\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material/internal/PopupLayout\n*L\n241#1:476\n233#1:478\n233#1:479,2\n234#1:481\n234#1:482,2\n237#1:484\n286#1:485\n286#1:486,2\n*E\n"})
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector, ViewTreeObserver.OnGlobalLayoutListener {

    @NotNull
    public final WindowManager E0;

    @NotNull
    public final WindowManager.LayoutParams F0;

    @NotNull
    public PopupPositionProvider G0;

    @NotNull
    public LayoutDirection H0;

    @NotNull
    public final MutableState I0;

    @NotNull
    public final MutableState J0;

    @NotNull
    public final State K0;

    @NotNull
    public final Rect L0;

    @NotNull
    public final Rect M0;

    @NotNull
    public final c N0;

    @NotNull
    public final MutableState O0;
    public boolean P0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f8785x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final View f8786y0;

    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f8788q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(2);
            this.f8788q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f8788q0 | 1);
            PopupLayout.this.Content(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
    public static final class b extends Lambda implements Function0<Boolean> {
        public b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            PopupLayout popupLayout = PopupLayout.this;
            return Boolean.valueOf((((IntRect) popupLayout.I0.getValue()) == null || ((IntSize) popupLayout.J0.getValue()) == null) ? false : true);
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
    public static final class c extends Lambda implements Function2<Offset, IntRect, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f8790p0 = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Offset offset, IntRect intRect) {
            Offset offset2 = offset;
            IntRect bounds = intRect;
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            boolean z10 = false;
            if (offset2 != null && (Offset.m2275getXimpl(offset2.getF15533a()) < bounds.getLeft() || Offset.m2275getXimpl(offset2.getF15533a()) > bounds.getRight() || Offset.m2276getYimpl(offset2.getF15533a()) < bounds.getTop() || Offset.m2276getYimpl(offset2.getF15533a()) > bounds.getBottom())) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PopupLayout(@Nullable Function0<Unit> function0, @NotNull String testTag, @NotNull View composeView, @NotNull Density density, @NotNull PopupPositionProvider initialPositionProvider, @NotNull UUID popupId) {
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(initialPositionProvider, "initialPositionProvider");
        Intrinsics.checkNotNullParameter(popupId, "popupId");
        Context context = composeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "composeView.context");
        super(context, null, 0, 6, null);
        this.f8785x0 = function0;
        this.f8786y0 = composeView;
        Object systemService = composeView.getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.E0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(composeView.getContext().getResources().getString(R.string.default_popup_window_title));
        this.F0 = layoutParams;
        this.G0 = initialPositionProvider;
        this.H0 = LayoutDirection.Ltr;
        this.I0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.J0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.K0 = SnapshotStateKt.derivedStateOf(new b());
        float fM4389constructorimpl = Dp.m4389constructorimpl(8);
        this.L0 = new Rect();
        this.M0 = new Rect();
        this.N0 = c.f8790p0;
        setId(android.R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(composeView));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(composeView));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(composeView));
        composeView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + popupId);
        setClipChildren(false);
        setElevation(density.mo415toPx0680j_4(fM4389constructorimpl));
        setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.material.internal.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@NotNull View view, @NotNull Outline result) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(result, "result");
                result.setRect(0, 0, view.getWidth(), view.getHeight());
                result.setAlpha(0.0f);
            }
        });
        this.O0 = SnapshotStateKt.mutableStateOf$default(ComposableSingletons$ExposedDropdownMenuPopupKt.INSTANCE.m885getLambda1$material_release(), null, 2, null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public final void Content(@Nullable Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1288867704);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288867704, i10, -1, "androidx.compose.material.internal.PopupLayout.Content (ExposedDropdownMenuPopup.kt:301)");
        }
        ((Function2) this.O0.getValue()).invoke(composerStartRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(i10));
    }

    public final void c(@Nullable Function0<Unit> function0, @NotNull String testTag, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f8785x0 = function0;
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i11);
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
                Function0<Unit> function0 = this.f8785x0;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.P0;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public final /* synthetic */ View getViewRoot() {
        return l1.b(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f8786y0;
        Rect rect = this.M0;
        view.getWindowVisibleDisplayFrame(rect);
        if (Intrinsics.areEqual(rect, this.L0)) {
            return;
        }
        updatePosition();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (((java.lang.Boolean) r4.N0.invoke(r1, r0)).booleanValue() != false) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(@org.jetbrains.annotations.Nullable android.view.MotionEvent r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L7
            boolean r5 = super.onTouchEvent(r5)
            return r5
        L7:
            int r0 = r5.getAction()
            r1 = 0
            if (r0 != 0) goto L38
            float r0 = r5.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3f
            float r0 = r5.getX()
            int r2 = r4.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3f
            float r0 = r5.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3f
            float r0 = r5.getY()
            int r2 = r4.getHeight()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3f
        L38:
            int r0 = r5.getAction()
            r2 = 4
            if (r0 != r2) goto L8c
        L3f:
            androidx.compose.runtime.MutableState r0 = r4.I0
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.unit.IntRect r0 = (androidx.compose.ui.unit.IntRect) r0
            if (r0 == 0) goto L83
            float r2 = r5.getX()
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 != 0) goto L5b
            float r2 = r5.getY()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L5b
            r1 = 0
            goto L75
        L5b:
            android.view.WindowManager$LayoutParams r1 = r4.F0
            int r2 = r1.x
            float r2 = (float) r2
            float r3 = r5.getX()
            float r3 = r3 + r2
            int r1 = r1.y
            float r1 = (float) r1
            float r2 = r5.getY()
            float r2 = r2 + r1
            long r1 = androidx.compose.ui.geometry.OffsetKt.Offset(r3, r2)
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.m2264boximpl(r1)
        L75:
            androidx.compose.material.internal.PopupLayout$c r2 = r4.N0
            java.lang.Object r0 = r2.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8c
        L83:
            kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r4.f8785x0
            if (r5 == 0) goto L8a
            r5.invoke()
        L8a:
            r5 = 1
            return r5
        L8c:
            boolean r5 = super.onTouchEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.internal.PopupLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setContent(@NotNull CompositionContext parent, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        setParentCompositionContext(parent);
        this.O0.setValue(content);
        this.P0 = true;
    }

    public final void setParentBounds(@Nullable IntRect intRect) {
        this.I0.setValue(intRect);
    }

    public final void setParentLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.H0 = layoutDirection;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m886setPopupContentSizefhxjrPA(@Nullable IntSize intSize) {
        this.J0.setValue(intSize);
    }

    public final void setPositionProvider(@NotNull PopupPositionProvider popupPositionProvider) {
        Intrinsics.checkNotNullParameter(popupPositionProvider, "<set-?>");
        this.G0 = popupPositionProvider;
    }

    public final void setTestTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updatePosition() {
        IntSize intSize;
        IntRect intRect = (IntRect) this.I0.getValue();
        if (intRect == null || (intSize = (IntSize) this.J0.getValue()) == null) {
            return;
        }
        long f18319a = intSize.getF18319a();
        View view = this.f8786y0;
        Rect rect = this.L0;
        view.getWindowVisibleDisplayFrame(rect);
        IntRect intRect2 = new IntRect(rect.left, rect.top, rect.right, rect.bottom);
        long jMo601calculatePositionllwVHH4 = this.G0.mo601calculatePositionllwVHH4(intRect, IntSizeKt.IntSize(intRect2.getWidth(), intRect2.getHeight()), this.H0, f18319a);
        WindowManager.LayoutParams layoutParams = this.F0;
        layoutParams.x = IntOffset.m4507getXimpl(jMo601calculatePositionllwVHH4);
        layoutParams.y = IntOffset.m4508getYimpl(jMo601calculatePositionllwVHH4);
        this.E0.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @NotNull
    public final AbstractComposeView getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }
}

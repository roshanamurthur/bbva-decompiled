package androidx.compose.ui.window;

import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,466:1\n154#2:467\n1#3:468\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n*L\n302#1:467\n*E\n"})
public final class DialogWrapper extends ComponentDialog implements ViewRootForInspector {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f18461s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public DialogProperties f18462t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final View f18463u0;

    @NotNull
    public final z1.c v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f18464w0;

    /* JADX INFO: compiled from: AndroidDialog.android.kt */
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

    /* JADX INFO: compiled from: AndroidDialog.android.kt */
    public static final class a extends Lambda implements Function1<OnBackPressedCallback, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OnBackPressedCallback onBackPressedCallback) {
            OnBackPressedCallback addCallback = onBackPressedCallback;
            Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
            DialogWrapper dialogWrapper = DialogWrapper.this;
            if (dialogWrapper.f18462t0.getDismissOnBackPress()) {
                dialogWrapper.f18461s0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogWrapper(@NotNull Function0<Unit> onDismissRequest, @NotNull DialogProperties properties, @NotNull View composeView, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull UUID dialogId) {
        super(new ContextThemeWrapper(composeView.getContext(), (Build.VERSION.SDK_INT >= 31 || properties.getDecorFitsSystemWindows()) ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        this.f18461s0 = onDismissRequest;
        this.f18462t0 = properties;
        this.f18463u0 = composeView;
        float fM4389constructorimpl = Dp.m4389constructorimpl(8);
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window".toString());
        }
        this.f18464w0 = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        WindowCompat.setDecorFitsSystemWindows(window, this.f18462t0.getDecorFitsSystemWindows());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        z1.c cVar = new z1.c(context, window);
        cVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + dialogId);
        cVar.setClipChildren(false);
        cVar.setElevation(density.mo415toPx0680j_4(fM4389constructorimpl));
        cVar.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.DialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@NotNull View view, @NotNull Outline result) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(result, "result");
                result.setRect(0, 0, view.getWidth(), view.getHeight());
                result.setAlpha(0.0f);
            }
        });
        this.v0 = cVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            c(viewGroup);
        }
        setContentView(cVar);
        ViewTreeLifecycleOwner.set(cVar, ViewTreeLifecycleOwner.get(composeView));
        ViewTreeViewModelStoreOwner.set(cVar, ViewTreeViewModelStoreOwner.get(composeView));
        ViewTreeSavedStateRegistryOwner.set(cVar, ViewTreeSavedStateRegistryOwner.get(composeView));
        d(this.f18461s0, this.f18462t0, layoutDirection);
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), this, false, new a(), 2, null);
    }

    public static final void c(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof z1.c) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                c(viewGroup2);
            }
        }
    }

    public final void d(@NotNull Function0<Unit> onDismissRequest, @NotNull DialogProperties properties, @NotNull LayoutDirection layoutDirection) {
        Window window;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f18461s0 = onDismissRequest;
        this.f18462t0 = properties;
        boolean zShouldApplySecureFlag = SecureFlagPolicy_androidKt.shouldApplySecureFlag(properties.getSecurePolicy(), AndroidPopup_androidKt.isFlagSecureEnabled(this.f18463u0));
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        window2.setFlags(zShouldApplySecureFlag ? 8192 : -8193, 8192);
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        z1.c cVar = this.v0;
        cVar.setLayoutDirection(i11);
        if (properties.getUsePlatformDefaultWidth() && !cVar.E0 && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        cVar.setUsePlatformDefaultWidth(properties.getUsePlatformDefaultWidth());
        if (Build.VERSION.SDK_INT < 31) {
            if (properties.getDecorFitsSystemWindows()) {
                Window window3 = getWindow();
                if (window3 != null) {
                    window3.setSoftInputMode(this.f18464w0);
                    return;
                }
                return;
            }
            Window window4 = getWindow();
            if (window4 != null) {
                window4.setSoftInputMode(16);
            }
        }
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @NotNull
    public final AbstractComposeView getSubCompositionView() {
        return this.v0;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public final /* synthetic */ View getViewRoot() {
        return l1.b(this);
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean zOnTouchEvent = super.onTouchEvent(event);
        if (zOnTouchEvent && this.f18462t0.getDismissOnClickOutside()) {
            this.f18461s0.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}

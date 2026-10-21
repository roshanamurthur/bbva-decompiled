package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.StyleRes;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ComponentDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\b\b\u0003\u0010(\u001a\u00020\r¢\u0006\u0004\b)\u0010*J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0015J\b\u0010\n\u001a\u00020\bH\u0015J\b\u0010\u000b\u001a\u00020\bH\u0015J\b\u0010\f\u001a\u00020\bH\u0017J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001a\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0017R\u001d\u0010\u001d\u001a\u00020\u00168\u0006¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006+"}, d2 = {"Landroidx/activity/ComponentDialog;", "Landroid/app/Dialog;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroid/os/Bundle;", "onSaveInstanceState", "savedInstanceState", "", "onCreate", "onStart", "onStop", "onBackPressed", "", "layoutResID", "setContentView", "Landroid/view/View;", "view", "Landroid/view/ViewGroup$LayoutParams;", "params", "addContentView", "initializeViewTreeOwners", "Landroidx/activity/OnBackPressedDispatcher;", "r0", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "()V", "onBackPressedDispatcher", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroid/content/Context;", "context", "themeResId", "<init>", "(Landroid/content/Context;I)V", "activity_release"}, k = 1, mv = {1, 8, 0})
public class ComponentDialog extends Dialog implements LifecycleOwner, OnBackPressedDispatcherOwner, SavedStateRegistryOwner {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public LifecycleRegistry f312p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final SavedStateRegistryController f313q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OnBackPressedDispatcher onBackPressedDispatcher;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ComponentDialog(@NotNull Context context) {
        this(context, 0, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(ComponentDialog this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, params);
    }

    public final LifecycleRegistry b() {
        LifecycleRegistry lifecycleRegistry = this.f312p0;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this);
        this.f312p0 = lifecycleRegistry2;
        return lifecycleRegistry2;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return b();
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    @NotNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @NotNull
    public SavedStateRegistry getSavedStateRegistry() {
        return this.f313q0.getSavedStateRegistry();
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        ViewTreeLifecycleOwner.set(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        ViewTreeOnBackPressedDispatcherOwner.set(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        ViewTreeSavedStateRegistryOwner.set(decorView3, this);
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onBackPressed() {
        this.onBackPressedDispatcher.onBackPressed();
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            this.onBackPressedDispatcher.setOnBackInvokedDispatcher(onBackInvokedDispatcher);
        }
        this.f313q0.performRestore(savedInstanceState);
        b().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    @NotNull
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f313q0.performSave(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onStart() {
        super.onStart();
        b().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onStop() {
        b().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.f312p0 = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        super.setContentView(layoutResID);
    }

    public /* synthetic */ ComponentDialog(Context context, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ComponentDialog(@NotNull Context context, @StyleRes int i10) {
        super(context, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f313q0 = SavedStateRegistryController.INSTANCE.create(this);
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new h(this, 0));
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, params);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}

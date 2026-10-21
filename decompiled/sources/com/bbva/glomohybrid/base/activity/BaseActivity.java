package com.bbva.glomohybrid.base.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.glomohybrid.base.AppBuildConfig;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.base.extensions.FragmentExtensionsKt;
import com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler;
import com.bbva.glomohybrid.base.inappupdate.view.InAppUpdateModal;
import com.bbva.glomohybrid.base.snackbar.SnackbarSpec;
import com.bbva.glomohybrid.base.snackbar.SnackbarSpecKt;
import com.bbva.glomohybrid.base.snackbar.SnackbarState;
import com.bbva.showinfo.ShowInfoKt;
import com.bbva.showinfo.model.InfoElement;
import com.bbva.showinfo.model.InfoSnackBar;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: compiled from: BaseActivity.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0004J\b\u0010\u0007\u001a\u00020\u0004H\u0004J\b\u0010\b\u001a\u00020\u0004H\u0014J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0004J*\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000eR\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00118DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/base/activity/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "disableInstallUpdateModal", "enableInstallUpdateModal", "onStop", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarState;", "snackbarState", "renderSnackbar", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "action", "observe", "Lcom/bbva/glomohybrid/base/inappupdate/InAppUpdatesHandler;", "q0", "Lkotlin/Lazy;", "getInAppUpdatesHandler", "()Lcom/bbva/glomohybrid/base/inappupdate/InAppUpdatesHandler;", "inAppUpdatesHandler", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseActivity.kt\ncom/bbva/glomohybrid/base/activity/BaseActivity\n+ 2 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 3 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n*L\n1#1,113:1\n40#2,5:114\n40#2,5:123\n55#3,4:119\n*S KotlinDebug\n*F\n+ 1 BaseActivity.kt\ncom/bbva/glomohybrid/base/activity/BaseActivity\n*L\n30#1:114,5\n34#1:123,5\n32#1:119,4\n*E\n"})
public abstract class BaseActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Lazy f31023p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy inAppUpdatesHandler;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Lazy f31025r0;

    /* JADX INFO: compiled from: BaseActivity.kt */
    public static final class a extends Lambda implements Function0<ParametersHolder> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ContextExtensionKt.activityParameters(BaseActivity.this);
        }
    }

    /* JADX INFO: compiled from: BaseActivity.kt */
    public static final class b extends Lambda implements Function0<InfoElement> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SnackbarState f31028q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SnackbarState snackbarState) {
            super(0);
            this.f31028q0 = snackbarState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InfoElement invoke() {
            return BaseActivity.access$toInfoSnackbar(BaseActivity.this, ((SnackbarState.Show) this.f31028q0).getSnackbarSpec());
        }
    }

    /* JADX INFO: compiled from: BaseActivity.kt */
    public static final class c extends Lambda implements Function0<InfoElement> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f31029p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final InfoElement invoke() {
            return ShowInfoKt.snackBar(com.bbva.glomohybrid.base.activity.a.f31040p0);
        }
    }

    /* JADX INFO: compiled from: BaseActivity.kt */
    public static final class d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f31030a;

        public d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f31030a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f31030a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f31030a;
        }

        public final int hashCode() {
            return this.f31030a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31030a.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f31023p0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<AnalyticsManager>() { // from class: com.bbva.glomohybrid.base.activity.BaseActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.component.dm.analytics.AnalyticsManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AnalyticsManager invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(AnalyticsManager.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.inAppUpdatesHandler = LazyKt__LazyJVMKt.lazy(new Function0<InAppUpdatesHandler>() { // from class: com.bbva.glomohybrid.base.activity.BaseActivity$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final InAppUpdatesHandler invoke() {
                return ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(InAppUpdatesHandler.class), objArr2, objArr3);
            }
        });
        final a aVar = new a();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        this.f31025r0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<InAppUpdateModal>() { // from class: com.bbva.glomohybrid.base.activity.BaseActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.base.inappupdate.view.InAppUpdateModal, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InAppUpdateModal invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(InAppUpdateModal.class), objArr4, aVar);
            }
        });
    }

    public static final InAppUpdateModal access$getInAppUpdateModal(BaseActivity baseActivity) {
        return (InAppUpdateModal) baseActivity.f31025r0.getValue();
    }

    public static final void access$handleUpdateModalIntent(BaseActivity baseActivity, InAppUpdateModal.Intent intent) {
        InAppUpdatesHandler inAppUpdatesHandler;
        baseActivity.getClass();
        if (!Intrinsics.areEqual(intent, InAppUpdateModal.Intent.Install.INSTANCE) || (inAppUpdatesHandler = baseActivity.getInAppUpdatesHandler()) == null) {
            return;
        }
        inAppUpdatesHandler.install();
    }

    public static final void access$handleUpdateState(BaseActivity baseActivity, InAppUpdatesHandler.InstallState installState) {
        baseActivity.getClass();
        if (installState == InAppUpdatesHandler.InstallState.READY) {
            Lazy lazy = baseActivity.f31025r0;
            if (((InAppUpdateModal) lazy.getValue()).getCom.bbva.cells.component.kit.ui.property.impl.view.EnableHandler.ID java.lang.String()) {
                InAppUpdatesHandler inAppUpdatesHandler = baseActivity.getInAppUpdatesHandler();
                if (inAppUpdatesHandler != null) {
                    inAppUpdatesHandler.installationRequired();
                }
                ((InAppUpdateModal) lazy.getValue()).show();
            }
        }
    }

    public static final InfoSnackBar access$toInfoSnackbar(BaseActivity baseActivity, SnackbarSpec snackbarSpec) {
        baseActivity.getClass();
        if (snackbarSpec instanceof SnackbarSpec.ResourcesSnackbar) {
            return SnackbarSpecKt.toSnackbar((SnackbarSpec.ResourcesSnackbar) snackbarSpec, baseActivity);
        }
        if (snackbarSpec instanceof SnackbarSpec.BundleSnackbar) {
            return SnackbarSpecKt.toSnackbar((SnackbarSpec.BundleSnackbar) snackbarSpec);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void disableInstallUpdateModal() {
        ((InAppUpdateModal) this.f31025r0.getValue()).setEnable(false);
    }

    public final void enableInstallUpdateModal() {
        ((InAppUpdateModal) this.f31025r0.getValue()).setEnable(true);
    }

    @Nullable
    public final InAppUpdatesHandler getInAppUpdatesHandler() {
        return (InAppUpdatesHandler) this.inAppUpdatesHandler.getValue();
    }

    public final <T> void observe(@NotNull LiveData<T> liveData, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        liveData.observe(this, new d(action));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (AppBuildConfig.INSTANCE.getFLAG_SECURE()) {
            getWindow().addFlags(8192);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new u7.b(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new u7.a(this, null), 3, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNull(supportFragmentManager);
        FragmentExtensionsKt.removeFragment(supportFragmentManager, "BiometricFragment");
        super.onStop();
    }

    public final void renderSnackbar(@NotNull SnackbarState snackbarState) {
        Intrinsics.checkNotNullParameter(snackbarState, "snackbarState");
        if (snackbarState instanceof SnackbarState.Show) {
            ShowInfoKt.show(this, new b(snackbarState));
        } else {
            ShowInfoKt.hide(this, c.f31029p0);
        }
    }
}

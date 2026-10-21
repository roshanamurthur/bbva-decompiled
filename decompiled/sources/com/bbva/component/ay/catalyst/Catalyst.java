package com.bbva.component.ay.catalyst;

import android.app.Application;
import androidx.lifecycle.LifecycleOwner;
import com.adobe.marketing.mobile.AdobeCallback;
import com.adobe.marketing.mobile.Analytics;
import com.adobe.marketing.mobile.Identity;
import com.adobe.marketing.mobile.Lifecycle;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import com.adobe.marketing.mobile.Signal;
import com.bbva.cells.component.kit.lifecycle.LifecycleComponent;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.ay.catalyst.Catalyst;
import com.bbva.component.ay.catalyst.data.config.CatalystConfig;
import com.bbva.component.ay.catalyst.di.Injector;
import com.bbva.component.ay.catalyst.usecase.GetExperienceCloudIdUseCase;
import com.bbva.component.ay.catalyst.usecase.GetTrackingIdentifierUseCase;
import com.bbva.nativesettings.common.Constants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o4.c;
import o4.d;
import o4.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Catalyst.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B9\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u0018"}, d2 = {"Lcom/bbva/component/ay/catalyst/Catalyst;", "Lcom/bbva/cells/component/kit/lifecycle/LifecycleComponent;", "", "getId", "", "onCreate", "getTrackingIdentifier", "getExperienceCloudId", "onResume", "onPause", "dispose", "Landroid/app/Application;", Constants.APPLICATION, "Landroidx/lifecycle/LifecycleOwner;", "owner", "Lcom/bbva/component/ay/catalyst/data/config/CatalystConfig;", "config", "", "autoStart", "Lcom/adobe/marketing/mobile/LoggingMode;", "loggingMode", "<init>", "(Landroid/app/Application;Landroidx/lifecycle/LifecycleOwner;Lcom/bbva/component/ay/catalyst/data/config/CatalystConfig;ZLcom/adobe/marketing/mobile/LoggingMode;)V", "Companion", "component-ay-catalyst_release"}, k = 1, mv = {1, 5, 1})
public final class Catalyst extends LifecycleComponent {

    @NotNull
    public static final String ID = "component-analytics-adobe-catalyst";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Application f27321q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final LifecycleOwner f27322r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public final CatalystConfig f27323s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f27324t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public final LoggingMode f27325u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f27326w0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final ActionSpec<String> ACTION_TRACKING_IDENTIFIER = new ActionSpec<>("on_tracking_identifier");

    @JvmField
    @NotNull
    public static final ActionSpec<String> ACTION_EXPERIENCE_CLOUD_IDENTIFIER = new ActionSpec<>("on_experience_cloud_identifier");

    @JvmField
    @NotNull
    public static final ActionSpec<Throwable> ACTION_ERROR = new ActionSpec<>("on_error");

    /* JADX INFO: compiled from: Catalyst.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/ay/catalyst/Catalyst$Companion;", "", "()V", "ACTION_ERROR", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "", "ACTION_EXPERIENCE_CLOUD_IDENTIFIER", "", "ACTION_TRACKING_IDENTIFIER", "ID", "TAG", "component-ay-catalyst_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: Catalyst.kt */
    public static final class a extends Lambda implements Function0<GetExperienceCloudIdUseCase> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f27327p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final GetExperienceCloudIdUseCase invoke() {
            return Injector.INSTANCE.experienceCloudIdUseCase();
        }
    }

    /* JADX INFO: compiled from: Catalyst.kt */
    public static final class b extends Lambda implements Function0<GetTrackingIdentifierUseCase> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f27328p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final GetTrackingIdentifierUseCase invoke() {
            return Injector.INSTANCE.trackingIdentifierUseCase();
        }
    }

    public /* synthetic */ Catalyst(Application application, LifecycleOwner lifecycleOwner, CatalystConfig catalystConfig, boolean z10, LoggingMode loggingMode, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, lifecycleOwner, (i10 & 4) != 0 ? null : catalystConfig, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : loggingMode);
    }

    @Override // com.bbva.cells.component.kit.lifecycle.LifecycleComponent, com.bbva.cells.component.kit.common.ReactiveComponent, com.bbva.cells.component.kit.common.Disposable
    public void dispose() {
        super.dispose();
        ((GetExperienceCloudIdUseCase) this.f27326w0.getValue()).dispose();
        ((GetTrackingIdentifierUseCase) this.v0.getValue()).dispose();
    }

    public final void getExperienceCloudId() {
        ((GetExperienceCloudIdUseCase) this.f27326w0.getValue()).execute(null, new d(this, 0), new e(this, 0));
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF28076q0() {
        return ID;
    }

    public final void getTrackingIdentifier() {
        ((GetTrackingIdentifierUseCase) this.v0.getValue()).execute(null, new o4.b(this, 0), new c(this, 0));
    }

    @Override // com.bbva.cells.component.kit.lifecycle.LifecycleComponent
    public void onCreate() {
        Object objM5535constructorimpl;
        super.onCreate();
        if (this.f27324t0) {
            MobileCore.setApplication(this.f27321q0);
            LoggingMode loggingMode = this.f27325u0;
            if (loggingMode != null) {
                MobileCore.setLogLevel(loggingMode);
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                Analytics.registerExtension();
                Identity.registerExtension();
                Lifecycle.registerExtension();
                Signal.registerExtension();
                MobileCore.start(new AdobeCallback() { // from class: o4.a
                    @Override // com.adobe.marketing.mobile.AdobeCallback
                    public final void call(Object obj) {
                        Catalyst.Companion companion2 = Catalyst.INSTANCE;
                        Catalyst this_runCatching = this.f85266a;
                        Intrinsics.checkNotNullParameter(this_runCatching, "$this_runCatching");
                        CatalystConfig catalystConfig = this_runCatching.f27323s0;
                        if (catalystConfig instanceof CatalystConfig.Identifier) {
                            MobileCore.configureWithAppID(catalystConfig.getValue());
                        } else if (catalystConfig instanceof CatalystConfig.Assets) {
                            MobileCore.configureWithFileInAssets(catalystConfig.getValue());
                        } else if (catalystConfig instanceof CatalystConfig.FilePath) {
                            MobileCore.configureWithFileInPath(catalystConfig.getValue());
                        }
                    }
                });
                objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        }
    }

    @Override // com.bbva.cells.component.kit.lifecycle.LifecycleComponent
    public void onPause() {
        super.onPause();
        MobileCore.lifecyclePause();
    }

    @Override // com.bbva.cells.component.kit.lifecycle.LifecycleComponent
    public void onResume() {
        super.onResume();
        MobileCore.lifecycleStart(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Catalyst(@NotNull Application application, @NotNull LifecycleOwner owner, @Nullable CatalystConfig catalystConfig, boolean z10, @Nullable LoggingMode loggingMode) {
        super(owner);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f27321q0 = application;
        this.f27322r0 = owner;
        this.f27323s0 = catalystConfig;
        this.f27324t0 = z10;
        this.f27325u0 = loggingMode;
        this.v0 = LazyKt__LazyJVMKt.lazy(b.f27328p0);
        this.f27326w0 = LazyKt__LazyJVMKt.lazy(a.f27327p0);
    }
}

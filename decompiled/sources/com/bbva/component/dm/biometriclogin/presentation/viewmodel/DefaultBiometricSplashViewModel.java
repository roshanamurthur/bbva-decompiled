package com.bbva.component.dm.biometriclogin.presentation.viewmodel;

import android.app.Activity;
import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthState;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.viewmodel.Action;
import com.bbva.glomohybrid.base.viewmodel.ActionKt;
import com.bbva.glomohybrid.base.viewmodel.PerformedAction;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.base.viewmodel.ZipActionsFlow;
import com.bbva.glomoutils.AnyExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BiometricSplashViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0015"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/viewmodel/DefaultBiometricSplashViewModel;", "Lcom/bbva/component/dm/biometriclogin/presentation/viewmodel/BiometricSplashViewModel;", "", "Lcom/bbva/glomohybrid/base/viewmodel/Action;", "biometricActionsFlow", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "biometricAuthState", "", "updateBiometricAuthentication", "", Constants.backendRequestUserId, "checkAuthentication", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "setActivity", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/glomohybrid/base/viewmodel/ZipActionsFlow;", "zipActionsFlow", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomohybrid/base/viewmodel/ZipActionsFlow;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class DefaultBiometricSplashViewModel implements BiometricSplashViewModel {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ViewModelComponentsProviders f27521p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ZipActionsFlow f27522q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Activity f27523r0;

    /* JADX INFO: compiled from: BiometricSplashViewModel.kt */
    public static final class a extends Lambda implements Function1<PerformedAction, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PerformedAction performedAction) {
            PerformedAction it = performedAction;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getValue() instanceof BiometryAuthState) {
                Object value = it.getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthState");
                DefaultBiometricSplashViewModel.this.updateBiometricAuthentication((BiometryAuthState) value);
            }
            return Unit.INSTANCE;
        }
    }

    public DefaultBiometricSplashViewModel(@NotNull ViewModelComponentsProviders provider, @NotNull ZipActionsFlow zipActionsFlow) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(zipActionsFlow, "zipActionsFlow");
        this.f27521p0 = provider;
        this.f27522q0 = zipActionsFlow;
        BiometricAuthenticationDataManager biometricAuthenticationDataManager = (BiometricAuthenticationDataManager) provider.provide(BiometricAuthenticationDataManager.ID);
        if (biometricAuthenticationDataManager != null) {
            biometricAuthenticationDataManager.onActionPerformed(new a());
        }
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricSplashViewModel
    @NotNull
    public List<Action> biometricActionsFlow() {
        BiometricSplashViewModel.DefaultImpls.biometricActionsFlow(this);
        String id = BiometricAuthenticationDataManager.ACTION_AUTHENTICATION_POSSIBLE.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        return AnyExtensionsKt.toList(ActionKt.justAction(id));
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricSplashViewModel
    public void checkAuthentication(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        BiometricAuthenticationDataManager biometricAuthenticationDataManager = (BiometricAuthenticationDataManager) this.f27521p0.provide(BiometricAuthenticationDataManager.ID);
        if (biometricAuthenticationDataManager != null) {
            Activity activity = this.f27523r0;
            if (activity == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID);
                activity = null;
            }
            biometricAuthenticationDataManager.setUp(userId, activity);
        }
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricSplashViewModel
    public void setActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27523r0 = activity;
    }

    @Override // com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricSplashViewModel
    public void updateBiometricAuthentication(@NotNull BiometryAuthState biometricAuthState) {
        Intrinsics.checkNotNullParameter(biometricAuthState, "biometricAuthState");
        String id = BiometricAuthenticationDataManager.ACTION_AUTHENTICATION_POSSIBLE.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        ZipActionsFlow.markAsPerformed$default(this.f27522q0, id, null, 2, null);
        BiometricAuthenticationDataManager biometricAuthenticationDataManager = (BiometricAuthenticationDataManager) this.f27521p0.provide(BiometricAuthenticationDataManager.ID);
        if (biometricAuthenticationDataManager != null) {
            biometricAuthenticationDataManager.setBiometricAvailable(biometricAuthState);
            biometricAuthenticationDataManager.setSkippedTimes(0);
        }
    }
}

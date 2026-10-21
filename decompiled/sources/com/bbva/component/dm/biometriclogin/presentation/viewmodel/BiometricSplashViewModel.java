package com.bbva.component.dm.biometriclogin.presentation.viewmodel;

import android.app.Activity;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthState;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.viewmodel.Action;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BiometricSplashViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/viewmodel/BiometricSplashViewModel;", "", "biometricActionsFlow", "", "Lcom/bbva/glomohybrid/base/viewmodel/Action;", "checkAuthentication", "", Constants.backendRequestUserId, "", "setActivity", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "updateBiometricAuthentication", "biometricAuthState", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface BiometricSplashViewModel {

    /* JADX INFO: compiled from: BiometricSplashViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static List<Action> biometricActionsFlow(@NotNull BiometricSplashViewModel biometricSplashViewModel) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    List<Action> biometricActionsFlow();

    void checkAuthentication(@NotNull String userId);

    void setActivity(@NotNull Activity activity);

    void updateBiometricAuthentication(@NotNull BiometryAuthState biometricAuthState);
}

package com.bbva.sl.ar.android.secsdk.fido;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.DiscoverData;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoAuthenticatorType;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoDevice;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoQuickAuthData;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public interface FidoSdk {

    public interface FidoAuthenticateCallback {
        void authenticateCompleted(FidoSession fidoSession);

        void authenticateFailed(FidoSession fidoSession, FidoException fidoException);
    }

    public interface FidoCheckAuthenticateCallback {
        void checkCompleted(FidoSession fidoSession, boolean z10);

        void checkFailed(FidoSession fidoSession, FidoException fidoException);
    }

    public interface FidoCheckLocalAuthCallback {
        void checkCompleted(boolean z10);
    }

    public interface FidoCheckRegisterCallback {
        void checkCompleted(FidoSession fidoSession, boolean z10);

        void checkFailed(FidoSession fidoSession, FidoException fidoException);
    }

    public interface FidoDeleteCallback {
        void deleteAllCompleted(FidoSession fidoSession);

        void deleteAllFailed(FidoSession fidoSession, FidoException fidoException);

        void deleteOneCompleted(FidoSession fidoSession, String str);

        void deleteOneFailed(FidoSession fidoSession, FidoException fidoException, String str);
    }

    public interface FidoDiscoverBiometricCapabilitiesCallback {
        void failure(@NonNull FidoException fidoException);

        void success(@NonNull Set<BiometricCapability> set);
    }

    public interface FidoDiscoverCapabilitiesCallback {
        void failure(@NonNull FidoException fidoException);

        void success(@NonNull DiscoverData discoverData);
    }

    public interface FidoInitializeCallback {
        void initCompleted();

        void initFailed(FidoException fidoException);
    }

    public interface FidoListingCallback {
        void listingCompleted(FidoSession fidoSession, List<FidoDevice> list);

        void listingFailed(FidoSession fidoSession, FidoException fidoException);
    }

    public interface FidoOobAuthenticateCallback extends FidoAuthenticateCallback {
        @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoAuthenticateCallback
        void authenticateCompleted(FidoSession fidoSession);

        @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoAuthenticateCallback
        void authenticateFailed(FidoSession fidoSession, FidoException fidoException);
    }

    public interface FidoOobRegisterCallback extends FidoRegisterCallback {
        @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoRegisterCallback
        void registerCompleted(FidoSession fidoSession);

        @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoRegisterCallback
        void registerFailed(FidoSession fidoSession, FidoException fidoException);
    }

    public interface FidoOperationListener {
        void failure(@NonNull FidoException fidoException);

        void success(@NonNull String str);
    }

    public interface FidoQuickAuthDataCallback {
        void failure(@NonNull FidoException fidoException);

        void success(@Nullable FidoQuickAuthData fidoQuickAuthData);
    }

    public interface FidoRegisterCallback {
        void registerCompleted(FidoSession fidoSession);

        void registerFailed(FidoSession fidoSession, FidoException fidoException);
    }

    public interface FidoSignCallback {
        void signCompleted(FidoSession fidoSession);

        void signFailed(FidoSession fidoSession, FidoException fidoException);
    }

    public interface FidoUISelectionCallback {
        void didCancel();

        void didSelect(FidoAuthenticatorType fidoAuthenticatorType);
    }

    public interface FidoUISelectionListener {
        void selectAuthenticator(List<FidoAuthenticatorType> list, FidoUISelectionCallback fidoUISelectionCallback);

        void selectionTimeout();
    }

    public interface FidoUITransactionCallback {
        void onTransactionComplete(boolean z10);
    }

    public interface FidoUITransactionListener {
        void confirmTransaction(FidoUITransactionCallback fidoUITransactionCallback);
    }

    void authenticate(@Nullable Activity activity, @NonNull FidoSession fidoSession, @NonNull FidoAuthenticateCallback fidoAuthenticateCallback, boolean z10);

    void checkAuthenticationPossible(@Nullable Activity activity, @NonNull FidoSession fidoSession, @NonNull FidoCheckAuthenticateCallback fidoCheckAuthenticateCallback);

    void checkLocalAuthPossible(@Nullable Activity activity, @NonNull String str, @Nullable String str2, @NonNull FidoCheckLocalAuthCallback fidoCheckLocalAuthCallback);

    void checkRegistrationPossible(@Nullable Activity activity, @NonNull FidoSession fidoSession, @NonNull FidoCheckRegisterCallback fidoCheckRegisterCallback);

    void createAuthMessage(@NonNull Activity activity, @NonNull FidoOperationListener fidoOperationListener);

    void deleteAllAuthenticators(@Nullable Activity activity, @NonNull FidoSession fidoSession, @NonNull FidoDeleteCallback fidoDeleteCallback);

    void deleteAllAuthenticatorsFromDevice(@Nullable String str, @NonNull Activity activity, @NonNull FidoSession fidoSession, @NonNull FidoDeleteCallback fidoDeleteCallback);

    void deleteAllAuthenticatorsLocally(@Nullable Activity activity, @NonNull FidoSession fidoSession, @NonNull FidoDeleteCallback fidoDeleteCallback);

    void deleteAuthenticator(@Nullable String str, @NonNull String str2, @NonNull Activity activity, @NonNull FidoSession fidoSession, @NonNull FidoDeleteCallback fidoDeleteCallback);

    void deleteAuthenticatorLocally(@Nullable String str, @NonNull Activity activity, @NonNull FidoSession fidoSession, @NonNull FidoDeleteCallback fidoDeleteCallback);

    void discoverBiometricCapabilities(@NonNull Activity activity, @NonNull FidoDiscoverBiometricCapabilitiesCallback fidoDiscoverBiometricCapabilitiesCallback);

    void discoverCapabilities(@NonNull Activity activity, @NonNull FidoDiscoverCapabilitiesCallback fidoDiscoverCapabilitiesCallback);

    @Nullable
    String getDeviceId();

    @Nullable
    String getFacetId();

    @Nullable
    String getFacetsUrl();

    @Deprecated
    void initialize(@NonNull Activity activity, @NonNull FidoInitializeCallback fidoInitializeCallback);

    void initialize(@NonNull FidoInitializeCallback fidoInitializeCallback);

    boolean isQuickAuthEnabled();

    void listAuthenticators(@NonNull Activity activity, @NonNull FidoSession fidoSession, @NonNull FidoListingCallback fidoListingCallback);

    void oobAuthenticate(@Nullable Activity activity, @NonNull FidoSession fidoSession, @NonNull String str, @NonNull FidoOobAuthenticateCallback fidoOobAuthenticateCallback, boolean z10);

    void oobRegisterAuthenticator(@Nullable Activity activity, @NonNull FidoSession fidoSession, @NonNull String str, @NonNull FidoOobRegisterCallback fidoOobRegisterCallback, boolean z10);

    void processAuthMessage(@NonNull Activity activity, @NonNull String str, @NonNull FidoOperationListener fidoOperationListener);

    void quickAuthData(@NonNull FidoSession fidoSession, @NonNull FidoQuickAuthDataCallback fidoQuickAuthDataCallback);

    void registerAuthenticator(@Nullable Activity activity, @NonNull FidoSession fidoSession, @NonNull FidoRegisterCallback fidoRegisterCallback, boolean z10);

    void registerSelectionUIListener(@NonNull FidoUISelectionListener fidoUISelectionListener);

    void setExternalDeviceId(String str);

    void setFacetsUrl(@NonNull String str);

    void setQuickAuthEnabled(boolean z10);

    void setTransactionUIListener(@NonNull FidoUITransactionListener fidoUITransactionListener);

    void signTransaction(@NonNull Activity activity, @NonNull FidoSession fidoSession, @NonNull String str, @NonNull String str2, @NonNull FidoSignCallback fidoSignCallback);
}

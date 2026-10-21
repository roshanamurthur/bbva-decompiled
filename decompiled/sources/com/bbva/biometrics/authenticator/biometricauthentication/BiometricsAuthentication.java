package com.bbva.biometrics.authenticator.biometricauthentication;

import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import com.bbva.biometrics.authenticator.data.AuthenticationResult;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometricsAuthentication.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/biometrics/authenticator/biometricauthentication/BiometricsAuthentication;", "", NaturalAuthenticationCommandFactory.ACTION_AUTHENTICATE, "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/biometrics/authenticator/data/AuthenticationResult;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroidx/fragment/app/FragmentActivity;", "cryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "(Landroidx/fragment/app/FragmentActivity;Landroidx/biometric/BiometricPrompt$CryptoObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAuthentication", "", "biometrics_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface BiometricsAuthentication {

    /* JADX INFO: compiled from: BiometricsAuthentication.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object authenticate$default(BiometricsAuthentication biometricsAuthentication, FragmentActivity fragmentActivity, BiometricPrompt.CryptoObject cryptoObject, Continuation continuation, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: authenticate");
            }
            if ((i10 & 2) != 0) {
                cryptoObject = null;
            }
            return biometricsAuthentication.authenticate(fragmentActivity, cryptoObject, continuation);
        }
    }

    @Nullable
    Object authenticate(@NotNull FragmentActivity fragmentActivity, @Nullable BiometricPrompt.CryptoObject cryptoObject, @NotNull Continuation<? super Flow<? extends AuthenticationResult>> continuation);

    void cancelAuthentication();
}

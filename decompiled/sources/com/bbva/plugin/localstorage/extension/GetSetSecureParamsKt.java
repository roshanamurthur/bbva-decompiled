package com.bbva.plugin.localstorage.extension;

import androidx.fragment.app.FragmentActivity;
import com.bbva.biometrics.authenticator.Biometrics;
import com.bbva.biometrics.authenticator.data.AuthenticationType;
import com.bbva.glomohybrid.base.handler.BiometricsIntentHandler;
import com.bbva.localstorage.model.BiometricsStorageData;
import com.bbva.plugin.localstorage.params.GetSetSecureParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetSetSecureParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¨\u0006\b"}, d2 = {"toBiometrics", "Lcom/bbva/biometrics/authenticator/Biometrics;", "Lcom/bbva/plugin/localstorage/params/GetSetSecureParams;", "toBiometricsStorageData", "Lcom/bbva/localstorage/model/BiometricsStorageData;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", BiometricsIntentHandler.ID, "local-storage-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGetSetSecureParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetSetSecureParams.kt\ncom/bbva/plugin/localstorage/extension/GetSetSecureParamsKt\n+ 2 Biometrics.kt\ncom/bbva/biometrics/authenticator/Biometrics$Companion\n*L\n1#1,31:1\n49#2:32\n*S KotlinDebug\n*F\n+ 1 GetSetSecureParams.kt\ncom/bbva/plugin/localstorage/extension/GetSetSecureParamsKt\n*L\n12#1:32\n*E\n"})
public final class GetSetSecureParamsKt {
    @NotNull
    public static final Biometrics toBiometrics(@NotNull GetSetSecureParams getSetSecureParams) throws NullPointerException {
        Intrinsics.checkNotNullParameter(getSetSecureParams, "<this>");
        Biometrics.Companion companion = Biometrics.Companion;
        Biometrics.Builder builder = new Biometrics.Builder();
        String biometricTitle = getSetSecureParams.getBiometricTitle();
        Intrinsics.checkNotNull(biometricTitle);
        builder.setTitle(biometricTitle);
        String biometricSubtitle = getSetSecureParams.getBiometricSubtitle();
        Intrinsics.checkNotNull(biometricSubtitle);
        builder.setSubtitle(biometricSubtitle);
        String biometricDescription = getSetSecureParams.getBiometricDescription();
        Intrinsics.checkNotNull(biometricDescription);
        builder.setDescription(biometricDescription);
        String biometricNegativeButton = getSetSecureParams.getBiometricNegativeButton();
        Intrinsics.checkNotNull(biometricNegativeButton);
        builder.setNegativeButtonText(biometricNegativeButton);
        Boolean biometricConfirmation = getSetSecureParams.getBiometricConfirmation();
        Intrinsics.checkNotNull(biometricConfirmation);
        builder.setConfirmationRequired(biometricConfirmation.booleanValue());
        return builder.build();
    }

    @NotNull
    public static final BiometricsStorageData toBiometricsStorageData(@NotNull GetSetSecureParams getSetSecureParams, @NotNull FragmentActivity fragmentActivity, @NotNull Biometrics biometrics) throws NullPointerException {
        Intrinsics.checkNotNullParameter(getSetSecureParams, "<this>");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(biometrics, "biometrics");
        String authenticationType = getSetSecureParams.getAuthenticationType();
        Intrinsics.checkNotNull(authenticationType);
        AuthenticationType authenticationType2 = StringKt.toAuthenticationType(authenticationType);
        String key = getSetSecureParams.getKey();
        Intrinsics.checkNotNull(key);
        Boolean invalidateAliasByBiometricEnrollment = getSetSecureParams.getInvalidateAliasByBiometricEnrollment();
        Intrinsics.checkNotNull(invalidateAliasByBiometricEnrollment);
        return new BiometricsStorageData(fragmentActivity, biometrics, authenticationType2, key, invalidateAliasByBiometricEnrollment.booleanValue());
    }
}

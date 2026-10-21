package com.bbva.zoomauth.facialauth;

import android.graphics.Bitmap;
import com.facetec.sdk.FaceTecSDKStatus;
import com.facetec.sdk.FaceTecSessionStatus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FacialAuthCallback.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&¨\u0006\u0012"}, d2 = {"Lcom/bbva/zoomauth/facialauth/FacialAuthCallback;", "", "onDeviceLockedOut", "", "onFaceTecSessionStatusError", "zoomVerificationStatus", "Lcom/facetec/sdk/FaceTecSessionStatus;", "onFaceTecStatusError", "zoomSDKStatus", "Lcom/facetec/sdk/FaceTecSDKStatus;", "onFacialBiometricGenericError", "onFacialBiometricSuccess", "facialBiometricJson", "", "picture", "Landroid/graphics/Bitmap;", "onSDKFinishedLoading", "onUserCancelled", "zoomauth_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface FacialAuthCallback {
    void onDeviceLockedOut();

    void onFaceTecSessionStatusError(@Nullable FaceTecSessionStatus zoomVerificationStatus);

    void onFaceTecStatusError(@Nullable FaceTecSDKStatus zoomSDKStatus);

    void onFacialBiometricGenericError();

    void onFacialBiometricSuccess(@NotNull String facialBiometricJson, @Nullable Bitmap picture);

    void onSDKFinishedLoading();

    void onUserCancelled();
}

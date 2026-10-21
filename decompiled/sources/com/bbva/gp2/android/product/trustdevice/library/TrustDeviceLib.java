package com.bbva.gp2.android.product.trustdevice.library;

import android.content.Context;
import android.os.Bundle;
import com.bbva.gp2.android.product.trustdevice.library.utils.DeviceInfo;
import com.bbva.gp2.android.trustdevice.sdk.exceptions.InitNeededException;
import com.bbva.gp2.android.trustdevice.sdk.exceptions.SharedPreferencesClearingException;
import com.bbva.gp2.android.trustdevice.sdk.export.TrustDevice;
import com.bbva.gp2.android.trustdevice.sdk.export.callbacks.Callback;
import com.bbva.gp2.android.trustdevice.sdk.export.exceptions.CryptoException;
import com.bbva.gp2.android.trustdevice.sdk.export.exceptions.CryptoInitException;
import com.bbva.gp2.android.trustdevice.sdk.export.exceptions.RegisterNeededException;
import com.bbva.gp2.android.trustdevice.sdk.export.request.Device;
import ek.a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TrustDeviceLib.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/library/TrustDeviceLib;", "", "()V", "areKeysReady", "Lcom/bbva/gp2/android/product/trustdevice/library/TrustResult;", "", "deleteDeviceLocal", "isRegistered", "", "login", "pkcs7", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preRegister", "deviceInfoParam", "Lcom/bbva/gp2/android/product/trustdevice/library/utils/DeviceInfo;", "(Ljava/lang/String;Lcom/bbva/gp2/android/product/trustdevice/library/utils/DeviceInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPushToken", "pushToken", "setRegistrationToken", "did", "Companion", "payments-trustdevice_release"}, k = 1, mv = {1, 1, 16})
public final class TrustDeviceLib {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String JWS = "jws";

    @NotNull
    public static final String OK = "OK";

    /* JADX INFO: compiled from: TrustDeviceLib.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/library/TrustDeviceLib$Companion;", "", "()V", "JWS", "", "OK", "init", "", "context", "Landroid/content/Context;", "payments-trustdevice_release"}, k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void init(@NotNull Context context) {
            TrustDevice.INSTANCE.init(context);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bbva.gp2.android.trustdevice.sdk.exceptions.InitNeededException */
    @NotNull
    public final TrustResult<String> areKeysReady() throws InitNeededException {
        try {
            TrustDevice.INSTANCE.areKeysReady();
            return new TrustResult.Result("OK");
        } catch (Exception e5) {
            return ((e5 instanceof CryptoInitException) || (e5 instanceof CryptoException)) ? new TrustResult.Error(TrustError.LOGIN_NEEDED) : new TrustResult.Error(TrustError.INTERNAL_ERROR);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bbva.gp2.android.trustdevice.sdk.exceptions.InitNeededException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bbva.gp2.android.trustdevice.sdk.exceptions.SharedPreferencesClearingException */
    @NotNull
    public final TrustResult<String> deleteDeviceLocal() throws SharedPreferencesClearingException, InitNeededException {
        try {
            TrustDevice.INSTANCE.deleteDeviceLocal();
            return new TrustResult.Result("OK");
        } catch (Exception e5) {
            return ((e5 instanceof CryptoInitException) || (e5 instanceof CryptoException)) ? new TrustResult.Error(TrustError.LOGIN_NEEDED) : new TrustResult.Error(TrustError.INTERNAL_ERROR);
        }
    }

    @NotNull
    public final TrustResult<Boolean> isRegistered() {
        try {
            return new TrustResult.Result(Boolean.valueOf(TrustDevice.INSTANCE.isRegistered()));
        } catch (Exception unused) {
            return new TrustResult.Error(TrustError.INTERNAL_ERROR);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bbva.gp2.android.trustdevice.sdk.exceptions.InitNeededException */
    @Nullable
    public final Object login(@NotNull String str, @NotNull Continuation<? super TrustResult<String>> continuation) throws InitNeededException, RegisterNeededException {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        TrustDevice.INSTANCE.login(new Callback() { // from class: com.bbva.gp2.android.product.trustdevice.library.TrustDeviceLib$login$2$1
            @Override // com.bbva.gp2.android.trustdevice.sdk.export.callbacks.Callback
            public void onFailure(int code, @NotNull Bundle bundle) {
                safeContinuation.resumeWith(Result.m5535constructorimpl(new TrustResult.Error(TrustError.values()[code])));
            }

            @Override // com.bbva.gp2.android.trustdevice.sdk.export.callbacks.Callback
            public void onSuccess(@NotNull Bundle bundle) {
                safeContinuation.resumeWith(Result.m5535constructorimpl(new TrustResult.Result("OK")));
            }
        }, str);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bbva.gp2.android.trustdevice.sdk.exceptions.InitNeededException */
    @Nullable
    public final Object preRegister(@NotNull String str, @NotNull DeviceInfo deviceInfo, @NotNull Continuation<? super TrustResult<String>> continuation) throws InitNeededException {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        TrustDevice.INSTANCE.preRegister(new Callback() { // from class: com.bbva.gp2.android.product.trustdevice.library.TrustDeviceLib$preRegister$2$1
            @Override // com.bbva.gp2.android.trustdevice.sdk.export.callbacks.Callback
            public void onFailure(int code, @NotNull Bundle bundle) {
                safeContinuation.resumeWith(Result.m5535constructorimpl(new TrustResult.Error(TrustError.values()[code])));
            }

            @Override // com.bbva.gp2.android.trustdevice.sdk.export.callbacks.Callback
            public void onSuccess(@NotNull Bundle bundle) {
                safeContinuation.resumeWith(Result.m5535constructorimpl(new TrustResult.Result(String.valueOf(bundle.get(TrustDeviceLib.JWS)))));
            }
        }, str, new Device.Builder().id(deviceInfo.getId()).deviceType(deviceInfo.getDeviceType()).model(deviceInfo.getModel()).os(deviceInfo.getOs()).osVersion(deviceInfo.getOsVersion()).hasNFC(deviceInfo.getHasNFC()).build());
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bbva.gp2.android.trustdevice.sdk.exceptions.InitNeededException */
    @Nullable
    public final Object setPushToken(@NotNull String str, @NotNull Continuation<? super TrustResult<String>> continuation) throws InitNeededException, RegisterNeededException {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        TrustDevice.INSTANCE.setPushToken(new Callback() { // from class: com.bbva.gp2.android.product.trustdevice.library.TrustDeviceLib$setPushToken$2$1
            @Override // com.bbva.gp2.android.trustdevice.sdk.export.callbacks.Callback
            public void onFailure(int code, @NotNull Bundle bundle) {
                safeContinuation.resumeWith(Result.m5535constructorimpl(new TrustResult.Error(TrustError.values()[code])));
            }

            @Override // com.bbva.gp2.android.trustdevice.sdk.export.callbacks.Callback
            public void onSuccess(@NotNull Bundle bundle) {
                safeContinuation.resumeWith(Result.m5535constructorimpl(new TrustResult.Result("OK")));
            }
        }, str);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bbva.gp2.android.trustdevice.sdk.exceptions.InitNeededException */
    @NotNull
    public final TrustResult<String> setRegistrationToken(@NotNull String did) throws InitNeededException {
        try {
            TrustDevice.INSTANCE.setRegistrationToken(did);
            return new TrustResult.Result("OK");
        } catch (Exception unused) {
            return new TrustResult.Error(TrustError.INTERNAL_ERROR);
        }
    }
}

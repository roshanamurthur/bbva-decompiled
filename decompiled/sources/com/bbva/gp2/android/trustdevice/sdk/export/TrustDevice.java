package com.bbva.gp2.android.trustdevice.sdk.export;

import android.content.Context;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.gp2.android.trustdevice.sdk.exceptions.InitNeededException;
import com.bbva.gp2.android.trustdevice.sdk.exceptions.SharedPreferencesClearingException;
import com.bbva.gp2.android.trustdevice.sdk.export.callbacks.Callback;
import com.bbva.gp2.android.trustdevice.sdk.export.exceptions.CryptoException;
import com.bbva.gp2.android.trustdevice.sdk.export.exceptions.CryptoInitException;
import com.bbva.gp2.android.trustdevice.sdk.export.exceptions.LoadPropertiesException;
import com.bbva.gp2.android.trustdevice.sdk.export.exceptions.RegisterNeededException;
import com.bbva.gp2.android.trustdevice.sdk.export.request.Device;
import com.bbva.gp2.android.trustdevice.sdk.logic.LogicFactory;
import com.bbva.gp2.android.trustdevice.sdk.manager.ContextHolder;
import com.bbva.gp2.android.trustdevice.sdk.manager.ManagerFactory;
import com.bbva.gp2.android.trustdevice.sdk.service.ServiceFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TrustDevice.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/TrustDevice;", "", "()V", "Companion", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TrustDevice {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "TrustDevice";

    @NotNull
    private static String PRODUCT_ID = "TOHU_PLATFORM";

    /* JADX INFO: compiled from: TrustDevice.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0002J\u0006\u0010\u000e\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004J\u001e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/TrustDevice$Companion;", "", "()V", "PRODUCT_ID", "", "getPRODUCT_ID", "()Ljava/lang/String;", "setPRODUCT_ID", "(Ljava/lang/String;)V", "TAG", "kotlin.jvm.PlatformType", "areKeysReady", "", "checkInitCalled", "deleteDeviceLocal", "init", "context", "Landroid/content/Context;", "isRegistered", "", "login", "callback", "Lcom/bbva/gp2/android/trustdevice/sdk/export/callbacks/Callback;", "pkcs7", "preRegister", Constants.device, "Lcom/bbva/gp2/android/trustdevice/sdk/export/request/Device;", "setPushToken", "pushToken", "setRegistrationToken", "did", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void checkInitCalled() {
            ContextHolder.Companion.getContext();
        }

        public final void areKeysReady() throws CryptoInitException, LoadPropertiesException, InitNeededException {
            String unused = TrustDevice.TAG;
            checkInitCalled();
            LogicFactory.Companion.getAreKeyReadyLogic().doAreKeysReadyLogic();
        }

        public final void deleteDeviceLocal() throws CryptoInitException, LoadPropertiesException, SharedPreferencesClearingException, InitNeededException, CryptoException {
            String unused = TrustDevice.TAG;
            checkInitCalled();
            ServiceFactory.Companion.getDeleteDeviceLocal().deleteDeviceLocal();
        }

        @NotNull
        public final String getPRODUCT_ID() {
            return TrustDevice.PRODUCT_ID;
        }

        public final void init(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ContextHolder.Companion.setContext(context);
        }

        public final boolean isRegistered() throws InitNeededException {
            String unused = TrustDevice.TAG;
            checkInitCalled();
            return ServiceFactory.Companion.getRegisterService().isRegistered();
        }

        public final void login(@NotNull Callback callback, @NotNull String pkcs7) throws InitNeededException, RegisterNeededException {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(pkcs7, "pkcs7");
            String unused = TrustDevice.TAG;
            if (!isRegistered()) {
                throw new RegisterNeededException("Register is needed");
            }
            ManagerFactory.Companion.getCoroutineManager().login(callback, pkcs7);
        }

        public final void preRegister(@NotNull Callback callback, @NotNull String pkcs7, @NotNull Device device) throws InitNeededException {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(pkcs7, "pkcs7");
            Intrinsics.checkNotNullParameter(device, "device");
            String unused = TrustDevice.TAG;
            checkInitCalled();
            ManagerFactory.Companion.getCoroutineManager().preRegister(callback, pkcs7, device);
        }

        public final void setPRODUCT_ID(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            TrustDevice.PRODUCT_ID = str;
        }

        public final void setPushToken(@NotNull Callback callback, @NotNull String pushToken) throws InitNeededException, RegisterNeededException {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(pushToken, "pushToken");
            String unused = TrustDevice.TAG;
            if (isRegistered()) {
                ManagerFactory.Companion.getCoroutineManager().sendPushToken(callback, pushToken);
            }
        }

        public final void setRegistrationToken(@NotNull String did) throws InitNeededException {
            Intrinsics.checkNotNullParameter(did, "did");
            checkInitCalled();
            ServiceFactory.Companion.getRegistrationTokenService().setRegistrationToken(did);
        }
    }
}

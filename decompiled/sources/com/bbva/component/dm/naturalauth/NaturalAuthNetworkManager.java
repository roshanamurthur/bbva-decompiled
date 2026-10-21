package com.bbva.component.dm.naturalauth;

import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NaturalAuthNetworkManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/naturalauth/NaturalAuthNetworkManager;", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoNetworkManager;", "finishOobAuthentication", "", "fidoPayload", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;", "callback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoNetworkManager$OobAuthenticateCallback;", "finishOobRegistration", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoNetworkManager$OobRegisterCallback;", "finishSign", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "Lcom/bbva/sl/ar/android/secsdk/fido/FidoNetworkManager$FidoNetworkSignCallback;", "initOobAuthentication", "initOobRegistration", "initSign", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface NaturalAuthNetworkManager extends FidoNetworkManager {

    /* JADX INFO: compiled from: NaturalAuthNetworkManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void finishOobAuthentication(@NotNull NaturalAuthNetworkManager naturalAuthNetworkManager, @NotNull FidoPayload fidoPayload, @NotNull FidoNetworkManager.OobAuthenticateCallback callback) {
            Intrinsics.checkNotNullParameter(fidoPayload, "fidoPayload");
            Intrinsics.checkNotNullParameter(callback, "callback");
        }

        public static void finishOobRegistration(@NotNull NaturalAuthNetworkManager naturalAuthNetworkManager, @NotNull FidoPayload fidoPayload, @NotNull FidoNetworkManager.OobRegisterCallback callback) {
            Intrinsics.checkNotNullParameter(fidoPayload, "fidoPayload");
            Intrinsics.checkNotNullParameter(callback, "callback");
        }

        public static void finishSign(@NotNull NaturalAuthNetworkManager naturalAuthNetworkManager, @NotNull FidoPayload payload, @NotNull FidoNetworkManager.FidoNetworkSignCallback callback) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(callback, "callback");
        }

        public static void initOobAuthentication(@NotNull NaturalAuthNetworkManager naturalAuthNetworkManager, @NotNull FidoPayload fidoPayload, @NotNull FidoNetworkManager.OobAuthenticateCallback callback) {
            Intrinsics.checkNotNullParameter(fidoPayload, "fidoPayload");
            Intrinsics.checkNotNullParameter(callback, "callback");
        }

        public static void initOobRegistration(@NotNull NaturalAuthNetworkManager naturalAuthNetworkManager, @NotNull FidoPayload fidoPayload, @NotNull FidoNetworkManager.OobRegisterCallback callback) {
            Intrinsics.checkNotNullParameter(fidoPayload, "fidoPayload");
            Intrinsics.checkNotNullParameter(callback, "callback");
        }

        public static void initSign(@NotNull NaturalAuthNetworkManager naturalAuthNetworkManager, @NotNull FidoPayload payload, @NotNull FidoNetworkManager.FidoNetworkSignCallback callback) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    void finishOobAuthentication(@NotNull FidoPayload fidoPayload, @NotNull FidoNetworkManager.OobAuthenticateCallback callback);

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    void finishOobRegistration(@NotNull FidoPayload fidoPayload, @NotNull FidoNetworkManager.OobRegisterCallback callback);

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    void finishSign(@NotNull FidoPayload payload, @NotNull FidoNetworkManager.FidoNetworkSignCallback callback);

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    void initOobAuthentication(@NotNull FidoPayload fidoPayload, @NotNull FidoNetworkManager.OobAuthenticateCallback callback);

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    void initOobRegistration(@NotNull FidoPayload fidoPayload, @NotNull FidoNetworkManager.OobRegisterCallback callback);

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager
    void initSign(@NotNull FidoPayload payload, @NotNull FidoNetworkManager.FidoNetworkSignCallback callback);
}

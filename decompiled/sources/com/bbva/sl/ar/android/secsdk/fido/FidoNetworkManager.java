package com.bbva.sl.ar.android.secsdk.fido;

import androidx.annotation.NonNull;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoDevice;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoPayload;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoResult;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface FidoNetworkManager {

    public interface FidoNetworkAuthenticateCallback {
        void didFinishAuthentication(FidoResult fidoResult);

        void didInitAuthentication(FidoResult fidoResult);
    }

    public interface FidoNetworkDeleteAuthenticatorsCallback {
        void didDelete(String str, FidoResult fidoResult);

        void didDeleteAll(FidoResult fidoResult);
    }

    public interface FidoNetworkListRegisteredAuthenticatorsCallback {
        void didListRegisteredAuthenticators(List<FidoDevice> list);

        void listRegisteredAuthenticatorsFailed(FidoException fidoException);
    }

    public interface FidoNetworkRegisterCallback {
        void didFinishRegistration(FidoResult fidoResult);

        void didInitRegistration(FidoResult fidoResult);
    }

    public interface FidoNetworkSignCallback {
        void didFinishSign(FidoResult fidoResult);

        void didInitSign(FidoResult fidoResult);
    }

    public interface OobAuthenticateCallback {
        void didFinishOobAuthentication(FidoResult fidoResult);

        void didInitOobAuthentication(FidoResult fidoResult);
    }

    public interface OobRegisterCallback {
        void didFinishOobRegistration(FidoResult fidoResult);

        void didInitOobRegistration(FidoResult fidoResult);
    }

    void deleteAllAuthenticators(@NonNull FidoPayload fidoPayload, @NonNull FidoNetworkDeleteAuthenticatorsCallback fidoNetworkDeleteAuthenticatorsCallback);

    void deleteAllAuthenticatorsFromDevice(@NonNull String str, @NonNull FidoPayload fidoPayload, @NonNull FidoNetworkDeleteAuthenticatorsCallback fidoNetworkDeleteAuthenticatorsCallback);

    void deleteAuthenticator(@NonNull String str, @NonNull String str2, @NonNull FidoPayload fidoPayload, @NonNull FidoNetworkDeleteAuthenticatorsCallback fidoNetworkDeleteAuthenticatorsCallback);

    void finishAuthentication(@NonNull FidoPayload fidoPayload, @NonNull FidoNetworkAuthenticateCallback fidoNetworkAuthenticateCallback);

    void finishOobAuthentication(@NonNull FidoPayload fidoPayload, @NonNull OobAuthenticateCallback oobAuthenticateCallback);

    void finishOobRegistration(@NonNull FidoPayload fidoPayload, @NonNull OobRegisterCallback oobRegisterCallback);

    void finishRegistration(@NonNull FidoPayload fidoPayload, @NonNull FidoNetworkRegisterCallback fidoNetworkRegisterCallback);

    void finishSign(@NonNull FidoPayload fidoPayload, @NonNull FidoNetworkSignCallback fidoNetworkSignCallback);

    void initAuthentication(@NonNull FidoPayload fidoPayload, @NonNull FidoNetworkAuthenticateCallback fidoNetworkAuthenticateCallback);

    void initOobAuthentication(@NonNull FidoPayload fidoPayload, @NonNull OobAuthenticateCallback oobAuthenticateCallback);

    void initOobRegistration(@NonNull FidoPayload fidoPayload, @NonNull OobRegisterCallback oobRegisterCallback);

    void initRegistration(@NonNull FidoPayload fidoPayload, @NonNull FidoNetworkRegisterCallback fidoNetworkRegisterCallback);

    void initSign(@NonNull FidoPayload fidoPayload, @NonNull FidoNetworkSignCallback fidoNetworkSignCallback);

    void listRegisteredAuthenticators(@NonNull FidoPayload fidoPayload, @NonNull FidoNetworkListRegisteredAuthenticatorsCallback fidoNetworkListRegisteredAuthenticatorsCallback);

    void quickAuthentication(@NonNull FidoPayload fidoPayload, @NonNull FidoNetworkAuthenticateCallback fidoNetworkAuthenticateCallback);
}

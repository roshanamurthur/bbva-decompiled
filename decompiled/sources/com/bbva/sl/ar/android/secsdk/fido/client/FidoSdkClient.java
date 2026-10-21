package com.bbva.sl.ar.android.secsdk.fido.client;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bbva.sl.ar.android.secsdk.fido.BiometricCapability;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.DiscoverData;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public interface FidoSdkClient {
    boolean checkAuthPossible(Activity activity, String str, String str2);

    void clearLocalRegistrations(Activity activity, String str, String str2);

    Set<BiometricCapability> getBiometricCapabilities(@NonNull Activity activity);

    DiscoverData getCapabilities(@NonNull Activity activity);

    String getDeviceId();

    String getFacetId() throws FidoException;

    void initClient(Protocol protocol) throws FidoException;

    String initOperation(Activity activity, Operation operation, boolean z10, @Nullable String str) throws FidoException;

    String process(Activity activity, Operation operation, String str, boolean z10, boolean z11, @Nullable String str2, FidoSession fidoSession) throws FidoException;

    void processQuickAuth(Operation operation, String str, FidoSession fidoSession);

    void setQuickAuthEnabled(boolean z10);
}

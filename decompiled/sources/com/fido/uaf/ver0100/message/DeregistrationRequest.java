package com.fido.uaf.ver0100.message;

import com.fido.android.framework.service.Mfac;
import com.fido.uaf.ver0100.types.DeregisterAuthenticator;
import com.fido.uaf.ver0100.types.OperationHeader;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.asm.api.uaf.json.Validator;
import com.noknok.android.client.asm.api.uaf.json.Version;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Logger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DeregistrationRequest extends UafRequest {

    @Expose
    public final List<DeregisterAuthenticator> authenticators;

    public DeregistrationRequest(String str) {
        OperationHeader operationHeader = this.header;
        operationHeader.op = OperationHeader.OperationType.Dereg;
        operationHeader.appID = str;
        this.authenticators = new ArrayList();
    }

    @Override // com.fido.uaf.ver0100.message.UafMessage
    public boolean isValid() {
        List<DeregisterAuthenticator> list = this.authenticators;
        if (list == null || list.size() == 0) {
            Logger.e("DeregistrationRequest", "No authenticators list provided");
            return false;
        }
        for (DeregisterAuthenticator deregisterAuthenticator : this.authenticators) {
            String str = deregisterAuthenticator.aaid;
            if (str == null || deregisterAuthenticator.keyID == null) {
                Logger.e("DeregistrationRequest", "Either AAID or KeyID is null");
                return false;
            }
            if ((str.isEmpty() || deregisterAuthenticator.keyID.isEmpty()) && this.header.upv.equals(new Version((short) 1, (short) 0)) && Mfac.Instance().getConfig().get(AppSDKConfig.Key.strictUpv10).getAsBoolean()) {
                Logger.e("DeregistrationRequest", "Deregister All operation is not allowed");
                return false;
            }
            if (deregisterAuthenticator.aaid.isEmpty()) {
                if (!deregisterAuthenticator.keyID.isEmpty()) {
                    Logger.e("DeregistrationRequest", "AAID is empty but KeyID is not");
                    return false;
                }
            } else {
                if (!Validator.isValidAAID(deregisterAuthenticator.aaid)) {
                    Logger.e("DeregistrationRequest", "AAID format is invalid");
                    return false;
                }
                if (!deregisterAuthenticator.keyID.isEmpty() && !Validator.isValidBase64Format(deregisterAuthenticator.keyID, 32, 2048)) {
                    Logger.e("DeregistrationRequest", "KeyID format is invalid");
                    return false;
                }
            }
        }
        return true;
    }
}

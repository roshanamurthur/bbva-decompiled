package com.fido.uaf.ver0100.message;

import com.fido.android.framework.service.Mfac;
import com.fido.uaf.ver0100.types.OperationHeader;
import com.fido.uaf.ver0100.types.Policy;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.asm.api.uaf.json.AuthenticateIn;
import com.noknok.android.client.asm.api.uaf.json.Validator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class AuthenticationRequest extends UafRequest {

    @Expose
    public String challenge;

    @Expose
    public Policy policy;

    @Expose
    public List<AuthenticateIn.Transaction> transaction;

    public AuthenticationRequest(String str) {
        OperationHeader operationHeader = this.header;
        operationHeader.appID = str;
        operationHeader.op = OperationHeader.OperationType.Auth;
    }

    @Override // com.fido.uaf.ver0100.message.UafMessage
    public boolean isValid() {
        Policy policy = this.policy;
        if (policy != null && policy.isValid() && Validator.isValidServerChallenge(this.challenge)) {
            List<AuthenticateIn.Transaction> list = this.transaction;
            if (list != null) {
                if (!list.isEmpty()) {
                    for (AuthenticateIn.Transaction transaction : list) {
                        if (transaction == null || !transaction.isValid(Mfac.Instance().getContext())) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}

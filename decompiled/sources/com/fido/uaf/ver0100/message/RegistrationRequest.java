package com.fido.uaf.ver0100.message;

import com.fido.uaf.ver0100.types.OperationHeader;
import com.fido.uaf.ver0100.types.Policy;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.asm.api.uaf.json.Validator;

/* JADX INFO: loaded from: classes9.dex */
public class RegistrationRequest extends UafRequest {

    @Expose
    public String challenge;

    @Expose
    public Policy policy;

    @Expose
    public String username;

    public RegistrationRequest(String str) {
        this.header.setOp(OperationHeader.OperationType.Reg);
        this.header.appID = str;
    }

    @Override // com.fido.uaf.ver0100.message.UafMessage
    public boolean isValid() {
        String str;
        Policy policy = this.policy;
        return policy != null && policy.isValid() && Validator.isValidServerChallenge(this.challenge) && (str = this.username) != null && !str.isEmpty() && this.username.length() <= 128;
    }
}

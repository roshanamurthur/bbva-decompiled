package com.fido.uaf.ver0100.message;

import com.fido.uaf.ver0100.types.AuthenticatorSignAssertion;
import com.fido.uaf.ver0100.types.OperationHeader;
import com.google.gson.annotations.Expose;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class AuthenticationResponse extends UafResponse {

    @Expose
    public List<AuthenticatorSignAssertion> assertions;

    @Expose
    public String fcParams;

    public AuthenticationResponse(String str) {
        OperationHeader operationHeader = this.header;
        operationHeader.op = OperationHeader.OperationType.Auth;
        operationHeader.appID = str;
    }
}

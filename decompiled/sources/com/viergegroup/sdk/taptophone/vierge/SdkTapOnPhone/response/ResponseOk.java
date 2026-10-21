package com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.response;

/* JADX INFO: loaded from: classes7.dex */
public class ResponseOk extends Response {
    public ResponseOk() {
        this.codResponse = this.RESPONSE_SUCCESS;
    }

    public Response setMsg(String str) {
        this.msg = str;
        return this;
    }

    public Response setStatus(String str) {
        this.status = str;
        return this;
    }

    public ResponseOk(String str) {
        this.codResponse = this.RESPONSE_SUCCESS;
        this.msg = str;
    }
}

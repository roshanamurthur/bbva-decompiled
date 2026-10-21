package com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.response;

/* JADX INFO: loaded from: classes7.dex */
public class ResponseError extends Response {
    public ResponseError() {
        this.codResponse = this.RESPONSE_ERROR;
    }

    public Response setMsg(String str) {
        this.msg = str;
        return this;
    }

    public Response setStatus(String str) {
        this.status = str;
        return this;
    }

    public ResponseError(String str) {
        this.codResponse = this.RESPONSE_ERROR;
        this.msg = str;
    }
}

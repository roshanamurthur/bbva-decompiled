package com.bbva.sl.ar.android.libkeymanagement.exception;

import com.bbva.sl.ar.android.libkeymanagement.communication.dto.ResponseErrorDTO;

/* JADX INFO: loaded from: classes8.dex */
public class KeyManagementServerException extends KeyManagementException {
    private static final String UNDEFINED = "undefined";
    private static final long serialVersionUID = 6791351532710359598L;

    public KeyManagementServerException(String str, String str2) {
        super(buildCode(str), str2);
    }

    private static String buildCode(String str) {
        if (str == null) {
            str = "undefined";
        }
        return ReturnCode.ERR_SERVER.concat(str);
    }

    public KeyManagementServerException(ResponseErrorDTO responseErrorDTO) {
        this(responseErrorDTO.getMessages().get(0).getCode(), responseErrorDTO.getMessages().get(0).getMessage());
    }
}

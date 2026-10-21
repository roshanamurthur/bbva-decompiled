package com.bbva.sl.ar.android.libkeymanagement.exception;

import com.bbva.sl.ar.keymng.result.StatusInfo;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes8.dex */
public class KeyManagementException extends Exception {
    private static final long serialVersionUID = 1;
    private final String errorCode;
    private final String errorDesc;

    public KeyManagementException(String str, String str2) {
        super(buildExceptionMessage(str, str2));
        this.errorCode = str;
        this.errorDesc = str2;
    }

    private static String buildExceptionMessage(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str2 != null) {
            sb2.append(str2);
        }
        if (str != null) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(Constant.BRACKET_OPEN);
            sb2.append(str);
            sb2.append(Constant.BRACKET_CLOSE);
        }
        return sb2.toString();
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorDesc() {
        return this.errorDesc;
    }

    public KeyManagementException(String str, String str2, Throwable th2) {
        super(buildExceptionMessage(str, str2), th2);
        this.errorCode = str;
        this.errorDesc = str2;
    }

    public KeyManagementException(ErrorCodeEnum errorCodeEnum) {
        this(errorCodeEnum.stringValue(), errorCodeEnum.defaultMessage());
    }

    public KeyManagementException(ErrorCodeEnum errorCodeEnum, Throwable th2) {
        this(errorCodeEnum.stringValue(), errorCodeEnum.defaultMessage(), th2);
    }

    public KeyManagementException(ErrorCodeEnum errorCodeEnum, String str) {
        this(str, errorCodeEnum.defaultMessage());
    }

    public KeyManagementException(ErrorCodeEnum errorCodeEnum, String str, Throwable th2) {
        this(str, errorCodeEnum.defaultMessage(), th2);
    }

    public KeyManagementException(StatusInfo statusInfo) {
        this(Integer.toString(statusInfo.getRc()), statusInfo.getRcDesc());
    }
}

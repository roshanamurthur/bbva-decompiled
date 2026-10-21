package com.bbva.sl.ar.android.libkeymanagement.communication.dto;

import com.bbva.sl.ar.android.libkeymanagement.exception.ErrorCodeEnum;
import com.bbva.sl.ar.android.libkeymanagement.exception.KeyManagementException;
import com.bbva.sl.ar.android.libkeymanagement.validation.ArgumentValidator;
import com.bbva.sl.ar.keymng.common.exception.JSONManagementException;
import com.bbva.sl.ar.keymng.common.json.JSONManager;
import com.fasterxml.jackson.annotation.JsonProperty;

/* JADX INFO: loaded from: classes8.dex */
public class ConfirmResponseDTO {
    private static final String MSG_ATTR = "msg";
    private String msg;

    public ConfirmResponseDTO() {
    }

    public static ConfirmResponseDTO parse(String str) throws KeyManagementException {
        ArgumentValidator.validateNotEmptyString(str, "json");
        try {
            return (ConfirmResponseDTO) new JSONManager().parseObject(str, ConfirmResponseDTO.class);
        } catch (JSONManagementException e5) {
            throw new KeyManagementException(ErrorCodeEnum.ERR_GENERAL_JSON_PARSING, (Throwable) e5);
        }
    }

    @JsonProperty("msg")
    public String getMsg() {
        return this.msg;
    }

    @JsonProperty("msg")
    public void setMsg(String str) {
        this.msg = str;
    }

    public ConfirmResponseDTO(String str) {
        this.msg = str;
    }
}

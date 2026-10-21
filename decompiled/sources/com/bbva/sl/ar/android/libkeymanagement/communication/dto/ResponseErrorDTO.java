package com.bbva.sl.ar.android.libkeymanagement.communication.dto;

import com.bbva.sl.ar.android.libkeymanagement.exception.ErrorCodeEnum;
import com.bbva.sl.ar.android.libkeymanagement.exception.KeyManagementException;
import com.bbva.sl.ar.android.libkeymanagement.validation.ArgumentValidator;
import com.bbva.sl.ar.keymng.common.exception.JSONManagementException;
import com.bbva.sl.ar.keymng.common.json.JSONManager;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ResponseErrorDTO {
    private static final String MESSAGES_ATTR = "messages";
    private List<ErrorMessage> messages;

    public ResponseErrorDTO() {
    }

    public ResponseErrorDTO(List<ErrorMessage> list) {
        this.messages = list;
    }

    public static ResponseErrorDTO parse(String str) throws KeyManagementException {
        ArgumentValidator.validateNotEmptyString(str, "json");
        try {
            return (ResponseErrorDTO) new JSONManager().parseObject(str, ResponseErrorDTO.class);
        } catch (JSONManagementException e5) {
            throw new KeyManagementException(ErrorCodeEnum.ERR_GENERAL_JSON_PARSING, (Throwable) e5);
        }
    }

    @JsonProperty("messages")
    public List<ErrorMessage> getMessages() {
        return this.messages;
    }

    @JsonProperty("messages")
    public void setMessages(List<ErrorMessage> list) {
        this.messages = list;
    }
}

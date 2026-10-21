package com.bbva.sl.ar.android.libkeymanagement.communication.dto;

import com.bbva.sl.ar.keymng.common.error.ErrorType;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ErrorMessage {
    private String code;
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<ErrorParam> parameters;
    private ErrorType type;

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public List<ErrorParam> getParameters() {
        return this.parameters;
    }

    public ErrorType getType() {
        return this.type;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setParameters(List<ErrorParam> list) {
        this.parameters = list;
    }

    public void setType(ErrorType errorType) {
        this.type = errorType;
    }
}

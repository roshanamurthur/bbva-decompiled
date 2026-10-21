package com.bbva.sl.ar.android.libkeymanagement.communication.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/* JADX INFO: loaded from: classes8.dex */
public class ResponseWrapperDTO<T> {
    public static final String DATA_ATTR = "data";
    private T data;

    public ResponseWrapperDTO() {
    }

    public ResponseWrapperDTO<T> data(T t10) {
        this.data = t10;
        return this;
    }

    @JsonProperty("data")
    public T getData() {
        return this.data;
    }

    @JsonProperty("data")
    public void setData(T t10) {
        this.data = t10;
    }

    public ResponseWrapperDTO(T t10) {
        this.data = t10;
    }
}

package com.bbva.sl.ar.android.secsdk.fido.model;

import androidx.annotation.Nullable;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;

/* JADX INFO: loaded from: classes8.dex */
public class FidoResult {
    private FidoException fidoException;
    private FidoPayload fidoPayload;

    public FidoResult(FidoPayload fidoPayload) {
        this.fidoPayload = fidoPayload;
    }

    @Nullable
    public FidoException getFidoException() {
        return this.fidoException;
    }

    @Nullable
    public FidoPayload getFidoPayload() {
        return this.fidoPayload;
    }

    public String getMessage() {
        return getFidoPayload().getMessage();
    }

    public boolean isSuccess() {
        return this.fidoException == null;
    }

    public FidoResult(FidoException fidoException) {
        this.fidoException = fidoException;
    }
}

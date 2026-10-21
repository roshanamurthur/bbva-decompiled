package com.fido.uaf.ver0100.message;

import com.fido.uaf.ver0100.types.OperationHeader;
import com.google.gson.annotations.Expose;

/* JADX INFO: loaded from: classes9.dex */
public class UafMessage extends UafJson {

    @Expose
    public OperationHeader header = new OperationHeader();

    public OperationHeader.OperationType getOperationType() {
        return this.header.op;
    }

    public boolean isValid() {
        OperationHeader operationHeader = this.header;
        return operationHeader != null && operationHeader.isValid();
    }
}

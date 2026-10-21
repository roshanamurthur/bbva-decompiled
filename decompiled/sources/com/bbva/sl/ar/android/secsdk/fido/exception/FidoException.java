package com.bbva.sl.ar.android.secsdk.fido.exception;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.sl.ar.android.secsdk.fido.client.Operation;
import com.bbva.sl.ar.android.secsdk.fido.error.FidoError;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class FidoException extends Exception {
    private static final String DEFAULT_TAG = "com.bbva.sl.ar.android.secsdk.fido.exception.FidoException";
    protected FidoError fidoError;
    protected Operation operation;
    private String processMessage;
    private String sdkClientCode;

    public static class Builder {
        private Throwable cause;
        private String errorInfo;
        private FidoError fidoError;
        private Operation operation;
        private String processMessage;
        private String sdkClientCode;

        public Builder(FidoError fidoError) {
            this.fidoError = fidoError;
        }

        public FidoException build() {
            return new FidoException(this.fidoError, this.operation, this.sdkClientCode, this.errorInfo, this.cause, this.processMessage);
        }

        public Builder cause(Throwable th2) {
            this.cause = th2;
            return this;
        }

        public Builder errorInfo(String str) {
            this.errorInfo = str;
            return this;
        }

        public Builder operation(Operation operation) {
            this.operation = operation;
            return this;
        }

        public Builder processMessage(String str) {
            this.processMessage = str;
            return this;
        }

        public Builder sdkClientCode(String str) {
            this.sdkClientCode = str;
            return this;
        }
    }

    public FidoException(FidoError fidoError, Operation operation, String str, String str2, Throwable th2, String str3) {
        super(str2, th2);
        FidoError fidoError2 = FidoError.NOT_SET;
        this.fidoError = fidoError2;
        this.fidoError = fidoError == null ? fidoError2 : fidoError;
        this.operation = operation;
        this.sdkClientCode = str;
        this.processMessage = str3;
    }

    public String getErrorCode() {
        return this.fidoError.getCode();
    }

    public String getErrorInfo() {
        return super.getMessage();
    }

    public FidoError getFidoError() {
        return this.fidoError;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        if (this.operation != null) {
            arrayList.add("Operation: " + this.operation.name());
        }
        String str = this.sdkClientCode;
        if (str != null && !str.isEmpty()) {
            arrayList.add("Client code: " + this.sdkClientCode);
        }
        if (super.getMessage() != null && !getErrorInfo().isEmpty()) {
            arrayList.add("Error Info: " + getErrorInfo());
        }
        String str2 = this.processMessage;
        if (str2 != null && !str2.isEmpty()) {
            arrayList.add("Process Message: " + this.processMessage);
        }
        if (super.getCause() != null && super.getCause().getMessage() != null && !super.getCause().getMessage().isEmpty()) {
            String message = super.getCause().getMessage();
            if (super.getCause() instanceof FidoException) {
                message = ((FidoException) super.getCause()).getErrorInfo();
            }
            arrayList.add("Cause: " + message);
        }
        String str3 = "Code: " + this.fidoError.getCode() + "\nMessage: " + this.fidoError.getGenericMessage();
        if (arrayList.isEmpty()) {
            return str3;
        }
        StringBuilder sb2 = new StringBuilder(str3);
        sb2.append(RootService.LINE_BREAK);
        sb2.append((String) arrayList.get(0));
        if (arrayList.size() > 1) {
            for (int i10 = 1; i10 < arrayList.size(); i10++) {
                sb2.append(RootService.LINE_BREAK);
                sb2.append((String) arrayList.get(i10));
            }
        }
        return sb2.toString();
    }

    public Operation getOperation() {
        return this.operation;
    }

    public String getProcessMessage() {
        return this.processMessage;
    }

    public String getSdkClientCode() {
        return this.sdkClientCode;
    }

    public FidoException log(String str) {
        return this;
    }

    public void setFidoError(FidoError fidoError) {
        this.fidoError = fidoError;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }

    public FidoException log() {
        return log(null);
    }

    public FidoException print() {
        return this;
    }
}

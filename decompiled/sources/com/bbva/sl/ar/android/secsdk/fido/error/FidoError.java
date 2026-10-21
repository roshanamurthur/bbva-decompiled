package com.bbva.sl.ar.android.secsdk.fido.error;

import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes8.dex */
public enum FidoError {
    NOT_SET("Error not set"),
    SDK_CONFIG("Error in config file"),
    CLIENT_INITIALIZATION("Error initializing FIDO client"),
    CLIENT_OOB_INITIALIZATION("Error initializing OOB capabilities"),
    CLIENT_INIT_OPERATION("Client failed while initializing the operation"),
    CLIENT_PROCESS_OPERATION("Client failed while processing the operation"),
    CLIENT_APPID_EXTRACTION("Error extracting the 'appId' property"),
    SDK_SETUP("Error setting up the SDK"),
    SDK_BAD_THREAD("Invalid thread"),
    SDK_INITIALIZATION("The SDK is not initialized"),
    SDK_BAD_SESSION("FidoSession object is invalid"),
    SDK_REGISTER_OPERATION("SDK failed trying to register an authenticator"),
    SDK_LIST_OPERATION("SDK failed trying to retrieve the list of registered authenticators"),
    SDK_AUTHENTICATE_OPERATION("SDK failed trying to authenticate"),
    SDK_DELETE_ONE_OPERATION("SDK failed trying to delete one authenticator"),
    SDK_DELETE_ALL_OPERATION("SDK failed trying to delete all authenticators"),
    SDK_SYNC("SDK failed syncing with the server"),
    SDK_OOB_OPERATION("SDK failed executing an OOB operation"),
    SDK_TOO_MANY_REQUESTS("The SDK is already processing this operation"),
    SDK_DISCOVER_CAPABILITIES("The SDK failed to discover biometric authenticator capabilities"),
    SDK_DISCOVER_GENERIC_CAPABILITIES("The SDK failed to discover authenticator capabilities"),
    SDK_QUICK_AUTH_DATA("The SDK failed trying to obtain quick auth data"),
    SDK_FIDO_NETWORK("Error in service connection");

    private String code;
    private String genericMessage;

    FidoError(String str) {
        this.genericMessage = str;
    }

    public String getCode() {
        String str = this.code;
        return str == null ? name() : str;
    }

    public String getGenericMessage() {
        return this.genericMessage;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setGenericMessage(String str) {
        this.genericMessage = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Constant.BRACKET_OPEN + getCode() + "] " + getGenericMessage();
    }
}

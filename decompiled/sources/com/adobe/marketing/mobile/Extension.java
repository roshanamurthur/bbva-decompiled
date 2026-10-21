package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Extension {
    private ExtensionApi extensionApi;

    public Extension(ExtensionApi extensionApi) {
        this.extensionApi = extensionApi;
    }

    private String getLogTag() {
        ExtensionApi extensionApi = this.extensionApi;
        return extensionApi != null ? extensionApi.getLogTag() : getName();
    }

    public final ExtensionApi getApi() {
        return this.extensionApi;
    }

    public String getFriendlyName() {
        return null;
    }

    public abstract String getName();

    public String getVersion() {
        return null;
    }

    public void onUnexpectedError(ExtensionUnexpectedError extensionUnexpectedError) {
        ExtensionError errorCode = extensionUnexpectedError != null ? extensionUnexpectedError.getErrorCode() : null;
        if (errorCode != null) {
            Log.error(getLogTag(), "Extension processing failed with error code: %s (%s), error message: %s", Integer.valueOf(errorCode.getErrorCode()), errorCode.getErrorName(), extensionUnexpectedError.getMessage());
        }
    }

    public void onUnregistered() {
        Log.debug(getLogTag(), "Extension unregistered successfully.", new Object[0]);
    }
}

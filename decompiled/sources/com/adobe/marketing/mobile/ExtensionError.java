package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
public class ExtensionError extends AdobeError {
    private static final long serialVersionUID = 1;
    static final ExtensionError UNEXPECTED_ERROR = new ExtensionError("extension.unexpected", 0);
    static final ExtensionError BAD_NAME = new ExtensionError("extension.bad_extension_name", 1);
    static final ExtensionError DUPLICATE_NAME = new ExtensionError("extension.dup_extension_name", 2);
    static final ExtensionError EVENT_TYPE_NOT_SUPPORTED = new ExtensionError("extension.event_type_not_supported", 3);
    static final ExtensionError EVENT_SOURCE_NOT_SUPPORTED = new ExtensionError("extension.event_source_not_supported", 4);
    static final ExtensionError EVENT_DATA_NOT_SUPPORTED = new ExtensionError("extension.event_data_not_supported", 5);
    static final ExtensionError EVENT_NULL = new ExtensionError("extension.event_null", 6);
    static final ExtensionError LISTENER_TIMEOUT = new ExtensionError("extension.listener_timeout_exception", 8);
    static final ExtensionError CALLBACK_NULL = new ExtensionError("extension.callback_null", 9);

    private ExtensionError(String str, int i10) {
        super(str, i10);
    }
}

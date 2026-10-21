package com.bbva.sdkcatalog.openpay.plugin.data.error;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OpenPayError.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/error/ErrorCodes;", "", "<init>", "()V", "GENERIC", "", "INCORRECT_PARAMETERS", "INIT", "BLUETOOTH_DISABLED", "LOCATION_PERMISSION", "BLUETOOTH_PERMISSION", "STORAGE_PERMISSION", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ErrorCodes {
    public static final int BLUETOOTH_DISABLED = 702;
    public static final int BLUETOOTH_PERMISSION = 721;
    public static final int GENERIC = 0;
    public static final int INCORRECT_PARAMETERS = 1;
    public static final int INIT = 100;

    @NotNull
    public static final ErrorCodes INSTANCE = new ErrorCodes();
    public static final int LOCATION_PERMISSION = 720;
    public static final int STORAGE_PERMISSION = 722;

    private ErrorCodes() {
    }
}

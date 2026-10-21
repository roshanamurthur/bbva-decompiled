package com.bbva.ethermobilesdk.token.plugin.model;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PluginEtherTokenError.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/token/plugin/model/PluginEtherTokenError;", "", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "getCode", "", "getMessage", "code", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "description", "Ljava/lang/String;", "CLIENT_NOT_INITIALIZED", "DENIED_STORAGE_ACCESS", "TOKEN_NOT_FOUND", "INVALID_OCRA_SUITE", "TOKEN_IS_NOT_ACTIVE", "BAD_TOKEN_ACTIVATION", "ethertoken-plugin_release"}, k = 1, mv = {1, 8, 0})
public enum PluginEtherTokenError implements ErrorMessage {
    CLIENT_NOT_INITIALIZED(ReturnCode.ERR_INIT, "Ether token client hasn't been initialized"),
    DENIED_STORAGE_ACCESS(ReturnCode.ERR_INIT_GENERAL, "The storage has denied the access"),
    TOKEN_NOT_FOUND(ReturnCode.ERR_INIT_BAD_PARAMS, "Token not found"),
    INVALID_OCRA_SUITE(ReturnCode.ERR_INIT_NODEVICEUID, "Invalid ocra suite configuration"),
    TOKEN_IS_NOT_ACTIVE(ReturnCode.ERR_INIT_DEVICEID_ALREADY_DEFINED, "Token hasn't been activated"),
    BAD_TOKEN_ACTIVATION(ReturnCode.ERR_INIT_INVALID_CUSTOM_ID, "Token activation failed");

    private final int code;

    @NotNull
    private final String description;

    PluginEtherTokenError(int i10, String str) {
        this.code = i10;
        this.description = str;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    public int getCode() {
        return this.code;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    /* JADX INFO: renamed from: getMessage, reason: from getter */
    public String getDescription() {
        return this.description;
    }
}

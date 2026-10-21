package com.bbva.ethermobilesdk.plugin.model;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PluginCipherError.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/model/PluginCipherError;", "", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "getCode", "", "getMessage", "code", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "description", "Ljava/lang/String;", "UNKNOWN_ERROR", "CLIENT_NOT_INITIALIZED", "INVALID_KEY_PAIR", "KEY_TAG_NOT_FOUND", "ERROR_DURING_ENCRYPTION", "INVALID_BLOCK_SIZE", "PRIVATE_KEY_NOT_GENERATED", "ERROR_DURING_DECRYPTION", "INVALID_RSA_KEY", "INVALID_BASE_64", "INVALID_ALGORITHM", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0})
public enum PluginCipherError implements ErrorMessage {
    UNKNOWN_ERROR(ReturnCode.ERR_INIT, "An unknown error has occurred"),
    CLIENT_NOT_INITIALIZED(ReturnCode.ERR_INIT_GENERAL, "PinCipher client hasn't been initialized"),
    INVALID_KEY_PAIR(ReturnCode.ERR_INIT_BAD_PARAMS, "There's been an error generating the key pair"),
    KEY_TAG_NOT_FOUND(ReturnCode.ERR_INIT_NODEVICEUID, "Error loading key tag from configuration file"),
    ERROR_DURING_ENCRYPTION(ReturnCode.ERR_INIT_DEVICEID_ALREADY_DEFINED, "There's been an error during data encryption"),
    INVALID_BLOCK_SIZE(ReturnCode.ERR_INIT_INVALID_CUSTOM_ID, "Invalid data length to encrypt"),
    PRIVATE_KEY_NOT_GENERATED(1106, "Private key has not been previously generated"),
    ERROR_DURING_DECRYPTION(1107, "There's been an error during data decryption"),
    INVALID_RSA_KEY(1200, "Invalid RSA key"),
    INVALID_BASE_64(ReturnCode.ERR_CRY_LENGTH_KEY_TYPE, "Invalid Base64 data"),
    INVALID_ALGORITHM(ReturnCode.ERR_CRY_MAC_FIRST_LOOP, "Invalid algorithm");

    private final int code;

    @NotNull
    private final String description;

    PluginCipherError(int i10, String str) {
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

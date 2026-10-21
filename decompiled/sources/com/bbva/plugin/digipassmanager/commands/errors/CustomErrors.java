package com.bbva.plugin.digipassmanager.commands.errors;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CustomErrors.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/digipassmanager/commands/errors/CustomErrors;", "", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "getCode", "", "getMessage", "code", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "message", "Ljava/lang/String;", "InternalError", "NotQRCronto", "ScanCancelled", "LimitReached", "digipassmanager-plugin_release"}, k = 1, mv = {1, 8, 0})
public enum CustomErrors implements ErrorMessage {
    InternalError(0, "Internal Error"),
    NotQRCronto(3, "Not a cronto QR"),
    ScanCancelled(4, "Scan cancelled"),
    LimitReached(6, DigipassManagerConstants.LIMIT_REACHED_ERROR);

    private final int code;

    @NotNull
    private final String message;

    CustomErrors(int i10, String str) {
        this.code = i10;
        this.message = str;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    public int getCode() {
        return this.code;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    public String getMessage() {
        return this.message;
    }
}

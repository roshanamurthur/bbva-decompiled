package com.bbva.qrcreator.model;

import androidx.annotation.Keep;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Qr.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/bbva/qrcreator/model/QrCorrelation;", "", "(Ljava/lang/String;I)V", "toZxing", "Lcom/google/zxing/qrcode/decoder/ErrorCorrectionLevel;", "toZxing$qrcreator_release", "L", "M", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "H", "qrcreator_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum QrCorrelation {
    L,
    M,
    Q,
    H;

    @NotNull
    public final ErrorCorrectionLevel toZxing$qrcreator_release() {
        return ErrorCorrectionLevel.valueOf(name());
    }
}

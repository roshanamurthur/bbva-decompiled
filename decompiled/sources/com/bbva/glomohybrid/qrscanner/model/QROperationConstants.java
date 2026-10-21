package com.bbva.glomohybrid.qrscanner.model;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: QROperationConstants.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0017\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/model/QROperationConstants;", "", "", "a", "Ljava/lang/String;", "getCANCELED", "()Ljava/lang/String;", "CANCELED", "", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCODE_DEFAULT_ERROR", "()I", "CODE_DEFAULT_ERROR", "c", "getCODE_NO_DETECTABLE_ERROR", "CODE_NO_DETECTABLE_ERROR", "d", "getDEFAULT_ERROR", "DEFAULT_ERROR", "e", "getNO_DETECTABLE_ERROR", "NO_DETECTABLE_ERROR", "CODE_CANCEL", "getCODE_CANCEL", "<init>", "()V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class QROperationConstants {

    @NotNull
    public static final QROperationConstants INSTANCE = new QROperationConstants();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String CANCELED = "Cancelled";

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int CODE_DEFAULT_ERROR = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int CODE_NO_DETECTABLE_ERROR = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String DEFAULT_ERROR = "DEFAULT_ERROR";

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String NO_DETECTABLE_ERROR = "NO_DETECTABLE_ERROR";

    @NotNull
    public final String getCANCELED() {
        return CANCELED;
    }

    public final int getCODE_CANCEL() {
        return 0;
    }

    public final int getCODE_DEFAULT_ERROR() {
        return CODE_DEFAULT_ERROR;
    }

    public final int getCODE_NO_DETECTABLE_ERROR() {
        return CODE_NO_DETECTABLE_ERROR;
    }

    @NotNull
    public final String getDEFAULT_ERROR() {
        return DEFAULT_ERROR;
    }

    @NotNull
    public final String getNO_DETECTABLE_ERROR() {
        return NO_DETECTABLE_ERROR;
    }
}

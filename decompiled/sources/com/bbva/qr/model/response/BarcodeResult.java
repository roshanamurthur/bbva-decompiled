package com.bbva.qr.model.response;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BarcodeResult.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r¨\u0006$"}, d2 = {"Lcom/bbva/qr/model/response/BarcodeResult;", "", "rawPayload", "", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "format", "", "valueFormat", "timestamp", "", "resultCode", "(Ljava/lang/String;Ljava/lang/String;IIJLjava/lang/Integer;)V", "getFormat", "()I", "getPayload", "()Ljava/lang/String;", "getRawPayload", "getResultCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimestamp", "()J", "getValueFormat", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;IIJLjava/lang/Integer;)Lcom/bbva/qr/model/response/BarcodeResult;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "qr_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BarcodeResult {
    private final int format;

    @NotNull
    private final String payload;

    @NotNull
    private final String rawPayload;

    @Nullable
    private final Integer resultCode;
    private final long timestamp;
    private final int valueFormat;

    public BarcodeResult(@NotNull String rawPayload, @NotNull String payload, int i10, int i11, long j10, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(rawPayload, "rawPayload");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.rawPayload = rawPayload;
        this.payload = payload;
        this.format = i10;
        this.valueFormat = i11;
        this.timestamp = j10;
        this.resultCode = num;
    }

    public static /* synthetic */ BarcodeResult copy$default(BarcodeResult barcodeResult, String str, String str2, int i10, int i11, long j10, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = barcodeResult.rawPayload;
        }
        if ((i12 & 2) != 0) {
            str2 = barcodeResult.payload;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            i10 = barcodeResult.format;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = barcodeResult.valueFormat;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            j10 = barcodeResult.timestamp;
        }
        long j11 = j10;
        if ((i12 & 32) != 0) {
            num = barcodeResult.resultCode;
        }
        return barcodeResult.copy(str, str3, i13, i14, j11, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRawPayload() {
        return this.rawPayload;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getValueFormat() {
        return this.valueFormat;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final BarcodeResult copy(@NotNull String rawPayload, @NotNull String payload, int format, int valueFormat, long timestamp, @Nullable Integer resultCode) {
        Intrinsics.checkNotNullParameter(rawPayload, "rawPayload");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new BarcodeResult(rawPayload, payload, format, valueFormat, timestamp, resultCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeResult)) {
            return false;
        }
        BarcodeResult barcodeResult = (BarcodeResult) other;
        return Intrinsics.areEqual(this.rawPayload, barcodeResult.rawPayload) && Intrinsics.areEqual(this.payload, barcodeResult.payload) && this.format == barcodeResult.format && this.valueFormat == barcodeResult.valueFormat && this.timestamp == barcodeResult.timestamp && Intrinsics.areEqual(this.resultCode, barcodeResult.resultCode);
    }

    public final int getFormat() {
        return this.format;
    }

    @NotNull
    public final String getPayload() {
        return this.payload;
    }

    @NotNull
    public final String getRawPayload() {
        return this.rawPayload;
    }

    @Nullable
    public final Integer getResultCode() {
        return this.resultCode;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getValueFormat() {
        return this.valueFormat;
    }

    public int hashCode() {
        int iC = (((n1.c(this.payload, this.rawPayload.hashCode() * 31, 31) + this.format) * 31) + this.valueFormat) * 31;
        long j10 = this.timestamp;
        int i10 = (iC + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        Integer num = this.resultCode;
        return i10 + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.rawPayload;
        String str2 = this.payload;
        int i10 = this.format;
        int i11 = this.valueFormat;
        long j10 = this.timestamp;
        Integer num = this.resultCode;
        StringBuilder sbC = a.c("BarcodeResult(rawPayload=", str, ", payload=", str2, ", format=");
        sbC.append(i10);
        sbC.append(", valueFormat=");
        sbC.append(i11);
        sbC.append(", timestamp=");
        sbC.append(j10);
        sbC.append(", resultCode=");
        sbC.append(num);
        sbC.append(")");
        return sbC.toString();
    }

    public /* synthetic */ BarcodeResult(String str, String str2, int i10, int i11, long j10, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, i11, j10, (i12 & 32) != 0 ? null : num);
    }
}

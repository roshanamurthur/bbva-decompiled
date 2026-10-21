package com.bbva.notifications.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BanxicoPushData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/bbva/notifications/model/CipherInfo;", "", "id", "", "paymentData", "serial", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;)V", "getId", "()Ljava/lang/String;", "getPaymentData", "getSerial", "()Ljava/lang/Number;", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CipherInfo {

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("mc")
    @NotNull
    private final String paymentData;

    @SerializedName("s")
    @Nullable
    private final Number serial;

    public CipherInfo(@NotNull String id, @NotNull String paymentData, @Nullable Number number) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        this.id = id;
        this.paymentData = paymentData;
        this.serial = number;
    }

    public static /* synthetic */ CipherInfo copy$default(CipherInfo cipherInfo, String str, String str2, Number number, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cipherInfo.id;
        }
        if ((i10 & 2) != 0) {
            str2 = cipherInfo.paymentData;
        }
        if ((i10 & 4) != 0) {
            number = cipherInfo.serial;
        }
        return cipherInfo.copy(str, str2, number);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentData() {
        return this.paymentData;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Number getSerial() {
        return this.serial;
    }

    @NotNull
    public final CipherInfo copy(@NotNull String id, @NotNull String paymentData, @Nullable Number serial) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new CipherInfo(id, paymentData, serial);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CipherInfo)) {
            return false;
        }
        CipherInfo cipherInfo = (CipherInfo) other;
        return Intrinsics.areEqual(this.id, cipherInfo.id) && Intrinsics.areEqual(this.paymentData, cipherInfo.paymentData) && Intrinsics.areEqual(this.serial, cipherInfo.serial);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getPaymentData() {
        return this.paymentData;
    }

    @Nullable
    public final Number getSerial() {
        return this.serial;
    }

    public int hashCode() {
        int iC = n1.c(this.paymentData, this.id.hashCode() * 31, 31);
        Number number = this.serial;
        return iC + (number == null ? 0 : number.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.paymentData;
        Number number = this.serial;
        StringBuilder sbC = a.c("CipherInfo(id=", str, ", paymentData=", str2, ", serial=");
        sbC.append(number);
        sbC.append(")");
        return sbC.toString();
    }
}

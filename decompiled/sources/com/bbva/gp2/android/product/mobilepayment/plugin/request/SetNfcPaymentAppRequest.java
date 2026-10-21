package com.bbva.gp2.android.product.mobilepayment.plugin.request;

import androidx.annotation.Keep;
import androidx.camera.core.impl.utils.b;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SetNfcPaymentAppRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/plugin/request/SetNfcPaymentAppRequest;", "", "requestCode", "", "<init>", "(I)V", "getRequestCode", "()I", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "payments-mobilepayment-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SetNfcPaymentAppRequest {
    private final int requestCode;

    public SetNfcPaymentAppRequest() {
        this(0, 1, null);
    }

    public static /* synthetic */ SetNfcPaymentAppRequest copy$default(SetNfcPaymentAppRequest setNfcPaymentAppRequest, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = setNfcPaymentAppRequest.requestCode;
        }
        return setNfcPaymentAppRequest.copy(i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRequestCode() {
        return this.requestCode;
    }

    @NotNull
    public final SetNfcPaymentAppRequest copy(int requestCode) {
        return new SetNfcPaymentAppRequest(requestCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SetNfcPaymentAppRequest) && this.requestCode == ((SetNfcPaymentAppRequest) other).requestCode;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public int hashCode() {
        return this.requestCode;
    }

    @NotNull
    public String toString() {
        return b.a("SetNfcPaymentAppRequest(requestCode=", this.requestCode, ")");
    }

    public SetNfcPaymentAppRequest(int i10) {
        this.requestCode = i10;
    }

    public /* synthetic */ SetNfcPaymentAppRequest(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1001 : i10);
    }
}

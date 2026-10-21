package com.bbva.ethermobilesdk.token.ocra;

import androidx.annotation.Keep;
import androidx.camera.core.impl.utils.b;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OcraSuite.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/token/ocra/OtpLength;", "", "value", "", "(I)V", "getValue", "()I", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OtpLength {

    @SerializedName("value")
    private final int value;

    public OtpLength(int i10) {
        this.value = i10;
    }

    public static /* synthetic */ OtpLength copy$default(OtpLength otpLength, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = otpLength.value;
        }
        return otpLength.copy(i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final OtpLength copy(int value) {
        return new OtpLength(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OtpLength) && this.value == ((OtpLength) other).value;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return b.a("OtpLength(value=", this.value, ")");
    }
}

package com.bbva.ethermobilesdk.sslpinning;

import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SslPinningApiConfig.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/sslpinning/SslPinningApiConfig;", "", "", "component1", "", "component2", "sslCheck", "reset", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSslCheck", "()I", "b", "Z", "getReset", "()Z", "<init>", "(IZ)V", "sslpinning_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class SslPinningApiConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int sslCheck;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean reset;

    public SslPinningApiConfig(int i10, boolean z10) {
        this.sslCheck = i10;
        this.reset = z10;
    }

    public static /* synthetic */ SslPinningApiConfig copy$default(SslPinningApiConfig sslPinningApiConfig, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = sslPinningApiConfig.sslCheck;
        }
        if ((i11 & 2) != 0) {
            z10 = sslPinningApiConfig.reset;
        }
        return sslPinningApiConfig.copy(i10, z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSslCheck() {
        return this.sslCheck;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getReset() {
        return this.reset;
    }

    @NotNull
    public final SslPinningApiConfig copy(int sslCheck, boolean reset) {
        return new SslPinningApiConfig(sslCheck, reset);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SslPinningApiConfig)) {
            return false;
        }
        SslPinningApiConfig sslPinningApiConfig = (SslPinningApiConfig) other;
        return this.sslCheck == sslPinningApiConfig.sslCheck && this.reset == sslPinningApiConfig.reset;
    }

    public final boolean getReset() {
        return this.reset;
    }

    public final int getSslCheck() {
        return this.sslCheck;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int i10 = this.sslCheck * 31;
        boolean z10 = this.reset;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return i10 + r1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SslPinningApiConfig(sslCheck=");
        sb2.append(this.sslCheck);
        sb2.append(", reset=");
        return i.c(sb2, this.reset, ")");
    }

    public /* synthetic */ SslPinningApiConfig(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? false : z10);
    }
}

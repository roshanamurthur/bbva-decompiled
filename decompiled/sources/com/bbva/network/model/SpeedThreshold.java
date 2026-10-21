package com.bbva.network.model;

import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConnectionState.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/bbva/network/model/SpeedThreshold;", "", "", "component1", "component2", "component3", "low", "moderate", "high", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLow", "()I", "b", "getModerate", "c", "getHigh", "<init>", "(III)V", "network_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SpeedThreshold {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int low;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int moderate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int high;

    public SpeedThreshold() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ SpeedThreshold copy$default(SpeedThreshold speedThreshold, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = speedThreshold.low;
        }
        if ((i13 & 2) != 0) {
            i11 = speedThreshold.moderate;
        }
        if ((i13 & 4) != 0) {
            i12 = speedThreshold.high;
        }
        return speedThreshold.copy(i10, i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLow() {
        return this.low;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getModerate() {
        return this.moderate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHigh() {
        return this.high;
    }

    @NotNull
    public final SpeedThreshold copy(int low, int moderate, int high) {
        return new SpeedThreshold(low, moderate, high);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeedThreshold)) {
            return false;
        }
        SpeedThreshold speedThreshold = (SpeedThreshold) other;
        return this.low == speedThreshold.low && this.moderate == speedThreshold.moderate && this.high == speedThreshold.high;
    }

    public final int getHigh() {
        return this.high;
    }

    public final int getLow() {
        return this.low;
    }

    public final int getModerate() {
        return this.moderate;
    }

    public int hashCode() {
        return (((this.low * 31) + this.moderate) * 31) + this.high;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SpeedThreshold(low=");
        sb2.append(this.low);
        sb2.append(", moderate=");
        sb2.append(this.moderate);
        sb2.append(", high=");
        return a.c(sb2, this.high, ")");
    }

    public SpeedThreshold(int i10, int i11, int i12) {
        this.low = i10;
        this.moderate = i11;
        this.high = i12;
    }

    public /* synthetic */ SpeedThreshold(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 1 : i10, (i13 & 2) != 0 ? 5 : i11, (i13 & 4) != 0 ? 20 : i12);
    }
}

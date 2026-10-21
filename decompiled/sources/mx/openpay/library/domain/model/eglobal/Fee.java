package mx.openpay.library.domain.model.eglobal;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Fee.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lmx/openpay/library/domain/model/eglobal/Fee;", "", "", "component1", "", "component2", "component3", PushConstants.AMOUNT, "currency", FirebaseAnalytics.Param.TAX, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "D", "getAmount", "()D", "b", "Ljava/lang/String;", "getCurrency", "()Ljava/lang/String;", "c", "getTax", "<init>", "(DLjava/lang/String;D)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Fee {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final double tax;

    public Fee(double d2, @NotNull String currency, double d3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.amount = d2;
        this.currency = currency;
        this.tax = d3;
    }

    public static /* synthetic */ Fee copy$default(Fee fee, double d2, String str, double d3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2 = fee.amount;
        }
        double d7 = d2;
        if ((i10 & 2) != 0) {
            str = fee.currency;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            d3 = fee.tax;
        }
        return fee.copy(d7, str2, d3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getTax() {
        return this.tax;
    }

    @NotNull
    public final Fee copy(double amount, @NotNull String currency, double tax) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new Fee(amount, currency, tax);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fee)) {
            return false;
        }
        Fee fee = (Fee) other;
        return Double.compare(this.amount, fee.amount) == 0 && Intrinsics.areEqual(this.currency, fee.currency) && Double.compare(this.tax, fee.tax) == 0;
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final double getTax() {
        return this.tax;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int iC = n1.c(this.currency, ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31, 31);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.tax);
        return iC + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    @NotNull
    public String toString() {
        return "Fee(amount=" + this.amount + ", currency=" + this.currency + ", tax=" + this.tax + ")";
    }
}

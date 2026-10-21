package mx.openpay.library.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Taxes.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lmx/openpay/library/domain/model/Taxes;", "", "", "component1", "", "component2", PushConstants.AMOUNT, "description", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "D", "getAmount", "()D", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "<init>", "(DLjava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Taxes {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    public Taxes(double d2, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.amount = d2;
        this.description = description;
    }

    public static /* synthetic */ Taxes copy$default(Taxes taxes, double d2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2 = taxes.amount;
        }
        if ((i10 & 2) != 0) {
            str = taxes.description;
        }
        return taxes.copy(d2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final Taxes copy(double amount, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new Taxes(amount, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Taxes)) {
            return false;
        }
        Taxes taxes = (Taxes) other;
        return Double.compare(this.amount, taxes.amount) == 0 && Intrinsics.areEqual(this.description, taxes.description);
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        return this.description.hashCode() + (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31);
    }

    @NotNull
    public String toString() {
        return "Taxes(amount=" + this.amount + ", description=" + this.description + ")";
    }
}

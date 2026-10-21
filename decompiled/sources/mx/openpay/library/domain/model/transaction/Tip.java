package mx.openpay.library.domain.model.transaction;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Tip.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lmx/openpay/library/domain/model/transaction/Tip;", "", "", "component1", "component2", PushConstants.AMOUNT, "percentage", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getAmount", "()Ljava/lang/String;", "b", "getPercentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Tip {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String percentage;

    public Tip(@NotNull String amount, @NotNull String percentage) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        this.amount = amount;
        this.percentage = percentage;
    }

    public static /* synthetic */ Tip copy$default(Tip tip, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tip.amount;
        }
        if ((i10 & 2) != 0) {
            str2 = tip.percentage;
        }
        return tip.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPercentage() {
        return this.percentage;
    }

    @NotNull
    public final Tip copy(@NotNull String amount, @NotNull String percentage) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        return new Tip(amount, percentage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tip)) {
            return false;
        }
        Tip tip = (Tip) other;
        return Intrinsics.areEqual(this.amount, tip.amount) && Intrinsics.areEqual(this.percentage, tip.percentage);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getPercentage() {
        return this.percentage;
    }

    public int hashCode() {
        return this.percentage.hashCode() + (this.amount.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Tip(amount=");
        sb2.append(this.amount);
        sb2.append(", percentage=");
        return d.f(sb2, this.percentage, ")");
    }
}

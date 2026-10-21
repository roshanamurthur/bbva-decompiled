package mx.openpay.library.ui.modal.plans;

import androidx.collection.k;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lmx/openpay/library/ui/modal/plans/PlanModel;", "", "", "component1", "component2", "monthlyFrequency", "fee", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMonthlyFrequency", "()I", "b", "getFee", "<init>", "(II)V", "library_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PlanModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int monthlyFrequency;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int fee;

    public PlanModel(int i10, int i11) {
        this.monthlyFrequency = i10;
        this.fee = i11;
    }

    public static /* synthetic */ PlanModel copy$default(PlanModel planModel, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = planModel.monthlyFrequency;
        }
        if ((i12 & 2) != 0) {
            i11 = planModel.fee;
        }
        return planModel.copy(i10, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMonthlyFrequency() {
        return this.monthlyFrequency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFee() {
        return this.fee;
    }

    @NotNull
    public final PlanModel copy(int monthlyFrequency, int fee) {
        return new PlanModel(monthlyFrequency, fee);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanModel)) {
            return false;
        }
        PlanModel planModel = (PlanModel) other;
        return this.monthlyFrequency == planModel.monthlyFrequency && this.fee == planModel.fee;
    }

    public final int getFee() {
        return this.fee;
    }

    public final int getMonthlyFrequency() {
        return this.monthlyFrequency;
    }

    public int hashCode() {
        return this.fee + (this.monthlyFrequency * 31);
    }

    @NotNull
    public String toString() {
        return k.c("PlanModel(monthlyFrequency=", this.monthlyFrequency, ", fee=", this.fee, ")");
    }
}

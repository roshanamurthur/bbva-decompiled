package mx.openpay.library.core.model.extra;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayProductType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007j\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u0001`\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010#\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007j\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u0001`\tHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u008a\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007j\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u0001`\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u000bHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR)\u0010\u0006\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007j\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018¨\u00060"}, d2 = {"Lmx/openpay/library/core/model/extra/TransactionFilter;", "", "transactionId", "", "paymentMethod", "Lmx/openpay/library/core/model/extra/PaymentMethod;", "status", "Ljava/util/ArrayList;", "Lmx/openpay/library/core/model/extra/StatusFilter;", "Lkotlin/collections/ArrayList;", "limit", "", TypedValues.CycleType.S_WAVE_OFFSET, "operationGte", "operationLte", "productTypes", "", "Lmx/openpay/library/core/model/OpenPayProductType;", "(Ljava/lang/String;Lmx/openpay/library/core/model/extra/PaymentMethod;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOffset", "getOperationGte", "()Ljava/lang/String;", "getOperationLte", "getPaymentMethod", "()Lmx/openpay/library/core/model/extra/PaymentMethod;", "getProductTypes", "()Ljava/util/List;", "getStatus", "()Ljava/util/ArrayList;", "getTransactionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lmx/openpay/library/core/model/extra/PaymentMethod;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lmx/openpay/library/core/model/extra/TransactionFilter;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TransactionFilter {
    public static final int $stable = 8;

    @Nullable
    private final Integer limit;

    @Nullable
    private final Integer offset;

    @Nullable
    private final String operationGte;

    @Nullable
    private final String operationLte;

    @Nullable
    private final PaymentMethod paymentMethod;

    @Nullable
    private final List<OpenPayProductType> productTypes;

    @Nullable
    private final ArrayList<StatusFilter> status;

    @Nullable
    private final String transactionId;

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionFilter(@Nullable String str, @Nullable PaymentMethod paymentMethod, @Nullable ArrayList<StatusFilter> arrayList, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable String str3, @Nullable List<? extends OpenPayProductType> list) {
        this.transactionId = str;
        this.paymentMethod = paymentMethod;
        this.status = arrayList;
        this.limit = num;
        this.offset = num2;
        this.operationGte = str2;
        this.operationLte = str3;
        this.productTypes = list;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    @Nullable
    public final ArrayList<StatusFilter> component3() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOperationGte() {
        return this.operationGte;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOperationLte() {
        return this.operationLte;
    }

    @Nullable
    public final List<OpenPayProductType> component8() {
        return this.productTypes;
    }

    @NotNull
    public final TransactionFilter copy(@Nullable String transactionId, @Nullable PaymentMethod paymentMethod, @Nullable ArrayList<StatusFilter> status, @Nullable Integer limit, @Nullable Integer offset, @Nullable String operationGte, @Nullable String operationLte, @Nullable List<? extends OpenPayProductType> productTypes) {
        return new TransactionFilter(transactionId, paymentMethod, status, limit, offset, operationGte, operationLte, productTypes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionFilter)) {
            return false;
        }
        TransactionFilter transactionFilter = (TransactionFilter) other;
        return Intrinsics.areEqual(this.transactionId, transactionFilter.transactionId) && this.paymentMethod == transactionFilter.paymentMethod && Intrinsics.areEqual(this.status, transactionFilter.status) && Intrinsics.areEqual(this.limit, transactionFilter.limit) && Intrinsics.areEqual(this.offset, transactionFilter.offset) && Intrinsics.areEqual(this.operationGte, transactionFilter.operationGte) && Intrinsics.areEqual(this.operationLte, transactionFilter.operationLte) && Intrinsics.areEqual(this.productTypes, transactionFilter.productTypes);
    }

    @Nullable
    public final Integer getLimit() {
        return this.limit;
    }

    @Nullable
    public final Integer getOffset() {
        return this.offset;
    }

    @Nullable
    public final String getOperationGte() {
        return this.operationGte;
    }

    @Nullable
    public final String getOperationLte() {
        return this.operationLte;
    }

    @Nullable
    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    @Nullable
    public final List<OpenPayProductType> getProductTypes() {
        return this.productTypes;
    }

    @Nullable
    public final ArrayList<StatusFilter> getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.transactionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PaymentMethod paymentMethod = this.paymentMethod;
        int iHashCode2 = (iHashCode + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        ArrayList<StatusFilter> arrayList = this.status;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Integer num = this.limit;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.offset;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.operationGte;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.operationLte;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<OpenPayProductType> list = this.productTypes;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TransactionFilter(transactionId=" + this.transactionId + ", paymentMethod=" + this.paymentMethod + ", status=" + this.status + ", limit=" + this.limit + ", offset=" + this.offset + ", operationGte=" + this.operationGte + ", operationLte=" + this.operationLte + ", productTypes=" + this.productTypes + ")";
    }

    public /* synthetic */ TransactionFilter(String str, PaymentMethod paymentMethod, ArrayList arrayList, Integer num, Integer num2, String str2, String str3, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, paymentMethod, arrayList, num, num2, str2, str3, (i10 & 128) != 0 ? null : list);
    }
}

package mx.openpay.library.domain.model.transaction;

import androidx.camera.core.imagecapture.a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransactionFilter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\u0004\b7\u00108J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0013\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fHÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0003J~\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0012\b\u0002\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0007R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0007R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R!\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104¨\u00069"}, d2 = {"Lmx/openpay/library/domain/model/transaction/TransactionFilter;", "", "", "component1", "component2", "", "component3", "()Ljava/lang/Integer;", "component4", "component5", "Lmx/openpay/library/domain/model/transaction/PaymentMethod;", "component6", "", "Lmx/openpay/library/domain/model/transaction/StatusFilter;", "component7", "Lmx/openpay/library/domain/model/transaction/ProductType;", "component8", "operationGte", "operationLte", "limit", TypedValues.CycleType.S_WAVE_OFFSET, "transactionId", "paymentMethod", "status", "productTypes", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lmx/openpay/library/domain/model/transaction/PaymentMethod;Ljava/util/List;Ljava/util/List;)Lmx/openpay/library/domain/model/transaction/TransactionFilter;", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getOperationGte", "()Ljava/lang/String;", "b", "getOperationLte", "c", "Ljava/lang/Integer;", "getLimit", "d", "getOffset", "e", "getTransactionId", "f", "Lmx/openpay/library/domain/model/transaction/PaymentMethod;", "getPaymentMethod", "()Lmx/openpay/library/domain/model/transaction/PaymentMethod;", "g", "Ljava/util/List;", "getStatus", "()Ljava/util/List;", "h", "getProductTypes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lmx/openpay/library/domain/model/transaction/PaymentMethod;Ljava/util/List;Ljava/util/List;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TransactionFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String operationGte;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String operationLte;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer limit;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer offset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String transactionId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PaymentMethod paymentMethod;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<StatusFilter> status;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<ProductType> productTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionFilter(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable PaymentMethod paymentMethod, @Nullable List<? extends StatusFilter> list, @Nullable List<? extends ProductType> list2) {
        this.operationGte = str;
        this.operationLte = str2;
        this.limit = num;
        this.offset = num2;
        this.transactionId = str3;
        this.paymentMethod = paymentMethod;
        this.status = list;
        this.productTypes = list2;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOperationGte() {
        return this.operationGte;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOperationLte() {
        return this.operationLte;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    @Nullable
    public final List<StatusFilter> component7() {
        return this.status;
    }

    @Nullable
    public final List<ProductType> component8() {
        return this.productTypes;
    }

    @NotNull
    public final TransactionFilter copy(@Nullable String operationGte, @Nullable String operationLte, @Nullable Integer limit, @Nullable Integer offset, @Nullable String transactionId, @Nullable PaymentMethod paymentMethod, @Nullable List<? extends StatusFilter> status, @Nullable List<? extends ProductType> productTypes) {
        return new TransactionFilter(operationGte, operationLte, limit, offset, transactionId, paymentMethod, status, productTypes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionFilter)) {
            return false;
        }
        TransactionFilter transactionFilter = (TransactionFilter) other;
        return Intrinsics.areEqual(this.operationGte, transactionFilter.operationGte) && Intrinsics.areEqual(this.operationLte, transactionFilter.operationLte) && Intrinsics.areEqual(this.limit, transactionFilter.limit) && Intrinsics.areEqual(this.offset, transactionFilter.offset) && Intrinsics.areEqual(this.transactionId, transactionFilter.transactionId) && this.paymentMethod == transactionFilter.paymentMethod && Intrinsics.areEqual(this.status, transactionFilter.status) && Intrinsics.areEqual(this.productTypes, transactionFilter.productTypes);
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
    public final List<ProductType> getProductTypes() {
        return this.productTypes;
    }

    @Nullable
    public final List<StatusFilter> getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.operationGte;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.operationLte;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.limit;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.offset;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.transactionId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PaymentMethod paymentMethod = this.paymentMethod;
        int iHashCode6 = (iHashCode5 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        List<StatusFilter> list = this.status;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<ProductType> list2 = this.productTypes;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TransactionFilter(operationGte=");
        sb2.append(this.operationGte);
        sb2.append(", operationLte=");
        sb2.append(this.operationLte);
        sb2.append(", limit=");
        sb2.append(this.limit);
        sb2.append(", offset=");
        sb2.append(this.offset);
        sb2.append(", transactionId=");
        sb2.append(this.transactionId);
        sb2.append(", paymentMethod=");
        sb2.append(this.paymentMethod);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", productTypes=");
        return a.c(sb2, this.productTypes, ")");
    }

    public /* synthetic */ TransactionFilter(String str, String str2, Integer num, Integer num2, String str3, PaymentMethod paymentMethod, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, num2, str3, paymentMethod, list, (i10 & 128) != 0 ? null : list2);
    }
}

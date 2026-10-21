package mx.openpay.library.core.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.core.model.OpenPayPaymentMethod;
import mx.openpay.library.core.model.OpenPayProductType;
import mx.openpay.library.core.model.OpenPayStatusFilter;
import mx.openpay.library.core.model.OpenPayTransactionFilter;
import mx.openpay.library.domain.model.transaction.PaymentMethod;
import mx.openpay.library.domain.model.transaction.ProductType;
import mx.openpay.library.domain.model.transaction.StatusFilter;
import mx.openpay.library.domain.model.transaction.TransactionFilter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b\u001a\u001a\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u001a\u001e\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\n*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\n¨\u0006\f"}, d2 = {"mapToLibraryModel", "Lmx/openpay/library/domain/model/transaction/PaymentMethod;", "Lmx/openpay/library/core/model/OpenPayPaymentMethod;", "Lmx/openpay/library/domain/model/transaction/ProductType;", "Lmx/openpay/library/core/model/OpenPayProductType;", "Lmx/openpay/library/domain/model/transaction/StatusFilter;", "Lmx/openpay/library/core/model/OpenPayStatusFilter;", "Lmx/openpay/library/domain/model/transaction/TransactionFilter;", "Lmx/openpay/library/core/model/OpenPayTransactionFilter;", "mapToLibraryModelList", "", "mapToLibraryStatusFilterModelList", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransactionFilterMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionFilterMapper.kt\nmx/openpay/library/core/mapper/TransactionFilterMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1549#2:63\n1620#2,3:64\n1549#2:67\n1620#2,3:68\n*S KotlinDebug\n*F\n+ 1 TransactionFilterMapper.kt\nmx/openpay/library/core/mapper/TransactionFilterMapperKt\n*L\n41#1:63\n41#1:64,3\n48#1:67\n48#1:68,3\n*E\n"})
public final class TransactionFilterMapperKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OpenPayPaymentMethod.values().length];
            try {
                iArr[OpenPayPaymentMethod.CARD_PRESENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenPayPaymentMethod.LINK_COBRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpenPayPaymentMethod.QR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OpenPayPaymentMethod.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OpenPayStatusFilter.values().length];
            try {
                iArr2[OpenPayStatusFilter.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OpenPayStatusFilter.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OpenPayStatusFilter.CHARGE_PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OpenPayStatusFilter.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OpenPayStatusFilter.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OpenPayProductType.values().length];
            try {
                iArr3[OpenPayProductType.TAP_ON_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[OpenPayProductType.PAYMENT_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[OpenPayProductType.MPOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Nullable
    public static final PaymentMethod mapToLibraryModel(@Nullable OpenPayPaymentMethod openPayPaymentMethod) {
        int i10 = openPayPaymentMethod == null ? -1 : WhenMappings.$EnumSwitchMapping$0[openPayPaymentMethod.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return PaymentMethod.CARD_PRESENT;
        }
        if (i10 == 2) {
            return PaymentMethod.LINK_COBRO;
        }
        if (i10 == 3) {
            return PaymentMethod.QR;
        }
        if (i10 == 4) {
            return PaymentMethod.CARD;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public static final List<ProductType> mapToLibraryModelList(@Nullable List<? extends OpenPayProductType> list) {
        if ((list != null && list.isEmpty()) || list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToLibraryModel((OpenPayProductType) it.next()));
        }
        return arrayList;
    }

    @Nullable
    public static final List<StatusFilter> mapToLibraryStatusFilterModelList(@Nullable List<? extends OpenPayStatusFilter> list) {
        if ((list != null && list.isEmpty()) || list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (OpenPayStatusFilter openPayStatusFilter : list) {
            arrayList.add(openPayStatusFilter != null ? mapToLibraryModel(openPayStatusFilter) : null);
        }
        return arrayList;
    }

    @NotNull
    public static final ProductType mapToLibraryModel(@NotNull OpenPayProductType openPayProductType) {
        Intrinsics.checkNotNullParameter(openPayProductType, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$2[openPayProductType.ordinal()];
        if (i10 == 1) {
            return ProductType.TAP_ON_PHONE;
        }
        if (i10 == 2) {
            return ProductType.PAYMENT_LINK;
        }
        if (i10 == 3) {
            return ProductType.MPOS;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final StatusFilter mapToLibraryModel(@NotNull OpenPayStatusFilter openPayStatusFilter) {
        Intrinsics.checkNotNullParameter(openPayStatusFilter, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[openPayStatusFilter.ordinal()];
        if (i10 == 1) {
            return StatusFilter.COMPLETED;
        }
        if (i10 == 2) {
            return StatusFilter.FAILED;
        }
        if (i10 == 3) {
            return StatusFilter.CHARGE_PENDING;
        }
        if (i10 == 4) {
            return StatusFilter.CANCELLED;
        }
        if (i10 == 5) {
            return StatusFilter.ERROR;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final TransactionFilter mapToLibraryModel(@NotNull OpenPayTransactionFilter openPayTransactionFilter) {
        Intrinsics.checkNotNullParameter(openPayTransactionFilter, "<this>");
        String operationGte = openPayTransactionFilter.getOperationGte();
        String operationLte = openPayTransactionFilter.getOperationLte();
        Integer limit = openPayTransactionFilter.getLimit();
        Integer offset = openPayTransactionFilter.getOffset();
        String transactionId = openPayTransactionFilter.getTransactionId();
        OpenPayPaymentMethod paymentMethod = openPayTransactionFilter.getPaymentMethod();
        return new TransactionFilter(operationGte, operationLte, limit, offset, transactionId, paymentMethod != null ? mapToLibraryModel(paymentMethod) : null, mapToLibraryStatusFilterModelList(openPayTransactionFilter.getStatus()), mapToLibraryModelList(openPayTransactionFilter.getProductTypes()));
    }
}

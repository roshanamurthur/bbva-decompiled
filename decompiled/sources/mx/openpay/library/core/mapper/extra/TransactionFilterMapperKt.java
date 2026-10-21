package mx.openpay.library.core.mapper.extra;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.core.model.OpenPayPaymentMethod;
import mx.openpay.library.core.model.OpenPayStatusFilter;
import mx.openpay.library.core.model.OpenPayTransactionFilter;
import mx.openpay.library.core.model.extra.PaymentMethod;
import mx.openpay.library.core.model.extra.StatusFilter;
import mx.openpay.library.core.model.extra.TransactionFilter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\u001e\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"mapToLibraryModel", "Lmx/openpay/library/core/model/OpenPayPaymentMethod;", "Lmx/openpay/library/core/model/extra/PaymentMethod;", "Lmx/openpay/library/core/model/OpenPayStatusFilter;", "Lmx/openpay/library/core/model/extra/StatusFilter;", "Lmx/openpay/library/core/model/OpenPayTransactionFilter;", "Lmx/openpay/library/core/model/extra/TransactionFilter;", "mapToLibraryStatusFilterModelList", "", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransactionFilterMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionFilterMapper.kt\nmx/openpay/library/core/mapper/extra/TransactionFilterMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1549#2:47\n1620#2,3:48\n*S KotlinDebug\n*F\n+ 1 TransactionFilterMapper.kt\nmx/openpay/library/core/mapper/extra/TransactionFilterMapperKt\n*L\n32#1:47\n32#1:48,3\n*E\n"})
public final class TransactionFilterMapperKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentMethod.values().length];
            try {
                iArr[PaymentMethod.CARD_PRESENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.LINK_COBRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.QR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentMethod.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StatusFilter.values().length];
            try {
                iArr2[StatusFilter.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[StatusFilter.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[StatusFilter.CHARGE_PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[StatusFilter.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[StatusFilter.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Nullable
    public static final OpenPayPaymentMethod mapToLibraryModel(@Nullable PaymentMethod paymentMethod) {
        int i10 = paymentMethod == null ? -1 : WhenMappings.$EnumSwitchMapping$0[paymentMethod.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return OpenPayPaymentMethod.CARD_PRESENT;
        }
        if (i10 == 2) {
            return OpenPayPaymentMethod.LINK_COBRO;
        }
        if (i10 == 3) {
            return OpenPayPaymentMethod.QR;
        }
        if (i10 == 4) {
            return OpenPayPaymentMethod.CARD;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public static final List<OpenPayStatusFilter> mapToLibraryStatusFilterModelList(@Nullable List<? extends StatusFilter> list) {
        if ((list != null && list.isEmpty()) || list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (StatusFilter statusFilter : list) {
            arrayList.add(statusFilter != null ? mapToLibraryModel(statusFilter) : null);
        }
        return arrayList;
    }

    @NotNull
    public static final OpenPayStatusFilter mapToLibraryModel(@NotNull StatusFilter statusFilter) {
        Intrinsics.checkNotNullParameter(statusFilter, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[statusFilter.ordinal()];
        if (i10 == 1) {
            return OpenPayStatusFilter.COMPLETED;
        }
        if (i10 == 2) {
            return OpenPayStatusFilter.FAILED;
        }
        if (i10 == 3) {
            return OpenPayStatusFilter.CHARGE_PENDING;
        }
        if (i10 == 4) {
            return OpenPayStatusFilter.CANCELLED;
        }
        if (i10 == 5) {
            return OpenPayStatusFilter.ERROR;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final OpenPayTransactionFilter mapToLibraryModel(@NotNull TransactionFilter transactionFilter) {
        Intrinsics.checkNotNullParameter(transactionFilter, "<this>");
        String operationGte = transactionFilter.getOperationGte();
        String operationLte = transactionFilter.getOperationLte();
        Integer limit = transactionFilter.getLimit();
        Integer offset = transactionFilter.getOffset();
        String transactionId = transactionFilter.getTransactionId();
        PaymentMethod paymentMethod = transactionFilter.getPaymentMethod();
        return new OpenPayTransactionFilter(operationGte, operationLte, limit, offset, transactionId, paymentMethod != null ? mapToLibraryModel(paymentMethod) : null, mapToLibraryStatusFilterModelList(transactionFilter.getStatus()), transactionFilter.getProductTypes());
    }
}

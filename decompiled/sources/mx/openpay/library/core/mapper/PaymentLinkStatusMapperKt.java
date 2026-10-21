package mx.openpay.library.core.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.core.model.OpenPayPaymentLinkStatus;
import mx.openpay.library.core.model.extra.PaymentLinkStatusFilter;
import mx.openpay.library.domain.model.link.PaymentLinkStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0007\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0005\u001a\u001e\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\t*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t\u001a\u001e\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\t¨\u0006\u000b"}, d2 = {"mapStringToStatusLibraryModel", "Lmx/openpay/library/core/model/OpenPayPaymentLinkStatus;", "status", "", "mapToDomainModel", "Lmx/openpay/library/domain/model/link/PaymentLinkStatus;", "mapToLibraryModel", "Lmx/openpay/library/core/model/extra/PaymentLinkStatusFilter;", "mapToLibraryStatusFilterModelList", "", "mapToStatusFilterToPaymentLinkStatusModelList", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPaymentLinkStatusMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentLinkStatusMapper.kt\nmx/openpay/library/core/mapper/PaymentLinkStatusMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1549#2:54\n1620#2,3:55\n1549#2:58\n1620#2,3:59\n*S KotlinDebug\n*F\n+ 1 PaymentLinkStatusMapper.kt\nmx/openpay/library/core/mapper/PaymentLinkStatusMapperKt\n*L\n27#1:54\n27#1:55,3\n42#1:58\n42#1:59,3\n*E\n"})
public final class PaymentLinkStatusMapperKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OpenPayPaymentLinkStatus.values().length];
            try {
                iArr[OpenPayPaymentLinkStatus.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenPayPaymentLinkStatus.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpenPayPaymentLinkStatus.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OpenPayPaymentLinkStatus.PROCESSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentLinkStatus.values().length];
            try {
                iArr2[PaymentLinkStatus.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PaymentLinkStatus.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PaymentLinkStatus.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PaymentLinkStatus.PROCESSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PaymentLinkStatusFilter.values().length];
            try {
                iArr3[PaymentLinkStatusFilter.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[PaymentLinkStatusFilter.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[PaymentLinkStatusFilter.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[PaymentLinkStatusFilter.PROCESSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @NotNull
    public static final OpenPayPaymentLinkStatus mapStringToStatusLibraryModel(@NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        String upperCase = status.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        int iHashCode = upperCase.hashCode();
        if (iHashCode != -1031784143) {
            if (iHashCode != -591252731) {
                if (iHashCode != 1691835182) {
                    if (iHashCode == 2052692649) {
                        upperCase.equals("AVAILABLE");
                    }
                } else if (upperCase.equals("PROCESSED")) {
                    return OpenPayPaymentLinkStatus.PROCESSED;
                }
            } else if (upperCase.equals("EXPIRED")) {
                return OpenPayPaymentLinkStatus.EXPIRED;
            }
        } else if (upperCase.equals("CANCELLED")) {
            return OpenPayPaymentLinkStatus.CANCELLED;
        }
        return OpenPayPaymentLinkStatus.AVAILABLE;
    }

    @NotNull
    public static final PaymentLinkStatus mapToDomainModel(@NotNull OpenPayPaymentLinkStatus openPayPaymentLinkStatus) {
        Intrinsics.checkNotNullParameter(openPayPaymentLinkStatus, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[openPayPaymentLinkStatus.ordinal()];
        if (i10 == 1) {
            return PaymentLinkStatus.AVAILABLE;
        }
        if (i10 == 2) {
            return PaymentLinkStatus.EXPIRED;
        }
        if (i10 == 3) {
            return PaymentLinkStatus.CANCELLED;
        }
        if (i10 == 4) {
            return PaymentLinkStatus.PROCESSED;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final OpenPayPaymentLinkStatus mapToLibraryModel(@NotNull PaymentLinkStatusFilter paymentLinkStatusFilter) {
        Intrinsics.checkNotNullParameter(paymentLinkStatusFilter, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$2[paymentLinkStatusFilter.ordinal()];
        if (i10 == 1) {
            return OpenPayPaymentLinkStatus.AVAILABLE;
        }
        if (i10 == 2) {
            return OpenPayPaymentLinkStatus.EXPIRED;
        }
        if (i10 == 3) {
            return OpenPayPaymentLinkStatus.CANCELLED;
        }
        if (i10 == 4) {
            return OpenPayPaymentLinkStatus.PROCESSED;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public static final List<PaymentLinkStatus> mapToLibraryStatusFilterModelList(@Nullable List<? extends OpenPayPaymentLinkStatus> list) {
        if ((list != null && list.isEmpty()) || list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (OpenPayPaymentLinkStatus openPayPaymentLinkStatus : list) {
            arrayList.add(openPayPaymentLinkStatus != null ? mapToDomainModel(openPayPaymentLinkStatus) : null);
        }
        return arrayList;
    }

    @Nullable
    public static final List<OpenPayPaymentLinkStatus> mapToStatusFilterToPaymentLinkStatusModelList(@Nullable List<? extends PaymentLinkStatusFilter> list) {
        if ((list != null && list.isEmpty()) || list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (PaymentLinkStatusFilter paymentLinkStatusFilter : list) {
            arrayList.add(paymentLinkStatusFilter != null ? mapToLibraryModel(paymentLinkStatusFilter) : null);
        }
        return arrayList;
    }

    @NotNull
    public static final OpenPayPaymentLinkStatus mapToLibraryModel(@NotNull PaymentLinkStatus paymentLinkStatus) {
        Intrinsics.checkNotNullParameter(paymentLinkStatus, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[paymentLinkStatus.ordinal()];
        if (i10 == 1) {
            return OpenPayPaymentLinkStatus.AVAILABLE;
        }
        if (i10 == 2) {
            return OpenPayPaymentLinkStatus.EXPIRED;
        }
        if (i10 == 3) {
            return OpenPayPaymentLinkStatus.CANCELLED;
        }
        if (i10 == 4) {
            return OpenPayPaymentLinkStatus.PROCESSED;
        }
        throw new NoWhenBranchMatchedException();
    }
}

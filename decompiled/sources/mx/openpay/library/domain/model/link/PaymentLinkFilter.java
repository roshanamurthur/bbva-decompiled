package mx.openpay.library.domain.model.link;

import androidx.camera.core.imagecapture.a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentLinkFilter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n¢\u0006\u0004\b+\u0010,J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nHÆ\u0003J`\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\bR!\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lmx/openpay/library/domain/model/link/PaymentLinkFilter;", "", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Integer;", "component5", "", "Lmx/openpay/library/domain/model/link/PaymentLinkStatus;", "component6", LogKeysKt.START_DATE, LogKeysKt.END_DATE, "nameOrLastName", "limit", TypedValues.CycleType.S_WAVE_OFFSET, "status", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lmx/openpay/library/domain/model/link/PaymentLinkFilter;", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getStartDate", "()Ljava/lang/String;", "b", "getEndDate", "c", "getNameOrLastName", "d", "Ljava/lang/Integer;", "getLimit", "e", "getOffset", "f", "Ljava/util/List;", "getStatus", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PaymentLinkFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String startDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String endDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String nameOrLastName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer limit;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer offset;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<PaymentLinkStatus> status;

    public PaymentLinkFilter() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentLinkFilter copy$default(PaymentLinkFilter paymentLinkFilter, String str, String str2, String str3, Integer num, Integer num2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paymentLinkFilter.startDate;
        }
        if ((i10 & 2) != 0) {
            str2 = paymentLinkFilter.endDate;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = paymentLinkFilter.nameOrLastName;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            num = paymentLinkFilter.limit;
        }
        Integer num3 = num;
        if ((i10 & 16) != 0) {
            num2 = paymentLinkFilter.offset;
        }
        Integer num4 = num2;
        if ((i10 & 32) != 0) {
            list = paymentLinkFilter.status;
        }
        return paymentLinkFilter.copy(str, str4, str5, num3, num4, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNameOrLastName() {
        return this.nameOrLastName;
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
    public final List<PaymentLinkStatus> component6() {
        return this.status;
    }

    @NotNull
    public final PaymentLinkFilter copy(@Nullable String startDate, @Nullable String endDate, @Nullable String nameOrLastName, @Nullable Integer limit, @Nullable Integer offset, @Nullable List<? extends PaymentLinkStatus> status) {
        return new PaymentLinkFilter(startDate, endDate, nameOrLastName, limit, offset, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentLinkFilter)) {
            return false;
        }
        PaymentLinkFilter paymentLinkFilter = (PaymentLinkFilter) other;
        return Intrinsics.areEqual(this.startDate, paymentLinkFilter.startDate) && Intrinsics.areEqual(this.endDate, paymentLinkFilter.endDate) && Intrinsics.areEqual(this.nameOrLastName, paymentLinkFilter.nameOrLastName) && Intrinsics.areEqual(this.limit, paymentLinkFilter.limit) && Intrinsics.areEqual(this.offset, paymentLinkFilter.offset) && Intrinsics.areEqual(this.status, paymentLinkFilter.status);
    }

    @Nullable
    public final String getEndDate() {
        return this.endDate;
    }

    @Nullable
    public final Integer getLimit() {
        return this.limit;
    }

    @Nullable
    public final String getNameOrLastName() {
        return this.nameOrLastName;
    }

    @Nullable
    public final Integer getOffset() {
        return this.offset;
    }

    @Nullable
    public final String getStartDate() {
        return this.startDate;
    }

    @Nullable
    public final List<PaymentLinkStatus> getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.startDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameOrLastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.limit;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.offset;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<PaymentLinkStatus> list = this.status;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentLinkFilter(startDate=");
        sb2.append(this.startDate);
        sb2.append(", endDate=");
        sb2.append(this.endDate);
        sb2.append(", nameOrLastName=");
        sb2.append(this.nameOrLastName);
        sb2.append(", limit=");
        sb2.append(this.limit);
        sb2.append(", offset=");
        sb2.append(this.offset);
        sb2.append(", status=");
        return a.c(sb2, this.status, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentLinkFilter(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends PaymentLinkStatus> list) {
        this.startDate = str;
        this.endDate = str2;
        this.nameOrLastName = str3;
        this.limit = num;
        this.offset = num2;
        this.status = list;
    }

    public /* synthetic */ PaymentLinkFilter(String str, String str2, String str3, Integer num, Integer num2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : list);
    }
}

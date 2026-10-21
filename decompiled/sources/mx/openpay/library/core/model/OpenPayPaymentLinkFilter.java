package mx.openpay.library.core.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0013\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nHÆ\u0003J^\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u001b\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lmx/openpay/library/core/model/OpenPayPaymentLinkFilter;", "", LogKeysKt.START_DATE, "", LogKeysKt.END_DATE, "nameOrLastName", "limit", "", TypedValues.CycleType.S_WAVE_OFFSET, "status", "", "Lmx/openpay/library/core/model/OpenPayPaymentLinkStatus;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getEndDate", "()Ljava/lang/String;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNameOrLastName", "getOffset", "getStartDate", "getStatus", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lmx/openpay/library/core/model/OpenPayPaymentLinkFilter;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayPaymentLinkFilter {
    public static final int $stable = 8;

    @Nullable
    private final String endDate;

    @Nullable
    private final Integer limit;

    @Nullable
    private final String nameOrLastName;

    @Nullable
    private final Integer offset;

    @Nullable
    private final String startDate;

    @Nullable
    private final List<OpenPayPaymentLinkStatus> status;

    public OpenPayPaymentLinkFilter() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenPayPaymentLinkFilter copy$default(OpenPayPaymentLinkFilter openPayPaymentLinkFilter, String str, String str2, String str3, Integer num, Integer num2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = openPayPaymentLinkFilter.startDate;
        }
        if ((i10 & 2) != 0) {
            str2 = openPayPaymentLinkFilter.endDate;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = openPayPaymentLinkFilter.nameOrLastName;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            num = openPayPaymentLinkFilter.limit;
        }
        Integer num3 = num;
        if ((i10 & 16) != 0) {
            num2 = openPayPaymentLinkFilter.offset;
        }
        Integer num4 = num2;
        if ((i10 & 32) != 0) {
            list = openPayPaymentLinkFilter.status;
        }
        return openPayPaymentLinkFilter.copy(str, str4, str5, num3, num4, list);
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
    public final List<OpenPayPaymentLinkStatus> component6() {
        return this.status;
    }

    @NotNull
    public final OpenPayPaymentLinkFilter copy(@Nullable String startDate, @Nullable String endDate, @Nullable String nameOrLastName, @Nullable Integer limit, @Nullable Integer offset, @Nullable List<? extends OpenPayPaymentLinkStatus> status) {
        return new OpenPayPaymentLinkFilter(startDate, endDate, nameOrLastName, limit, offset, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayPaymentLinkFilter)) {
            return false;
        }
        OpenPayPaymentLinkFilter openPayPaymentLinkFilter = (OpenPayPaymentLinkFilter) other;
        return Intrinsics.areEqual(this.startDate, openPayPaymentLinkFilter.startDate) && Intrinsics.areEqual(this.endDate, openPayPaymentLinkFilter.endDate) && Intrinsics.areEqual(this.nameOrLastName, openPayPaymentLinkFilter.nameOrLastName) && Intrinsics.areEqual(this.limit, openPayPaymentLinkFilter.limit) && Intrinsics.areEqual(this.offset, openPayPaymentLinkFilter.offset) && Intrinsics.areEqual(this.status, openPayPaymentLinkFilter.status);
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
    public final List<OpenPayPaymentLinkStatus> getStatus() {
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
        List<OpenPayPaymentLinkStatus> list = this.status;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.startDate;
        String str2 = this.endDate;
        String str3 = this.nameOrLastName;
        Integer num = this.limit;
        Integer num2 = this.offset;
        List<OpenPayPaymentLinkStatus> list = this.status;
        StringBuilder sbC = a.c("OpenPayPaymentLinkFilter(startDate=", str, ", endDate=", str2, ", nameOrLastName=");
        sbC.append(str3);
        sbC.append(", limit=");
        sbC.append(num);
        sbC.append(", offset=");
        sbC.append(num2);
        sbC.append(", status=");
        sbC.append(list);
        sbC.append(")");
        return sbC.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenPayPaymentLinkFilter(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends OpenPayPaymentLinkStatus> list) {
        this.startDate = str;
        this.endDate = str2;
        this.nameOrLastName = str3;
        this.limit = num;
        this.offset = num2;
        this.status = list;
    }

    public /* synthetic */ OpenPayPaymentLinkFilter(String str, String str2, String str3, Integer num, Integer num2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : list);
    }
}

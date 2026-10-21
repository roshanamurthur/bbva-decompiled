package mx.openpay.library.core.model.extra;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bHÆ\u0003JM\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001b\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lmx/openpay/library/core/model/extra/PaymentLinkFilter;", "Landroid/os/Parcelable;", LogKeysKt.START_DATE, "", LogKeysKt.END_DATE, "limit", TypedValues.CycleType.S_WAVE_OFFSET, "status", "", "Lmx/openpay/library/core/model/extra/PaymentLinkStatusFilter;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getEndDate", "()Ljava/lang/String;", "getLimit", "getOffset", "getStartDate", "getStatus", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaymentLinkFilter implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PaymentLinkFilter> CREATOR = new Creator();

    @Nullable
    private final String endDate;

    @Nullable
    private final String limit;

    @Nullable
    private final String offset;

    @Nullable
    private final String startDate;

    @Nullable
    private final List<PaymentLinkStatusFilter> status;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentLinkFilter> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentLinkFilter createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readInt() == 0 ? null : PaymentLinkStatusFilter.valueOf(parcel.readString()));
                }
            }
            return new PaymentLinkFilter(string, string2, string3, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentLinkFilter[] newArray(int i10) {
            return new PaymentLinkFilter[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentLinkFilter(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<? extends PaymentLinkStatusFilter> list) {
        this.startDate = str;
        this.endDate = str2;
        this.limit = str3;
        this.offset = str4;
        this.status = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentLinkFilter copy$default(PaymentLinkFilter paymentLinkFilter, String str, String str2, String str3, String str4, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paymentLinkFilter.startDate;
        }
        if ((i10 & 2) != 0) {
            str2 = paymentLinkFilter.endDate;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = paymentLinkFilter.limit;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = paymentLinkFilter.offset;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            list = paymentLinkFilter.status;
        }
        return paymentLinkFilter.copy(str, str5, str6, str7, list);
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
    public final String getLimit() {
        return this.limit;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOffset() {
        return this.offset;
    }

    @Nullable
    public final List<PaymentLinkStatusFilter> component5() {
        return this.status;
    }

    @NotNull
    public final PaymentLinkFilter copy(@Nullable String startDate, @Nullable String endDate, @Nullable String limit, @Nullable String offset, @Nullable List<? extends PaymentLinkStatusFilter> status) {
        return new PaymentLinkFilter(startDate, endDate, limit, offset, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentLinkFilter)) {
            return false;
        }
        PaymentLinkFilter paymentLinkFilter = (PaymentLinkFilter) other;
        return Intrinsics.areEqual(this.startDate, paymentLinkFilter.startDate) && Intrinsics.areEqual(this.endDate, paymentLinkFilter.endDate) && Intrinsics.areEqual(this.limit, paymentLinkFilter.limit) && Intrinsics.areEqual(this.offset, paymentLinkFilter.offset) && Intrinsics.areEqual(this.status, paymentLinkFilter.status);
    }

    @Nullable
    public final String getEndDate() {
        return this.endDate;
    }

    @Nullable
    public final String getLimit() {
        return this.limit;
    }

    @Nullable
    public final String getOffset() {
        return this.offset;
    }

    @Nullable
    public final String getStartDate() {
        return this.startDate;
    }

    @Nullable
    public final List<PaymentLinkStatusFilter> getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.startDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.limit;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.offset;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<PaymentLinkStatusFilter> list = this.status;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.startDate;
        String str2 = this.endDate;
        String str3 = this.limit;
        String str4 = this.offset;
        List<PaymentLinkStatusFilter> list = this.status;
        StringBuilder sbC = a.c("PaymentLinkFilter(startDate=", str, ", endDate=", str2, ", limit=");
        k.e(sbC, str3, ", offset=", str4, ", status=");
        return androidx.camera.core.imagecapture.a.c(sbC, list, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.startDate);
        parcel.writeString(this.endDate);
        parcel.writeString(this.limit);
        parcel.writeString(this.offset);
        List<PaymentLinkStatusFilter> list = this.status;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (PaymentLinkStatusFilter paymentLinkStatusFilter : list) {
            if (paymentLinkStatusFilter == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(paymentLinkStatusFilter.name());
            }
        }
    }
}

package com.bbva.component.dm.customer.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IndicatorModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005HÆ\u0003JP\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005HÆ\u0001¢\u0006\u0002\u0010\u001cJ\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\tHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/IndicatorsDataLogins;", "Landroid/os/Parcelable;", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "", "indicators", "", "Lcom/bbva/component/dm/customer/domain/model/IndicatorLoginsEntity;", "customerIdGlobal", "notificationTotal", "", "nationalities", "Lcom/bbva/component/dm/customer/domain/model/Nationalities;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getCustomerId", "()Ljava/lang/String;", "getCustomerIdGlobal", "getIndicators", "()Ljava/util/List;", "getNationalities", "getNotificationTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/bbva/component/dm/customer/domain/model/IndicatorsDataLogins;", "describeContents", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IndicatorsDataLogins implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IndicatorsDataLogins> CREATOR = new Creator();

    @NotNull
    private final String customerId;

    @Nullable
    private final String customerIdGlobal;

    @NotNull
    private final List<IndicatorLoginsEntity> indicators;

    @NotNull
    private final List<Nationalities> nationalities;

    @Nullable
    private final Integer notificationTotal;

    /* JADX INFO: compiled from: IndicatorModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IndicatorsDataLogins> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IndicatorsDataLogins createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(IndicatorLoginsEntity.CREATOR.createFromParcel(parcel));
            }
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList2.add(Nationalities.CREATOR.createFromParcel(parcel));
            }
            return new IndicatorsDataLogins(string, arrayList, string2, numValueOf, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IndicatorsDataLogins[] newArray(int i10) {
            return new IndicatorsDataLogins[i10];
        }
    }

    public IndicatorsDataLogins(@NotNull String customerId, @NotNull List<IndicatorLoginsEntity> indicators, @Nullable String str, @Nullable Integer num, @NotNull List<Nationalities> nationalities) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        Intrinsics.checkNotNullParameter(nationalities, "nationalities");
        this.customerId = customerId;
        this.indicators = indicators;
        this.customerIdGlobal = str;
        this.notificationTotal = num;
        this.nationalities = nationalities;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndicatorsDataLogins copy$default(IndicatorsDataLogins indicatorsDataLogins, String str, List list, String str2, Integer num, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = indicatorsDataLogins.customerId;
        }
        if ((i10 & 2) != 0) {
            list = indicatorsDataLogins.indicators;
        }
        List list3 = list;
        if ((i10 & 4) != 0) {
            str2 = indicatorsDataLogins.customerIdGlobal;
        }
        String str3 = str2;
        if ((i10 & 8) != 0) {
            num = indicatorsDataLogins.notificationTotal;
        }
        Integer num2 = num;
        if ((i10 & 16) != 0) {
            list2 = indicatorsDataLogins.nationalities;
        }
        return indicatorsDataLogins.copy(str, list3, str3, num2, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    public final List<IndicatorLoginsEntity> component2() {
        return this.indicators;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCustomerIdGlobal() {
        return this.customerIdGlobal;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getNotificationTotal() {
        return this.notificationTotal;
    }

    @NotNull
    public final List<Nationalities> component5() {
        return this.nationalities;
    }

    @NotNull
    public final IndicatorsDataLogins copy(@NotNull String customerId, @NotNull List<IndicatorLoginsEntity> indicators, @Nullable String customerIdGlobal, @Nullable Integer notificationTotal, @NotNull List<Nationalities> nationalities) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        Intrinsics.checkNotNullParameter(nationalities, "nationalities");
        return new IndicatorsDataLogins(customerId, indicators, customerIdGlobal, notificationTotal, nationalities);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorsDataLogins)) {
            return false;
        }
        IndicatorsDataLogins indicatorsDataLogins = (IndicatorsDataLogins) other;
        return Intrinsics.areEqual(this.customerId, indicatorsDataLogins.customerId) && Intrinsics.areEqual(this.indicators, indicatorsDataLogins.indicators) && Intrinsics.areEqual(this.customerIdGlobal, indicatorsDataLogins.customerIdGlobal) && Intrinsics.areEqual(this.notificationTotal, indicatorsDataLogins.notificationTotal) && Intrinsics.areEqual(this.nationalities, indicatorsDataLogins.nationalities);
    }

    @NotNull
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getCustomerIdGlobal() {
        return this.customerIdGlobal;
    }

    @NotNull
    public final List<IndicatorLoginsEntity> getIndicators() {
        return this.indicators;
    }

    @NotNull
    public final List<Nationalities> getNationalities() {
        return this.nationalities;
    }

    @Nullable
    public final Integer getNotificationTotal() {
        return this.notificationTotal;
    }

    public int hashCode() {
        int iA = a.a(this.indicators, this.customerId.hashCode() * 31, 31);
        String str = this.customerIdGlobal;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.notificationTotal;
        return this.nationalities.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.customerId;
        List<IndicatorLoginsEntity> list = this.indicators;
        String str2 = this.customerIdGlobal;
        Integer num = this.notificationTotal;
        List<Nationalities> list2 = this.nationalities;
        StringBuilder sb2 = new StringBuilder("IndicatorsDataLogins(customerId=");
        sb2.append(str);
        sb2.append(", indicators=");
        sb2.append(list);
        sb2.append(", customerIdGlobal=");
        sb2.append(str2);
        sb2.append(", notificationTotal=");
        sb2.append(num);
        sb2.append(", nationalities=");
        return androidx.camera.core.imagecapture.a.c(sb2, list2, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.customerId);
        List<IndicatorLoginsEntity> list = this.indicators;
        parcel.writeInt(list.size());
        Iterator<IndicatorLoginsEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        parcel.writeString(this.customerIdGlobal);
        Integer num = this.notificationTotal;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        List<Nationalities> list2 = this.nationalities;
        parcel.writeInt(list2.size());
        Iterator<Nationalities> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ IndicatorsDataLogins(String str, List list, String str2, Integer num, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, str2, num, list2);
    }
}

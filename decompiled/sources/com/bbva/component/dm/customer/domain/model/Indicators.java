package com.bbva.component.dm.customer.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IndicatorModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/Indicators;", "Landroid/os/Parcelable;", "Lcom/bbva/component/dm/customer/domain/model/IndicatorResponse;", "indicators", "", "Lcom/bbva/component/dm/customer/domain/model/Indicator;", "(Ljava/util/List;)V", "getIndicators", "()Ljava/util/List;", LocalStorageConstantsKt.IS_BUSINESS_USER_KEY, "", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIndicatorModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndicatorModel.kt\ncom/bbva/component/dm/customer/domain/model/Indicators\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final /* data */ class Indicators implements Parcelable, IndicatorResponse {

    @NotNull
    public static final Parcelable.Creator<Indicators> CREATOR = new Creator();

    @SerializedName("data")
    @NotNull
    private final List<Indicator> indicators;

    /* JADX INFO: compiled from: IndicatorModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Indicators> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Indicators createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Indicator.CREATOR.createFromParcel(parcel));
            }
            return new Indicators(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Indicators[] newArray(int i10) {
            return new Indicators[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Indicators() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Indicators copy$default(Indicators indicators, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = indicators.indicators;
        }
        return indicators.copy(list);
    }

    @NotNull
    public final List<Indicator> component1() {
        return this.indicators;
    }

    @NotNull
    public final Indicators copy(@NotNull List<Indicator> indicators) {
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        return new Indicators(indicators);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Indicators) && Intrinsics.areEqual(this.indicators, ((Indicators) other).indicators);
    }

    @NotNull
    public final List<Indicator> getIndicators() {
        return this.indicators;
    }

    public int hashCode() {
        return this.indicators.hashCode();
    }

    public final boolean isBusinessUser() {
        Object next;
        Iterator<T> it = this.indicators.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((Indicator) next).getId(), "HAS_GLOBAL_BUSINESSES_PLATFORM_USER"));
        Indicator indicator = (Indicator) next;
        return indicator != null && indicator.isActive();
    }

    @NotNull
    public String toString() {
        return "Indicators(indicators=" + this.indicators + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<Indicator> list = this.indicators;
        parcel.writeInt(list.size());
        Iterator<Indicator> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public Indicators(@NotNull List<Indicator> indicators) {
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        this.indicators = indicators;
    }

    public /* synthetic */ Indicators(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}

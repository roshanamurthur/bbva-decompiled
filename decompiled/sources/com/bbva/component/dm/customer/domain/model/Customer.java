package com.bbva.component.dm.customer.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.i;
import bk.o;
import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.component.dm.customer.domain.model.mx.Avatars;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.parcelize.Parceler;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Customer.kt */
/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00015B\"\u0012\u0019\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b3\u0010\u001aB\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\b\u0007HÆ\u0003J&\u0010\n\u001a\u00020\u00002\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\b\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0005HÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002HÖ\u0001R5\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\b\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u001dR\u001d\u0010$\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u001dR\u001d\u0010'\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u001dR\u001d\u0010,\u001a\u0004\u0018\u00010(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010+R#\u00102\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/Customer;", "Landroid/os/Parcelable;", "", "describeContents", "", "", "", "Lkotlinx/parcelize/RawValue;", "component1", "map", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "setMap", "(Ljava/util/Map;)V", "q0", "getCustomerId", "()Ljava/lang/String;", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "r0", "getFirstName", CustomerLoginsParser.FIRST_NAME, "s0", "getLastName", CustomerLoginsParser.LAST_NAME, "t0", "getSecondLastName", CustomerLoginsParser.SECOND_LAST_NAME, "Lcom/bbva/component/dm/customer/domain/model/mx/Avatars;", "u0", "getAvatars", "()Lcom/bbva/component/dm/customer/domain/model/mx/Avatars;", CustomerLoginsParser.AVATARS, "", "Lcom/bbva/component/dm/customer/domain/model/Classification;", "v0", "getClassifications", "()Ljava/util/List;", "classifications", "<init>", "(Landroid/os/Parcel;)V", "Companion", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Customer implements Parcelable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Map<String, ? extends Object> map;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map customerId;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map firstName;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map lastName;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map secondLastName;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map avatars;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final Map classifications;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f27583w0 = {i.d(Customer.class, CustomerIdInterceptor.FAKE_CUSTOMER_ID, "getCustomerId()Ljava/lang/String;", 0), i.d(Customer.class, CustomerLoginsParser.FIRST_NAME, "getFirstName()Ljava/lang/String;", 0), i.d(Customer.class, CustomerLoginsParser.LAST_NAME, "getLastName()Ljava/lang/String;", 0), i.d(Customer.class, CustomerLoginsParser.SECOND_LAST_NAME, "getSecondLastName()Ljava/lang/String;", 0), i.d(Customer.class, CustomerLoginsParser.AVATARS, "getAvatars()Lcom/bbva/component/dm/customer/domain/model/mx/Avatars;", 0), i.d(Customer.class, "classifications", "getClassifications()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Customer> CREATOR = new Creator();

    /* JADX INFO: compiled from: Customer.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/Customer$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/bbva/component/dm/customer/domain/model/Customer;", "()V", "create", "parcel", "Landroid/os/Parcel;", "write", "", "flags", "", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements Parceler<Customer> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        @NotNull
        public Customer[] newArray(int i10) {
            return (Customer[]) Parceler.DefaultImpls.newArray(this, i10);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        @NotNull
        public Customer create(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Customer(parcel);
        }

        @Override // kotlinx.parcelize.Parceler
        public void write(@NotNull Customer customer, @NotNull Parcel parcel, int i10) {
            Intrinsics.checkNotNullParameter(customer, "<this>");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeMap(customer.getMap());
        }
    }

    /* JADX INFO: compiled from: Customer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Customer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Customer createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return Customer.INSTANCE.create(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Customer[] newArray(int i10) {
            return new Customer[i10];
        }
    }

    public Customer(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
        this.customerId = map;
        this.firstName = map;
        this.lastName = map;
        this.secondLastName = map;
        this.avatars = map;
        this.classifications = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Customer copy$default(Customer customer, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = customer.map;
        }
        return customer.copy(map);
    }

    @NotNull
    public final Map<String, Object> component1() {
        return this.map;
    }

    @NotNull
    public final Customer copy(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new Customer(map);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Customer) && Intrinsics.areEqual(this.map, ((Customer) other).map);
    }

    @Nullable
    public final Avatars getAvatars() {
        return (Avatars) o.getOrImplicitDefaultNullable(this.avatars, f27583w0[4].getName());
    }

    @Nullable
    public final List<Classification> getClassifications() {
        return (List) o.getOrImplicitDefaultNullable(this.classifications, f27583w0[5].getName());
    }

    @NotNull
    public final String getCustomerId() {
        return (String) o.getOrImplicitDefaultNullable(this.customerId, f27583w0[0].getName());
    }

    @NotNull
    public final String getFirstName() {
        return (String) o.getOrImplicitDefaultNullable(this.firstName, f27583w0[1].getName());
    }

    @Nullable
    public final String getLastName() {
        return (String) o.getOrImplicitDefaultNullable(this.lastName, f27583w0[2].getName());
    }

    @NotNull
    public final Map<String, Object> getMap() {
        return this.map;
    }

    @Nullable
    public final String getSecondLastName() {
        return (String) o.getOrImplicitDefaultNullable(this.secondLastName, f27583w0[3].getName());
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public final void setMap(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.map = map;
    }

    @NotNull
    public String toString() {
        return "Customer(map=" + this.map + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        INSTANCE.write(this, parcel, flags);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Customer(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        HashMap hashMap = parcel.readHashMap(Customer.class.getClassLoader());
        Intrinsics.checkNotNull(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        this(hashMap);
    }
}

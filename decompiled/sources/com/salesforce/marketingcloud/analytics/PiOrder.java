package com.salesforce.marketingcloud.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.salesforce.marketingcloud.MCKeep;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@Parcelize
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001,B'\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010 \u001a\u00020\u001aHÖ\u0001J\u0019\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b\u0005\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b\t\u0010\bR\u0017\u0010\r\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b\r\u0010\fR\u0017\u0010\u000f\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b\u000f\u0010\f¨\u0006-"}, d2 = {"Lcom/salesforce/marketingcloud/analytics/PiOrder;", "Landroid/os/Parcelable;", "Lcom/salesforce/marketingcloud/analytics/PiCart;", "-deprecated_cart", "()Lcom/salesforce/marketingcloud/analytics/PiCart;", "cart", "", "-deprecated_orderNumber", "()Ljava/lang/String;", "orderNumber", "", "-deprecated_shipping", "()D", FirebaseAnalytics.Param.SHIPPING, "-deprecated_discount", FirebaseAnalytics.Param.DISCOUNT, "Lorg/json/JSONObject;", "-toJson", "()Lorg/json/JSONObject;", "toJson", "component1", "component2", "component3", "component4", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Lcom/salesforce/marketingcloud/analytics/PiCart;", "Ljava/lang/String;", "D", "<init>", "(Lcom/salesforce/marketingcloud/analytics/PiCart;Ljava/lang/String;DD)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PiOrder implements Parcelable {

    @NotNull
    private final PiCart cart;
    private final double discount;

    @NotNull
    private final String orderNumber;
    private final double shipping;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<PiOrder> CREATOR = new b();

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.analytics.PiOrder$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\r"}, d2 = {"Lcom/salesforce/marketingcloud/analytics/PiOrder$a;", "", "Lcom/salesforce/marketingcloud/analytics/PiCart;", "cart", "", "orderNumber", "", FirebaseAnalytics.Param.SHIPPING, FirebaseAnalytics.Param.DISCOUNT, "Lcom/salesforce/marketingcloud/analytics/PiOrder;", "a", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to constructor", replaceWith = @ReplaceWith(expression = "PiOrder(cart, orderNumber, shipping, discount)", imports = {}))
        @JvmStatic
        @NotNull
        public final PiOrder a(@NotNull PiCart cart, @NotNull String orderNumber, double shipping, double discount) {
            Intrinsics.checkNotNullParameter(cart, "cart");
            Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
            return new PiOrder(cart, orderNumber, shipping, discount);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PiOrder> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PiOrder createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PiOrder(PiCart.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PiOrder[] newArray(int i10) {
            return new PiOrder[i10];
        }
    }

    public PiOrder(@NotNull PiCart cart, @NotNull String orderNumber, double d2, double d3) {
        Intrinsics.checkNotNullParameter(cart, "cart");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        this.cart = cart;
        this.orderNumber = orderNumber;
        this.shipping = d2;
        this.discount = d3;
    }

    public static /* synthetic */ PiOrder copy$default(PiOrder piOrder, PiCart piCart, String str, double d2, double d3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            piCart = piOrder.cart;
        }
        if ((i10 & 2) != 0) {
            str = piOrder.orderNumber;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            d2 = piOrder.shipping;
        }
        double d7 = d2;
        if ((i10 & 8) != 0) {
            d3 = piOrder.discount;
        }
        return piOrder.copy(piCart, str2, d7, d3);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to constructor", replaceWith = @ReplaceWith(expression = "PiOrder(cart, orderNumber, shipping, discount)", imports = {}))
    @JvmStatic
    @NotNull
    public static final PiOrder create(@NotNull PiCart piCart, @NotNull String str, double d2, double d3) {
        return INSTANCE.a(piCart, str, d2, d3);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cart", imports = {}))
    @JvmName(name = "-deprecated_cart")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_cart, reason: not valid java name and from getter */
    public final PiCart getCart() {
        return this.cart;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = FirebaseAnalytics.Param.DISCOUNT, imports = {}))
    @JvmName(name = "-deprecated_discount")
    /* JADX INFO: renamed from: -deprecated_discount, reason: not valid java name and from getter */
    public final double getDiscount() {
        return this.discount;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "orderNumber", imports = {}))
    @JvmName(name = "-deprecated_orderNumber")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_orderNumber, reason: not valid java name and from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = FirebaseAnalytics.Param.SHIPPING, imports = {}))
    @JvmName(name = "-deprecated_shipping")
    /* JADX INFO: renamed from: -deprecated_shipping, reason: not valid java name and from getter */
    public final double getShipping() {
        return this.shipping;
    }

    @JvmName(name = "-toJson")
    @NotNull
    /* JADX INFO: renamed from: -toJson, reason: not valid java name */
    public final JSONObject m5339toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cart", this.cart.m5329toJson());
        jSONObject.put("order_number", this.orderNumber);
        jSONObject.put(FirebaseAnalytics.Param.SHIPPING, this.shipping);
        jSONObject.put(FirebaseAnalytics.Param.DISCOUNT, this.discount);
        return jSONObject;
    }

    @JvmName(name = "cart")
    @NotNull
    public final PiCart cart() {
        return this.cart;
    }

    @NotNull
    public final PiCart component1() {
        return this.cart;
    }

    @NotNull
    public final String component2() {
        return this.orderNumber;
    }

    public final double component3() {
        return this.shipping;
    }

    public final double component4() {
        return this.discount;
    }

    @NotNull
    public final PiOrder copy(@NotNull PiCart cart, @NotNull String orderNumber, double shipping, double discount) {
        Intrinsics.checkNotNullParameter(cart, "cart");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        return new PiOrder(cart, orderNumber, shipping, discount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @JvmName(name = FirebaseAnalytics.Param.DISCOUNT)
    public final double discount() {
        return this.discount;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PiOrder)) {
            return false;
        }
        PiOrder piOrder = (PiOrder) other;
        return Intrinsics.areEqual(this.cart, piOrder.cart) && Intrinsics.areEqual(this.orderNumber, piOrder.orderNumber) && Double.compare(this.shipping, piOrder.shipping) == 0 && Double.compare(this.discount, piOrder.discount) == 0;
    }

    public int hashCode() {
        int iC = n1.c(this.orderNumber, this.cart.hashCode() * 31, 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.shipping);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.discount);
        return ((iC + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    @JvmName(name = "orderNumber")
    @NotNull
    public final String orderNumber() {
        return this.orderNumber;
    }

    @JvmName(name = FirebaseAnalytics.Param.SHIPPING)
    public final double shipping() {
        return this.shipping;
    }

    @NotNull
    public String toString() {
        return "PiOrder(cart=" + this.cart + ", orderNumber=" + this.orderNumber + ", shipping=" + this.shipping + ", discount=" + this.discount + RootService.CLOSE_BRACKET;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.cart.writeToParcel(parcel, flags);
        parcel.writeString(this.orderNumber);
        parcel.writeDouble(this.shipping);
        parcel.writeDouble(this.discount);
    }
}

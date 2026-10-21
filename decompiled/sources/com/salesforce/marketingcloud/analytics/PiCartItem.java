package com.salesforce.marketingcloud.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mypinpad.tsdk.isolation.y2;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001,B)\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)B!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b(\u0010*J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0019\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b\u0005\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b\t\u0010\bR\u0017\u0010\r\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b\r\u0010\fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b\u000f\u0010\u0004¨\u0006-"}, d2 = {"Lcom/salesforce/marketingcloud/analytics/PiCartItem;", "Landroid/os/Parcelable;", "", "-deprecated_item", "()Ljava/lang/String;", AnalyticsConstants.Key.ITEM, "", "-deprecated_quantity", "()I", FirebaseAnalytics.Param.QUANTITY, "", "-deprecated_price", "()D", FirebaseAnalytics.Param.PRICE, "-deprecated_uniqueId", "uniqueId", "Lorg/json/JSONObject;", "-toJson", "()Lorg/json/JSONObject;", "toJson", "component1", "component2", "component3", "component4", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/String;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "D", "<init>", "(Ljava/lang/String;IDLjava/lang/String;)V", "(Ljava/lang/String;ID)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PiCartItem implements Parcelable {

    @NotNull
    private final String item;
    private final double price;
    private final int quantity;

    @Nullable
    private final String uniqueId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<PiCartItem> CREATOR = new b();

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.analytics.PiCartItem$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\r"}, d2 = {"Lcom/salesforce/marketingcloud/analytics/PiCartItem$a;", "", "", AnalyticsConstants.Key.ITEM, "", FirebaseAnalytics.Param.QUANTITY, "", FirebaseAnalytics.Param.PRICE, "Lcom/salesforce/marketingcloud/analytics/PiCartItem;", "a", "uniqueId", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to constructor", replaceWith = @ReplaceWith(expression = "PiCartItem(item, quantity, price)", imports = {}))
        @JvmStatic
        @NotNull
        public final PiCartItem a(@NotNull String item, int quantity, double price) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new PiCartItem(item, quantity, price);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to constructor", replaceWith = @ReplaceWith(expression = "PiCartItem(item, quantity, price, uniqueId)", imports = {}))
        @JvmStatic
        @NotNull
        public final PiCartItem a(@NotNull String item, int quantity, double price, @Nullable String uniqueId) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new PiCartItem(item, quantity, price, uniqueId);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PiCartItem> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PiCartItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PiCartItem(parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PiCartItem[] newArray(int i10) {
            return new PiCartItem[i10];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PiCartItem(@NotNull String item, int i10, double d2) {
        this(item, i10, d2, null);
        Intrinsics.checkNotNullParameter(item, "item");
    }

    public static /* synthetic */ PiCartItem copy$default(PiCartItem piCartItem, String str, int i10, double d2, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = piCartItem.item;
        }
        if ((i11 & 2) != 0) {
            i10 = piCartItem.quantity;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            d2 = piCartItem.price;
        }
        double d3 = d2;
        if ((i11 & 8) != 0) {
            str2 = piCartItem.uniqueId;
        }
        return piCartItem.copy(str, i12, d3, str2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to constructor", replaceWith = @ReplaceWith(expression = "PiCartItem(item, quantity, price)", imports = {}))
    @JvmStatic
    @NotNull
    public static final PiCartItem create(@NotNull String str, int i10, double d2) {
        return INSTANCE.a(str, i10, d2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = AnalyticsConstants.Key.ITEM, imports = {}))
    @JvmName(name = "-deprecated_item")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_item, reason: not valid java name and from getter */
    public final String getItem() {
        return this.item;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = FirebaseAnalytics.Param.PRICE, imports = {}))
    @JvmName(name = "-deprecated_price")
    /* JADX INFO: renamed from: -deprecated_price, reason: not valid java name and from getter */
    public final double getPrice() {
        return this.price;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = FirebaseAnalytics.Param.QUANTITY, imports = {}))
    @JvmName(name = "-deprecated_quantity")
    /* JADX INFO: renamed from: -deprecated_quantity, reason: not valid java name and from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "uniqueId", imports = {}))
    @JvmName(name = "-deprecated_uniqueId")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_uniqueId, reason: not valid java name and from getter */
    public final String getUniqueId() {
        return this.uniqueId;
    }

    @JvmName(name = "-toJson")
    @NotNull
    /* JADX INFO: renamed from: -toJson, reason: not valid java name */
    public final JSONObject m5334toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AnalyticsConstants.Key.ITEM, this.item);
        jSONObject.put(FirebaseAnalytics.Param.QUANTITY, this.quantity);
        jSONObject.put(FirebaseAnalytics.Param.PRICE, this.price);
        String str = this.uniqueId;
        if (str != null) {
            jSONObject.put("unique_id", str);
        }
        return jSONObject;
    }

    @NotNull
    public final String component1() {
        return this.item;
    }

    public final int component2() {
        return this.quantity;
    }

    public final double component3() {
        return this.price;
    }

    @Nullable
    public final String component4() {
        return this.uniqueId;
    }

    @NotNull
    public final PiCartItem copy(@NotNull String item, int quantity, double price, @Nullable String uniqueId) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new PiCartItem(item, quantity, price, uniqueId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PiCartItem)) {
            return false;
        }
        PiCartItem piCartItem = (PiCartItem) other;
        return Intrinsics.areEqual(this.item, piCartItem.item) && this.quantity == piCartItem.quantity && Double.compare(this.price, piCartItem.price) == 0 && Intrinsics.areEqual(this.uniqueId, piCartItem.uniqueId);
    }

    public int hashCode() {
        int iHashCode = ((this.item.hashCode() * 31) + this.quantity) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.price);
        int i10 = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        String str = this.uniqueId;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    @JvmName(name = AnalyticsConstants.Key.ITEM)
    @NotNull
    public final String item() {
        return this.item;
    }

    @JvmName(name = FirebaseAnalytics.Param.PRICE)
    public final double price() {
        return this.price;
    }

    @JvmName(name = FirebaseAnalytics.Param.QUANTITY)
    public final int quantity() {
        return this.quantity;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PiCartItem(item=");
        sb2.append(this.item);
        sb2.append(", quantity=");
        sb2.append(this.quantity);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", uniqueId=");
        return y2.b(sb2, this.uniqueId, RootService.CLOSE_BRACKET);
    }

    @JvmName(name = "uniqueId")
    @Nullable
    public final String uniqueId() {
        return this.uniqueId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.item);
        parcel.writeInt(this.quantity);
        parcel.writeDouble(this.price);
        parcel.writeString(this.uniqueId);
    }

    public PiCartItem(@NotNull String item, int i10, double d2, @Nullable String str) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.quantity = i10;
        this.price = d2;
        this.uniqueId = str;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to constructor", replaceWith = @ReplaceWith(expression = "PiCartItem(item, quantity, price, uniqueId)", imports = {}))
    @JvmStatic
    @NotNull
    public static final PiCartItem create(@NotNull String str, int i10, double d2, @Nullable String str2) {
        return INSTANCE.a(str, i10, d2, str2);
    }
}

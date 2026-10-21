package com.salesforce.marketingcloud.sfmcsdk.components.events;

import androidx.datastore.preferences.protobuf.e;
import bk.q;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Order.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bHÆ\u0003JV\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Order;", "", "id", "", "lineItems", "", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/LineItem;", "totalValue", "", "currency", k.a.f65041h, "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/util/Map;)V", "getAttributes", "()Ljava/util/Map;", "getCurrency", "()Ljava/lang/String;", "getId", "getLineItems", "()Ljava/util/List;", "getTotalValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/util/Map;)Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Order;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class Order {

    @NotNull
    private final Map<String, Object> attributes;

    @Nullable
    private final String currency;

    @NotNull
    private final String id;

    @NotNull
    private final List<LineItem> lineItems;

    @Nullable
    private final Double totalValue;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Order(@NotNull String id) {
        this(id, null, null, null, null, 30, null);
        Intrinsics.checkNotNullParameter(id, "id");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Order copy$default(Order order, String str, List list, Double d2, String str2, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = order.id;
        }
        if ((i10 & 2) != 0) {
            list = order.lineItems;
        }
        List list2 = list;
        if ((i10 & 4) != 0) {
            d2 = order.totalValue;
        }
        Double d3 = d2;
        if ((i10 & 8) != 0) {
            str2 = order.currency;
        }
        String str3 = str2;
        if ((i10 & 16) != 0) {
            map = order.attributes;
        }
        return order.copy(str, list2, d3, str3, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<LineItem> component2() {
        return this.lineItems;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getTotalValue() {
        return this.totalValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final Map<String, Object> component5() {
        return this.attributes;
    }

    @NotNull
    public final Order copy(@NotNull String id, @NotNull List<LineItem> lineItems, @Nullable Double totalValue, @Nullable String currency, @NotNull Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return new Order(id, lineItems, totalValue, currency, attributes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Order)) {
            return false;
        }
        Order order = (Order) other;
        return Intrinsics.areEqual(this.id, order.id) && Intrinsics.areEqual(this.lineItems, order.lineItems) && Intrinsics.areEqual((Object) this.totalValue, (Object) order.totalValue) && Intrinsics.areEqual(this.currency, order.currency) && Intrinsics.areEqual(this.attributes, order.attributes);
    }

    @NotNull
    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<LineItem> getLineItems() {
        return this.lineItems;
    }

    @Nullable
    public final Double getTotalValue() {
        return this.totalValue;
    }

    public int hashCode() {
        int iA = a.a(this.lineItems, this.id.hashCode() * 31, 31);
        Double d2 = this.totalValue;
        int iHashCode = (iA + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.currency;
        return this.attributes.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Order(id=");
        sb2.append(this.id);
        sb2.append(", lineItems=");
        sb2.append(this.lineItems);
        sb2.append(", totalValue=");
        sb2.append(this.totalValue);
        sb2.append(", currency=");
        sb2.append(this.currency);
        sb2.append(", attributes=");
        return e.g(sb2, this.attributes, RootService.CLOSE_BRACKET);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Order(@NotNull String id, @NotNull List<LineItem> lineItems) {
        this(id, lineItems, null, null, null, 28, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Order(@NotNull String id, @NotNull List<LineItem> lineItems, @Nullable Double d2) {
        this(id, lineItems, d2, null, null, 24, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Order(@NotNull String id, @NotNull List<LineItem> lineItems, @Nullable Double d2, @Nullable String str) {
        this(id, lineItems, d2, str, null, 16, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
    }

    @JvmOverloads
    public Order(@NotNull String id, @NotNull List<LineItem> lineItems, @Nullable Double d2, @Nullable String str, @NotNull Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.id = id;
        this.lineItems = lineItems;
        this.totalValue = d2;
        this.currency = str;
        this.attributes = attributes;
    }

    public /* synthetic */ Order(String str, List list, Double d2, String str2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? null : d2, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? q.emptyMap() : map);
    }
}

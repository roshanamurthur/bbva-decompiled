package com.salesforce.marketingcloud.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.salesforce.marketingcloud.MCKeep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@Parcelize
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\u0005¨\u0006 "}, d2 = {"Lcom/salesforce/marketingcloud/analytics/PiCart;", "Landroid/os/Parcelable;", "", "Lcom/salesforce/marketingcloud/analytics/PiCartItem;", "-deprecated_cartItems", "()Ljava/util/List;", "cartItems", "Lorg/json/JSONArray;", "-toJson", "()Lorg/json/JSONArray;", "toJson", "component1", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPiCart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PiCart.kt\ncom/salesforce/marketingcloud/analytics/PiCart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1855#2,2:56\n*S KotlinDebug\n*F\n+ 1 PiCart.kt\ncom/salesforce/marketingcloud/analytics/PiCart\n*L\n49#1:56,2\n*E\n"})
public final /* data */ class PiCart implements Parcelable {

    @NotNull
    private final List<PiCartItem> cartItems;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<PiCart> CREATOR = new b();

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.analytics.PiCart$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¨\u0006\t"}, d2 = {"Lcom/salesforce/marketingcloud/analytics/PiCart$a;", "", "", "Lcom/salesforce/marketingcloud/analytics/PiCartItem;", "cartItems", "Lcom/salesforce/marketingcloud/analytics/PiCart;", "a", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to constructor", replaceWith = @ReplaceWith(expression = "PiCart(cartItems)", imports = {}))
        @JvmStatic
        @NotNull
        public final PiCart a(@NotNull List<PiCartItem> cartItems) {
            Intrinsics.checkNotNullParameter(cartItems, "cartItems");
            return new PiCart(cartItems);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PiCart> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PiCart createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(PiCartItem.CREATOR.createFromParcel(parcel));
            }
            return new PiCart(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PiCart[] newArray(int i10) {
            return new PiCart[i10];
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f63836a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to convert List<PiCartItem> into JSONArray for PiCart payload.";
        }
    }

    public PiCart(@NotNull List<PiCartItem> cartItems) {
        Intrinsics.checkNotNullParameter(cartItems, "cartItems");
        this.cartItems = cartItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PiCart copy$default(PiCart piCart, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = piCart.cartItems;
        }
        return piCart.copy(list);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to constructor", replaceWith = @ReplaceWith(expression = "PiCart(cartItems)", imports = {}))
    @JvmStatic
    @NotNull
    public static final PiCart create(@NotNull List<PiCartItem> list) {
        return INSTANCE.a(list);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cartItems", imports = {}))
    @JvmName(name = "-deprecated_cartItems")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_cartItems, reason: not valid java name */
    public final List<PiCartItem> m5328deprecated_cartItems() {
        return this.cartItems;
    }

    @JvmName(name = "-toJson")
    @NotNull
    /* JADX INFO: renamed from: -toJson, reason: not valid java name */
    public final JSONArray m5329toJson() {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<T> it = this.cartItems.iterator();
            while (it.hasNext()) {
                jSONArray.put(((PiCartItem) it.next()).m5334toJson());
            }
        } catch (JSONException e5) {
            com.salesforce.marketingcloud.g gVar = com.salesforce.marketingcloud.g.f64223a;
            String TAG = AnalyticsManager.TAG;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            gVar.b(TAG, e5, c.f63836a);
        }
        return jSONArray;
    }

    @JvmName(name = "cartItems")
    @NotNull
    public final List<PiCartItem> cartItems() {
        return this.cartItems;
    }

    @NotNull
    public final List<PiCartItem> component1() {
        return this.cartItems;
    }

    @NotNull
    public final PiCart copy(@NotNull List<PiCartItem> cartItems) {
        Intrinsics.checkNotNullParameter(cartItems, "cartItems");
        return new PiCart(cartItems);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PiCart) && Intrinsics.areEqual(this.cartItems, ((PiCart) other).cartItems);
    }

    public int hashCode() {
        return this.cartItems.hashCode();
    }

    @NotNull
    public String toString() {
        return bc.org.bouncycastle.math.ec.custom.sec.a.c(new StringBuilder("PiCart(cartItems="), this.cartItems, RootService.CLOSE_BRACKET);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<PiCartItem> list = this.cartItems;
        parcel.writeInt(list.size());
        Iterator<PiCartItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }
}

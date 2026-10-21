package com.bbva.glomohybrid.base.router;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.Animation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Route.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/glomohybrid/base/router/Route;", "", "", "component1", "Lcom/bbva/glomohybrid/base/Animation;", "component2", "Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;", "component3", "route", "animation", "parcel", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "b", "Lcom/bbva/glomohybrid/base/Animation;", "getAnimation", "()Lcom/bbva/glomohybrid/base/Animation;", "c", "Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;", "getParcel", "()Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;", "<init>", "(Ljava/lang/String;Lcom/bbva/glomohybrid/base/Animation;Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Route {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String route;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Animation animation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final IntentExtra.Parcel parcel;

    public Route(@NotNull String route, @NotNull Animation animation, @Nullable IntentExtra.Parcel parcel) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.route = route;
        this.animation = animation;
        this.parcel = parcel;
    }

    public static /* synthetic */ Route copy$default(Route route, String str, Animation animation, IntentExtra.Parcel parcel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = route.route;
        }
        if ((i10 & 2) != 0) {
            animation = route.animation;
        }
        if ((i10 & 4) != 0) {
            parcel = route.parcel;
        }
        return route.copy(str, animation, parcel);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Animation getAnimation() {
        return this.animation;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final IntentExtra.Parcel getParcel() {
        return this.parcel;
    }

    @NotNull
    public final Route copy(@NotNull String route, @NotNull Animation animation, @Nullable IntentExtra.Parcel parcel) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(animation, "animation");
        return new Route(route, animation, parcel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Route)) {
            return false;
        }
        Route route = (Route) other;
        return Intrinsics.areEqual(this.route, route.route) && Intrinsics.areEqual(this.animation, route.animation) && Intrinsics.areEqual(this.parcel, route.parcel);
    }

    @NotNull
    public final Animation getAnimation() {
        return this.animation;
    }

    @Nullable
    public final IntentExtra.Parcel getParcel() {
        return this.parcel;
    }

    @NotNull
    public final String getRoute() {
        return this.route;
    }

    public int hashCode() {
        int iHashCode = (this.animation.hashCode() + (this.route.hashCode() * 31)) * 31;
        IntentExtra.Parcel parcel = this.parcel;
        return iHashCode + (parcel == null ? 0 : parcel.hashCode());
    }

    @NotNull
    public String toString() {
        return "Route(route=" + this.route + ", animation=" + this.animation + ", parcel=" + this.parcel + ")";
    }

    public /* synthetic */ Route(String str, Animation animation, IntentExtra.Parcel parcel, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? Animation.None.INSTANCE : animation, (i10 & 4) != 0 ? null : parcel);
    }
}

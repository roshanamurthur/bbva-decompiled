package com.bbva.glomohybrid.base.models;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QRDeepLinkModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/base/models/QRDeepLinkModel;", "", "route", "Lcom/bbva/glomohybrid/base/router/Route;", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "", "", "(Lcom/bbva/glomohybrid/base/router/Route;Ljava/util/Map;)V", "getPayload", "()Ljava/util/Map;", "getRoute", "()Lcom/bbva/glomohybrid/base/router/Route;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class QRDeepLinkModel {

    @Nullable
    private final Map<String, String> payload;

    @NotNull
    private final Route route;

    public QRDeepLinkModel(@NotNull Route route, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.route = route;
        this.payload = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QRDeepLinkModel copy$default(QRDeepLinkModel qRDeepLinkModel, Route route, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            route = qRDeepLinkModel.route;
        }
        if ((i10 & 2) != 0) {
            map = qRDeepLinkModel.payload;
        }
        return qRDeepLinkModel.copy(route, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Route getRoute() {
        return this.route;
    }

    @Nullable
    public final Map<String, String> component2() {
        return this.payload;
    }

    @NotNull
    public final QRDeepLinkModel copy(@NotNull Route route, @Nullable Map<String, String> payload) {
        Intrinsics.checkNotNullParameter(route, "route");
        return new QRDeepLinkModel(route, payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QRDeepLinkModel)) {
            return false;
        }
        QRDeepLinkModel qRDeepLinkModel = (QRDeepLinkModel) other;
        return Intrinsics.areEqual(this.route, qRDeepLinkModel.route) && Intrinsics.areEqual(this.payload, qRDeepLinkModel.payload);
    }

    @Nullable
    public final Map<String, String> getPayload() {
        return this.payload;
    }

    @NotNull
    public final Route getRoute() {
        return this.route;
    }

    public int hashCode() {
        int iHashCode = this.route.hashCode() * 31;
        Map<String, String> map = this.payload;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "QRDeepLinkModel(route=" + this.route + ", payload=" + this.payload + ")";
    }
}

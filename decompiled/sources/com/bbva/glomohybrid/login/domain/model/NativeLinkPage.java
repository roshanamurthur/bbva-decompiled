package com.bbva.glomohybrid.login.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NativeLinkPage.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0019\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004HÆ\u0003J/\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/NativeLinkPage;", "", "", "component1", "", "component2", "route", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "getPayload", "()Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class NativeLinkPage {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String route;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Map<String, Object> payload;

    public NativeLinkPage(@Nullable String str, @Nullable Map<String, ? extends Object> map) {
        this.route = str;
        this.payload = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeLinkPage copy$default(NativeLinkPage nativeLinkPage, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = nativeLinkPage.route;
        }
        if ((i10 & 2) != 0) {
            map = nativeLinkPage.payload;
        }
        return nativeLinkPage.copy(str, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    @Nullable
    public final Map<String, Object> component2() {
        return this.payload;
    }

    @NotNull
    public final NativeLinkPage copy(@Nullable String route, @Nullable Map<String, ? extends Object> payload) {
        return new NativeLinkPage(route, payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeLinkPage)) {
            return false;
        }
        NativeLinkPage nativeLinkPage = (NativeLinkPage) other;
        return Intrinsics.areEqual(this.route, nativeLinkPage.route) && Intrinsics.areEqual(this.payload, nativeLinkPage.payload);
    }

    @Nullable
    public final Map<String, Object> getPayload() {
        return this.payload;
    }

    @Nullable
    public final String getRoute() {
        return this.route;
    }

    public int hashCode() {
        String str = this.route;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, Object> map = this.payload;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NativeLinkPage(route=" + this.route + ", payload=" + this.payload + ")";
    }

    public /* synthetic */ NativeLinkPage(String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : map);
    }
}

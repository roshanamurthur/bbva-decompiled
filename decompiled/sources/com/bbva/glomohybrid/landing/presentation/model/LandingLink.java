package com.bbva.glomohybrid.landing.presentation.model;

import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingLink.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\b\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\t\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingLink;", "", "", "component1", "", "component2", "component3", "route", "isInApp", "isPrivate", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "b", "Z", "()Z", "c", "<init>", "(Ljava/lang/String;ZZ)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingLink {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String route;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean isInApp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isPrivate;

    public LandingLink(@NotNull String route, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.route = route;
        this.isInApp = z10;
        this.isPrivate = z11;
    }

    public static /* synthetic */ LandingLink copy$default(LandingLink landingLink, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = landingLink.route;
        }
        if ((i10 & 2) != 0) {
            z10 = landingLink.isInApp;
        }
        if ((i10 & 4) != 0) {
            z11 = landingLink.isPrivate;
        }
        return landingLink.copy(str, z10, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsInApp() {
        return this.isInApp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    @NotNull
    public final LandingLink copy(@NotNull String route, boolean isInApp, boolean isPrivate) {
        Intrinsics.checkNotNullParameter(route, "route");
        return new LandingLink(route, isInApp, isPrivate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingLink)) {
            return false;
        }
        LandingLink landingLink = (LandingLink) other;
        return Intrinsics.areEqual(this.route, landingLink.route) && this.isInApp == landingLink.isInApp && this.isPrivate == landingLink.isPrivate;
    }

    @NotNull
    public final String getRoute() {
        return this.route;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = this.route.hashCode() * 31;
        boolean z10 = this.isInApp;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iHashCode + r3) * 31;
        boolean z11 = this.isPrivate;
        return i10 + (z11 ? 1 : z11);
    }

    public final boolean isInApp() {
        return this.isInApp;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LandingLink(route=");
        sb2.append(this.route);
        sb2.append(", isInApp=");
        sb2.append(this.isInApp);
        sb2.append(", isPrivate=");
        return i.c(sb2, this.isPrivate, ")");
    }

    public /* synthetic */ LandingLink(String str, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? false : z11);
    }
}

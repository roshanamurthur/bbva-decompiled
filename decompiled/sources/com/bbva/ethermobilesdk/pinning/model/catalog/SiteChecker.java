package com.bbva.ethermobilesdk.pinning.model.catalog;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Catalog.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/catalog/SiteChecker;", "", "certificateTrust", "", "certificateDates", "hostname", "subdomain", "(ZZZZ)V", "getCertificateDates", "()Z", "getCertificateTrust", "getHostname", "getSubdomain", "component1", "component2", "component3", "component4", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SiteChecker {
    private final boolean certificateDates;
    private final boolean certificateTrust;
    private final boolean hostname;
    private final boolean subdomain;

    public SiteChecker() {
        this(false, false, false, false, 15, null);
    }

    public static /* synthetic */ SiteChecker copy$default(SiteChecker siteChecker, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = siteChecker.certificateTrust;
        }
        if ((i10 & 2) != 0) {
            z11 = siteChecker.certificateDates;
        }
        if ((i10 & 4) != 0) {
            z12 = siteChecker.hostname;
        }
        if ((i10 & 8) != 0) {
            z13 = siteChecker.subdomain;
        }
        return siteChecker.copy(z10, z11, z12, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCertificateTrust() {
        return this.certificateTrust;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCertificateDates() {
        return this.certificateDates;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHostname() {
        return this.hostname;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSubdomain() {
        return this.subdomain;
    }

    @NotNull
    public final SiteChecker copy(boolean certificateTrust, boolean certificateDates, boolean hostname, boolean subdomain) {
        return new SiteChecker(certificateTrust, certificateDates, hostname, subdomain);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SiteChecker)) {
            return false;
        }
        SiteChecker siteChecker = (SiteChecker) other;
        return this.certificateTrust == siteChecker.certificateTrust && this.certificateDates == siteChecker.certificateDates && this.hostname == siteChecker.hostname && this.subdomain == siteChecker.subdomain;
    }

    public final boolean getCertificateDates() {
        return this.certificateDates;
    }

    public final boolean getCertificateTrust() {
        return this.certificateTrust;
    }

    public final boolean getHostname() {
        return this.hostname;
    }

    public final boolean getSubdomain() {
        return this.subdomain;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        boolean z10 = this.certificateTrust;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = r1 * 31;
        boolean z11 = this.certificateDates;
        ?? r3 = z11;
        if (z11) {
            r3 = 1;
        }
        int i11 = (i10 + r3) * 31;
        boolean z12 = this.hostname;
        ?? r4 = z12;
        if (z12) {
            r4 = 1;
        }
        int i12 = (i11 + r4) * 31;
        boolean z13 = this.subdomain;
        return i12 + (z13 ? 1 : z13);
    }

    @NotNull
    public String toString() {
        return "SiteChecker(certificateTrust=" + this.certificateTrust + ", certificateDates=" + this.certificateDates + ", hostname=" + this.hostname + ", subdomain=" + this.subdomain + ")";
    }

    public SiteChecker(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.certificateTrust = z10;
        this.certificateDates = z11;
        this.hostname = z12;
        this.subdomain = z13;
    }

    public /* synthetic */ SiteChecker(boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? true : z13);
    }
}

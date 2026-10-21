package com.bbva.glomohybrid.landing.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingBackground.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/model/LandingBackground;", "", "", "component1", "", "component2", "url", "resource", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getResource", "()I", "<init>", "(Ljava/lang/String;I)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingBackground {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int resource;

    public LandingBackground(@Nullable String str, int i10) {
        this.url = str;
        this.resource = i10;
    }

    public static /* synthetic */ LandingBackground copy$default(LandingBackground landingBackground, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = landingBackground.url;
        }
        if ((i11 & 2) != 0) {
            i10 = landingBackground.resource;
        }
        return landingBackground.copy(str, i10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResource() {
        return this.resource;
    }

    @NotNull
    public final LandingBackground copy(@Nullable String url, int resource) {
        return new LandingBackground(url, resource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingBackground)) {
            return false;
        }
        LandingBackground landingBackground = (LandingBackground) other;
        return Intrinsics.areEqual(this.url, landingBackground.url) && this.resource == landingBackground.resource;
    }

    public final int getResource() {
        return this.resource;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.resource;
    }

    @NotNull
    public String toString() {
        return "LandingBackground(url=" + this.url + ", resource=" + this.resource + ")";
    }

    public /* synthetic */ LandingBackground(String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? 0 : i10);
    }
}

package com.bbva.glomo.user.domain.model;

import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MobileServicesType.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0007\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\b\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomo/user/domain/model/MobileServicesType;", "", "", "component1", "component2", "component3", "isGms", "isHms", "isHmsOnly", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "()Z", "b", "c", "<init>", "(ZZZ)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class MobileServicesType {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isGms")
    private final boolean isGms;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isHms")
    private final boolean isHms;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isHmsOnly")
    private final boolean isHmsOnly;

    public MobileServicesType(boolean z10, boolean z11, boolean z12) {
        this.isGms = z10;
        this.isHms = z11;
        this.isHmsOnly = z12;
    }

    public static /* synthetic */ MobileServicesType copy$default(MobileServicesType mobileServicesType, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = mobileServicesType.isGms;
        }
        if ((i10 & 2) != 0) {
            z11 = mobileServicesType.isHms;
        }
        if ((i10 & 4) != 0) {
            z12 = mobileServicesType.isHmsOnly;
        }
        return mobileServicesType.copy(z10, z11, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsGms() {
        return this.isGms;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsHms() {
        return this.isHms;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsHmsOnly() {
        return this.isHmsOnly;
    }

    @NotNull
    public final MobileServicesType copy(boolean isGms, boolean isHms, boolean isHmsOnly) {
        return new MobileServicesType(isGms, isHms, isHmsOnly);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileServicesType)) {
            return false;
        }
        MobileServicesType mobileServicesType = (MobileServicesType) other;
        return this.isGms == mobileServicesType.isGms && this.isHms == mobileServicesType.isHms && this.isHmsOnly == mobileServicesType.isHmsOnly;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z10 = this.isGms;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = r1 * 31;
        boolean z11 = this.isHms;
        ?? r3 = z11;
        if (z11) {
            r3 = 1;
        }
        int i11 = (i10 + r3) * 31;
        boolean z12 = this.isHmsOnly;
        return i11 + (z12 ? 1 : z12);
    }

    public final boolean isGms() {
        return this.isGms;
    }

    public final boolean isHms() {
        return this.isHms;
    }

    public final boolean isHmsOnly() {
        return this.isHmsOnly;
    }

    @NotNull
    public String toString() {
        boolean z10 = this.isGms;
        boolean z11 = this.isHms;
        boolean z12 = this.isHmsOnly;
        StringBuilder sb2 = new StringBuilder("MobileServicesType(isGms=");
        sb2.append(z10);
        sb2.append(", isHms=");
        sb2.append(z11);
        sb2.append(", isHmsOnly=");
        return i.c(sb2, z12, ")");
    }
}

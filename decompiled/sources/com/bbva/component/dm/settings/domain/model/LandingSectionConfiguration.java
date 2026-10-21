package com.bbva.component.dm.settings.domain.model;

import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003JR\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u001bR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0011\u0010)¨\u0006,"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/LandingSectionConfiguration;", "", "", "component1", "", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "", "component6", "type", "priority", "url", "reactivateInDays", "cleanCacheDate", "isVisibleByDefault", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/bbva/component/dm/settings/domain/model/LandingSectionConfiguration;", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPriority", "()I", "c", "getUrl", "d", "Ljava/lang/Integer;", "getReactivateInDays", "e", "getCleanCacheDate", "f", "Z", "()Z", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingSectionConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int priority;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer reactivateInDays;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String cleanCacheDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean isVisibleByDefault;

    public LandingSectionConfiguration(@NotNull String type, int i10, @Nullable String str, @Nullable Integer num, @Nullable String str2, boolean z10) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.priority = i10;
        this.url = str;
        this.reactivateInDays = num;
        this.cleanCacheDate = str2;
        this.isVisibleByDefault = z10;
    }

    public static /* synthetic */ LandingSectionConfiguration copy$default(LandingSectionConfiguration landingSectionConfiguration, String str, int i10, String str2, Integer num, String str3, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = landingSectionConfiguration.type;
        }
        if ((i11 & 2) != 0) {
            i10 = landingSectionConfiguration.priority;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str2 = landingSectionConfiguration.url;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            num = landingSectionConfiguration.reactivateInDays;
        }
        Integer num2 = num;
        if ((i11 & 16) != 0) {
            str3 = landingSectionConfiguration.cleanCacheDate;
        }
        String str5 = str3;
        if ((i11 & 32) != 0) {
            z10 = landingSectionConfiguration.isVisibleByDefault;
        }
        return landingSectionConfiguration.copy(str, i12, str4, num2, str5, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getReactivateInDays() {
        return this.reactivateInDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCleanCacheDate() {
        return this.cleanCacheDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsVisibleByDefault() {
        return this.isVisibleByDefault;
    }

    @NotNull
    public final LandingSectionConfiguration copy(@NotNull String type, int priority, @Nullable String url, @Nullable Integer reactivateInDays, @Nullable String cleanCacheDate, boolean isVisibleByDefault) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new LandingSectionConfiguration(type, priority, url, reactivateInDays, cleanCacheDate, isVisibleByDefault);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingSectionConfiguration)) {
            return false;
        }
        LandingSectionConfiguration landingSectionConfiguration = (LandingSectionConfiguration) other;
        return Intrinsics.areEqual(this.type, landingSectionConfiguration.type) && this.priority == landingSectionConfiguration.priority && Intrinsics.areEqual(this.url, landingSectionConfiguration.url) && Intrinsics.areEqual(this.reactivateInDays, landingSectionConfiguration.reactivateInDays) && Intrinsics.areEqual(this.cleanCacheDate, landingSectionConfiguration.cleanCacheDate) && this.isVisibleByDefault == landingSectionConfiguration.isVisibleByDefault;
    }

    @Nullable
    public final String getCleanCacheDate() {
        return this.cleanCacheDate;
    }

    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    public final Integer getReactivateInDays() {
        return this.reactivateInDays;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.priority) * 31;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.reactivateInDays;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.cleanCacheDate;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z10 = this.isVisibleByDefault;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode4 + r1;
    }

    public final boolean isVisibleByDefault() {
        return this.isVisibleByDefault;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LandingSectionConfiguration(type=");
        sb2.append(this.type);
        sb2.append(", priority=");
        sb2.append(this.priority);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", reactivateInDays=");
        sb2.append(this.reactivateInDays);
        sb2.append(", cleanCacheDate=");
        sb2.append(this.cleanCacheDate);
        sb2.append(", isVisibleByDefault=");
        return i.c(sb2, this.isVisibleByDefault, ")");
    }
}

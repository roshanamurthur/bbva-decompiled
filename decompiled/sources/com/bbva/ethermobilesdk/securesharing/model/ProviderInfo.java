package com.bbva.ethermobilesdk.securesharing.model;

import android.content.ContentValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.securesharing.database.InfoTable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProviderInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/model/ProviderInfo;", "", "Landroid/content/ContentValues;", "toContentValues", "", "component1", "", "component2", "authority", "priority", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getAuthority", "()Ljava/lang/String;", "b", "J", "getPriority", "()J", "<init>", "(Ljava/lang/String;J)V", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ProviderInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String authority;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long priority;

    public ProviderInfo(@NotNull String authority, long j10) {
        Intrinsics.checkNotNullParameter(authority, "authority");
        this.authority = authority;
        this.priority = j10;
    }

    public static /* synthetic */ ProviderInfo copy$default(ProviderInfo providerInfo, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = providerInfo.authority;
        }
        if ((i10 & 2) != 0) {
            j10 = providerInfo.priority;
        }
        return providerInfo.copy(str, j10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthority() {
        return this.authority;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPriority() {
        return this.priority;
    }

    @NotNull
    public final ProviderInfo copy(@NotNull String authority, long priority) {
        Intrinsics.checkNotNullParameter(authority, "authority");
        return new ProviderInfo(authority, priority);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProviderInfo)) {
            return false;
        }
        ProviderInfo providerInfo = (ProviderInfo) other;
        return Intrinsics.areEqual(this.authority, providerInfo.authority) && this.priority == providerInfo.priority;
    }

    @NotNull
    public final String getAuthority() {
        return this.authority;
    }

    public final long getPriority() {
        return this.priority;
    }

    public int hashCode() {
        int iHashCode = this.authority.hashCode() * 31;
        long j10 = this.priority;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    @NotNull
    public final ContentValues toContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(InfoTable.AUTHORITY, getAuthority());
        contentValues.put("priority", Long.valueOf(getPriority()));
        return contentValues;
    }

    @NotNull
    public String toString() {
        return "ProviderInfo(authority=" + this.authority + ", priority=" + this.priority + RootService.CLOSE_BRACKET;
    }
}

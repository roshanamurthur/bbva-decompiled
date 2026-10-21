package com.bbva.component.dm.filefetcher.data.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StoreParams.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/dm/filefetcher/data/model/StoreParams;", "", "", "component1", "component2", "folderName", "authority", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getFolderName", "()Ljava/lang/String;", "b", "getAuthority", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component-dm-filefetcher_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class StoreParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String folderName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String authority;

    public StoreParams(@NotNull String str, @NotNull String str2) {
        this.folderName = str;
        this.authority = str2;
    }

    public static /* synthetic */ StoreParams copy$default(StoreParams storeParams, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = storeParams.folderName;
        }
        if ((i10 & 2) != 0) {
            str2 = storeParams.authority;
        }
        return storeParams.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFolderName() {
        return this.folderName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthority() {
        return this.authority;
    }

    @NotNull
    public final StoreParams copy(@NotNull String folderName, @NotNull String authority) {
        return new StoreParams(folderName, authority);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreParams)) {
            return false;
        }
        StoreParams storeParams = (StoreParams) other;
        return Intrinsics.areEqual(this.folderName, storeParams.folderName) && Intrinsics.areEqual(this.authority, storeParams.authority);
    }

    @NotNull
    public final String getAuthority() {
        return this.authority;
    }

    @NotNull
    public final String getFolderName() {
        return this.folderName;
    }

    public int hashCode() {
        String str = this.folderName;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.authority;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StoreParams(folderName=");
        sb2.append(this.folderName);
        sb2.append(", authority=");
        return d.f(sb2, this.authority, ")");
    }
}

package com.bbva.ethermobilesdk.passchecker.model.internal;

import androidx.activity.a;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HaveBeenPwnedItem.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/internal/HaveBeenPwnedItem;", "", "partialHash", "", "times", "", "(Ljava/lang/String;I)V", "getPartialHash", "()Ljava/lang/String;", "getTimes", "()I", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HaveBeenPwnedItem {

    @NotNull
    private final String partialHash;
    private final int times;

    public HaveBeenPwnedItem(@NotNull String partialHash, int i10) {
        Intrinsics.checkNotNullParameter(partialHash, "partialHash");
        this.partialHash = partialHash;
        this.times = i10;
    }

    public static /* synthetic */ HaveBeenPwnedItem copy$default(HaveBeenPwnedItem haveBeenPwnedItem, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = haveBeenPwnedItem.partialHash;
        }
        if ((i11 & 2) != 0) {
            i10 = haveBeenPwnedItem.times;
        }
        return haveBeenPwnedItem.copy(str, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPartialHash() {
        return this.partialHash;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTimes() {
        return this.times;
    }

    @NotNull
    public final HaveBeenPwnedItem copy(@NotNull String partialHash, int times) {
        Intrinsics.checkNotNullParameter(partialHash, "partialHash");
        return new HaveBeenPwnedItem(partialHash, times);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HaveBeenPwnedItem)) {
            return false;
        }
        HaveBeenPwnedItem haveBeenPwnedItem = (HaveBeenPwnedItem) other;
        return Intrinsics.areEqual(this.partialHash, haveBeenPwnedItem.partialHash) && this.times == haveBeenPwnedItem.times;
    }

    @NotNull
    public final String getPartialHash() {
        return this.partialHash;
    }

    public final int getTimes() {
        return this.times;
    }

    public int hashCode() {
        return (this.partialHash.hashCode() * 31) + this.times;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("HaveBeenPwnedItem(partialHash=");
        sb2.append(this.partialHash);
        sb2.append(", times=");
        return a.d(sb2, this.times, RootService.CLOSE_BRACKET);
    }
}

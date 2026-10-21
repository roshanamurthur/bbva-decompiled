package com.bbva.glomohybrid.base.models;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InAppUpdateInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0001HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomohybrid/base/models/InAppUpdateInfo;", "", "", "component1", "component2", "version", "data", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getVersion", "()I", "b", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "<init>", "(ILjava/lang/Object;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class InAppUpdateInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object data;

    public InAppUpdateInfo(int i10, @NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.version = i10;
        this.data = data;
    }

    public static /* synthetic */ InAppUpdateInfo copy$default(InAppUpdateInfo inAppUpdateInfo, int i10, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = inAppUpdateInfo.version;
        }
        if ((i11 & 2) != 0) {
            obj = inAppUpdateInfo.data;
        }
        return inAppUpdateInfo.copy(i10, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    @NotNull
    public final InAppUpdateInfo copy(int version, @NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new InAppUpdateInfo(version, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppUpdateInfo)) {
            return false;
        }
        InAppUpdateInfo inAppUpdateInfo = (InAppUpdateInfo) other;
        return this.version == inAppUpdateInfo.version && Intrinsics.areEqual(this.data, inAppUpdateInfo.data);
    }

    @NotNull
    public final Object getData() {
        return this.data;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.data.hashCode() + (this.version * 31);
    }

    @NotNull
    public String toString() {
        return "InAppUpdateInfo(version=" + this.version + ", data=" + this.data + ")";
    }
}

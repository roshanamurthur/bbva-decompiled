package com.bbva.component.dm.settings.domain.model;

import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/VersionOperative;", "", "", "component1", "android", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getAndroid", "()I", "<init>", "(I)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class VersionOperative {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int android;

    public VersionOperative(int i10) {
        this.android = i10;
    }

    public static /* synthetic */ VersionOperative copy$default(VersionOperative versionOperative, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = versionOperative.android;
        }
        return versionOperative.copy(i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAndroid() {
        return this.android;
    }

    @NotNull
    public final VersionOperative copy(int android2) {
        return new VersionOperative(android2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VersionOperative) && this.android == ((VersionOperative) other).android;
    }

    public final int getAndroid() {
        return this.android;
    }

    public int hashCode() {
        return this.android;
    }

    @NotNull
    public String toString() {
        return a.c(new StringBuilder("VersionOperative(android="), this.android, ")");
    }
}

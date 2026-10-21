package com.bbva.showinfo.model;

import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResourceOrigin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/showinfo/model/Res;", "Lcom/bbva/showinfo/model/ResourceOrigin;", "", "component1", "value", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue", "()I", "<init>", "(I)V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Res extends ResourceOrigin {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int value;

    public Res(int i10) {
        super(null);
        this.value = i10;
    }

    public static /* synthetic */ Res copy$default(Res res, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = res.value;
        }
        return res.copy(i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final Res copy(int value) {
        return new Res(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Res) && this.value == ((Res) other).value;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return a.c(new StringBuilder("Res(value="), this.value, ")");
    }
}

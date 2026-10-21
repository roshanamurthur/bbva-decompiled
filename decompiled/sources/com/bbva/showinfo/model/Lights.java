package com.bbva.showinfo.model;

import androidx.appcompat.widget.a;
import androidx.collection.h;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoElement.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/bbva/showinfo/model/Lights;", "", "", "component1", "component2", "component3", "color", "ledOnMilliseconds", "ledOffMilliseconds", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getColor", "()I", "setColor", "(I)V", "b", "getLedOnMilliseconds", "setLedOnMilliseconds", "c", "getLedOffMilliseconds", "setLedOffMilliseconds", "<init>", "(III)V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Lights {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int ledOnMilliseconds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int ledOffMilliseconds;

    public Lights(int i10, int i11, int i12) {
        this.color = i10;
        this.ledOnMilliseconds = i11;
        this.ledOffMilliseconds = i12;
    }

    public static /* synthetic */ Lights copy$default(Lights lights, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = lights.color;
        }
        if ((i13 & 2) != 0) {
            i11 = lights.ledOnMilliseconds;
        }
        if ((i13 & 4) != 0) {
            i12 = lights.ledOffMilliseconds;
        }
        return lights.copy(i10, i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLedOnMilliseconds() {
        return this.ledOnMilliseconds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLedOffMilliseconds() {
        return this.ledOffMilliseconds;
    }

    @NotNull
    public final Lights copy(int color, int ledOnMilliseconds, int ledOffMilliseconds) {
        return new Lights(color, ledOnMilliseconds, ledOffMilliseconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Lights)) {
            return false;
        }
        Lights lights = (Lights) other;
        return this.color == lights.color && this.ledOnMilliseconds == lights.ledOnMilliseconds && this.ledOffMilliseconds == lights.ledOffMilliseconds;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getLedOffMilliseconds() {
        return this.ledOffMilliseconds;
    }

    public final int getLedOnMilliseconds() {
        return this.ledOnMilliseconds;
    }

    public int hashCode() {
        return (((this.color * 31) + this.ledOnMilliseconds) * 31) + this.ledOffMilliseconds;
    }

    public final void setColor(int i10) {
        this.color = i10;
    }

    public final void setLedOffMilliseconds(int i10) {
        this.ledOffMilliseconds = i10;
    }

    public final void setLedOnMilliseconds(int i10) {
        this.ledOnMilliseconds = i10;
    }

    @NotNull
    public String toString() {
        int i10 = this.color;
        int i11 = this.ledOnMilliseconds;
        return a.c(h.e("Lights(color=", i10, ", ledOnMilliseconds=", i11, ", ledOffMilliseconds="), this.ledOffMilliseconds, ")");
    }
}

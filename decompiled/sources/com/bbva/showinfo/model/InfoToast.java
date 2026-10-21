package com.bbva.showinfo.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoElement.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/bbva/showinfo/model/InfoToast;", "Lcom/bbva/showinfo/model/InfoElement;", "", "component1", "", "component2", "()Ljava/lang/Integer;", "message", TypedValues.TransitionType.S_DURATION, "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/bbva/showinfo/model/InfoToast;", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "b", "Ljava/lang/Integer;", "getDuration", "setDuration", "(Ljava/lang/Integer;)V", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class InfoToast extends InfoElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer duration;

    /* JADX WARN: Multi-variable type inference failed */
    public InfoToast() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InfoToast copy$default(InfoToast infoToast, String str, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = infoToast.message;
        }
        if ((i10 & 2) != 0) {
            num = infoToast.duration;
        }
        return infoToast.copy(str, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    @NotNull
    public final InfoToast copy(@Nullable String message, @Nullable Integer duration) {
        return new InfoToast(message, duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoToast)) {
            return false;
        }
        InfoToast infoToast = (InfoToast) other;
        return Intrinsics.areEqual(this.message, infoToast.message) && Intrinsics.areEqual(this.duration, infoToast.duration);
    }

    @Nullable
    public final Integer getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.duration;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final void setDuration(@Nullable Integer num) {
        this.duration = num;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    @NotNull
    public String toString() {
        return "InfoToast(message=" + this.message + ", duration=" + this.duration + ")";
    }

    public /* synthetic */ InfoToast(String str, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? 0 : num);
    }

    public InfoToast(@Nullable String str, @Nullable Integer num) {
        super(null);
        this.message = str;
        this.duration = num;
    }
}

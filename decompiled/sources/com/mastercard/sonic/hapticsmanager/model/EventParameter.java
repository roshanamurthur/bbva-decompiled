package com.mastercard.sonic.hapticsmanager.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EventParameter.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/mastercard/sonic/hapticsmanager/model/EventParameter;", "", "", "component1", "", "component2", "parameterID", "parameterValue", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getParameterID", "()Ljava/lang/String;", "b", "D", "getParameterValue", "()D", "<init>", "(Ljava/lang/String;D)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class EventParameter {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ParameterID")
    @NotNull
    private final String parameterID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ParameterValue")
    private final double parameterValue;

    public EventParameter(@NotNull String parameterID, double d2) {
        Intrinsics.checkNotNullParameter(parameterID, "parameterID");
        this.parameterID = parameterID;
        this.parameterValue = d2;
    }

    public static /* synthetic */ EventParameter copy$default(EventParameter eventParameter, String str, double d2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eventParameter.parameterID;
        }
        if ((i10 & 2) != 0) {
            d2 = eventParameter.parameterValue;
        }
        return eventParameter.copy(str, d2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getParameterID() {
        return this.parameterID;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getParameterValue() {
        return this.parameterValue;
    }

    @NotNull
    public final EventParameter copy(@NotNull String parameterID, double parameterValue) {
        Intrinsics.checkNotNullParameter(parameterID, "parameterID");
        return new EventParameter(parameterID, parameterValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventParameter)) {
            return false;
        }
        EventParameter eventParameter = (EventParameter) other;
        return Intrinsics.areEqual(this.parameterID, eventParameter.parameterID) && Double.compare(this.parameterValue, eventParameter.parameterValue) == 0;
    }

    @NotNull
    public final String getParameterID() {
        return this.parameterID;
    }

    public final double getParameterValue() {
        return this.parameterValue;
    }

    public int hashCode() {
        int iHashCode = this.parameterID.hashCode() * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.parameterValue);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    @NotNull
    public String toString() {
        return "EventParameter(parameterID=" + this.parameterID + ", parameterValue=" + this.parameterValue + ")";
    }
}

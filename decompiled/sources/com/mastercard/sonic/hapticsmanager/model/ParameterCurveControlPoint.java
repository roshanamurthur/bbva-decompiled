package com.mastercard.sonic.hapticsmanager.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ParameterCurveControlPoint.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/mastercard/sonic/hapticsmanager/model/ParameterCurveControlPoint;", "", "", "component1", "component2", "parameterValue", "time", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "D", "getParameterValue", "()D", "b", "getTime", "<init>", "(DD)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ParameterCurveControlPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ParameterValue")
    private final double parameterValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Time")
    private final double time;

    public ParameterCurveControlPoint(double d2, double d3) {
        this.parameterValue = d2;
        this.time = d3;
    }

    public static /* synthetic */ ParameterCurveControlPoint copy$default(ParameterCurveControlPoint parameterCurveControlPoint, double d2, double d3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2 = parameterCurveControlPoint.parameterValue;
        }
        if ((i10 & 2) != 0) {
            d3 = parameterCurveControlPoint.time;
        }
        return parameterCurveControlPoint.copy(d2, d3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getParameterValue() {
        return this.parameterValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getTime() {
        return this.time;
    }

    @NotNull
    public final ParameterCurveControlPoint copy(double parameterValue, double time) {
        return new ParameterCurveControlPoint(parameterValue, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParameterCurveControlPoint)) {
            return false;
        }
        ParameterCurveControlPoint parameterCurveControlPoint = (ParameterCurveControlPoint) other;
        return Double.compare(this.parameterValue, parameterCurveControlPoint.parameterValue) == 0 && Double.compare(this.time, parameterCurveControlPoint.time) == 0;
    }

    public final double getParameterValue() {
        return this.parameterValue;
    }

    public final double getTime() {
        return this.time;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.parameterValue);
        int i10 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.time);
        return i10 + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    @NotNull
    public String toString() {
        return "ParameterCurveControlPoint(parameterValue=" + this.parameterValue + ", time=" + this.time + ")";
    }
}

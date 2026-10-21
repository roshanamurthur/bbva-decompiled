package com.mastercard.sonic.hapticsmanager.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ParameterCurve.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J-\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/mastercard/sonic/hapticsmanager/model/ParameterCurve;", "", "", "component1", "", "Lcom/mastercard/sonic/hapticsmanager/model/ParameterCurveControlPoint;", "component2", "", "component3", "parameterID", "parameterCurveControlPoints", "time", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getParameterID", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getParameterCurveControlPoints", "()Ljava/util/List;", "c", "D", "getTime", "()D", "<init>", "(Ljava/lang/String;Ljava/util/List;D)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ParameterCurve {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ParameterID")
    @NotNull
    private final String parameterID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ParameterCurveControlPoints")
    @NotNull
    private final List<ParameterCurveControlPoint> parameterCurveControlPoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Time")
    private final double time;

    public ParameterCurve(@NotNull String parameterID, @NotNull List<ParameterCurveControlPoint> parameterCurveControlPoints, double d2) {
        Intrinsics.checkNotNullParameter(parameterID, "parameterID");
        Intrinsics.checkNotNullParameter(parameterCurveControlPoints, "parameterCurveControlPoints");
        this.parameterID = parameterID;
        this.parameterCurveControlPoints = parameterCurveControlPoints;
        this.time = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParameterCurve copy$default(ParameterCurve parameterCurve, String str, List list, double d2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = parameterCurve.parameterID;
        }
        if ((i10 & 2) != 0) {
            list = parameterCurve.parameterCurveControlPoints;
        }
        if ((i10 & 4) != 0) {
            d2 = parameterCurve.time;
        }
        return parameterCurve.copy(str, list, d2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getParameterID() {
        return this.parameterID;
    }

    @NotNull
    public final List<ParameterCurveControlPoint> component2() {
        return this.parameterCurveControlPoints;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getTime() {
        return this.time;
    }

    @NotNull
    public final ParameterCurve copy(@NotNull String parameterID, @NotNull List<ParameterCurveControlPoint> parameterCurveControlPoints, double time) {
        Intrinsics.checkNotNullParameter(parameterID, "parameterID");
        Intrinsics.checkNotNullParameter(parameterCurveControlPoints, "parameterCurveControlPoints");
        return new ParameterCurve(parameterID, parameterCurveControlPoints, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParameterCurve)) {
            return false;
        }
        ParameterCurve parameterCurve = (ParameterCurve) other;
        return Intrinsics.areEqual(this.parameterID, parameterCurve.parameterID) && Intrinsics.areEqual(this.parameterCurveControlPoints, parameterCurve.parameterCurveControlPoints) && Double.compare(this.time, parameterCurve.time) == 0;
    }

    @NotNull
    public final List<ParameterCurveControlPoint> getParameterCurveControlPoints() {
        return this.parameterCurveControlPoints;
    }

    @NotNull
    public final String getParameterID() {
        return this.parameterID;
    }

    public final double getTime() {
        return this.time;
    }

    public int hashCode() {
        int iA = a.a(this.parameterCurveControlPoints, this.parameterID.hashCode() * 31, 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.time);
        return iA + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    @NotNull
    public String toString() {
        return "ParameterCurve(parameterID=" + this.parameterID + ", parameterCurveControlPoints=" + this.parameterCurveControlPoints + ", time=" + this.time + ")";
    }
}

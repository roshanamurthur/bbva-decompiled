package com.bbva.component_devicemanager.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/component_devicemanager/domain/model/Storage;", "", "", "component1", "", "component2", "capacityNumber", "capacityUnit", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "D", "getCapacityNumber", "()D", "b", "Ljava/lang/String;", "getCapacityUnit", "()Ljava/lang/String;", "<init>", "(DLjava/lang/String;)V", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Storage {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double capacityNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String capacityUnit;

    public Storage(double d2, @NotNull String capacityUnit) {
        Intrinsics.checkNotNullParameter(capacityUnit, "capacityUnit");
        this.capacityNumber = d2;
        this.capacityUnit = capacityUnit;
    }

    public static /* synthetic */ Storage copy$default(Storage storage, double d2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2 = storage.capacityNumber;
        }
        if ((i10 & 2) != 0) {
            str = storage.capacityUnit;
        }
        return storage.copy(d2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getCapacityNumber() {
        return this.capacityNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCapacityUnit() {
        return this.capacityUnit;
    }

    @NotNull
    public final Storage copy(double capacityNumber, @NotNull String capacityUnit) {
        Intrinsics.checkNotNullParameter(capacityUnit, "capacityUnit");
        return new Storage(capacityNumber, capacityUnit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Storage)) {
            return false;
        }
        Storage storage = (Storage) other;
        return Double.compare(this.capacityNumber, storage.capacityNumber) == 0 && Intrinsics.areEqual(this.capacityUnit, storage.capacityUnit);
    }

    public final double getCapacityNumber() {
        return this.capacityNumber;
    }

    @NotNull
    public final String getCapacityUnit() {
        return this.capacityUnit;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.capacityNumber);
        return this.capacityUnit.hashCode() + (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31);
    }

    @NotNull
    public String toString() {
        return "Storage(capacityNumber=" + this.capacityNumber + ", capacityUnit=" + this.capacityUnit + ")";
    }
}

package com.bbva.ethermobilesdk.passchecker.model.api.input;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QualityMap.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/input/QualityMap;", "", "level3", "", "", "level2", "level1", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getLevel1", "()Ljava/util/List;", "getLevel2", "getLevel3", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class QualityMap {

    @SerializedName(alternate = {"level1"}, value = "1")
    @NotNull
    private final List<Integer> level1;

    @SerializedName(alternate = {"level2"}, value = "2")
    @NotNull
    private final List<Integer> level2;

    @SerializedName(alternate = {"level3"}, value = ExifInterface.GPS_MEASUREMENT_3D)
    @NotNull
    private final List<Integer> level3;

    public QualityMap(@NotNull List<Integer> level3, @NotNull List<Integer> level2, @NotNull List<Integer> level1) {
        Intrinsics.checkNotNullParameter(level3, "level3");
        Intrinsics.checkNotNullParameter(level2, "level2");
        Intrinsics.checkNotNullParameter(level1, "level1");
        this.level3 = level3;
        this.level2 = level2;
        this.level1 = level1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QualityMap copy$default(QualityMap qualityMap, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = qualityMap.level3;
        }
        if ((i10 & 2) != 0) {
            list2 = qualityMap.level2;
        }
        if ((i10 & 4) != 0) {
            list3 = qualityMap.level1;
        }
        return qualityMap.copy(list, list2, list3);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.level3;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.level2;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.level1;
    }

    @NotNull
    public final QualityMap copy(@NotNull List<Integer> level3, @NotNull List<Integer> level2, @NotNull List<Integer> level1) {
        Intrinsics.checkNotNullParameter(level3, "level3");
        Intrinsics.checkNotNullParameter(level2, "level2");
        Intrinsics.checkNotNullParameter(level1, "level1");
        return new QualityMap(level3, level2, level1);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QualityMap)) {
            return false;
        }
        QualityMap qualityMap = (QualityMap) other;
        return Intrinsics.areEqual(this.level3, qualityMap.level3) && Intrinsics.areEqual(this.level2, qualityMap.level2) && Intrinsics.areEqual(this.level1, qualityMap.level1);
    }

    @NotNull
    public final List<Integer> getLevel1() {
        return this.level1;
    }

    @NotNull
    public final List<Integer> getLevel2() {
        return this.level2;
    }

    @NotNull
    public final List<Integer> getLevel3() {
        return this.level3;
    }

    public int hashCode() {
        return this.level1.hashCode() + a.a(this.level2, this.level3.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("QualityMap(level3=");
        sb2.append(this.level3);
        sb2.append(", level2=");
        sb2.append(this.level2);
        sb2.append(", level1=");
        return bc.org.bouncycastle.math.ec.custom.sec.a.c(sb2, this.level1, RootService.CLOSE_BRACKET);
    }
}

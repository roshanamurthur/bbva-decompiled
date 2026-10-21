package mx.openpay.library.data.datasource.remote.model.response.eglobal;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlanResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/eglobal/PlanResponseDto;", "", "status", "", "data", "", "", "(Ljava/lang/String;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PlanResponseDto {

    @SerializedName("data")
    @Nullable
    private final List<Integer> data;

    @SerializedName("status")
    @NotNull
    private final String status;

    public PlanResponseDto(@NotNull String status, @Nullable List<Integer> list) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlanResponseDto copy$default(PlanResponseDto planResponseDto, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = planResponseDto.status;
        }
        if ((i10 & 2) != 0) {
            list = planResponseDto.data;
        }
        return planResponseDto.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final List<Integer> component2() {
        return this.data;
    }

    @NotNull
    public final PlanResponseDto copy(@NotNull String status, @Nullable List<Integer> data) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new PlanResponseDto(status, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanResponseDto)) {
            return false;
        }
        PlanResponseDto planResponseDto = (PlanResponseDto) other;
        return Intrinsics.areEqual(this.status, planResponseDto.status) && Intrinsics.areEqual(this.data, planResponseDto.data);
    }

    @Nullable
    public final List<Integer> getData() {
        return this.data;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        List<Integer> list = this.data;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "PlanResponseDto(status=" + this.status + ", data=" + this.data + ")";
    }

    public /* synthetic */ PlanResponseDto(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}

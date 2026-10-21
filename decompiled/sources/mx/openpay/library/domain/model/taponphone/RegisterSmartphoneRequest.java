package mx.openpay.library.domain.model.taponphone;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RegisterSmartphoneRequest.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lmx/openpay/library/domain/model/taponphone/RegisterSmartphoneRequest;", "", "", "component1", "component2", "ptid", "modelName", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getPtid", "()Ljava/lang/String;", "b", "getModelName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RegisterSmartphoneRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String ptid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String modelName;

    public RegisterSmartphoneRequest(@NotNull String ptid, @NotNull String modelName) {
        Intrinsics.checkNotNullParameter(ptid, "ptid");
        Intrinsics.checkNotNullParameter(modelName, "modelName");
        this.ptid = ptid;
        this.modelName = modelName;
    }

    public static /* synthetic */ RegisterSmartphoneRequest copy$default(RegisterSmartphoneRequest registerSmartphoneRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = registerSmartphoneRequest.ptid;
        }
        if ((i10 & 2) != 0) {
            str2 = registerSmartphoneRequest.modelName;
        }
        return registerSmartphoneRequest.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPtid() {
        return this.ptid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModelName() {
        return this.modelName;
    }

    @NotNull
    public final RegisterSmartphoneRequest copy(@NotNull String ptid, @NotNull String modelName) {
        Intrinsics.checkNotNullParameter(ptid, "ptid");
        Intrinsics.checkNotNullParameter(modelName, "modelName");
        return new RegisterSmartphoneRequest(ptid, modelName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterSmartphoneRequest)) {
            return false;
        }
        RegisterSmartphoneRequest registerSmartphoneRequest = (RegisterSmartphoneRequest) other;
        return Intrinsics.areEqual(this.ptid, registerSmartphoneRequest.ptid) && Intrinsics.areEqual(this.modelName, registerSmartphoneRequest.modelName);
    }

    @NotNull
    public final String getModelName() {
        return this.modelName;
    }

    @NotNull
    public final String getPtid() {
        return this.ptid;
    }

    public int hashCode() {
        return this.modelName.hashCode() + (this.ptid.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RegisterSmartphoneRequest(ptid=");
        sb2.append(this.ptid);
        sb2.append(", modelName=");
        return d.f(sb2, this.modelName, ")");
    }
}

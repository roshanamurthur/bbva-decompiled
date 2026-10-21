package com.bbva.library.digipassmanager.models;

import androidx.camera.camera2.internal.n1;
import bk.p;
import bk.q;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.mypinpad.tsdk.isolation.y2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BodyModels.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/bbva/library/digipassmanager/models/CreateTokenBodyModel;", "", "", "", "toMap", "component1", "component2", "component3", "deviceId", "modelId", "idToken", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "b", "getModelId", "c", "getIdToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CreateTokenBodyModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String deviceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String modelId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String idToken;

    public CreateTokenBodyModel(@NotNull String deviceId, @NotNull String modelId, @NotNull String idToken) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        this.deviceId = deviceId;
        this.modelId = modelId;
        this.idToken = idToken;
    }

    public static /* synthetic */ CreateTokenBodyModel copy$default(CreateTokenBodyModel createTokenBodyModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = createTokenBodyModel.deviceId;
        }
        if ((i10 & 2) != 0) {
            str2 = createTokenBodyModel.modelId;
        }
        if ((i10 & 4) != 0) {
            str3 = createTokenBodyModel.idToken;
        }
        return createTokenBodyModel.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIdToken() {
        return this.idToken;
    }

    @NotNull
    public final CreateTokenBodyModel copy(@NotNull String deviceId, @NotNull String modelId, @NotNull String idToken) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        return new CreateTokenBodyModel(deviceId, modelId, idToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateTokenBodyModel)) {
            return false;
        }
        CreateTokenBodyModel createTokenBodyModel = (CreateTokenBodyModel) other;
        return Intrinsics.areEqual(this.deviceId, createTokenBodyModel.deviceId) && Intrinsics.areEqual(this.modelId, createTokenBodyModel.modelId) && Intrinsics.areEqual(this.idToken, createTokenBodyModel.idToken);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getIdToken() {
        return this.idToken;
    }

    @NotNull
    public final String getModelId() {
        return this.modelId;
    }

    public int hashCode() {
        return this.idToken.hashCode() + n1.c(this.modelId, this.deviceId.hashCode() * 31, 31);
    }

    @NotNull
    public final Map<String, Object> toMap() {
        return q.mapOf(TuplesKt.to("deviceId", this.deviceId), TuplesKt.to("model", p.mapOf(TuplesKt.to("id", this.modelId))), TuplesKt.to(DigipassManagerConstants.KEY_SERIAL_NUMBER, this.idToken));
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CreateTokenBodyModel(deviceId=");
        sb2.append(this.deviceId);
        sb2.append(", modelId=");
        sb2.append(this.modelId);
        sb2.append(", idToken=");
        return y2.b(sb2, this.idToken, RootService.CLOSE_BRACKET);
    }
}

package com.bbva.component.dm.naturalauth.data.mapper.common.response;

import com.bbva.component.dm.naturalauth.data.mapper.service.version.v0.GetAuthenticatorsV0Mapper;
import com.bbva.component.dm.naturalauth.data.mapper.service.version.v1.GetAuthenticatorsV1Mapper;
import com.bbva.component.dm.naturalauth.domain.model.Version;
import com.bbva.glomoutils.Mapper;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoDevice;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetAuthenticatorsResponseMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/common/response/GetAuthenticatorsResponseMapper;", "Lcom/bbva/glomoutils/Mapper;", "", "", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoDevice;", "input", "map", "Lcom/bbva/component/dm/naturalauth/domain/model/Version;", "version", "<init>", "(Lcom/bbva/component/dm/naturalauth/domain/model/Version;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class GetAuthenticatorsResponseMapper implements Mapper<String, List<? extends FidoDevice>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Version f27827a;

    public GetAuthenticatorsResponseMapper(@NotNull Version version) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.f27827a = version;
    }

    @Override // com.bbva.glomoutils.Mapper
    @NotNull
    public List<FidoDevice> map(@NotNull String input) {
        Mapper getAuthenticatorsV1Mapper;
        Intrinsics.checkNotNullParameter(input, "input");
        Version.V0 v0 = Version.V0.INSTANCE;
        Version version = this.f27827a;
        if (Intrinsics.areEqual(version, v0)) {
            getAuthenticatorsV1Mapper = new GetAuthenticatorsV0Mapper();
        } else {
            if (!Intrinsics.areEqual(version, Version.V1.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            getAuthenticatorsV1Mapper = new GetAuthenticatorsV1Mapper();
        }
        return getAuthenticatorsV1Mapper.map(input);
    }
}

package com.bbva.ethermobilesdk.plugin.devicemanager.params;

import androidx.annotation.Keep;
import com.bbva.component.dm.naturalauth.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceIdParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/devicemanager/params/DeviceIdParam;", "Lcom/bbva/ethermobilesdk/plugin/devicemanager/params/MalformedParams;", Constants.backendRequestUserId, "", "<init>", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "isMalformed", "", "devicemanager-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceIdParam implements MalformedParams {

    @Nullable
    private final String userId;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceIdParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    @Override // com.bbva.ethermobilesdk.plugin.devicemanager.params.MalformedParams
    public boolean isMalformed() {
        String str = this.userId;
        return str == null || str.length() == 0;
    }

    public DeviceIdParam(@Nullable String str) {
        this.userId = str;
    }

    public /* synthetic */ DeviceIdParam(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}

package com.salesforce.marketingcloud.sfmcsdk.modules.cdp;

import com.salesforce.marketingcloud.sfmcsdk.modules.Module;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CdpModule.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/modules/cdp/CdpModule;", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/Module;", "()V", "name", "", "getName", "()Ljava/lang/String;", "Companion", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CdpModule extends Module {

    @NotNull
    public static final String TAG = "~$CdpSdkModule";

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.Module
    @NotNull
    public String getName() {
        return "CDP";
    }
}

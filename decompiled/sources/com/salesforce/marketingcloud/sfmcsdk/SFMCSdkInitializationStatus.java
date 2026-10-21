package com.salesforce.marketingcloud.sfmcsdk;

import kotlin.Metadata;

/* JADX INFO: compiled from: SFMCSdk.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkInitializationStatus;", "Lcom/salesforce/marketingcloud/sfmcsdk/InitializationStatus;", "success", "", "(Z)V", "status", "", "getStatus", "()I", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SFMCSdkInitializationStatus implements InitializationStatus {
    private final boolean success;

    public SFMCSdkInitializationStatus(boolean z10) {
        this.success = z10;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.InitializationStatus
    public int getStatus() {
        return this.success ? 1 : -1;
    }
}

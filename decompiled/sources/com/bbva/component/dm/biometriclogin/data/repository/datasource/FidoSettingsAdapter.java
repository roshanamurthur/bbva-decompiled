package com.bbva.component.dm.biometriclogin.data.repository.datasource;

import kotlin.Metadata;

/* JADX INFO: compiled from: FidoSettingsAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/FidoSettingsAdapter;", "", "isAccessEnabled", "", "()Z", "setAccessEnabled", "(Z)V", "isFidoEnrolled", "setFidoEnrolled", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FidoSettingsAdapter {
    boolean isAccessEnabled();

    boolean isFidoEnrolled();

    void setAccessEnabled(boolean z10);

    void setFidoEnrolled(boolean z10);
}

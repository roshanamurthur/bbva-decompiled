package com.bbva.glomohybrid.ether;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultExternalDeviceIdProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/ether/ExternalDeviceIdProvider;", "", "generateDeviceId", "", "obtain", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ExternalDeviceIdProvider {
    @NotNull
    String generateDeviceId();

    @NotNull
    String obtain();
}

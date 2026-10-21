package com.veridas.contextualdata.telephony;

import android.content.Context;
import android.telephony.TelephonyManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TelephonyContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/veridas/contextualdata/telephony/TelephonyContextualDataProvider;", "Lcom/veridas/contextualdata/telephony/ITelephonyContextualDataProvider;", "", "getMobileCarrierName", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class TelephonyContextualDataProvider implements ITelephonyContextualDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f66731a;

    public TelephonyContextualDataProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66731a = context;
    }

    @Override // com.veridas.contextualdata.telephony.ITelephonyContextualDataProvider
    @Nullable
    public String getMobileCarrierName() {
        Object systemService = this.f66731a.getApplicationContext().getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
        if (networkOperatorName == null || l.isBlank(networkOperatorName)) {
            return null;
        }
        return networkOperatorName;
    }
}

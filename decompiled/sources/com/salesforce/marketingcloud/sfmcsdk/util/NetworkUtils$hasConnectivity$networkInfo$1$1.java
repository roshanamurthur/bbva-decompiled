package com.salesforce.marketingcloud.sfmcsdk.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NetworkUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class NetworkUtils$hasConnectivity$networkInfo$1$1 extends Lambda implements Function0<String> {
    public static final NetworkUtils$hasConnectivity$networkInfo$1$1 INSTANCE = new NetworkUtils$hasConnectivity$networkInfo$1$1();

    public NetworkUtils$hasConnectivity$networkInfo$1$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        return "Device has _no_ connectivity.";
    }
}

package com.viergegroup.sdk.taptophone.vierge.models;

import bk.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fj\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/HostType;", "", "", "hostId", com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getHostId", "()I", "setHostId", "(I)V", "", "hostTypeName", "Ljava/lang/String;", "getHostTypeName", "()Ljava/lang/String;", "setHostTypeName", "(Ljava/lang/String;)V", "hostLogsName", "getHostLogsName", "setHostLogsName", "Companion", "Unknown", "ProsaDUKPT", "ProsaTLS", "TestingDUKPTHost", "TestingTLSHost", "TestingBanorte", "Banorte", "ProsaDUKPTDev", "ProsaDUKPTProd", "OpenPayDev", "OpenPayProd", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHostType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HostType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/HostType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,45:1\n8811#2,2:46\n9071#2,4:48\n8811#2,2:52\n9071#2,4:54\n*S KotlinDebug\n*F\n+ 1 HostType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/HostType\n*L\n20#1:46,2\n20#1:48,4\n27#1:52,2\n27#1:54,4\n*E\n"})
public enum HostType {
    Unknown("Unknown", "Unknown", "unknown"),
    ProsaDUKPT("ProsaDUKPT", "ProsaDUKPT", "dukpt"),
    ProsaTLS("ProsaTLS", "ProsaTLS", "tls"),
    TestingDUKPTHost("TestingDUKPTHost", "TestingDUKPTHost", "testing"),
    TestingTLSHost("TestingTLSHost", "TestingTLSHost", "testing"),
    TestingBanorte("TestingBanorte", "TestingBanorte", "testing"),
    Banorte("Banorte", "Banorte", "testing"),
    ProsaDUKPTDev("ProsaDUKPTDev", "ProsaDUKPTDev", "dukpt"),
    ProsaDUKPTProd("ProsaDUKPTProd", "ProsaDUKPTProd", "dukpt"),
    OpenPayDev("OpenPayDev", "OpenPayDev", "testing"),
    OpenPayProd("OpenPayProd", "OpenPayProd", "testing");


    @NotNull
    private static final Map<Integer, HostType> AssetInjection;

    @NotNull
    private static List<String> BuildConfig;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, HostType> inject;

    @NotNull
    private String bOD;

    @NotNull
    private String getInjectedTransactionParameters;
    private int setInjectedTransactionParameters;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0005J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\nR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/HostType$Companion;", "", "()V", "map", "", "", "Lcom/viergegroup/sdk/taptophone/vierge/models/HostType;", "map2", "", "types", "", "getTypes", "()Ljava/util/List;", "setTypes", "(Ljava/util/List;)V", "fromId", "hostId", "fromName", "hostTypeName", "getNames", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nHostType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HostType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/HostType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,45:1\n13579#2,2:46\n*S KotlinDebug\n*F\n+ 1 HostType.kt\ncom/viergegroup/sdk/taptophone/vierge/models/HostType$Companion\n*L\n36#1:46,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HostType fromId(int hostId) {
            HostType hostType = (HostType) HostType.AssetInjection.get(Integer.valueOf(hostId));
            return hostType == null ? HostType.TestingDUKPTHost : hostType;
        }

        @NotNull
        public final HostType fromName(@NotNull String hostTypeName) {
            Intrinsics.checkNotNullParameter(hostTypeName, "");
            HostType hostType = (HostType) HostType.inject.get(hostTypeName);
            return hostType == null ? HostType.ProsaDUKPT : hostType;
        }

        @NotNull
        public final List<String> getNames() {
            if (getTypes().size() == 0) {
                for (HostType hostType : HostType.values()) {
                    HostType.INSTANCE.getTypes().add(hostType.name());
                }
            }
            return getTypes();
        }

        @NotNull
        public final List<String> getTypes() {
            return HostType.BuildConfig;
        }

        public final void setTypes(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            HostType.BuildConfig = list;
        }
    }

    static {
        HostType[] hostTypeArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(hostTypeArrValues.length), 16));
        for (HostType hostType : hostTypeArrValues) {
            linkedHashMap.put(hostType.getInjectedTransactionParameters, hostType);
        }
        inject = linkedHashMap;
        HostType[] hostTypeArrValues2 = values();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(hostTypeArrValues2.length), 16));
        for (HostType hostType2 : hostTypeArrValues2) {
            linkedHashMap2.put(Integer.valueOf(hostType2.setInjectedTransactionParameters), hostType2);
        }
        AssetInjection = linkedHashMap2;
        BuildConfig = new ArrayList();
    }

    HostType(String str, String str2, String str3) {
        this.setInjectedTransactionParameters = i;
        this.getInjectedTransactionParameters = str2;
        this.bOD = str3;
    }

    /* JADX INFO: renamed from: getHostId, reason: from getter */
    public final int getSetInjectedTransactionParameters() {
        return this.setInjectedTransactionParameters;
    }

    @NotNull
    /* JADX INFO: renamed from: getHostLogsName, reason: from getter */
    public final String getBOD() {
        return this.bOD;
    }

    @NotNull
    /* JADX INFO: renamed from: getHostTypeName, reason: from getter */
    public final String getGetInjectedTransactionParameters() {
        return this.getInjectedTransactionParameters;
    }

    public final void setHostId(int i10) {
        this.setInjectedTransactionParameters = i10;
    }

    public final void setHostLogsName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bOD = str;
    }

    public final void setHostTypeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getInjectedTransactionParameters = str;
    }
}

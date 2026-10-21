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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fj\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode;", "", "", "pemId", com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPemId", "()I", "setPemId", "(I)V", "", "pointOfServiceEntryModeId", "Ljava/lang/String;", "getPointOfServiceEntryModeId", "()Ljava/lang/String;", "setPointOfServiceEntryModeId", "(Ljava/lang/String;)V", "pointOfServiceEntryModeName", "getPointOfServiceEntryModeName", "setPointOfServiceEntryModeName", "PointOfServiceEntryModeDescription", "getPointOfServiceEntryModeDescription", "setPointOfServiceEntryModeDescription", "Companion", "Undefined", "Inserted", "Swiped", "Fallback", "ReCheckIn", "Contactless", "Reversal", "KeyLoad", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPointOfServiceEntryMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointOfServiceEntryMode.kt\ncom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,46:1\n8811#2,2:47\n9071#2,4:49\n8811#2,2:53\n9071#2,4:55\n*S KotlinDebug\n*F\n+ 1 PointOfServiceEntryMode.kt\ncom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode\n*L\n17#1:47,2\n17#1:49,4\n23#1:53,2\n23#1:55,4\n*E\n"})
public enum PointOfServiceEntryMode {
    Undefined(99, "0", "Undefined", "Undefined"),
    Inserted(1, "051", "Inserted", "Card Inserted"),
    Swiped(2, "021", "Swiped", "Card Swiped"),
    Fallback(3, "080", "Fallback", "Fallback"),
    ReCheckIn(4, "011", "ReCheckIn", "ReCheckIn"),
    Contactless(5, "071", "Contactless", "Contactless"),
    Reversal(6, "911", "Reversal", "Reversal"),
    KeyLoad(7, "010", "Keyload", "KeyLoad");


    @NotNull
    private static List<String> BuildConfig;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, PointOfServiceEntryMode> ExampleApp;

    @NotNull
    private static final Map<Integer, PointOfServiceEntryMode> inject;

    @NotNull
    private String AssetInjection;

    @NotNull
    private String bOD;

    @NotNull
    private String getInjectedTransactionParameters;
    private int setInjectedTransactionParameters;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0005J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\nR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode$Companion;", "", "()V", "map", "", "", "Lcom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode;", "map3", "", "types", "", "getTypes", "()Ljava/util/List;", "setTypes", "(Ljava/util/List;)V", "fromId", "hostId", "fromPointServiceEntryModeId", "pointOfServiceEntryModeId", "getNames", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPointOfServiceEntryMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointOfServiceEntryMode.kt\ncom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,46:1\n13579#2,2:47\n*S KotlinDebug\n*F\n+ 1 PointOfServiceEntryMode.kt\ncom/viergegroup/sdk/taptophone/vierge/models/PointOfServiceEntryMode$Companion\n*L\n37#1:47,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PointOfServiceEntryMode fromId(int hostId) {
            PointOfServiceEntryMode pointOfServiceEntryMode = (PointOfServiceEntryMode) PointOfServiceEntryMode.inject.get(Integer.valueOf(hostId));
            return pointOfServiceEntryMode == null ? PointOfServiceEntryMode.Undefined : pointOfServiceEntryMode;
        }

        @NotNull
        public final PointOfServiceEntryMode fromPointServiceEntryModeId(@NotNull String pointOfServiceEntryModeId) {
            Intrinsics.checkNotNullParameter(pointOfServiceEntryModeId, "");
            PointOfServiceEntryMode pointOfServiceEntryMode = (PointOfServiceEntryMode) PointOfServiceEntryMode.ExampleApp.get(pointOfServiceEntryModeId);
            return pointOfServiceEntryMode == null ? PointOfServiceEntryMode.Undefined : pointOfServiceEntryMode;
        }

        @NotNull
        public final List<String> getNames() {
            if (PointOfServiceEntryMode.INSTANCE.getTypes().size() == 0) {
                for (PointOfServiceEntryMode pointOfServiceEntryMode : PointOfServiceEntryMode.values()) {
                    PointOfServiceEntryMode.INSTANCE.getTypes().add(pointOfServiceEntryMode.name());
                }
            }
            return getTypes();
        }

        @NotNull
        public final List<String> getTypes() {
            return PointOfServiceEntryMode.BuildConfig;
        }

        public final void setTypes(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            PointOfServiceEntryMode.BuildConfig = list;
        }
    }

    static {
        PointOfServiceEntryMode[] pointOfServiceEntryModeArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(pointOfServiceEntryModeArrValues.length), 16));
        for (PointOfServiceEntryMode pointOfServiceEntryMode : pointOfServiceEntryModeArrValues) {
            linkedHashMap.put(Integer.valueOf(pointOfServiceEntryMode.setInjectedTransactionParameters), pointOfServiceEntryMode);
        }
        inject = linkedHashMap;
        PointOfServiceEntryMode[] pointOfServiceEntryModeArrValues2 = values();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(pointOfServiceEntryModeArrValues2.length), 16));
        for (PointOfServiceEntryMode pointOfServiceEntryMode2 : pointOfServiceEntryModeArrValues2) {
            linkedHashMap2.put(pointOfServiceEntryMode2.AssetInjection, pointOfServiceEntryMode2);
        }
        ExampleApp = linkedHashMap2;
        BuildConfig = new ArrayList();
    }

    PointOfServiceEntryMode(int i10, String str, String str2, String str3) {
        this.setInjectedTransactionParameters = i10;
        this.AssetInjection = str;
        this.getInjectedTransactionParameters = str2;
        this.bOD = str3;
    }

    /* JADX INFO: renamed from: getPemId, reason: from getter */
    public final int getSetInjectedTransactionParameters() {
        return this.setInjectedTransactionParameters;
    }

    @NotNull
    /* JADX INFO: renamed from: getPointOfServiceEntryModeDescription, reason: from getter */
    public final String getBOD() {
        return this.bOD;
    }

    @NotNull
    /* JADX INFO: renamed from: getPointOfServiceEntryModeId, reason: from getter */
    public final String getAssetInjection() {
        return this.AssetInjection;
    }

    @NotNull
    /* JADX INFO: renamed from: getPointOfServiceEntryModeName, reason: from getter */
    public final String getGetInjectedTransactionParameters() {
        return this.getInjectedTransactionParameters;
    }

    public final void setPemId(int i10) {
        this.setInjectedTransactionParameters = i10;
    }

    public final void setPointOfServiceEntryModeDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bOD = str;
    }

    public final void setPointOfServiceEntryModeId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AssetInjection = str;
    }

    public final void setPointOfServiceEntryModeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getInjectedTransactionParameters = str;
    }
}

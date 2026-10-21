package com.appsflyer.internal;

import androidx.annotation.VisibleForTesting;
import bk.q;
import com.appsflyer.AppsFlyerLib;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u0000 \u00012\u00020\r:\u0001\u0001BE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFc1oSDK;", "AFa1xSDK", "", "p0", "", "p1", "", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;Z)V", "Lcom/appsflyer/internal/AFc1hSDK;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFc1oSDK extends AFb1ySDK {

    /* JADX INFO: renamed from: AFa1xSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1oSDK$AFa1xSDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\rB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0007\u001a\u0006*\u00020\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFc1oSDK$AFa1xSDK;", "", "p0", "p1", "p2", "p3", "p4", "AFInAppEventType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "values", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static String AFInAppEventType(@NotNull String p4, @NotNull String p10, @Nullable String p11, @NotNull String p12, @NotNull String p13) {
            Intrinsics.checkNotNullParameter(p4, "");
            Intrinsics.checkNotNullParameter(p10, "");
            Intrinsics.checkNotNullParameter(p12, "");
            Intrinsics.checkNotNullParameter(p13, "");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(p4);
            sb2.append(p10);
            return AFb1zSDK.AFKeystoreWrapper(AFb1zSDK.values(p13, p11, sb2.toString()), p12);
        }

        public static String values(String p4, String p10, String p11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format(AFc1qSDK.valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
            sb2.append(p4);
            sb2.append(p11);
            sb2.append("?device_id=");
            sb2.append(p10);
            return sb2.toString();
        }
    }

    public /* synthetic */ AFc1oSDK(String str, Map map, byte[] bArr, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i10 & 4) != 0 ? null : bArr, (i10 & 8) != 0 ? "GET" : str2, (i10 & 16) != 0 ? false : z10);
    }

    @JvmStatic
    @NotNull
    public static final AFc1oSDK AFKeystoreWrapper(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String strValues = Companion.values(str, str2, str3);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        AFc1oSDK aFc1oSDK = new AFc1oSDK(strValues, q.mapOf(TuplesKt.to("Connection", HearingDisabilitiesConstants.CLOSE_MODAL), TuplesKt.to("af_request_epoch_ms", strValueOf), TuplesKt.to("af_sig", Companion.AFInAppEventType(str, str3, str2, str4, strValueOf))), null, null, false, 28, null);
        aFc1oSDK.AFKeystoreWrapper(10000);
        return aFc1oSDK;
    }

    private AFc1oSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z10) {
        super(str, bArr, str2, map, z10);
    }
}

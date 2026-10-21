package com.appsflyer.internal;

import com.bbva.appsflyer.DeepLinkListenerAdapter;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\u0018\u0000 \u00012\u00020\u0011:\u0001\u0001B\u001b\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\t\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\t\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/AFg1zSDK;", "AFa1vSDK", "Lcom/appsflyer/internal/AFg1wSDK;", "values", "Lcom/appsflyer/internal/AFg1wSDK;", DeepLinkListenerAdapter.Constants.ERROR_AF_KEYSTORE_WRAPPER, "Lcom/appsflyer/internal/AFc1zSDK;", "AFInAppEventParameterName", "Lcom/appsflyer/internal/AFc1zSDK;", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "", "p0", "", "(Ljava/lang/String;Z)Ljava/lang/String;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1zSDK;Lcom/appsflyer/internal/AFg1wSDK;)V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFg1zSDK {

    @JvmField
    @NotNull
    public static final String AFInAppEventType;

    @JvmField
    @NotNull
    public static final String AFKeystoreWrapper;

    @JvmField
    @NotNull
    public static final String AFLogger;

    @JvmField
    @Nullable
    public static String AFLogger$LogLevel;

    @JvmField
    @Nullable
    public static String AFVersionDeclaration;

    @JvmField
    @NotNull
    public static final String afDebugLog;

    @JvmField
    @Nullable
    public static String afErrorLog;

    @NotNull
    private static final String afErrorLogForExcManagerOnly;

    @JvmField
    @Nullable
    public static String afInfoLog;

    @JvmField
    @NotNull
    public static final String afRDLog;

    @JvmField
    @Nullable
    public static String afWarnLog;

    @JvmField
    @Nullable
    public static String getLevel;

    @JvmField
    @NotNull
    public static final String valueOf;

    /* JADX INFO: renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    @NotNull
    public final AFc1zSDK valueOf;

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    @NotNull
    public final AFg1wSDK AFKeystoreWrapper;

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AFa1dSDK.AFKeystoreWrapper);
        sb2.append("/androidevent?app_id=");
        String string = sb2.toString();
        afErrorLogForExcManagerOnly = string;
        StringBuilder sb3 = new StringBuilder("https://%sattr.%s/api/v");
        sb3.append(string);
        valueOf = sb3.toString();
        AFKeystoreWrapper = "https://%sadrevenue.%s/api/v2/generic/v6.12.1/android?app_id=";
        AFInAppEventType = "https://%sadrevenue.%s/api/v2/log/AdImpression/v6.12.1/android?app_id=";
        StringBuilder sb4 = new StringBuilder("https://%sconversions.%s/api/v");
        sb4.append(string);
        AFLogger = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%slaunches.%s/api/v");
        sb5.append(string);
        afDebugLog = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%sinapps.%s/api/v");
        sb6.append(string);
        afRDLog = sb6.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AFg1zSDK(@NotNull AFc1zSDK aFc1zSDK) {
        this(aFc1zSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFc1zSDK, "");
    }

    public static String valueOf(String str, boolean z10) {
        StringBuilder sbD = androidx.camera.core.impl.utils.c.d(str);
        sbD.append(!z10 ? "&buildnumber=6.12.1" : "");
        return sbD.toString();
    }

    @JvmOverloads
    private AFg1zSDK(@NotNull AFc1zSDK aFc1zSDK, @NotNull AFg1wSDK aFg1wSDK) {
        Intrinsics.checkNotNullParameter(aFc1zSDK, "");
        Intrinsics.checkNotNullParameter(aFg1wSDK, "");
        this.valueOf = aFc1zSDK;
        this.AFKeystoreWrapper = aFg1wSDK;
    }

    public /* synthetic */ AFg1zSDK(AFc1zSDK aFc1zSDK, AFg1wSDK aFg1wSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1zSDK, (i10 & 2) != 0 ? new AFf1aSDK() : aFg1wSDK);
    }
}

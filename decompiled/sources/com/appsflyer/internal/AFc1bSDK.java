package com.appsflyer.internal;

import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\tB#\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0001X\u0007¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u0004X\u0007¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0007¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/appsflyer/internal/AFc1bSDK;", "Lcom/appsflyer/internal/AFc1aSDK;", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "Lcom/appsflyer/internal/AFc1aSDK;", "", DeepLinkListenerAdapter.Constants.ERROR_AF_KEYSTORE_WRAPPER, "Ljava/lang/String;", "AFInAppEventType", "AFInAppEventParameterName", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", GenerateActivationFormCommand.HASH_CODE, "()I", "toString", "()Ljava/lang/String;", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFc1aSDK;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AFc1bSDK {

    /* JADX INFO: renamed from: AFInAppEventType, reason: from kotlin metadata */
    @Nullable
    public final String AFInAppEventParameterName;

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    public final String AFInAppEventType;

    @NotNull
    public final AFc1aSDK valueOf;

    public AFc1bSDK(@NotNull String str, @Nullable String str2, @NotNull AFc1aSDK aFc1aSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFc1aSDK, "");
        this.AFInAppEventType = str;
        this.AFInAppEventParameterName = str2;
        this.valueOf = aFc1aSDK;
    }

    public final boolean equals(@Nullable Object p4) {
        if (this == p4) {
            return true;
        }
        if (!(p4 instanceof AFc1bSDK)) {
            return false;
        }
        AFc1bSDK aFc1bSDK = (AFc1bSDK) p4;
        return Intrinsics.areEqual(this.AFInAppEventType, aFc1bSDK.AFInAppEventType) && Intrinsics.areEqual(this.AFInAppEventParameterName, aFc1bSDK.AFInAppEventParameterName) && this.valueOf == aFc1bSDK.valueOf;
    }

    public final int hashCode() {
        int iHashCode = this.AFInAppEventType.hashCode() * 31;
        String str = this.AFInAppEventParameterName;
        return this.valueOf.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFc1bSDK(AFInAppEventType=");
        sb2.append(this.AFInAppEventType);
        sb2.append(", AFInAppEventParameterName=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(", valueOf=");
        sb2.append(this.valueOf);
        sb2.append(RootService.CLOSE_BRACKET);
        return sb2.toString();
    }
}

package com.appsflyer.internal;

import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u000bB\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0001X\u0007¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/appsflyer/internal/AFc1aSDK;", "", "AFInAppEventParameterName", "Ljava/lang/String;", DeepLinkListenerAdapter.Constants.ERROR_AF_KEYSTORE_WRAPPER, "values", "AFInAppEventType", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
public enum AFc1aSDK {
    API(SqlContracts.TokenEntry.API),
    RC("rc"),
    DEFAULT("");


    /* JADX INFO: renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    @NotNull
    public final String AFKeystoreWrapper;

    AFc1aSDK(String str) {
        this.AFKeystoreWrapper = str;
    }
}

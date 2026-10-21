package com.bbva.appsflyer;

import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeepLinkListenerAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/appsflyer/DeepLinkListenerAdapter;", "Lcom/appsflyer/deeplink/DeepLinkListener;", "Lcom/appsflyer/deeplink/DeepLinkResult;", "deepLinkResult", "", "onDeepLinking", "Lcom/bbva/appsflyer/InternalDeepLinkListener;", "conversionListener", "<init>", "(Lcom/bbva/appsflyer/InternalDeepLinkListener;)V", "Constants", "appsflyer_release"}, k = 1, mv = {1, 8, 0})
public final class DeepLinkListenerAdapter implements DeepLinkListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InternalDeepLinkListener f26557a;

    /* JADX INFO: compiled from: DeepLinkListenerAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bbva/appsflyer/DeepLinkListenerAdapter$Constants;", "", "()V", "DEEP_LINK", "", "DEEP_LINK_VALUE", "ERROR", "ERROR_AF_KEYSTORE_WRAPPER", "ERROR_DEVELOPER_ERROR", "ERROR_HTTP_STATUS_CODE", "ERROR_NETWORK", "ERROR_TIMEOUT", "ERROR_UNEXPECTED", "IS_DEFERRED", "STATUS", "STATUS_ERROR", "STATUS_FOUND", "STATUS_NOT_FOUND", "STATUS_VALUE_OF", "appsflyer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Constants {

        @NotNull
        public static final String DEEP_LINK = "deepLink";

        @NotNull
        public static final String DEEP_LINK_VALUE = "deepLinkValue";

        @NotNull
        public static final String ERROR = "error";

        @NotNull
        public static final String ERROR_AF_KEYSTORE_WRAPPER = "AFKeystoreWrapper";

        @NotNull
        public static final String ERROR_DEVELOPER_ERROR = "developerError";

        @NotNull
        public static final String ERROR_HTTP_STATUS_CODE = "httpStatusCode";

        @NotNull
        public static final String ERROR_NETWORK = "network";

        @NotNull
        public static final String ERROR_TIMEOUT = "timeout";

        @NotNull
        public static final String ERROR_UNEXPECTED = "unexpected";

        @NotNull
        public static final Constants INSTANCE = new Constants();

        @NotNull
        public static final String IS_DEFERRED = "isDeferred";

        @NotNull
        public static final String STATUS = "status";

        @NotNull
        public static final String STATUS_ERROR = "error";

        @NotNull
        public static final String STATUS_FOUND = "found";

        @NotNull
        public static final String STATUS_NOT_FOUND = "notFound";

        @NotNull
        public static final String STATUS_VALUE_OF = "valueOf";
    }

    /* JADX INFO: compiled from: DeepLinkListenerAdapter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DeepLinkResult.Status.values().length];
            try {
                iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeepLinkResult.Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DeepLinkResult.Error.values().length];
            try {
                iArr2[DeepLinkResult.Error.TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DeepLinkResult.Error.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DeepLinkResult.Error.HTTP_STATUS_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DeepLinkResult.Error.UNEXPECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DeepLinkResult.Error.DEVELOPER_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DeepLinkListenerAdapter(@NotNull InternalDeepLinkListener conversionListener) {
        Intrinsics.checkNotNullParameter(conversionListener, "conversionListener");
        this.f26557a = conversionListener;
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(@NotNull DeepLinkResult deepLinkResult) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(deepLinkResult, "deepLinkResult");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = WhenMappings.$EnumSwitchMapping$0[deepLinkResult.getStatus().ordinal()];
        if (i10 == 1) {
            str = Constants.STATUS_FOUND;
        } else if (i10 != 2) {
            str = i10 != 3 ? Constants.STATUS_VALUE_OF : "error";
        } else {
            str = Constants.STATUS_NOT_FOUND;
        }
        linkedHashMap.put("status", str);
        DeepLinkResult.Error error = deepLinkResult.getError();
        int i11 = error == null ? -1 : WhenMappings.$EnumSwitchMapping$1[error.ordinal()];
        if (i11 == 1) {
            str2 = "timeout";
        } else if (i11 == 2) {
            str2 = Constants.ERROR_NETWORK;
        } else if (i11 == 3) {
            str2 = "httpStatusCode";
        } else if (i11 != 4) {
            str2 = i11 != 5 ? Constants.ERROR_AF_KEYSTORE_WRAPPER : Constants.ERROR_DEVELOPER_ERROR;
        } else {
            str2 = Constants.ERROR_UNEXPECTED;
        }
        linkedHashMap.put("error", str2);
        if (deepLinkResult.getDeepLink() != null) {
            linkedHashMap.put(Constants.DEEP_LINK, deepLinkResult.getDeepLink().toString());
            linkedHashMap.put(Constants.IS_DEFERRED, deepLinkResult.getDeepLink().isDeferred());
            linkedHashMap.put(Constants.DEEP_LINK_VALUE, deepLinkResult.getDeepLink().getDeepLinkValue());
        }
        this.f26557a.onDeepLinkEvent(linkedHashMap);
    }
}

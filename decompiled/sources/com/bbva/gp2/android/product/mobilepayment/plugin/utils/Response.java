package com.bbva.gp2.android.product.mobilepayment.plugin.utils;

import com.bbva.gp2.android.product.mobilepayment.plugin.responses.ResponsePayload;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Response.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/plugin/utils/Response;", "", "<init>", "()V", "Companion", "payments-mobilepayment-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Response {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String RESULT_ERROR = "ERROR";

    @NotNull
    private static final String RESULT_OK = "OK";

    /* JADX INFO: compiled from: Response.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/plugin/utils/Response$Companion;", "", "<init>", "()V", "RESULT_OK", "", "RESULT_ERROR", "ok", "Lcom/bbva/gp2/android/product/mobilepayment/plugin/responses/ResponsePayload;", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "error", "errorCode", "payments-mobilepayment-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResponsePayload ok$default(Companion companion, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return companion.ok(str);
        }

        @NotNull
        public final ResponsePayload error(@NotNull String errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            return new ResponsePayload("ERROR", errorCode, null, 4, null);
        }

        @NotNull
        public final ResponsePayload ok(@Nullable String payload) {
            return new ResponsePayload("OK", null, payload, 2, null);
        }
    }
}

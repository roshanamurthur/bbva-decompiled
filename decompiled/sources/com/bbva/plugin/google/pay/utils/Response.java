package com.bbva.plugin.google.pay.utils;

import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.plugin.google.pay.responses.ResponsePayload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Response.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bbva/plugin/google/pay/utils/Response;", "", "()V", "Companion", "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Response {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: Response.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/google/pay/utils/Response$Companion;", "", "()V", "RESULT_ERROR", "", "RESULT_OK", "error", "Lcom/bbva/plugin/google/pay/responses/ResponsePayload;", "errorCode", "ok", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
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
        public final ResponsePayload error(@Nullable String errorCode) {
            return new ResponsePayload("ERROR", errorCode, null, 4, null);
        }

        @NotNull
        public final ResponsePayload ok(@Nullable String payload) {
            return new ResponsePayload("OK", null, payload, 2, null);
        }
    }
}

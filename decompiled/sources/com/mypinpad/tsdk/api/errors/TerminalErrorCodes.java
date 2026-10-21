package com.mypinpad.tsdk.api.errors;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/api/errors/TerminalErrorCodes;", "", "<init>", "()V", "Invocation"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TerminalErrorCodes {

    @NotNull
    public static final TerminalErrorCodes INSTANCE = new TerminalErrorCodes();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u001b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\f\n\u0004\b\n\u0010\u0004\u0012\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/api/errors/TerminalErrorCodes$Invocation;", "", "", "ACTIVATION_ALREADY_STARTED", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getACTIVATION_ALREADY_STARTED$annotations", "()V", "ACTIVATION_WHILE_TRANSACTION_IN_FLIGHT", "ACTIVITY_NOT_AVAILABLE", "DEVICE_STATE_FAILURE", "HOSTAPP_ERROR_ON_AUTH_REQUEST", "getHOSTAPP_ERROR_ON_AUTH_REQUEST$annotations", "HOSTAPP_ERROR_ON_UI_MESSAGE", "INVALID_CURRENCY_CODE", "INVALID_MERCHANT_ID", "getINVALID_MERCHANT_ID$annotations", "INVALID_RRN_FORMAT", "INVALID_SESSION_TIMEOUT", "INVALID_TERMINAL_CONFIGURATION", "NFC_ALREADY_LISTENING", "NFC_DISABLED", "NFC_ERROR", "NFC_HARDWARE_NOT_AVAILABLE", "NFC_NO_RUNTIME_PERMISSION", "NO_NFC_FEATURE", "PROCESSING_ALREADY_STARTED", "TERMINAL_ALREADY_CREATED", "TERMINAL_ALREADY_DISPOSED", "TERMINAL_SESSION_DEACTIVATED", "<init>"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Invocation {
        public static final int ACTIVATION_ALREADY_STARTED = 6;
        public static final int ACTIVATION_WHILE_TRANSACTION_IN_FLIGHT = 21;
        public static final int ACTIVITY_NOT_AVAILABLE = 18;
        public static final int DEVICE_STATE_FAILURE = 15;
        public static final int HOSTAPP_ERROR_ON_AUTH_REQUEST = 17;
        public static final int HOSTAPP_ERROR_ON_UI_MESSAGE = 16;

        @NotNull
        public static final Invocation INSTANCE = new Invocation();
        public static final int INVALID_CURRENCY_CODE = 14;
        public static final int INVALID_MERCHANT_ID = 12;
        public static final int INVALID_RRN_FORMAT = 13;
        public static final int INVALID_SESSION_TIMEOUT = 20;
        public static final int INVALID_TERMINAL_CONFIGURATION = 2;
        public static final int NFC_ALREADY_LISTENING = 11;
        public static final int NFC_DISABLED = 10;
        public static final int NFC_ERROR = 3;
        public static final int NFC_HARDWARE_NOT_AVAILABLE = 9;
        public static final int NFC_NO_RUNTIME_PERMISSION = 7;
        public static final int NO_NFC_FEATURE = 8;
        public static final int PROCESSING_ALREADY_STARTED = 5;
        public static final int TERMINAL_ALREADY_CREATED = 1;
        public static final int TERMINAL_ALREADY_DISPOSED = 19;
        public static final int TERMINAL_SESSION_DEACTIVATED = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f51663a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f51664b = 1;

        static {
            int i10 = f51663a;
            int i11 = i10 & 57;
            int i12 = -(-(i10 | 57));
            int i13 = (i11 & i12) + (i12 | i11);
            f51664b = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }

        private Invocation() {
        }

        @Deprecated(message = "When activating session, ACTIVATION_WHILE_TRANSACTION_IN_FLIGHT is used when an existing transaction is in flight", replaceWith = @ReplaceWith(expression = "ACTIVATION_WHILE_TRANSACTION_IN_FLIGHT", imports = {}))
        public static /* synthetic */ void getACTIVATION_ALREADY_STARTED$annotations() {
            int i10 = f51664b;
            int i11 = i10 & 5;
            int i12 = -(-((i10 ^ 5) | i11));
            int i13 = (i11 & i12) + (i12 | i11);
            f51663a = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        }

        public static /* synthetic */ void getHOSTAPP_ERROR_ON_AUTH_REQUEST$annotations() {
            int i10 = f51664b;
            int i11 = i10 & 105;
            int i12 = (i11 - (~((i10 ^ 105) | i11))) - 1;
            f51663a = i12 % 128;
            int i13 = i12 % 2;
        }

        public static /* synthetic */ void getINVALID_MERCHANT_ID$annotations() {
            int i10 = f51663a;
            int i11 = i10 & 7;
            int i12 = ((i10 ^ 7) | i11) << 1;
            int i13 = -((i10 | 7) & (~i11));
            int i14 = (i12 & i13) + (i13 | i12);
            f51664b = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    static {
        int i10 = 1 - (-56);
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        int i12 = i11 % 128;
        int i13 = i11 % 2;
    }

    private TerminalErrorCodes() {
    }
}

package com.bbva.ethermobilesdk.token.plugin.model;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.ethermobilesdk.token.model.EtherTokenError;
import com.bbva.ethermobilesdk.token.model.EtherTokenErrorType;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PluginEtherTokenError.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toMessageError", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenError;", "ethertoken-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PluginEtherTokenErrorKt {

    /* JADX INFO: compiled from: PluginEtherTokenError.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EtherTokenErrorType.values().length];
            try {
                iArr[EtherTokenErrorType.DENIED_STORAGE_ACCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EtherTokenErrorType.TOKEN_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EtherTokenErrorType.INVALID_OCRA_SUITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EtherTokenErrorType.TOKEN_IS_NOT_ACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EtherTokenErrorType.BAD_TOKEN_ACTIVATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EtherTokenErrorType.ILLEGAL_STATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EtherTokenErrorType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ErrorMessage toMessageError(@NotNull EtherTokenError etherTokenError) {
        Intrinsics.checkNotNullParameter(etherTokenError, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[etherTokenError.getType().ordinal()]) {
            case 1:
                return PluginEtherTokenError.DENIED_STORAGE_ACCESS;
            case 2:
                return PluginEtherTokenError.TOKEN_NOT_FOUND;
            case 3:
                return PluginEtherTokenError.INVALID_OCRA_SUITE;
            case 4:
                return PluginEtherTokenError.TOKEN_IS_NOT_ACTIVE;
            case 5:
                return PluginEtherTokenError.BAD_TOKEN_ACTIVATION;
            case 6:
            case 7:
                String message = etherTokenError.getMessage();
                if (message == null) {
                    message = "Unexpected Error";
                }
                return new UnknownError(ReturnCode.ERR_INIT_INVALID_CUSTOM_ID, message);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

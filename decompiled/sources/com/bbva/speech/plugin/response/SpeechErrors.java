package com.bbva.speech.plugin.response;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SpeechErrors.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/bbva/speech/plugin/response/SpeechErrors;", "", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "getCode", "", "getMessage", "code", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "message", "Ljava/lang/String;", "Companion", "Synthesis", "Service", "Output", "Network", "NetworkTimeout", "InvalidRequest", "NotInstalled", "ServerError", "ClientError", "SpeechError", "NoMatch", "AudioError", "RecognizerBusy", "InsufficientPermissions", "speech-plugin_release"}, k = 1, mv = {1, 5, 1})
public enum SpeechErrors implements ErrorMessage {
    Synthesis(ReturnCode.ERR_CONFIG_FILE_FORMAT, "Failure of a TTS engine to synthesize the given input."),
    Service(ReturnCode.ERR_CONFIG_ORIGIN_NOT_FOUND, "Failure of a TTS service"),
    Output(ReturnCode.ERR_CONFIG_SSL_RES_NOT_FOUND, "Failure related to the output (audio device or a file)"),
    Network(ReturnCode.ERR_CONFIG_INVALID_SSL_RES, "Failure caused by a network connectivity problems"),
    NetworkTimeout(ReturnCode.ERR_CONFIG_VERIFY_ERROR, "Failure caused by network timeout"),
    InvalidRequest(ReturnCode.ERR_CONFIG_VERIFY_INIT, "Failure caused by an invalid request"),
    NotInstalled(ReturnCode.ERR_CONFIG_VERIFY_SIGN_NOT_FOUND, "Failure caused by an unfinished download of the voice data"),
    ServerError(ReturnCode.ERR_CONFIG_VERIFY_SIGN_INVALID, "Failure caused by server sending an error status"),
    ClientError(ReturnCode.ERR_CONFIG_VERIFY_SIGN_IO_ERROR, "Failure caused by client side errors"),
    SpeechError(1311, "Failure caused by no speech Input"),
    NoMatch(1312, "Failure caused by no speech Input"),
    AudioError(1313, "Failure caused by an audio recording error"),
    RecognizerBusy(1314, "Failure caused due to recognizer being busy"),
    InsufficientPermissions(1315, "Failure caused by Record Audio permission not granted");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int code;

    @NotNull
    private final String message;

    /* JADX INFO: compiled from: SpeechErrors.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/speech/plugin/response/SpeechErrors$Companion;", "", "()V", "toErrorMessage", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "errorCode", "", "speech-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ErrorMessage toErrorMessage(int errorCode) {
            switch (errorCode) {
                case -9:
                    return SpeechErrors.NotInstalled;
                case -8:
                    return SpeechErrors.InvalidRequest;
                case -7:
                    return SpeechErrors.NetworkTimeout;
                case -6:
                    return SpeechErrors.Network;
                case -5:
                    return SpeechErrors.Output;
                case -4:
                    return SpeechErrors.Service;
                case -3:
                    return SpeechErrors.Synthesis;
                case -2:
                case -1:
                case 0:
                default:
                    return Errors.ErrorDefault;
                case 1:
                    return SpeechErrors.NetworkTimeout;
                case 2:
                    return SpeechErrors.Network;
                case 3:
                    return SpeechErrors.AudioError;
                case 4:
                    return SpeechErrors.ServerError;
                case 5:
                    return SpeechErrors.ClientError;
                case 6:
                    return SpeechErrors.SpeechError;
                case 7:
                    return SpeechErrors.NoMatch;
                case 8:
                    return SpeechErrors.RecognizerBusy;
                case 9:
                    return SpeechErrors.InsufficientPermissions;
            }
        }
    }

    SpeechErrors(int i10, String str) {
        this.code = i10;
        this.message = str;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    public int getCode() {
        return this.code;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    public String getMessage() {
        return this.message;
    }
}

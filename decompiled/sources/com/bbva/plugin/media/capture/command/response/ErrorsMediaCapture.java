package com.bbva.plugin.media.capture.command.response;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.androidtoolkit.plugin.response.SimpleResponse;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: ErrorsMediaCapture.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/bbva/plugin/media/capture/command/response/ErrorsMediaCapture;", "", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "getCode", "", "getMessage", "Lorg/json/JSONObject;", "toJson", "mCode", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "mMessage", "Ljava/lang/String;", "ErrorCardNotMounted", "ErrorRecordAudio", "ErrorCaptureVideo", "ErrorCapturePicture", "ErrorCannotStart", "ErrorCannotStop", "ErrorCaptureCancelled", "ErrorCaptureAudio", "ErrorApplicationAudio", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public enum ErrorsMediaCapture implements ErrorMessage {
    ErrorCardNotMounted(595, "Card not mounted"),
    ErrorRecordAudio(596, "Could not record audio"),
    ErrorCaptureVideo(597, "Could not capture video"),
    ErrorCapturePicture(598, "Could not capture picture"),
    ErrorCannotStart(599, "Cannot start, stop the recording first"),
    ErrorCannotStop(600, "Cannot Stop, call start recording first"),
    ErrorCaptureCancelled(601, "Capture cancelled"),
    ErrorCaptureAudio(602, "Could not capture audio"),
    ErrorApplicationAudio(TypedValues.MotionType.TYPE_EASING, "There is no application to capture audio");

    private final int mCode;
    private final String mMessage;

    ErrorsMediaCapture(int i10, String str) {
        this.mCode = i10;
        this.mMessage = str;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    /* JADX INFO: renamed from: getCode, reason: from getter */
    public int getMCode() {
        return this.mCode;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    /* JADX INFO: renamed from: getMessage, reason: from getter */
    public String getMMessage() {
        return this.mMessage;
    }

    @NotNull
    public final JSONObject toJson() {
        JSONObject jSONObjectError = SimpleResponse.error(getMCode(), getMMessage());
        Intrinsics.checkNotNullExpressionValue(jSONObjectError, "SimpleResponse.error(code, message)");
        return jSONObjectError;
    }
}

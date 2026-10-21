package com.bbva.androidtoolkit.plugin.response;

import com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorMessages;

/* JADX INFO: loaded from: classes2.dex */
public enum Errors implements ErrorMessage {
    ErrorDefault(-1, "Error"),
    ErrorCanceled(0, ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED),
    ErrorMalformedParam(1, ErrorMessages.INCORRECT_PARAMETERS),
    ErrorPermissionDenied(2, "Permission Denied"),
    ErrorNotAvailable(3, "Not available"),
    ErrorNotSupported(4, "Not Supported"),
    ErrorPermissionPermanentlyDenied(5, "Permission Permanently Denied");

    private int mCode;
    private String mMessage;

    Errors(int i10, String str) {
        this.mCode = i10;
        this.mMessage = str;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    public int getCode() {
        return this.mCode;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    public String getMessage() {
        return this.mMessage;
    }
}

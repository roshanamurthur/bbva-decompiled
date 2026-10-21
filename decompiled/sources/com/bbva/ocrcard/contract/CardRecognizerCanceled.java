package com.bbva.ocrcard.contract;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OCRActivityContract.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/ocrcard/contract/CardRecognizerCanceled;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "ocrcard_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CardRecognizerCanceled extends Exception {

    @NotNull
    public static final CardRecognizerCanceled INSTANCE = new CardRecognizerCanceled();

    private CardRecognizerCanceled() {
    }
}

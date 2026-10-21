package com.bbva.gp2.android.trustdevice.sdk.export.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoadPropertiesException.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/exceptions/LoadPropertiesException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "(Ljava/lang/Exception;)V", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class LoadPropertiesException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadPropertiesException(@NotNull Exception exception) {
        super(exception);
        Intrinsics.checkNotNullParameter(exception, "exception");
    }
}

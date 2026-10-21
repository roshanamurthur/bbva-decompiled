package com.bbva.gp2.android.trustdevice.sdk.export.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RegisterNeededException.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/exceptions/RegisterNeededException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "(Ljava/lang/Exception;)V", "message", "", "(Ljava/lang/String;)V", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class RegisterNeededException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterNeededException(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RegisterNeededException(@NotNull Exception e5) {
        this(e5.toString());
        Intrinsics.checkNotNullParameter(e5, "e");
    }
}

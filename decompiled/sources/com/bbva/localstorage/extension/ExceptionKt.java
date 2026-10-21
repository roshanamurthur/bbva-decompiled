package com.bbva.localstorage.extension;

import java.io.IOException;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Exception.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¨\u0006\u0004"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "", "canRecover", "local-storage_release"}, k = 2, mv = {1, 8, 0})
public final class ExceptionKt {
    public static final boolean canRecover(@NotNull Exception exc) {
        String message;
        Intrinsics.checkNotNullParameter(exc, "<this>");
        if (!((exc instanceof KeyStoreException) || (exc instanceof IOException)) || (message = exc.getMessage()) == null) {
            return false;
        }
        return Intrinsics.areEqual(message, "the master key android-keystore://_androidx_security_master_key_ exists but is unusable") || Intrinsics.areEqual(message, "Failed to parse the message") || Intrinsics.areEqual(message, "Protocol message contained an invalid tag (zero).");
    }
}

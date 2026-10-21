package com.bbva.ethermobilesdk.token.trait;

import com.bbva.ethermobilesdk.token.model.EtherTokenError;
import com.bbva.ethermobilesdk.token.model.EtherTokenErrorType;
import com.bbva.ethermobilesdk.token.model.EtherTokenInternalError;
import kotlin.Metadata;

/* JADX INFO: compiled from: Trait.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ethertoken_release"}, k = 2, mv = {1, 8, 0})
public final class TraitKt {
    public static final EtherTokenError access$toEtherTokenError(Throwable th2) {
        EtherTokenError etherTokenError;
        if (th2 instanceof EtherTokenError) {
            return (EtherTokenError) th2;
        }
        if (th2 instanceof EtherTokenInternalError) {
            EtherTokenInternalError etherTokenInternalError = (EtherTokenInternalError) th2;
            etherTokenError = new EtherTokenError(etherTokenInternalError.getType(), etherTokenInternalError.getEx());
        } else {
            etherTokenError = new EtherTokenError(EtherTokenErrorType.UNKNOWN, th2);
        }
        return etherTokenError;
    }
}

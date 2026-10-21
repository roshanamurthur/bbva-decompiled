package com.bbva.ethermobilesdk.token.trait.impl;

import bk.q;
import com.bbva.ethermobilesdk.token.model.ActivateTokenRequest;
import com.bbva.ethermobilesdk.token.model.EtherTokenErrorType;
import com.bbva.ethermobilesdk.token.model.EtherTokenInternalError;
import kotlin.Metadata;
import kotlin.TuplesKt;

/* JADX INFO: compiled from: ActivateTokenTrait.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ethertoken_release"}, k = 2, mv = {1, 8, 0})
public final class ActivateTokenTraitKt {
    public static final EtherTokenInternalError access$toError(ActivateTokenRequest activateTokenRequest, EtherTokenErrorType etherTokenErrorType, Throwable th2) {
        return new EtherTokenInternalError(etherTokenErrorType, th2, q.mutableMapOf(TuplesKt.to("activate_configuration", activateTokenRequest.getActivation().getConfiguration()), TuplesKt.to("activate_data", activateTokenRequest.getActivation().getData()), TuplesKt.to("activate_token_id", activateTokenRequest.getActivation().getTokenId())));
    }
}

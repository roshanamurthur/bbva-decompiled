package com.bbva.component.dm.headers.interceptor;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HeadersInterceptorDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b extends FunctionReferenceImpl implements Function1<AccessToken, Unit> {
    public b(Object obj) {
        super(1, obj, HeadersInterceptorDataManager.class, "onAccessTokenChangeListener", "onAccessTokenChangeListener(Lcom/bbva/component/dm/headers/interceptor/AccessToken;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AccessToken accessToken) {
        AccessToken p4 = accessToken;
        Intrinsics.checkNotNullParameter(p4, "p0");
        ((HeadersInterceptorDataManager) this.receiver).fire(HeadersInterceptorDataManager.ACCESS_TOKEN_CHANGE, p4);
        return Unit.INSTANCE;
    }
}

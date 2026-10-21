package com.bbva.component.ic.security.factory;

import com.bbva.component.ic.security.handler.OTPSecurityHandler;
import com.bbva.component.ic.security.handler.SecondFactorSecurityHandler;
import com.bbva.component.ic.security.interceptor.SecurityInterceptor;
import com.bbva.component.ic.security.model.HandlerConfig;
import com.bbva.component.ic.security.utils.SecurityType;
import com.bbva.component.ic.security.utils.SecurityVerification;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InterceptorsFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/ic/security/factory/InterceptorsFactory;", "", "", "type", "", "whiteList", "Lcom/bbva/component/ic/security/model/HandlerConfig;", "config", "Lkotlin/Function1;", "Lcom/bbva/component/ic/security/utils/SecurityVerification;", "", "callback", "Lcom/bbva/component/ic/security/interceptor/SecurityInterceptor;", "create", "<init>", "()V", "component-ic-security_release"}, k = 1, mv = {2, 0, 0})
public final class InterceptorsFactory {

    @Deprecated
    @NotNull
    public static final String otpType = "OTP";

    @Deprecated
    @NotNull
    public static final String secondFactorType = "SECOND_FACTOR";

    public static /* synthetic */ SecurityInterceptor create$default(InterceptorsFactory interceptorsFactory, String str, List list, HandlerConfig handlerConfig, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            handlerConfig = null;
        }
        return interceptorsFactory.create(str, list, handlerConfig, function1);
    }

    @NotNull
    public final SecurityInterceptor create(@NotNull String type, @NotNull List<String> whiteList, @Nullable HandlerConfig config, @NotNull Function1<? super SecurityVerification, Unit> callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(whiteList, "whiteList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (Intrinsics.areEqual(type, otpType)) {
            return new SecurityInterceptor(whiteList, new OTPSecurityHandler(CollectionsKt__CollectionsKt.listOf((Object[]) new SecurityType[]{SecurityType.OTP_TOKEN, SecurityType.OTP_SMS, SecurityType.SOFT_TOKEN, SecurityType.SOFT_TOKEN_CHALLENGE, SecurityType.SOFT_TOKEN_CHALLENGE_R2, SecurityType.CRONTO_TOKEN}), config), callback);
        }
        if (Intrinsics.areEqual(type, secondFactorType)) {
            return new SecurityInterceptor(whiteList, new SecondFactorSecurityHandler(config), callback);
        }
        throw new IllegalStateException("Unknown login type.");
    }
}

package com.bbva.component.dm.akamai.interceptor;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.model.response.MutableNetworkResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AkamaiResponseVerifier.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¨\u0006\n"}, d2 = {"Lcom/bbva/component/dm/akamai/interceptor/AkamaiResponseVerifier;", "", "()V", "isABotError", "", DigipassManagerConstants.KEY_RESPONSE, "Lcom/bbva/network/model/response/MutableNetworkResponse;", "onError", "Lkotlin/Function0;", "Companion", "component-ic-akamai_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AkamaiResponseVerifier {
    public final void isABotError(@NotNull MutableNetworkResponse response, @NotNull Function0<Unit> onError) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Map<String, String> headers = response.getHeaders();
        if (response.getCode() == 403 && headers.keySet().contains("AkamaiGHost")) {
            onError.invoke();
        }
    }
}

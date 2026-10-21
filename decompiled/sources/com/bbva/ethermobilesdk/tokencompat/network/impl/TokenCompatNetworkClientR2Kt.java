package com.bbva.ethermobilesdk.tokencompat.network.impl;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import com.bbva.ethermobilesdk.tokencompat.model.TokenCompatActivationRequest;
import com.bbva.ethermobilesdk.tokencompat.model.TokenCompatActivationResponse;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.notifications.constants.PushConstants;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: TokenCompatNetworkClientR2.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001e\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0000\u001a\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0000\u001a\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\u0013"}, d2 = {"createR2EndpointUrl", "", "url", ActivateTokenCommand.TOKEN_ID, "authCodeHash", "encodeActivationDataHash", "config", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig;", "isHeaderOfInterest", "", "entry", "", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "activation", "Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationResponse;", "serializeToken", "", "token", "Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationRequest;", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TokenCompatNetworkClientR2Kt {
    @NotNull
    public static final String createR2EndpointUrl(@NotNull String url, @NotNull String tokenId, @NotNull String authCodeHash) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(authCodeHash, "authCodeHash");
        return l.replace$default(l.replace$default(url, TokenCompatConfig.EndpointConfig.SOFTWARE_TOKENS_ID, tokenId, false, 4, (Object) null), TokenCompatConfig.EndpointConfig.ACTIVATION_DATA_HASH_ID, authCodeHash, false, 4, (Object) null);
    }

    @NotNull
    public static final String encodeActivationDataHash(@NotNull String authCodeHash, @NotNull TokenCompatConfig.EndpointConfig config) {
        Intrinsics.checkNotNullParameter(authCodeHash, "authCodeHash");
        Intrinsics.checkNotNullParameter(config, "config");
        return l.replace$default(l.replace$default(authCodeHash, "+", Constant.DASH_STRING, false, 4, (Object) null), "/", PushConstants.GE_PARAMS_SEPARATOR, false, 4, (Object) null);
    }

    public static final boolean isHeaderOfInterest(@NotNull Map.Entry<String, String> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"authenticationdata", EventDataKeys.Identity.AUTHENTICATION_STATE, "tsec"});
        String lowerCase = entry.getKey().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return listListOf.contains(lowerCase);
    }

    public static final boolean isValid(@Nullable TokenCompatActivationResponse tokenCompatActivationResponse) {
        String activationData;
        String configuration;
        String seed;
        return ((tokenCompatActivationResponse != null ? tokenCompatActivationResponse.getData() : null) == null || (activationData = tokenCompatActivationResponse.getData().getActivationData()) == null || activationData.length() == 0 || (configuration = tokenCompatActivationResponse.getData().getConfiguration()) == null || configuration.length() == 0 || (seed = tokenCompatActivationResponse.getData().getSeed()) == null || seed.length() == 0) ? false : true;
    }

    @NotNull
    public static final byte[] serializeToken(@NotNull TokenCompatActivationRequest token, @NotNull TokenCompatConfig.EndpointConfig config) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(config, "config");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("applicationCode", token.getApplicationCode());
        jSONObject.put("authenticationCode", token.getAuthenticationCode());
        jSONObject.put("deviceIdentifier", token.getDeviceIdentifier());
        jSONObject.put("salt", token.getSalt());
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject().apply {\n   …en.salt)\n    }.toString()");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}

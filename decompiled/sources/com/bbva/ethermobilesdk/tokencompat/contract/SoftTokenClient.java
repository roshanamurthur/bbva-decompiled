package com.bbva.ethermobilesdk.tokencompat.contract;

import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STArray;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STOathParam;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STOtp;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STParam;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STRemainingTime;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenType;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SoftTokenClient.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H&J.\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J0\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000fH&J\u001c\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000fH&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH&J@\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010!H&J\u001a\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010$\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H&J \u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u0005H&¨\u0006("}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/contract/SoftTokenClient;", "", "changePassword", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "refToken", "", "pin", "newPin", "deleteToken", "deleteTokens", "authPrefixFilter", "generateNextOTP", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STOtp;", ClientData.KEY_CHALLENGE, "type", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;", "generateOTP", "tokenType", "getRemainingTime", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STRemainingTime;", "getToken", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STToken;", "getTokenList", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STArray;", "getTokenOATHParam", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STParam;", "oathParam", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STOathParam;", "registerToken", "authCode", "deviceId", ActivateTokenCommand.TOKEN_ID, "headers", "", "registerTokenWithUri", "uri", "setTokenDescription", "name", "setTokenOATHParam", "value", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SoftTokenClient {

    /* JADX INFO: compiled from: SoftTokenClient.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ STReturnCode deleteTokens$default(SoftTokenClient softTokenClient, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteTokens");
            }
            if ((i10 & 1) != 0) {
                str = null;
            }
            return softTokenClient.deleteTokens(str);
        }

        public static /* synthetic */ STOtp generateOTP$default(SoftTokenClient softTokenClient, String str, String str2, String str3, TokenType tokenType, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateOTP");
            }
            if ((i10 & 8) != 0) {
                tokenType = null;
            }
            return softTokenClient.generateOTP(str, str2, str3, tokenType);
        }

        public static /* synthetic */ STRemainingTime getRemainingTime$default(SoftTokenClient softTokenClient, String str, TokenType tokenType, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRemainingTime");
            }
            if ((i10 & 2) != 0) {
                tokenType = null;
            }
            return softTokenClient.getRemainingTime(str, tokenType);
        }

        public static /* synthetic */ STArray getTokenList$default(SoftTokenClient softTokenClient, TokenType tokenType, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTokenList");
            }
            if ((i10 & 1) != 0) {
                tokenType = null;
            }
            return softTokenClient.getTokenList(tokenType);
        }
    }

    @NotNull
    STReturnCode changePassword(@NotNull String refToken, @NotNull String pin, @NotNull String newPin);

    @NotNull
    STReturnCode deleteToken(@NotNull String refToken);

    @NotNull
    STReturnCode deleteTokens(@Nullable String authPrefixFilter);

    @NotNull
    STOtp generateNextOTP(@NotNull String refToken, @Nullable String pin, @Nullable String challenge, @Nullable TokenType type);

    @NotNull
    STOtp generateOTP(@NotNull String refToken, @Nullable String pin, @Nullable String challenge, @Nullable TokenType tokenType);

    @NotNull
    STRemainingTime getRemainingTime(@NotNull String refToken, @Nullable TokenType tokenType);

    @NotNull
    STToken getToken(@NotNull String refToken);

    @NotNull
    STArray getTokenList(@Nullable TokenType type);

    @NotNull
    STParam getTokenOATHParam(@NotNull String refToken, @NotNull STOathParam oathParam);

    @NotNull
    STToken registerToken(@NotNull String authCode, @Nullable String pin, @NotNull String deviceId, @NotNull String tokenId, @Nullable Map<String, String> headers);

    @NotNull
    STToken registerTokenWithUri(@NotNull String uri, @Nullable String pin);

    @NotNull
    STToken setTokenDescription(@NotNull String refToken, @NotNull String name);

    @NotNull
    STReturnCode setTokenOATHParam(@NotNull String refToken, @NotNull STOathParam oathParam, @NotNull String value);
}

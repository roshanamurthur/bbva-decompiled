package com.bbva.ethermobilesdk.tokencompat.model.legacy;

import androidx.camera.camera2.internal.h0;
import androidx.collection.f;
import androidx.room.a;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatError;
import com.bbva.ethermobilesdk.tokencompat.model.StorageTokenBuilder;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.veridas.contextualdata.ContextualDataConstants;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LegacyToken.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 k2\u00020\u0001:\u0004klmnB\u0089\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020!\u0012\u0006\u00100\u001a\u00020)\u0012\b\b\u0002\u00104\u001a\u00020)\u0012\u0006\u00108\u001a\u00020\u0002\u0012\u0006\u0010@\u001a\u000209\u0012\u0006\u0010H\u001a\u00020A\u0012\u0006\u0010L\u001a\u00020A\u0012\u0006\u0010T\u001a\u00020M\u0012\u0006\u0010X\u001a\u00020M\u0012\u0006\u0010\\\u001a\u00020M\u0012\u0006\u0010`\u001a\u00020\u0002\u0012\u0006\u0010h\u001a\u00020a¢\u0006\u0004\bi\u0010jJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u0004\"\u0004\b\u001f\u0010\u001bR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u00108\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0018\u001a\u0004\b6\u0010\u0004\"\u0004\b7\u0010\u001bR\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010O\u001a\u0004\bV\u0010Q\"\u0004\bW\u0010SR\"\u0010\\\u001a\u00020M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010O\u001a\u0004\bZ\u0010Q\"\u0004\b[\u0010SR\"\u0010`\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010\u0018\u001a\u0004\b^\u0010\u0004\"\u0004\b_\u0010\u001bR\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g¨\u0006o"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken;", "", "", "serialized$ethertoken_compat_release", "()Ljava/lang/String;", "serialized", "toString", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;", "a", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;", "getType", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;", "setType", "(Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;)V", "type", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenStatus;", "b", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenStatus;", "getStatus", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenStatus;", "setStatus", "(Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenStatus;)V", "status", "c", "Ljava/lang/String;", "getSerial", "setSerial", "(Ljava/lang/String;)V", "serial", "d", "getName", "setName", "name", "", "e", "[B", "getEncryptedSeed", "()[B", "setEncryptedSeed", "([B)V", "encryptedSeed", "", "f", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSeedSize", "()I", "setSeedSize", "(I)V", "seedSize", "g", "getState", "setState", "state", "h", "getAppId", "setAppId", "appId", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$ExtraParams;", "i", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$ExtraParams;", "getExtraParams", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$ExtraParams;", "setExtraParams", "(Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$ExtraParams;)V", "extraParams", "", "j", "Z", "getNeedsPin", "()Z", "setNeedsPin", "(Z)V", "needsPin", "k", "getUseQrCode", "setUseQrCode", "useQrCode", "", "l", "J", "getDateLastOtpMillis", "()J", "setDateLastOtpMillis", "(J)V", "dateLastOtpMillis", "m", "getDateLastSyncMillis", "setDateLastSyncMillis", "dateLastSyncMillis", "n", "getDateCreationMillis", "setDateCreationMillis", "dateCreationMillis", "o", "getVersion", "setVersion", "version", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$OathParams;", "p", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$OathParams;", "getOathParams", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$OathParams;", "setOathParams", "(Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$OathParams;)V", "oathParams", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenStatus;Ljava/lang/String;Ljava/lang/String;[BIILjava/lang/String;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$ExtraParams;ZZJJJLjava/lang/String;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$OathParams;)V", "Companion", "ExtraParams", "OathParams", "UUIDType", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLegacyToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyToken.kt\ncom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n1#2:252\n*E\n"})
public final class LegacyToken {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public TokenType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public TokenStatus status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String serial;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public byte[] encryptedSeed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int seedSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String appId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ExtraParams extraParams;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean needsPin;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean useQrCode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public long dateLastOtpMillis;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public long dateLastSyncMillis;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long dateCreationMillis;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String version;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public OathParams oathParams;

    /* JADX INFO: compiled from: LegacyToken.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$Companion;", "", "()V", "from", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken;", "serializedToken", "", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLegacyToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyToken.kt\ncom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n1#2:252\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LegacyToken from(@NotNull String serializedToken) throws TokenCompatError.UnknownTokenFormat {
            Object objM5535constructorimpl;
            Object objM5535constructorimpl2;
            ExtraParams extraParams;
            Object objM5535constructorimpl3;
            Intrinsics.checkNotNullParameter(serializedToken, "serializedToken");
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) serializedToken, new String[]{ReplenishLogic.ID_SEPARATOR}, false, 0, 6, (Object) null);
            if (listSplit$default.size() < 15) {
                throw new TokenCompatError.UnknownTokenFormat(0, null, null, 7, null);
            }
            TokenType tokenTypeValueOf = TokenType.valueOf((String) listSplit$default.get(0));
            TokenStatus tokenStatusValueOf = TokenStatus.valueOf((String) listSplit$default.get(1));
            String str = (String) listSplit$default.get(2);
            Object obj = listSplit$default.get(3);
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(EncodingUtilsKt.toSimpleString(EncodingUtilsKt.base64ToByteArray((String) obj)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
                objM5535constructorimpl = LegacyTokenBuilder.NAME;
            }
            String str2 = (String) objM5535constructorimpl;
            String str3 = (String) listSplit$default.get(4);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str3.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            byte[] bArrHexStringToByteArray$default = EncodingUtilsKt.hexStringToByteArray$default(upperCase, null, 1, null);
            Integer intOrNull = k.toIntOrNull((String) listSplit$default.get(5));
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 32;
            Integer intOrNull2 = k.toIntOrNull((String) listSplit$default.get(6));
            int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
            String str4 = (String) listSplit$default.get(7);
            boolean zAreEqual = Intrinsics.areEqual(a.d(US, "US", (String) listSplit$default.get(8), US, "this as java.lang.String).toLowerCase(locale)"), "true");
            boolean zAreEqual2 = Intrinsics.areEqual(a.d(US, "US", (String) listSplit$default.get(9), US, "this as java.lang.String).toLowerCase(locale)"), "true");
            Long longOrNull = k.toLongOrNull((String) listSplit$default.get(10));
            long jLongValue = longOrNull != null ? longOrNull.longValue() : 0L;
            Long longOrNull2 = k.toLongOrNull((String) listSplit$default.get(11));
            long jLongValue2 = longOrNull2 != null ? longOrNull2.longValue() : 0L;
            Long longOrNull3 = k.toLongOrNull((String) listSplit$default.get(12));
            long jLongValue3 = longOrNull3 != null ? longOrNull3.longValue() : 0L;
            String str5 = (String) listSplit$default.get(13);
            OathParams.Companion companion3 = OathParams.INSTANCE;
            try {
                objM5535constructorimpl2 = Result.m5535constructorimpl(EncodingUtilsKt.toSimpleString(EncodingUtilsKt.base64ToByteArray((String) listSplit$default.get(14))));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                objM5535constructorimpl2 = Result.m5535constructorimpl(ResultKt.createFailure(th3));
            }
            if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl2) != null) {
                objM5535constructorimpl2 = "";
            }
            OathParams oathParamsFrom$ethertoken_compat_release = companion3.from$ethertoken_compat_release((String) objM5535constructorimpl2);
            if (listSplit$default.size() >= 16) {
                ExtraParams.Companion companion5 = ExtraParams.INSTANCE;
                try {
                    objM5535constructorimpl3 = Result.m5535constructorimpl(EncodingUtilsKt.toSimpleString(EncodingUtilsKt.base64ToByteArray((String) listSplit$default.get(15))));
                } catch (Throwable th4) {
                    Result.Companion companion6 = Result.INSTANCE;
                    objM5535constructorimpl3 = Result.m5535constructorimpl(ResultKt.createFailure(th4));
                }
                extraParams = companion5.from$ethertoken_compat_release((String) (Result.m5538exceptionOrNullimpl(objM5535constructorimpl3) == null ? objM5535constructorimpl3 : ""));
            } else {
                extraParams = new ExtraParams(null, null, null, null, null, null, null, 127, null);
            }
            return new LegacyToken(tokenTypeValueOf, tokenStatusValueOf, str, str2, bArrHexStringToByteArray$default, iIntValue, iIntValue2, str4, extraParams, zAreEqual, zAreEqual2, jLongValue, jLongValue2, jLongValue3, str5, oathParamsFrom$ethertoken_compat_release);
        }
    }

    /* JADX INFO: compiled from: LegacyToken.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 *2\u00020\u0001:\u0001*B[\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u0004\"\u0004\b\u000e\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\u0004\"\u0004\b\u0012\u0010\nR$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u001d\u0010\u0004\"\u0004\b\u001e\u0010\nR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\u0004\"\u0004\b\"\u0010\nR$\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0007\u001a\u0004\b%\u0010\u0004\"\u0004\b&\u0010\n¨\u0006+"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$ExtraParams;", "", "", "serialized$ethertoken_compat_release", "()Ljava/lang/String;", "serialized", "a", "Ljava/lang/String;", "getPhoneNumber", "setPhoneNumber", "(Ljava/lang/String;)V", "phoneNumber", "b", "getPinCRC", "setPinCRC", "pinCRC", "c", "getUuidCRC", "setUuidCRC", "uuidCRC", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "d", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "getUuidType", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "setUuidType", "(Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;)V", "uuidType", "e", "getAppId", "setAppId", "appId", "f", "getSdkVersion", "setSdkVersion", ContextualDataConstants.CD_SDK_VERSION, "g", "getUserId", "setUserId", Constants.backendRequestUserId, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLegacyToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyToken.kt\ncom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$ExtraParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n1#2:252\n*E\n"})
    public static final class ExtraParams {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String phoneNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String pinCRC;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String uuidCRC;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public UUIDType uuidType;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String appId;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String sdkVersion;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String userId;

        /* JADX INFO: compiled from: LegacyToken.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$ExtraParams$Companion;", "", "()V", "from", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$ExtraParams;", "serializedParams", "", "from$ethertoken_compat_release", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nLegacyToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyToken.kt\ncom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$ExtraParams$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,251:1\n1855#2:252\n1855#2:253\n1856#2:256\n1856#2:257\n1282#3,2:254\n*S KotlinDebug\n*F\n+ 1 LegacyToken.kt\ncom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$ExtraParams$Companion\n*L\n171#1:252\n173#1:253\n173#1:256\n171#1:257\n180#1:254,2\n*E\n"})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @NotNull
            public final ExtraParams from$ethertoken_compat_release(@NotNull String serializedParams) {
                UUIDType uUIDType;
                Intrinsics.checkNotNullParameter(serializedParams, "serializedParams");
                ExtraParams extraParams = new ExtraParams(null, null, null, null, null, null, null, 127, null);
                Iterator it = StringsKt__StringsKt.split$default((CharSequence) serializedParams, new String[]{","}, false, 0, 6, (Object) null).iterator();
                while (it.hasNext()) {
                    for (Pair pair : CollectionsKt___CollectionsKt.zipWithNext(StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 0, 6, (Object) null))) {
                        String str = (String) pair.getFirst();
                        switch (str.hashCode()) {
                            case -1955290454:
                                if (str.equals("ORIGEN")) {
                                    extraParams.setAppId((String) pair.getSecond());
                                }
                                break;
                            case -1900950736:
                                if (str.equals("UUID_CRC")) {
                                    extraParams.setUuidCRC((String) pair.getSecond());
                                }
                                break;
                            case 73549591:
                                if (str.equals("MOVIL")) {
                                    extraParams.setPhoneNumber((String) pair.getSecond());
                                }
                                break;
                            case 150710250:
                                if (str.equals("PIN_CRC")) {
                                    extraParams.setPinCRC((String) pair.getSecond());
                                }
                                break;
                            case 1200582974:
                                if (str.equals("UUID_TYPE")) {
                                    UUIDType[] uUIDTypeArrValues = UUIDType.values();
                                    int length = uUIDTypeArrValues.length;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < length) {
                                            uUIDType = uUIDTypeArrValues[i10];
                                            if (!Intrinsics.areEqual(uUIDType.getValue(), pair.getSecond())) {
                                                i10++;
                                            }
                                        } else {
                                            uUIDType = null;
                                        }
                                    }
                                    if (uUIDType == null) {
                                        uUIDType = UUIDType.UNSUPPORTED_UUID_TYPE;
                                    }
                                    extraParams.setUuidType(uUIDType);
                                }
                                break;
                            case 1711592851:
                                if (str.equals("SDK_VERSION")) {
                                    extraParams.setSdkVersion((String) pair.getSecond());
                                }
                                break;
                            case 1803529918:
                                if (str.equals("REFUSER")) {
                                    extraParams.setUserId((String) pair.getSecond());
                                }
                                break;
                        }
                    }
                }
                return extraParams;
            }
        }

        public ExtraParams() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        @Nullable
        public final String getAppId() {
            return this.appId;
        }

        @Nullable
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        @Nullable
        public final String getPinCRC() {
            return this.pinCRC;
        }

        @Nullable
        public final String getSdkVersion() {
            return this.sdkVersion;
        }

        @Nullable
        public final String getUserId() {
            return this.userId;
        }

        @Nullable
        public final String getUuidCRC() {
            return this.uuidCRC;
        }

        @Nullable
        public final UUIDType getUuidType() {
            return this.uuidType;
        }

        @NotNull
        public final String serialized$ethertoken_compat_release() {
            ArrayList arrayList = new ArrayList();
            String str = this.appId;
            if (str != null) {
                arrayList.add("ORIGEN=".concat(str));
            }
            String str2 = this.uuidCRC;
            if (str2 != null) {
                arrayList.add("UUID_CRC=".concat(str2));
            }
            UUIDType uUIDType = this.uuidType;
            if (uUIDType != null) {
                arrayList.add("UUID_TYPE=" + uUIDType.getValue());
            }
            String str3 = this.sdkVersion;
            if (str3 != null) {
                arrayList.add("SDK_VERSION=".concat(str3));
            }
            String str4 = this.userId;
            if (str4 != null) {
                arrayList.add("REFUSER=".concat(str4));
            }
            String str5 = this.pinCRC;
            if (str5 != null) {
                arrayList.add("PIN_CRC=".concat(str5));
            }
            String str6 = this.phoneNumber;
            if (str6 != null) {
                arrayList.add("MOVIL=".concat(str6));
            }
            return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
        }

        public final void setAppId(@Nullable String str) {
            this.appId = str;
        }

        public final void setPhoneNumber(@Nullable String str) {
            this.phoneNumber = str;
        }

        public final void setPinCRC(@Nullable String str) {
            this.pinCRC = str;
        }

        public final void setSdkVersion(@Nullable String str) {
            this.sdkVersion = str;
        }

        public final void setUserId(@Nullable String str) {
            this.userId = str;
        }

        public final void setUuidCRC(@Nullable String str) {
            this.uuidCRC = str;
        }

        public final void setUuidType(@Nullable UUIDType uUIDType) {
            this.uuidType = uUIDType;
        }

        public ExtraParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable UUIDType uUIDType, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this.phoneNumber = str;
            this.pinCRC = str2;
            this.uuidCRC = str3;
            this.uuidType = uUIDType;
            this.appId = str4;
            this.sdkVersion = str5;
            this.userId = str6;
        }

        public /* synthetic */ ExtraParams(String str, String str2, String str3, UUIDType uUIDType, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : uUIDType, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6);
        }
    }

    /* JADX INFO: compiled from: LegacyToken.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\"\u0018\u0000 #2\u00020\u0001:\u0001#BO\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0002H\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0004\"\u0004\b\n\u0010\u000bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\u0004\"\u0004\b\u0013\u0010\u000bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\u0004\"\u0004\b\u0017\u0010\u000bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u001a\u0010\u0004\"\u0004\b\u001b\u0010\u000bR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001e\u0010\u0004\"\u0004\b\u001f\u0010\u000b¨\u0006$"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$OathParams;", "", "", "serialized$ethertoken_compat_release", "()Ljava/lang/String;", "serialized", "toString", "a", "Ljava/lang/String;", "getOtpLength", "setOtpLength", "(Ljava/lang/String;)V", "otpLength", "b", "getOtpLapse", "setOtpLapse", "otpLapse", "c", "getOtpTime", "setOtpTime", "otpTime", "d", "getOcraSuite", "setOcraSuite", "ocraSuite", "e", "getOcraSessionInfo", "setOcraSessionInfo", "ocraSessionInfo", "f", "getOtpAlgorithm", "setOtpAlgorithm", "otpAlgorithm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLegacyToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyToken.kt\ncom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$OathParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n1#2:252\n*E\n"})
    public static final class OathParams {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String otpLength;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String otpLapse;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String otpTime;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String ocraSuite;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String ocraSessionInfo;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String otpAlgorithm;

        /* JADX INFO: compiled from: LegacyToken.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$OathParams$Companion;", "", "()V", "from", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$OathParams;", "serializedParams", "", "from$ethertoken_compat_release", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nLegacyToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyToken.kt\ncom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$OathParams$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n1855#2:252\n1855#2,2:253\n1856#2:255\n*S KotlinDebug\n*F\n+ 1 LegacyToken.kt\ncom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$OathParams$Companion\n*L\n229#1:252\n231#1:253,2\n229#1:255\n*E\n"})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @NotNull
            public final OathParams from$ethertoken_compat_release(@NotNull String serializedParams) {
                Intrinsics.checkNotNullParameter(serializedParams, "serializedParams");
                OathParams oathParams = new OathParams(null, null, null, null, null, null, 63, null);
                Iterator it = StringsKt__StringsKt.split$default((CharSequence) serializedParams, new String[]{"#"}, false, 0, 6, (Object) null).iterator();
                while (it.hasNext()) {
                    for (Pair pair : CollectionsKt___CollectionsKt.zipWithNext(StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 0, 6, (Object) null))) {
                        String str = (String) pair.getFirst();
                        switch (str.hashCode()) {
                            case -1327832767:
                                if (str.equals("OCRASESSIONINFO")) {
                                    oathParams.setOcraSessionInfo((String) pair.getSecond());
                                }
                                break;
                            case -460018255:
                                if (str.equals("OTPLENGTH")) {
                                    oathParams.setOtpLength((String) pair.getSecond());
                                }
                                break;
                            case -420347816:
                                if (str.equals("OTPTIME")) {
                                    oathParams.setOtpTime((String) pair.getSecond());
                                }
                                break;
                            case -153503518:
                                if (str.equals("OTPLAPSE")) {
                                    oathParams.setOtpLapse((String) pair.getSecond());
                                }
                                break;
                            case 1163447716:
                                if (str.equals("OTPALGORITHM")) {
                                    oathParams.setOtpAlgorithm((String) pair.getSecond());
                                }
                                break;
                            case 1450203573:
                                if (str.equals("OCRASUITE")) {
                                    oathParams.setOcraSuite((String) pair.getSecond());
                                }
                                break;
                        }
                    }
                }
                return oathParams;
            }
        }

        public OathParams() {
            this(null, null, null, null, null, null, 63, null);
        }

        @Nullable
        public final String getOcraSessionInfo() {
            return this.ocraSessionInfo;
        }

        @Nullable
        public final String getOcraSuite() {
            return this.ocraSuite;
        }

        @Nullable
        public final String getOtpAlgorithm() {
            return this.otpAlgorithm;
        }

        @Nullable
        public final String getOtpLapse() {
            return this.otpLapse;
        }

        @Nullable
        public final String getOtpLength() {
            return this.otpLength;
        }

        @Nullable
        public final String getOtpTime() {
            return this.otpTime;
        }

        @NotNull
        public final String serialized$ethertoken_compat_release() {
            ArrayList arrayList = new ArrayList();
            String str = this.otpTime;
            if (str != null) {
                arrayList.add("OTPTIME=".concat(str));
            }
            String str2 = this.otpLapse;
            if (str2 != null) {
                arrayList.add("OTPLAPSE=".concat(str2));
            }
            String str3 = this.ocraSuite;
            if (str3 != null) {
                arrayList.add("OCRASUITE=".concat(str3));
            }
            String str4 = this.otpLength;
            if (str4 != null) {
                arrayList.add("OTPLENGTH=".concat(str4));
            }
            String str5 = this.otpAlgorithm;
            if (str5 != null) {
                arrayList.add("OTPALGORITHM=".concat(str5));
            }
            String str6 = this.ocraSessionInfo;
            if (str6 != null) {
                arrayList.add("OCRASESSIONINFO=".concat(str6));
            }
            return CollectionsKt___CollectionsKt.joinToString$default(arrayList, "#", null, null, 0, null, null, 62, null);
        }

        public final void setOcraSessionInfo(@Nullable String str) {
            this.ocraSessionInfo = str;
        }

        public final void setOcraSuite(@Nullable String str) {
            this.ocraSuite = str;
        }

        public final void setOtpAlgorithm(@Nullable String str) {
            this.otpAlgorithm = str;
        }

        public final void setOtpLapse(@Nullable String str) {
            this.otpLapse = str;
        }

        public final void setOtpLength(@Nullable String str) {
            this.otpLength = str;
        }

        public final void setOtpTime(@Nullable String str) {
            this.otpTime = str;
        }

        @NotNull
        public String toString() {
            String str = this.ocraSuite;
            String str2 = this.ocraSessionInfo;
            String str3 = this.otpLength;
            String str4 = this.otpLapse;
            String str5 = this.otpTime;
            String str6 = this.otpAlgorithm;
            StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("ocraSuite=", str, ", ocraSessionInfo=", str2, " , totpCodeDigits=");
            androidx.collection.k.e(sbC, str3, ", totpTimeStep=", str4, ", totpInitialTime=");
            return f.c(sbC, str5, ", totpCrypto=", str6);
        }

        public OathParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this.otpLength = str;
            this.otpLapse = str2;
            this.otpTime = str3;
            this.ocraSuite = str4;
            this.ocraSessionInfo = str5;
            this.otpAlgorithm = str6;
        }

        public /* synthetic */ OathParams(String str, String str2, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LegacyToken.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "", "", "getValue", "()Ljava/lang/String;", "value", "ANDROID_ID_PLUS_FIRST_INSTALL", "ANDROID_OS_INSTALLATION", "UNSUPPORTED_UUID_TYPE", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final class UUIDType {
        private static final /* synthetic */ UUIDType[] $VALUES;
        public static final UUIDType ANDROID_ID_PLUS_FIRST_INSTALL;
        public static final UUIDType ANDROID_OS_INSTALLATION;
        public static final UUIDType UNSUPPORTED_UUID_TYPE;

        /* JADX INFO: compiled from: LegacyToken.kt */
        public static final class a extends UUIDType {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            @NotNull
            public final String f30503p0;

            public a() {
                super("ANDROID_ID_PLUS_FIRST_INSTALL", 0, null);
                this.f30503p0 = StorageTokenBuilder.OTP_LENGTH;
            }

            @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.LegacyToken.UUIDType
            @NotNull
            public final String getValue() {
                return this.f30503p0;
            }
        }

        /* JADX INFO: compiled from: LegacyToken.kt */
        public static final class b extends UUIDType {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            @NotNull
            public final String f30504p0;

            public b() {
                super("ANDROID_OS_INSTALLATION", 1, null);
                this.f30504p0 = "5";
            }

            @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.LegacyToken.UUIDType
            @NotNull
            public final String getValue() {
                return this.f30504p0;
            }
        }

        /* JADX INFO: compiled from: LegacyToken.kt */
        public static final class c extends UUIDType {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            @NotNull
            public final String f30505p0;

            public c() {
                super("UNSUPPORTED_UUID_TYPE", 2, null);
                this.f30505p0 = "4";
            }

            @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.LegacyToken.UUIDType
            @NotNull
            public final String getValue() {
                return this.f30505p0;
            }
        }

        static {
            a aVar = new a();
            ANDROID_ID_PLUS_FIRST_INSTALL = aVar;
            b bVar = new b();
            ANDROID_OS_INSTALLATION = bVar;
            c cVar = new c();
            UNSUPPORTED_UUID_TYPE = cVar;
            $VALUES = new UUIDType[]{aVar, bVar, cVar};
        }

        public UUIDType() {
            throw null;
        }

        public UUIDType(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            super(str, i10);
        }

        public static UUIDType valueOf(String str) {
            return (UUIDType) Enum.valueOf(UUIDType.class, str);
        }

        public static UUIDType[] values() {
            return (UUIDType[]) $VALUES.clone();
        }

        @NotNull
        public abstract String getValue();
    }

    public LegacyToken(@NotNull TokenType type, @NotNull TokenStatus status, @NotNull String serial, @NotNull String name, @NotNull byte[] encryptedSeed, int i10, int i11, @NotNull String appId, @NotNull ExtraParams extraParams, boolean z10, boolean z11, long j10, long j11, long j12, @NotNull String version, @NotNull OathParams oathParams) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(encryptedSeed, "encryptedSeed");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(extraParams, "extraParams");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(oathParams, "oathParams");
        this.type = type;
        this.status = status;
        this.serial = serial;
        this.name = name;
        this.encryptedSeed = encryptedSeed;
        this.seedSize = i10;
        this.state = i11;
        this.appId = appId;
        this.extraParams = extraParams;
        this.needsPin = z10;
        this.useQrCode = z11;
        this.dateLastOtpMillis = j10;
        this.dateLastSyncMillis = j11;
        this.dateCreationMillis = j12;
        this.version = version;
        this.oathParams = oathParams;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    public final long getDateCreationMillis() {
        return this.dateCreationMillis;
    }

    public final long getDateLastOtpMillis() {
        return this.dateLastOtpMillis;
    }

    public final long getDateLastSyncMillis() {
        return this.dateLastSyncMillis;
    }

    @NotNull
    public final byte[] getEncryptedSeed() {
        return this.encryptedSeed;
    }

    @NotNull
    public final ExtraParams getExtraParams() {
        return this.extraParams;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getNeedsPin() {
        return this.needsPin;
    }

    @NotNull
    public final OathParams getOathParams() {
        return this.oathParams;
    }

    public final int getSeedSize() {
        return this.seedSize;
    }

    @NotNull
    public final String getSerial() {
        return this.serial;
    }

    public final int getState() {
        return this.state;
    }

    @NotNull
    public final TokenStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final TokenType getType() {
        return this.type;
    }

    public final boolean getUseQrCode() {
        return this.useQrCode;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final String serialized$ethertoken_compat_release() {
        Object[] objArr = new Object[16];
        objArr[0] = this.type.name();
        objArr[1] = this.status.name();
        objArr[2] = this.serial;
        String str = this.name;
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        objArr[3] = EncodingUtilsKt.toBase64(bytes);
        objArr[4] = EncodingUtilsKt.toHex$default(this.encryptedSeed, null, 1, null);
        objArr[5] = Integer.valueOf(this.seedSize);
        objArr[6] = String.valueOf(this.state);
        objArr[7] = this.appId;
        objArr[8] = this.needsPin ? "true" : "false";
        objArr[9] = this.useQrCode ? "true" : "false";
        objArr[10] = String.valueOf(this.dateLastOtpMillis);
        objArr[11] = String.valueOf(this.dateLastSyncMillis);
        objArr[12] = String.valueOf(this.dateCreationMillis);
        objArr[13] = this.version;
        byte[] bytes2 = this.oathParams.serialized$ethertoken_compat_release().getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        objArr[14] = EncodingUtilsKt.toBase64(bytes2);
        byte[] bytes3 = this.extraParams.serialized$ethertoken_compat_release().getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
        objArr[15] = EncodingUtilsKt.toBase64(bytes3);
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf(objArr), ReplenishLogic.ID_SEPARATOR, null, null, 0, null, null, 62, null);
    }

    public final void setAppId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appId = str;
    }

    public final void setDateCreationMillis(long j10) {
        this.dateCreationMillis = j10;
    }

    public final void setDateLastOtpMillis(long j10) {
        this.dateLastOtpMillis = j10;
    }

    public final void setDateLastSyncMillis(long j10) {
        this.dateLastSyncMillis = j10;
    }

    public final void setEncryptedSeed(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.encryptedSeed = bArr;
    }

    public final void setExtraParams(@NotNull ExtraParams extraParams) {
        Intrinsics.checkNotNullParameter(extraParams, "<set-?>");
        this.extraParams = extraParams;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setNeedsPin(boolean z10) {
        this.needsPin = z10;
    }

    public final void setOathParams(@NotNull OathParams oathParams) {
        Intrinsics.checkNotNullParameter(oathParams, "<set-?>");
        this.oathParams = oathParams;
    }

    public final void setSeedSize(int i10) {
        this.seedSize = i10;
    }

    public final void setSerial(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serial = str;
    }

    public final void setState(int i10) {
        this.state = i10;
    }

    public final void setStatus(@NotNull TokenStatus tokenStatus) {
        Intrinsics.checkNotNullParameter(tokenStatus, "<set-?>");
        this.status = tokenStatus;
    }

    public final void setType(@NotNull TokenType tokenType) {
        Intrinsics.checkNotNullParameter(tokenType, "<set-?>");
        this.type = tokenType;
    }

    public final void setUseQrCode(boolean z10) {
        this.useQrCode = z10;
    }

    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }

    @NotNull
    public String toString() {
        String strB;
        long j10 = this.dateCreationMillis;
        String str = this.appId;
        boolean z10 = this.needsPin;
        String pinCRC = this.extraParams.getPinCRC();
        String uuidCRC = this.extraParams.getUuidCRC();
        UUIDType uuidType = this.extraParams.getUuidType();
        if (uuidType == null || (strB = h0.b("UUID TYPE=", uuidType.getValue(), ", ")) == null) {
            strB = "";
        }
        String sdkVersion = this.extraParams.getSdkVersion();
        OathParams oathParams = this.oathParams;
        StringBuilder sb2 = new StringBuilder("createdAt=");
        sb2.append(j10);
        sb2.append(", appId=");
        sb2.append(str);
        sb2.append(", usePin=");
        sb2.append(z10);
        sb2.append(", PIN CRC=");
        sb2.append(pinCRC);
        androidx.collection.k.e(sb2, ", UUID CRC=", uuidCRC, ", ", strB);
        sb2.append("INSTALLED ON=");
        sb2.append(sdkVersion);
        sb2.append(", oathParams=");
        sb2.append(oathParams);
        return sb2.toString();
    }

    public /* synthetic */ LegacyToken(TokenType tokenType, TokenStatus tokenStatus, String str, String str2, byte[] bArr, int i10, int i11, String str3, ExtraParams extraParams, boolean z10, boolean z11, long j10, long j11, long j12, String str4, OathParams oathParams, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenType, tokenStatus, str, str2, bArr, i10, (i12 & 64) != 0 ? 0 : i11, str3, extraParams, z10, z11, j10, j11, j12, str4, oathParams);
    }
}

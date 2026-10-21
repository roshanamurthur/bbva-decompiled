package com.bbva.ethermobilesdk.tokencompat.plugin.util;

import androidx.exifinterface.media.ExifInterface;
import bk.q;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STArray;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STOtp;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STRemainingTime;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenPub;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResponseMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0004\u001a\u0018\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0000\u001a\u001a\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0005H\u0000\u001a\u0018\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0006H\u0000\u001a\u0018\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0007H\u0000\u001a\u0018\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\bH\u0000\u001a\u0018\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\tH\u0000\u001a&\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\n*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\nH\u0000\u001a\u0015\u0010\f\u001a\u00020\u0002*\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u0002\"\b\b\u0000\u0010\u000f*\u00020\u000e*\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STArray;", "", "", "", "toMap", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STToken;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STOtp;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STRemainingTime;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "", "", "toStringOrFalse", "(Ljava/lang/Boolean;)Ljava/lang/String;", "", ExifInterface.GPS_DIRECTION_TRUE, "toStringOrEmpty", "(Ljava/lang/Number;)Ljava/lang/String;", "ethertoken-compat-plugin_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nResponseMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseMapper.kt\ncom/bbva/ethermobilesdk/tokencompat/plugin/util/ResponseMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1549#2:82\n1620#2,3:83\n*S KotlinDebug\n*F\n+ 1 ResponseMapper.kt\ncom/bbva/ethermobilesdk/tokencompat/plugin/util/ResponseMapperKt\n*L\n72#1:82\n72#1:83,3\n*E\n"})
public final class ResponseMapperKt {
    @NotNull
    public static final Map<String, Object> toMap(@NotNull STArray sTArray) {
        Intrinsics.checkNotNullParameter(sTArray, "<this>");
        return q.mapOf(TuplesKt.to("code", String.valueOf(sTArray.getRc().getValue())), TuplesKt.to("description", sTArray.getRc().getDescription()), TuplesKt.to("array", toMap(sTArray.getValue())));
    }

    @NotNull
    public static final <T extends Number> String toStringOrEmpty(@Nullable T t10) {
        String string;
        return (t10 == null || (string = t10.toString()) == null) ? "" : string;
    }

    @NotNull
    public static final String toStringOrFalse(@Nullable Boolean bool) {
        return Intrinsics.areEqual(bool, Boolean.TRUE) ? "true" : "false";
    }

    @NotNull
    public static final Map<String, String> toMap(@NotNull STToken sTToken) {
        TokenType type;
        Intrinsics.checkNotNullParameter(sTToken, "<this>");
        Pair[] pairArr = new Pair[9];
        pairArr[0] = TuplesKt.to("code", String.valueOf(sTToken.getRc().getValue()));
        pairArr[1] = TuplesKt.to("description", sTToken.getRc().getDescription());
        TokenPub value = sTToken.getValue();
        String strName = (value == null || (type = value.getType()) == null) ? null : type.name();
        if (strName == null) {
            strName = "";
        }
        pairArr[2] = TuplesKt.to("type", strName);
        TokenPub value2 = sTToken.getValue();
        String serial = value2 != null ? value2.getSerial() : null;
        if (serial == null) {
            serial = "";
        }
        pairArr[3] = TuplesKt.to("serial", serial);
        TokenPub value3 = sTToken.getValue();
        String description = value3 != null ? value3.getDescription() : null;
        pairArr[4] = TuplesKt.to("desc", description != null ? description : "");
        TokenPub value4 = sTToken.getValue();
        pairArr[5] = TuplesKt.to("needsPin", value4 != null ? toStringOrFalse(Boolean.valueOf(value4.getNeedsPin())) : null);
        TokenPub value5 = sTToken.getValue();
        pairArr[6] = TuplesKt.to("useQrCode", value5 != null ? toStringOrFalse(Boolean.valueOf(value5.getUseQrCode())) : null);
        TokenPub value6 = sTToken.getValue();
        pairArr[7] = TuplesKt.to("totpTimeIncrement", value6 != null ? toStringOrEmpty(Long.valueOf(value6.getTotpTimeIncrement())) : null);
        TokenPub value7 = sTToken.getValue();
        pairArr[8] = TuplesKt.to("chrotpTimeIncrement", value7 != null ? toStringOrEmpty(Long.valueOf(value7.getChrotpTimeIncrement())) : null);
        return q.mapOf(pairArr);
    }

    @NotNull
    public static final Map<String, String> toMap(@NotNull STOtp sTOtp) {
        Intrinsics.checkNotNullParameter(sTOtp, "<this>");
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("code", String.valueOf(sTOtp.getRc().getValue()));
        pairArr[1] = TuplesKt.to("description", sTOtp.getRc().getDescription());
        String value = sTOtp.getValue();
        if (value == null) {
            value = "";
        }
        pairArr[2] = TuplesKt.to("otp", value);
        return q.mapOf(pairArr);
    }

    @NotNull
    public static final Map<String, String> toMap(@NotNull STRemainingTime sTRemainingTime) {
        Intrinsics.checkNotNullParameter(sTRemainingTime, "<this>");
        return q.mapOf(TuplesKt.to("code", String.valueOf(sTRemainingTime.getRc().getValue())), TuplesKt.to("description", sTRemainingTime.getRc().getDescription()), TuplesKt.to("remainingTime", String.valueOf(sTRemainingTime.getRemainingTime())));
    }

    @NotNull
    public static final Map<String, String> toMap(@NotNull STReturnCode sTReturnCode) {
        Intrinsics.checkNotNullParameter(sTReturnCode, "<this>");
        return q.mapOf(TuplesKt.to("code", String.valueOf(sTReturnCode.getValue())), TuplesKt.to("description", sTReturnCode.getDescription()));
    }

    @NotNull
    public static final Map<String, String> toMap(@NotNull TokenPub tokenPub) {
        Intrinsics.checkNotNullParameter(tokenPub, "<this>");
        return q.mapOf(TuplesKt.to("type", tokenPub.getType().name()), TuplesKt.to("serial", tokenPub.getSerial()), TuplesKt.to("desc", tokenPub.getDescription()), TuplesKt.to("needsPin", String.valueOf(tokenPub.getNeedsPin())), TuplesKt.to("useQrCode", String.valueOf(tokenPub.getUseQrCode())), TuplesKt.to("totpTimeIncrement", String.valueOf(tokenPub.getTotpTimeIncrement())), TuplesKt.to("chrotpTimeIncrement", String.valueOf(tokenPub.getChrotpTimeIncrement())));
    }

    @NotNull
    public static final List<Map<String, String>> toMap(@Nullable List<? extends TokenPub> list) {
        if (list != null) {
            List<? extends TokenPub> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(toMap((TokenPub) it.next()));
            }
            return arrayList;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }
}

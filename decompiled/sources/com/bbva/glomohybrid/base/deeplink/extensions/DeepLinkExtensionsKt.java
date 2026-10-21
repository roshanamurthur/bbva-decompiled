package com.bbva.glomohybrid.base.deeplink.extensions;

import android.net.Uri;
import androidx.camera.core.processing.f;
import bk.p;
import bk.q;
import com.bbva.dynamiclinks.model.DynamicLinkData;
import com.bbva.glomohybrid.base.deeplink.constants.DynamicLinkConstants;
import com.bbva.glomohybrid.base.deeplink.model.LinkParamsKt;
import com.bbva.glomohybrid.base.deeplink.usecase.params.DynamicLinkParams;
import com.bbva.glomohybrid.base.deeplink.usecase.result.Deeplink;
import com.bbva.glomohybrid.base.deeplink.usecase.result.DynamicLinkResult;
import com.bbva.glomohybrid.base.deeplink.usecase.result.NotValidLink;
import com.bbva.glomohybrid.base.deeplink.usecase.result.QRCard;
import com.bbva.glomohybrid.base.extensions.StringExtensionsKt;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DeepLinkExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0011\u001a\u00020\u0001*\u00020\u0001\u001a\u0016\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0013*\u00020\u0001\u001a\f\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0001\u001a\u0018\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013*\u00020\u0017\u001a\n\u0010\u0018\u001a\u00020\u0019*\u00020\u0017\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0017\u001a\n\u0010\u001b\u001a\u00020\u0019*\u00020\u0017\u001a\n\u0010\u001c\u001a\u00020\u0019*\u00020\u0017\u001a\n\u0010\u001d\u001a\u00020\u0019*\u00020\u0017\u001a\n\u0010\u001e\u001a\u00020\u0019*\u00020\u0017\u001a\u0014\u0010\u001f\u001a\u00020\u0017*\u00020\u00012\b\b\u0002\u0010 \u001a\u00020\u0001\u001a\n\u0010!\u001a\u00020\u0017*\u00020\u0001\u001a\u0014\u0010\"\u001a\u00020\u0017*\u00020\u00012\b\b\u0002\u0010 \u001a\u00020\u0001\u001a$\u0010#\u001a\u001c\u0012\u0004\u0012\u00020\u0001\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00130$*\u00020%\u001a\f\u0010&\u001a\u0004\u0018\u00010'*\u00020(\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"AMPERSAND", "", "DEEP_LINK_DELIMITER", "DYNAMIC_LINK_DELIMITER", "GEMA_LINK_KEY", "GOOGLE_ASSISTANT_DEEP_LINK_KEY", "GOOGLE_WALLET_A2A_VERIFICATION", "KEY_VALUE_DELIMITER", "OPERATIVETYPE_KEY", "PUBLIC_NOTIFICATION_MANAGER_DEEP_LINK_KEY", "QRPAYMENT_ACTION", "ROUTE_ATM_AGENTS", "ROUTE_ATM_OFFICES", "ROUTE_ATM_SITES", "ROUTE_MGM_PARTICIPATE", "WEBAPP_REDIRECTION", "WEB_REGEX_PATTERN", "asQueryToJsonString", "asQueryToMap", "", "getExtraAsArgument", "getRedirectToAsMap", "", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "isGemaLink", "", "isLGoogleAssistantDeepLink", "isLinkToAtm", "isLinkToMgm", "isPublicManagerDeepLink", "isWebAppRedirection", "parseDeepLink", "delimiter", "parseGoogleAssistantDeepLink", "parseModoDeepLink", "toAnalytics", "Lkotlin/Pair;", "Lcom/bbva/glomohybrid/base/deeplink/usecase/result/DynamicLinkResult;", "toParams", "Lcom/bbva/glomohybrid/base/deeplink/usecase/params/DynamicLinkParams;", "Lcom/bbva/dynamiclinks/model/DynamicLinkData;", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeepLinkExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeepLinkExtensions.kt\ncom/bbva/glomohybrid/base/deeplink/extensions/DeepLinkExtensionsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n429#2:166\n502#2,5:167\n429#2:178\n502#2,5:179\n1#3:172\n1#3:174\n2634#4:173\n1747#4,3:175\n*S KotlinDebug\n*F\n+ 1 DeepLinkExtensions.kt\ncom/bbva/glomohybrid/base/deeplink/extensions/DeepLinkExtensionsKt\n*L\n40#1:166\n40#1:167,5\n123#1:178\n123#1:179,5\n67#1:174\n67#1:173\n88#1:175,3\n*E\n"})
public final class DeepLinkExtensionsKt {

    @NotNull
    public static final String AMPERSAND = "&";

    @NotNull
    public static final String DEEP_LINK_DELIMITER = "=";

    @NotNull
    public static final String DYNAMIC_LINK_DELIMITER = ":";

    @NotNull
    public static final String GEMA_LINK_KEY = "gema";

    @NotNull
    public static final String GOOGLE_ASSISTANT_DEEP_LINK_KEY = "googleAssistant";

    @NotNull
    public static final String GOOGLE_WALLET_A2A_VERIFICATION = "paymentsThirdPartyWalletVerification";

    @NotNull
    public static final String KEY_VALUE_DELIMITER = "=";

    @NotNull
    public static final String OPERATIVETYPE_KEY = "opperativeType";

    @NotNull
    public static final String PUBLIC_NOTIFICATION_MANAGER_DEEP_LINK_KEY = "notification-manager-public";

    @NotNull
    public static final String QRPAYMENT_ACTION = "qr_payment";

    @NotNull
    public static final String ROUTE_ATM_AGENTS = "ubicacion_agentes";

    @NotNull
    public static final String ROUTE_ATM_OFFICES = "ubicacion_oficinas";

    @NotNull
    public static final String ROUTE_ATM_SITES = "ubicacion_cajeros";

    @NotNull
    public static final String ROUTE_MGM_PARTICIPATE = "mgmReferral";

    @NotNull
    public static final String WEBAPP_REDIRECTION = "webapp_redirection";

    @NotNull
    public static final String WEB_REGEX_PATTERN = "^link=https://[a-zA-Z0-9-._~:/?#[\\\\]@!$&'()*+,;=%.]*$";

    @NotNull
    public static final String asQueryToJsonString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String string = new JSONObject(asQueryToMap(str)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final Map<String, String> asQueryToMap(@NotNull String str) {
        List listSplit$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null)) {
            String str3 = StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "=", false, 2, (Object) null) ? str2 : null;
            if (str3 != null && (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str3, new String[]{"="}, false, 0, 6, (Object) null)) != null) {
                List list = listSplit$default.size() == 2 ? listSplit$default : null;
                if (list != null) {
                    linkedHashMap.put(list.get(0), list.get(1));
                }
            }
        }
        return linkedHashMap;
    }

    @Nullable
    public static final String getExtraAsArgument(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if ((StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "&", false, 2, (Object) null) ? str : null) != null) {
            return f.d("extra=", StringExtensionsKt.encodeBase64(asQueryToJsonString(StringsKt__StringsKt.substringAfter(str, "&", str)), 2));
        }
        return null;
    }

    @NotNull
    public static final Map<String, Object> getRedirectToAsMap(@NotNull DeepLinkModel deepLinkModel) {
        Object objM5535constructorimpl;
        String str;
        Intrinsics.checkNotNullParameter(deepLinkModel, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            Type type = new TypeToken<Map<String, ? extends Object>>() { // from class: com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt$getRedirectToAsMap$1$type$1
            }.getType();
            Gson gson = new Gson();
            Map<String, String> localArgs = deepLinkModel.getLocalArgs();
            if (localArgs == null || (str = localArgs.get(LinkParamsKt.REDIRECT_TO_KEY)) == null) {
                str = "{}";
            }
            Object objFromJson = gson.fromJson(str, type);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            objM5535constructorimpl = Result.m5535constructorimpl((Map) objFromJson);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Map mapEmptyMap = q.emptyMap();
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = mapEmptyMap;
        }
        return (Map) objM5535constructorimpl;
    }

    public static final boolean isGemaLink(@NotNull DeepLinkModel deepLinkModel) {
        Intrinsics.checkNotNullParameter(deepLinkModel, "<this>");
        return Intrinsics.areEqual(deepLinkModel.getKey(), "gema");
    }

    public static final boolean isLGoogleAssistantDeepLink(@NotNull DeepLinkModel deepLinkModel) {
        Intrinsics.checkNotNullParameter(deepLinkModel, "<this>");
        return Intrinsics.areEqual(deepLinkModel.getKey(), GOOGLE_ASSISTANT_DEEP_LINK_KEY);
    }

    public static final boolean isLinkToAtm(@NotNull DeepLinkModel deepLinkModel) {
        Intrinsics.checkNotNullParameter(deepLinkModel, "<this>");
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{ROUTE_ATM_OFFICES, ROUTE_ATM_SITES, ROUTE_ATM_AGENTS});
        if ((listListOf instanceof Collection) && listListOf.isEmpty()) {
            return false;
        }
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(deepLinkModel.getAction(), (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isLinkToMgm(@NotNull DeepLinkModel deepLinkModel) {
        Intrinsics.checkNotNullParameter(deepLinkModel, "<this>");
        return Intrinsics.areEqual(deepLinkModel.getAction(), ROUTE_MGM_PARTICIPATE);
    }

    public static final boolean isPublicManagerDeepLink(@NotNull DeepLinkModel deepLinkModel) {
        Intrinsics.checkNotNullParameter(deepLinkModel, "<this>");
        return Intrinsics.areEqual(deepLinkModel.getKey(), PUBLIC_NOTIFICATION_MANAGER_DEEP_LINK_KEY);
    }

    public static final boolean isWebAppRedirection(@NotNull DeepLinkModel deepLinkModel) {
        Intrinsics.checkNotNullParameter(deepLinkModel, "<this>");
        return Intrinsics.areEqual(deepLinkModel.getAction(), WEBAPP_REDIRECTION) && (deepLinkModel.getArgs().isEmpty() ^ true) && new Regex(WEB_REGEX_PATTERN).matches(deepLinkModel.getArgs().get(0));
    }

    @NotNull
    public static final DeepLinkModel parseDeepLink(@NotNull String str, @NotNull String delimiter) {
        DeepLinkModel deepLinkModel;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        String strReplace = new Regex("[{}\"]").replace(str, "");
        StringBuilder sb2 = new StringBuilder();
        int length = strReplace.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = strReplace.charAt(i10);
            if (true ^ CharsKt.isWhitespace(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "filterTo(StringBuilder(), predicate).toString()");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{"&"}, false, 0, 6, (Object) null);
        List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(0), new String[]{delimiter}, false, 0, 6, (Object) null);
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listSplit$default.subList(1, listSplit$default.size()));
        String extraAsArgument = getExtraAsArgument(str);
        if (extraAsArgument != null) {
            mutableList.add(extraAsArgument);
        }
        int size = listSplit$default2.size();
        if (size == 1) {
            deepLinkModel = new DeepLinkModel((String) listSplit$default2.get(0), "", mutableList, null, 8, null);
        } else {
            if (size != 2) {
                return new DeepLinkModel(str, str, mutableList, null, 8, null);
            }
            deepLinkModel = new DeepLinkModel((String) listSplit$default2.get(0), (String) listSplit$default2.get(1), mutableList, null, 8, null);
        }
        return deepLinkModel;
    }

    public static /* synthetic */ DeepLinkModel parseDeepLink$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "=";
        }
        return parseDeepLink(str, str2);
    }

    @NotNull
    public static final DeepLinkModel parseGoogleAssistantDeepLink(@NotNull String str) throws IOException {
        String str2;
        String strReplace$default;
        String strReplaceFirst$default;
        String strReplace$default2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strReplace = new Regex("[{}\"]").replace(str, "");
        StringBuilder sb2 = new StringBuilder();
        int length = strReplace.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = strReplace.charAt(i10);
            if (true ^ CharsKt.isWhitespace(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "filterTo(StringBuilder(), predicate).toString()");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{"?"}, false, 0, 6, (Object) null);
        Uri uri = Uri.parse((String) listSplit$default.get(0));
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        String path = uri.getPath();
        if (path == null || (strReplace$default = l.replace$default(path, "/", "", false, 4, (Object) null)) == null) {
            str2 = null;
        } else {
            String strCapitalizeSentence = StringExtensionsKt.capitalizeSentence(strReplace$default, Constant.DASH_STRING);
            if (strCapitalizeSentence == null || (strReplace$default2 = l.replace$default(strCapitalizeSentence, Constant.DASH_STRING, "", false, 4, (Object) null)) == null) {
                strReplaceFirst$default = null;
            } else {
                String strSubstring = strCapitalizeSentence.substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = strReplace$default.substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                strReplaceFirst$default = l.replaceFirst$default(strReplace$default2, strSubstring, strSubstring2, false, 4, (Object) null);
            }
            str2 = strReplaceFirst$default;
        }
        List listSplit$default2 = listSplit$default.size() > 1 ? StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(1), new String[]{"&"}, false, 0, 6, (Object) null) : null;
        List listSubList = listSplit$default2 != null ? listSplit$default2.subList(0, listSplit$default2.size()) : null;
        return listSubList == null ? new DeepLinkModel(GOOGLE_ASSISTANT_DEEP_LINK_KEY, str2, null, null, 12, null) : new DeepLinkModel(GOOGLE_ASSISTANT_DEEP_LINK_KEY, str2, listSubList, null, 8, null);
    }

    @NotNull
    public static final DeepLinkModel parseModoDeepLink(@NotNull String str, @NotNull String delimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) new Regex("[{}\"]").replace(str, ""), new String[]{"&"}, false, 0, 6, (Object) null);
        StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(0), new String[]{delimiter}, false, 0, 6, (Object) null);
        return new DeepLinkModel(OPERATIVETYPE_KEY, "qr_payment", listSplit$default.subList(1, listSplit$default.size()), null, 8, null);
    }

    public static /* synthetic */ DeepLinkModel parseModoDeepLink$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "=";
        }
        return parseModoDeepLink(str, str2);
    }

    @NotNull
    public static final Pair<String, Map<String, Object>> toAnalytics(@NotNull DynamicLinkResult dynamicLinkResult) {
        Intrinsics.checkNotNullParameter(dynamicLinkResult, "<this>");
        if (dynamicLinkResult instanceof Deeplink) {
            Pair[] pairArr = new Pair[2];
            Deeplink deeplink = (Deeplink) dynamicLinkResult;
            pairArr[0] = TuplesKt.to(DynamicLinkConstants.USE_CASE_ID, deeplink.getId());
            String origin = deeplink.getOrigin();
            pairArr[1] = TuplesKt.to(DynamicLinkConstants.ORIGIN, origin != null ? origin : "");
            return TuplesKt.to(DynamicLinkConstants.CONTINUITY_ACCESS, q.mapOf(pairArr));
        }
        if (!(dynamicLinkResult instanceof QRCard)) {
            if (dynamicLinkResult instanceof NotValidLink) {
                return TuplesKt.to(DynamicLinkConstants.CONTINUITY_ACCESS_ERROR, p.mapOf(TuplesKt.to("ERROR", DynamicLinkConstants.USE_CASE_NOT_FOUND)));
            }
            throw new NoWhenBranchMatchedException();
        }
        Pair[] pairArr2 = new Pair[2];
        QRCard qRCard = (QRCard) dynamicLinkResult;
        pairArr2[0] = TuplesKt.to(DynamicLinkConstants.USE_CASE_ID, qRCard.getId());
        String origin2 = qRCard.getOrigin();
        pairArr2[1] = TuplesKt.to(DynamicLinkConstants.ORIGIN, origin2 != null ? origin2 : "");
        return TuplesKt.to(DynamicLinkConstants.CONTINUITY_ACCESS, q.mapOf(pairArr2));
    }

    @Nullable
    public static final DynamicLinkParams toParams(@NotNull DynamicLinkData dynamicLinkData) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(dynamicLinkData, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = (String) q.getValue(dynamicLinkData.getData(), "id");
            String str2 = (String) q.getValue(dynamicLinkData.getData(), "data");
            String str3 = dynamicLinkData.getData().get("origin");
            if (str3 == null) {
                str3 = "";
            }
            objM5535constructorimpl = Result.m5535constructorimpl(new DynamicLinkParams(str, str2, str3));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (DynamicLinkParams) objM5535constructorimpl;
    }
}

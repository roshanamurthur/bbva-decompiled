package com.bbva.notifications.extensions;

import bk.p;
import com.bbva.glomohybrid.base.deeplink.model.LinkParamsKt;
import com.bbva.glomohybrid.base.deeplink.model.SalesforceDeepLinkModel;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SalesforceDeepLinkModelExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\"\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/SalesforceDeepLinkModel;", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "toDeepLink", "toGemaDeepLink", "", "PARAMS_KEY", "Ljava/lang/String;", "DESTINATION_KEY", "TRACKING_CODE_KEY", "EXTRA_KEY", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSalesforceDeepLinkModelExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SalesforceDeepLinkModelExtensions.kt\ncom/bbva/notifications/extensions/SalesforceDeepLinkModelExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
public final class SalesforceDeepLinkModelExtensionsKt {

    @NotNull
    public static final String DESTINATION_KEY = "destination";

    @NotNull
    public static final String EXTRA_KEY = "extra";

    @NotNull
    public static final String PARAMS_KEY = "params";

    @NotNull
    public static final String TRACKING_CODE_KEY = "app";

    @NotNull
    public static final DeepLinkModel toDeepLink(@Nullable SalesforceDeepLinkModel salesforceDeepLinkModel) {
        Object objM5535constructorimpl;
        String strEncodeBase64;
        String trackingCode;
        Map<String, Object> payload;
        Map<String, Object> payload2;
        ArrayList arrayList = new ArrayList();
        Object obj = (salesforceDeepLinkModel == null || (payload2 = salesforceDeepLinkModel.getPayload()) == null) ? null : payload2.get("destination");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = (salesforceDeepLinkModel == null || (payload = salesforceDeepLinkModel.getPayload()) == null) ? null : payload.get("params");
        Map mapMapOf = (salesforceDeepLinkModel == null || (trackingCode = salesforceDeepLinkModel.getTrackingCode()) == null) ? null : p.mapOf(TuplesKt.to("app", trackingCode));
        try {
            Result.Companion companion = Result.INSTANCE;
            if (obj2 != null) {
                String json = new Gson().toJson(obj2);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                strEncodeBase64 = com.bbva.glomohybrid.base.extensions.StringExtensionsKt.encodeBase64(json, 2);
            } else {
                strEncodeBase64 = null;
            }
            objM5535constructorimpl = Result.m5535constructorimpl(strEncodeBase64);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        String str2 = (String) objM5535constructorimpl;
        if (str2 != null) {
            arrayList.add("extra=".concat(str2));
        }
        return new DeepLinkModel(salesforceDeepLinkModel != null ? salesforceDeepLinkModel.getApp() : null, str, arrayList, mapMapOf);
    }

    @NotNull
    public static final DeepLinkModel toGemaDeepLink(@Nullable SalesforceDeepLinkModel salesforceDeepLinkModel) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Result.Companion companion = Result.INSTANCE;
            String json = new Gson().toJson(salesforceDeepLinkModel);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            Result.m5535constructorimpl((String) linkedHashMap.put(LinkParamsKt.REDIRECT_TO_KEY, json));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return new DeepLinkModel("gema", "", null, linkedHashMap, 4, null);
    }
}

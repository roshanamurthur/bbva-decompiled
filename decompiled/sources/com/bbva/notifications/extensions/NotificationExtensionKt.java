package com.bbva.notifications.extensions;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.base.deeplink.model.SalesforceDeepLinkModel;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationExtension.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"AMPERSAND", "", "DELIMITER", "toOriginIdWebNotification", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "toSalesforceDeeplinkModel", "Lcom/bbva/glomohybrid/base/deeplink/model/SalesforceDeepLinkModel;", "toWebNotification", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationExtension.kt\ncom/bbva/notifications/extensions/NotificationExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class NotificationExtensionKt {

    @NotNull
    public static final String AMPERSAND = "&";

    @NotNull
    public static final String DELIMITER = "=";

    @NotNull
    public static final DeepLinkModel toOriginIdWebNotification(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null);
        List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(0), new String[]{"="}, false, 0, 6, (Object) null);
        List listSubList = listSplit$default.subList(1, listSplit$default.size());
        int size = listSplit$default2.size();
        if (size != 1) {
            return size != 2 ? new DeepLinkModel(str, str, listSubList, null, 8, null) : new DeepLinkModel((String) listSplit$default2.get(0), (String) listSplit$default2.get(1), listSubList, null, 8, null);
        }
        return new DeepLinkModel((String) listSplit$default2.get(0), (String) listSplit$default2.get(0), listSubList, null, 8, null);
    }

    @Nullable
    public static final SalesforceDeepLinkModel toSalesforceDeeplinkModel(@NotNull String str) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl((SalesforceDeepLinkModel) new Gson().fromJson(str, SalesforceDeepLinkModel.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (SalesforceDeepLinkModel) objM5535constructorimpl;
    }

    @NotNull
    public static final DeepLinkModel toWebNotification(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strSubstringBefore = StringsKt__StringsKt.substringBefore(str, "&", str);
        String strSubstringBefore2 = StringsKt__StringsKt.substringBefore(strSubstringBefore, "=", strSubstringBefore);
        String strSubstringAfter = StringsKt__StringsKt.substringAfter(strSubstringBefore, "=", strSubstringBefore);
        ArrayList arrayList = new ArrayList();
        String extraAsArgument = DeepLinkExtensionsKt.getExtraAsArgument(str);
        if (extraAsArgument != null) {
            arrayList.add(extraAsArgument);
        }
        return new DeepLinkModel(strSubstringBefore2, strSubstringAfter, arrayList, null, 8, null);
    }
}

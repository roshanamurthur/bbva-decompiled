package com.huawei.hms.feature.broadcast;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.hms.feature.utils.Logger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class BroadcastHandlerManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50164a = "BroadcastHandlerManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50165b = "com.huawei.appmarket.permission.dynamic_install";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f50166c = "com.huawei.hwouc.permission.DYNAMIC_FEATURE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ActionType f50167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ActionType f50168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static Map<String, String> f50169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Map<String, ActionType> f50170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Set<String> f50171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Set<String> f50172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Set<String> f50173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Set<String> f50174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Set<String> f50175l;
    private static IBroadcastInterceptor m;

    public interface IBroadcastInterceptor {
        IHWMarketBroadcastHandler intercept(String str);
    }

    static {
        ActionType actionType = new ActionType("com.huawei.appgallery.dynamic.action.INSTALL_CONFIRM", "com.huawei.appgallery.dynamic.action.AGREEMENT_CONFIRM", "com.huawei.appgallery.dynamic.action.DOWNLOAD_PROGRESS", "com.huawei.appgallery.dynamic.action.DOWNLOAD_COMPLETED", "com.huawei.appgallery.dynamic.action.INSTALL_COMPLETED");
        f50167d = actionType;
        ActionType actionType2 = new ActionType("com.huawei.hwouc.dynamic.action.INSTALL_CONFIRM", "", "com.huawei.hwouc.dynamic.action.DOWNLOAD_PROGRESS", "com.huawei.hwouc.dynamic.action.DOWNLOAD_COMPLETED", "com.huawei.hwouc.dynamic.action.INSTALL_COMPLETED");
        f50168e = actionType2;
        f50169f = new HashMap();
        f50170g = new HashMap();
        f50171h = new HashSet();
        f50172i = new HashSet();
        f50173j = new HashSet();
        f50174k = new HashSet();
        f50175l = new HashSet();
        a(com.huawei.hms.feature.model.a.f50426b, actionType, null);
        a(com.huawei.hms.feature.model.a.f50427c, actionType2, f50166c);
    }

    private static void a(IntentFilter intentFilter, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        intentFilter.addAction(str);
    }

    public static IHWMarketBroadcastHandler getBroadcastHandler(Intent intent) {
        String str;
        String str2;
        IHWMarketBroadcastHandler iHWMarketBroadcastHandlerIntercept;
        if (intent == null || intent.getAction() == null) {
            str = f50164a;
            str2 = "invalid intent or action: null.";
        } else {
            String action = intent.getAction();
            IBroadcastInterceptor iBroadcastInterceptor = m;
            if (iBroadcastInterceptor != null && (iHWMarketBroadcastHandlerIntercept = iBroadcastInterceptor.intercept(action)) != null) {
                return iHWMarketBroadcastHandlerIntercept;
            }
            if (f50171h.contains(action)) {
                return new com.huawei.hms.feature.broadcast.i.a();
            }
            if (f50172i.contains(action)) {
                return new com.huawei.hms.feature.broadcast.i.e();
            }
            if (f50173j.contains(action)) {
                return new com.huawei.hms.feature.broadcast.i.c();
            }
            if (f50174k.contains(action)) {
                return new com.huawei.hms.feature.broadcast.i.b();
            }
            if (f50175l.contains(action)) {
                return new com.huawei.hms.feature.broadcast.i.d();
            }
            str = f50164a;
            str2 = "invalid broadcast action.";
        }
        Logger.w(str, str2);
        return null;
    }

    public static IntentFilter makeBroadcastFilter() {
        IntentFilter intentFilter = new IntentFilter();
        if (f50170g.isEmpty()) {
            Logger.w(f50164a, "The actionMap is empty.");
            return intentFilter;
        }
        for (ActionType actionType : f50170g.values()) {
            if (actionType != null) {
                a(intentFilter, actionType.getBigPackageAction());
                a(intentFilter, actionType.getPersonAgreementAction());
                a(intentFilter, actionType.getDownloadProcessAction());
                a(intentFilter, actionType.getDownloadCompleteAction());
                a(intentFilter, actionType.getInstallCompleteAction());
            }
        }
        return intentFilter;
    }

    public static void registerFilterStrategy(String str, ActionType actionType, String str2) {
        if (TextUtils.equals(str, com.huawei.hms.feature.model.a.f50426b) || TextUtils.equals(str, com.huawei.hms.feature.model.a.f50427c)) {
            Logger.w(f50164a, "invalid channel name.");
        } else {
            a(str, actionType, str2);
        }
    }

    public static void setBroadcastInterceptor(IBroadcastInterceptor iBroadcastInterceptor) {
        if (iBroadcastInterceptor == null) {
            Logger.w(f50164a, "broadcast interceptor is null, no need to set interceptor.");
        } else {
            m = iBroadcastInterceptor;
        }
    }

    private static void a(String str, ActionType actionType, String str2) {
        f50170g.put(str, actionType);
        f50171h.add(actionType.getBigPackageAction());
        f50172i.add(actionType.getPersonAgreementAction());
        f50173j.add(actionType.getDownloadProcessAction());
        f50174k.add(actionType.getDownloadCompleteAction());
        f50175l.add(actionType.getInstallCompleteAction());
        f50169f.put(str, str2);
    }
}

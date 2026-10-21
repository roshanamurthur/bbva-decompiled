package com.bbva.component.dm.analytics.model;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.bbva.component.dm.analytics.model.CookiesRepository;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CookiesRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002J0\u0010\n\u001a\u00020\b2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/bbva/component/dm/analytics/model/CookiesRepository;", "", "", "Lkotlin/Pair;", "", "getCookies", "cookies", "Lkotlin/Function0;", "", "finished", "setCookies", "Landroid/webkit/CookieManager;", "a", "Landroid/webkit/CookieManager;", "getCookieManager", "()Landroid/webkit/CookieManager;", "cookieManager", "b", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "<init>", "(Landroid/webkit/CookieManager;Ljava/lang/String;)V", "component-dm-analytics_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCookiesRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookiesRepository.kt\ncom/bbva/component/dm/analytics/model/CookiesRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1549#2:33\n1620#2,3:34\n1855#2,2:37\n*S KotlinDebug\n*F\n+ 1 CookiesRepository.kt\ncom/bbva/component/dm/analytics/model/CookiesRepository\n*L\n22#1:33\n22#1:34,3\n13#1:37,2\n*E\n"})
public final class CookiesRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CookieManager cookieManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: compiled from: CookiesRepository.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f27413p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public CookiesRepository(@NotNull CookieManager cookieManager, @NotNull String url) {
        Intrinsics.checkNotNullParameter(cookieManager, "cookieManager");
        Intrinsics.checkNotNullParameter(url, "url");
        this.cookieManager = cookieManager;
        this.url = url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCookies$default(CookiesRepository cookiesRepository, List list, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = a.f27413p0;
        }
        cookiesRepository.setCookies(list, function0);
    }

    @NotNull
    public final CookieManager getCookieManager() {
        return this.cookieManager;
    }

    @NotNull
    public final List<Pair<String, String>> getCookies() {
        String cookie = this.cookieManager.getCookie(this.url);
        if (cookie == null || cookie.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) cookie, new String[]{ReplenishLogic.ID_SEPARATOR}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 0, 6, (Object) null);
            String str = (String) listSplit$default2.get(0);
            arrayList.add(TuplesKt.to(StringsKt__StringsKt.trim((CharSequence) str).toString(), (String) listSplit$default2.get(1)));
        }
        return arrayList;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setCookies(@NotNull final List<Pair<String, String>> cookies, @NotNull final Function0<Unit> finished) {
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Intrinsics.checkNotNullParameter(finished, "finished");
        final CookieManager cookieManager = this.cookieManager;
        cookieManager.removeAllCookies(new ValueCallback() { // from class: t4.a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                List<Pair> cookies2 = cookies;
                Intrinsics.checkNotNullParameter(cookies2, "$cookies");
                Function0 finished2 = finished;
                Intrinsics.checkNotNullParameter(finished2, "$finished");
                CookieManager this_with = cookieManager;
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                CookiesRepository this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (Pair pair : cookies2) {
                    this_with.setCookie(this$0.url, pair.getFirst() + "=" + pair.getSecond());
                }
                finished2.invoke();
            }
        });
    }
}

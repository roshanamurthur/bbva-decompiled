package okhttp3;

import bk.p;
import bk.q;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JavaNetCookieJar.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lokhttp3/JavaNetCookieJar;", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "", "Lokhttp3/Cookie;", "cookies", "", "saveFromResponse", "loadForRequest", "Ljava/net/CookieHandler;", "cookieHandler", "<init>", "(Ljava/net/CookieHandler;)V", "okhttp-urlconnection"}, k = 1, mv = {1, 4, 0})
public final class JavaNetCookieJar implements CookieJar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CookieHandler f85574a;

    public JavaNetCookieJar(@NotNull CookieHandler cookieHandler) {
        Intrinsics.checkNotNullParameter(cookieHandler, "cookieHandler");
        this.f85574a = cookieHandler;
    }

    @Override // okhttp3.CookieJar
    @NotNull
    public List<Cookie> loadForRequest(@NotNull HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Map<String, List<String>> cookieHeaders = this.f85574a.get(url.uri(), q.emptyMap());
            Intrinsics.checkNotNullExpressionValue(cookieHeaders, "cookieHeaders");
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : cookieHeaders.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (l.equals("Cookie", key, true) || l.equals("Cookie2", key, true)) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    if (!value.isEmpty()) {
                        for (String header : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            Intrinsics.checkNotNullExpressionValue(header, "header");
                            ArrayList arrayList2 = new ArrayList();
                            int length = header.length();
                            int i10 = 0;
                            while (i10 < length) {
                                int iDelimiterOffset = Util.delimiterOffset(header, ";,", i10, length);
                                int iDelimiterOffset2 = Util.delimiterOffset(header, '=', i10, iDelimiterOffset);
                                String strTrimSubstring = Util.trimSubstring(header, i10, iDelimiterOffset2);
                                if (!l.startsWith$default(strTrimSubstring, Constant.MXN_SYMBOL, false, 2, null)) {
                                    String strTrimSubstring2 = iDelimiterOffset2 < iDelimiterOffset ? Util.trimSubstring(header, iDelimiterOffset2 + 1, iDelimiterOffset) : "";
                                    if (l.startsWith$default(strTrimSubstring2, "\"", false, 2, null) && l.endsWith$default(strTrimSubstring2, "\"", false, 2, null)) {
                                        strTrimSubstring2 = strTrimSubstring2.substring(1, strTrimSubstring2.length() - 1);
                                        Intrinsics.checkNotNullExpressionValue(strTrimSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    }
                                    arrayList2.add(new Cookie.Builder().name(strTrimSubstring).value(strTrimSubstring2).domain(url.host()).build());
                                }
                                i10 = iDelimiterOffset + 1;
                            }
                            arrayList.addAll(arrayList2);
                        }
                    }
                }
            }
            if (arrayList == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        } catch (IOException e5) {
            Platform platform = Platform.INSTANCE.get();
            StringBuilder sb2 = new StringBuilder("Loading cookies failed for ");
            HttpUrl httpUrlResolve = url.resolve("/...");
            Intrinsics.checkNotNull(httpUrlResolve);
            sb2.append(httpUrlResolve);
            platform.log(sb2.toString(), 5, e5);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(@NotNull HttpUrl url, @NotNull List<Cookie> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        ArrayList arrayList = new ArrayList();
        Iterator<Cookie> it = cookies.iterator();
        while (it.hasNext()) {
            arrayList.add(Internal.cookieToString(it.next(), true));
        }
        try {
            this.f85574a.put(url.uri(), p.mapOf(TuplesKt.to("Set-Cookie", arrayList)));
        } catch (IOException e5) {
            Platform platform = Platform.INSTANCE.get();
            StringBuilder sb2 = new StringBuilder("Saving cookies failed for ");
            HttpUrl httpUrlResolve = url.resolve("/...");
            Intrinsics.checkNotNull(httpUrlResolve);
            sb2.append(httpUrlResolve);
            platform.log(sb2.toString(), 5, e5);
        }
    }
}

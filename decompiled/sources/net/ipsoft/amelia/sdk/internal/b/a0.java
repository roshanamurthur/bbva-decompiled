package net.ipsoft.amelia.sdk.internal.b;

import android.net.Uri;
import android.webkit.CookieManager;
import java.net.HttpCookie;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 {
    public static void a(String str, String str2) {
        if (str2 != null) {
            for (HttpCookie httpCookie : HttpCookie.parse(str2)) {
                if ("amelia_s".equals(httpCookie.getName())) {
                    httpCookie.setDomain(Uri.parse(str).getHost());
                    httpCookie.setPath("/Amelia");
                    CookieManager.getInstance().setCookie(httpCookie.getDomain(), httpCookie.getName() + "=" + httpCookie.getValue() + "; Domain=" + httpCookie.getDomain());
                    CookieManager.getInstance().flush();
                }
            }
        }
    }
}

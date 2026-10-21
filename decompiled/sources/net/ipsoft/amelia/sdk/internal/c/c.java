package net.ipsoft.amelia.sdk.internal.c;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes12.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f84796a = "accept-version";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f84797b = "content-length";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f84798c = "content-type";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f84799d = "id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f84800e = "destination";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f84801f = "ack";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f84802g = "subscription";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f84803h = "message-id";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f84804i = "transaction";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f84805j = "receipt";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f84806k = "receipt-id";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f84807l = "message";
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f84808n;

    public c(String str, String str2) {
        this.m = str;
        this.f84808n = str2;
    }

    public static c b(String str) {
        return new c(f84798c, str);
    }

    public static c c(String str) {
        return new c("id", str);
    }

    public static c d(String str) {
        return new c("destination", str);
    }

    public static c e(String str) {
        return new c(f84801f, str);
    }

    public static c f(String str) {
        return new c(f84802g, str);
    }

    public static c g(String str) {
        return new c(f84803h, str);
    }

    public static c h(String str) {
        return new c("transaction", str);
    }

    public static c i(String str) {
        return new c(f84805j, str);
    }

    public static c j(String str) {
        return new c(f84806k, str);
    }

    public static c k(String str) {
        return new c("message", str);
    }

    public static c l(String str) throws a {
        String[] strArrSplit = str.split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, 2);
        if (strArrSplit.length == 2) {
            return new c(strArrSplit[0].replace("\\", "\\\\").replace(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, "\\c").replace(RootService.LINE_BREAK, "\\n"), strArrSplit[1].replace("\\", "\\\\").replace(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, "\\c").replace(RootService.LINE_BREAK, "\\n"));
        }
        throw new a("Unable to parse stomp header: ".concat(str));
    }

    public String a() {
        return this.m.replace("\\", "\\\\").replace(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, "\\c").replace(RootService.LINE_BREAK, "\\n") + AbstractJsonLexerKt.COLON + this.f84808n.replace("\\", "\\\\").replace(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, "\\c").replace(RootService.LINE_BREAK, "\\n");
    }

    public boolean b() {
        return f84797b.equals(this.m);
    }

    public static c a(int i10) {
        return new c(f84797b, String.valueOf(i10));
    }

    public static c a(String str) {
        return new c(f84796a, str);
    }
}

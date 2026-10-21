package androidx.core.net;

import ad.d;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class UriCompat {
    @NonNull
    public static String toSafeString(@NonNull Uri uri) {
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase("mailto") || scheme.equalsIgnoreCase("nfc")) {
                StringBuilder sb2 = new StringBuilder(64);
                sb2.append(scheme);
                sb2.append(AbstractJsonLexerKt.COLON);
                if (schemeSpecificPart != null) {
                    for (int i10 = 0; i10 < schemeSpecificPart.length(); i10++) {
                        char cCharAt = schemeSpecificPart.charAt(i10);
                        if (cCharAt == '-' || cCharAt == '@' || cCharAt == '.') {
                            sb2.append(cCharAt);
                        } else {
                            sb2.append('x');
                        }
                    }
                }
                return sb2.toString();
            }
            if (scheme.equalsIgnoreCase(ProxyConfig.MATCH_HTTP) || scheme.equalsIgnoreCase(ProxyConfig.MATCH_HTTPS) || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                StringBuilder sb3 = new StringBuilder("//");
                sb3.append(uri.getHost() != null ? uri.getHost() : "");
                schemeSpecificPart = d.f(sb3, uri.getPort() != -1 ? DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + uri.getPort() : "", "/...");
            }
        }
        StringBuilder sb4 = new StringBuilder(64);
        if (scheme != null) {
            sb4.append(scheme);
            sb4.append(AbstractJsonLexerKt.COLON);
        }
        if (schemeSpecificPart != null) {
            sb4.append(schemeSpecificPart);
        }
        return sb4.toString();
    }
}

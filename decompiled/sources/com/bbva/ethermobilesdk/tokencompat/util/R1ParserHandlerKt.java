package com.bbva.ethermobilesdk.tokencompat.util;

import androidx.collection.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: R1ParserHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¨\u0006\u0006"}, d2 = {"createR1EnrollRequest", "", "origin", "authCodeHash", "enc256", "salt", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class R1ParserHandlerKt {
    @NotNull
    public static final String createR1EnrollRequest(@NotNull String origin, @NotNull String authCodeHash, @NotNull String enc256, @NotNull String salt) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(authCodeHash, "authCodeHash");
        Intrinsics.checkNotNullParameter(enc256, "enc256");
        Intrinsics.checkNotNullParameter(salt, "salt");
        StringBuilder sb2 = new StringBuilder("\n       <soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ser=\"http://service.tokensoft.js.ks.grupobbva.com\">\n       <soapenv:Header/>\n       <soapenv:Body>\n          <ser:enroll>\n             <parametroSTS>\n                <ParametroSTS>\n                   <codParametroSTS>ORIGEN</codParametroSTS>\n                   <valorParametroSTS>");
        k.e(sb2, origin, "</valorParametroSTS>\n                </ParametroSTS>\n                <ParametroSTS>\n                   <codParametroSTS>ENC256</codParametroSTS>\n                   <valorParametroSTS>", enc256, "</valorParametroSTS>\n                </ParametroSTS>\n                <ParametroSTS>\n                   <codParametroSTS>AUTHCODEHash</codParametroSTS>\n                   <valorParametroSTS>");
        sb2.append(authCodeHash);
        sb2.append("</valorParametroSTS>\n                </ParametroSTS>\n                <ParametroSTS>\n                   <codParametroSTS>SALT</codParametroSTS>\n                   <valorParametroSTS>");
        sb2.append(salt);
        sb2.append("</valorParametroSTS>\n                </ParametroSTS>\n             </parametroSTS>\n          </ser:enroll>\n       </soapenv:Body>\n    </soapenv:Envelope>\n    ");
        return e.trimIndent(sb2.toString());
    }
}

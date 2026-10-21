package net.ipsoft.amelia.sdk.internal.c;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import net.ipsoft.amelia.sdk.internal.common.ALog;

/* JADX INFO: loaded from: classes12.dex */
public class f {
    public String a(b bVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bVar.f84786a);
        sb2.append('\n');
        Iterator<c> it = bVar.f84787b.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().a());
            sb2.append('\n');
        }
        sb2.append('\n');
        String str = bVar.f84788c;
        if (str != null) {
            sb2.append(str);
        }
        sb2.append((char) 0);
        String string = sb2.toString();
        ALog.d(ALog.TAG_AMELIA, "out:\n" + string);
        return string;
    }

    public b b(String str) throws a {
        b.a aVar = new b.a();
        String[] strArrSplit = str.split(RootService.LINE_BREAK);
        if (strArrSplit.length < 3) {
            throw new a(androidx.appcompat.widget.a.c(new StringBuilder("Invalid stomp frame, too few lines ("), strArrSplit.length, " lines)."));
        }
        try {
            String str2 = strArrSplit[0];
            str2.getClass();
            str2.hashCode();
            int i10 = 2;
            int iIntValue = -1;
            switch (str2) {
                case "CONNECTED":
                case "UNSUBSCRIBE":
                case "SUBSCRIBE":
                case "ACK":
                case "NACK":
                case "ABORT":
                case "BEGIN":
                case "ERROR":
                case "DISCONNECT":
                case "CONNECT":
                case "MESSAGE":
                case "RECEIPT":
                case "COMMIT":
                    aVar.a(str2);
                    String str3 = strArrSplit[1];
                    while (!str3.isEmpty()) {
                        c cVarL = c.l(str3);
                        if (cVarL.b()) {
                            iIntValue = Integer.valueOf(cVarL.f84808n).intValue();
                        }
                        aVar.a(cVarL);
                        String str4 = strArrSplit[i10];
                        i10++;
                        str3 = str4;
                    }
                    if (iIntValue >= 0) {
                        StringBuilder sb2 = new StringBuilder();
                        while (i10 < strArrSplit.length) {
                            sb2.append(strArrSplit[i10]);
                            i10++;
                        }
                        String string = sb2.toString();
                        Charset charset = StandardCharsets.UTF_8;
                        aVar.b(new String(Arrays.copyOf(string.getBytes(charset), iIntValue), charset));
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        while (true) {
                            int i11 = i10 + 1;
                            String str5 = strArrSplit[i10];
                            sb3.append(str5);
                            if (str5.charAt(str5.length() - 1) == 0) {
                                aVar.b(sb3.toString());
                            } else {
                                i10 = i11;
                            }
                        }
                    }
                    return aVar.a();
                default:
                    throw new a("Invalid stomp command: ".concat(str2));
            }
        } catch (Exception e5) {
            throw new a("Unable to parse frame.", e5);
        }
    }

    public e a(String str) {
        return RootService.LINE_BREAK.equals(str) ? new d() : b(str);
    }
}

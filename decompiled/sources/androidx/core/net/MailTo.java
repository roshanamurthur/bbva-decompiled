package androidx.core.net;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
public final class MailTo {
    public static final String MAILTO_SCHEME = "mailto:";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, String> f19991a = new HashMap<>();

    public static boolean isMailTo(@Nullable String str) {
        return str != null && str.startsWith(MAILTO_SCHEME);
    }

    @NonNull
    public static MailTo parse(@NonNull String str) throws ParseException {
        String strDecode;
        String strSubstring;
        Preconditions.checkNotNull(str);
        if (!isMailTo(str)) {
            throw new ParseException();
        }
        int iIndexOf = str.indexOf(35);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iIndexOf2 = str.indexOf(63);
        if (iIndexOf2 == -1) {
            strDecode = Uri.decode(str.substring(7));
            strSubstring = null;
        } else {
            strDecode = Uri.decode(str.substring(7, iIndexOf2));
            strSubstring = str.substring(iIndexOf2 + 1);
        }
        MailTo mailTo = new MailTo();
        HashMap<String, String> map = mailTo.f19991a;
        if (strSubstring != null) {
            for (String str2 : strSubstring.split("&")) {
                String[] strArrSplit = str2.split("=", 2);
                if (strArrSplit.length != 0) {
                    map.put(Uri.decode(strArrSplit[0]).toLowerCase(Locale.ROOT), strArrSplit.length > 1 ? Uri.decode(strArrSplit[1]) : null);
                }
            }
        }
        String to = mailTo.getTo();
        if (to != null) {
            strDecode = a.b(strDecode, ", ", to);
        }
        map.put(TypedValues.TransitionType.S_TO, strDecode);
        return mailTo;
    }

    @Nullable
    public String getBcc() {
        return this.f19991a.get("bcc");
    }

    @Nullable
    public String getBody() {
        return this.f19991a.get("body");
    }

    @Nullable
    public String getCc() {
        return this.f19991a.get("cc");
    }

    @Nullable
    public Map<String, String> getHeaders() {
        return this.f19991a;
    }

    @Nullable
    public String getSubject() {
        return this.f19991a.get("subject");
    }

    @Nullable
    public String getTo() {
        return this.f19991a.get(TypedValues.TransitionType.S_TO);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("mailto:?");
        for (Map.Entry<String, String> entry : this.f19991a.entrySet()) {
            sb2.append(Uri.encode(entry.getKey()));
            sb2.append('=');
            sb2.append(Uri.encode(entry.getValue()));
            sb2.append(Typography.amp);
        }
        return sb2.toString();
    }

    public static boolean isMailTo(@Nullable Uri uri) {
        return uri != null && "mailto".equals(uri.getScheme());
    }

    @NonNull
    public static MailTo parse(@NonNull Uri uri) throws ParseException {
        return parse(uri.toString());
    }
}

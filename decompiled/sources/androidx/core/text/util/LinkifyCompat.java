package androidx.core.text.util;

import ad.d;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.utils.c;
import androidx.core.net.MailTo;
import androidx.core.util.PatternsCompat;
import com.bbva.cellscore.helper.WebHelperKt;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class LinkifyCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f20145a = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n2.b f20146b = new n2.b();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface LinkifyMask {
    }

    @RequiresApi(24)
    public static class a {
        @DoNotInline
        public static void a(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        @DoNotInline
        public static boolean b(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public URLSpan f20147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20150d;
    }

    public static void a(@NonNull TextView textView) {
        if ((textView.getMovementMethod() instanceof LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static boolean addLinks(@NonNull Spannable spannable, int i10) {
        int i11;
        int i12;
        int i13;
        int iIndexOf;
        if (e()) {
            return Linkify.addLinks(spannable, i10);
        }
        if (i10 == 0) {
            return false;
        }
        Object[] objArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = objArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(objArr[length]);
        }
        if ((i10 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList<b> arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            c(arrayList, spannable, PatternsCompat.AUTOLINK_WEB_URL, new String[]{"http://", WebHelperKt.HTTPS_PROTOCOL, "rtsp://"}, Linkify.sUrlMatchFilter);
        }
        if ((i10 & 2) != 0) {
            c(arrayList, spannable, PatternsCompat.AUTOLINK_EMAIL_ADDRESS, new String[]{MailTo.MAILTO_SCHEME}, null);
        }
        if ((i10 & 8) != 0) {
            String string = spannable.toString();
            int i14 = 0;
            while (true) {
                try {
                    String strB = b(string);
                    if (strB == null || (iIndexOf = string.indexOf(strB)) < 0) {
                        break;
                        break;
                    }
                    b bVar = new b();
                    int length2 = strB.length() + iIndexOf;
                    bVar.f20149c = iIndexOf + i14;
                    i14 += length2;
                    bVar.f20150d = i14;
                    string = string.substring(length2);
                    try {
                        bVar.f20148b = "geo:0,0?q=" + URLEncoder.encode(strB, "UTF-8");
                        arrayList.add(bVar);
                    } catch (UnsupportedEncodingException unused) {
                    }
                } catch (UnsupportedOperationException unused2) {
                }
            }
        }
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            b bVar2 = new b();
            bVar2.f20147a = uRLSpan;
            bVar2.f20149c = spannable.getSpanStart(uRLSpan);
            bVar2.f20150d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(bVar2);
        }
        Collections.sort(arrayList, f20146b);
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size - 1) {
            b bVar3 = (b) arrayList.get(i15);
            int i16 = i15 + 1;
            b bVar4 = (b) arrayList.get(i16);
            int i17 = bVar3.f20149c;
            int i18 = bVar4.f20149c;
            if (i17 <= i18 && (i11 = bVar3.f20150d) > i18) {
                int i19 = bVar4.f20150d;
                int i20 = (i19 > i11 && (i12 = i11 - i17) <= (i13 = i19 - i18)) ? i12 < i13 ? i15 : -1 : i16;
                if (i20 != -1) {
                    Object obj = ((b) arrayList.get(i20)).f20147a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i20);
                    size--;
                }
            }
            i15 = i16;
        }
        if (arrayList.size() == 0) {
            return false;
        }
        for (b bVar5 : arrayList) {
            if (bVar5.f20147a == null) {
                spannable.setSpan(new URLSpan(bVar5.f20148b), bVar5.f20149c, bVar5.f20150d, 33);
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0102  */
    public static String b(String str) {
        int iEnd;
        int length;
        int i10;
        MatchResult matchResult;
        MatchResult matchResult2;
        int i11;
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.findAddress(str);
        }
        Pattern pattern = n2.a.f84405c;
        Matcher matcher = pattern.matcher(str);
        int i12 = 0;
        int iEnd2 = 0;
        while (matcher.find(iEnd2)) {
            if (n2.a.a(matcher.group(i12))) {
                int iStart = matcher.start();
                int iEnd3 = matcher.end();
                Pattern pattern2 = n2.a.f84404b;
                Matcher matcher2 = pattern2.matcher(str);
                String strGroup = "";
                int i13 = i12;
                int i14 = -1;
                int iEnd4 = -1;
                int i15 = 1;
                int i16 = 1;
                boolean z10 = true;
                while (true) {
                    if (iEnd3 < str.length()) {
                        if (matcher2.find(iEnd3)) {
                            if (matcher2.end() - matcher2.start() > 25) {
                                length = matcher2.end();
                            } else {
                                while (iEnd3 < matcher2.start()) {
                                    int i17 = iEnd3 + 1;
                                    if ("\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(iEnd3)) != -1) {
                                        i15++;
                                    }
                                    iEnd3 = i17;
                                }
                                if (i15 <= 5 && (i16 = i16 + 1) <= 14) {
                                    if (iEnd3 <= 0 || ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(iEnd3 - 1)) != -1) {
                                        Matcher matcherRegion = pattern.matcher(str).region(iEnd3, str.length());
                                        if (matcherRegion.lookingAt()) {
                                            matchResult = matcherRegion.toMatchResult();
                                            if (!n2.a.a(matchResult.group(0))) {
                                                matchResult = null;
                                            }
                                        } else {
                                            matchResult = null;
                                        }
                                    } else {
                                        matchResult = null;
                                    }
                                    if (matchResult == null) {
                                        if (n2.a.f84407e.matcher(matcher2.group(0)).matches()) {
                                            i13 = 1;
                                        } else if (i16 == 5 && i13 == 0) {
                                            iEnd3 = matcher2.end();
                                        } else if (i13 != 0 && i16 > 4) {
                                            if (iEnd3 <= 0 || ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(iEnd3 - 1)) != -1) {
                                                Matcher matcherRegion2 = n2.a.f84406d.matcher(str).region(iEnd3, str.length());
                                                if (matcherRegion2.lookingAt()) {
                                                    matchResult2 = matcherRegion2.toMatchResult();
                                                } else {
                                                    matchResult2 = null;
                                                }
                                            } else {
                                                matchResult2 = null;
                                            }
                                            if (matchResult2 != null) {
                                                if (strGroup.equals("et") && matchResult2.group(0).equals("al")) {
                                                    iEnd3 = matchResult2.end();
                                                } else {
                                                    Matcher matcher3 = pattern2.matcher(str);
                                                    if (matcher3.find(matchResult2.end())) {
                                                        String strGroup2 = matcher3.group(0);
                                                        int iGroupCount = matchResult2.groupCount();
                                                        while (iGroupCount > 0) {
                                                            int i18 = iGroupCount - 1;
                                                            if (matchResult2.group(iGroupCount) != null) {
                                                                iGroupCount = i18;
                                                                break;
                                                            }
                                                            iGroupCount = i18;
                                                        }
                                                        if (n2.a.f84409g.matcher(strGroup2).matches()) {
                                                            n2.a.C0468a c0468a = n2.a.f84403a[iGroupCount];
                                                            c0468a.getClass();
                                                            int i19 = Integer.parseInt(strGroup2.substring(0, 2));
                                                            if ((c0468a.f84410a <= i19 && i19 <= c0468a.f84411b) || i19 == c0468a.f84412c || i19 == c0468a.f84413d) {
                                                                iEnd = matcher3.end();
                                                            }
                                                        }
                                                    } else {
                                                        iEnd4 = matchResult2.end();
                                                    }
                                                }
                                            }
                                        }
                                        i11 = 0;
                                        z10 = false;
                                    } else if (!z10 || i15 <= 1) {
                                        if (i14 == -1) {
                                            i14 = iEnd3;
                                        }
                                        i11 = 0;
                                    } else {
                                        i10 = -iEnd3;
                                        iEnd = i10;
                                    }
                                    strGroup = matcher2.group(i11);
                                    iEnd3 = matcher2.end();
                                }
                            }
                            i12 = 0;
                            if (iEnd > 0) {
                                return str.substring(iStart, iEnd);
                            }
                            iEnd2 = -iEnd;
                        } else {
                            length = str.length();
                        }
                        i10 = -length;
                        iEnd = i10;
                        i12 = 0;
                        if (iEnd > 0) {
                            return str.substring(iStart, iEnd);
                        }
                        iEnd2 = -iEnd;
                    }
                    i12 = 0;
                    if (iEnd4 > 0) {
                        iEnd = iEnd4;
                    } else {
                        if (i14 <= 0) {
                            i14 = iEnd3;
                        }
                        iEnd = -i14;
                    }
                    if (iEnd > 0) {
                        return str.substring(iStart, iEnd);
                    }
                    iEnd2 = -iEnd;
                }
            } else {
                iEnd2 = matcher.end();
            }
        }
        return null;
    }

    public static void c(ArrayList arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                if (strGroup != null) {
                    b bVar = new b();
                    bVar.f20148b = d(strGroup, strArr, matcher, null);
                    bVar.f20149c = iStart;
                    bVar.f20150d = iEnd;
                    arrayList.add(bVar);
                }
            }
        }
    }

    public static String d(@NonNull String str, @NonNull String[] strArr, Matcher matcher, @Nullable Linkify.TransformFilter transformFilter) {
        boolean z10;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            String str2 = strArr[i10];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                z10 = true;
                if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                    StringBuilder sbD = c.d(str2);
                    sbD.append(str.substring(str2.length()));
                    str = sbD.toString();
                    break;
                }
                break;
            }
            i10++;
        }
        return (z10 || strArr.length <= 0) ? str : d.f(new StringBuilder(), strArr[0], str);
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean addLinks(@NonNull TextView textView, int i10) {
        if (e()) {
            return Linkify.addLinks(textView, i10);
        }
        if (i10 == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            if (addLinks((Spannable) text, i10)) {
                a(textView);
                return true;
            }
        } else {
            SpannableString spannableStringValueOf = SpannableString.valueOf(text);
            if (addLinks(spannableStringValueOf, i10)) {
                a(textView);
                textView.setText(spannableStringValueOf);
                return true;
            }
        }
        return false;
    }

    public static void addLinks(@NonNull TextView textView, @NonNull Pattern pattern, @Nullable String str) {
        if (e()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            addLinks(textView, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
        }
    }

    public static void addLinks(@NonNull TextView textView, @NonNull Pattern pattern, @Nullable String str, @Nullable Linkify.MatchFilter matchFilter, @Nullable Linkify.TransformFilter transformFilter) {
        if (e()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            addLinks(textView, pattern, str, (String[]) null, matchFilter, transformFilter);
        }
    }

    public static void addLinks(@NonNull TextView textView, @NonNull Pattern pattern, @Nullable String str, @Nullable String[] strArr, @Nullable Linkify.MatchFilter matchFilter, @Nullable Linkify.TransformFilter transformFilter) {
        if (e()) {
            a.a(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(textView.getText());
        if (addLinks(spannableStringValueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(spannableStringValueOf);
            a(textView);
        }
    }

    public static boolean addLinks(@NonNull Spannable spannable, @NonNull Pattern pattern, @Nullable String str) {
        if (e()) {
            return Linkify.addLinks(spannable, pattern, str);
        }
        return addLinks(spannable, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
    }

    public static boolean addLinks(@NonNull Spannable spannable, @NonNull Pattern pattern, @Nullable String str, @Nullable Linkify.MatchFilter matchFilter, @Nullable Linkify.TransformFilter transformFilter) {
        if (e()) {
            return Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter);
        }
        return addLinks(spannable, pattern, str, (String[]) null, matchFilter, transformFilter);
    }

    public static boolean addLinks(@NonNull Spannable spannable, @NonNull Pattern pattern, @Nullable String str, @Nullable String[] strArr, @Nullable Linkify.MatchFilter matchFilter, @Nullable Linkify.TransformFilter transformFilter) {
        if (e()) {
            return a.b(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f20145a;
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i10 = 0;
        while (i10 < strArr.length) {
            String str2 = strArr[i10];
            i10++;
            strArr2[i10] = str2 == null ? "" : str2.toLowerCase(Locale.ROOT);
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z10 = false;
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                if (strGroup != null) {
                    spannable.setSpan(new URLSpan(d(strGroup, strArr2, matcher, transformFilter)), iStart, iEnd, 33);
                    z10 = true;
                }
            }
        }
        return z10;
    }
}

package javax.mail.internet;

import ad.d;
import androidx.collection.j;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.PropUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.mail.Header;
import javax.mail.MessagingException;

/* JADX INFO: loaded from: classes12.dex */
public class InternetHeaders {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f78970a = PropUtil.getBooleanSystemProperty("mail.mime.ignorewhitespacelines", false);
    protected List<InternetHeader> headers;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<InternetHeader> f78972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f78973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f78974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f78975d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InternetHeader f78976e = null;

        public a(List<InternetHeader> list, String[] strArr, boolean z10, boolean z11) {
            this.f78972a = list.iterator();
            this.f78973b = strArr;
            this.f78974c = z10;
            this.f78975d = z11;
        }

        public final InternetHeader a() {
            while (true) {
                Iterator<InternetHeader> it = this.f78972a;
                if (!it.hasNext()) {
                    return null;
                }
                InternetHeader next = it.next();
                if (next.f78971a != null) {
                    String[] strArr = this.f78973b;
                    boolean z10 = this.f78974c;
                    if (strArr != null) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= strArr.length) {
                                if (z10) {
                                    break;
                                }
                                return next;
                            }
                            if (strArr[i10].equalsIgnoreCase(next.getName())) {
                                if (!z10) {
                                    break;
                                }
                                return next;
                            }
                            i10++;
                        }
                    } else {
                        if (z10) {
                            return null;
                        }
                        return next;
                    }
                }
            }
        }

        public final boolean hasMoreElements() {
            if (this.f78976e == null) {
                this.f78976e = a();
            }
            return this.f78976e != null;
        }

        public Object nextElement() {
            if (this.f78976e == null) {
                this.f78976e = a();
            }
            InternetHeader internetHeader = this.f78976e;
            if (internetHeader == null) {
                throw new NoSuchElementException("No more headers");
            }
            this.f78976e = null;
            return this.f78975d ? internetHeader.f78971a : new Header(internetHeader.getName(), internetHeader.getValue());
        }
    }

    public static class b extends a implements Enumeration<Header> {
        @Override // javax.mail.internet.InternetHeaders.a, java.util.Enumeration
        public final Object nextElement() {
            return (Header) super.nextElement();
        }
    }

    public static class c extends a implements Enumeration<String> {
        @Override // javax.mail.internet.InternetHeaders.a, java.util.Enumeration
        public final Object nextElement() {
            return (String) super.nextElement();
        }
    }

    public InternetHeaders() {
        ArrayList arrayList = new ArrayList(40);
        this.headers = arrayList;
        arrayList.add(new InternetHeader("Return-Path", null));
        j.c("Received", null, this.headers);
        j.c("Resent-Date", null, this.headers);
        j.c("Resent-From", null, this.headers);
        j.c("Resent-Sender", null, this.headers);
        j.c("Resent-To", null, this.headers);
        j.c("Resent-Cc", null, this.headers);
        j.c("Resent-Bcc", null, this.headers);
        j.c("Resent-Message-Id", null, this.headers);
        j.c("Date", null, this.headers);
        j.c("From", null, this.headers);
        j.c("Sender", null, this.headers);
        j.c("Reply-To", null, this.headers);
        j.c("To", null, this.headers);
        j.c("Cc", null, this.headers);
        j.c("Bcc", null, this.headers);
        j.c("Message-Id", null, this.headers);
        j.c("In-Reply-To", null, this.headers);
        j.c("References", null, this.headers);
        j.c("Subject", null, this.headers);
        j.c("Comments", null, this.headers);
        j.c("Keywords", null, this.headers);
        j.c("Errors-To", null, this.headers);
        j.c("MIME-Version", null, this.headers);
        j.c(DigipassManagerConstants.KEY_CONTENT_TYPE, null, this.headers);
        j.c("Content-Transfer-Encoding", null, this.headers);
        j.c("Content-MD5", null, this.headers);
        j.c(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, null, this.headers);
        j.c("Content-Length", null, this.headers);
        j.c("Status", null, this.headers);
    }

    public void addHeader(String str, String str2) {
        int size = this.headers.size();
        boolean z10 = str.equalsIgnoreCase("Received") || str.equalsIgnoreCase("Return-Path");
        if (z10) {
            size = 0;
        }
        for (int size2 = this.headers.size() - 1; size2 >= 0; size2--) {
            InternetHeader internetHeader = this.headers.get(size2);
            if (str.equalsIgnoreCase(internetHeader.getName())) {
                if (!z10) {
                    this.headers.add(size2 + 1, new InternetHeader(str, str2));
                    return;
                }
                size = size2;
            }
            if (!z10 && internetHeader.getName().equals(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER)) {
                size = size2;
            }
        }
        this.headers.add(size, new InternetHeader(str, str2));
    }

    public void addHeaderLine(String str) {
        try {
            char cCharAt = str.charAt(0);
            if (cCharAt == ' ' || cCharAt == '\t') {
                List<InternetHeader> list = this.headers;
                list.get(list.size() - 1).f78971a += "\r\n" + str;
            } else {
                this.headers.add(new InternetHeader(str));
            }
        } catch (StringIndexOutOfBoundsException | NoSuchElementException unused) {
        }
    }

    public Enumeration<String> getAllHeaderLines() {
        return getNonMatchingHeaderLines(null);
    }

    public Enumeration<Header> getAllHeaders() {
        return new b(this.headers, null, false, false);
    }

    public String[] getHeader(String str) {
        ArrayList arrayList = new ArrayList();
        for (InternetHeader internetHeader : this.headers) {
            if (str.equalsIgnoreCase(internetHeader.getName()) && internetHeader.f78971a != null) {
                arrayList.add(internetHeader.getValue());
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public Enumeration<String> getMatchingHeaderLines(String[] strArr) {
        return new c(this.headers, strArr, true, true);
    }

    public Enumeration<Header> getMatchingHeaders(String[] strArr) {
        return new b(this.headers, strArr, true, false);
    }

    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) {
        return new c(this.headers, strArr, false, true);
    }

    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) {
        return new b(this.headers, strArr, false, false);
    }

    public void load(InputStream inputStream) throws MessagingException {
        load(inputStream, false);
    }

    public void removeHeader(String str) {
        for (int i10 = 0; i10 < this.headers.size(); i10++) {
            InternetHeader internetHeader = this.headers.get(i10);
            if (str.equalsIgnoreCase(internetHeader.getName())) {
                internetHeader.f78971a = null;
            }
        }
    }

    public void setHeader(String str, String str2) {
        int iIndexOf;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.headers.size()) {
            InternetHeader internetHeader = this.headers.get(i10);
            if (str.equalsIgnoreCase(internetHeader.getName())) {
                if (z10) {
                    this.headers.remove(i10);
                    i10--;
                } else {
                    String str3 = internetHeader.f78971a;
                    if (str3 == null || (iIndexOf = str3.indexOf(58)) < 0) {
                        internetHeader.f78971a = androidx.camera.core.impl.utils.a.b(str, ": ", str2);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(internetHeader.f78971a.substring(0, iIndexOf + 1));
                        internetHeader.f78971a = d.f(sb2, " ", str2);
                    }
                    z10 = true;
                }
            }
            i10++;
        }
        if (z10) {
            return;
        }
        addHeader(str, str2);
    }

    public void load(InputStream inputStream, boolean z10) throws MessagingException {
        LineInputStream lineInputStream = new LineInputStream(inputStream, z10);
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        String str = null;
        while (true) {
            try {
                String line = lineInputStream.readLine();
                if (line == null || !(line.startsWith(" ") || line.startsWith("\t"))) {
                    if (str != null) {
                        addHeaderLine(str);
                    } else if (sb2.length() > 0) {
                        addHeaderLine(sb2.toString());
                        sb2.setLength(0);
                    }
                    str = line;
                } else {
                    if (str != null) {
                        sb2.append(str);
                        str = null;
                    }
                    if (z11) {
                        String strTrim = line.trim();
                        if (strTrim.length() > 0) {
                            sb2.append(strTrim);
                        }
                    } else {
                        if (sb2.length() > 0) {
                            sb2.append("\r\n");
                        }
                        sb2.append(line);
                    }
                }
                if (line == null || line.length() == 0) {
                    return;
                }
                if (f78970a && line.trim().length() == 0) {
                    return;
                } else {
                    z11 = false;
                }
            } catch (IOException e5) {
                throw new MessagingException("Error in input stream", e5);
            }
        }
    }

    public static final class InternetHeader extends Header {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f78971a;

        public InternetHeader(String str) {
            super("", "");
            int iIndexOf = str.indexOf(58);
            if (iIndexOf < 0) {
                this.name = str.trim();
            } else {
                this.name = str.substring(0, iIndexOf).trim();
            }
            this.f78971a = str;
        }

        @Override // javax.mail.Header
        public String getValue() {
            char cCharAt;
            int iIndexOf = this.f78971a.indexOf(58);
            if (iIndexOf < 0) {
                return this.f78971a;
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= this.f78971a.length() || ((cCharAt = this.f78971a.charAt(iIndexOf)) != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n')) {
                    break;
                }
            }
            return this.f78971a.substring(iIndexOf);
        }

        public InternetHeader(String str, String str2) {
            super(str, "");
            if (str2 != null) {
                this.f78971a = androidx.camera.core.impl.utils.a.b(str, ": ", str2);
            } else {
                this.f78971a = null;
            }
        }
    }

    public String getHeader(String str, String str2) {
        String[] header = getHeader(str);
        if (header == null) {
            return null;
        }
        if (header.length != 1 && str2 != null) {
            StringBuilder sb2 = new StringBuilder(header[0]);
            for (int i10 = 1; i10 < header.length; i10++) {
                sb2.append(str2);
                sb2.append(header[i10]);
            }
            return sb2.toString();
        }
        return header[0];
    }

    public InternetHeaders(InputStream inputStream) throws MessagingException {
        this(inputStream, false);
    }

    public InternetHeaders(InputStream inputStream, boolean z10) throws MessagingException {
        this.headers = new ArrayList(40);
        load(inputStream, z10);
    }
}

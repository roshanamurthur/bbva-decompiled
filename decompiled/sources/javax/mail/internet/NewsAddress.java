package javax.mail.internet;

import java.util.ArrayList;
import java.util.Locale;
import java.util.StringTokenizer;
import javax.mail.Address;

/* JADX INFO: loaded from: classes12.dex */
public class NewsAddress extends Address {
    protected String host;
    protected String newsgroup;

    public NewsAddress() {
    }

    public static NewsAddress[] parse(String str) throws AddressException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(new NewsAddress(stringTokenizer.nextToken()));
        }
        return (NewsAddress[]) arrayList.toArray(new NewsAddress[arrayList.size()]);
    }

    @Override // javax.mail.Address
    public boolean equals(Object obj) {
        String str;
        if (!(obj instanceof NewsAddress)) {
            return false;
        }
        NewsAddress newsAddress = (NewsAddress) obj;
        String str2 = this.newsgroup;
        if (!(str2 == null && newsAddress.newsgroup == null) && (str2 == null || !str2.equals(newsAddress.newsgroup))) {
            return false;
        }
        String str3 = this.host;
        return (str3 == null && newsAddress.host == null) || !(str3 == null || (str = newsAddress.host) == null || !str3.equalsIgnoreCase(str));
    }

    public String getHost() {
        return this.host;
    }

    public String getNewsgroup() {
        return this.newsgroup;
    }

    @Override // javax.mail.Address
    public String getType() {
        return "news";
    }

    public int hashCode() {
        String str = this.newsgroup;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.host;
        return str2 != null ? iHashCode + str2.toLowerCase(Locale.ENGLISH).hashCode() : iHashCode;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setNewsgroup(String str) {
        this.newsgroup = str;
    }

    @Override // javax.mail.Address
    public String toString() {
        return this.newsgroup;
    }

    public NewsAddress(String str) {
        this(str, null);
    }

    public static String toString(Address[] addressArr) {
        if (addressArr == null || addressArr.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(((NewsAddress) addressArr[0]).toString());
        int length = sb2.length();
        for (int i10 = 1; i10 < addressArr.length; i10++) {
            sb2.append(",");
            int i11 = length + 1;
            String string = ((NewsAddress) addressArr[i10]).toString();
            if (string.length() + i11 > 76) {
                sb2.append("\r\n\t");
                i11 = 8;
            }
            sb2.append(string);
            length = i11 + string.length();
        }
        return sb2.toString();
    }

    public NewsAddress(String str, String str2) {
        this.newsgroup = str.replaceAll("\\s+", "");
        this.host = str2;
    }
}

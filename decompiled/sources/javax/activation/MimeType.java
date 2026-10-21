package javax.activation;

import androidx.webkit.ProxyConfig;
import com.bbva.nativesettings.common.Constants;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class MimeType implements Externalizable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f78868p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f78869q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public MimeTypeParameterList f78870r0;

    public MimeType() {
        this.f78868p0 = Constants.APPLICATION;
        this.f78869q0 = ProxyConfig.MATCH_ALL_SCHEMES;
        this.f78870r0 = new MimeTypeParameterList();
    }

    public static boolean a(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= ' ' || cCharAt >= 127 || "()<>@,;:/[]?=\\\"".indexOf(cCharAt) >= 0) {
                return false;
            }
        }
        return true;
    }

    public final void b(String str) throws MimeTypeParseException {
        int iIndexOf = str.indexOf(47);
        int iIndexOf2 = str.indexOf(59);
        if (iIndexOf < 0 && iIndexOf2 < 0) {
            throw new MimeTypeParseException("Unable to find a sub type.");
        }
        if (iIndexOf < 0 && iIndexOf2 >= 0) {
            throw new MimeTypeParseException("Unable to find a sub type.");
        }
        if (iIndexOf >= 0 && iIndexOf2 < 0) {
            String strTrim = str.substring(0, iIndexOf).trim();
            Locale locale = Locale.ENGLISH;
            this.f78868p0 = strTrim.toLowerCase(locale);
            this.f78869q0 = str.substring(iIndexOf + 1).trim().toLowerCase(locale);
            this.f78870r0 = new MimeTypeParameterList();
        } else {
            if (iIndexOf >= iIndexOf2) {
                throw new MimeTypeParseException("Unable to find a sub type.");
            }
            String strTrim2 = str.substring(0, iIndexOf).trim();
            Locale locale2 = Locale.ENGLISH;
            this.f78868p0 = strTrim2.toLowerCase(locale2);
            this.f78869q0 = str.substring(iIndexOf + 1, iIndexOf2).trim().toLowerCase(locale2);
            this.f78870r0 = new MimeTypeParameterList(str.substring(iIndexOf2));
        }
        if (!a(this.f78868p0)) {
            throw new MimeTypeParseException("Primary type is invalid.");
        }
        if (!a(this.f78869q0)) {
            throw new MimeTypeParseException("Sub type is invalid.");
        }
    }

    public String getBaseType() {
        return this.f78868p0 + "/" + this.f78869q0;
    }

    public String getParameter(String str) {
        return this.f78870r0.get(str);
    }

    public MimeTypeParameterList getParameters() {
        return this.f78870r0;
    }

    public String getPrimaryType() {
        return this.f78868p0;
    }

    public String getSubType() {
        return this.f78869q0;
    }

    public boolean match(MimeType mimeType) {
        return this.f78868p0.equals(mimeType.getPrimaryType()) && (this.f78869q0.equals(ProxyConfig.MATCH_ALL_SCHEMES) || mimeType.getSubType().equals(ProxyConfig.MATCH_ALL_SCHEMES) || this.f78869q0.equals(mimeType.getSubType()));
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        try {
            b(objectInput.readUTF());
        } catch (MimeTypeParseException e5) {
            throw new IOException(e5.toString());
        }
    }

    public void removeParameter(String str) {
        this.f78870r0.remove(str);
    }

    public void setParameter(String str, String str2) {
        this.f78870r0.set(str, str2);
    }

    public void setPrimaryType(String str) throws MimeTypeParseException {
        if (!a(this.f78868p0)) {
            throw new MimeTypeParseException("Primary type is invalid.");
        }
        this.f78868p0 = str.toLowerCase(Locale.ENGLISH);
    }

    public void setSubType(String str) throws MimeTypeParseException {
        if (!a(this.f78869q0)) {
            throw new MimeTypeParseException("Sub type is invalid.");
        }
        this.f78869q0 = str.toLowerCase(Locale.ENGLISH);
    }

    public String toString() {
        return getBaseType() + this.f78870r0.toString();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(toString());
        objectOutput.flush();
    }

    public MimeType(String str) throws MimeTypeParseException {
        b(str);
    }

    public boolean match(String str) throws MimeTypeParseException {
        return match(new MimeType(str));
    }

    public MimeType(String str, String str2) throws MimeTypeParseException {
        if (a(str)) {
            Locale locale = Locale.ENGLISH;
            this.f78868p0 = str.toLowerCase(locale);
            if (a(str2)) {
                this.f78869q0 = str2.toLowerCase(locale);
                this.f78870r0 = new MimeTypeParameterList();
                return;
            }
            throw new MimeTypeParseException("Sub type is invalid.");
        }
        throw new MimeTypeParseException("Primary type is invalid.");
    }
}

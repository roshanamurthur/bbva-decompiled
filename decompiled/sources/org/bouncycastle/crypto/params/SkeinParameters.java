package org.bouncycastle.crypto.params;

import ad.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
public class SkeinParameters implements CipherParameters {
    public static final int PARAM_TYPE_CONFIG = 4;
    public static final int PARAM_TYPE_KEY = 0;
    public static final int PARAM_TYPE_KEY_IDENTIFIER = 16;
    public static final int PARAM_TYPE_MESSAGE = 48;
    public static final int PARAM_TYPE_NONCE = 20;
    public static final int PARAM_TYPE_OUTPUT = 63;
    public static final int PARAM_TYPE_PERSONALISATION = 8;
    public static final int PARAM_TYPE_PUBLIC_KEY = 12;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Hashtable f89383p0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Hashtable f89384a = new Hashtable();

        public Builder() {
        }

        public SkeinParameters build() {
            return new SkeinParameters(this.f89384a);
        }

        public Builder set(int i10, byte[] bArr) {
            if (bArr == null) {
                throw new IllegalArgumentException("Parameter value must not be null.");
            }
            if (i10 != 0 && (i10 < 4 || i10 >= 63 || i10 == 48)) {
                throw new IllegalArgumentException("Parameter types must be in the range 0,5..47,49..62.");
            }
            if (i10 == 4) {
                throw new IllegalArgumentException("Parameter type 4 is reserved for internal use.");
            }
            this.f89384a.put(Integers.valueOf(i10), bArr);
            return this;
        }

        public Builder setKey(byte[] bArr) {
            return set(0, bArr);
        }

        public Builder setKeyIdentifier(byte[] bArr) {
            return set(16, bArr);
        }

        public Builder setNonce(byte[] bArr) {
            return set(20, bArr);
        }

        public Builder setPersonalisation(Date date, String str, String str2) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, "UTF-8");
                outputStreamWriter.write(new SimpleDateFormat("YYYYMMDD").format(date));
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str);
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str2);
                outputStreamWriter.close();
                return set(8, byteArrayOutputStream.toByteArray());
            } catch (IOException e5) {
                throw new IllegalStateException(e.d("Byte I/O failed: ", e5));
            }
        }

        public Builder setPublicKey(byte[] bArr) {
            return set(12, bArr);
        }

        public Builder(Hashtable hashtable) {
            Enumeration enumerationKeys = hashtable.keys();
            while (enumerationKeys.hasMoreElements()) {
                Integer num = (Integer) enumerationKeys.nextElement();
                this.f89384a.put(num, hashtable.get(num));
            }
        }

        public Builder(SkeinParameters skeinParameters) {
            Enumeration enumerationKeys = skeinParameters.f89383p0.keys();
            while (enumerationKeys.hasMoreElements()) {
                Integer num = (Integer) enumerationKeys.nextElement();
                this.f89384a.put(num, skeinParameters.f89383p0.get(num));
            }
        }

        public Builder setPersonalisation(Date date, Locale locale, String str, String str2) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, "UTF-8");
                outputStreamWriter.write(new SimpleDateFormat("YYYYMMDD", locale).format(date));
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str);
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str2);
                outputStreamWriter.close();
                return set(8, byteArrayOutputStream.toByteArray());
            } catch (IOException e5) {
                throw new IllegalStateException(e.d("Byte I/O failed: ", e5));
            }
        }

        public Builder setPersonalisation(byte[] bArr) {
            return set(8, bArr);
        }
    }

    public SkeinParameters() {
        this(new Hashtable());
    }

    public byte[] getKey() {
        return (byte[]) this.f89383p0.get(Integers.valueOf(0));
    }

    public byte[] getKeyIdentifier() {
        return (byte[]) this.f89383p0.get(Integers.valueOf(16));
    }

    public byte[] getNonce() {
        return (byte[]) this.f89383p0.get(Integers.valueOf(20));
    }

    public Hashtable getParameters() {
        return this.f89383p0;
    }

    public byte[] getPersonalisation() {
        return (byte[]) this.f89383p0.get(Integers.valueOf(8));
    }

    public byte[] getPublicKey() {
        return (byte[]) this.f89383p0.get(Integers.valueOf(12));
    }

    public SkeinParameters(Hashtable hashtable) {
        this.f89383p0 = hashtable;
    }
}

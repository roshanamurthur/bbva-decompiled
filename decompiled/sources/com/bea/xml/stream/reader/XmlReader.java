package com.bea.xml.stream.reader;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.veridas.Veridas;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes9.dex */
public final class XmlReader extends Reader {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Hashtable f37889s0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Reader f37890p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f37891q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f37892r0;

    public static abstract class BaseReader extends Reader {
        protected byte[] buffer;
        protected int finish;
        protected InputStream instream;
        protected int start;

        public BaseReader(InputStream inputStream) {
            super(inputStream);
            this.instream = inputStream;
            this.buffer = new byte[8192];
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream inputStream = this.instream;
            if (inputStream != null) {
                inputStream.close();
                this.finish = 0;
                this.start = 0;
                this.buffer = null;
                this.instream = null;
            }
        }

        public abstract String getEncoding();

        @Override // java.io.Reader
        public boolean ready() throws IOException {
            InputStream inputStream = this.instream;
            return inputStream == null || this.finish - this.start > 0 || inputStream.available() != 0;
        }
    }

    public static final class a extends BaseReader {
        @Override // com.bea.xml.stream.reader.XmlReader.BaseReader
        public final String getEncoding() {
            return Veridas.US_ASCII;
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i10, int i11) throws IOException {
            InputStream inputStream = this.instream;
            if (inputStream == null) {
                return -1;
            }
            if (i10 + i11 > cArr.length || i10 < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.finish - this.start;
            if (i12 < 1) {
                this.start = 0;
                byte[] bArr = this.buffer;
                int i13 = inputStream.read(bArr, 0, bArr.length);
                this.finish = i13;
                if (i13 <= 0) {
                    close();
                    return -1;
                }
                if (i11 > i13) {
                    i11 = i13;
                }
            } else if (i11 > i12) {
                i11 = i12;
            }
            for (int i14 = 0; i14 < i11; i14++) {
                byte[] bArr2 = this.buffer;
                int i15 = this.start;
                this.start = i15 + 1;
                byte b10 = bArr2[i15];
                if (b10 < 0) {
                    StringBuffer stringBuffer = new StringBuffer("Illegal ASCII character, 0x");
                    stringBuffer.append(Integer.toHexString(b10 & 255));
                    throw new CharConversionException(stringBuffer.toString());
                }
                cArr[i10 + i14] = (char) b10;
            }
            return i11;
        }
    }

    public static final class b extends BaseReader {
        @Override // com.bea.xml.stream.reader.XmlReader.BaseReader
        public final String getEncoding() {
            return "ISO-8859-1";
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i10, int i11) throws IOException {
            InputStream inputStream = this.instream;
            if (inputStream == null) {
                return -1;
            }
            if (i10 + i11 > cArr.length || i10 < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.finish - this.start;
            if (i12 < 1) {
                this.start = 0;
                byte[] bArr = this.buffer;
                int i13 = inputStream.read(bArr, 0, bArr.length);
                this.finish = i13;
                if (i13 <= 0) {
                    close();
                    return -1;
                }
                if (i11 > i13) {
                    i11 = i13;
                }
            } else if (i11 > i12) {
                i11 = i12;
            }
            for (int i14 = 0; i14 < i11; i14++) {
                byte[] bArr2 = this.buffer;
                int i15 = this.start;
                this.start = i15 + 1;
                cArr[i10 + i14] = (char) (bArr2[i15] & 255);
            }
            return i11;
        }
    }

    public static final class c extends BaseReader {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public char f37893p0;

        @Override // com.bea.xml.stream.reader.XmlReader.BaseReader
        public final String getEncoding() {
            return "UTF-8";
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0155 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:101:0x0176 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:110:0x0160 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x012e  */
        /* JADX WARN: Code duplicated, block: B:67:0x0149  */
        /* JADX WARN: Code duplicated, block: B:69:0x0152 A[LOOP:1: B:65:0x0143->B:69:0x0152, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:74:0x016b A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:97:0x0140 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:98:0x0135 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:99:0x0111 A[SYNTHETIC] */
        @Override // java.io.Reader
        public final int read(char[] cArr, int i10, int i11) throws IOException {
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            byte b10;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            char c10;
            if (i11 <= 0) {
                return 0;
            }
            if (i10 + i11 > cArr.length || i10 < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            char c11 = this.f37893p0;
            if (c11 != 0) {
                cArr[i10] = c11;
                this.f37893p0 = (char) 0;
                i13 = 0;
                i12 = 1;
            } else {
                i12 = 0;
                i13 = 0;
            }
            while (i12 < i11) {
                if (this.finish <= this.start) {
                    InputStream inputStream = this.instream;
                    if (inputStream != null) {
                        this.start = 0;
                        byte[] bArr = this.buffer;
                        int i22 = inputStream.read(bArr, 0, bArr.length);
                        this.finish = i22;
                        if (i22 <= 0) {
                            close();
                        }
                    }
                    i13 = -1;
                    break;
                }
                byte[] bArr2 = this.buffer;
                int i23 = this.start;
                byte b11 = bArr2[i23];
                int i24 = b11 & 255;
                if ((b11 & 128) != 0) {
                    if ((b11 & 224) != 192) {
                        if ((b11 & Constants.CVR_B2b8765_1111_APP_DISABLED) == 224) {
                            int i25 = i23 + 2;
                            try {
                                i16 = ((b11 & 15) << 12) + ((bArr2[i23 + 1] & 63) << 6);
                                i14 = i23 + 3;
                                b10 = bArr2[i25];
                                i15 = i16 + (b10 & 63);
                                i13 = i15;
                            } catch (ArrayIndexOutOfBoundsException unused) {
                                i14 = i25;
                                i13 = 0;
                            }
                            i17 = this.finish;
                            if (i14 > i17) {
                                i19 = this.start + 1;
                                while (true) {
                                    this.start = i19;
                                    i20 = this.start;
                                    if (i20 < i14) {
                                        i21 = i12 + 1;
                                        cArr[i10 + i12] = (char) i13;
                                        c10 = this.f37893p0;
                                        if (c10 == 0) {
                                        }
                                        i12 = i21;
                                        break;
                                        break;
                                    }
                                    if ((this.buffer[i20] & Constants.CVR_B2b87_11_RFU) == 128) {
                                        close();
                                        throw new CharConversionException("Malformed UTF-8 char -- is an XML encoding declaration missing?");
                                    }
                                    i19 = i20 + 1;
                                }
                            } else {
                                byte[] bArr3 = this.buffer;
                                int i26 = this.start;
                                System.arraycopy(bArr3, i26, bArr3, 0, i17 - i26);
                                int i27 = this.finish - this.start;
                                this.finish = i27;
                                this.start = 0;
                                InputStream inputStream2 = this.instream;
                                byte[] bArr4 = this.buffer;
                                i18 = inputStream2.read(bArr4, i27, bArr4.length - i27);
                                if (i18 >= 0) {
                                    close();
                                    throw new CharConversionException("Partial UTF-8 char");
                                }
                                this.finish += i18;
                            }
                        } else {
                            if ((b11 & 248) != 240) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("Unconvertible UTF-8 character beginning with 0x");
                                stringBuffer.append(Integer.toHexString(this.buffer[this.start] & 255));
                                throw new CharConversionException(stringBuffer.toString());
                            }
                            int i28 = i23 + 3;
                            try {
                                int i29 = ((b11 & 7) << 18) + ((bArr2[i23 + 1] & 63) << 12) + ((bArr2[i23 + 2] & 63) << 6);
                                i14 = i23 + 4;
                                i15 = i29 + (bArr2[i28] & 63);
                                if (i15 > 1114111) {
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    stringBuffer2.append("UTF-8 encoding of character 0x00");
                                    stringBuffer2.append(Integer.toHexString(i15));
                                    stringBuffer2.append(" can't be converted to Unicode.");
                                    throw new CharConversionException(stringBuffer2.toString());
                                }
                                if (i15 > 65535) {
                                    int i30 = i15 - 65536;
                                    this.f37893p0 = (char) ((i30 & 1023) + 56320);
                                    i15 = GeneratorBase.SURR1_FIRST + (i30 >> 10);
                                }
                                i13 = i15;
                                i17 = this.finish;
                                if (i14 > i17) {
                                    i19 = this.start + 1;
                                    while (true) {
                                        this.start = i19;
                                        i20 = this.start;
                                        if (i20 < i14) {
                                            i21 = i12 + 1;
                                            cArr[i10 + i12] = (char) i13;
                                            c10 = this.f37893p0;
                                            if (c10 == 0) {
                                            }
                                            i12 = i21;
                                            break;
                                            break;
                                        }
                                        if ((this.buffer[i20] & Constants.CVR_B2b87_11_RFU) == 128) {
                                            close();
                                            throw new CharConversionException("Malformed UTF-8 char -- is an XML encoding declaration missing?");
                                        }
                                        i19 = i20 + 1;
                                    }
                                } else {
                                    byte[] bArr5 = this.buffer;
                                    int i210 = this.start;
                                    System.arraycopy(bArr5, i210, bArr5, 0, i17 - i210);
                                    int i211 = this.finish - this.start;
                                    this.finish = i211;
                                    this.start = 0;
                                    InputStream inputStream3 = this.instream;
                                    byte[] bArr6 = this.buffer;
                                    i18 = inputStream3.read(bArr6, i211, bArr6.length - i211);
                                    if (i18 >= 0) {
                                        close();
                                        throw new CharConversionException("Partial UTF-8 char");
                                    }
                                    this.finish += i18;
                                }
                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                i14 = i28;
                                i13 = 0;
                            }
                        }
                        i13 = 0;
                        i17 = this.finish;
                        if (i14 > i17) {
                            i19 = this.start + 1;
                            while (true) {
                                this.start = i19;
                                i20 = this.start;
                                if (i20 < i14) {
                                    i21 = i12 + 1;
                                    cArr[i10 + i12] = (char) i13;
                                    c10 = this.f37893p0;
                                    if (c10 == 0) {
                                    }
                                    i12 = i21;
                                    break;
                                    break;
                                }
                                if ((this.buffer[i20] & Constants.CVR_B2b87_11_RFU) == 128) {
                                    close();
                                    throw new CharConversionException("Malformed UTF-8 char -- is an XML encoding declaration missing?");
                                }
                                i19 = i20 + 1;
                            }
                        } else {
                            byte[] bArr7 = this.buffer;
                            int i212 = this.start;
                            System.arraycopy(bArr7, i212, bArr7, 0, i17 - i212);
                            int i213 = this.finish - this.start;
                            this.finish = i213;
                            this.start = 0;
                            InputStream inputStream4 = this.instream;
                            byte[] bArr8 = this.buffer;
                            i18 = inputStream4.read(bArr8, i213, bArr8.length - i213);
                            if (i18 >= 0) {
                                close();
                                throw new CharConversionException("Partial UTF-8 char");
                            }
                            this.finish += i18;
                        }
                    } else {
                        int i31 = i23 + 1;
                        i16 = (b11 & 31) << 6;
                        i14 = i23 + 2;
                        try {
                            b10 = bArr2[i31];
                            i15 = i16 + (b10 & 63);
                            i13 = i15;
                        } catch (ArrayIndexOutOfBoundsException unused3) {
                            i13 = 0;
                        }
                        i17 = this.finish;
                        if (i14 > i17) {
                            i19 = this.start + 1;
                            while (true) {
                                this.start = i19;
                                i20 = this.start;
                                if (i20 < i14) {
                                    i21 = i12 + 1;
                                    cArr[i10 + i12] = (char) i13;
                                    c10 = this.f37893p0;
                                    if (c10 == 0 && i21 < i11) {
                                        i12 += 2;
                                        cArr[i21 + i10] = c10;
                                        this.f37893p0 = (char) 0;
                                        break;
                                    }
                                    i12 = i21;
                                    break;
                                }
                                if ((this.buffer[i20] & Constants.CVR_B2b87_11_RFU) == 128) {
                                    close();
                                    throw new CharConversionException("Malformed UTF-8 char -- is an XML encoding declaration missing?");
                                }
                                i19 = i20 + 1;
                            }
                        } else {
                            byte[] bArr9 = this.buffer;
                            int i214 = this.start;
                            System.arraycopy(bArr9, i214, bArr9, 0, i17 - i214);
                            int i215 = this.finish - this.start;
                            this.finish = i215;
                            this.start = 0;
                            InputStream inputStream5 = this.instream;
                            byte[] bArr10 = this.buffer;
                            i18 = inputStream5.read(bArr10, i215, bArr10.length - i215);
                            if (i18 >= 0) {
                                close();
                                throw new CharConversionException("Partial UTF-8 char");
                            }
                            this.finish += i18;
                        }
                    }
                } else {
                    this.start = i23 + 1;
                    cArr[i12 + i10] = (char) i24;
                    i12++;
                    i13 = i24;
                }
            }
            if (i12 > 0) {
                return i12;
            }
            return i13 == -1 ? -1 : 0;
        }
    }

    static {
        Hashtable hashtable = new Hashtable(31);
        f37889s0 = hashtable;
        hashtable.put("UTF-16", "Unicode");
        hashtable.put("ISO-10646-UCS-2", "Unicode");
        hashtable.put("EBCDIC-CP-US", "cp037");
        hashtable.put("EBCDIC-CP-CA", "cp037");
        hashtable.put("EBCDIC-CP-NL", "cp037");
        hashtable.put("EBCDIC-CP-WT", "cp037");
        hashtable.put("EBCDIC-CP-DK", "cp277");
        hashtable.put("EBCDIC-CP-NO", "cp277");
        hashtable.put("EBCDIC-CP-FI", "cp278");
        hashtable.put("EBCDIC-CP-SE", "cp278");
        hashtable.put("EBCDIC-CP-IT", "cp280");
        hashtable.put("EBCDIC-CP-ES", "cp284");
        hashtable.put("EBCDIC-CP-GB", "cp285");
        hashtable.put("EBCDIC-CP-FR", "cp297");
        hashtable.put("EBCDIC-CP-AR1", "cp420");
        hashtable.put("EBCDIC-CP-HE", "cp424");
        hashtable.put("EBCDIC-CP-BE", "cp500");
        hashtable.put("EBCDIC-CP-CH", "cp500");
        hashtable.put("EBCDIC-CP-ROECE", "cp870");
        hashtable.put("EBCDIC-CP-YU", "cp870");
        hashtable.put("EBCDIC-CP-IS", "cp871");
        hashtable.put("EBCDIC-CP-AR2", "cp918");
    }

    public XmlReader(InputStream inputStream) throws IOException {
        super(inputStream);
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 512);
        byte[] bArr = new byte[4];
        int i10 = pushbackInputStream.read(bArr);
        if (i10 > 0) {
            pushbackInputStream.unread(bArr, 0, i10);
        }
        if (i10 == 4) {
            int i11 = bArr[0] & 255;
            if (i11 != 0) {
                if (i11 == 60) {
                    int i12 = bArr[1] & 255;
                    if (i12 != 0) {
                        if (i12 == 63 && bArr[2] == 120 && bArr[3] == 109) {
                            b(pushbackInputStream, "UTF8");
                            return;
                        }
                    } else if (bArr[2] == 63 && bArr[3] == 0) {
                        a(pushbackInputStream, "UnicodeLittle");
                        return;
                    }
                } else if (i11 != 76) {
                    if (i11 != 254) {
                        if (i11 == 255 && (bArr[1] & 255) == 254) {
                            a(pushbackInputStream, "UTF-16");
                            return;
                        }
                    } else if ((bArr[1] & 255) == 255) {
                        a(pushbackInputStream, "UTF-16");
                        return;
                    }
                } else if (bArr[1] == 111 && (bArr[2] & 255) == 167 && (bArr[3] & 255) == 148) {
                    b(pushbackInputStream, "CP037");
                    return;
                }
            } else if (bArr[1] == 60 && bArr[2] == 0 && bArr[3] == 63) {
                a(pushbackInputStream, "UnicodeBig");
                return;
            }
        }
        a(pushbackInputStream, "UTF-8");
    }

    public static Reader createReader(InputStream inputStream) throws IOException {
        return new XmlReader(inputStream);
    }

    public final void a(PushbackInputStream pushbackInputStream, String str) throws IOException {
        this.f37891q0 = str;
        this.f37890p0 = createReader(pushbackInputStream, str);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    public final void b(PushbackInputStream pushbackInputStream, String str) throws IOException {
        int i10;
        byte[] bArr = new byte[512];
        int i11 = pushbackInputStream.read(bArr, 0, 512);
        pushbackInputStream.unread(bArr, 0, i11);
        InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(bArr, 4, i11), str);
        if (inputStreamReader.read() != 108) {
            a(pushbackInputStream, "UTF-8");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        boolean z10 = false;
        boolean z11 = false;
        char c10 = 0;
        String string = null;
        StringBuffer stringBuffer2 = null;
        for (int i12 = 0; i12 < 507 && (i10 = inputStreamReader.read()) != -1; i12++) {
            if (i10 != 32 && i10 != 9 && i10 != 10 && i10 != 13) {
                if (i12 == 0) {
                    break;
                }
                if (i10 == 63) {
                    z10 = true;
                } else if (z10) {
                    if (i10 == 62) {
                        break;
                    } else {
                        z10 = false;
                    }
                }
                if (string != null && z11) {
                    char c11 = (char) i10;
                    if (Character.isWhitespace(c11)) {
                        continue;
                    } else if (i10 != 34 && i10 != 39) {
                        stringBuffer.append(c11);
                    } else if (c10 == 0) {
                        stringBuffer.setLength(0);
                        c10 = c11;
                    } else if (i10 != c10) {
                        stringBuffer.append(c11);
                    } else {
                        if ("encoding".equals(string)) {
                            this.f37891q0 = stringBuffer.toString();
                            for (int i13 = 0; i13 < this.f37891q0.length(); i13++) {
                                char cCharAt = this.f37891q0.charAt(i13);
                                if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && (i13 == 0 || i13 <= 0 || !(cCharAt == '-' || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '.' || cCharAt == '_'))))) {
                                    break;
                                }
                            }
                            a(pushbackInputStream, this.f37891q0);
                            return;
                        }
                        string = null;
                    }
                } else if (stringBuffer2 == null) {
                    char c12 = (char) i10;
                    if (!Character.isWhitespace(c12)) {
                        stringBuffer.setLength(0);
                        stringBuffer.append(c12);
                        stringBuffer2 = stringBuffer;
                        z11 = false;
                    }
                } else {
                    char c13 = (char) i10;
                    if (Character.isWhitespace(c13)) {
                        string = stringBuffer2.toString();
                    } else if (i10 == 61) {
                        if (string == null) {
                            string = stringBuffer2.toString();
                        }
                        c10 = 0;
                        z11 = true;
                        stringBuffer2 = null;
                    } else {
                        stringBuffer2.append(c13);
                    }
                }
            }
        }
        a(pushbackInputStream, "UTF-8");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f37892r0) {
            return;
        }
        this.f37890p0.close();
        this.f37890p0 = null;
        this.f37892r0 = true;
    }

    public String getEncoding() {
        return this.f37891q0;
    }

    @Override // java.io.Reader
    public void mark(int i10) throws IOException {
        Reader reader = this.f37890p0;
        if (reader != null) {
            reader.mark(i10);
        }
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        Reader reader = this.f37890p0;
        if (reader == null) {
            return false;
        }
        return reader.markSupported();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws IOException {
        if (this.f37892r0) {
            return -1;
        }
        int i12 = this.f37890p0.read(cArr, i10, i11);
        if (i12 == -1) {
            close();
        }
        return i12;
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.f37890p0;
        if (reader == null) {
            return false;
        }
        return reader.ready();
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        Reader reader = this.f37890p0;
        if (reader != null) {
            reader.reset();
        }
    }

    @Override // java.io.Reader
    public long skip(long j10) throws IOException {
        Reader reader = this.f37890p0;
        if (reader == null) {
            return 0L;
        }
        return reader.skip(j10);
    }

    public static Reader createReader(InputStream inputStream, String str) throws IOException {
        if (str == null) {
            return new XmlReader(inputStream);
        }
        if ("UTF-8".equalsIgnoreCase(str) || "UTF8".equalsIgnoreCase(str)) {
            return new c(inputStream);
        }
        if (Veridas.US_ASCII.equalsIgnoreCase(str) || "ASCII".equalsIgnoreCase(str)) {
            return new a(inputStream);
        }
        if ("ISO-8859-1".equalsIgnoreCase(str)) {
            return new b(inputStream);
        }
        String str2 = (String) f37889s0.get(str.toUpperCase());
        if (str2 != null) {
            str = str2;
        }
        return new InputStreamReader(inputStream, str);
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (!this.f37892r0) {
            int i10 = this.f37890p0.read();
            if (i10 == -1) {
                close();
            }
            return i10;
        }
        throw new IOException("Stream closed");
    }
}

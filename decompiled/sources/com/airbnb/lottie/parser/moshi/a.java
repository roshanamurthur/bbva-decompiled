package com.airbnb.lottie.parser.moshi;

import a4.b;
import androidx.annotation.Nullable;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.io.EOFException;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: compiled from: JsonUtf8Reader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends JsonReader {
    public static final ByteString F0 = ByteString.encodeUtf8("'\\");
    public static final ByteString G0 = ByteString.encodeUtf8("\"\\");
    public static final ByteString H0 = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    @Nullable
    public String E0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final BufferedSource f26179u0;
    public final Buffer v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f26180w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f26181x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f26182y0;

    static {
        ByteString.encodeUtf8("\n\r");
        ByteString.encodeUtf8("*/");
    }

    public a(BufferedSource bufferedSource) {
        if (bufferedSource == null) {
            throw new NullPointerException("source == null");
        }
        this.f26179u0 = bufferedSource;
        this.v0 = bufferedSource.getBufferField();
        a(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void beginArray() throws IOException {
        int iL = this.f26180w0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 3) {
            a(1);
            this.f26176s0[this.f26173p0 - 1] = 0;
            this.f26180w0 = 0;
        } else {
            throw new a4.a("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void beginObject() throws IOException {
        int iL = this.f26180w0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 1) {
            a(3);
            this.f26180w0 = 0;
        } else {
            throw new a4.a("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f26180w0 = 0;
        this.f26174q0[0] = 8;
        this.f26173p0 = 1;
        this.v0.clear();
        this.f26179u0.close();
    }

    public final void e() throws IOException {
        b("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void endArray() throws IOException {
        int iL = this.f26180w0;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 4) {
            throw new a4.a("Expected END_ARRAY but was " + peek() + " at path " + getPath());
        }
        int i10 = this.f26173p0;
        this.f26173p0 = i10 - 1;
        int[] iArr = this.f26176s0;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f26180w0 = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void endObject() throws IOException {
        int iL = this.f26180w0;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 2) {
            throw new a4.a("Expected END_OBJECT but was " + peek() + " at path " + getPath());
        }
        int i10 = this.f26173p0;
        int i11 = i10 - 1;
        this.f26173p0 = i11;
        this.f26175r0[i11] = null;
        int[] iArr = this.f26176s0;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f26180w0 = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean hasNext() throws IOException {
        int iL = this.f26180w0;
        if (iL == 0) {
            iL = l();
        }
        return (iL == 2 || iL == 4 || iL == 18) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x019c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:163:0x01df  */
    /* JADX WARN: Code duplicated, block: B:165:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:168:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:173:0x01f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:174:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:176:0x0201  */
    /* JADX WARN: Code duplicated, block: B:178:0x0208  */
    /* JADX WARN: Code duplicated, block: B:180:0x020d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0213 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0215  */
    /* JADX WARN: Code duplicated, block: B:185:0x021c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0234  */
    /* JADX WARN: Code duplicated, block: B:196:0x0239  */
    /* JADX WARN: Code duplicated, block: B:231:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x00b9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x0112  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:95:0x012b  */
    /* JADX WARN: Code duplicated, block: B:97:0x012f  */
    public final int l() throws IOException {
        int iO;
        byte b10;
        BufferedSource bufferedSource;
        int i10;
        String str;
        String str2;
        int length;
        int i11;
        int i12;
        char c10;
        char c11;
        int i13;
        int i14;
        int i15;
        int i16;
        byte b11;
        char c12;
        int[] iArr = this.f26174q0;
        int i17 = this.f26173p0 - 1;
        int i18 = iArr[i17];
        Buffer buffer = this.v0;
        if (i18 == 1) {
            iArr[i17] = 2;
        } else if (i18 == 2) {
            int iO2 = o(true);
            buffer.readByte();
            if (iO2 != 44) {
                if (iO2 == 59) {
                    e();
                    throw null;
                }
                if (iO2 == 93) {
                    this.f26180w0 = 4;
                    return 4;
                }
                b("Unterminated array");
                throw null;
            }
        } else {
            if (i18 == 3 || i18 == 5) {
                iArr[i17] = 4;
                if (i18 == 5) {
                    int iO3 = o(true);
                    buffer.readByte();
                    if (iO3 != 44) {
                        if (iO3 == 59) {
                            e();
                            throw null;
                        }
                        if (iO3 == 125) {
                            this.f26180w0 = 2;
                            return 2;
                        }
                        b("Unterminated object");
                        throw null;
                    }
                }
                int iO4 = o(true);
                if (iO4 == 34) {
                    buffer.readByte();
                    this.f26180w0 = 13;
                    return 13;
                }
                if (iO4 == 39) {
                    buffer.readByte();
                    e();
                    throw null;
                }
                if (iO4 != 125) {
                    e();
                    throw null;
                }
                if (i18 == 5) {
                    b("Expected name");
                    throw null;
                }
                buffer.readByte();
                this.f26180w0 = 2;
                return 2;
            }
            if (i18 != 4) {
                if (i18 == 6) {
                    iArr[i17] = 7;
                } else {
                    if (i18 == 7) {
                        if (o(false) == -1) {
                            this.f26180w0 = 18;
                            return 18;
                        }
                        e();
                        throw null;
                    }
                    if (i18 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iO = o(true);
                if (iO != 34) {
                    buffer.readByte();
                    this.f26180w0 = 9;
                    return 9;
                }
                if (iO != 39) {
                    e();
                    throw null;
                }
                if (iO != 44 && iO != 59) {
                    if (iO != 91) {
                        buffer.readByte();
                        this.f26180w0 = 3;
                        return 3;
                    }
                    if (iO != 93) {
                        if (iO != 123) {
                            buffer.readByte();
                            this.f26180w0 = 1;
                            return 1;
                        }
                        b10 = buffer.getByte(0L);
                        bufferedSource = this.f26179u0;
                        if (b10 != 116 || b10 == 84) {
                            i10 = 5;
                            str2 = "true";
                            str = "TRUE";
                        } else {
                            if (b10 != 102 && b10 != 70) {
                                if (b10 != 110 && b10 != 78) {
                                    i10 = 0;
                                    break;
                                }
                                i10 = 7;
                                str2 = AbstractJsonLexerKt.NULL;
                                str = VDVideoSelfieConfiguration.NULL;
                                if (i10 != 0) {
                                    return i10;
                                }
                                long j10 = 0;
                                boolean z10 = true;
                                c11 = 0;
                                i13 = 0;
                                boolean z11 = false;
                                while (true) {
                                    i14 = i13 + 1;
                                    if (bufferedSource.request(i14)) {
                                        b11 = buffer.getByte(i13);
                                        if (b11 != 43) {
                                            if (b11 != 69 || b11 == 101) {
                                                if (c11 != 2 || c11 == 4) {
                                                    c11 = 5;
                                                    i13 = i14;
                                                } else {
                                                    i16 = 0;
                                                }
                                            } else if (b11 == 45) {
                                                c12 = 6;
                                                if (c11 == 0) {
                                                    c11 = 1;
                                                    z11 = true;
                                                } else {
                                                    if (c11 != 5) {
                                                        i16 = 0;
                                                    }
                                                    c11 = c12;
                                                }
                                                i13 = i14;
                                            } else if (b11 != 46) {
                                                if (b11 >= 48 && b11 <= 57) {
                                                    if (c11 == 1 || c11 == 0) {
                                                        j10 = -(b11 - 48);
                                                        c11 = 2;
                                                    } else {
                                                        if (c11 == 2) {
                                                            if (j10 != 0) {
                                                                long j11 = (10 * j10) - ((long) (b11 - 48));
                                                                z10 &= j10 > okio.internal.Buffer.OVERFLOW_ZONE || (j10 == okio.internal.Buffer.OVERFLOW_ZONE && j11 < j10);
                                                                j10 = j11;
                                                            }
                                                        } else if (c11 == 3) {
                                                            c11 = 4;
                                                        } else if (c11 == 5 || c11 == 6) {
                                                            c11 = 7;
                                                        }
                                                        i13 = i14;
                                                    }
                                                    i13 = i14;
                                                } else if (!n(b11)) {
                                                }
                                                i16 = 0;
                                            } else if (c11 == 2) {
                                                c11 = 3;
                                                i13 = i14;
                                            } else {
                                                i16 = 0;
                                            }
                                            if (i16 != 0) {
                                                return i16;
                                            }
                                            if (n(buffer.getByte(0L))) {
                                                e();
                                                throw null;
                                            }
                                            b("Expected value");
                                            throw null;
                                        }
                                        c12 = 6;
                                        if (c11 != 5) {
                                            i16 = 0;
                                            if (i16 != 0) {
                                                return i16;
                                            }
                                            if (n(buffer.getByte(0L))) {
                                                b("Expected value");
                                                throw null;
                                            }
                                            e();
                                            throw null;
                                        }
                                        c11 = c12;
                                        i13 = i14;
                                    }
                                    if (c11 == 2 || !z10 || ((j10 == Long.MIN_VALUE && !z11) || (j10 == 0 && z11))) {
                                        if (c11 != 2 || c11 == 4 || c11 == 7) {
                                            this.f26182y0 = i13;
                                            i15 = 17;
                                            this.f26180w0 = 17;
                                        } else {
                                            i16 = 0;
                                        }
                                        if (i16 != 0) {
                                            return i16;
                                        }
                                        if (n(buffer.getByte(0L))) {
                                            b("Expected value");
                                            throw null;
                                        }
                                        e();
                                        throw null;
                                    }
                                    if (!z11) {
                                        j10 = -j10;
                                    }
                                    this.f26181x0 = j10;
                                    buffer.skip(i13);
                                    i15 = 16;
                                    this.f26180w0 = 16;
                                    i16 = i15;
                                    if (i16 != 0) {
                                        return i16;
                                    }
                                    if (n(buffer.getByte(0L))) {
                                        b("Expected value");
                                        throw null;
                                    }
                                    e();
                                    throw null;
                                }
                            }
                            i10 = 6;
                            str2 = "false";
                            str = "FALSE";
                        }
                        length = str2.length();
                        i11 = 1;
                        while (true) {
                            if (i11 >= length) {
                                if (bufferedSource.request(length + 1) || !n(buffer.getByte(length))) {
                                    buffer.skip(length);
                                    this.f26180w0 = i10;
                                    break;
                                }
                            } else {
                                i12 = i11 + 1;
                                if (!bufferedSource.request(i12) && ((c10 = buffer.getByte(i11)) == str2.charAt(i11) || c10 == str.charAt(i11))) {
                                    i11 = i12;
                                }
                            }
                            i10 = 0;
                            break;
                        }
                        if (i10 != 0) {
                            return i10;
                        }
                        long j12 = 0;
                        boolean z12 = true;
                        c11 = 0;
                        i13 = 0;
                        boolean z13 = false;
                        while (true) {
                            i14 = i13 + 1;
                            if (bufferedSource.request(i14)) {
                                b11 = buffer.getByte(i13);
                                if (b11 != 43) {
                                    if (b11 != 69) {
                                        if (c11 != 2) {
                                        }
                                        c11 = 5;
                                        i13 = i14;
                                    } else {
                                        if (c11 != 2) {
                                        }
                                        c11 = 5;
                                        i13 = i14;
                                    }
                                    if (i16 != 0) {
                                        return i16;
                                    }
                                    if (n(buffer.getByte(0L))) {
                                        b("Expected value");
                                        throw null;
                                    }
                                    e();
                                    throw null;
                                }
                                c12 = 6;
                                if (c11 != 5) {
                                    i16 = 0;
                                    if (i16 != 0) {
                                        return i16;
                                    }
                                    if (n(buffer.getByte(0L))) {
                                        b("Expected value");
                                        throw null;
                                    }
                                    e();
                                    throw null;
                                }
                                c11 = c12;
                                i13 = i14;
                            }
                            if (c11 == 2) {
                                if (c11 != 2) {
                                }
                                this.f26182y0 = i13;
                                i15 = 17;
                                this.f26180w0 = 17;
                            } else {
                                if (c11 != 2) {
                                }
                                this.f26182y0 = i13;
                                i15 = 17;
                                this.f26180w0 = 17;
                            }
                            i16 = i15;
                            if (i16 != 0) {
                                return i16;
                            }
                            if (n(buffer.getByte(0L))) {
                                b("Expected value");
                                throw null;
                            }
                            e();
                            throw null;
                        }
                    }
                    if (i18 == 1) {
                        buffer.readByte();
                        this.f26180w0 = 4;
                        return 4;
                    }
                }
                if (i18 != 1 || i18 == 2) {
                    e();
                    throw null;
                }
                b("Unexpected value");
                throw null;
            }
            iArr[i17] = 5;
            int iO5 = o(true);
            buffer.readByte();
            if (iO5 != 58) {
                if (iO5 != 61) {
                    b("Expected ':'");
                    throw null;
                }
                e();
                throw null;
            }
        }
        iO = o(true);
        if (iO != 34) {
            buffer.readByte();
            this.f26180w0 = 9;
            return 9;
        }
        if (iO != 39) {
            e();
            throw null;
        }
        if (iO != 44) {
            if (iO != 91) {
                buffer.readByte();
                this.f26180w0 = 3;
                return 3;
            }
            if (iO != 93) {
                if (iO != 123) {
                    buffer.readByte();
                    this.f26180w0 = 1;
                    return 1;
                }
                b10 = buffer.getByte(0L);
                bufferedSource = this.f26179u0;
                if (b10 != 116) {
                    i10 = 5;
                    str2 = "true";
                    str = "TRUE";
                    length = str2.length();
                    i11 = 1;
                    while (true) {
                        if (i11 >= length) {
                            if (bufferedSource.request(length + 1)) {
                            }
                            buffer.skip(length);
                            this.f26180w0 = i10;
                            break;
                        }
                        i12 = i11 + 1;
                        if (!bufferedSource.request(i12)) {
                            i11 = i12;
                        }
                    }
                    if (i10 != 0) {
                        return i10;
                    }
                    long j13 = 0;
                    boolean z14 = true;
                    c11 = 0;
                    i13 = 0;
                    boolean z15 = false;
                    while (true) {
                        i14 = i13 + 1;
                        if (bufferedSource.request(i14)) {
                            b11 = buffer.getByte(i13);
                            if (b11 != 43) {
                                if (b11 != 69) {
                                    if (c11 != 2) {
                                    }
                                    c11 = 5;
                                    i13 = i14;
                                } else {
                                    if (c11 != 2) {
                                    }
                                    c11 = 5;
                                    i13 = i14;
                                }
                                if (i16 != 0) {
                                    return i16;
                                }
                                if (n(buffer.getByte(0L))) {
                                    b("Expected value");
                                    throw null;
                                }
                                e();
                                throw null;
                            }
                            c12 = 6;
                            if (c11 != 5) {
                                i16 = 0;
                                if (i16 != 0) {
                                    return i16;
                                }
                                if (n(buffer.getByte(0L))) {
                                    b("Expected value");
                                    throw null;
                                }
                                e();
                                throw null;
                            }
                            c11 = c12;
                            i13 = i14;
                        }
                        if (c11 == 2) {
                            if (c11 != 2) {
                            }
                            this.f26182y0 = i13;
                            i15 = 17;
                            this.f26180w0 = 17;
                        } else {
                            if (c11 != 2) {
                            }
                            this.f26182y0 = i13;
                            i15 = 17;
                            this.f26180w0 = 17;
                        }
                        i16 = i15;
                        if (i16 != 0) {
                            return i16;
                        }
                        if (n(buffer.getByte(0L))) {
                            b("Expected value");
                            throw null;
                        }
                        e();
                        throw null;
                    }
                }
                i10 = 5;
                str2 = "true";
                str = "TRUE";
                length = str2.length();
                i11 = 1;
                while (true) {
                    if (i11 >= length) {
                        if (bufferedSource.request(length + 1)) {
                        }
                        buffer.skip(length);
                        this.f26180w0 = i10;
                        break;
                    }
                    i12 = i11 + 1;
                    if (!bufferedSource.request(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != 0) {
                    return i10;
                }
                long j14 = 0;
                boolean z16 = true;
                c11 = 0;
                i13 = 0;
                boolean z17 = false;
                while (true) {
                    i14 = i13 + 1;
                    if (bufferedSource.request(i14)) {
                        b11 = buffer.getByte(i13);
                        if (b11 != 43) {
                            if (b11 != 69) {
                                if (c11 != 2) {
                                }
                                c11 = 5;
                                i13 = i14;
                            } else {
                                if (c11 != 2) {
                                }
                                c11 = 5;
                                i13 = i14;
                            }
                            if (i16 != 0) {
                                return i16;
                            }
                            if (n(buffer.getByte(0L))) {
                                b("Expected value");
                                throw null;
                            }
                            e();
                            throw null;
                        }
                        c12 = 6;
                        if (c11 != 5) {
                            i16 = 0;
                            if (i16 != 0) {
                                return i16;
                            }
                            if (n(buffer.getByte(0L))) {
                                b("Expected value");
                                throw null;
                            }
                            e();
                            throw null;
                        }
                        c11 = c12;
                        i13 = i14;
                    }
                    if (c11 == 2) {
                        if (c11 != 2) {
                        }
                        this.f26182y0 = i13;
                        i15 = 17;
                        this.f26180w0 = 17;
                    } else {
                        if (c11 != 2) {
                        }
                        this.f26182y0 = i13;
                        i15 = 17;
                        this.f26180w0 = 17;
                    }
                    i16 = i15;
                    if (i16 != 0) {
                        return i16;
                    }
                    if (n(buffer.getByte(0L))) {
                        b("Expected value");
                        throw null;
                    }
                    e();
                    throw null;
                }
                i10 = 0;
                if (i10 != 0) {
                    return i10;
                }
                long j15 = 0;
                boolean z18 = true;
                c11 = 0;
                i13 = 0;
                boolean z19 = false;
                while (true) {
                    i14 = i13 + 1;
                    if (bufferedSource.request(i14)) {
                        b11 = buffer.getByte(i13);
                        if (b11 != 43) {
                            if (b11 != 69) {
                                if (c11 != 2) {
                                }
                                c11 = 5;
                                i13 = i14;
                            } else {
                                if (c11 != 2) {
                                }
                                c11 = 5;
                                i13 = i14;
                            }
                            if (i16 != 0) {
                                return i16;
                            }
                            if (n(buffer.getByte(0L))) {
                                b("Expected value");
                                throw null;
                            }
                            e();
                            throw null;
                        }
                        c12 = 6;
                        if (c11 != 5) {
                            i16 = 0;
                            if (i16 != 0) {
                                return i16;
                            }
                            if (n(buffer.getByte(0L))) {
                                b("Expected value");
                                throw null;
                            }
                            e();
                            throw null;
                        }
                        c11 = c12;
                        i13 = i14;
                    }
                    if (c11 == 2) {
                        if (c11 != 2) {
                        }
                        this.f26182y0 = i13;
                        i15 = 17;
                        this.f26180w0 = 17;
                    } else {
                        if (c11 != 2) {
                        }
                        this.f26182y0 = i13;
                        i15 = 17;
                        this.f26180w0 = 17;
                    }
                    i16 = i15;
                    if (i16 != 0) {
                        return i16;
                    }
                    if (n(buffer.getByte(0L))) {
                        b("Expected value");
                        throw null;
                    }
                    e();
                    throw null;
                }
            }
            if (i18 == 1) {
                buffer.readByte();
                this.f26180w0 = 4;
                return 4;
            }
        }
        if (i18 != 1) {
        }
        e();
        throw null;
    }

    public final int m(String str, JsonReader.Options options) {
        int length = options.f26177a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(options.f26177a[i10])) {
                this.f26180w0 = 0;
                this.f26175r0[this.f26173p0 - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final boolean n(int i10) throws IOException {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        throw null;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean nextBoolean() throws IOException {
        int iL = this.f26180w0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 5) {
            this.f26180w0 = 0;
            int[] iArr = this.f26176s0;
            int i10 = this.f26173p0 - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iL == 6) {
            this.f26180w0 = 0;
            int[] iArr2 = this.f26176s0;
            int i11 = this.f26173p0 - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new a4.a("Expected a boolean but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final double nextDouble() throws IOException {
        int iL = this.f26180w0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 16) {
            this.f26180w0 = 0;
            int[] iArr = this.f26176s0;
            int i10 = this.f26173p0 - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f26181x0;
        }
        if (iL == 17) {
            this.E0 = this.v0.readUtf8(this.f26182y0);
        } else if (iL == 9) {
            this.E0 = p(G0);
        } else if (iL == 8) {
            this.E0 = p(F0);
        } else if (iL == 10) {
            this.E0 = q();
        } else if (iL != 11) {
            throw new a4.a("Expected a double but was " + peek() + " at path " + getPath());
        }
        this.f26180w0 = 11;
        try {
            double d2 = Double.parseDouble(this.E0);
            if (Double.isNaN(d2) || Double.isInfinite(d2)) {
                throw new b("JSON forbids NaN and infinities: " + d2 + " at path " + getPath());
            }
            this.E0 = null;
            this.f26180w0 = 0;
            int[] iArr2 = this.f26176s0;
            int i11 = this.f26173p0 - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return d2;
        } catch (NumberFormatException unused) {
            throw new a4.a("Expected a double but was " + this.E0 + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int nextInt() throws IOException {
        int iL = this.f26180w0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 16) {
            long j10 = this.f26181x0;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f26180w0 = 0;
                int[] iArr = this.f26176s0;
                int i11 = this.f26173p0 - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new a4.a("Expected an int but was " + this.f26181x0 + " at path " + getPath());
        }
        if (iL == 17) {
            this.E0 = this.v0.readUtf8(this.f26182y0);
        } else if (iL == 9 || iL == 8) {
            String strP = iL == 9 ? p(G0) : p(F0);
            this.E0 = strP;
            try {
                int i12 = Integer.parseInt(strP);
                this.f26180w0 = 0;
                int[] iArr2 = this.f26176s0;
                int i13 = this.f26173p0 - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iL != 11) {
            throw new a4.a("Expected an int but was " + peek() + " at path " + getPath());
        }
        this.f26180w0 = 11;
        try {
            double d2 = Double.parseDouble(this.E0);
            int i14 = (int) d2;
            if (i14 != d2) {
                throw new a4.a("Expected an int but was " + this.E0 + " at path " + getPath());
            }
            this.E0 = null;
            this.f26180w0 = 0;
            int[] iArr3 = this.f26176s0;
            int i15 = this.f26173p0 - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        } catch (NumberFormatException unused2) {
            throw new a4.a("Expected an int but was " + this.E0 + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String nextName() throws IOException {
        String strP;
        int iL = this.f26180w0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 14) {
            strP = q();
        } else if (iL == 13) {
            strP = p(G0);
        } else if (iL == 12) {
            strP = p(F0);
        } else {
            if (iL != 15) {
                throw new a4.a("Expected a name but was " + peek() + " at path " + getPath());
            }
            strP = this.E0;
        }
        this.f26180w0 = 0;
        this.f26175r0[this.f26173p0 - 1] = strP;
        return strP;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String nextString() throws IOException {
        String utf8;
        int iL = this.f26180w0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 10) {
            utf8 = q();
        } else if (iL == 9) {
            utf8 = p(G0);
        } else if (iL == 8) {
            utf8 = p(F0);
        } else if (iL == 11) {
            utf8 = this.E0;
            this.E0 = null;
        } else if (iL == 16) {
            utf8 = Long.toString(this.f26181x0);
        } else {
            if (iL != 17) {
                throw new a4.a("Expected a string but was " + peek() + " at path " + getPath());
            }
            utf8 = this.v0.readUtf8(this.f26182y0);
        }
        this.f26180w0 = 0;
        int[] iArr = this.f26176s0;
        int i10 = this.f26173p0 - 1;
        iArr[i10] = iArr[i10] + 1;
        return utf8;
    }

    public final int o(boolean z10) throws IOException {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            BufferedSource bufferedSource = this.f26179u0;
            if (!bufferedSource.request(i11)) {
                if (z10) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            Buffer buffer = this.v0;
            byte b10 = buffer.getByte(i10);
            if (b10 != 10 && b10 != 32 && b10 != 13 && b10 != 9) {
                buffer.skip(i10);
                if (b10 == 47) {
                    if (!bufferedSource.request(2L)) {
                        return b10;
                    }
                    e();
                    throw null;
                }
                if (b10 != 35) {
                    return b10;
                }
                e();
                throw null;
            }
            i10 = i11;
        }
    }

    public final String p(ByteString byteString) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long jIndexOfElement = this.f26179u0.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                b("Unterminated string");
                throw null;
            }
            Buffer buffer = this.v0;
            if (buffer.getByte(jIndexOfElement) != 92) {
                if (sb2 == null) {
                    String utf8 = buffer.readUtf8(jIndexOfElement);
                    buffer.readByte();
                    return utf8;
                }
                sb2.append(buffer.readUtf8(jIndexOfElement));
                buffer.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(buffer.readUtf8(jIndexOfElement));
            buffer.readByte();
            sb2.append(r());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final JsonReader.Token peek() throws IOException {
        int iL = this.f26180w0;
        if (iL == 0) {
            iL = l();
        }
        switch (iL) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final String q() throws IOException {
        long jIndexOfElement = this.f26179u0.indexOfElement(H0);
        Buffer buffer = this.v0;
        return jIndexOfElement != -1 ? buffer.readUtf8(jIndexOfElement) : buffer.readUtf8();
    }

    public final char r() throws IOException {
        int i10;
        BufferedSource bufferedSource = this.f26179u0;
        if (!bufferedSource.request(1L)) {
            b("Unterminated escape sequence");
            throw null;
        }
        Buffer buffer = this.v0;
        byte b10 = buffer.readByte();
        if (b10 == 10 || b10 == 34 || b10 == 39 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return '\r';
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            b("Invalid escape sequence: \\" + ((char) b10));
            throw null;
        }
        if (!bufferedSource.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte b11 = buffer.getByte(i11);
            char c11 = (char) (c10 << 4);
            if (b11 >= 48 && b11 <= 57) {
                i10 = b11 - 48;
            } else if (b11 >= 97 && b11 <= 102) {
                i10 = b11 - 87;
            } else {
                if (b11 < 65 || b11 > 70) {
                    b("\\u" + buffer.readUtf8(4L));
                    throw null;
                }
                i10 = b11 - 55;
            }
            c10 = (char) (i10 + c11);
        }
        buffer.skip(4L);
        return c10;
    }

    public final void s(ByteString byteString) throws IOException {
        while (true) {
            long jIndexOfElement = this.f26179u0.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                b("Unterminated string");
                throw null;
            }
            Buffer buffer = this.v0;
            if (buffer.getByte(jIndexOfElement) != 92) {
                buffer.skip(jIndexOfElement + 1);
                return;
            } else {
                buffer.skip(jIndexOfElement + 1);
                r();
            }
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int selectName(JsonReader.Options options) throws IOException {
        int iL = this.f26180w0;
        if (iL == 0) {
            iL = l();
        }
        if (iL < 12 || iL > 15) {
            return -1;
        }
        if (iL == 15) {
            return m(this.E0, options);
        }
        int iSelect = this.f26179u0.select(options.f26178b);
        if (iSelect != -1) {
            this.f26180w0 = 0;
            this.f26175r0[this.f26173p0 - 1] = options.f26177a[iSelect];
            return iSelect;
        }
        String str = this.f26175r0[this.f26173p0 - 1];
        String strNextName = nextName();
        int iM = m(strNextName, options);
        if (iM == -1) {
            this.f26180w0 = 15;
            this.E0 = strNextName;
            this.f26175r0[this.f26173p0 - 1] = str;
        }
        return iM;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void skipName() throws IOException {
        int iL = this.f26180w0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 14) {
            long jIndexOfElement = this.f26179u0.indexOfElement(H0);
            Buffer buffer = this.v0;
            if (jIndexOfElement == -1) {
                jIndexOfElement = buffer.size();
            }
            buffer.skip(jIndexOfElement);
        } else if (iL == 13) {
            s(G0);
        } else if (iL == 12) {
            s(F0);
        } else if (iL != 15) {
            throw new a4.a("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.f26180w0 = 0;
        this.f26175r0[this.f26173p0 - 1] = AbstractJsonLexerKt.NULL;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void skipValue() throws IOException {
        int i10 = 0;
        do {
            int iL = this.f26180w0;
            if (iL == 0) {
                iL = l();
            }
            if (iL == 3) {
                a(1);
            } else {
                if (iL == 1) {
                    a(3);
                } else if (iL == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new a4.a("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.f26173p0--;
                } else if (iL == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new a4.a("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.f26173p0--;
                } else {
                    Buffer buffer = this.v0;
                    if (iL == 14 || iL == 10) {
                        long jIndexOfElement = this.f26179u0.indexOfElement(H0);
                        if (jIndexOfElement == -1) {
                            jIndexOfElement = buffer.size();
                        }
                        buffer.skip(jIndexOfElement);
                    } else if (iL == 9 || iL == 13) {
                        s(G0);
                    } else if (iL == 8 || iL == 12) {
                        s(F0);
                    } else if (iL == 17) {
                        buffer.skip(this.f26182y0);
                    } else if (iL == 18) {
                        throw new a4.a("Expected a value but was " + peek() + " at path " + getPath());
                    }
                }
                this.f26180w0 = 0;
            }
            i10++;
            this.f26180w0 = 0;
        } while (i10 != 0);
        int[] iArr = this.f26176s0;
        int i11 = this.f26173p0 - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f26175r0[i11] = AbstractJsonLexerKt.NULL;
    }

    public final String toString() {
        return "JsonReader(" + this.f26179u0 + ")";
    }
}

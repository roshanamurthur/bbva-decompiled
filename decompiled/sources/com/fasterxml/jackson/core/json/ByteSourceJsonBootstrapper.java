package com.fasterxml.jackson.core.json;

import androidx.camera.camera2.internal.h0;
import androidx.core.view.MotionEventCompat;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.core.io.UTF32Reader;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: loaded from: classes9.dex */
public final class ByteSourceJsonBootstrapper {
    public static final byte UTF8_BOM_1 = -17;
    public static final byte UTF8_BOM_2 = -69;
    public static final byte UTF8_BOM_3 = -65;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IOContext f43074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f43075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f43076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f43079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43081h;

    public ByteSourceJsonBootstrapper(IOContext iOContext, InputStream inputStream) {
        this.f43080g = true;
        this.f43074a = iOContext;
        this.f43075b = inputStream;
        this.f43076c = iOContext.allocReadIOBuffer();
        this.f43077d = 0;
        this.f43078e = 0;
        this.f43079f = true;
    }

    public static void a(String str) throws IOException {
        throw new CharConversionException(h0.b("Unsupported UCS-4 endianness (", str, ") detected"));
    }

    public static int b(InputAccessor inputAccessor, byte b10) throws IOException {
        while (true) {
            int i10 = b10 & 255;
            if (i10 != 32 && i10 != 13 && i10 != 10 && i10 != 9) {
                return i10;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return -1;
            }
            b10 = inputAccessor.nextByte();
        }
    }

    public static MatchStrength c(InputAccessor inputAccessor, String str, MatchStrength matchStrength) throws IOException {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != str.charAt(i10)) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    public static MatchStrength hasJSONFormat(InputAccessor inputAccessor) throws IOException {
        int iB;
        if (!inputAccessor.hasMoreBytes()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte bNextByte = inputAccessor.nextByte();
        if (bNextByte == -17) {
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != -69) {
                return MatchStrength.NO_MATCH;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != -65) {
                return MatchStrength.NO_MATCH;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            bNextByte = inputAccessor.nextByte();
        }
        int iB2 = b(inputAccessor, bNextByte);
        if (iB2 < 0) {
            return MatchStrength.INCONCLUSIVE;
        }
        if (iB2 == 123) {
            iB = inputAccessor.hasMoreBytes() ? b(inputAccessor, inputAccessor.nextByte()) : -1;
            if (iB < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            return (iB == 34 || iB == 125) ? MatchStrength.SOLID_MATCH : MatchStrength.NO_MATCH;
        }
        if (iB2 == 91) {
            iB = inputAccessor.hasMoreBytes() ? b(inputAccessor, inputAccessor.nextByte()) : -1;
            if (iB < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            return (iB == 93 || iB == 91) ? MatchStrength.SOLID_MATCH : MatchStrength.SOLID_MATCH;
        }
        MatchStrength matchStrength = MatchStrength.WEAK_MATCH;
        if (iB2 == 34) {
            return matchStrength;
        }
        if (iB2 <= 57 && iB2 >= 48) {
            return matchStrength;
        }
        if (iB2 == 45) {
            iB = inputAccessor.hasMoreBytes() ? b(inputAccessor, inputAccessor.nextByte()) : -1;
            if (iB < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            return (iB > 57 || iB < 48) ? MatchStrength.NO_MATCH : matchStrength;
        }
        if (iB2 == 110) {
            return c(inputAccessor, "ull", matchStrength);
        }
        if (iB2 == 116) {
            return c(inputAccessor, "rue", matchStrength);
        }
        return iB2 == 102 ? c(inputAccessor, "alse", matchStrength) : MatchStrength.NO_MATCH;
    }

    public static int skipUTF8BOM(DataInput dataInput) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte != 239) {
            return unsignedByte;
        }
        int unsignedByte2 = dataInput.readUnsignedByte();
        if (unsignedByte2 != 187) {
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte2) + " following 0xEF; should get 0xBB as part of UTF-8 BOM");
        }
        int unsignedByte3 = dataInput.readUnsignedByte();
        if (unsignedByte3 == 191) {
            return dataInput.readUnsignedByte();
        }
        throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte3) + " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
    }

    public JsonParser constructParser(int i10, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, CharsToNameCanonicalizer charsToNameCanonicalizer, int i11) throws IOException {
        if (detectEncoding() != JsonEncoding.UTF8 || !JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i11)) {
            return new ReaderBasedJsonParser(this.f43074a, i10, constructReader(), objectCodec, charsToNameCanonicalizer.makeChild(i11));
        }
        return new UTF8StreamJsonParser(this.f43074a, i10, this.f43075b, objectCodec, byteQuadsCanonicalizer.makeChild(i11), this.f43076c, this.f43077d, this.f43078e, this.f43079f);
    }

    public Reader constructReader() throws IOException {
        JsonEncoding encoding = this.f43074a.getEncoding();
        int iBits = encoding.bits();
        if (iBits != 8 && iBits != 16) {
            if (iBits != 32) {
                throw new RuntimeException("Internal error");
            }
            IOContext iOContext = this.f43074a;
            return new UTF32Reader(iOContext, this.f43075b, this.f43076c, this.f43077d, this.f43078e, iOContext.getEncoding().isBigEndian());
        }
        InputStream mergedStream = this.f43075b;
        if (mergedStream == null) {
            mergedStream = new ByteArrayInputStream(this.f43076c, this.f43077d, this.f43078e);
        } else if (this.f43077d < this.f43078e) {
            mergedStream = new MergedStream(this.f43074a, mergedStream, this.f43076c, this.f43077d, this.f43078e);
        }
        return new InputStreamReader(mergedStream, encoding.getJavaName());
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fe  */
    public JsonEncoding detectEncoding() throws IOException {
        JsonEncoding jsonEncoding;
        int i10;
        boolean zEnsureLoaded = ensureLoaded(4);
        byte[] bArr = this.f43076c;
        if (zEnsureLoaded) {
            int i11 = this.f43077d;
            int i12 = i11 + 2;
            int i13 = i11 + 3;
            int i14 = (bArr[i13] & 255) | (bArr[i11] << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i12] & 255) << 8);
            if (i14 == -16842752) {
                a("3412");
                throw null;
            }
            if (i14 == -131072) {
                this.f43077d = i11 + 4;
                this.f43081h = 4;
                this.f43080g = false;
            } else if (i14 == 65279) {
                this.f43080g = true;
                this.f43077d = i11 + 4;
                this.f43081h = 4;
            } else {
                if (i14 == 65534) {
                    a("2143");
                    throw null;
                }
                int i15 = i14 >>> 16;
                if (i15 == 65279) {
                    this.f43077d = i12;
                    this.f43081h = 2;
                    this.f43080g = true;
                } else if (i15 == 65534) {
                    this.f43077d = i12;
                    this.f43081h = 2;
                    this.f43080g = false;
                } else if ((i14 >>> 8) == 15711167) {
                    this.f43077d = i13;
                    this.f43081h = 1;
                    this.f43080g = true;
                } else {
                    if ((i14 >> 8) == 0) {
                        this.f43080g = true;
                    } else if ((16777215 & i14) == 0) {
                        this.f43080g = false;
                    } else {
                        if (((-16711681) & i14) == 0) {
                            a("3412");
                            throw null;
                        }
                        if ((i14 & (-65281)) == 0) {
                            a("2143");
                            throw null;
                        }
                        if ((i15 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) == 0) {
                            this.f43080g = true;
                        } else if ((i15 & 255) == 0) {
                            this.f43080g = false;
                        } else {
                            jsonEncoding = JsonEncoding.UTF8;
                        }
                        this.f43081h = 2;
                    }
                    this.f43081h = 4;
                }
            }
            i10 = this.f43081h;
            if (i10 != 1) {
                jsonEncoding = JsonEncoding.UTF8;
            } else if (i10 != 2) {
                if (i10 == 4) {
                    throw new RuntimeException("Internal error");
                }
                if (this.f43080g) {
                    jsonEncoding = JsonEncoding.UTF32_BE;
                } else {
                    jsonEncoding = JsonEncoding.UTF32_LE;
                }
            } else if (this.f43080g) {
                jsonEncoding = JsonEncoding.UTF16_BE;
            } else {
                jsonEncoding = JsonEncoding.UTF16_LE;
            }
        } else {
            if (ensureLoaded(2)) {
                int i16 = this.f43077d;
                int i17 = (bArr[i16 + 1] & 255) | ((bArr[i16] & 255) << 8);
                if ((65280 & i17) == 0) {
                    this.f43080g = true;
                } else if ((i17 & 255) == 0) {
                    this.f43080g = false;
                }
                this.f43081h = 2;
                i10 = this.f43081h;
                if (i10 != 1) {
                    jsonEncoding = JsonEncoding.UTF8;
                } else if (i10 != 2) {
                    if (i10 == 4) {
                        throw new RuntimeException("Internal error");
                    }
                    if (this.f43080g) {
                        jsonEncoding = JsonEncoding.UTF32_BE;
                    } else {
                        jsonEncoding = JsonEncoding.UTF32_LE;
                    }
                } else if (this.f43080g) {
                    jsonEncoding = JsonEncoding.UTF16_BE;
                } else {
                    jsonEncoding = JsonEncoding.UTF16_LE;
                }
            }
            jsonEncoding = JsonEncoding.UTF8;
        }
        this.f43074a.setEncoding(jsonEncoding);
        return jsonEncoding;
    }

    public boolean ensureLoaded(int i10) throws IOException {
        int i11;
        int i12 = this.f43078e - this.f43077d;
        while (i12 < i10) {
            InputStream inputStream = this.f43075b;
            if (inputStream == null) {
                i11 = -1;
            } else {
                int i13 = this.f43078e;
                byte[] bArr = this.f43076c;
                i11 = inputStream.read(bArr, i13, bArr.length - i13);
            }
            if (i11 < 1) {
                return false;
            }
            this.f43078e += i11;
            i12 += i11;
        }
        return true;
    }

    public ByteSourceJsonBootstrapper(IOContext iOContext, byte[] bArr, int i10, int i11) {
        this.f43080g = true;
        this.f43074a = iOContext;
        this.f43075b = null;
        this.f43076c = bArr;
        this.f43077d = i10;
        this.f43078e = i10 + i11;
        this.f43079f = false;
    }
}

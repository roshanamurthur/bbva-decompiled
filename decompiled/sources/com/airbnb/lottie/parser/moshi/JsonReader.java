package com.airbnb.lottie.parser.moshi;

import a4.b;
import androidx.camera.core.processing.f;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonReader implements Closeable {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String[] f26172t0 = new String[128];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f26173p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int[] f26174q0 = new int[32];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String[] f26175r0 = new String[32];

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int[] f26176s0 = new int[32];

    public static final class Options {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f26177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final okio.Options f26178b;

        public Options(String[] strArr, okio.Options options) {
            this.f26177a = strArr;
            this.f26178b = options;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x0059, TryCatch #0 {IOException -> 0x0059, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:27:0x005b), top: B:31:0x0000 }] */
        public static Options of(String... strArr) {
            String str;
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    String str2 = strArr[i10];
                    String[] strArr2 = JsonReader.f26172t0;
                    buffer.writeByte(34);
                    int length = str2.length();
                    int i11 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        char cCharAt = str2.charAt(i12);
                        if (cCharAt < 128) {
                            str = strArr2[cCharAt];
                            if (str != null) {
                                if (i11 < i12) {
                                    buffer.writeUtf8(str2, i11, i12);
                                }
                                buffer.writeUtf8(str);
                                i11 = i12 + 1;
                            }
                        } else {
                            if (cCharAt == 8232) {
                                str = "\\u2028";
                            } else if (cCharAt == 8233) {
                                str = "\\u2029";
                            }
                            if (i11 < i12) {
                                buffer.writeUtf8(str2, i11, i12);
                            }
                            buffer.writeUtf8(str);
                            i11 = i12 + 1;
                        }
                    }
                    if (i11 < length) {
                        buffer.writeUtf8(str2, i11, length);
                    }
                    buffer.writeByte(34);
                    buffer.readByte();
                    byteStringArr[i10] = buffer.readByteString();
                }
                return new Options((String[]) strArr.clone(), okio.Options.of(byteStringArr));
            } catch (IOException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Token {
        private static final /* synthetic */ Token[] $VALUES;
        public static final Token BEGIN_ARRAY;
        public static final Token BEGIN_OBJECT;
        public static final Token BOOLEAN;
        public static final Token END_ARRAY;
        public static final Token END_DOCUMENT;
        public static final Token END_OBJECT;
        public static final Token NAME;
        public static final Token NULL;
        public static final Token NUMBER;
        public static final Token STRING;

        static {
            Token token = new Token("BEGIN_ARRAY", 0);
            BEGIN_ARRAY = token;
            Token token2 = new Token("END_ARRAY", 1);
            END_ARRAY = token2;
            Token token3 = new Token("BEGIN_OBJECT", 2);
            BEGIN_OBJECT = token3;
            Token token4 = new Token("END_OBJECT", 3);
            END_OBJECT = token4;
            Token token5 = new Token("NAME", 4);
            NAME = token5;
            Token token6 = new Token("STRING", 5);
            STRING = token6;
            Token token7 = new Token("NUMBER", 6);
            NUMBER = token7;
            Token token8 = new Token("BOOLEAN", 7);
            BOOLEAN = token8;
            Token token9 = new Token(VDVideoSelfieConfiguration.NULL, 8);
            NULL = token9;
            Token token10 = new Token("END_DOCUMENT", 9);
            END_DOCUMENT = token10;
            $VALUES = new Token[]{token, token2, token3, token4, token5, token6, token7, token8, token9, token10};
        }

        public Token() {
            throw null;
        }

        public static Token valueOf(String str) {
            return (Token) Enum.valueOf(Token.class, str);
        }

        public static Token[] values() {
            return (Token[]) $VALUES.clone();
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f26172t0[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f26172t0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static JsonReader of(BufferedSource bufferedSource) {
        return new a(bufferedSource);
    }

    public final void a(int i10) {
        int i11 = this.f26173p0;
        int[] iArr = this.f26174q0;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new a4.a("Nesting too deep at " + getPath());
            }
            this.f26174q0 = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f26175r0;
            this.f26175r0 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f26176s0;
            this.f26176s0 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f26174q0;
        int i12 = this.f26173p0;
        this.f26173p0 = i12 + 1;
        iArr3[i12] = i10;
    }

    public final void b(String str) throws b {
        StringBuilder sbE = f.e(str, " at path ");
        sbE.append(getPath());
        throw new b(sbE.toString());
    }

    public abstract void beginArray() throws IOException;

    public abstract void beginObject() throws IOException;

    public abstract void endArray() throws IOException;

    public abstract void endObject() throws IOException;

    public final String getPath() {
        int i10 = this.f26173p0;
        int[] iArr = this.f26174q0;
        String[] strArr = this.f26175r0;
        int[] iArr2 = this.f26176s0;
        StringBuilder sb2 = new StringBuilder(Constant.MXN_SYMBOL);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(iArr2[i11]);
                sb2.append(AbstractJsonLexerKt.END_LIST);
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = strArr[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public abstract boolean hasNext() throws IOException;

    public abstract boolean nextBoolean() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract String nextName() throws IOException;

    public abstract String nextString() throws IOException;

    public abstract Token peek() throws IOException;

    public abstract int selectName(Options options) throws IOException;

    public abstract void skipName() throws IOException;

    public abstract void skipValue() throws IOException;
}

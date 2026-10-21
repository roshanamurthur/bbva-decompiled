package kotlin.io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Console.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lkotlin/io/LineReader;", "", "Ljava/io/InputStream;", "inputStream", "Ljava/nio/charset/Charset;", "charset", "", "readLine", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
public final class LineReader {

    @NotNull
    public static final LineReader INSTANCE = new LineReader();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static CharsetDecoder f79647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f79648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final byte[] f79649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final char[] f79650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final ByteBuffer f79651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final CharBuffer f79652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final StringBuilder f79653g;

    static {
        byte[] bArr = new byte[32];
        f79649c = bArr;
        char[] cArr = new char[32];
        f79650d = cArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(...)");
        f79651e = byteBufferWrap;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
        Intrinsics.checkNotNullExpressionValue(charBufferWrap, "wrap(...)");
        f79652f = charBufferWrap;
        f79653g = new StringBuilder();
    }

    public static int a(boolean z10) throws CharacterCodingException {
        while (true) {
            CharsetDecoder charsetDecoder = f79647a;
            CharsetDecoder charsetDecoder2 = null;
            if (charsetDecoder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = f79651e;
            CharBuffer charBuffer = f79652f;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z10);
            Intrinsics.checkNotNullExpressionValue(coderResultDecode, "decode(...)");
            boolean zIsError = coderResultDecode.isError();
            StringBuilder sb2 = f79653g;
            if (zIsError) {
                CharsetDecoder charsetDecoder3 = f79647a;
                if (charsetDecoder3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("decoder");
                } else {
                    charsetDecoder2 = charsetDecoder3;
                }
                charsetDecoder2.reset();
                byteBuffer.position(0);
                sb2.setLength(0);
                coderResultDecode.throwException();
            }
            int iPosition = charBuffer.position();
            if (!coderResultDecode.isOverflow()) {
                return iPosition;
            }
            int i10 = iPosition - 1;
            char[] cArr = f79650d;
            sb2.append(cArr, 0, i10);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i10]);
        }
    }

    public static void b(Charset charset) {
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoderNewDecoder, "newDecoder(...)");
        f79647a = charsetDecoderNewDecoder;
        ByteBuffer byteBuffer = f79651e;
        byteBuffer.clear();
        CharBuffer charBuffer = f79652f;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = f79647a;
        CharsetDecoder charsetDecoder2 = null;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        f79648b = charBuffer.position() == 1 && charBuffer.get(0) == '\n';
        CharsetDecoder charsetDecoder3 = f79647a;
        if (charsetDecoder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
        } else {
            charsetDecoder2 = charsetDecoder3;
        }
        charsetDecoder2.reset();
        byteBuffer.position(0);
        f79653g.setLength(0);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    @Nullable
    public final synchronized String readLine(@NotNull InputStream inputStream, @NotNull Charset charset) {
        int iA;
        try {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Intrinsics.checkNotNullParameter(charset, "charset");
            CharsetDecoder charsetDecoder = f79647a;
            if (charsetDecoder == null || !Intrinsics.areEqual(charsetDecoder.charset(), charset)) {
                b(charset);
            }
            int i10 = 0;
            int iA2 = 0;
            while (true) {
                int i11 = inputStream.read();
                if (i11 == -1) {
                    CharsetDecoder charsetDecoder2 = null;
                    if (f79653g.length() != 0 || i10 != 0 || iA2 != 0) {
                        ByteBuffer byteBuffer = f79651e;
                        byteBuffer.limit(i10);
                        f79652f.position(iA2);
                        iA = a(true);
                        CharsetDecoder charsetDecoder3 = f79647a;
                        if (charsetDecoder3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("decoder");
                        } else {
                            charsetDecoder2 = charsetDecoder3;
                        }
                        charsetDecoder2.reset();
                        byteBuffer.position(0);
                        break;
                    }
                    return null;
                }
                int i12 = i10 + 1;
                f79649c[i10] = (byte) i11;
                if (i11 == 10 || i12 == 32 || !f79648b) {
                    ByteBuffer byteBuffer2 = f79651e;
                    byteBuffer2.limit(i12);
                    f79652f.position(iA2);
                    iA2 = a(false);
                    if (iA2 > 0 && f79650d[iA2 - 1] == '\n') {
                        byteBuffer2.position(0);
                        iA = iA2;
                        break;
                    }
                    byteBuffer2.compact();
                    int iPosition = byteBuffer2.position();
                    byteBuffer2.position(0);
                    i10 = iPosition;
                } else {
                    i10 = i12;
                }
            }
            if (iA > 0) {
                char[] cArr = f79650d;
                if (cArr[iA - 1] == '\n') {
                    int i13 = iA - 1;
                    if (i13 > 0) {
                        iA -= 2;
                        if (cArr[iA] != '\r') {
                            iA = i13;
                        }
                    } else {
                        iA = i13;
                    }
                }
            }
            StringBuilder sb2 = f79653g;
            if (sb2.length() == 0) {
                return new String(f79650d, 0, iA);
            }
            sb2.append(f79650d, 0, iA);
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (sb2.length() > 32) {
                sb2.setLength(32);
                sb2.trimToSize();
            }
            sb2.setLength(0);
            return string;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

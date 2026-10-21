package kotlinx.serialization.json.internal;

import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.o1;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmJsonStreams.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "", "currentSize", "", "string", "", "appendStringSlowPath", "oldSize", "additional", "ensureTotalCapacity", "flush", "", "count", "writeUtf8", "codePoint", "writeUtf8CodePoint", "", "value", "writeLong", "", "char", "writeChar", "text", "write", "writeQuoted", "release", "Ljava/io/OutputStream;", "stream", "Ljava/io/OutputStream;", "", "buffer", "[B", "charArray", "[C", "indexInBuffer", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "<init>", "(Ljava/io/OutputStream;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nJvmJsonStreams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmJsonStreams.kt\nkotlinx/serialization/json/internal/JsonToJavaStreamWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n130#1:269\n117#1:271\n130#1:272\n118#1,3:273\n125#1,2:276\n130#1:278\n125#1,2:279\n117#1:281\n130#1:282\n118#1,3:283\n125#1,2:286\n125#1,2:288\n117#1:290\n130#1:291\n118#1,3:292\n125#1,2:295\n125#1,2:297\n125#1,2:299\n117#1:301\n130#1:302\n118#1,3:303\n125#1,2:306\n117#1:308\n130#1:309\n118#1,3:310\n125#1,2:313\n125#1,2:315\n125#1,2:317\n125#1,2:319\n117#1:321\n130#1:322\n118#1,3:323\n125#1,2:326\n117#1:328\n130#1:329\n118#1,3:330\n125#1,2:333\n125#1,2:335\n117#1:337\n130#1:338\n118#1,3:339\n125#1,2:342\n117#1:344\n130#1:345\n118#1,3:346\n125#1,2:349\n125#1,2:351\n125#1,2:353\n117#1:355\n130#1:356\n118#1,3:357\n125#1,2:360\n125#1,2:362\n125#1,2:364\n125#1,2:366\n1#2:270\n*S KotlinDebug\n*F\n+ 1 JvmJsonStreams.kt\nkotlinx/serialization/json/internal/JsonToJavaStreamWriter\n*L\n117#1:269\n148#1:271\n148#1:272\n148#1:273,3\n149#1:276,2\n151#1:278\n158#1:279,2\n165#1:281\n165#1:282\n165#1:283,3\n166#1:286,2\n167#1:288,2\n173#1:290\n173#1:291\n173#1:292,3\n174#1:295,2\n175#1:297,2\n176#1:299,2\n186#1:301\n186#1:302\n186#1:303,3\n187#1:306,2\n196#1:308\n196#1:309\n196#1:310,3\n197#1:313,2\n198#1:315,2\n199#1:317,2\n200#1:319,2\n215#1:321\n215#1:322\n215#1:323,3\n216#1:326,2\n221#1:328\n221#1:329\n221#1:330,3\n222#1:333,2\n223#1:335,2\n228#1:337\n228#1:338\n228#1:339,3\n229#1:342,2\n234#1:344\n234#1:345\n234#1:346,3\n235#1:349,2\n236#1:351,2\n237#1:353,2\n242#1:355\n242#1:356\n242#1:357,3\n243#1:360,2\n244#1:362,2\n245#1:364,2\n246#1:366,2\n*E\n"})
public final class JsonToJavaStreamWriter implements InternalJsonWriter {

    @NotNull
    private final byte[] buffer;

    @NotNull
    private char[] charArray;
    private int indexInBuffer;

    @NotNull
    private final OutputStream stream;

    public JsonToJavaStreamWriter(@NotNull OutputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.stream = stream;
        this.buffer = ByteArrayPool.INSTANCE.take();
        this.charArray = CharArrayPool.INSTANCE.take();
    }

    private final void appendStringSlowPath(int currentSize, String string) throws IOException {
        byte b10;
        int length = string.length();
        for (int i10 = currentSize - 1; i10 < length; i10++) {
            int iEnsureTotalCapacity = ensureTotalCapacity(currentSize, 2);
            char cCharAt = string.charAt(i10);
            if (cCharAt >= StringOpsKt.getESCAPE_MARKERS().length || (b10 = StringOpsKt.getESCAPE_MARKERS()[cCharAt]) == 0) {
                int i11 = iEnsureTotalCapacity + 1;
                this.charArray[iEnsureTotalCapacity] = cCharAt;
                currentSize = i11;
            } else if (b10 == 1) {
                String str = StringOpsKt.getESCAPE_STRINGS()[cCharAt];
                Intrinsics.checkNotNull(str);
                int iEnsureTotalCapacity2 = ensureTotalCapacity(iEnsureTotalCapacity, str.length());
                str.getChars(0, str.length(), this.charArray, iEnsureTotalCapacity2);
                currentSize = str.length() + iEnsureTotalCapacity2;
            } else {
                char[] cArr = this.charArray;
                cArr[iEnsureTotalCapacity] = AbstractJsonLexerKt.STRING_ESC;
                cArr[iEnsureTotalCapacity + 1] = (char) b10;
                currentSize = iEnsureTotalCapacity + 2;
            }
        }
        ensureTotalCapacity(currentSize, 1);
        char[] cArr2 = this.charArray;
        cArr2[currentSize] = '\"';
        writeUtf8(cArr2, currentSize + 1);
        flush();
    }

    private final int ensureTotalCapacity(int oldSize, int additional) {
        int i10 = additional + oldSize;
        char[] cArr = this.charArray;
        if (cArr.length <= i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, c.coerceAtLeast(i10, oldSize * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.charArray = cArrCopyOf;
        }
        return oldSize;
    }

    private final void flush() throws IOException {
        this.stream.write(this.buffer, 0, this.indexInBuffer);
        this.indexInBuffer = 0;
    }

    private final void writeUtf8(char[] string, int count) throws IOException {
        if (count < 0) {
            throw new IllegalArgumentException("count < 0".toString());
        }
        if (count > string.length) {
            StringBuilder sbC = o1.c("count > string.length: ", count, " > ");
            sbC.append(string.length);
            throw new IllegalArgumentException(sbC.toString().toString());
        }
        int i10 = 0;
        while (i10 < count) {
            char c10 = string[i10];
            if (c10 < 128) {
                if (this.buffer.length - this.indexInBuffer < 1) {
                    flush();
                }
                byte[] bArr = this.buffer;
                int i11 = this.indexInBuffer;
                int i12 = i11 + 1;
                this.indexInBuffer = i12;
                bArr[i11] = (byte) c10;
                i10++;
                int iMin = Math.min(count, (bArr.length - i12) + i10);
                while (i10 < iMin) {
                    char c11 = string[i10];
                    if (c11 >= 128) {
                        break;
                    }
                    byte[] bArr2 = this.buffer;
                    int i13 = this.indexInBuffer;
                    this.indexInBuffer = i13 + 1;
                    bArr2[i13] = (byte) c11;
                    i10++;
                }
            } else {
                if (c10 < 2048) {
                    if (this.buffer.length - this.indexInBuffer < 2) {
                        flush();
                    }
                    byte[] bArr3 = this.buffer;
                    int i14 = this.indexInBuffer;
                    bArr3[i14] = (byte) ((c10 >> 6) | 192);
                    this.indexInBuffer = i14 + 2;
                    bArr3[i14 + 1] = (byte) ((c10 & '?') | 128);
                } else if (c10 < 55296 || c10 > 57343) {
                    if (this.buffer.length - this.indexInBuffer < 3) {
                        flush();
                    }
                    byte[] bArr4 = this.buffer;
                    int i15 = this.indexInBuffer;
                    bArr4[i15] = (byte) ((c10 >> '\f') | 224);
                    bArr4[i15 + 1] = (byte) (((c10 >> 6) & 63) | 128);
                    this.indexInBuffer = i15 + 3;
                    bArr4[i15 + 2] = (byte) ((c10 & '?') | 128);
                } else {
                    int i16 = i10 + 1;
                    char c12 = i16 < count ? string[i16] : (char) 0;
                    if (c10 > 56319 || 56320 > c12 || c12 >= 57344) {
                        if (this.buffer.length - this.indexInBuffer < 1) {
                            flush();
                        }
                        byte[] bArr5 = this.buffer;
                        int i17 = this.indexInBuffer;
                        this.indexInBuffer = i17 + 1;
                        bArr5[i17] = (byte) 63;
                        i10 = i16;
                    } else {
                        int i18 = (((c10 & 1023) << 10) | (c12 & 1023)) + 65536;
                        if (this.buffer.length - this.indexInBuffer < 4) {
                            flush();
                        }
                        byte[] bArr6 = this.buffer;
                        int i19 = this.indexInBuffer;
                        bArr6[i19] = (byte) ((i18 >> 18) | 240);
                        bArr6[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr6[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        this.indexInBuffer = i19 + 4;
                        bArr6[i19 + 3] = (byte) ((i18 & 63) | 128);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }

    private final void writeUtf8CodePoint(int codePoint) throws IOException {
        if (codePoint < 128) {
            if (this.buffer.length - this.indexInBuffer < 1) {
                flush();
            }
            byte[] bArr = this.buffer;
            int i10 = this.indexInBuffer;
            this.indexInBuffer = i10 + 1;
            bArr[i10] = (byte) codePoint;
            return;
        }
        if (codePoint < 2048) {
            if (this.buffer.length - this.indexInBuffer < 2) {
                flush();
            }
            byte[] bArr2 = this.buffer;
            int i11 = this.indexInBuffer;
            bArr2[i11] = (byte) ((codePoint >> 6) | 192);
            this.indexInBuffer = i11 + 2;
            bArr2[i11 + 1] = (byte) ((codePoint & 63) | 128);
            return;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            if (this.buffer.length - this.indexInBuffer < 1) {
                flush();
            }
            byte[] bArr3 = this.buffer;
            int i12 = this.indexInBuffer;
            this.indexInBuffer = i12 + 1;
            bArr3[i12] = (byte) 63;
            return;
        }
        if (codePoint < 65536) {
            if (this.buffer.length - this.indexInBuffer < 3) {
                flush();
            }
            byte[] bArr4 = this.buffer;
            int i13 = this.indexInBuffer;
            bArr4[i13] = (byte) ((codePoint >> 12) | 224);
            bArr4[i13 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            this.indexInBuffer = i13 + 3;
            bArr4[i13 + 2] = (byte) ((codePoint & 63) | 128);
            return;
        }
        if (codePoint > 1114111) {
            throw new JsonEncodingException(g0.c("Unexpected code point: ", codePoint));
        }
        if (this.buffer.length - this.indexInBuffer < 4) {
            flush();
        }
        byte[] bArr5 = this.buffer;
        int i14 = this.indexInBuffer;
        bArr5[i14] = (byte) ((codePoint >> 18) | 240);
        bArr5[i14 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
        bArr5[i14 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
        this.indexInBuffer = i14 + 4;
        bArr5[i14 + 3] = (byte) ((codePoint & 63) | 128);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void release() throws IOException {
        flush();
        CharArrayPool.INSTANCE.release(this.charArray);
        ByteArrayPool.INSTANCE.release(this.buffer);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void write(@NotNull String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        ensureTotalCapacity(0, length);
        text.getChars(0, length, this.charArray, 0);
        writeUtf8(this.charArray, length);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeChar(char c10) throws IOException {
        writeUtf8CodePoint(c10);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long value) throws IOException {
        write(String.valueOf(value));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeQuoted(@NotNull String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        ensureTotalCapacity(0, text.length() + 2);
        char[] cArr = this.charArray;
        cArr[0] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, 1);
        int i10 = length + 1;
        for (int i11 = 1; i11 < i10; i11++) {
            char c10 = cArr[i11];
            if (c10 < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[c10] != 0) {
                appendStringSlowPath(i11, text);
                return;
            }
        }
        cArr[i10] = '\"';
        writeUtf8(cArr, length + 2);
        flush();
    }
}

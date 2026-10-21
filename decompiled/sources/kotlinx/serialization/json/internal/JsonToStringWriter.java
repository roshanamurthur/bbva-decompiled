package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonToStringWriter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToStringWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "()V", "array", "", "size", "", "appendStringSlowPath", "", "firstEscapedChar", "currentSize", "string", "", "ensureAdditionalCapacity", "expected", "ensureTotalCapacity", "oldSize", "additional", "release", "toString", "write", "text", "writeChar", "char", "", "writeLong", "value", "", "writeQuoted", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JsonToStringWriter implements InternalJsonWriter {

    @NotNull
    private char[] array = CharArrayPool.INSTANCE.take();
    private int size;

    private final void appendStringSlowPath(int firstEscapedChar, int currentSize, String string) {
        byte b10;
        int length = string.length();
        while (firstEscapedChar < length) {
            int iEnsureTotalCapacity = ensureTotalCapacity(currentSize, 2);
            char cCharAt = string.charAt(firstEscapedChar);
            if (cCharAt >= StringOpsKt.getESCAPE_MARKERS().length || (b10 = StringOpsKt.getESCAPE_MARKERS()[cCharAt]) == 0) {
                int i10 = iEnsureTotalCapacity + 1;
                this.array[iEnsureTotalCapacity] = cCharAt;
                currentSize = i10;
            } else if (b10 == 1) {
                String str = StringOpsKt.getESCAPE_STRINGS()[cCharAt];
                Intrinsics.checkNotNull(str);
                int iEnsureTotalCapacity2 = ensureTotalCapacity(iEnsureTotalCapacity, str.length());
                str.getChars(0, str.length(), this.array, iEnsureTotalCapacity2);
                int length2 = str.length() + iEnsureTotalCapacity2;
                this.size = length2;
                currentSize = length2;
            } else {
                char[] cArr = this.array;
                cArr[iEnsureTotalCapacity] = AbstractJsonLexerKt.STRING_ESC;
                cArr[iEnsureTotalCapacity + 1] = (char) b10;
                currentSize = iEnsureTotalCapacity + 2;
                this.size = currentSize;
            }
            firstEscapedChar++;
        }
        int iEnsureTotalCapacity3 = ensureTotalCapacity(currentSize, 1);
        this.array[iEnsureTotalCapacity3] = '\"';
        this.size = iEnsureTotalCapacity3 + 1;
    }

    private final void ensureAdditionalCapacity(int expected) {
        ensureTotalCapacity(this.size, expected);
    }

    private final int ensureTotalCapacity(int oldSize, int additional) {
        int i10 = additional + oldSize;
        char[] cArr = this.array;
        if (cArr.length <= i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, c.coerceAtLeast(i10, oldSize * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.array = cArrCopyOf;
        }
        return oldSize;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void release() {
        CharArrayPool.INSTANCE.release(this.array);
    }

    @NotNull
    public String toString() {
        return new String(this.array, 0, this.size);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void write(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        ensureAdditionalCapacity(length);
        text.getChars(0, text.length(), this.array, this.size);
        this.size += length;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeChar(char c10) {
        ensureAdditionalCapacity(1);
        char[] cArr = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long value) {
        write(String.valueOf(value));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeQuoted(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ensureAdditionalCapacity(text.length() + 2);
        char[] cArr = this.array;
        int i10 = this.size;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[c10] != 0) {
                appendStringSlowPath(i13 - i11, i13, text);
                return;
            }
        }
        cArr[i12] = '\"';
        this.size = i12 + 1;
    }
}

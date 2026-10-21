package okhttp3.tls.internal.der;

import androidx.emoji2.text.flatbuffer.a;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DerWriter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00100\u001a\u00020\t¢\u0006\u0004\b1\u00102J2\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ!\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0002J\u000e\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0002J\u000e\u0010\"\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0002J\b\u0010#\u001a\u00020\u0002H\u0016R\"\u0010*\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010/\u001a\u0004\u0018\u00010\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00063"}, d2 = {"Lokhttp3/tls/internal/der/DerWriter;", "", "", "name", "", "tagClass", "", LogKeysKt.TAG, "Lkotlin/Function1;", "Lokio/BufferedSink;", "", "block", "write", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "withTypeHint", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "b", "writeBoolean", "Ljava/math/BigInteger;", "value", "writeBigInteger", SharedPrefsStorage.VERSION_KEY, "writeLong", "Lokhttp3/tls/internal/der/BitString;", "bitString", "writeBitString", "Lokio/ByteString;", "byteString", "writeOctetString", "writeUtf8", "s", "writeObjectIdentifier", "writeRelativeObjectIdentifier", "toString", "d", "Z", "getConstructed", "()Z", "setConstructed", "(Z)V", "constructed", "getTypeHint", "()Ljava/lang/Object;", "setTypeHint", "(Ljava/lang/Object;)V", "typeHint", "sink", "<init>", "(Lokio/BufferedSink;)V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final class DerWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<BufferedSink> f86293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f86294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f86295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean constructed;

    public DerWriter(@NotNull BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f86293a = CollectionsKt__CollectionsKt.mutableListOf(sink);
        this.f86294b = new ArrayList();
        this.f86295c = new ArrayList();
    }

    public final BufferedSink a() {
        return (BufferedSink) a.b(this.f86293a, 1);
    }

    public final void b(long j10) throws IOException {
        BufferedSink bufferedSinkA = a();
        IntProgression intProgressionStep = c.step(c.downTo((((70 - Long.numberOfLeadingZeros(j10)) / 7) - 1) * 7, 0), 7);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if (step >= 0) {
            if (first > last) {
                return;
            }
        } else if (first < last) {
            return;
        }
        while (true) {
            bufferedSinkA.writeByte((first == 0 ? 0 : 128) | ((int) ((j10 >> first) & 127)));
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    public final boolean getConstructed() {
        return this.constructed;
    }

    @Nullable
    public final Object getTypeHint() {
        return CollectionsKt___CollectionsKt.lastOrNull((List) this.f86294b);
    }

    public final void setConstructed(boolean z10) {
        this.constructed = z10;
    }

    public final void setTypeHint(@Nullable Object obj) {
        ArrayList arrayList = this.f86294b;
        arrayList.set(arrayList.size() - 1, obj);
    }

    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.f86295c, " / ", null, null, 0, null, null, 62, null);
    }

    public final <T> T withTypeHint(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ArrayList arrayList = this.f86294b;
        arrayList.add(null);
        try {
            return block.invoke();
        } finally {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void write(@NotNull String name, int tagClass, long tag, @NotNull Function1<? super BufferedSink, Unit> block) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        Buffer buffer = new Buffer();
        List<BufferedSink> list = this.f86293a;
        list.add(buffer);
        this.constructed = false;
        ArrayList arrayList = this.f86295c;
        arrayList.add(name);
        try {
            block.invoke(buffer);
            int i10 = this.constructed ? 32 : 0;
            this.constructed = true;
            list.remove(list.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            BufferedSink bufferedSinkA = a();
            if (tag < 31) {
                bufferedSinkA.writeByte(tagClass | i10 | ((int) tag));
            } else {
                bufferedSinkA.writeByte(tagClass | i10 | 31);
                b(tag);
            }
            long size = buffer.size();
            if (size >= 128) {
                int iNumberOfLeadingZeros = (71 - Long.numberOfLeadingZeros(size)) / 8;
                bufferedSinkA.writeByte(iNumberOfLeadingZeros | 128);
                IntProgression intProgressionStep = c.step(c.downTo((iNumberOfLeadingZeros - 1) * 8, 0), 8);
                int first = intProgressionStep.getFirst();
                int last = intProgressionStep.getLast();
                int step = intProgressionStep.getStep();
                if (step < 0 ? first >= last : first <= last) {
                    while (true) {
                        bufferedSinkA.writeByte((int) (size >> first));
                        if (first == last) {
                            break;
                        } else {
                            first += step;
                        }
                    }
                }
            } else {
                bufferedSinkA.writeByte((int) size);
            }
            bufferedSinkA.writeAll(buffer);
        } catch (Throwable th2) {
            list.remove(list.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            throw th2;
        }
    }

    public final void writeBigInteger(@NotNull BigInteger value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        BufferedSink bufferedSinkA = a();
        byte[] byteArray = value.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "value.toByteArray()");
        bufferedSinkA.write(byteArray);
    }

    public final void writeBitString(@NotNull BitString bitString) throws IOException {
        Intrinsics.checkNotNullParameter(bitString, "bitString");
        BufferedSink bufferedSinkA = a();
        bufferedSinkA.writeByte(bitString.getUnusedBitsCount());
        bufferedSinkA.write(bitString.getByteString());
    }

    public final void writeBoolean(boolean b10) throws IOException {
        a().writeByte(b10 ? -1 : 0);
    }

    public final void writeLong(long v3) throws IOException {
        BufferedSink bufferedSinkA = a();
        IntProgression intProgressionStep = c.step(c.downTo(((((65 - (v3 < 0 ? Long.numberOfLeadingZeros(~v3) : Long.numberOfLeadingZeros(v3))) + 7) / 8) - 1) * 8, 0), 8);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if (step >= 0) {
            if (first > last) {
                return;
            }
        } else if (first < last) {
            return;
        }
        while (true) {
            bufferedSinkA.writeByte((int) (v3 >> first));
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    public final void writeObjectIdentifier(@NotNull String s4) throws IOException {
        Intrinsics.checkNotNullParameter(s4, "s");
        Buffer bufferWriteUtf8 = new Buffer().writeUtf8(s4);
        long decimalLong = bufferWriteUtf8.readDecimalLong();
        byte b10 = (byte) 46;
        if (!(bufferWriteUtf8.readByte() == b10)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        b((decimalLong * ((long) 40)) + bufferWriteUtf8.readDecimalLong());
        while (!bufferWriteUtf8.exhausted()) {
            if (!(bufferWriteUtf8.readByte() == b10)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            b(bufferWriteUtf8.readDecimalLong());
        }
    }

    public final void writeOctetString(@NotNull ByteString byteString) throws IOException {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        a().write(byteString);
    }

    public final void writeRelativeObjectIdentifier(@NotNull String s4) throws IOException {
        Intrinsics.checkNotNullParameter(s4, "s");
        byte b10 = (byte) 46;
        Buffer bufferWriteUtf8 = new Buffer().writeByte((int) b10).writeUtf8(s4);
        while (!bufferWriteUtf8.exhausted()) {
            if (!(bufferWriteUtf8.readByte() == b10)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            b(bufferWriteUtf8.readDecimalLong());
        }
    }

    public final void writeUtf8(@NotNull String value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        a().writeUtf8(value);
    }
}

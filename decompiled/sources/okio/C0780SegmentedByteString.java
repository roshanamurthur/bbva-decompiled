package okio;

import androidx.appcompat.widget.o1;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.b;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.plugin.command.hmac.HmacCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: okio.SegmentedByteString, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020!0@\u0012\u0006\u0010K\u001a\u00020F¢\u0006\u0004\bL\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0001H\u0016J\b\u0010\u000b\u001a\u00020\u0001H\u0016J\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0018\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\"\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020#H\u0016J\u0010\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0016J'\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0015H\u0010¢\u0006\u0004\b-\u0010.J(\u00102\u001a\u0002012\u0006\u0010+\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0015H\u0016J(\u00102\u001a\u0002012\u0006\u0010+\u001a\u00020\u00152\u0006\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0015H\u0016J(\u00105\u001a\u00020'2\u0006\u0010+\u001a\u00020\u00152\u0006\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0015H\u0016J\u0018\u00107\u001a\u00020\u00152\u0006\u0010/\u001a\u00020!2\u0006\u00106\u001a\u00020\u0015H\u0016J\u0018\u00108\u001a\u00020\u00152\u0006\u0010/\u001a\u00020!2\u0006\u00106\u001a\u00020\u0015H\u0016J\u000f\u0010;\u001a\u00020!H\u0010¢\u0006\u0004\b9\u0010:J\u0013\u0010=\u001a\u0002012\b\u0010/\u001a\u0004\u0018\u00010<H\u0096\u0002J\b\u0010>\u001a\u00020\u0015H\u0016J\b\u0010?\u001a\u00020\u0006H\u0016R \u0010E\u001a\b\u0012\u0004\u0012\u00020!0@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010K\u001a\u00020F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006N"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "Ljava/lang/Object;", "writeReplace", "Ljava/nio/charset/Charset;", "charset", "", "string", "base64", "hex", "toAsciiLowercase", "toAsciiUppercase", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "digest", "key", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", HmacCommand.ID, "base64Url", "", "beginIndex", "endIndex", "substring", "pos", "", "internalGet$okio", "(I)B", "internalGet", "getSize$okio", "()I", "getSize", "", "toByteArray", "Ljava/nio/ByteBuffer;", "asByteBuffer", "Ljava/io/OutputStream;", "out", "", "write", "Lokio/Buffer;", "buffer", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "write$okio", "(Lokio/Buffer;II)V", "other", "otherOffset", "", "rangeEquals", "target", "targetOffset", "copyInto", "fromIndex", "indexOf", "lastIndexOf", "internalArray$okio", "()[B", "internalArray", "", "equals", GenerateActivationFormCommand.HASH_CODE, "toString", "", "s0", "[[B", "getSegments$okio", "()[[B", "segments", "", "t0", "[I", "getDirectory$okio", "()[I", "directory", "<init>", "([[B[I)V", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n+ 2 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n63#2,12:141\n63#2,12:153\n104#2,2:165\n106#2,26:168\n135#2,5:194\n142#2:199\n145#2,3:200\n63#2,8:203\n148#2,8:211\n71#2,4:219\n156#2:223\n63#2,12:224\n160#2:236\n85#2,10:237\n161#2,9:247\n95#2,4:256\n170#2,2:260\n179#2,4:262\n85#2,10:266\n183#2,3:276\n95#2,4:279\n186#2:283\n195#2,8:284\n85#2,10:292\n203#2,3:302\n95#2,4:305\n206#2:309\n215#2,5:310\n85#2,10:315\n220#2,3:325\n95#2,4:328\n223#2:332\n226#2,4:333\n234#2,6:337\n63#2,8:343\n240#2,7:351\n71#2,4:358\n247#2,2:362\n1#3:167\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n*L\n54#1:141,12\n66#1:153,12\n78#1:165,2\n78#1:168,26\n80#1:194,5\n82#1:199\n84#1:200,3\n84#1:203,8\n84#1:211,8\n84#1:219,4\n84#1:223\n90#1:224,12\n96#1:236\n96#1:237,10\n96#1:247,9\n96#1:256,4\n96#1:260,2\n103#1:262,4\n103#1:266,10\n103#1:276,3\n103#1:279,4\n103#1:283\n110#1:284,8\n110#1:292,10\n110#1:302,3\n110#1:305,4\n110#1:309\n117#1:310,5\n117#1:315,10\n117#1:325,3\n117#1:328,4\n117#1:332\n131#1:333,4\n133#1:337,6\n133#1:343,8\n133#1:351,7\n133#1:358,4\n133#1:362,2\n78#1:167\n*E\n"})
public final class C0780SegmentedByteString extends ByteString {

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final transient byte[][] segments;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final transient int[] directory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0780SegmentedByteString(@NotNull byte[][] segments, @NotNull int[] directory) {
        super(ByteString.EMPTY.getData());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final Object writeReplace() {
        ByteString byteStringA = a();
        Intrinsics.checkNotNull(byteStringA, "null cannot be cast to non-null type java.lang.Object");
        return byteStringA;
    }

    public final ByteString a() {
        return new ByteString(toByteArray());
    }

    @Override // okio.ByteString
    @NotNull
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        Intrinsics.checkNotNullExpressionValue(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // okio.ByteString
    @NotNull
    public String base64() {
        return a().base64();
    }

    @Override // okio.ByteString
    @NotNull
    public String base64Url() {
        return a().base64Url();
    }

    @Override // okio.ByteString
    public void copyInto(int offset, @NotNull byte[] target, int targetOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(target, "target");
        long j10 = byteCount;
        SegmentedByteString.checkOffsetAndCount(size(), offset, j10);
        SegmentedByteString.checkOffsetAndCount(target.length, targetOffset, j10);
        int i10 = byteCount + offset;
        int iSegment = okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i10) {
            int i11 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i12 = getDirectory()[iSegment] - i11;
            int i13 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - offset;
            int i14 = (offset - i11) + i13;
            ArraysKt___ArraysJvmKt.copyInto(getSegments()[iSegment], target, targetOffset, i14, i14 + iMin);
            targetOffset += iMin;
            offset += iMin;
            iSegment++;
        }
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString digest$okio(@NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = getDirectory()[length + i10];
            int i13 = getDirectory()[i10];
            messageDigest.update(getSegments()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        return new ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof ByteString) {
            ByteString byteString = (ByteString) other;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: getDirectory$okio, reason: from getter */
    public final int[] getDirectory() {
        return this.directory;
    }

    @NotNull
    /* JADX INFO: renamed from: getSegments$okio, reason: from getter */
    public final byte[][] getSegments() {
        return this.segments;
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory()[getSegments().length - 1];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory()[length + i10];
            int i14 = getDirectory()[i10];
            byte[] bArr = getSegments()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        setHashCode$okio(i11);
        return i11;
    }

    @Override // okio.ByteString
    @NotNull
    public String hex() {
        return a().hex();
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString hmac$okio(@NotNull String algorithm, @NotNull ByteString key) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments().length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = getDirectory()[length + i10];
                int i13 = getDirectory()[i10];
                mac.update(getSegments()[i10], i12, i13 - i11);
                i10++;
                i11 = i13;
            }
            byte[] bArrDoFinal = mac.doFinal();
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    @Override // okio.ByteString
    public int indexOf(@NotNull byte[] other, int fromIndex) {
        Intrinsics.checkNotNullParameter(other, "other");
        return a().indexOf(other, fromIndex);
    }

    @Override // okio.ByteString
    @NotNull
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int pos) {
        SegmentedByteString.checkOffsetAndCount(getDirectory()[getSegments().length - 1], pos, 1L);
        int iSegment = okio.internal.SegmentedByteString.segment(this, pos);
        return getSegments()[iSegment][(pos - (iSegment == 0 ? 0 : getDirectory()[iSegment - 1])) + getDirectory()[getSegments().length + iSegment]];
    }

    @Override // okio.ByteString
    public int lastIndexOf(@NotNull byte[] other, int fromIndex) {
        Intrinsics.checkNotNullParameter(other, "other");
        return a().lastIndexOf(other, fromIndex);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int offset, @NotNull ByteString other, int otherOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (offset < 0 || offset > size() - byteCount) {
            return false;
        }
        int i10 = byteCount + offset;
        int iSegment = okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i10) {
            int i11 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i12 = getDirectory()[iSegment] - i11;
            int i13 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - offset;
            if (!other.rangeEquals(otherOffset, getSegments()[iSegment], (offset - i11) + i13, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iSegment++;
        }
        return true;
    }

    @Override // okio.ByteString
    @NotNull
    public String string(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return a().string(charset);
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString substring(int beginIndex, int endIndex) {
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, endIndex);
        if (beginIndex < 0) {
            throw new IllegalArgumentException(b.a("beginIndex=", beginIndex, " < 0").toString());
        }
        if (iResolveDefaultParameter > size()) {
            StringBuilder sbC = o1.c("endIndex=", iResolveDefaultParameter, " > length(");
            sbC.append(size());
            sbC.append(RootService.CLOSE_BRACKET);
            throw new IllegalArgumentException(sbC.toString().toString());
        }
        int i10 = iResolveDefaultParameter - beginIndex;
        if (i10 < 0) {
            throw new IllegalArgumentException(n1.e("endIndex=", iResolveDefaultParameter, " < beginIndex=", beginIndex).toString());
        }
        if (beginIndex == 0 && iResolveDefaultParameter == size()) {
            return this;
        }
        if (beginIndex == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = okio.internal.SegmentedByteString.segment(this, beginIndex);
        int iSegment2 = okio.internal.SegmentedByteString.segment(this, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) ArraysKt___ArraysJvmKt.copyOfRange(getSegments(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i11 = iSegment;
            int i12 = 0;
            while (true) {
                iArr[i12] = Math.min(getDirectory()[i11] - beginIndex, i10);
                int i13 = i12 + 1;
                iArr[i12 + bArr.length] = getDirectory()[getSegments().length + i11];
                if (i11 == iSegment2) {
                    break;
                }
                i11++;
                i12 = i13;
            }
        }
        int i14 = iSegment != 0 ? getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (beginIndex - i14) + iArr[length];
        return new C0780SegmentedByteString(bArr, iArr);
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString toAsciiLowercase() {
        return a().toAsciiLowercase();
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString toAsciiUppercase() {
        return a().toAsciiUppercase();
    }

    @Override // okio.ByteString
    @NotNull
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory()[length + i10];
            int i14 = getDirectory()[i10];
            int i15 = i14 - i11;
            ArraysKt___ArraysJvmKt.copyInto(getSegments()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // okio.ByteString
    @NotNull
    public String toString() {
        return a().toString();
    }

    @Override // okio.ByteString
    public void write(@NotNull OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = getDirectory()[length + i10];
            int i13 = getDirectory()[i10];
            out.write(getSegments()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
    }

    @Override // okio.ByteString
    public void write$okio(@NotNull Buffer buffer, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i10 = offset + byteCount;
        int iSegment = okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i10) {
            int i11 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i12 = getDirectory()[iSegment] - i11;
            int i13 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - offset;
            int i14 = (offset - i11) + i13;
            Segment segment = new Segment(getSegments()[iSegment], i14, i14 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                Intrinsics.checkNotNull(segment2);
                Segment segment3 = segment2.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.push(segment);
            }
            offset += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) byteCount));
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int offset, @NotNull byte[] other, int otherOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (offset < 0 || offset > size() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i10 = byteCount + offset;
        int iSegment = okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i10) {
            int i11 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i12 = getDirectory()[iSegment] - i11;
            int i13 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - offset;
            if (!SegmentedByteString.arrayRangeEquals(getSegments()[iSegment], (offset - i11) + i13, other, otherOffset, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iSegment++;
        }
        return true;
    }
}

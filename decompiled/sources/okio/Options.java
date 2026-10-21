package okio;

import bk.f;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0017J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002R\"\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", FirebaseAnalytics.Param.INDEX, "get", "", "p0", "[Lokio/ByteString;", "getByteStrings$okio", "()[Lokio/ByteString;", "byteStrings", "", "q0", "[I", "getTrie$okio", "()[I", "trie", "getSize", "()I", "size", "Companion", "okio"}, k = 1, mv = {1, 9, 0})
public final class Options extends AbstractList<ByteString> implements RandomAccess {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ByteString[] byteStrings;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final int[] trie;

    /* JADX INFO: compiled from: Options.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lokio/Options$Companion;", "", "", "Lokio/ByteString;", "byteStrings", "Lokio/Options;", "of", "([Lokio/ByteString;)Lokio/Options;", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,236:1\n11065#2:237\n11400#2,3:238\n13374#2,3:243\n37#3,2:241\n1#4:246\n74#5:247\n74#5:248\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n43#1:237\n43#1:238,3\n44#1:243,3\n43#1:241,2\n151#1:247\n208#1:248\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void a(long j10, Buffer buffer, int i10, List list, int i11, int i12, List list2) throws IOException {
            int i13;
            int i14;
            int i15;
            int i16 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (((ByteString) list.get(i17)).size() < i16) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = (ByteString) list.get(i11);
            ByteString byteString2 = (ByteString) list.get(i12 - 1);
            int i18 = -1;
            if (i16 == byteString.size()) {
                int iIntValue = ((Number) list2.get(i11)).intValue();
                int i19 = i11 + 1;
                ByteString byteString3 = (ByteString) list.get(i19);
                i13 = i19;
                i14 = iIntValue;
                byteString = byteString3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (byteString.getByte(i16) == byteString2.getByte(i16)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i20 = 0;
                for (int i21 = i16; i21 < iMin && byteString.getByte(i21) == byteString2.getByte(i21); i21++) {
                    i20++;
                }
                long j11 = 4;
                long size = (buffer.size() / j11) + j10 + ((long) 2) + ((long) i20) + 1;
                buffer.writeInt(-i20);
                buffer.writeInt(i14);
                int i22 = i20 + i16;
                while (i16 < i22) {
                    buffer.writeInt(byteString.getByte(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i22 != ((ByteString) list.get(i13)).size()) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    buffer.writeInt(((Number) list2.get(i13)).intValue());
                    return;
                } else {
                    Buffer buffer2 = new Buffer();
                    buffer.writeInt(((int) ((buffer2.size() / j11) + size)) * (-1));
                    a(size, buffer2, i22, list, i13, i12, list2);
                    buffer.writeAll(buffer2);
                    return;
                }
            }
            int i23 = 1;
            for (int i24 = i13 + 1; i24 < i12; i24++) {
                if (((ByteString) list.get(i24 - 1)).getByte(i16) != ((ByteString) list.get(i24)).getByte(i16)) {
                    i23++;
                }
            }
            long j12 = 4;
            long size2 = (buffer.size() / j12) + j10 + ((long) 2) + ((long) (i23 * 2));
            buffer.writeInt(i23);
            buffer.writeInt(i14);
            for (int i25 = i13; i25 < i12; i25++) {
                int i26 = ((ByteString) list.get(i25)).getByte(i16);
                if (i25 == i13 || i26 != ((ByteString) list.get(i25 - 1)).getByte(i16)) {
                    buffer.writeInt(i26 & 255);
                }
            }
            Buffer buffer3 = new Buffer();
            int i27 = i13;
            while (i27 < i12) {
                byte b10 = ((ByteString) list.get(i27)).getByte(i16);
                int i28 = i27 + 1;
                int i29 = i28;
                while (true) {
                    if (i29 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (b10 != ((ByteString) list.get(i29)).getByte(i16)) {
                            i15 = i29;
                            break;
                        }
                        i29++;
                    }
                }
                if (i28 == i15 && i16 + 1 == ((ByteString) list.get(i27)).size()) {
                    buffer.writeInt(((Number) list2.get(i27)).intValue());
                } else {
                    buffer.writeInt(((int) ((buffer3.size() / j12) + size2)) * i18);
                    a(size2, buffer3, i16 + 1, list, i27, i15, list2);
                }
                buffer3 = buffer3;
                i27 = i15;
                i18 = -1;
            }
            buffer.writeAll(buffer3);
        }

        @JvmStatic
        @NotNull
        public final Options of(@NotNull ByteString... byteStrings) throws IOException {
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            int i10 = 0;
            if (byteStrings.length == 0) {
                return new Options(new ByteString[0], new int[]{0, -1}, null);
            }
            List mutableList = ArraysKt___ArraysKt.toMutableList(byteStrings);
            f.sort(mutableList);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (ByteString byteString : byteStrings) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                listMutableListOf.set(CollectionsKt__CollectionsKt.binarySearch$default(mutableList, byteStrings[i11], 0, 0, 6, (Object) null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((ByteString) mutableList.get(0)).size() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i13 = 0;
            while (i13 < mutableList.size()) {
                ByteString byteString2 = (ByteString) mutableList.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < mutableList.size()) {
                    ByteString byteString3 = (ByteString) mutableList.get(i15);
                    if (!byteString3.startsWith(byteString2)) {
                        break;
                    }
                    if (byteString3.size() == byteString2.size()) {
                        throw new IllegalArgumentException(("duplicate option: " + byteString3).toString());
                    }
                    if (((Number) listMutableListOf.get(i15)).intValue() > ((Number) listMutableListOf.get(i13)).intValue()) {
                        mutableList.remove(i15);
                        listMutableListOf.remove(i15);
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            Buffer buffer = new Buffer();
            a(0L, buffer, 0, mutableList, 0, mutableList.size(), listMutableListOf);
            int[] iArr = new int[(int) (buffer.size() / ((long) 4))];
            while (!buffer.exhausted()) {
                iArr[i10] = buffer.readInt();
                i10++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
            return new Options((ByteString[]) objArrCopyOf, iArr, null);
        }
    }

    public Options(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    @JvmStatic
    @NotNull
    public static final Options of(@NotNull ByteString... byteStringArr) {
        return INSTANCE.of(byteStringArr);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: getByteStrings$okio, reason: from getter */
    public final ByteString[] getByteStrings() {
        return this.byteStrings;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.byteStrings.length;
    }

    @NotNull
    /* JADX INFO: renamed from: getTrie$okio, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains(byteString);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ByteString get(int index) {
        return this.byteStrings[index];
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf(byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }
}

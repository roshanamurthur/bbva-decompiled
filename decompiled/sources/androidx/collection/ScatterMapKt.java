package androidx.collection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\u001a\u001e\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\u001aQ\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u0005\u0010\t\u001a\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0080\b\u001a\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0080\b\u001a\u0011\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0080\b\u001a\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000\u001a\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0000\u001a\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000\u001a\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\fH\u0081\b\u001a!\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0019H\u0080\b\u001a\u0019\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\fH\u0080\b\u001a\u0019\u0010\"\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\fH\u0080\b\u001a\u0019\u0010#\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\fH\u0080\b\u001a\u0011\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u0019H\u0081\b\u001a\u0011\u0010%\u001a\u00020\f*\u00060\u0019j\u0002`$H\u0081\b\u001a\u0011\u0010'\u001a\u00020\f*\u00060\u0019j\u0002`&H\u0080\b\u001a\u0011\u0010(\u001a\u00020\u0019*\u00060\u0019j\u0002`&H\u0080\b\u001a\u0011\u0010)\u001a\u00020 *\u00060\u0019j\u0002`&H\u0080\b\u001a\u001d\u0010+\u001a\u00060\u0019j\u0002`*2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\fH\u0080\b\u001a\u001d\u0010-\u001a\u00060\u0019j\u0002`&*\u00060\u0019j\u0002`*2\u0006\u0010,\u001a\u00020\fH\u0081\b\u001a\u0015\u0010.\u001a\u00060\u0019j\u0002`&*\u00060\u0019j\u0002`*H\u0080\b\u001a\u0015\u0010/\u001a\u00060\u0019j\u0002`&*\u00060\u0019j\u0002`*H\u0081\b\"\u0014\u00100\u001a\u00020\u00198\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00102\u001a\u00020\u00198\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u00101\"\u0014\u00103\u001a\u00020\u00198\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u00101\"\u001a\u00104\u001a\u00020\u00198\u0000X\u0081T¢\u0006\f\n\u0004\b4\u00101\u0012\u0004\b5\u00106\"\u0014\u00107\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u00109\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u0010:\"\u0014\u0010;\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u0010:\"\u0014\u0010<\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010:\"\u0014\u0010=\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u0010:\"\u001a\u0010>\u001a\u00020\u00198\u0000X\u0081T¢\u0006\f\n\u0004\b>\u00101\u0012\u0004\b?\u00106\"\u001a\u0010@\u001a\u00020\u00198\u0000X\u0081T¢\u0006\f\n\u0004\b@\u00101\u0012\u0004\bA\u00106*\f\b\u0000\u0010B\"\u00020\u00192\u00020\u0019*\f\b\u0000\u0010C\"\u00020\u00192\u00020\u0019*\f\b\u0000\u0010D\"\u00020\u00192\u00020\u0019¨\u0006E"}, d2 = {"K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/ScatterMap;", "emptyScatterMap", "Landroidx/collection/MutableScatterMap;", "mutableScatterMapOf", "", "Lkotlin/Pair;", "pairs", "([Lkotlin/Pair;)Landroidx/collection/MutableScatterMap;", "", "k", "", HashCommand.ID, "h1", "h2", "capacity", "nextCapacity", "n", "normalizeCapacity", "loadedCapacity", "unloadedCapacity", "", "data", TypedValues.CycleType.S_WAVE_OFFSET, "", "readRawMetadata", "value", "", "writeRawMetadata", "metadata", FirebaseAnalytics.Param.INDEX, "", "isEmpty", "isDeleted", "isFull", "Landroidx/collection/StaticBitmask;", "lowestBitSet", "Landroidx/collection/Bitmask;", "get", "next", "hasNext", "Landroidx/collection/Group;", "group", "m", "match", "maskEmpty", "maskEmptyOrDeleted", "AllEmpty", "J", "Empty", "Deleted", "Sentinel", "getSentinel$annotations", "()V", "EmptyGroup", "[J", "GroupWidth", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "ClonedMetadataCount", "DefaultScatterCapacity", "MurmurHashC1", "BitmaskLsb", "getBitmaskLsb$annotations", "BitmaskMsb", "getBitmaskMsb$annotations", "Bitmask", "Group", "StaticBitmask", "collection"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n1645#1:1835\n1645#1:1836\n1645#1:1837\n1699#1:1838\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1664#1:1835\n1666#1:1836\n1669#1:1837\n1705#1:1838\n*E\n"})
public final class ScatterMapKt {
    public static final long AllEmpty = -9187201950435737472L;
    public static final long BitmaskLsb = 72340172838076673L;
    public static final long BitmaskMsb = -9187201950435737472L;
    public static final int ClonedMetadataCount = 7;
    public static final int DefaultScatterCapacity = 6;
    public static final long Deleted = 254;
    public static final long Empty = 128;
    public static final int GroupWidth = 8;
    public static final int MurmurHashC1 = -862048943;
    public static final long Sentinel = 255;

    @JvmField
    @NotNull
    public static final long[] EmptyGroup = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableScatterMap f2515a = new MutableScatterMap(0);

    @NotNull
    public static final <K, V> ScatterMap<K, V> emptyScatterMap() {
        MutableScatterMap mutableScatterMap = f2515a;
        Intrinsics.checkNotNull(mutableScatterMap, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return mutableScatterMap;
    }

    public static final int get(long j10) {
        return Long.numberOfTrailingZeros(j10) >> 3;
    }

    public static final long group(@NotNull long[] metadata, int i10) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        return (((-i12) >> 63) & (metadata[i11 + 1] << (64 - i12))) | (metadata[i11] >>> i12);
    }

    public static final int h1(int i10) {
        return i10 >>> 7;
    }

    public static final int h2(int i10) {
        return i10 & 127;
    }

    public static final boolean hasNext(long j10) {
        return j10 != 0;
    }

    public static final int hash(@Nullable Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }

    public static final boolean isDeleted(@NotNull long[] metadata, int i10) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 254;
    }

    public static final boolean isEmpty(@NotNull long[] metadata, int i10) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 128;
    }

    @PublishedApi
    public static final boolean isFull(long j10) {
        return j10 < 128;
    }

    public static final int loadedCapacity(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return i10 - (i10 / 8);
    }

    @PublishedApi
    public static final int lowestBitSet(long j10) {
        return Long.numberOfTrailingZeros(j10) >> 3;
    }

    public static final long maskEmpty(long j10) {
        return j10 & ((~j10) << 6) & (-9187201950435737472L);
    }

    @PublishedApi
    public static final long maskEmptyOrDeleted(long j10) {
        return j10 & ((~j10) << 7) & (-9187201950435737472L);
    }

    @PublishedApi
    public static final long match(long j10, int i10) {
        long j11 = j10 ^ (((long) i10) * BitmaskLsb);
        return (~j11) & (j11 - BitmaskLsb) & (-9187201950435737472L);
    }

    @NotNull
    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf() {
        return new MutableScatterMap<>(0, 1, null);
    }

    public static final long next(long j10) {
        return j10 & (j10 - 1);
    }

    public static final int nextCapacity(int i10) {
        if (i10 == 0) {
            return 6;
        }
        return (i10 * 2) + 1;
    }

    public static final int normalizeCapacity(int i10) {
        if (i10 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i10);
        }
        return 0;
    }

    @PublishedApi
    public static final long readRawMetadata(@NotNull long[] data, int i10) {
        Intrinsics.checkNotNullParameter(data, "data");
        return (data[i10 >> 3] >> ((i10 & 7) << 3)) & 255;
    }

    public static final int unloadedCapacity(int i10) {
        if (i10 == 7) {
            return 8;
        }
        return androidx.appcompat.widget.a.a(i10, 1, 7, i10);
    }

    public static final void writeRawMetadata(@NotNull long[] data, int i10, long j10) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        data[i11] = (j10 << i12) | (data[i11] & (~(255 << i12)));
    }

    public static final boolean isFull(@NotNull long[] metadata, int i10) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) < 128;
    }

    @NotNull
    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf(@NotNull Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(pairs.length);
        mutableScatterMap.putAll(pairs);
        return mutableScatterMap;
    }

    @PublishedApi
    public static /* synthetic */ void getBitmaskLsb$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getBitmaskMsb$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSentinel$annotations() {
    }
}

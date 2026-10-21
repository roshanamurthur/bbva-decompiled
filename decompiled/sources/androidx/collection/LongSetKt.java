package androidx.collection;

import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LongSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0012\u0010\u0002\u001a\u00020\u00002\n\u0010\b\u001a\u00020\u0007\"\u00020\u0003\u001a\u0006\u0010\n\u001a\u00020\t\u001a\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0012\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00020\u0007\"\u00020\u0003\u001a\u0011\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0080\b\"\u001a\u0010\u0012\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/collection/LongSet;", "emptyLongSet", "longSetOf", "", "element1", "element2", "element3", "", "elements", "Landroidx/collection/MutableLongSet;", "mutableLongSetOf", "k", "", HashCommand.ID, "b", "[J", "getEmptyLongArray", "()[J", "EmptyLongArray", "collection"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,837:1\n1#2:838\n*E\n"})
public final class LongSetKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableLongSet f2390a = new MutableLongSet(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final long[] f2391b = new long[0];

    @NotNull
    public static final LongSet emptyLongSet() {
        return f2390a;
    }

    @NotNull
    public static final long[] getEmptyLongArray() {
        return f2391b;
    }

    public static final int hash(long j10) {
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * ScatterMapKt.MurmurHashC1;
        return i10 ^ (i10 << 16);
    }

    @NotNull
    public static final LongSet longSetOf() {
        return f2390a;
    }

    @NotNull
    public static final MutableLongSet mutableLongSetOf() {
        return new MutableLongSet(0, 1, null);
    }

    @NotNull
    public static final LongSet longSetOf(long j10) {
        return mutableLongSetOf(j10);
    }

    @NotNull
    public static final MutableLongSet mutableLongSetOf(long j10) {
        MutableLongSet mutableLongSet = new MutableLongSet(1);
        mutableLongSet.plusAssign(j10);
        return mutableLongSet;
    }

    @NotNull
    public static final LongSet longSetOf(long j10, long j11) {
        return mutableLongSetOf(j10, j11);
    }

    @NotNull
    public static final LongSet longSetOf(long j10, long j11, long j12) {
        return mutableLongSetOf(j10, j11, j12);
    }

    @NotNull
    public static final MutableLongSet mutableLongSetOf(long j10, long j11) {
        MutableLongSet mutableLongSet = new MutableLongSet(2);
        mutableLongSet.plusAssign(j10);
        mutableLongSet.plusAssign(j11);
        return mutableLongSet;
    }

    @NotNull
    public static final LongSet longSetOf(@NotNull long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableLongSet mutableLongSet = new MutableLongSet(elements.length);
        mutableLongSet.plusAssign(elements);
        return mutableLongSet;
    }

    @NotNull
    public static final MutableLongSet mutableLongSetOf(long j10, long j11, long j12) {
        MutableLongSet mutableLongSet = new MutableLongSet(3);
        mutableLongSet.plusAssign(j10);
        mutableLongSet.plusAssign(j11);
        mutableLongSet.plusAssign(j12);
        return mutableLongSet;
    }

    @NotNull
    public static final MutableLongSet mutableLongSetOf(@NotNull long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableLongSet mutableLongSet = new MutableLongSet(elements.length);
        mutableLongSet.plusAssign(elements);
        return mutableLongSet;
    }
}

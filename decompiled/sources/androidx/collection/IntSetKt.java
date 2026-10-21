package androidx.collection;

import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0012\u0010\u0002\u001a\u00020\u00002\n\u0010\b\u001a\u00020\u0007\"\u00020\u0003\u001a\u0006\u0010\n\u001a\u00020\t\u001a\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0012\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00020\u0007\"\u00020\u0003\u001a\u0011\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0080\b\"\u001a\u0010\u0011\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/collection/IntSet;", "emptyIntSet", "intSetOf", "", "element1", "element2", "element3", "", "elements", "Landroidx/collection/MutableIntSet;", "mutableIntSetOf", "k", HashCommand.ID, "b", "[I", "getEmptyIntArray", "()[I", "EmptyIntArray", "collection"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/IntSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,837:1\n1#2:838\n*E\n"})
public final class IntSetKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableIntSet f2381a = new MutableIntSet(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final int[] f2382b = new int[0];

    @NotNull
    public static final IntSet emptyIntSet() {
        return f2381a;
    }

    @NotNull
    public static final int[] getEmptyIntArray() {
        return f2382b;
    }

    public static final int hash(int i10) {
        int i11 = i10 * ScatterMapKt.MurmurHashC1;
        return i11 ^ (i11 << 16);
    }

    @NotNull
    public static final IntSet intSetOf() {
        return f2381a;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf() {
        return new MutableIntSet(0, 1, null);
    }

    @NotNull
    public static final IntSet intSetOf(int i10) {
        return mutableIntSetOf(i10);
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(int i10) {
        MutableIntSet mutableIntSet = new MutableIntSet(1);
        mutableIntSet.plusAssign(i10);
        return mutableIntSet;
    }

    @NotNull
    public static final IntSet intSetOf(int i10, int i11) {
        return mutableIntSetOf(i10, i11);
    }

    @NotNull
    public static final IntSet intSetOf(int i10, int i11, int i12) {
        return mutableIntSetOf(i10, i11, i12);
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(int i10, int i11) {
        MutableIntSet mutableIntSet = new MutableIntSet(2);
        mutableIntSet.plusAssign(i10);
        mutableIntSet.plusAssign(i11);
        return mutableIntSet;
    }

    @NotNull
    public static final IntSet intSetOf(@NotNull int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(int i10, int i11, int i12) {
        MutableIntSet mutableIntSet = new MutableIntSet(3);
        mutableIntSet.plusAssign(i10);
        mutableIntSet.plusAssign(i11);
        mutableIntSet.plusAssign(i12);
        return mutableIntSet;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(@NotNull int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }
}

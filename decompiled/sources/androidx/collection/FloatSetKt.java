package androidx.collection;

import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FloatSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0012\u0010\u0002\u001a\u00020\u00002\n\u0010\b\u001a\u00020\u0007\"\u00020\u0003\u001a\u0006\u0010\n\u001a\u00020\t\u001a\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0012\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00020\u0007\"\u00020\u0003\u001a\u0011\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0080\b\"\u001a\u0010\u0012\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/collection/FloatSet;", "emptyFloatSet", "floatSetOf", "", "element1", "element2", "element3", "", "elements", "Landroidx/collection/MutableFloatSet;", "mutableFloatSetOf", "k", "", HashCommand.ID, "b", "[F", "getEmptyFloatArray", "()[F", "EmptyFloatArray", "collection"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,837:1\n1#2:838\n*E\n"})
public final class FloatSetKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableFloatSet f2371a = new MutableFloatSet(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final float[] f2372b = new float[0];

    @NotNull
    public static final FloatSet emptyFloatSet() {
        return f2371a;
    }

    @NotNull
    public static final FloatSet floatSetOf() {
        return f2371a;
    }

    @NotNull
    public static final float[] getEmptyFloatArray() {
        return f2372b;
    }

    public static final int hash(float f6) {
        int iFloatToIntBits = Float.floatToIntBits(f6) * ScatterMapKt.MurmurHashC1;
        return iFloatToIntBits ^ (iFloatToIntBits << 16);
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf() {
        return new MutableFloatSet(0, 1, null);
    }

    @NotNull
    public static final FloatSet floatSetOf(float f6) {
        return mutableFloatSetOf(f6);
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(float f6) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(1);
        mutableFloatSet.plusAssign(f6);
        return mutableFloatSet;
    }

    @NotNull
    public static final FloatSet floatSetOf(float f6, float f10) {
        return mutableFloatSetOf(f6, f10);
    }

    @NotNull
    public static final FloatSet floatSetOf(float f6, float f10, float f11) {
        return mutableFloatSetOf(f6, f10, f11);
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(float f6, float f10) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(2);
        mutableFloatSet.plusAssign(f6);
        mutableFloatSet.plusAssign(f10);
        return mutableFloatSet;
    }

    @NotNull
    public static final FloatSet floatSetOf(@NotNull float... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(float f6, float f10, float f11) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(3);
        mutableFloatSet.plusAssign(f6);
        mutableFloatSet.plusAssign(f10);
        mutableFloatSet.plusAssign(f11);
        return mutableFloatSet;
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(@NotNull float... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }
}

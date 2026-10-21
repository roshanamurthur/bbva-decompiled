package androidx.collection;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.noknok.android.client.utils.UIConfigTags;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntIntPair.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\u0088\u0001\u0007\u0092\u0001\u00020\b¨\u0006\u001e"}, d2 = {"Landroidx/collection/IntIntPair;", "", "first", "", UIConfigTags.TAG_SECOND, "constructor-impl", "(II)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)I", "getPackedValue$annotations", "()V", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", GenerateActivationFormCommand.HASH_CODE, "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,83:1\n33#2:84\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n41#1:84\n*E\n"})
public final class IntIntPair {

    @JvmField
    public final long packedValue;

    public /* synthetic */ IntIntPair(long j10) {
        this.packedValue = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m13boximpl(long j10) {
        return new IntIntPair(j10);
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m14component1impl(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m15component2impl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m17constructorimpl(long j10) {
        return j10;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m18equalsimpl(long j10, Object obj) {
        return (obj instanceof IntIntPair) && j10 == ((IntIntPair) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m19equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final int m20getFirstimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final int m21getSecondimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m22hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m23toStringimpl(long j10) {
        return "(" + m20getFirstimpl(j10) + ", " + m21getSecondimpl(j10) + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m18equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m22hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m23toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m16constructorimpl(int i10, int i11) {
        return m17constructorimpl((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }
}

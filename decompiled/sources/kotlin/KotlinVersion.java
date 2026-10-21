package kotlin;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.networkplugin.command.impl.PatchCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KotlinVersion.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.1")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0011\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0000H\u0096\u0002J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u001e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bR\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u001b"}, d2 = {"Lkotlin/KotlinVersion;", "", "", "toString", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "compareTo", "major", "minor", "isAtLeast", PatchCommand.ID, "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMajor", "()I", "q0", "getMinor", "r0", "getPatch", "<init>", "(III)V", "(II)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int major;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final int minor;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final int patch;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f79386s0;

    @JvmField
    @NotNull
    public static final KotlinVersion CURRENT = a.get();

    public KotlinVersion(int i10, int i11, int i12) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
        if (new IntRange(0, 255).contains(i10) && new IntRange(0, 255).contains(i11) && new IntRange(0, 255).contains(i12)) {
            this.f79386s0 = (i10 << 16) + (i11 << 8) + i12;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        KotlinVersion kotlinVersion = other instanceof KotlinVersion ? (KotlinVersion) other : null;
        return kotlinVersion != null && this.f79386s0 == kotlinVersion.f79386s0;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getF79386s0() {
        return this.f79386s0;
    }

    public final boolean isAtLeast(int major, int minor) {
        int i10 = this.major;
        return i10 > major || (i10 == major && this.minor >= minor);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append('.');
        sb2.append(this.minor);
        sb2.append('.');
        sb2.append(this.patch);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull KotlinVersion other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f79386s0 - other.f79386s0;
    }

    public final boolean isAtLeast(int major, int minor, int patch) {
        int i10;
        int i11 = this.major;
        return i11 > major || (i11 == major && ((i10 = this.minor) > minor || (i10 == minor && this.patch >= patch)));
    }

    public KotlinVersion(int i10, int i11) {
        this(i10, i11, 0);
    }
}

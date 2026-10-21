package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import androidx.activity.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BinaryVersion.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,101:1\n5306#2,7:102\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n*L\n73#1:102,7\n*E\n"})
public abstract class BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final int[] f81241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f81244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<Integer> f81245e;

    /* JADX INFO: compiled from: BinaryVersion.kt */
    @SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n1549#2:102\n1620#2,3:103\n37#3,2:106\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n*L\n97#1:102\n97#1:103,3\n98#1:106,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BinaryVersion(@NotNull int... numbers) {
        List<Integer> listEmptyList;
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.f81241a = numbers;
        Integer orNull = ArraysKt___ArraysKt.getOrNull(numbers, 0);
        this.f81242b = orNull != null ? orNull.intValue() : -1;
        Integer orNull2 = ArraysKt___ArraysKt.getOrNull(numbers, 1);
        this.f81243c = orNull2 != null ? orNull2.intValue() : -1;
        Integer orNull3 = ArraysKt___ArraysKt.getOrNull(numbers, 2);
        this.f81244d = orNull3 != null ? orNull3.intValue() : -1;
        if (numbers.length <= 3) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(a.d(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
            listEmptyList = CollectionsKt___CollectionsKt.toList(ArraysKt___ArraysJvmKt.asList(numbers).subList(3, numbers.length));
        }
        this.f81245e = listEmptyList;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != null && Intrinsics.areEqual(getClass(), obj.getClass())) {
            BinaryVersion binaryVersion = (BinaryVersion) obj;
            if (this.f81242b == binaryVersion.f81242b && this.f81243c == binaryVersion.f81243c && this.f81244d == binaryVersion.f81244d && Intrinsics.areEqual(this.f81245e, binaryVersion.f81245e)) {
                return true;
            }
        }
        return false;
    }

    public final int getMajor() {
        return this.f81242b;
    }

    public final int getMinor() {
        return this.f81243c;
    }

    public int hashCode() {
        int i10 = this.f81242b;
        int i11 = (i10 * 31) + this.f81243c + i10;
        int i12 = (i11 * 31) + this.f81244d + i11;
        return this.f81245e.hashCode() + (i12 * 31) + i12;
    }

    public final boolean isAtLeast(@NotNull BinaryVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return isAtLeast(version.f81242b, version.f81243c, version.f81244d);
    }

    public final boolean isAtMost(int i10, int i11, int i12) {
        int i13 = this.f81242b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f81243c;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.f81244d <= i12;
    }

    public final boolean isCompatibleTo(@NotNull BinaryVersion ourVersion) {
        Intrinsics.checkNotNullParameter(ourVersion, "ourVersion");
        int i10 = this.f81243c;
        int i11 = this.f81242b;
        if (i11 == 0) {
            if (ourVersion.f81242b != 0 || i10 != ourVersion.f81243c) {
                return false;
            }
        } else if (i11 != ourVersion.f81242b || i10 > ourVersion.f81243c) {
            return false;
        }
        return true;
    }

    @NotNull
    public final int[] toArray() {
        return this.f81241a;
    }

    @NotNull
    public String toString() {
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i10 : array) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt___CollectionsKt.joinToString$default(arrayList, Constant.DOT_STRING, null, null, 0, null, null, 62, null);
    }

    public final boolean isAtLeast(int i10, int i11, int i12) {
        int i13 = this.f81242b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f81243c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f81244d >= i12;
    }
}

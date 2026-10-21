package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClassLiteralValue.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nClassLiteralValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassLiteralValue.kt\norg/jetbrains/kotlin/resolve/constants/ClassLiteralValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
public final class ClassLiteralValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ClassId f81540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81541b;

    public ClassLiteralValue(@NotNull ClassId classId, int i10) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f81540a = classId;
        this.f81541b = i10;
    }

    @NotNull
    public final ClassId component1() {
        return this.f81540a;
    }

    public final int component2() {
        return this.f81541b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return Intrinsics.areEqual(this.f81540a, classLiteralValue.f81540a) && this.f81541b == classLiteralValue.f81541b;
    }

    public final int getArrayNestedness() {
        return this.f81541b;
    }

    @NotNull
    public final ClassId getClassId() {
        return this.f81540a;
    }

    public int hashCode() {
        return (this.f81540a.hashCode() * 31) + this.f81541b;
    }

    @NotNull
    public String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            i10 = this.f81541b;
            if (i11 >= i10) {
                break;
            }
            sb2.append("kotlin/Array<");
            i11++;
        }
        sb2.append(this.f81540a);
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(">");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

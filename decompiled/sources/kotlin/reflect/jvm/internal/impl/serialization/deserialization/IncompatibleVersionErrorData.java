package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IncompatibleVersionErrorData.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class IncompatibleVersionErrorData<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f81697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f81698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f81699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f81700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f81701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ClassId f81702f;

    public IncompatibleVersionErrorData(T t10, T t11, T t12, T t13, @NotNull String filePath, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f81697a = t10;
        this.f81698b = t11;
        this.f81699c = t12;
        this.f81700d = t13;
        this.f81701e = filePath;
        this.f81702f = classId;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return Intrinsics.areEqual(this.f81697a, incompatibleVersionErrorData.f81697a) && Intrinsics.areEqual(this.f81698b, incompatibleVersionErrorData.f81698b) && Intrinsics.areEqual(this.f81699c, incompatibleVersionErrorData.f81699c) && Intrinsics.areEqual(this.f81700d, incompatibleVersionErrorData.f81700d) && Intrinsics.areEqual(this.f81701e, incompatibleVersionErrorData.f81701e) && Intrinsics.areEqual(this.f81702f, incompatibleVersionErrorData.f81702f);
    }

    public int hashCode() {
        T t10 = this.f81697a;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f81698b;
        int iHashCode2 = (iHashCode + (t11 == null ? 0 : t11.hashCode())) * 31;
        T t12 = this.f81699c;
        int iHashCode3 = (iHashCode2 + (t12 == null ? 0 : t12.hashCode())) * 31;
        T t13 = this.f81700d;
        return this.f81702f.hashCode() + n1.c(this.f81701e, (iHashCode3 + (t13 != null ? t13.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f81697a + ", compilerVersion=" + this.f81698b + ", languageVersion=" + this.f81699c + ", expectedVersion=" + this.f81700d + ", filePath=" + this.f81701e + ", classId=" + this.f81702f + RootService.CLOSE_BRACKET;
    }
}

package kotlin.reflect.jvm.internal.impl.load.java;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaClassFinder.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface JavaClassFinder {
    @Nullable
    JavaClass findClass(@NotNull Request request);

    @Nullable
    JavaPackage findPackage(@NotNull FqName fqName, boolean z10);

    @Nullable
    Set<String> knownClassNamesInPackage(@NotNull FqName fqName);

    /* JADX INFO: compiled from: JavaClassFinder.kt */
    public static final class Request {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ClassId f80497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final byte[] f80498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final JavaClass f80499c;

        public Request(@NotNull ClassId classId, @Nullable byte[] bArr, @Nullable JavaClass javaClass) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.f80497a = classId;
            this.f80498b = bArr;
            this.f80499c = javaClass;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return Intrinsics.areEqual(this.f80497a, request.f80497a) && Intrinsics.areEqual(this.f80498b, request.f80498b) && Intrinsics.areEqual(this.f80499c, request.f80499c);
        }

        @NotNull
        public final ClassId getClassId() {
            return this.f80497a;
        }

        public int hashCode() {
            int iHashCode = this.f80497a.hashCode() * 31;
            byte[] bArr = this.f80498b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            JavaClass javaClass = this.f80499c;
            return iHashCode2 + (javaClass != null ? javaClass.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(classId=" + this.f80497a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f80498b) + ", outerClass=" + this.f80499c + RootService.CLOSE_BRACKET;
        }

        public /* synthetic */ Request(ClassId classId, byte[] bArr, JavaClass javaClass, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(classId, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : javaClass);
        }
    }
}

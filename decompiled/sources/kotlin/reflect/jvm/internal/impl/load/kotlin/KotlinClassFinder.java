package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KotlinClassFinder.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface KotlinClassFinder extends KotlinMetadataFinder {

    /* JADX INFO: compiled from: KotlinClassFinder.kt */
    public static abstract class Result {

        /* JADX INFO: compiled from: KotlinClassFinder.kt */
        public static final class ClassFileContent extends Result {
            @NotNull
            public final byte[] getContent() {
                return null;
            }
        }

        /* JADX INFO: compiled from: KotlinClassFinder.kt */
        public static final class KotlinClass extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final KotlinJvmBinaryClass f80917a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KotlinClass(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass, @Nullable byte[] bArr) {
                super(null);
                Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f80917a = kotlinJvmBinaryClass;
            }

            @NotNull
            public final KotlinJvmBinaryClass getKotlinJvmBinaryClass() {
                return this.f80917a;
            }

            public /* synthetic */ KotlinClass(KotlinJvmBinaryClass kotlinJvmBinaryClass, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(kotlinJvmBinaryClass, (i10 & 2) != 0 ? null : bArr);
            }
        }

        public Result() {
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final KotlinJvmBinaryClass toKotlinJvmBinaryClass() {
            KotlinClass kotlinClass = this instanceof KotlinClass ? (KotlinClass) this : null;
            if (kotlinClass != null) {
                return kotlinClass.getKotlinJvmBinaryClass();
            }
            return null;
        }
    }

    @Nullable
    Result findKotlinClassOrContent(@NotNull JavaClass javaClass, @NotNull JvmMetadataVersion jvmMetadataVersion);

    @Nullable
    Result findKotlinClassOrContent(@NotNull ClassId classId, @NotNull JvmMetadataVersion jvmMetadataVersion);
}

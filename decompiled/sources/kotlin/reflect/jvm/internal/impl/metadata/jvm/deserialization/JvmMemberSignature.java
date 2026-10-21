package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JvmMemberSignature.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class JvmMemberSignature {

    /* JADX INFO: compiled from: JvmMemberSignature.kt */
    public static final class Field extends JvmMemberSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f81311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f81312b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(@NotNull String name, @NotNull String desc) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.f81311a = name;
            this.f81312b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String asString() {
            return getName() + AbstractJsonLexerKt.COLON + getDesc();
        }

        @NotNull
        public final String component1() {
            return this.f81311a;
        }

        @NotNull
        public final String component2() {
            return this.f81312b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return Intrinsics.areEqual(this.f81311a, field.f81311a) && Intrinsics.areEqual(this.f81312b, field.f81312b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getDesc() {
            return this.f81312b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getName() {
            return this.f81311a;
        }

        public int hashCode() {
            return this.f81312b.hashCode() + (this.f81311a.hashCode() * 31);
        }
    }

    /* JADX INFO: compiled from: JvmMemberSignature.kt */
    public static final class Method extends JvmMemberSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f81313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f81314b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Method(@NotNull String name, @NotNull String desc) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.f81313a = name;
            this.f81314b = desc;
        }

        public static /* synthetic */ Method copy$default(Method method, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = method.f81313a;
            }
            if ((i10 & 2) != 0) {
                str2 = method.f81314b;
            }
            return method.copy(str, str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String asString() {
            return getName() + getDesc();
        }

        @NotNull
        public final Method copy(@NotNull String name, @NotNull String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new Method(name, desc);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Method)) {
                return false;
            }
            Method method = (Method) obj;
            return Intrinsics.areEqual(this.f81313a, method.f81313a) && Intrinsics.areEqual(this.f81314b, method.f81314b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getDesc() {
            return this.f81314b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getName() {
            return this.f81313a;
        }

        public int hashCode() {
            return this.f81314b.hashCode() + (this.f81313a.hashCode() * 31);
        }
    }

    public JvmMemberSignature() {
    }

    public /* synthetic */ JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String asString();

    @NotNull
    public abstract String getDesc();

    @NotNull
    public abstract String getName();

    @NotNull
    public final String toString() {
        return asString();
    }
}

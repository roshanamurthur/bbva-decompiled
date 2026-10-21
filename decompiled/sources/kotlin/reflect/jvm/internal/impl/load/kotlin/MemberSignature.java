package kotlin.reflect.jvm.internal.impl.load.kotlin;

import ad.d;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.cellswidgets.MaskTextWatcher;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MemberSignature.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class MemberSignature {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f80920a;

    /* JADX INFO: compiled from: MemberSignature.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromFieldNameAndDesc(@NotNull String name, @NotNull String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new MemberSignature(d.e(name, MaskTextWatcher.WILDCARD, desc), null);
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromJvmMemberSignature(@NotNull JvmMemberSignature signature) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            if (signature instanceof JvmMemberSignature.Method) {
                return fromMethodNameAndDesc(signature.getName(), signature.getDesc());
            }
            if (signature instanceof JvmMemberSignature.Field) {
                return fromFieldNameAndDesc(signature.getName(), signature.getDesc());
            }
            throw new NoWhenBranchMatchedException();
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethod(@NotNull NameResolver nameResolver, @NotNull JvmProtoBuf.JvmMethodSignature signature) {
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(signature, "signature");
            return fromMethodNameAndDesc(nameResolver.getString(signature.getName()), nameResolver.getString(signature.getDesc()));
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethodNameAndDesc(@NotNull String name, @NotNull String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new MemberSignature(u.f(name, desc), null);
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethodSignatureAndParameterIndex(@NotNull MemberSignature signature, int i10) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            return new MemberSignature(signature.getSignature() + '@' + i10, null);
        }
    }

    public MemberSignature(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f80920a = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MemberSignature) && Intrinsics.areEqual(this.f80920a, ((MemberSignature) obj).f80920a);
    }

    @NotNull
    public final String getSignature() {
        return this.f80920a;
    }

    public int hashCode() {
        return this.f80920a.hashCode();
    }

    @NotNull
    public String toString() {
        return y2.b(new StringBuilder("MemberSignature(signature="), this.f80920a, RootService.CLOSE_BRACKET);
    }
}

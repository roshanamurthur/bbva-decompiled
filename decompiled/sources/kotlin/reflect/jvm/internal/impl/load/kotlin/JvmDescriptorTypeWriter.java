package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: typeSignatureMapping.kt */
/* JADX INFO: loaded from: classes12.dex */
public class JvmDescriptorTypeWriter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public T f80901b;

    public void writeArrayType() {
        if (this.f80901b == null) {
            this.f80900a++;
        }
    }

    public void writeClass(@NotNull T objectType) {
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        writeJvmTypeAsIs(objectType);
    }

    public final void writeJvmTypeAsIs(@NotNull T type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.f80901b == null) {
            if (this.f80900a <= 0) {
                this.f80901b = type;
            } else {
                new StringBuilder().append(l.repeat(Constant.BRACKET_OPEN, this.f80900a));
                throw null;
            }
        }
    }

    public void writeTypeVariable(@NotNull Name name, @NotNull T type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        writeJvmTypeAsIs(type);
    }

    public void writeArrayEnd() {
    }
}

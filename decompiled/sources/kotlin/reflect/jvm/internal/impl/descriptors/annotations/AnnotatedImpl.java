package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class AnnotatedImpl implements Annotated {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Annotations f80239p0;

    public AnnotatedImpl(@NotNull Annotations annotations) {
        if (annotations != null) {
            this.f80239p0 = annotations;
        } else {
            a(0);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations = this.f80239p0;
        if (annotations != null) {
            return annotations;
        }
        a(1);
        throw null;
    }
}

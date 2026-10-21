package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d extends ReadKotlinClassHeaderAnnotationVisitor.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadKotlinClassHeaderAnnotationVisitor.d f80957b;

    public d(ReadKotlinClassHeaderAnnotationVisitor.d dVar) {
        this.f80957b = dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.a
    public final void b(@NotNull String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
        }
        ReadKotlinClassHeaderAnnotationVisitor.this.f80945e = strArr;
    }
}

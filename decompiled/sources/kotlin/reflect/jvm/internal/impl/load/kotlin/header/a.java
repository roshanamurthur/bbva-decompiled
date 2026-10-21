package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends ReadKotlinClassHeaderAnnotationVisitor.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadKotlinClassHeaderAnnotationVisitor.b f80954b;

    public a(ReadKotlinClassHeaderAnnotationVisitor.b bVar) {
        this.f80954b = bVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.a
    public final void b(@NotNull String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
        }
        ReadKotlinClassHeaderAnnotationVisitor.this.f80945e = strArr;
    }
}

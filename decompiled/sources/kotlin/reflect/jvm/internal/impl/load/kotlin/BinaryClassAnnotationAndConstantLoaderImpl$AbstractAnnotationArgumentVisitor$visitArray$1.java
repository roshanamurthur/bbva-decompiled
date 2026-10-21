package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<ConstantValue<?>> f80875a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl f80876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Name f80877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor f80878d;

    public BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, Name name, BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor abstractAnnotationArgumentVisitor) {
        this.f80876b = binaryClassAnnotationAndConstantLoaderImpl;
        this.f80877c = name;
        this.f80878d = abstractAnnotationArgumentVisitor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void visit(@Nullable Object obj) {
        this.f80875a.add(BinaryClassAnnotationAndConstantLoaderImpl.access$createConstant(this.f80876b, this.f80877c, obj));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    @Nullable
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        final ArrayList arrayList = new ArrayList();
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        final KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorLoadAnnotation = this.f80876b.loadAnnotation(classId, NO_SOURCE, arrayList);
        Intrinsics.checkNotNull(annotationArgumentVisitorLoadAnnotation);
        return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1$visitAnnotation$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ KotlinJvmBinaryClass.AnnotationArgumentVisitor f80879a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 f80881c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ArrayList<AnnotationDescriptor> f80882d;

            {
                this.f80881c = this;
                this.f80882d = arrayList;
                this.f80879a = this.f80880b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visit(@Nullable Name name, @Nullable Object obj) {
                this.f80879a.visit(name, obj);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            @Nullable
            public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@Nullable Name name, @NotNull ClassId classId2) {
                Intrinsics.checkNotNullParameter(classId2, "classId");
                return this.f80879a.visitAnnotation(name, classId2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            @Nullable
            public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(@Nullable Name name) {
                return this.f80879a.visitArray(name);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitClassLiteral(@Nullable Name name, @NotNull ClassLiteralValue value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.f80879a.visitClassLiteral(name, value);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnd() {
                this.f80880b.visitEnd();
                this.f80881c.f80875a.add(new AnnotationValue((AnnotationDescriptor) CollectionsKt___CollectionsKt.single((List) this.f80882d)));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnum(@Nullable Name name, @NotNull ClassId enumClassId, @NotNull Name enumEntryName) {
                Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
                Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
                this.f80879a.visitEnum(name, enumClassId, enumEntryName);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void visitClassLiteral(@NotNull ClassLiteralValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f80875a.add(new KClassValue(value));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void visitEnd() {
        this.f80878d.visitArrayValue(this.f80877c, this.f80875a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void visitEnum(@NotNull ClassId enumClassId, @NotNull Name enumEntryName) {
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        this.f80875a.add(new EnumValue(enumClassId, enumEntryName));
    }
}

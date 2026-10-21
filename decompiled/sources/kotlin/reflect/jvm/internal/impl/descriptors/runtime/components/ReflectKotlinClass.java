package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import ad.d;
import androidx.core.graphics.b;
import com.fasterxml.jackson.core.JsonPointer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vk.a;

/* JADX INFO: compiled from: ReflectKotlinClass.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ReflectKotlinClass implements KotlinJvmBinaryClass {

    @NotNull
    public static final Factory Factory = new Factory(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Class<?> f80408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final KotlinClassHeader f80409b;

    /* JADX INFO: compiled from: ReflectKotlinClass.kt */
    public static final class Factory {
        public Factory() {
        }

        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ReflectKotlinClass create(@NotNull Class<?> klass) {
            Intrinsics.checkNotNullParameter(klass, "klass");
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = new ReadKotlinClassHeaderAnnotationVisitor();
            a.f94103a.loadClassAnnotations(klass, readKotlinClassHeaderAnnotationVisitor);
            KotlinClassHeader kotlinClassHeaderCreateHeaderWithDefaultMetadataVersion = readKotlinClassHeaderAnnotationVisitor.createHeaderWithDefaultMetadataVersion();
            if (kotlinClassHeaderCreateHeaderWithDefaultMetadataVersion == null) {
                return null;
            }
            return new ReflectKotlinClass(klass, kotlinClassHeaderCreateHeaderWithDefaultMetadataVersion, null);
        }
    }

    public ReflectKotlinClass() {
        throw null;
    }

    public ReflectKotlinClass(Class cls, KotlinClassHeader kotlinClassHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this.f80408a = cls;
        this.f80409b = kotlinClassHeader;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ReflectKotlinClass) {
            if (Intrinsics.areEqual(this.f80408a, ((ReflectKotlinClass) obj).f80408a)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    public KotlinClassHeader getClassHeader() {
        return this.f80409b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    public ClassId getClassId() {
        return ReflectClassUtilKt.getClassId(this.f80408a);
    }

    @NotNull
    public final Class<?> getKlass() {
        return this.f80408a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    public String getLocation() {
        StringBuilder sb2 = new StringBuilder();
        String name = this.f80408a.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return d.f(sb2, l.replace$default(name, '.', JsonPointer.SEPARATOR, false, 4, (Object) null), ".class");
    }

    public int hashCode() {
        return this.f80408a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void loadClassAnnotations(@NotNull KotlinJvmBinaryClass.AnnotationVisitor visitor, @Nullable byte[] bArr) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        a.f94103a.loadClassAnnotations(this.f80408a, visitor);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        b.f(ReflectKotlinClass.class, sb2, ": ");
        sb2.append(this.f80408a);
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void visitMembers(@NotNull KotlinJvmBinaryClass.MemberVisitor visitor, @Nullable byte[] bArr) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        a.f94103a.visitMembers(this.f80408a, visitor);
    }
}

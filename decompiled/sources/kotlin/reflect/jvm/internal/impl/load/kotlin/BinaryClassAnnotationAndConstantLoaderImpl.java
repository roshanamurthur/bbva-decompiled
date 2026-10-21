package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl extends AbstractBinaryClassAnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ModuleDescriptor f80865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final NotFoundClasses f80866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AnnotationDeserializer f80867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public JvmMetadataVersion f80868f;

    /* JADX INFO: compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    public abstract class AbstractAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public AbstractAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(@Nullable Name name, @Nullable Object obj) {
            visitConstantValue(name, BinaryClassAnnotationAndConstantLoaderImpl.access$createConstant(BinaryClassAnnotationAndConstantLoaderImpl.this, name, obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@Nullable final Name name, @NotNull ClassId classId) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            final ArrayList arrayList = new ArrayList();
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            final KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorLoadAnnotation = BinaryClassAnnotationAndConstantLoaderImpl.this.loadAnnotation(classId, NO_SOURCE, arrayList);
            Intrinsics.checkNotNull(annotationArgumentVisitorLoadAnnotation);
            return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, name, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitAnnotation$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ KotlinJvmBinaryClass.AnnotationArgumentVisitor f80870a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor f80872c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Name f80873d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ ArrayList<AnnotationDescriptor> f80874e;

                {
                    this.f80872c = this;
                    this.f80873d = name;
                    this.f80874e = arrayList;
                    this.f80870a = this.f80871b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visit(@Nullable Name name2, @Nullable Object obj) {
                    this.f80870a.visit(name2, obj);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                @Nullable
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@Nullable Name name2, @NotNull ClassId classId2) {
                    Intrinsics.checkNotNullParameter(classId2, "classId");
                    return this.f80870a.visitAnnotation(name2, classId2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                @Nullable
                public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(@Nullable Name name2) {
                    return this.f80870a.visitArray(name2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitClassLiteral(@Nullable Name name2, @NotNull ClassLiteralValue value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.f80870a.visitClassLiteral(name2, value);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnd() {
                    this.f80871b.visitEnd();
                    this.f80872c.visitConstantValue(this.f80873d, new AnnotationValue((AnnotationDescriptor) CollectionsKt___CollectionsKt.single((List) this.f80874e)));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnum(@Nullable Name name2, @NotNull ClassId enumClassId, @NotNull Name enumEntryName) {
                    Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
                    Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
                    this.f80870a.visitEnum(name2, enumClassId, enumEntryName);
                }
            };
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(@Nullable Name name) {
            return new BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1(BinaryClassAnnotationAndConstantLoaderImpl.this, name, this);
        }

        public abstract void visitArrayValue(@Nullable Name name, @NotNull ArrayList<ConstantValue<?>> arrayList);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(@Nullable Name name, @NotNull ClassLiteralValue value) {
            Intrinsics.checkNotNullParameter(value, "value");
            visitConstantValue(name, new KClassValue(value));
        }

        public abstract void visitConstantValue(@Nullable Name name, @NotNull ConstantValue<?> constantValue);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(@Nullable Name name, @NotNull ClassId enumClassId, @NotNull Name enumEntryName) {
            Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
            Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
            visitConstantValue(name, new EnumValue(enumClassId, enumEntryName));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryClassAnnotationAndConstantLoaderImpl(@NotNull ModuleDescriptor module, @NotNull NotFoundClasses notFoundClasses, @NotNull StorageManager storageManager, @NotNull KotlinClassFinder kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f80865c = module;
        this.f80866d = notFoundClasses;
        this.f80867e = new AnnotationDeserializer(module, notFoundClasses);
        this.f80868f = JvmMetadataVersion.INSTANCE;
    }

    public static final ConstantValue access$createConstant(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, Name name, Object obj) {
        binaryClassAnnotationAndConstantLoaderImpl.getClass();
        ConstantValue<?> constantValueCreateConstantValue = ConstantValueFactory.INSTANCE.createConstantValue(obj, binaryClassAnnotationAndConstantLoaderImpl.f80865c);
        if (constantValueCreateConstantValue != null) {
            return constantValueCreateConstantValue;
        }
        return ErrorValue.Companion.create("Unsupported annotation argument: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @NotNull
    public JvmMetadataVersion getJvmMetadataVersion() {
        return this.f80868f;
    }

    public void setJvmMetadataVersion(@NotNull JvmMetadataVersion jvmMetadataVersion) {
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "<set-?>");
        this.f80868f = jvmMetadataVersion;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @NotNull
    public AnnotationDescriptor loadAnnotation(@NotNull ProtoBuf.Annotation proto, @NotNull NameResolver nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        return this.f80867e.deserializeAnnotation(proto, nameResolver);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    @Nullable
    public ConstantValue<?> loadConstant(@NotNull String desc, @NotNull Object initializer) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        if (StringsKt__StringsKt.contains$default((CharSequence) "ZBCS", (CharSequence) desc, false, 2, (Object) null)) {
            int iIntValue = ((Integer) initializer).intValue();
            int iHashCode = desc.hashCode();
            if (iHashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 67) {
                if (desc.equals("C")) {
                    initializer = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 83) {
                if (desc.equals(ExifInterface.LATITUDE_SOUTH)) {
                    initializer = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 90 && desc.equals("Z")) {
                initializer = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(desc);
        }
        return ConstantValueFactory.INSTANCE.createConstantValue(initializer, this.f80865c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    @Nullable
    public ConstantValue<?> transformToUnsignedConstant(@NotNull ConstantValue<?> constant) {
        ConstantValue<?> uLongValue;
        Intrinsics.checkNotNullParameter(constant, "constant");
        if (constant instanceof ByteValue) {
            uLongValue = new UByteValue(((ByteValue) constant).getValue().byteValue());
        } else if (constant instanceof ShortValue) {
            uLongValue = new UShortValue(((ShortValue) constant).getValue().shortValue());
        } else if (constant instanceof IntValue) {
            uLongValue = new UIntValue(((IntValue) constant).getValue().intValue());
        } else {
            if (!(constant instanceof LongValue)) {
                return constant;
            }
            uLongValue = new ULongValue(((LongValue) constant).getValue().longValue());
        }
        return uLongValue;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @Nullable
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotation(@NotNull final ClassId annotationClassId, @NotNull final SourceElement source, @NotNull final List<AnnotationDescriptor> result) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        final ClassDescriptor classDescriptorFindNonGenericClassAcrossDependencies = FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.f80865c, annotationClassId, this.f80866d);
        return new AbstractAnnotationArgumentVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final HashMap<Name, ConstantValue<?>> f80883b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.f80883b = new HashMap<>();
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public void visitArrayValue(@Nullable Name name, @NotNull ArrayList<ConstantValue<?>> elements) {
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (name == null) {
                    return;
                }
                ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(name, classDescriptorFindNonGenericClassAcrossDependencies);
                if (annotationParameterByName != null) {
                    HashMap<Name, ConstantValue<?>> map = this.f80883b;
                    ConstantValueFactory constantValueFactory = ConstantValueFactory.INSTANCE;
                    List<? extends ConstantValue<?>> listCompact = CollectionsKt.compact(elements);
                    KotlinType type = annotationParameterByName.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    map.put(name, constantValueFactory.createArrayValue(listCompact, type));
                    return;
                }
                if (BinaryClassAnnotationAndConstantLoaderImpl.this.isImplicitRepeatableContainer(annotationClassId) && Intrinsics.areEqual(name.asString(), "value")) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : elements) {
                        if (obj instanceof AnnotationValue) {
                            arrayList.add(obj);
                        }
                    }
                    List<AnnotationDescriptor> list = result;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        list.add(((AnnotationValue) it.next()).getValue());
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public void visitConstantValue(@Nullable Name name, @NotNull ConstantValue<?> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (name != null) {
                    this.f80883b.put(name, value);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnd() {
                HashMap<Name, ConstantValue<?>> map = this.f80883b;
                BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = BinaryClassAnnotationAndConstantLoaderImpl.this;
                ClassId classId = annotationClassId;
                if (binaryClassAnnotationAndConstantLoaderImpl.isRepeatableWithImplicitContainer(classId, map) || binaryClassAnnotationAndConstantLoaderImpl.isImplicitRepeatableContainer(classId)) {
                    return;
                }
                result.add(new AnnotationDescriptorImpl(classDescriptorFindNonGenericClassAcrossDependencies.getDefaultType(), map, source));
            }
        };
    }
}

package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class ReadKotlinClassHeaderAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f80939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashMap f80940k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f80941a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f80942b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80943c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f80944d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f80945e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f80946f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f80947g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public KotlinClassHeader.Kind f80948h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String[] f80949i = null;

    public static abstract class a implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f80950a = new ArrayList();

        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i10 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i10 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i10 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i10 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public abstract void b(@NotNull String[] strArr);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visit(@Nullable Object obj) {
            if (obj instanceof String) {
                this.f80950a.add((String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        @Nullable
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId) {
            if (classId != null) {
                return null;
            }
            a(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitClassLiteral(@NotNull ClassLiteralValue classLiteralValue) {
            if (classLiteralValue != null) {
                return;
            }
            a(2);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitEnd() {
            b((String[]) this.f80950a.toArray(new String[0]));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitEnum(@NotNull ClassId classId, @NotNull Name name) {
            if (classId == null) {
                a(0);
                throw null;
            }
            if (name != null) {
                return;
            }
            a(1);
            throw null;
        }
    }

    static {
        try {
            f80939j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f80939j = false;
        }
        HashMap map = new HashMap();
        f80940k = map;
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Nullable
    public KotlinClassHeader createHeader(JvmMetadataVersion jvmMetadataVersion) {
        if (this.f80948h == null || this.f80941a == null) {
            return null;
        }
        JvmMetadataVersion jvmMetadataVersion2 = new JvmMetadataVersion(this.f80941a, (this.f80943c & 8) != 0);
        if (jvmMetadataVersion2.isCompatible(jvmMetadataVersion)) {
            KotlinClassHeader.Kind kind = this.f80948h;
            if ((kind == KotlinClassHeader.Kind.CLASS || kind == KotlinClassHeader.Kind.FILE_FACADE || kind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) && this.f80945e == null) {
                return null;
            }
        } else {
            this.f80947g = this.f80945e;
            this.f80945e = null;
        }
        String[] strArr = this.f80949i;
        return new KotlinClassHeader(this.f80948h, jvmMetadataVersion2, this.f80945e, this.f80947g, this.f80946f, this.f80942b, this.f80943c, this.f80944d, strArr != null ? BitEncoding.decodeBytes(strArr) : null);
    }

    @Nullable
    public KotlinClassHeader createHeaderWithDefaultMetadataVersion() {
        return createHeader(JvmMetadataVersion.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    @Nullable
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId, @NotNull SourceElement sourceElement) {
        KotlinClassHeader.Kind kind;
        if (classId == null) {
            a(0);
            throw null;
        }
        if (sourceElement == null) {
            a(1);
            throw null;
        }
        FqName fqNameAsSingleFqName = classId.asSingleFqName();
        if (fqNameAsSingleFqName.equals(JvmAnnotationNames.METADATA_FQ_NAME)) {
            return new b();
        }
        if (fqNameAsSingleFqName.equals(JvmAnnotationNames.SERIALIZED_IR_FQ_NAME)) {
            return new c();
        }
        if (f80939j || this.f80948h != null || (kind = (KotlinClassHeader.Kind) f80940k.get(classId)) == null) {
            return null;
        }
        this.f80948h = kind;
        return new d();
    }

    public class b implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public b() {
        }

        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(@Nullable Name name, @Nullable Object obj) {
            if (name == null) {
                return;
            }
            String strAsString = name.asString();
            boolean zEquals = "k".equals(strAsString);
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = ReadKotlinClassHeaderAnnotationVisitor.this;
            if (zEquals) {
                if (obj instanceof Integer) {
                    readKotlinClassHeaderAnnotationVisitor.f80948h = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strAsString)) {
                if (obj instanceof int[]) {
                    readKotlinClassHeaderAnnotationVisitor.f80941a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strAsString)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    readKotlinClassHeaderAnnotationVisitor.f80942b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strAsString)) {
                if (obj instanceof Integer) {
                    readKotlinClassHeaderAnnotationVisitor.f80943c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(strAsString) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                readKotlinClassHeaderAnnotationVisitor.f80944d = str2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@Nullable Name name, @NotNull ClassId classId) {
            if (classId != null) {
                return null;
            }
            a(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(@Nullable Name name) {
            String strAsString = name != null ? name.asString() : null;
            if ("d1".equals(strAsString)) {
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a(this);
            }
            if ("d2".equals(strAsString)) {
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.b(this);
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue) {
            if (classLiteralValue != null) {
                return;
            }
            a(0);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2) {
            if (classId == null) {
                a(1);
                throw null;
            }
            if (name2 != null) {
                return;
            }
            a(2);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }
    }

    public class c implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public c() {
        }

        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@Nullable Name name, @NotNull ClassId classId) {
            if (classId != null) {
                return null;
            }
            a(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(@Nullable Name name) {
            if ("b".equals(name != null ? name.asString() : null)) {
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.c(this);
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue) {
            if (classLiteralValue != null) {
                return;
            }
            a(0);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2) {
            if (classId == null) {
                a(1);
                throw null;
            }
            if (name2 != null) {
                return;
            }
            a(2);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(@Nullable Name name, @Nullable Object obj) {
        }
    }

    public class d implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public d() {
        }

        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(@Nullable Name name, @Nullable Object obj) {
            if (name == null) {
                return;
            }
            String strAsString = name.asString();
            boolean zEquals = "version".equals(strAsString);
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = ReadKotlinClassHeaderAnnotationVisitor.this;
            if (zEquals) {
                if (obj instanceof int[]) {
                    readKotlinClassHeaderAnnotationVisitor.f80941a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strAsString)) {
                readKotlinClassHeaderAnnotationVisitor.f80942b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@Nullable Name name, @NotNull ClassId classId) {
            if (classId != null) {
                return null;
            }
            a(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(@Nullable Name name) {
            String strAsString = name != null ? name.asString() : null;
            if ("data".equals(strAsString) || "filePartClassNames".equals(strAsString)) {
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.d(this);
            }
            if ("strings".equals(strAsString)) {
                return new e(this);
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue) {
            if (classLiteralValue != null) {
                return;
            }
            a(0);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2) {
            if (classId == null) {
                a(1);
                throw null;
            }
            if (name2 != null) {
                return;
            }
            a(2);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public void visitEnd() {
    }
}

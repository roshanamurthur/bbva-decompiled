package kotlin.reflect.jvm.internal.impl.builtins;

import bk.w;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v3 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[], still in use, count: 1, list:
  (r14v3 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[]) from 0x0078: INVOKE (r14v3 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:121)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: PrimitiveType.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    public static final Companion Companion;

    @JvmField
    @NotNull
    public static final Set<PrimitiveType> NUMBER_TYPES;

    @NotNull
    private final Lazy arrayTypeFqName$delegate;

    @NotNull
    private final Name arrayTypeName;

    @NotNull
    private final Lazy typeFqName$delegate;

    @NotNull
    private final Name typeName;

    /* JADX INFO: compiled from: PrimitiveType.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: PrimitiveType.kt */
    public static final class a extends Lambda implements Function0<FqName> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final FqName invoke() {
            FqName fqNameChild = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(PrimitiveType.this.getArrayTypeName());
            Intrinsics.checkNotNullExpressionValue(fqNameChild, "child(...)");
            return fqNameChild;
        }
    }

    /* JADX INFO: compiled from: PrimitiveType.kt */
    public static final class b extends Lambda implements Function0<FqName> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final FqName invoke() {
            FqName fqNameChild = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(PrimitiveType.this.getTypeName());
            Intrinsics.checkNotNullExpressionValue(fqNameChild, "child(...)");
            return fqNameChild;
        }
    }

    static {
        PrimitiveType primitiveType = CHAR;
        PrimitiveType primitiveType2 = BYTE;
        PrimitiveType primitiveType3 = SHORT;
        PrimitiveType primitiveType4 = INT;
        PrimitiveType primitiveType5 = FLOAT;
        PrimitiveType primitiveType6 = LONG;
        PrimitiveType primitiveType7 = DOUBLE;
        $ENTRIES = EnumEntriesKt.enumEntries(primitiveTypeArr);
        Companion = new Companion(null);
        NUMBER_TYPES = w.setOf((Object[]) new PrimitiveType[]{primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7});
    }

    public PrimitiveType(String str) {
        super(str, i);
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        this.typeName = nameIdentifier;
        Name nameIdentifier2 = Name.identifier(str.concat("Array"));
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        this.arrayTypeName = nameIdentifier2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.typeFqName$delegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new b());
        this.arrayTypeFqName$delegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new a());
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) $VALUES.clone();
    }

    @NotNull
    public final FqName getArrayTypeFqName() {
        return (FqName) this.arrayTypeFqName$delegate.getValue();
    }

    @NotNull
    public final Name getArrayTypeName() {
        return this.arrayTypeName;
    }

    @NotNull
    public final FqName getTypeFqName() {
        return (FqName) this.typeFqName$delegate.getValue();
    }

    @NotNull
    public final Name getTypeName() {
        return this.typeName;
    }
}

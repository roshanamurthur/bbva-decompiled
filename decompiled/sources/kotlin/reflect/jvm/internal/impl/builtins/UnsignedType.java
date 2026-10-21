package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: UnsignedType.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class UnsignedType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UnsignedType[] $VALUES;
    public static final UnsignedType UBYTE;
    public static final UnsignedType UINT;
    public static final UnsignedType ULONG;
    public static final UnsignedType USHORT;

    @NotNull
    private final ClassId arrayClassId;

    @NotNull
    private final ClassId classId;

    @NotNull
    private final Name typeName;

    static {
        ClassId classIdFromString = ClassId.fromString("kotlin/UByte");
        Intrinsics.checkNotNullExpressionValue(classIdFromString, "fromString(...)");
        UnsignedType unsignedType = new UnsignedType("UBYTE", 0, classIdFromString);
        UBYTE = unsignedType;
        ClassId classIdFromString2 = ClassId.fromString("kotlin/UShort");
        Intrinsics.checkNotNullExpressionValue(classIdFromString2, "fromString(...)");
        UnsignedType unsignedType2 = new UnsignedType("USHORT", 1, classIdFromString2);
        USHORT = unsignedType2;
        ClassId classIdFromString3 = ClassId.fromString("kotlin/UInt");
        Intrinsics.checkNotNullExpressionValue(classIdFromString3, "fromString(...)");
        UnsignedType unsignedType3 = new UnsignedType("UINT", 2, classIdFromString3);
        UINT = unsignedType3;
        ClassId classIdFromString4 = ClassId.fromString("kotlin/ULong");
        Intrinsics.checkNotNullExpressionValue(classIdFromString4, "fromString(...)");
        UnsignedType unsignedType4 = new UnsignedType("ULONG", 3, classIdFromString4);
        ULONG = unsignedType4;
        UnsignedType[] unsignedTypeArr = {unsignedType, unsignedType2, unsignedType3, unsignedType4};
        $VALUES = unsignedTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(unsignedTypeArr);
    }

    public UnsignedType(String str, int i10, ClassId classId) {
        super(str, i10);
        this.classId = classId;
        Name shortClassName = classId.getShortClassName();
        Intrinsics.checkNotNullExpressionValue(shortClassName, "getShortClassName(...)");
        this.typeName = shortClassName;
        this.arrayClassId = new ClassId(classId.getPackageFqName(), Name.identifier(shortClassName.asString() + "Array"));
    }

    public static UnsignedType valueOf(String str) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, str);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) $VALUES.clone();
    }

    @NotNull
    public final ClassId getArrayClassId() {
        return this.arrayClassId;
    }

    @NotNull
    public final ClassId getClassId() {
        return this.classId;
    }

    @NotNull
    public final Name getTypeName() {
        return this.typeName;
    }
}

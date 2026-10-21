package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTEARRAY' uses external variables
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
public final class UnsignedArrayType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UnsignedArrayType[] $VALUES;
    public static final UnsignedArrayType UBYTEARRAY;
    public static final UnsignedArrayType UINTARRAY;
    public static final UnsignedArrayType ULONGARRAY;
    public static final UnsignedArrayType USHORTARRAY;

    @NotNull
    private final ClassId classId;

    @NotNull
    private final Name typeName;

    static {
        ClassId classIdFromString = ClassId.fromString("kotlin/UByteArray");
        Intrinsics.checkNotNullExpressionValue(classIdFromString, "fromString(...)");
        UnsignedArrayType unsignedArrayType = new UnsignedArrayType("UBYTEARRAY", 0, classIdFromString);
        UBYTEARRAY = unsignedArrayType;
        ClassId classIdFromString2 = ClassId.fromString("kotlin/UShortArray");
        Intrinsics.checkNotNullExpressionValue(classIdFromString2, "fromString(...)");
        UnsignedArrayType unsignedArrayType2 = new UnsignedArrayType("USHORTARRAY", 1, classIdFromString2);
        USHORTARRAY = unsignedArrayType2;
        ClassId classIdFromString3 = ClassId.fromString("kotlin/UIntArray");
        Intrinsics.checkNotNullExpressionValue(classIdFromString3, "fromString(...)");
        UnsignedArrayType unsignedArrayType3 = new UnsignedArrayType("UINTARRAY", 2, classIdFromString3);
        UINTARRAY = unsignedArrayType3;
        ClassId classIdFromString4 = ClassId.fromString("kotlin/ULongArray");
        Intrinsics.checkNotNullExpressionValue(classIdFromString4, "fromString(...)");
        UnsignedArrayType unsignedArrayType4 = new UnsignedArrayType("ULONGARRAY", 3, classIdFromString4);
        ULONGARRAY = unsignedArrayType4;
        UnsignedArrayType[] unsignedArrayTypeArr = {unsignedArrayType, unsignedArrayType2, unsignedArrayType3, unsignedArrayType4};
        $VALUES = unsignedArrayTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(unsignedArrayTypeArr);
    }

    public UnsignedArrayType(String str, int i10, ClassId classId) {
        super(str, i10);
        this.classId = classId;
        Name shortClassName = classId.getShortClassName();
        Intrinsics.checkNotNullExpressionValue(shortClassName, "getShortClassName(...)");
        this.typeName = shortClassName;
    }

    public static UnsignedArrayType valueOf(String str) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, str);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) $VALUES.clone();
    }

    @NotNull
    public final Name getTypeName() {
        return this.typeName;
    }
}

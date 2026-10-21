package flexjson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class BasicType {
    private static final /* synthetic */ BasicType[] $VALUES;
    public static final BasicType ARRAY;
    public static final BasicType OBJECT;

    static {
        BasicType basicType = new BasicType("OBJECT", 0);
        OBJECT = basicType;
        BasicType basicType2 = new BasicType("ARRAY", 1);
        ARRAY = basicType2;
        $VALUES = new BasicType[]{basicType, basicType2};
    }

    public BasicType() {
        throw null;
    }

    public static BasicType valueOf(String str) {
        return (BasicType) Enum.valueOf(BasicType.class, str);
    }

    public static BasicType[] values() {
        return (BasicType[]) $VALUES.clone();
    }
}

package flexjson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class SerializationType {
    private static final /* synthetic */ SerializationType[] $VALUES;
    public static final SerializationType DEEP;
    public static final SerializationType SHALLOW;

    static {
        SerializationType serializationType = new SerializationType("DEEP", 0);
        DEEP = serializationType;
        SerializationType serializationType2 = new SerializationType("SHALLOW", 1);
        SHALLOW = serializationType2;
        $VALUES = new SerializationType[]{serializationType, serializationType2};
    }

    public SerializationType() {
        throw null;
    }

    public static SerializationType valueOf(String str) {
        return (SerializationType) Enum.valueOf(SerializationType.class, str);
    }

    public static SerializationType[] values() {
        return (SerializationType[]) $VALUES.clone();
    }
}

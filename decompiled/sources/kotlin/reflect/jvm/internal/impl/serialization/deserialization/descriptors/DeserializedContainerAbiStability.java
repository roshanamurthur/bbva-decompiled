package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: DeserializedContainerSource.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DeserializedContainerAbiStability {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeserializedContainerAbiStability[] $VALUES;
    public static final DeserializedContainerAbiStability FIR_UNSTABLE;
    public static final DeserializedContainerAbiStability IR_UNSTABLE;
    public static final DeserializedContainerAbiStability STABLE;

    static {
        DeserializedContainerAbiStability deserializedContainerAbiStability = new DeserializedContainerAbiStability("STABLE", 0);
        STABLE = deserializedContainerAbiStability;
        DeserializedContainerAbiStability deserializedContainerAbiStability2 = new DeserializedContainerAbiStability("FIR_UNSTABLE", 1);
        FIR_UNSTABLE = deserializedContainerAbiStability2;
        DeserializedContainerAbiStability deserializedContainerAbiStability3 = new DeserializedContainerAbiStability("IR_UNSTABLE", 2);
        IR_UNSTABLE = deserializedContainerAbiStability3;
        DeserializedContainerAbiStability[] deserializedContainerAbiStabilityArr = {deserializedContainerAbiStability, deserializedContainerAbiStability2, deserializedContainerAbiStability3};
        $VALUES = deserializedContainerAbiStabilityArr;
        $ENTRIES = EnumEntriesKt.enumEntries(deserializedContainerAbiStabilityArr);
    }

    public DeserializedContainerAbiStability() {
        throw null;
    }

    public static DeserializedContainerAbiStability valueOf(String str) {
        return (DeserializedContainerAbiStability) Enum.valueOf(DeserializedContainerAbiStability.class, str);
    }

    public static DeserializedContainerAbiStability[] values() {
        return (DeserializedContainerAbiStability[]) $VALUES.clone();
    }
}

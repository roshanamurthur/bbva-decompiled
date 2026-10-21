package kotlin.reflect.jvm.internal.impl.renderer;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class PropertyAccessorRenderingPolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PropertyAccessorRenderingPolicy[] $VALUES;
    public static final PropertyAccessorRenderingPolicy DEBUG;
    public static final PropertyAccessorRenderingPolicy NONE;
    public static final PropertyAccessorRenderingPolicy PRETTY;

    static {
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy = new PropertyAccessorRenderingPolicy("PRETTY", 0);
        PRETTY = propertyAccessorRenderingPolicy;
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy2 = new PropertyAccessorRenderingPolicy("DEBUG", 1);
        DEBUG = propertyAccessorRenderingPolicy2;
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy3 = new PropertyAccessorRenderingPolicy(ExpectedUserActionOnPoiTypes.NONE, 2);
        NONE = propertyAccessorRenderingPolicy3;
        PropertyAccessorRenderingPolicy[] propertyAccessorRenderingPolicyArr = {propertyAccessorRenderingPolicy, propertyAccessorRenderingPolicy2, propertyAccessorRenderingPolicy3};
        $VALUES = propertyAccessorRenderingPolicyArr;
        $ENTRIES = EnumEntriesKt.enumEntries(propertyAccessorRenderingPolicyArr);
    }

    public PropertyAccessorRenderingPolicy() {
        throw null;
    }

    public static PropertyAccessorRenderingPolicy valueOf(String str) {
        return (PropertyAccessorRenderingPolicy) Enum.valueOf(PropertyAccessorRenderingPolicy.class, str);
    }

    public static PropertyAccessorRenderingPolicy[] values() {
        return (PropertyAccessorRenderingPolicy[]) $VALUES.clone();
    }
}

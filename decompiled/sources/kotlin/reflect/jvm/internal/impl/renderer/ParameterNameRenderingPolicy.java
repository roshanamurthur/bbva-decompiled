package kotlin.reflect.jvm.internal.impl.renderer;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ParameterNameRenderingPolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ParameterNameRenderingPolicy[] $VALUES;
    public static final ParameterNameRenderingPolicy ALL;
    public static final ParameterNameRenderingPolicy NONE;
    public static final ParameterNameRenderingPolicy ONLY_NON_SYNTHESIZED;

    static {
        ParameterNameRenderingPolicy parameterNameRenderingPolicy = new ParameterNameRenderingPolicy("ALL", 0);
        ALL = parameterNameRenderingPolicy;
        ParameterNameRenderingPolicy parameterNameRenderingPolicy2 = new ParameterNameRenderingPolicy("ONLY_NON_SYNTHESIZED", 1);
        ONLY_NON_SYNTHESIZED = parameterNameRenderingPolicy2;
        ParameterNameRenderingPolicy parameterNameRenderingPolicy3 = new ParameterNameRenderingPolicy(ExpectedUserActionOnPoiTypes.NONE, 2);
        NONE = parameterNameRenderingPolicy3;
        ParameterNameRenderingPolicy[] parameterNameRenderingPolicyArr = {parameterNameRenderingPolicy, parameterNameRenderingPolicy2, parameterNameRenderingPolicy3};
        $VALUES = parameterNameRenderingPolicyArr;
        $ENTRIES = EnumEntriesKt.enumEntries(parameterNameRenderingPolicyArr);
    }

    public ParameterNameRenderingPolicy() {
        throw null;
    }

    public static ParameterNameRenderingPolicy valueOf(String str) {
        return (ParameterNameRenderingPolicy) Enum.valueOf(ParameterNameRenderingPolicy.class, str);
    }

    public static ParameterNameRenderingPolicy[] values() {
        return (ParameterNameRenderingPolicy[]) $VALUES.clone();
    }
}

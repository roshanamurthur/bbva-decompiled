package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class OverrideRenderingPolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OverrideRenderingPolicy[] $VALUES;
    public static final OverrideRenderingPolicy RENDER_OPEN;
    public static final OverrideRenderingPolicy RENDER_OPEN_OVERRIDE;
    public static final OverrideRenderingPolicy RENDER_OVERRIDE;

    static {
        OverrideRenderingPolicy overrideRenderingPolicy = new OverrideRenderingPolicy("RENDER_OVERRIDE", 0);
        RENDER_OVERRIDE = overrideRenderingPolicy;
        OverrideRenderingPolicy overrideRenderingPolicy2 = new OverrideRenderingPolicy("RENDER_OPEN", 1);
        RENDER_OPEN = overrideRenderingPolicy2;
        OverrideRenderingPolicy overrideRenderingPolicy3 = new OverrideRenderingPolicy("RENDER_OPEN_OVERRIDE", 2);
        RENDER_OPEN_OVERRIDE = overrideRenderingPolicy3;
        OverrideRenderingPolicy[] overrideRenderingPolicyArr = {overrideRenderingPolicy, overrideRenderingPolicy2, overrideRenderingPolicy3};
        $VALUES = overrideRenderingPolicyArr;
        $ENTRIES = EnumEntriesKt.enumEntries(overrideRenderingPolicyArr);
    }

    public OverrideRenderingPolicy() {
        throw null;
    }

    public static OverrideRenderingPolicy valueOf(String str) {
        return (OverrideRenderingPolicy) Enum.valueOf(OverrideRenderingPolicy.class, str);
    }

    public static OverrideRenderingPolicy[] values() {
        return (OverrideRenderingPolicy[]) $VALUES.clone();
    }
}

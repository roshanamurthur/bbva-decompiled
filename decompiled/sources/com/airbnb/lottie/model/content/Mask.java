package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;

/* JADX INFO: loaded from: classes2.dex */
public class Mask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaskMode f26008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatableShapeValue f26009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableIntegerValue f26010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26011d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MaskMode {
        private static final /* synthetic */ MaskMode[] $VALUES;
        public static final MaskMode MASK_MODE_ADD;
        public static final MaskMode MASK_MODE_INTERSECT;
        public static final MaskMode MASK_MODE_NONE;
        public static final MaskMode MASK_MODE_SUBTRACT;

        static {
            MaskMode maskMode = new MaskMode("MASK_MODE_ADD", 0);
            MASK_MODE_ADD = maskMode;
            MaskMode maskMode2 = new MaskMode("MASK_MODE_SUBTRACT", 1);
            MASK_MODE_SUBTRACT = maskMode2;
            MaskMode maskMode3 = new MaskMode("MASK_MODE_INTERSECT", 2);
            MASK_MODE_INTERSECT = maskMode3;
            MaskMode maskMode4 = new MaskMode("MASK_MODE_NONE", 3);
            MASK_MODE_NONE = maskMode4;
            $VALUES = new MaskMode[]{maskMode, maskMode2, maskMode3, maskMode4};
        }

        public MaskMode() {
            throw null;
        }

        public static MaskMode valueOf(String str) {
            return (MaskMode) Enum.valueOf(MaskMode.class, str);
        }

        public static MaskMode[] values() {
            return (MaskMode[]) $VALUES.clone();
        }
    }

    public Mask(MaskMode maskMode, AnimatableShapeValue animatableShapeValue, AnimatableIntegerValue animatableIntegerValue, boolean z10) {
        this.f26008a = maskMode;
        this.f26009b = animatableShapeValue;
        this.f26010c = animatableIntegerValue;
        this.f26011d = z10;
    }

    public MaskMode getMaskMode() {
        return this.f26008a;
    }

    public AnimatableShapeValue getMaskPath() {
        return this.f26009b;
    }

    public AnimatableIntegerValue getOpacity() {
        return this.f26010c;
    }

    public boolean isInverted() {
        return this.f26011d;
    }
}

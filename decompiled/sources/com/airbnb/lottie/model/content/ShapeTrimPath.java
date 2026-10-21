package com.airbnb.lottie.model.content;

import androidx.appcompat.widget.g0;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.TrimPathContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeTrimPath implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f26067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableFloatValue f26068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AnimatableFloatValue f26069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnimatableFloatValue f26070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26071f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type INDIVIDUALLY;
        public static final Type SIMULTANEOUSLY;

        static {
            Type type = new Type("SIMULTANEOUSLY", 0);
            SIMULTANEOUSLY = type;
            Type type2 = new Type("INDIVIDUALLY", 1);
            INDIVIDUALLY = type2;
            $VALUES = new Type[]{type, type2};
        }

        public Type() {
            throw null;
        }

        public static Type forId(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException(g0.c("Unknown trim path type ", i10));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public ShapeTrimPath(String str, Type type, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, boolean z10) {
        this.f26066a = str;
        this.f26067b = type;
        this.f26068c = animatableFloatValue;
        this.f26069d = animatableFloatValue2;
        this.f26070e = animatableFloatValue3;
        this.f26071f = z10;
    }

    public AnimatableFloatValue getEnd() {
        return this.f26069d;
    }

    public String getName() {
        return this.f26066a;
    }

    public AnimatableFloatValue getOffset() {
        return this.f26070e;
    }

    public AnimatableFloatValue getStart() {
        return this.f26068c;
    }

    public Type getType() {
        return this.f26067b;
    }

    public boolean isHidden() {
        return this.f26071f;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new TrimPathContent(baseLayer, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.f26068c + ", end: " + this.f26069d + ", offset: " + this.f26070e + "}";
    }
}

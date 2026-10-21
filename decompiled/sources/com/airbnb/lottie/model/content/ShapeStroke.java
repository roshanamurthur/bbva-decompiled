package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.StrokeContent;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeStroke implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final AnimatableFloatValue f26055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<AnimatableFloatValue> f26056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AnimatableColorValue f26057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnimatableIntegerValue f26058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AnimatableFloatValue f26059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LineCapType f26060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LineJoinType f26061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f26062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f26063j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LineCapType {
        private static final /* synthetic */ LineCapType[] $VALUES;
        public static final LineCapType BUTT;
        public static final LineCapType ROUND;
        public static final LineCapType UNKNOWN;

        static {
            LineCapType lineCapType = new LineCapType("BUTT", 0);
            BUTT = lineCapType;
            LineCapType lineCapType2 = new LineCapType("ROUND", 1);
            ROUND = lineCapType2;
            LineCapType lineCapType3 = new LineCapType("UNKNOWN", 2);
            UNKNOWN = lineCapType3;
            $VALUES = new LineCapType[]{lineCapType, lineCapType2, lineCapType3};
        }

        public LineCapType() {
            throw null;
        }

        public static LineCapType valueOf(String str) {
            return (LineCapType) Enum.valueOf(LineCapType.class, str);
        }

        public static LineCapType[] values() {
            return (LineCapType[]) $VALUES.clone();
        }

        public Paint.Cap toPaintCap() {
            int i10 = a.f26064a[ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LineJoinType {
        private static final /* synthetic */ LineJoinType[] $VALUES;
        public static final LineJoinType BEVEL;
        public static final LineJoinType MITER;
        public static final LineJoinType ROUND;

        static {
            LineJoinType lineJoinType = new LineJoinType("MITER", 0);
            MITER = lineJoinType;
            LineJoinType lineJoinType2 = new LineJoinType("ROUND", 1);
            ROUND = lineJoinType2;
            LineJoinType lineJoinType3 = new LineJoinType("BEVEL", 2);
            BEVEL = lineJoinType3;
            $VALUES = new LineJoinType[]{lineJoinType, lineJoinType2, lineJoinType3};
        }

        public LineJoinType() {
            throw null;
        }

        public static LineJoinType valueOf(String str) {
            return (LineJoinType) Enum.valueOf(LineJoinType.class, str);
        }

        public static LineJoinType[] values() {
            return (LineJoinType[]) $VALUES.clone();
        }

        public Paint.Join toPaintJoin() {
            int i10 = a.f26065b[ordinal()];
            if (i10 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i10 == 2) {
                return Paint.Join.MITER;
            }
            if (i10 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f26065b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            f26065b = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26065b[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26065b[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f26064a = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26064a[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26064a[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, @Nullable AnimatableFloatValue animatableFloatValue, List<AnimatableFloatValue> list, AnimatableColorValue animatableColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue2, LineCapType lineCapType, LineJoinType lineJoinType, float f6, boolean z10) {
        this.f26054a = str;
        this.f26055b = animatableFloatValue;
        this.f26056c = list;
        this.f26057d = animatableColorValue;
        this.f26058e = animatableIntegerValue;
        this.f26059f = animatableFloatValue2;
        this.f26060g = lineCapType;
        this.f26061h = lineJoinType;
        this.f26062i = f6;
        this.f26063j = z10;
    }

    public LineCapType getCapType() {
        return this.f26060g;
    }

    public AnimatableColorValue getColor() {
        return this.f26057d;
    }

    public AnimatableFloatValue getDashOffset() {
        return this.f26055b;
    }

    public LineJoinType getJoinType() {
        return this.f26061h;
    }

    public List<AnimatableFloatValue> getLineDashPattern() {
        return this.f26056c;
    }

    public float getMiterLimit() {
        return this.f26062i;
    }

    public String getName() {
        return this.f26054a;
    }

    public AnimatableIntegerValue getOpacity() {
        return this.f26058e;
    }

    public AnimatableFloatValue getWidth() {
        return this.f26059f;
    }

    public boolean isHidden() {
        return this.f26063j;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new StrokeContent(lottieDrawable, baseLayer, this);
    }
}

package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.c;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.value.Keyframe;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class Layer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ContentModel> f26100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LottieComposition f26101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayerType f26104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f26105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f26106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Mask> f26107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AnimatableTransform f26108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f26109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f26110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f26111l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f26112n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f26113o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f26114p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final AnimatableTextFrame f26115q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final AnimatableTextProperties f26116r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final AnimatableFloatValue f26117s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<Keyframe<Float>> f26118t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MatteType f26119u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f26120v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final BlurEffect f26121w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final DropShadowEffect f26122x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LBlendMode f26123y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LayerType {
        private static final /* synthetic */ LayerType[] $VALUES;
        public static final LayerType IMAGE;
        public static final LayerType NULL;
        public static final LayerType PRE_COMP;
        public static final LayerType SHAPE;
        public static final LayerType SOLID;
        public static final LayerType TEXT;
        public static final LayerType UNKNOWN;

        static {
            LayerType layerType = new LayerType("PRE_COMP", 0);
            PRE_COMP = layerType;
            LayerType layerType2 = new LayerType("SOLID", 1);
            SOLID = layerType2;
            LayerType layerType3 = new LayerType("IMAGE", 2);
            IMAGE = layerType3;
            LayerType layerType4 = new LayerType(VDVideoSelfieConfiguration.NULL, 3);
            NULL = layerType4;
            LayerType layerType5 = new LayerType("SHAPE", 4);
            SHAPE = layerType5;
            LayerType layerType6 = new LayerType("TEXT", 5);
            TEXT = layerType6;
            LayerType layerType7 = new LayerType("UNKNOWN", 6);
            UNKNOWN = layerType7;
            $VALUES = new LayerType[]{layerType, layerType2, layerType3, layerType4, layerType5, layerType6, layerType7};
        }

        public LayerType() {
            throw null;
        }

        public static LayerType valueOf(String str) {
            return (LayerType) Enum.valueOf(LayerType.class, str);
        }

        public static LayerType[] values() {
            return (LayerType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MatteType {
        private static final /* synthetic */ MatteType[] $VALUES;
        public static final MatteType ADD;
        public static final MatteType INVERT;
        public static final MatteType LUMA;
        public static final MatteType LUMA_INVERTED;
        public static final MatteType NONE;
        public static final MatteType UNKNOWN;

        static {
            MatteType matteType = new MatteType(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = matteType;
            MatteType matteType2 = new MatteType("ADD", 1);
            ADD = matteType2;
            MatteType matteType3 = new MatteType("INVERT", 2);
            INVERT = matteType3;
            MatteType matteType4 = new MatteType("LUMA", 3);
            LUMA = matteType4;
            MatteType matteType5 = new MatteType("LUMA_INVERTED", 4);
            LUMA_INVERTED = matteType5;
            MatteType matteType6 = new MatteType("UNKNOWN", 5);
            UNKNOWN = matteType6;
            $VALUES = new MatteType[]{matteType, matteType2, matteType3, matteType4, matteType5, matteType6};
        }

        public MatteType() {
            throw null;
        }

        public static MatteType valueOf(String str) {
            return (MatteType) Enum.valueOf(MatteType.class, str);
        }

        public static MatteType[] values() {
            return (MatteType[]) $VALUES.clone();
        }
    }

    public Layer(List<ContentModel> list, LottieComposition lottieComposition, String str, long j10, LayerType layerType, long j11, @Nullable String str2, List<Mask> list2, AnimatableTransform animatableTransform, int i10, int i11, int i12, float f6, float f10, float f11, float f12, @Nullable AnimatableTextFrame animatableTextFrame, @Nullable AnimatableTextProperties animatableTextProperties, List<Keyframe<Float>> list3, MatteType matteType, @Nullable AnimatableFloatValue animatableFloatValue, boolean z10, @Nullable BlurEffect blurEffect, @Nullable DropShadowEffect dropShadowEffect, LBlendMode lBlendMode) {
        this.f26100a = list;
        this.f26101b = lottieComposition;
        this.f26102c = str;
        this.f26103d = j10;
        this.f26104e = layerType;
        this.f26105f = j11;
        this.f26106g = str2;
        this.f26107h = list2;
        this.f26108i = animatableTransform;
        this.f26109j = i10;
        this.f26110k = i11;
        this.f26111l = i12;
        this.m = f6;
        this.f26112n = f10;
        this.f26113o = f11;
        this.f26114p = f12;
        this.f26115q = animatableTextFrame;
        this.f26116r = animatableTextProperties;
        this.f26118t = list3;
        this.f26119u = matteType;
        this.f26117s = animatableFloatValue;
        this.f26120v = z10;
        this.f26121w = blurEffect;
        this.f26122x = dropShadowEffect;
        this.f26123y = lBlendMode;
    }

    @Nullable
    public LBlendMode getBlendMode() {
        return this.f26123y;
    }

    @Nullable
    public BlurEffect getBlurEffect() {
        return this.f26121w;
    }

    @Nullable
    public DropShadowEffect getDropShadowEffect() {
        return this.f26122x;
    }

    public long getId() {
        return this.f26103d;
    }

    public LayerType getLayerType() {
        return this.f26104e;
    }

    public String getName() {
        return this.f26102c;
    }

    @Nullable
    public String getRefId() {
        return this.f26106g;
    }

    public boolean isHidden() {
        return this.f26120v;
    }

    public String toString(String str) {
        int i10;
        StringBuilder sbD = c.d(str);
        sbD.append(getName());
        sbD.append(RootService.LINE_BREAK);
        LottieComposition lottieComposition = this.f26101b;
        Layer layerLayerModelForId = lottieComposition.layerModelForId(this.f26105f);
        if (layerLayerModelForId != null) {
            sbD.append("\t\tParents: ");
            sbD.append(layerLayerModelForId.getName());
            for (Layer layerLayerModelForId2 = lottieComposition.layerModelForId(layerLayerModelForId.f26105f); layerLayerModelForId2 != null; layerLayerModelForId2 = lottieComposition.layerModelForId(layerLayerModelForId2.f26105f)) {
                sbD.append("->");
                sbD.append(layerLayerModelForId2.getName());
            }
            sbD.append(str);
            sbD.append(RootService.LINE_BREAK);
        }
        List<Mask> list = this.f26107h;
        if (!list.isEmpty()) {
            sbD.append(str);
            sbD.append("\tMasks: ");
            sbD.append(list.size());
            sbD.append(RootService.LINE_BREAK);
        }
        int i11 = this.f26109j;
        if (i11 != 0 && (i10 = this.f26110k) != 0) {
            sbD.append(str);
            sbD.append("\tBackground: ");
            sbD.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.f26111l)));
        }
        List<ContentModel> list2 = this.f26100a;
        if (!list2.isEmpty()) {
            sbD.append(str);
            sbD.append("\tShapes:\n");
            for (ContentModel contentModel : list2) {
                sbD.append(str);
                sbD.append("\t\t");
                sbD.append(contentModel);
                sbD.append(RootService.LINE_BREAK);
            }
        }
        return sbD.toString();
    }

    public String toString() {
        return toString("");
    }
}

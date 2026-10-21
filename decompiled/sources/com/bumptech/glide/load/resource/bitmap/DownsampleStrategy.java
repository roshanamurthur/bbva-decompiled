package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.Option;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DownsampleStrategy {
    public static final DownsampleStrategy CENTER_OUTSIDE;
    public static final DownsampleStrategy DEFAULT;
    public static final DownsampleStrategy NONE;
    public static final Option<DownsampleStrategy> OPTION;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f38551a;
    public static final DownsampleStrategy AT_LEAST = new a();
    public static final DownsampleStrategy AT_MOST = new b();
    public static final DownsampleStrategy FIT_CENTER = new e();
    public static final DownsampleStrategy CENTER_INSIDE = new c();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SampleSizeRounding {
        private static final /* synthetic */ SampleSizeRounding[] $VALUES;
        public static final SampleSizeRounding MEMORY;
        public static final SampleSizeRounding QUALITY;

        static {
            SampleSizeRounding sampleSizeRounding = new SampleSizeRounding("MEMORY", 0);
            MEMORY = sampleSizeRounding;
            SampleSizeRounding sampleSizeRounding2 = new SampleSizeRounding("QUALITY", 1);
            QUALITY = sampleSizeRounding2;
            $VALUES = new SampleSizeRounding[]{sampleSizeRounding, sampleSizeRounding2};
        }

        public SampleSizeRounding() {
            throw null;
        }

        public static SampleSizeRounding valueOf(String str) {
            return (SampleSizeRounding) Enum.valueOf(SampleSizeRounding.class, str);
        }

        public static SampleSizeRounding[] values() {
            return (SampleSizeRounding[]) $VALUES.clone();
        }
    }

    public static class a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding getSampleSizeRounding(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float getScaleFactor(int i10, int i11, int i12, int i13) {
            int iMin = Math.min(i11 / i13, i10 / i12);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    public static class b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding getSampleSizeRounding(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float getScaleFactor(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    public static class c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding getSampleSizeRounding(int i10, int i11, int i12, int i13) {
            return getScaleFactor(i10, i11, i12, i13) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.FIT_CENTER.getSampleSizeRounding(i10, i11, i12, i13);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float getScaleFactor(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, DownsampleStrategy.FIT_CENTER.getScaleFactor(i10, i11, i12, i13));
        }
    }

    public static class d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding getSampleSizeRounding(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float getScaleFactor(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    public static class e extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding getSampleSizeRounding(int i10, int i11, int i12, int i13) {
            return DownsampleStrategy.f38551a ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float getScaleFactor(int i10, int i11, int i12, int i13) {
            if (DownsampleStrategy.f38551a) {
                return Math.min(i12 / i10, i13 / i11);
            }
            int iMax = Math.max(i11 / i13, i10 / i12);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    public static class f extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding getSampleSizeRounding(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float getScaleFactor(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    static {
        d dVar = new d();
        CENTER_OUTSIDE = dVar;
        NONE = new f();
        DEFAULT = dVar;
        OPTION = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f38551a = true;
    }

    public abstract SampleSizeRounding getSampleSizeRounding(int i10, int i11, int i12, int i13);

    public abstract float getScaleFactor(int i10, int i11, int i12, int i13);
}

package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes.dex */
public class KeyCycles extends KeyAttributes {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Wave f18658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float[] f18659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float[] f18660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float[] f18661t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Wave {
        private static final /* synthetic */ Wave[] $VALUES;
        public static final Wave COS;
        public static final Wave REVERSE_SAW;
        public static final Wave SAW;
        public static final Wave SIN;
        public static final Wave SQUARE;
        public static final Wave TRIANGLE;

        static {
            Wave wave = new Wave("SIN", 0);
            SIN = wave;
            Wave wave2 = new Wave("SQUARE", 1);
            SQUARE = wave2;
            Wave wave3 = new Wave("TRIANGLE", 2);
            TRIANGLE = wave3;
            Wave wave4 = new Wave("SAW", 3);
            SAW = wave4;
            Wave wave5 = new Wave("REVERSE_SAW", 4);
            REVERSE_SAW = wave5;
            Wave wave6 = new Wave("COS", 5);
            COS = wave6;
            $VALUES = new Wave[]{wave, wave2, wave3, wave4, wave5, wave6};
        }

        public Wave() {
            throw null;
        }

        public static Wave valueOf(String str) {
            return (Wave) Enum.valueOf(Wave.class, str);
        }

        public static Wave[] values() {
            return (Wave[]) $VALUES.clone();
        }
    }

    @Override // androidx.constraintlayout.core.dsl.KeyAttributes
    public void attributesToString(StringBuilder sb2) {
        super.attributesToString(sb2);
        if (this.f18658q != null) {
            sb2.append("shape:'");
            sb2.append(this.f18658q);
            sb2.append("',\n");
        }
        append(sb2, TypedValues.CycleType.S_WAVE_PERIOD, this.f18659r);
        append(sb2, TypedValues.CycleType.S_WAVE_OFFSET, this.f18660s);
        append(sb2, TypedValues.CycleType.S_WAVE_PHASE, this.f18661t);
    }

    public float[] getWaveOffset() {
        return this.f18660s;
    }

    public float[] getWavePeriod() {
        return this.f18659r;
    }

    public float[] getWavePhase() {
        return this.f18661t;
    }

    public Wave getWaveShape() {
        return this.f18658q;
    }

    public void setWaveOffset(float... fArr) {
        this.f18660s = fArr;
    }

    public void setWavePeriod(float... fArr) {
        this.f18659r = fArr;
    }

    public void setWavePhase(float... fArr) {
        this.f18661t = fArr;
    }

    public void setWaveShape(Wave wave) {
        this.f18658q = wave;
    }
}

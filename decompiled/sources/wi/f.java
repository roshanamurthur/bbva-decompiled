package wi;

import com.veridas.camera.parameter.Parameter;
import com.veridas.camera.parameter.ParameterNameTranslator;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: CameraOneParameterNameTranslator.java */
/* JADX INFO: loaded from: classes9.dex */
public final class f implements ParameterNameTranslator {

    /* JADX INFO: compiled from: CameraOneParameterNameTranslator.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f94271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f94272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f94273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f94274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f94275f;

        static {
            int[] iArr = new int[Parameter.WhiteBalanceMode.values().length];
            f94275f = iArr;
            try {
                iArr[Parameter.WhiteBalanceMode.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94275f[Parameter.WhiteBalanceMode.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Parameter.SceneMode.values().length];
            f94274e = iArr2;
            try {
                iArr2[Parameter.SceneMode.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94274e[Parameter.SceneMode.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[Parameter.FocusMode.values().length];
            f94273d = iArr3;
            try {
                iArr3[Parameter.FocusMode.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94273d[Parameter.FocusMode.CONTINUOUS_PICTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f94273d[Parameter.FocusMode.CONTINUOUS_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f94273d[Parameter.FocusMode.EDOF.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f94273d[Parameter.FocusMode.FIXED.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f94273d[Parameter.FocusMode.INFINITY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr4 = new int[Parameter.FlashMode.values().length];
            f94272c = iArr4;
            try {
                iArr4[Parameter.FlashMode.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f94272c[Parameter.FlashMode.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f94272c[Parameter.FlashMode.ON.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f94272c[Parameter.FlashMode.RED_EYE.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f94272c[Parameter.FlashMode.TORCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr5 = new int[Parameter.ColorEffectMode.values().length];
            f94271b = iArr5;
            try {
                iArr5[Parameter.ColorEffectMode.MONO.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f94271b[Parameter.ColorEffectMode.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr6 = new int[Parameter.AntiBandingMode.values().length];
            f94270a = iArr6;
            try {
                iArr6[Parameter.AntiBandingMode.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f94270a[Parameter.AntiBandingMode.FIFTY_HZ.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f94270a[Parameter.AntiBandingMode.SIXTY_HZ.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f94270a[Parameter.AntiBandingMode.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    @Override // com.veridas.camera.parameter.ParameterNameTranslator
    public final Object translate(Parameter.AntiBandingMode antiBandingMode) {
        int i10 = a.f94270a[antiBandingMode.ordinal()];
        if (i10 == 1) {
            return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        }
        if (i10 == 2) {
            return "50hz";
        }
        if (i10 == 3) {
            return "60hz";
        }
        if (i10 != 4) {
            return null;
        }
        return DebugKt.DEBUG_PROPERTY_VALUE_OFF;
    }

    @Override // com.veridas.camera.parameter.ParameterNameTranslator
    public final Object translate(Class<?> cls, String str) {
        if (cls == Parameter.AntiBandingMode.class) {
            str.getClass();
            switch (str) {
                case "off":
                    return Parameter.AntiBandingMode.NONE;
                case "50hz":
                    return Parameter.AntiBandingMode.FIFTY_HZ;
                case "60hz":
                    return Parameter.AntiBandingMode.SIXTY_HZ;
                case "auto":
                    return Parameter.AntiBandingMode.AUTO;
                default:
                    return null;
            }
        }
        if (cls == Parameter.ColorEffectMode.class) {
            str.getClass();
            if (str.equals("mono")) {
                return Parameter.ColorEffectMode.MONO;
            }
            if (str.equals("none")) {
                return Parameter.ColorEffectMode.NONE;
            }
            return null;
        }
        if (cls == Parameter.FlashMode.class) {
            str.getClass();
            switch (str.hashCode()) {
                case 3551:
                    if (!str.equals(DebugKt.DEBUG_PROPERTY_VALUE_ON)) {
                    }
                    break;
                case 109935:
                    if (!str.equals(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                    }
                    break;
                case 3005871:
                    if (!str.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                    }
                    break;
                case 110547964:
                    if (!str.equals("torch")) {
                    }
                    break;
                case 1081542389:
                    if (!str.equals("red-eye")) {
                    }
                    break;
                default:
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*
                Method dump skipped, instruction units count: 438
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: wi.f.translate(java.lang.Class, java.lang.String):java.lang.Object");
        }

        @Override // com.veridas.camera.parameter.ParameterNameTranslator
        public final Object translate(Parameter.ColorEffectMode colorEffectMode) {
            int i10 = a.f94271b[colorEffectMode.ordinal()];
            if (i10 == 1) {
                return "mono";
            }
            if (i10 != 2) {
                return null;
            }
            return "none";
        }

        @Override // com.veridas.camera.parameter.ParameterNameTranslator
        public final Object translate(Parameter.FlashMode flashMode) {
            int i10 = a.f94272c[flashMode.ordinal()];
            if (i10 == 1) {
                return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            }
            if (i10 == 2) {
                return DebugKt.DEBUG_PROPERTY_VALUE_OFF;
            }
            if (i10 == 3) {
                return DebugKt.DEBUG_PROPERTY_VALUE_ON;
            }
            if (i10 == 4) {
                return "red-eye";
            }
            if (i10 != 5) {
                return null;
            }
            return "torch";
        }

        @Override // com.veridas.camera.parameter.ParameterNameTranslator
        public final Object translate(Parameter.FocusMode focusMode) {
            switch (a.f94273d[focusMode.ordinal()]) {
                case 1:
                    return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                case 2:
                    return "continuous-picture";
                case 3:
                    return "continuous-video";
                case 4:
                    return "edof";
                case 5:
                    return "fixed";
                case 6:
                    return "infinity";
                default:
                    return null;
            }
        }

        @Override // com.veridas.camera.parameter.ParameterNameTranslator
        public final Object translate(Parameter.SceneMode sceneMode) {
            int i10 = a.f94274e[sceneMode.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            }
            return null;
        }

        @Override // com.veridas.camera.parameter.ParameterNameTranslator
        public final Object translate(Parameter.WhiteBalanceMode whiteBalanceMode) {
            int i10 = a.f94275f[whiteBalanceMode.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            }
            return null;
        }
    }

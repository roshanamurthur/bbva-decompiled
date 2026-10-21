package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class RenderMode {
    private static final /* synthetic */ RenderMode[] $VALUES;
    public static final RenderMode AUTOMATIC;
    public static final RenderMode HARDWARE;
    public static final RenderMode SOFTWARE;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25668a;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f25668a = iArr;
            try {
                iArr[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25668a[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25668a[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        RenderMode renderMode = new RenderMode("AUTOMATIC", 0);
        AUTOMATIC = renderMode;
        RenderMode renderMode2 = new RenderMode("HARDWARE", 1);
        HARDWARE = renderMode2;
        RenderMode renderMode3 = new RenderMode("SOFTWARE", 2);
        SOFTWARE = renderMode3;
        $VALUES = new RenderMode[]{renderMode, renderMode2, renderMode3};
    }

    public RenderMode() {
        throw null;
    }

    public static RenderMode valueOf(String str) {
        return (RenderMode) Enum.valueOf(RenderMode.class, str);
    }

    public static RenderMode[] values() {
        return (RenderMode[]) $VALUES.clone();
    }

    public boolean useSoftwareRendering(int i10, boolean z10, int i11) {
        int i12 = a.f25668a[ordinal()];
        if (i12 == 1) {
            return false;
        }
        if (i12 != 2) {
            return (z10 && i10 < 28) || i11 > 4 || i10 <= 25;
        }
        return true;
    }
}

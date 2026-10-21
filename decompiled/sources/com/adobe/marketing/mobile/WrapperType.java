package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
public enum WrapperType {
    NONE("N"),
    REACT_NATIVE("R"),
    FLUTTER("F"),
    CORDOVA("C"),
    UNITY("U"),
    XAMARIN("X");

    private String wrapperTag;

    /* JADX INFO: renamed from: com.adobe.marketing.mobile.WrapperType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$marketing$mobile$WrapperType;

        static {
            int[] iArr = new int[WrapperType.values().length];
            $SwitchMap$com$adobe$marketing$mobile$WrapperType = iArr;
            try {
                iArr[WrapperType.REACT_NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$WrapperType[WrapperType.FLUTTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$WrapperType[WrapperType.CORDOVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$WrapperType[WrapperType.UNITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$WrapperType[WrapperType.XAMARIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$WrapperType[WrapperType.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    WrapperType(String str) {
        this.wrapperTag = str;
    }

    public static WrapperType fromString(String str) {
        if ("R".equals(str)) {
            return REACT_NATIVE;
        }
        if ("F".equals(str)) {
            return FLUTTER;
        }
        if ("C".equals(str)) {
            return CORDOVA;
        }
        if ("U".equals(str)) {
            return UNITY;
        }
        return "X".equals(str) ? XAMARIN : NONE;
    }

    public String getFriendlyName() {
        int i10 = AnonymousClass1.$SwitchMap$com$adobe$marketing$mobile$WrapperType[ordinal()];
        if (i10 == 1) {
            return "React Native";
        }
        if (i10 == 2) {
            return "Flutter";
        }
        if (i10 == 3) {
            return "Cordova";
        }
        if (i10 != 4) {
            return i10 != 5 ? "None" : "Xamarin";
        }
        return " Unity";
    }

    public String getWrapperTag() {
        return this.wrapperTag;
    }
}

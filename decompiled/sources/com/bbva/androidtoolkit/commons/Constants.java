package com.bbva.androidtoolkit.commons;

/* JADX INFO: loaded from: classes2.dex */
public class Constants {

    public enum SCREEN_DENSITY {
        LDPI("ldpi"),
        MDPI("mdpi"),
        HDPI("hdpi"),
        XHDPI("xhdpi"),
        XXHDPI("xxhdpi"),
        XXXHDPI("xxxhdpi");

        private String density;

        SCREEN_DENSITY(String str) {
            this.density = str;
        }

        public static SCREEN_DENSITY getEnum(String str) {
            SCREEN_DENSITY screen_density = LDPI;
            if (screen_density.getScreenDensity().equals(str)) {
                return screen_density;
            }
            SCREEN_DENSITY screen_density2 = MDPI;
            if (screen_density2.getScreenDensity().equals(str)) {
                return screen_density2;
            }
            SCREEN_DENSITY screen_density3 = HDPI;
            if (screen_density3.getScreenDensity().equals(str)) {
                return screen_density3;
            }
            SCREEN_DENSITY screen_density4 = XHDPI;
            if (screen_density4.getScreenDensity().equals(str)) {
                return screen_density4;
            }
            SCREEN_DENSITY screen_density5 = XXHDPI;
            if (screen_density5.getScreenDensity().equals(str)) {
                return screen_density5;
            }
            SCREEN_DENSITY screen_density6 = XXXHDPI;
            return screen_density6.getScreenDensity().equals(str) ? screen_density6 : screen_density2;
        }

        public String getScreenDensity() {
            return this.density;
        }

        public void setScreenDensity(String str) {
            this.density = str;
        }

        public static SCREEN_DENSITY getEnum(float f6) {
            if (f6 <= 0.75f) {
                return LDPI;
            }
            if (f6 == 1.0f) {
                return MDPI;
            }
            if (f6 == 1.5f) {
                return HDPI;
            }
            if (f6 == 2.0f) {
                return XHDPI;
            }
            if (f6 == 3.0f) {
                return XXHDPI;
            }
            if (f6 > 3.0f) {
                return XXXHDPI;
            }
            return MDPI;
        }
    }
}

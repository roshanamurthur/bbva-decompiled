package com.airbnb.lottie.model;

/* JADX INFO: loaded from: classes2.dex */
public class Marker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25963a;
    public final float durationFrames;
    public final float startFrame;

    public Marker(String str, float f6, float f10) {
        this.f25963a = str;
        this.durationFrames = f10;
        this.startFrame = f6;
    }

    public float getDurationFrames() {
        return this.durationFrames;
    }

    public String getName() {
        return this.f25963a;
    }

    public float getStartFrame() {
        return this.startFrame;
    }

    public boolean matchesName(String str) {
        String str2 = this.f25963a;
        if (str2.equalsIgnoreCase(str)) {
            return true;
        }
        return str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str);
    }
}

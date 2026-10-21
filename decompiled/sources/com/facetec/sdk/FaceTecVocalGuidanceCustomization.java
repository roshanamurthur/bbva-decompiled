package com.facetec.sdk;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public class FaceTecVocalGuidanceCustomization {
    public VocalGuidanceMode mode = VocalGuidanceMode.MINIMAL_VOCAL_GUIDANCE;
    public int pleaseFrameYourFaceInTheOvalSoundFile = -1;
    public int pleaseMoveCloserSoundFile = -1;
    public int pleaseRetrySoundFile = -1;
    public int uploadingSoundFile = -1;
    public int facescanSuccessfulSoundFile = -1;
    public int pleasePressTheButtonToStartSoundFile = -1;

    public enum VocalGuidanceMode {
        MINIMAL_VOCAL_GUIDANCE("MINIMAL_VOCAL_GUIDANCE"),
        FULL_VOCAL_GUIDANCE("FULL_VOCAL_GUIDANCE"),
        NO_VOCAL_GUIDANCE("NO_VOCAL_GUIDANCE");


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f40134d;

        VocalGuidanceMode(String str) {
            this.f40134d = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public final String toString() {
            return this.f40134d;
        }
    }
}

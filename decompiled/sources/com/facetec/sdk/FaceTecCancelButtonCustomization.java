package com.facetec.sdk;

import android.graphics.Rect;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes9.dex */
public final class FaceTecCancelButtonCustomization {

    @DrawableRes
    public int customImage = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    ButtonLocation f40073e = ButtonLocation.TOP_LEFT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    Rect f40072a = null;
    public boolean hideForCameraPermissions = false;

    public enum ButtonLocation {
        TOP_LEFT("Top Left"),
        TOP_RIGHT("Top Right"),
        CUSTOM(TypedValues.Custom.NAME),
        DISABLED("Disabled");


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f40075e;

        ButtonLocation(String str) {
            this.f40075e = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public final String toString() {
            return this.f40075e;
        }
    }

    @Nullable
    public final Rect getCustomLocation() {
        return this.f40072a;
    }

    @NonNull
    public final ButtonLocation getLocation() {
        return this.f40073e;
    }

    public final void setCustomLocation(Rect rect) {
        this.f40072a = rect;
    }

    public final void setLocation(ButtonLocation buttonLocation) {
        if (buttonLocation == null) {
            buttonLocation = ButtonLocation.TOP_LEFT;
        }
        this.f40073e = buttonLocation;
    }
}

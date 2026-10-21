package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setAutofillId extends setImeActionLabel {
    /* JADX WARN: Illegal instructions before constructor call */
    public setAutofillId(@NotNull getBeepOnFailure getbeeponfailure) {
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
        xs xsVar = xs.RESUME_GPO;
        setCertificate setcertificate = setCertificate.INSTANCE;
        super(xsVar, 0, 0, (byte[]) setCertificate.setY(new Object[]{getbeeponfailure}, 1252819044, -1252819044, (int) System.currentTimeMillis()), 0);
    }
}

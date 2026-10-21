package com.facetec.sdk;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
final class nr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f42714c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private static nt f42715e;

    private nr() {
    }

    public static nt a() {
        synchronized (nr.class) {
            nt ntVar = f42715e;
            if (ntVar == null) {
                return new nt();
            }
            f42715e = ntVar.f42725g;
            ntVar.f42725g = null;
            f42714c -= SvgConstantsKt.SPECIFIED_FONT_FAMILY;
            return ntVar;
        }
    }

    public static void e(nt ntVar) {
        if (ntVar.f42725g != null || ntVar.f42724f != null) {
            throw new IllegalArgumentException();
        }
        if (ntVar.f42723e) {
            return;
        }
        synchronized (nr.class) {
            try {
                long j10 = f42714c;
                if (j10 + SvgConstantsKt.SPECIFIED_FONT_FAMILY > SvgConstantsKt.SPECIFIED_FONT_STYLE) {
                    return;
                }
                f42714c = j10 + SvgConstantsKt.SPECIFIED_FONT_FAMILY;
                ntVar.f42725g = f42715e;
                ntVar.f42722d = 0;
                ntVar.f42719a = 0;
                f42715e = ntVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

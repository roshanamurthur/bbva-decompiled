package com.bumptech.glide.gifdecoder;

import androidx.annotation.ColorInt;
import java.util.ArrayList;
import rc.a;

/* JADX INFO: loaded from: classes9.dex */
public class GifHeader {
    public static final int NETSCAPE_LOOP_COUNT_DOES_NOT_EXIST = -1;
    public static final int NETSCAPE_LOOP_COUNT_FOREVER = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f38096d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f38100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f38102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ColorInt
    public int f38103k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ColorInt
    public int[] f38093a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38094b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38095c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f38097e = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f38104l = -1;

    public int getHeight() {
        return this.f38099g;
    }

    public int getNumFrames() {
        return this.f38095c;
    }

    public int getStatus() {
        return this.f38094b;
    }

    public int getWidth() {
        return this.f38098f;
    }
}

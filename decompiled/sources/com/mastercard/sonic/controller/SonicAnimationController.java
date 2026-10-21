package com.mastercard.sonic.controller;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.activity.o;
import androidx.camera.core.h0;
import androidx.camera.core.processing.m;
import com.mastercard.sonic.androidsvg.SVG;
import com.mastercard.sonic.sonicasset.SonicAsset;
import com.mastercard.sonic.widget.SonicView;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SonicAnimationController.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J*\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u000f"}, d2 = {"Lcom/mastercard/sonic/controller/SonicAnimationController;", "", "Lcom/mastercard/sonic/sonicasset/SonicAsset;", "sonicAsset", "Lkotlin/Function0;", "", "completionAnim", "error", "prepare", "Lcom/mastercard/sonic/widget/SonicView;", "sonicView", "completion", "play", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class SonicAnimationController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public SparseArray<SVG> f51417a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public SparseArray<Long> f51418b = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51420d;

    public final void play(@NotNull final SonicView sonicView, @NotNull final Function0<Unit> completion, @NotNull final Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(sonicView, "sonicView");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(error, "error");
        final Handler handler = new Handler(Looper.getMainLooper());
        final Ref.IntRef intRef = new Ref.IntRef();
        handler.postDelayed(new Runnable() { // from class: com.mastercard.sonic.controller.SonicAnimationController$play$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                Handler handler2 = handler;
                Ref.IntRef intRef2 = intRef;
                SonicAnimationController sonicAnimationController = this;
                try {
                    SonicView sonicView2 = sonicView;
                    Object obj = sonicAnimationController.f51417a.get(intRef2.element);
                    Intrinsics.checkNotNullExpressionValue(obj, "svgs[index]");
                    sonicView2.setSvg$sonic_sdk_release((SVG) obj);
                    int i10 = intRef2.element + 1;
                    intRef2.element = i10;
                    if (i10 < sonicAnimationController.f51419c) {
                        Object obj2 = sonicAnimationController.f51418b.get(intRef2.element);
                        Intrinsics.checkNotNullExpressionValue(obj2, "frameSizes[index]");
                        handler2.postDelayed(this, ((Number) obj2).longValue());
                    } else if (intRef2.element == sonicAnimationController.f51419c) {
                        h0 h0Var = new h0(completion, 5);
                        Object obj3 = sonicAnimationController.f51418b.get(intRef2.element);
                        Intrinsics.checkNotNullExpressionValue(obj3, "frameSizes[index]");
                        handler2.postDelayed(h0Var, ((Number) obj3).longValue());
                    }
                } catch (IllegalArgumentException unused) {
                    handler2.removeCallbacks(this);
                    error.invoke();
                }
            }
        }, this.f51420d);
    }

    public final void prepare(@NotNull SonicAsset sonicAsset, @NotNull Function0<Unit> completionAnim, @NotNull Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(sonicAsset, "sonicAsset");
        Intrinsics.checkNotNullParameter(completionAnim, "completionAnim");
        Intrinsics.checkNotNullParameter(error, "error");
        Handler handler = new Handler(Looper.getMainLooper());
        try {
            sonicAsset.setAnimationJsonFromFile();
            SparseArray<SVG> sparseArrayLoadAnimationAssets = sonicAsset.loadAnimationAssets();
            this.f51419c = sonicAsset.getNumberOfFrames();
            this.f51418b = sonicAsset.getFrameSizes();
            this.f51420d = sonicAsset.getAnimationDelayInMillis();
            sparseArrayLoadAnimationAssets.size();
            Objects.toString(this.f51418b);
            if (sparseArrayLoadAnimationAssets.size() != this.f51419c) {
                handler.post(new m(error, 4));
            } else {
                this.f51417a = sparseArrayLoadAnimationAssets;
                handler.post(new o(completionAnim, 3));
            }
        } catch (Exception e5) {
            e5.getMessage();
            error.invoke();
        }
    }
}

package com.mastercard.sonic.controller;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Handler;
import android.os.Looper;
import com.appsflyer.internal.g;
import com.mastercard.sonic.controller.SonicSoundController;
import com.mastercard.sonic.sonicasset.SonicAsset;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SonicSoundController.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\"\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\f"}, d2 = {"Lcom/mastercard/sonic/controller/SonicSoundController;", "", "Lcom/mastercard/sonic/sonicasset/SonicAsset;", "sonicAsset", "Lkotlin/Function0;", "", "completion", "error", "prepareSound", "play", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class SonicSoundController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SoundPool f51470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f51471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51472c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f51474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f51475f;

    public final void play(@NotNull Function0<Unit> completion, @NotNull Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(error, "error");
        new Handler(Looper.getMainLooper()).postDelayed(new g(this, error, 1, completion), this.f51473d);
    }

    public final void prepareSound(@NotNull SonicAsset sonicAsset, @NotNull final Function0<Unit> completion, @NotNull final Function0<Unit> error) {
        long j10;
        Intrinsics.checkNotNullParameter(sonicAsset, "sonicAsset");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(error, "error");
        SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).build()).build();
        Intrinsics.checkNotNullExpressionValue(soundPoolBuild, "Builder().setMaxStreams(…ibutes(attrTypes).build()");
        this.f51470a = soundPoolBuild;
        SoundPool soundPool = null;
        if (soundPoolBuild == null) {
            Intrinsics.throwUninitializedPropertyAccessException("soundPool");
            soundPoolBuild = null;
        }
        soundPoolBuild.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: bi.n
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool2, int i10, int i11) {
                SonicSoundController this$0 = this.f25251a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0 completion2 = completion;
                Intrinsics.checkNotNullParameter(completion2, "$completion");
                Function0 error2 = error;
                Intrinsics.checkNotNullParameter(error2, "$error");
                boolean z10 = i11 == 0;
                this$0.f51471b = z10;
                if (z10) {
                    completion2.invoke();
                } else {
                    error2.invoke();
                }
            }
        });
        try {
            SoundPool soundPool2 = this.f51470a;
            if (soundPool2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("soundPool");
            } else {
                soundPool = soundPool2;
            }
            this.f51472c = sonicAsset.loadSoundAssets(soundPool);
            this.f51473d = sonicAsset.getSoundDelayInMillis();
            try {
                j10 = Long.parseLong(sonicAsset.calculateSonicSoundDuration());
            } catch (Exception e5) {
                e5.printStackTrace();
                j10 = 0;
            }
            this.f51475f = j10;
        } catch (IOException e7) {
            e7.getMessage();
            error.invoke();
        }
    }
}

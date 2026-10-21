package com.mastercard.sonic.hapticsmanager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.core.app.o;
import com.mastercard.sonic.R;
import com.mastercard.sonic.sonicasset.SonicAsset;
import java.io.BufferedReader;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HapticsManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J$\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¨\u0006\u000e"}, d2 = {"Lcom/mastercard/sonic/hapticsmanager/HapticsManager;", "Lcom/mastercard/sonic/hapticsmanager/HapticsProvider;", "Lkotlin/Function0;", "", "completion", "error", "prepare", "play", "Landroid/content/Context;", "context", "Lcom/mastercard/sonic/sonicasset/SonicAsset;", "sonicAsset", "<init>", "(Landroid/content/Context;Lcom/mastercard/sonic/sonicasset/SonicAsset;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class HapticsManager implements HapticsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f51476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SonicAsset f51477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AHAPConverter f51478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Object f51479d;

    public HapticsManager(@NotNull Context context, @NotNull SonicAsset sonicAsset) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sonicAsset, "sonicAsset");
        this.f51476a = context;
        this.f51477b = sonicAsset;
        this.f51478c = new AHAPConverter(context);
    }

    @Override // com.mastercard.sonic.hapticsmanager.HapticsProvider
    @SuppressLint({"NewApi"})
    public void play(@NotNull Function0<Unit> completion, @NotNull Function0<Unit> error) {
        Object obj;
        VibrationEffect vibrationEffectE;
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(error, "error");
        Context context = this.f51476a;
        Object systemService = context.getSystemService((Class<Object>) Vibrator.class);
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        if (vibrator == null || (obj = this.f51479d) == null || (vibrationEffectE = o.e(obj)) == null) {
            error.invoke();
            return;
        }
        try {
            vibrator.vibrate(vibrationEffectE);
            completion.invoke();
        } catch (Exception e5) {
            Resources resources = context.getResources();
            int i10 = R.string.error_play_haptics_feedback;
            Object[] objArr = new Object[1];
            Object cause = e5.getCause();
            if (cause == null) {
                cause = "Unknown error";
            }
            objArr[0] = cause;
            Intrinsics.checkNotNullExpressionValue(resources.getString(i10, objArr), "context.resources.getStr….cause?: \"Unknown error\")");
            error.invoke();
        }
    }

    @Override // com.mastercard.sonic.hapticsmanager.HapticsProvider
    public void prepare(@NotNull Function0<Unit> completion, @NotNull Function0<Unit> error) {
        Unit unit;
        Context context = this.f51476a;
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            BufferedReader bufferedHapticsFile = this.f51477b.getBufferedHapticsFile();
            try {
                VibrationEffect vibrationEffectConvertAHAPtoWaveform = this.f51478c.convertAHAPtoWaveform(bufferedHapticsFile);
                if (vibrationEffectConvertAHAPtoWaveform != null) {
                    this.f51479d = vibrationEffectConvertAHAPtoWaveform;
                    completion.invoke();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    Intrinsics.checkNotNullExpressionValue(context.getResources().getString(R.string.error_prepare_haptics_data), "context.resources.getStr…ror_prepare_haptics_data)");
                    error.invoke();
                }
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedHapticsFile, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(bufferedHapticsFile, th2);
                    throw th3;
                }
            }
        } catch (IOException e5) {
            Resources resources = context.getResources();
            int i10 = R.string.error_prepare_haptics_data;
            Object[] objArr = new Object[1];
            Object cause = e5.getCause();
            if (cause == null) {
                cause = "Unknown error";
            }
            objArr[0] = cause;
            Intrinsics.checkNotNullExpressionValue(resources.getString(i10, objArr), "context.resources.getStr…cause ?: \"Unknown error\")");
            error.invoke();
        }
    }
}

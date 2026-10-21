package com.visa.internal;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.impl.t;
import com.visa.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements tsam7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f68023a;

    public static final void b(MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(mediaPlayer, "$mediaPlayer");
        mediaPlayer.start();
    }

    @Override // com.visa.internal.tsam7
    public final void a() {
    }

    @Override // com.visa.internal.tsam7
    public final void a(irts6 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f68023a = config.f68032c;
    }

    public final void a(Context context, Function0 function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f68023a) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            MediaPlayer mediaPlayerCreate = MediaPlayer.create(context, R.raw.visa_sound);
            Intrinsics.checkNotNullExpressionValue(mediaPlayerCreate, "create(\n            cont….raw.visa_sound\n        )");
            mediaPlayerCreate.setOnCompletionListener(new kj.a());
            new Handler(Looper.getMainLooper()).postDelayed(new t(mediaPlayerCreate, 6), 220L);
        }
    }

    public static final void a(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        mp.reset();
        mp.release();
    }
}

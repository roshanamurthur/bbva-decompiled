package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.NonNull;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class ProfileInstallerInitializer implements Initializer<Result> {

    public static class Result {
    }

    @Override // androidx.startup.Initializer
    @NonNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    @NonNull
    public Result create(@NonNull Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new Result();
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: a3.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                this.f191p0.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new androidx.appcompat.app.g(applicationContext, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new Result();
    }
}

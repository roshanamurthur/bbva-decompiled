package com.appsflyer.internal;

import android.media.SoundPool;
import android.os.Handler;
import android.os.Looper;
import com.mastercard.sonic.controller.SonicSoundController;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f26408p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f26409q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f26410r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f26411s0;

    public /* synthetic */ g(Object obj, Object obj2, int i10, Object obj3) {
        this.f26408p0 = i10;
        this.f26409q0 = obj;
        this.f26410r0 = obj2;
        this.f26411s0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26408p0;
        Object obj = this.f26410r0;
        Object obj2 = this.f26409q0;
        Object obj3 = this.f26411s0;
        switch (i10) {
            case 0:
                AFc1wSDK.valueOf((AFc1wSDK) obj2, (Throwable) obj, (String) obj3);
                break;
            case 1:
                SonicSoundController this$0 = (SonicSoundController) obj2;
                Function0 error = (Function0) obj;
                Function0 completion = (Function0) obj3;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(error, "$error");
                Intrinsics.checkNotNullParameter(completion, "$completion");
                if (this$0.f51474e) {
                    error.invoke();
                } else if (!this$0.f51471b) {
                    error.invoke();
                } else {
                    try {
                        this$0.f51474e = true;
                        SoundPool soundPool = this$0.f51470a;
                        if (soundPool == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("soundPool");
                            soundPool = null;
                        }
                        soundPool.play(this$0.f51472c, 1.0f, 1.0f, 1, 0, 1.0f);
                    } catch (Exception unused) {
                        this$0.f51474e = false;
                        error.invoke();
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new androidx.camera.camera2.interop.h(completion, this$0, 1), this$0.f51475f);
                }
                break;
            default:
                String tag = (String) obj3;
                String format = (String) obj2;
                Object[] arg = (Object[]) obj;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(format, "$format");
                Intrinsics.checkNotNullParameter(arg, "$arg");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(arg, arg.length);
                Intrinsics.checkNotNullExpressionValue(String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "format(...)");
                break;
        }
    }

    public /* synthetic */ g(String str, String str2, Object[] objArr) {
        this.f26408p0 = 2;
        this.f26411s0 = str;
        this.f26409q0 = str2;
        this.f26410r0 = objArr;
    }
}

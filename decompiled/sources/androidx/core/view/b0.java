package androidx.core.view;

import android.graphics.drawable.Drawable;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.naturalauthentication.command.CommandError;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f20389p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f20390q0;

    public /* synthetic */ b0(Object obj, int i10) {
        this.f20389p0 = i10;
        this.f20390q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20389p0;
        Object obj = this.f20390q0;
        switch (i10) {
            case 0:
                ((Function0) obj).invoke();
                break;
            case 1:
                ((FontRequestEmojiCompatConfig.a) obj).b();
                break;
            case 2:
                HashMap map = LottieCompositionFactory.f25604a;
                Utils.closeQuietly((JsonReader) obj);
                break;
            case 3:
                Drawable drawable = (LottieDrawable) obj;
                boolean z10 = LottieDrawable.f25624o1;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                }
                break;
            case 4:
                CommandCallback callback2 = (CommandCallback) obj;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                callback2.sendError(CommandError.ErrorDiscoverBiometricCapabilities);
                break;
            default:
                String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                ((SelfieFragment) obj).E();
                break;
        }
    }
}

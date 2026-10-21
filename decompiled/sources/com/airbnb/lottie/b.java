package com.airbnb.lottie;

import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements LottieListener {
    @Override // com.airbnb.lottie.LottieListener
    public final void onResult(Object obj) {
        Throwable th2 = (Throwable) obj;
        b bVar = LottieAnimationView.K0;
        if (!Utils.isNetworkException(th2)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        Logger.warning("Unable to load composition.", th2);
    }
}

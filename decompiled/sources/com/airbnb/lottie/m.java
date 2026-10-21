package com.airbnb.lottie;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Callable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25933p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f25934q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f25935r0;

    public /* synthetic */ m(Object obj, Object obj2, int i10) {
        this.f25933p0 = i10;
        this.f25934q0 = obj;
        this.f25935r0 = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f25933p0;
        Object obj = this.f25935r0;
        Object obj2 = this.f25934q0;
        switch (i10) {
            case 0:
                return LottieCompositionFactory.fromJsonReaderSync((JsonReader) obj2, (String) obj);
            default:
                return ((UseCase) obj2).call(obj);
        }
    }
}

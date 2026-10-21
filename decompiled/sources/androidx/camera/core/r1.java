package androidx.camera.core;

import android.speech.SpeechRecognizer;
import androidx.room.MultiInstanceInvalidationClient;
import com.bbva.speech.Speech;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2239p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2240q0;

    public /* synthetic */ r1(Object obj, int i10) {
        this.f2239p0 = i10;
        this.f2240q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2239p0;
        Object obj = this.f2240q0;
        switch (i10) {
            case 0:
                ((VideoCapture) obj).lambda$startRecording$2();
                break;
            case 1:
                MultiInstanceInvalidationClient this$0 = (MultiInstanceInvalidationClient) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.invalidationTracker.removeObserver(this$0.getObserver());
                break;
            case 2:
                Speech this$1 = (Speech) obj;
                Speech.Companion companion = Speech.INSTANCE;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Object value = this$1.f36900b.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-speechRecognizer>(...)");
                ((SpeechRecognizer) value).stopListening();
                break;
            case 3:
                DocumentFragment.d((DocumentFragment) obj);
                break;
            default:
                com.google.android.material.textfield.l lVar = (com.google.android.material.textfield.l) obj;
                boolean zIsPopupShowing = lVar.f45633h.isPopupShowing();
                lVar.t(zIsPopupShowing);
                lVar.m = zIsPopupShowing;
                break;
        }
    }
}

package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.collection.ArraySet;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.lifecycle.ComputableLiveData;
import androidx.room.AutoCloser;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.gp2.android.product.mobilepayment.plugin.command.SetNfcPaymentAppCommand;
import com.bbva.nativesettings.common.Constants;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.google.firebase.messaging.FirebaseMessaging;
import io.reactivex.rxjava3.android.MainThreadDisposable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f17409p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f17410q0;

    public /* synthetic */ j(Object obj, int i10) {
        this.f17409p0 = i10;
        this.f17410q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SemanticsConfiguration unmergedConfig;
        AtomicBoolean atomicBoolean;
        int i10 = this.f17409p0;
        Object obj = this.f17410q0;
        switch (i10) {
            case 0:
                AndroidComposeViewAccessibilityDelegateCompat this$0 = (AndroidComposeViewAccessibilityDelegateCompat) obj;
                AndroidComposeViewAccessibilityDelegateCompat.Companion companion = AndroidComposeViewAccessibilityDelegateCompat.Companion;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                i1.m.f(this$0.f17040a, false, 1, null);
                AndroidComposeView androidComposeView = this$0.f17040a;
                this$0.s(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), this$0.E);
                this$0.sendContentCaptureSemanticsStructureChangeEvents$ui_release(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), this$0.E);
                this$0.sendSemanticsPropertyChangeEvents$ui_release(this$0.getCurrentSemanticsNodes$ui_release());
                ArraySet<? extends Integer> arraySet = new ArraySet<>();
                ArraySet<Integer> arraySet2 = this$0.f17062x;
                for (Integer id : arraySet2) {
                    SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = this$0.getCurrentSemanticsNodes$ui_release().get(id);
                    SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                    if (semanticsNode == null || !semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle())) {
                        arraySet.add(id);
                        Intrinsics.checkNotNullExpressionValue(id, "id");
                        int iIntValue = id.intValue();
                        AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy semanticsNodeCopy = this$0.D.get(id);
                        this$0.w(iIntValue, 32, (semanticsNodeCopy == null || (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) == null) ? null : (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle()));
                    }
                }
                arraySet2.removeAll(arraySet);
                this$0.D.clear();
                for (Map.Entry<Integer, SemanticsNodeWithAdjustedBounds> entry : this$0.getCurrentSemanticsNodes$ui_release().entrySet()) {
                    if (entry.getValue().getSemanticsNode().getConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle()) && arraySet2.add(entry.getKey())) {
                        this$0.w(entry.getKey().intValue(), 16, (String) entry.getValue().getSemanticsNode().getUnmergedConfig().get(SemanticsProperties.INSTANCE.getPaneTitle()));
                    }
                    this$0.D.put(entry.getKey(), new AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy(entry.getValue().getSemanticsNode(), this$0.getCurrentSemanticsNodes$ui_release()));
                }
                this$0.E = new AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), this$0.getCurrentSemanticsNodes$ui_release());
                this$0.F = false;
                return;
            case 1:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService(Constants.INPUT_METHOD)).showSoftInput(view, 0);
                return;
            case 2:
                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) obj;
                contentLoadingProgressBar.f20435r0 = false;
                if (contentLoadingProgressBar.f20436s0) {
                    return;
                }
                contentLoadingProgressBar.f20433p0 = System.currentTimeMillis();
                contentLoadingProgressBar.setVisibility(0);
                return;
            case 3:
                ComputableLiveData this$1 = (ComputableLiveData) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                do {
                    AtomicBoolean atomicBoolean2 = this$1.f21827d;
                    if (!atomicBoolean2.compareAndSet(false, true)) {
                        return;
                    }
                    Object objCompute = null;
                    boolean z10 = false;
                    while (true) {
                        atomicBoolean = this$1.f21826c;
                        try {
                            if (atomicBoolean.compareAndSet(true, false)) {
                                objCompute = this$1.compute();
                                z10 = true;
                            } else {
                                if (z10) {
                                    this$1.getLiveData().postValue(objCompute);
                                }
                                atomicBoolean2.set(false);
                                if (!z10) {
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            atomicBoolean2.set(false);
                            throw th2;
                        }
                    }
                } while (atomicBoolean.get());
                return;
            case 4:
                AutoCloser this$2 = (AutoCloser) obj;
                AutoCloser.Companion companion2 = AutoCloser.Companion;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.f23113e.execute(this$2.f23119k);
                return;
            case 5:
                SetNfcPaymentAppCommand.execute$lambda$2((CommandCallback) obj);
                return;
            case 6:
                com.dasnano.vdphotoselfiecapture.fragments.k kVar = (com.dasnano.vdphotoselfiecapture.fragments.k) obj;
                kVar.getClass();
                String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                SelfieFragment selfieFragment = kVar.f39670q0;
                selfieFragment.s();
                selfieFragment.t(true);
                return;
            case 7:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj;
                String str2 = FirebaseMessaging.INSTANCE_ID_SCOPE;
                if (firebaseMessaging.isAutoInitEnabled()) {
                    firebaseMessaging.h();
                    return;
                }
                return;
            case 8:
                ((com.vasco.digipass.sdk.utils.qrcodescanner.b) obj).b();
                return;
            default:
                ((MainThreadDisposable) obj).onDispose();
                return;
        }
    }
}

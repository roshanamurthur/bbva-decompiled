package androidx.appcompat.widget;

import android.animation.AnimatorSet;
import android.widget.PopupWindow;
import androidx.camera.core.VideoCapture;
import com.appsflyer.internal.AFa1dSDK;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.google.pay.command.PushProvisioningCommand;
import com.bbva.showinfo.generator.InfoTooltipGenerator;
import com.bbva.ui.widget.BbvaStrictButton;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.firebase.installations.FirebaseInstallations;
import com.visa.internal.CheckmarkElement;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f1678p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f1679q0;

    public /* synthetic */ s1(Object obj, int i10) {
        this.f1678p0 = i10;
        this.f1679q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1678p0;
        Object obj = this.f1679q0;
        switch (i10) {
            case 0:
                ((Toolbar) obj).collapseActionView();
                break;
            case 1:
                ((VideoCapture) obj).lambda$stopRecording$5();
                break;
            case 2:
                ((AFa1dSDK) obj).AFVersionDeclaration();
                break;
            case 3:
                CommandCallback commandCallback = (CommandCallback) obj;
                PushProvisioningCommand.Companion companion = PushProvisioningCommand.INSTANCE;
                Intrinsics.checkNotNullParameter(commandCallback, "$commandCallback");
                commandCallback.sendError(Errors.ErrorDefault);
                break;
            case 4:
                PopupWindow tooltipWindow = (PopupWindow) obj;
                InfoTooltipGenerator infoTooltipGenerator = InfoTooltipGenerator.INSTANCE;
                Intrinsics.checkNotNullParameter(tooltipWindow, "$tooltipWindow");
                tooltipWindow.dismiss();
                break;
            case 5:
                BbvaStrictButton.setOnClickListener$lambda$1$lambda$0((BbvaStrictButton) obj);
                break;
            case 6:
                com.google.android.material.search.w wVar = (com.google.android.material.search.w) obj;
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = wVar.f45189c;
                clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
                AnimatorSet animatorSetH = wVar.h(true);
                animatorSetH.addListener(new com.google.android.material.search.u(wVar));
                animatorSetH.start();
                break;
            case 7:
                Object obj2 = FirebaseInstallations.m;
                ((FirebaseInstallations) obj).b(false);
                break;
            default:
                CheckmarkElement.a((CheckmarkElement) obj);
                break;
        }
    }
}

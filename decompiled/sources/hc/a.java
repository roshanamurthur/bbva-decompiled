package hc;

import android.database.Cursor;
import android.graphics.Canvas;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.component.ui.biometrics.BiometricResult;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment;
import com.bbva.softtokenbase.SoftTokenReactions;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.canvas.CanvasCompat;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.v;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReadyListener;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.veridas.camera.CameraAction;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Predicate, Continuation, SuccessContinuation, Toolbar.OnMenuItemClickListener, CameraAction, SQLiteEventStore.a, CanvasCompat.CanvasOperation, SFMCSdkReadyListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f69374p0;

    public /* synthetic */ a(Object obj) {
        this.f69374p0 = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
    public Object apply(Object obj) {
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) this.f69374p0;
        Cursor cursor = (Cursor) obj;
        Encoding encoding = SQLiteEventStore.f43867u0;
        sQLiteEventStore.getClass();
        while (cursor.moveToNext()) {
            sQLiteEventStore.recordLogEventDropped(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    @Override // com.veridas.camera.CameraAction
    public void execute(boolean z10) {
        SelfieFragment selfieFragment = (SelfieFragment) this.f69374p0;
        String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
        selfieFragment.E();
    }

    @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        InfoScreenDialogFragment this$0 = (InfoScreenDialogFragment) this.f69374p0;
        int i10 = InfoScreenDialogFragment.I0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (menuItem.getItemId() != R.id.action_close) {
            return false;
        }
        this$0.onBackButtonClick();
        return true;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReadyListener
    public void ready(SFMCSdk sFMCSdk) {
        SFMCSdk.Companion.m5503track$lambda16((Event[]) this.f69374p0, sFMCSdk);
    }

    @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
    public void run(Canvas canvas) {
        super/*android.widget.FrameLayout*/.dispatchDraw(canvas);
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public boolean test(Object obj) {
        SoftTokenReactions this$0 = (SoftTokenReactions) this.f69374p0;
        BiometricResult biometricResult = (BiometricResult) obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(biometricResult);
        return this$0.userHasNoFingerprintOrNotPresent(biometricResult);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f69374p0;
        ExecutorService executorService = Utils.f47779a;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        String str = (String) this.f69374p0;
        v vVar = (v) obj;
        String str2 = FirebaseMessaging.INSTANCE_ID_SCOPE;
        vVar.getClass();
        Task<Void> taskF = vVar.f(new s(ExifInterface.LATITUDE_SOUTH, str));
        vVar.h();
        return taskF;
    }
}

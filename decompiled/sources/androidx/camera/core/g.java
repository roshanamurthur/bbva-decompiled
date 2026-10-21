package androidx.camera.core;

import android.content.ClipData;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.camera.view.CameraController;
import androidx.camera.view.RotationProvider;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.qrscanner.QRScannerActivity;
import com.bbva.glomohybrid.qrscanner.QRScannerComponent;
import com.bbva.qr.model.response.BarcodeResult;
import com.bbva.qr.model.response.DetectBarcodeCanceled;
import com.bbva.sl.ar.android.secsdk.fido.tools.EtherTimeProviderManager;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.noknok.android.client.utils.TimeProviderManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements CallbackToFutureAdapter.Resolver, RotationProvider.Listener, InputConnectionCompat.OnCommitContentListener, ActivityResultCallback, TimeProviderManager.ITimeProvider, SQLiteEventStore.a {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2072p0;

    public /* synthetic */ g(Object obj) {
        this.f2072p0 = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
    public final Object apply(Object obj) {
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) this.f2072p0;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Encoding encoding = SQLiteEventStore.f43867u0;
        sQLiteEventStore.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + sQLiteEventStore.f43869q0.getTime()).execute();
        return null;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((CameraX) this.f2072p0).lambda$shutdownInternal$4(completer);
    }

    @Override // com.noknok.android.client.utils.TimeProviderManager.ITimeProvider
    public final long getCurrentTime() {
        return ((EtherTimeProviderManager) this.f2072p0).now();
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        QRScannerActivity this$0 = (QRScannerActivity) this.f2072p0;
        Result result = (Result) obj;
        QRScannerActivity.Companion companion = QRScannerActivity.Companion;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!(result instanceof Result.Success)) {
            if ((result instanceof Result.Error) && (((Result.Error) result).getException() instanceof DetectBarcodeCanceled)) {
                QRScannerActivity.f(this$0, QRScannerComponent.INSTANCE.getACTION_CANCEL_SCANNER());
                return;
            }
            return;
        }
        ActionSpec<Object> action_qr_scanner_result = QRScannerComponent.INSTANCE.getACTION_QR_SCANNER_RESULT();
        String payload = ((BarcodeResult) ((Result.Success) result).getValue()).getPayload();
        this$0.getClass();
        CellsReactor.fire(QRScannerComponent.ID, action_qr_scanner_result, payload);
        this$0.finish();
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i10, Bundle bundle) {
        View view = (View) this.f2072p0;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                inputContentInfoCompat.requestPermission();
                Parcelable parcelable = (Parcelable) inputContentInfoCompat.unwrap();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e5) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e5);
                return false;
            }
        }
        return ViewCompat.performReceiveContent(view, new ContentInfoCompat.Builder(new ClipData(inputContentInfoCompat.getDescription(), new ClipData.Item(inputContentInfoCompat.getContentUri())), 2).setLinkUri(inputContentInfoCompat.getLinkUri()).setExtras(bundle).build()) == null;
    }

    @Override // androidx.camera.view.RotationProvider.Listener
    public final void onRotationChanged(int i10) {
        ((CameraController) this.f2072p0).lambda$new$1(i10);
    }
}

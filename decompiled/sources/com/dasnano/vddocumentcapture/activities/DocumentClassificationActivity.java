package com.dasnano.vddocumentcapture.activities;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.room.f;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.dasnano.vddocumentcapture.R;
import com.dasnano.vddocumentcapture.VDDocumentCapture;
import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import com.dasnano.vddocumentcapture.document.DocumentFace;
import com.dasnano.vddocumentcapture.fragments.CheckDocumentFragment;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import com.dasnano.vddocumentcapture.model.DocumentClassificationViewModel;
import com.dasnano.vddocumentcapture.other.VDEnums;
import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;
import com.veridas.activity.ActivityLifecycleAdapter;
import com.veridas.activity.DasActivity;
import com.veridas.config.Configuration;
import com.veridas.config.InvalidDisplayOrientationException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.display.DisplayOrientation;
import com.veridas.lib.entities.resources.Document;
import com.veridas.lifecycle.DasViewModel;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DocumentClassificationActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\u0007"}, d2 = {"Lcom/dasnano/vddocumentcapture/activities/DocumentClassificationActivity;", "Lcom/dasnano/vddocumentcapture/activities/AbstractActivity;", "", "onBackPressed", "<init>", "()V", "BroadcastString", "document-capture_release"}, k = 1, mv = {1, 9, 0})
public abstract class DocumentClassificationActivity extends AbstractActivity {

    @NotNull
    public static final String CAPTURE_TYPE = "com.veridas.documentCapture.documentClassificationActivity.imageCapture.type";

    @NotNull
    public static final String CUT = "com.veridas.documentCapture.documentClassificationActivity.imageCapture.cut";

    @NotNull
    public static final String DOCUMENTS = "com.veridas.documentCapture.documentClassificationActivity.imageCapture.documents";

    @NotNull
    public static final String FINISH_SDK = "com.veridas.documentCapture.documentClassificationActivity.finishSdk";

    @NotNull
    public static final String IMAGE_CAPTURE = "com.veridas.documentCapture.documentClassificationActivity.imageCapture";

    @NotNull
    public static final String SECONDS = "com.veridas.documentCapture.documentClassificationActivity.timeWithoutCapture.seconds";

    @NotNull
    public static final String TIME_WITHOUT_CAPTURE = "com.veridas.documentCapture.documentClassificationActivity.timeWithoutCapture";

    @NotNull
    public static final String TYPE = "com.veridas.documentCapture.documentClassificationActivity.timeWithoutCapture.type";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DocumentClassificationActivity$createBroadcastReceiver$1 f39298r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f39299s0;

    /* JADX INFO: renamed from: BroadcastString, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public static final String f39297t0 = Reflection.getOrCreateKotlinClass(DocumentClassificationActivity.class).getSimpleName();

    /* JADX INFO: renamed from: com.dasnano.vddocumentcapture.activities.DocumentClassificationActivity$BroadcastString, reason: from kotlin metadata */
    /* JADX INFO: compiled from: DocumentClassificationActivity.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/dasnano/vddocumentcapture/activities/DocumentClassificationActivity$BroadcastString;", "", "()V", "CAPTURE_TYPE", "", "CUT", "DOCUMENTS", "FINISH_SDK", "IMAGE_CAPTURE", "SECONDS", "TAG", "getTAG", "()Ljava/lang/String;", "TIME_WITHOUT_CAPTURE", ConstantsKt.TYPE, EventDataKeys.Lifecycle.LIFECYCLE_START, "", "context", "Landroid/content/Context;", "configuration", "Lcom/veridas/config/Configuration;", "documents", "", "document-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String getTAG() {
            return DocumentClassificationActivity.f39297t0;
        }

        @JvmStatic
        public final void start(@NotNull Context context, @NotNull Configuration configuration, @NotNull List<String> documents) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(documents, "documents");
            try {
                Intent intent = new Intent(context, (Class<?>) (configuration.getDisplayOrientation("screenorientation") == DisplayOrientation.PORTRAIT ? PortraitDocumentClassificationActivity.class : LandscapeDocumentClassificationActivity.class));
                intent.putStringArrayListExtra(DocumentClassificationActivity.DOCUMENTS, new ArrayList<>(documents));
                DasActivity.startActivity(context, intent, configuration);
            } catch (InvalidDisplayOrientationException e5) {
                Log.e(getTAG(), e5);
            } catch (PropertyNameNotFoundException e7) {
                Log.e(getTAG(), e7);
            }
        }
    }

    /* JADX INFO: compiled from: DocumentClassificationActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VDEnums.VDCaptureType.values().length];
            try {
                iArr[VDEnums.VDCaptureType.VD_OBVERSE_WITHOUT_FLASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VDEnums.VDCaptureType.VD_REVERSE_WITHOUT_FLASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VDEnums.VDCaptureType.VD_OBVERSE_PASSPORT_WITHOUT_FLASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DocumentClassificationActivity() {
        addActivityLifecycleListener(new ActivityLifecycleAdapter() { // from class: com.dasnano.vddocumentcapture.activities.DocumentClassificationActivity.1
            @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
            public void onCreated(@Nullable DasActivity<? extends Configuration, ? extends DasViewModel<Configuration>> activity, @Nullable Bundle bundle) {
                DocumentClassificationActivity.access$created(DocumentClassificationActivity.this);
            }

            @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
            public void onPaused(@Nullable DasActivity<? extends Configuration, ? extends DasViewModel<Configuration>> activity) {
                DocumentClassificationActivity.access$paused(DocumentClassificationActivity.this);
            }

            @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
            public void onResumed(@Nullable DasActivity<? extends Configuration, ? extends DasViewModel<Configuration>> activity) {
                DocumentClassificationActivity.access$resumed(DocumentClassificationActivity.this);
            }
        });
    }

    public static final void access$broadcastTimeWithoutPhotoTaken(DocumentClassificationActivity documentClassificationActivity, int i10, VDEnums.VDCaptureType vDCaptureType) {
        documentClassificationActivity.getClass();
        Intent intent = new Intent(TIME_WITHOUT_CAPTURE);
        intent.putExtra(SECONDS, i10);
        intent.putExtra(TYPE, vDCaptureType);
        documentClassificationActivity.broadcastIntent(intent);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.dasnano.vddocumentcapture.activities.DocumentClassificationActivity$createBroadcastReceiver$1] */
    public static final void access$created(final DocumentClassificationActivity documentClassificationActivity) {
        ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setScreenOrientation(documentClassificationActivity.getRequestedOrientation());
        documentClassificationActivity.f39299s0 = documentClassificationActivity.getConfiguration().getInteger(VDDocumentConfiguration.SECONDS_WITHOUT_PICTURE);
        documentClassificationActivity.setContentView(R.layout.activity_document);
        documentClassificationActivity.f39298r0 = new BroadcastReceiver() { // from class: com.dasnano.vddocumentcapture.activities.DocumentClassificationActivity$createBroadcastReceiver$1
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // android.content.BroadcastReceiver
            public void onReceive(@NotNull Context context, @NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                String action = intent.getAction();
                if (action != null) {
                    int iHashCode = action.hashCode();
                    DocumentClassificationActivity documentClassificationActivity2 = this.f39301a;
                    switch (iHashCode) {
                        case -1524479654:
                            if (action.equals("com.veridas.documentCapture.checkDocument.documentValidated")) {
                                DocumentClassificationActivity.access$userSelection(documentClassificationActivity2, intent.getBooleanExtra("com.veridas.documentCapture.checkDocument.documentValidated", true));
                                break;
                            }
                            break;
                        case -1356311574:
                            if (action.equals(VDDocumentCapture.FORCE_STOP)) {
                                documentClassificationActivity2.finish();
                                break;
                            }
                            break;
                        case -678471452:
                            if (action.equals(DocumentFragment.IMAGE_CAPTURED)) {
                                String stringExtra = intent.getStringExtra(DocumentFragment.PATH);
                                if (stringExtra == null) {
                                    stringExtra = "";
                                }
                                String str = stringExtra;
                                Serializable serializableExtra = intent.getSerializableExtra(DocumentFragment.TYPE_CAPTURED);
                                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.dasnano.vddocumentcapture.other.VDEnums.VDCaptureType");
                                VDEnums.VDCaptureType vDCaptureType = (VDEnums.VDCaptureType) serializableExtra;
                                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(DocumentFragment.DOCUMENTS);
                                if (stringArrayListExtra == null) {
                                    stringArrayListExtra = new ArrayList<>();
                                }
                                DocumentClassificationActivity.access$processDocumentCaptured(this.f39301a, str, vDCaptureType, stringArrayListExtra, intent.getBooleanExtra(DocumentFragment.IS_BLURRY, false), intent.getBooleanExtra(DocumentFragment.HAS_BRIGHTS, false), intent.getBooleanExtra(DocumentFragment.CUT, false));
                                break;
                            }
                            break;
                        case -72624336:
                            if (action.equals("com.veridas.documentCapture.documentFragment.cameraFailure")) {
                                documentClassificationActivity2.g(false);
                                break;
                            }
                            break;
                        case 1715891416:
                            if (action.equals(DocumentFragment.FINISH_FRAGMENT)) {
                                documentClassificationActivity2.g(intent.getBooleanExtra(DocumentFragment.FINISH_FRAGMENT, false));
                                break;
                            }
                            break;
                        case 1964745915:
                            if (action.equals(DocumentClassificationActivity.TIME_WITHOUT_CAPTURE)) {
                                int intExtra = intent.getIntExtra(DocumentFragment.SECONDS, documentClassificationActivity2.f39299s0);
                                Serializable serializableExtra2 = intent.getSerializableExtra(DocumentClassificationActivity.TYPE);
                                VDEnums.VDCaptureType vDCaptureType2 = serializableExtra2 instanceof VDEnums.VDCaptureType ? (VDEnums.VDCaptureType) serializableExtra2 : null;
                                if (vDCaptureType2 == VDEnums.VDCaptureType.VD_OBVERSE_PASSPORT_WITHOUT_FLASH) {
                                    vDCaptureType2 = VDEnums.VDCaptureType.VD_OBVERSE_WITHOUT_FLASH;
                                }
                                DocumentClassificationActivity.access$broadcastTimeWithoutPhotoTaken(documentClassificationActivity2, intExtra, vDCaptureType2);
                                break;
                            }
                            break;
                    }
                }
            }
        };
    }

    public static final void access$paused(DocumentClassificationActivity documentClassificationActivity) {
        DocumentClassificationActivity$createBroadcastReceiver$1 documentClassificationActivity$createBroadcastReceiver$1 = documentClassificationActivity.f39298r0;
        if (documentClassificationActivity$createBroadcastReceiver$1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("receiver");
            documentClassificationActivity$createBroadcastReceiver$1 = null;
        }
        documentClassificationActivity.unregisterBroadcastReceiver(documentClassificationActivity$createBroadcastReceiver$1);
        documentClassificationActivity.keepScreenAutoOff();
        VDLogger.INSTANCE.log(Logger.Tag.ON_PAUSE, "capture onPause");
    }

    public static final void access$processDocumentCaptured(DocumentClassificationActivity documentClassificationActivity, String str, VDEnums.VDCaptureType vDCaptureType, List list, boolean z10, boolean z11, boolean z12) {
        ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setBlurry(z10);
        ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setHasBrights(z11);
        ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setDocuments(list);
        ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setCaptureType(vDCaptureType);
        if (vDCaptureType.isObverse) {
            ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setCaptureType(VDEnums.VDCaptureType.VD_OBVERSE_WITHOUT_FLASH);
            if (z12) {
                ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setCutObversePath(str);
            } else {
                ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setObversePath(str);
                ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setCheckImagePath(str);
            }
        } else if (vDCaptureType.isReverse) {
            if (z12) {
                ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setCutReversePath(str);
            } else {
                ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setReversePath(str);
                ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setCheckImagePath(str);
            }
        }
        if (documentClassificationActivity.getConfiguration().getBoolean(VDDocumentConfiguration.SHOW_DOCUMENT)) {
            String checkImagePath = ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).getCheckImagePath();
            if (checkImagePath == null || checkImagePath.length() == 0) {
                return;
            }
            documentClassificationActivity.j();
            return;
        }
        List<String> documents = ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).getDocuments();
        List<String> list2 = documents;
        if (!(!(list2 == null || list2.isEmpty()))) {
            throw new IllegalArgumentException("Documents should not be null or empty".toString());
        }
        if (!vDCaptureType.isObverse) {
            if (vDCaptureType.isReverse) {
                documentClassificationActivity.l(documents);
            }
        } else {
            documentClassificationActivity.k(documents);
            if (vDCaptureType.isPassport) {
                return;
            }
            ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setDocumentFace(DocumentFace.REVERSE);
        }
    }

    public static final void access$resumed(DocumentClassificationActivity documentClassificationActivity) {
        documentClassificationActivity.getClass();
        VDLogger.INSTANCE.log(Logger.Tag.ON_RESUME, "capture onResume");
        documentClassificationActivity.keepScreenAutoOn();
        documentClassificationActivity.inhibitNfcPopup();
        DocumentClassificationActivity$createBroadcastReceiver$1 documentClassificationActivity$createBroadcastReceiver$1 = documentClassificationActivity.f39298r0;
        if (documentClassificationActivity$createBroadcastReceiver$1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("receiver");
            documentClassificationActivity$createBroadcastReceiver$1 = null;
        }
        documentClassificationActivity.registerBroadcastReceiver(documentClassificationActivity$createBroadcastReceiver$1, DocumentClassificationActivityKt.f39302a);
        documentClassificationActivity.i();
    }

    public static final void access$userSelection(DocumentClassificationActivity documentClassificationActivity, boolean z10) {
        VDEnums.VDCaptureType captureType = ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).getCaptureType();
        if (!z10) {
            VDLogger.INSTANCE.log(Logger.Tag.REPEAT, VDPhotoSelfieCapture.LOG_TAG_REPEAT);
            ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setDocumentFace(captureType.isObverse ? DocumentFace.OBVERSE : DocumentFace.REVERSE);
            ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setCurrentAction(DocumentFragment.class);
            documentClassificationActivity.i();
            return;
        }
        VDLogger.INSTANCE.log(Logger.Tag.CONTINUE, "continue with type: " + captureType);
        List<String> documents = ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).getDocuments();
        List<String> list = documents;
        if (!(!(list == null || list.isEmpty()))) {
            throw new IllegalArgumentException("Documents should not be null or empty".toString());
        }
        boolean zIsPassport = Document.INSTANCE.isPassport(documents.get(0));
        int i10 = WhenMappings.$EnumSwitchMapping$0[captureType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            documentClassificationActivity.l(documents);
            documentClassificationActivity.g(true);
            return;
        }
        documentClassificationActivity.k(documents);
        if (zIsPassport || !((DocumentClassificationViewModel) documentClassificationActivity.viewModel).getShouldCaptureReverse()) {
            documentClassificationActivity.g(true);
            return;
        }
        ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setDocumentFace(DocumentFace.REVERSE);
        ((DocumentClassificationViewModel) documentClassificationActivity.viewModel).setCurrentAction(DocumentFragment.class);
        documentClassificationActivity.i();
    }

    @JvmStatic
    public static final void start(@NotNull Context context, @NotNull Configuration configuration, @NotNull List<String> list) {
        INSTANCE.start(context, configuration, list);
    }

    public final void g(boolean z10) {
        Intent intent = new Intent(FINISH_SDK);
        intent.putExtra(FINISH_SDK, z10);
        broadcastIntent(intent, new f(this, 3));
    }

    public final void h(String str, VDEnums.VDCaptureType vDCaptureType, List<String> list, boolean z10) {
        Intent intent = new Intent(IMAGE_CAPTURE);
        intent.putExtra(IMAGE_CAPTURE, str);
        intent.putExtra(CAPTURE_TYPE, vDCaptureType);
        intent.putStringArrayListExtra(DOCUMENTS, new ArrayList<>(list));
        intent.putExtra(CUT, z10);
        broadcastIntent(intent);
    }

    public final void i() {
        if (Intrinsics.areEqual(((DocumentClassificationViewModel) this.viewModel).getCurrentAction(), CheckDocumentFragment.class)) {
            j();
            return;
        }
        ((DocumentClassificationViewModel) this.viewModel).setCurrentAction(DocumentFragment.class);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        int i10 = R.id.vd_document_document_fragment;
        if (supportFragmentManager.findFragmentById(i10) instanceof DocumentFragment) {
            return;
        }
        ((DocumentClassificationViewModel) this.viewModel).setDocuments(getIntent().getStringArrayListExtra(DOCUMENTS));
        startFragment(i10, new DocumentFragment());
    }

    public final void j() {
        if (getConfiguration().getBoolean(VDDocumentConfiguration.SHOW_DOCUMENT)) {
            ((DocumentClassificationViewModel) this.viewModel).setCurrentAction(CheckDocumentFragment.class);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            int i10 = R.id.vd_document_document_fragment;
            if (supportFragmentManager.findFragmentById(i10) instanceof CheckDocumentFragment) {
                return;
            }
            startFragment(i10, new CheckDocumentFragment());
        }
    }

    public final void k(List<String> list) {
        String cutObversePath = ((DocumentClassificationViewModel) this.viewModel).getCutObversePath();
        if (cutObversePath != null && cutObversePath.length() != 0) {
            h(cutObversePath, VDEnums.VDCaptureType.VD_OBVERSE_WITHOUT_FLASH, list, true);
        }
        String obversePath = ((DocumentClassificationViewModel) this.viewModel).getObversePath();
        if (obversePath == null || obversePath.length() == 0) {
            return;
        }
        h(obversePath, VDEnums.VDCaptureType.VD_OBVERSE_WITHOUT_FLASH, list, false);
    }

    public final void l(List<String> list) {
        String cutReversePath = ((DocumentClassificationViewModel) this.viewModel).getCutReversePath();
        if (cutReversePath != null && cutReversePath.length() != 0) {
            h(cutReversePath, VDEnums.VDCaptureType.VD_REVERSE_WITHOUT_FLASH, list, true);
        }
        String reversePath = ((DocumentClassificationViewModel) this.viewModel).getReversePath();
        if (reversePath == null || reversePath.length() == 0) {
            return;
        }
        h(reversePath, VDEnums.VDCaptureType.VD_REVERSE_WITHOUT_FLASH, list, false);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onBackPressed() {
        if (Intrinsics.areEqual(((DocumentClassificationViewModel) this.viewModel).getCurrentAction(), DocumentFragment.class)) {
            Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.vd_document_document_fragment);
            DocumentFragment documentFragment = fragmentFindFragmentById instanceof DocumentFragment ? (DocumentFragment) fragmentFindFragmentById : null;
            if (documentFragment != null) {
                documentFragment.forceIsRunningToFalse();
            }
        }
        VDLogger.INSTANCE.log(Logger.Tag.CLOSE, VDPhotoSelfieCapture.LOG_TAG_ON_BACK_PRESSED);
        g(false);
    }
}

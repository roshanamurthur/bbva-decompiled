package androidx.camera.core.impl;

import android.app.Activity;
import androidx.activity.result.ActivityResultCallback;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.model.to_web.WebNavigation;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.dasnano.vddocumentcapture.managers.CameraManagerBase;
import com.google.android.datatransport.cct.internal.LogResponse;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Function;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.FirebaseAppCheck;
import com.google.firebase.appcheck.internal.DefaultAppCheckTokenResult;
import com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.encoders.EncodingException;
import com.veridas.camera.CameraAction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements CallbackToFutureAdapter.Resolver, SuccessContinuation, Continuation, ActivityResultCallback, DoubleFunction, Reaction.NavigationExecution, CameraAction, Function {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2119p0;

    public /* synthetic */ k(Object obj) {
        this.f2119p0 = obj;
    }

    @Override // com.google.android.datatransport.runtime.retries.Function
    public Object apply(Object obj) throws IOException {
        sd.a aVar = (sd.a) this.f2119p0;
        sd.a.C0490a c0490a = (sd.a.C0490a) obj;
        aVar.getClass();
        Logging.i("CctTransportBackend", "Making request to: %s", c0490a.f93169a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) c0490a.f93169a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(aVar.f93168g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty(DigipassManagerConstants.KEY_CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = c0490a.f93171c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    aVar.f93162a.encode(c0490a.f93170b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Logging.i("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    Logging.d("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(DigipassManagerConstants.KEY_CONTENT_TYPE));
                    Logging.d("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new sd.a.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new sd.a.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            sd.a.b bVar = new sd.a.b(responseCode, null, LogResponse.fromJson(new BufferedReader(new InputStreamReader(gZIPInputStream))).getNextRequestWaitMillis());
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th2) {
                            if (gZIPInputStream != null) {
                                try {
                                    gZIPInputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                }
                throw th8;
            }
        } catch (EncodingException e5) {
            e = e5;
            Logging.e("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new sd.a.b(400, null, 0L);
        } catch (ConnectException e7) {
            e = e7;
            Logging.e("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new sd.a.b(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            Logging.e("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new sd.a.b(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            Logging.e("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new sd.a.b(400, null, 0L);
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((CameraRepository) this.f2119p0).lambda$deinit$0(completer);
    }

    @Override // com.veridas.camera.CameraAction
    public void execute(boolean z10) {
        CameraManagerBase.c((CameraManagerBase) this.f2119p0, z10);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d2) {
        TransferParameters function = (TransferParameters) this.f2119p0;
        Rgb.Companion companion = Rgb.INSTANCE;
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.rcpResponse(d2, function.getA(), function.getB(), function.getC(), function.getD(), function.getE(), function.getF(), function.getGamma());
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        ((Function1) this.f2119p0).invoke(obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f2119p0;
        ExecutorService executorService = Utils.f47779a;
        countDownLatch.countDown();
        return null;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.NavigationExecution
    public void execute(Activity activity, Object obj, Object obj2) {
        ((WebController) obj).openWeb(activity, (WebNavigation) this.f2119p0, obj2);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        DefaultFirebaseAppCheck defaultFirebaseAppCheck = (DefaultFirebaseAppCheck) this.f2119p0;
        AppCheckToken appCheckToken = (AppCheckToken) obj;
        defaultFirebaseAppCheck.getClass();
        defaultFirebaseAppCheck.f47608i.execute(new l(defaultFirebaseAppCheck, appCheckToken, 2));
        defaultFirebaseAppCheck.f47612n = appCheckToken;
        defaultFirebaseAppCheck.f47605f.maybeScheduleTokenRefresh(appCheckToken);
        Iterator it = defaultFirebaseAppCheck.f47603d.iterator();
        while (it.hasNext()) {
            ((FirebaseAppCheck.AppCheckListener) it.next()).onAppCheckTokenChanged(appCheckToken);
        }
        DefaultAppCheckTokenResult defaultAppCheckTokenResultConstructFromAppCheckToken = DefaultAppCheckTokenResult.constructFromAppCheckToken(appCheckToken);
        Iterator it2 = defaultFirebaseAppCheck.f47602c.iterator();
        while (it2.hasNext()) {
            ((AppCheckTokenListener) it2.next()).onAppCheckTokenChanged(defaultAppCheckTokenResultConstructFromAppCheckToken);
        }
        return Tasks.forResult(appCheckToken);
    }
}

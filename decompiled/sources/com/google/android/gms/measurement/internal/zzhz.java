package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
@WorkerThread
final class zzhz implements Runnable {
    final /* synthetic */ zzia zza;
    private final URL zzb;
    private final String zzc;
    private final zzfp zzd;

    public zzhz(zzia zziaVar, String str, URL url, byte[] bArr, Map map, zzfp zzfpVar, byte[] bArr2) {
        this.zza = zziaVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfpVar);
        this.zzb = url;
        this.zzd = zzfpVar;
        this.zzc = str;
    }

    private final void zzb(final int i10, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhy
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(i10, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.measurement.internal.zzhz] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? r4;
        ?? r10;
        int responseCode;
        Throwable th2;
        IOException e5;
        InputStream inputStream;
        this.zza.zzax();
        try {
            zzia zziaVar = this.zza;
            URLConnection uRLConnectionOpenConnection = this.zzb.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zziaVar.zzs.zzf();
            r4 = 60000;
            r10 = 60000;
            httpURLConnection.setConnectTimeout(60000);
            zziaVar.zzs.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i10 = inputStream.read(bArr);
                                    if (i10 <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        zzb(responseCode, null, byteArray, headerFields);
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i10);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                        }
                    } catch (IOException e7) {
                        e5 = e7;
                        r10 = 0;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(responseCode, e5, null, r10);
                    } catch (Throwable th5) {
                        th2 = th5;
                        r4 = 0;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(responseCode, null, null, r4);
                        throw th2;
                    }
                } catch (IOException e10) {
                    e5 = e10;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(responseCode, e5, null, r10);
                } catch (Throwable th6) {
                    th2 = th6;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(responseCode, null, null, r4);
                    throw th2;
                }
            } catch (IOException e11) {
                e = e11;
                r10 = 0;
                IOException iOException = e;
                responseCode = 0;
                e5 = iOException;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                zzb(responseCode, e5, null, r10);
            } catch (Throwable th7) {
                th = th7;
                r4 = 0;
                Throwable th8 = th;
                responseCode = 0;
                th2 = th8;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                zzb(responseCode, null, null, r4);
                throw th2;
            }
        } catch (IOException e12) {
            e = e12;
            httpURLConnection = null;
            r10 = 0;
        } catch (Throwable th9) {
            th = th9;
            httpURLConnection = null;
            r4 = 0;
        }
    }

    public final /* synthetic */ void zza(int i10, Exception exc, byte[] bArr, Map map) {
        zzfp zzfpVar = this.zzd;
        zzfpVar.zza.zzC(this.zzc, i10, exc, bArr, map);
    }
}

package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
@WorkerThread
final class zzem implements Runnable {
    final /* synthetic */ zzen zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzej zzd;
    private final String zze;
    private final Map zzf;

    public zzem(zzen zzenVar, String str, URL url, byte[] bArr, Map map, zzej zzejVar) {
        this.zza = zzenVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzejVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzejVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00d8 A[EDGE_INSN: B:101:0x00d8->B:38:0x00d8 BREAK  A[LOOP:1: B:33:0x00cc->B:35:0x00d2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2 A[Catch: all -> 0x00d6, LOOP:1: B:33:0x00cc->B:35:0x00d2, LOOP_END, TryCatch #9 {all -> 0x00d6, blocks: (B:32:0x00ca, B:33:0x00cc, B:35:0x00d2, B:38:0x00d8), top: B:91:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0151  */
    /* JADX WARN: Code duplicated, block: B:83:0x0190  */
    /* JADX WARN: Code duplicated, block: B:87:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0109: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:266), block:B:52:0x0108 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x010d: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:270), block:B:53:0x010b */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th2;
        int i10;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException e5;
        Map map2;
        zzel zzelVar;
        zzfo zzfoVarZzaz;
        IOException iOException;
        int responseCode;
        Map map3;
        Map map4;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i11;
        this.zza.zzax();
        int i12 = 0;
        OutputStream outputStream = null;
        try {
            zzen zzenVar = this.zza;
            URLConnection uRLConnectionOpenConnection = this.zzb.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzenVar.zzs.zzf();
            httpURLConnection.setConnectTimeout(60000);
            zzenVar.zzs.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.zzf;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (this.zzc != null) {
                    byte[] bArrZzy = this.zza.zzf.zzu().zzy(this.zzc);
                    zzef zzefVarZzj = this.zza.zzs.zzay().zzj();
                    int length = bArrZzy.length;
                    zzefVarZzj.zzb("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrZzy);
                        outputStream2.close();
                        responseCode = httpURLConnection.getResponseCode();
                        try {
                            try {
                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    inputStream = httpURLConnection.getInputStream();
                                    try {
                                        bArr = new byte[1024];
                                        while (true) {
                                            i11 = inputStream.read(bArr);
                                            if (i11 > 0) {
                                                break;
                                            } else {
                                                byteArrayOutputStream.write(bArr, 0, i11);
                                            }
                                        }
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        zzfoVarZzaz = this.zza.zzs.zzaz();
                                        zzelVar = new zzel(this.zze, this.zzd, responseCode, null, byteArray, headerFields, null);
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
                                map2 = null;
                                iOException = e7;
                                i12 = responseCode;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e10) {
                                        this.zza.zzs.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeh.zzn(this.zze), e10);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzfoVarZzaz = this.zza.zzs.zzaz();
                                zzelVar = new zzel(this.zze, this.zzd, i12, iOException, null, map2, null);
                            } catch (Throwable th5) {
                                th2 = th5;
                                map = null;
                                i10 = responseCode;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e11) {
                                        this.zza.zzs.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeh.zzn(this.zze), e11);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                this.zza.zzs.zzaz().zzp(new zzel(this.zze, this.zzd, i10, null, null, map, null));
                                throw th2;
                            }
                        } catch (IOException e12) {
                            iOException = e12;
                            i12 = responseCode;
                            map2 = map4;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            zzfoVarZzaz = this.zza.zzs.zzaz();
                            zzelVar = new zzel(this.zze, this.zzd, i12, iOException, null, map2, null);
                        } catch (Throwable th6) {
                            th2 = th6;
                            i10 = responseCode;
                            map = map3;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.zza.zzs.zzaz().zzp(new zzel(this.zze, this.zzd, i10, null, null, map, null));
                            throw th2;
                        }
                    } catch (IOException e13) {
                        e5 = e13;
                        map2 = null;
                        outputStream = outputStream2;
                        iOException = e5;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzfoVarZzaz = this.zza.zzs.zzaz();
                        zzelVar = new zzel(this.zze, this.zzd, i12, iOException, null, map2, null);
                        zzfoVarZzaz.zzp(zzelVar);
                    } catch (Throwable th7) {
                        th2 = th7;
                        i10 = 0;
                        map = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzs.zzaz().zzp(new zzel(this.zze, this.zzd, i10, null, null, map, null));
                        throw th2;
                    }
                } else {
                    responseCode = httpURLConnection.getResponseCode();
                    Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    inputStream = httpURLConnection.getInputStream();
                    bArr = new byte[1024];
                    while (true) {
                        i11 = inputStream.read(bArr);
                        if (i11 > 0) {
                            break;
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i11);
                    }
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    httpURLConnection.disconnect();
                    zzfoVarZzaz = this.zza.zzs.zzaz();
                    zzelVar = new zzel(this.zze, this.zzd, responseCode, null, byteArray2, headerFields2, null);
                }
            } catch (IOException e14) {
                i12 = 0;
                map2 = null;
                iOException = e14;
            } catch (Throwable th8) {
                i10 = 0;
                map = null;
                th2 = th8;
            }
            zzfoVarZzaz.zzp(zzelVar);
        } catch (IOException e15) {
            e5 = e15;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th9) {
            th2 = th9;
            i10 = 0;
            httpURLConnection = null;
            map = null;
        }
    }
}

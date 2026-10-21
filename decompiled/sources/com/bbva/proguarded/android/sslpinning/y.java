package com.bbva.proguarded.android.sslpinning;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.sl.ar.android.sslpinning.SSLChecker;
import com.bbva.sl.ar.android.sslpinning.exception.SSLPinningException;
import com.bbva.sl.ar.android.sslpinning.exception.UpdaterException;
import com.bbva.sl.ar.android.sslpinning.net.HttpsSSLPinningConnection;
import com.bbva.sl.ar.android.sslpinning.result.CheckResult;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.sl.ar.android.sslpinning.verifier.RelaxedVerifier;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes8.dex */
public class y implements w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f36177i = Logger.getLogger(y.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublicKey f36178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f36179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLChecker f36180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f36184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f36185h;

    public y(b bVar, SSLChecker sSLChecker, PublicKey publicKey) {
        this.f36178a = publicKey;
        this.f36180c = sSLChecker;
        String[] strArrSplit = bVar.getProperty("com.bbva.sl.ar.sslpinning.update.url").split(ReplenishLogic.ID_SEPARATOR);
        this.f36179b = strArrSplit;
        this.f36185h = bVar.a("com.bbva.sl.ar.sslpinning.update.retries", strArrSplit.length);
        this.f36183f = bVar.a("com.bbva.sl.ar.sslpinning.update.readtimeout", 10000);
        this.f36184g = bVar.a("com.bbva.sl.ar.sslpinning.update.conntimeout", 10000);
        this.f36181d = bVar.getProperty("com.bbva.sl.ar.sslpinning.update.basicauth.user");
        this.f36182e = bVar.getProperty("com.bbva.sl.ar.sslpinning.update.basicauth.pass");
    }

    public static boolean c(d dVar, HttpsURLConnection httpsURLConnection) throws SSLPinningException {
        String str;
        m mVarA = dVar.a(httpsURLConnection.getURL());
        Logger logger = f36177i;
        if (mVarA == null) {
            str = "The new catalog doesn't contain a valid site for the current update server.";
        } else {
            try {
                CheckResult checkResultA = new ab(mVarA).a(new HttpsSSLPinningConnection(httpsURLConnection));
                if (checkResultA.isSuccess()) {
                    return true;
                }
                logger.severe("The update server site config doesn't allow access to the service. Error: ".concat(String.valueOf(checkResultA)));
                return false;
            } catch (SSLPinningException e5) {
                str = "Error checking validity for the current update server in the new catalog: " + e5.getMessage();
            }
        }
        logger.severe(str);
        return false;
    }

    @Override // com.bbva.proguarded.android.sslpinning.w
    public final d a(z zVar) throws Throwable {
        Throwable th2;
        HttpsURLConnection httpsURLConnection;
        NoSuchAlgorithmException noSuchAlgorithmException;
        HttpsURLConnection httpsURLConnection2;
        KeyManagementException keyManagementException;
        IOException iOException;
        MalformedURLException malformedURLException;
        SSLPinningException sSLPinningException;
        UpdaterException updaterException;
        UpdaterException updaterException2;
        String str = "SSL verification failed for update server: ";
        String[] strArr = this.f36179b;
        char c10 = 0;
        String str2 = strArr[0];
        KeyManager[] keyManagerArr = null;
        int i10 = 0;
        UpdaterException updaterException3 = null;
        while (true) {
            int i11 = this.f36185h;
            if (i10 >= i11) {
                if (updaterException3 == null) {
                    throw new UpdaterException(801, "General error trying to access update server.");
                }
                throw updaterException3;
            }
            StringBuilder sb2 = new StringBuilder("Trying to update [");
            i10++;
            sb2.append(i10);
            sb2.append("/");
            sb2.append(i11);
            sb2.append("] at URL: ");
            sb2.append(t.a(str2));
            String string = sb2.toString();
            Logger logger = f36177i;
            logger.finer(string);
            try {
                httpsURLConnection2 = (HttpsURLConnection) new URL(str2.trim()).openConnection();
                try {
                    try {
                        RelaxedVerifier relaxedVerifier = new RelaxedVerifier();
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        TrustManager[] trustManagerArr = new TrustManager[1];
                        trustManagerArr[c10] = relaxedVerifier;
                        sSLContext.init(keyManagerArr, trustManagerArr, new SecureRandom());
                        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                        httpsURLConnection2.setRequestProperty("X-SSLPinning-Params", zVar.a());
                        String str3 = this.f36181d;
                        if (str3 != null && str3 != null) {
                            httpsURLConnection2.addRequestProperty("Authorization", "Basic ".concat(String.valueOf(f.a(str3 + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + this.f36182e))));
                        }
                        httpsURLConnection2.setSSLSocketFactory(socketFactory);
                        httpsURLConnection2.setHostnameVerifier(relaxedVerifier);
                        httpsURLConnection2.setReadTimeout(this.f36183f);
                        httpsURLConnection2.setConnectTimeout(this.f36184g);
                        httpsURLConnection2.setRequestMethod("GET");
                        logger.finer("Establishing connection to update server...");
                        httpsURLConnection2.getResponseCode();
                        logger.fine("Pinning connection to update server [" + t.a(str2) + "].");
                        CheckResult checkResultCheckEstablished = this.f36180c.checkEstablished(new HttpsSSLPinningConnection(httpsURLConnection2));
                        if (!checkResultCheckEstablished.isFailed()) {
                            d dVarB = b(httpsURLConnection2);
                            logger.finer("Disconnecting update server connection...");
                            httpsURLConnection2.disconnect();
                            return dVarB;
                        }
                        logger.severe(str + checkResultCheckEstablished.toString());
                        if (checkResultCheckEstablished.getInnerCause() != null) {
                            updaterException2 = new UpdaterException(ResultCode.ERROR_UPDATER_SSL, str + checkResultCheckEstablished.toString(), checkResultCheckEstablished.getInnerCause());
                        } else {
                            updaterException2 = new UpdaterException(ResultCode.ERROR_UPDATER_SSL, str + checkResultCheckEstablished.toString());
                        }
                        logger.finer("Disconnecting update server connection...");
                        httpsURLConnection2.disconnect();
                        updaterException3 = updaterException2;
                        logger.severe("Update failed for server [" + t.a(str2) + "] at try [" + i10 + "/" + i11 + "]: " + updaterException3.getMessage());
                        str2 = strArr[i10 % strArr.length];
                        c10 = 0;
                        keyManagerArr = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        httpsURLConnection = httpsURLConnection2;
                        if (httpsURLConnection == null) {
                            throw th2;
                        }
                        logger.finer("Disconnecting update server connection...");
                        httpsURLConnection.disconnect();
                        throw th2;
                    }
                } catch (UpdaterException e5) {
                    updaterException = e5;
                    if (httpsURLConnection2 != null) {
                        logger.finer("Disconnecting update server connection...");
                        httpsURLConnection2.disconnect();
                    }
                    updaterException3 = updaterException;
                    logger.severe("Update failed for server [" + t.a(str2) + "] at try [" + i10 + "/" + i11 + "]: " + updaterException3.getMessage());
                    str2 = strArr[i10 % strArr.length];
                    c10 = 0;
                    keyManagerArr = null;
                } catch (SSLPinningException e7) {
                    sSLPinningException = e7;
                    updaterException2 = new UpdaterException(sSLPinningException);
                    if (httpsURLConnection2 != null) {
                    }
                    updaterException3 = updaterException2;
                    logger.severe("Update failed for server [" + t.a(str2) + "] at try [" + i10 + "/" + i11 + "]: " + updaterException3.getMessage());
                    str2 = strArr[i10 % strArr.length];
                    c10 = 0;
                    keyManagerArr = null;
                } catch (MalformedURLException e10) {
                    malformedURLException = e10;
                    updaterException2 = new UpdaterException(ResultCode.ERROR_UPDATER_CONN, "Updater connection failed. Invalid URL.", malformedURLException);
                    if (httpsURLConnection2 != null) {
                    }
                    updaterException3 = updaterException2;
                    logger.severe("Update failed for server [" + t.a(str2) + "] at try [" + i10 + "/" + i11 + "]: " + updaterException3.getMessage());
                    str2 = strArr[i10 % strArr.length];
                    c10 = 0;
                    keyManagerArr = null;
                } catch (IOException e11) {
                    iOException = e11;
                    updaterException2 = new UpdaterException(ResultCode.ERROR_UPDATER_IO, "Updater connection failed.", iOException);
                    if (httpsURLConnection2 != null) {
                    }
                    updaterException3 = updaterException2;
                    logger.severe("Update failed for server [" + t.a(str2) + "] at try [" + i10 + "/" + i11 + "]: " + updaterException3.getMessage());
                    str2 = strArr[i10 % strArr.length];
                    c10 = 0;
                    keyManagerArr = null;
                } catch (KeyManagementException e12) {
                    keyManagementException = e12;
                    updaterException2 = new UpdaterException(ResultCode.ERROR_UPDATER_CONN, "Updater connection failed. Key error.", keyManagementException);
                    if (httpsURLConnection2 != null) {
                    }
                    updaterException3 = updaterException2;
                    logger.severe("Update failed for server [" + t.a(str2) + "] at try [" + i10 + "/" + i11 + "]: " + updaterException3.getMessage());
                    str2 = strArr[i10 % strArr.length];
                    c10 = 0;
                    keyManagerArr = null;
                } catch (NoSuchAlgorithmException e13) {
                    noSuchAlgorithmException = e13;
                    updaterException2 = new UpdaterException(ResultCode.ERROR_UPDATER_CONN, "Updater connection failed. No such algorithm", noSuchAlgorithmException);
                    if (httpsURLConnection2 != null) {
                    }
                    updaterException3 = updaterException2;
                    logger.severe("Update failed for server [" + t.a(str2) + "] at try [" + i10 + "/" + i11 + "]: " + updaterException3.getMessage());
                    str2 = strArr[i10 % strArr.length];
                    c10 = 0;
                    keyManagerArr = null;
                }
            } catch (UpdaterException e14) {
                updaterException = e14;
                httpsURLConnection2 = null;
            } catch (SSLPinningException e15) {
                sSLPinningException = e15;
                httpsURLConnection2 = null;
            } catch (MalformedURLException e16) {
                malformedURLException = e16;
                httpsURLConnection2 = null;
            } catch (IOException e17) {
                iOException = e17;
                httpsURLConnection2 = null;
            } catch (KeyManagementException e18) {
                keyManagementException = e18;
                httpsURLConnection2 = null;
            } catch (NoSuchAlgorithmException e19) {
                noSuchAlgorithmException = e19;
                httpsURLConnection2 = null;
            } catch (Throwable th4) {
                th2 = th4;
                httpsURLConnection = null;
            }
        }
    }

    public final d b(HttpsURLConnection httpsURLConnection) throws SSLPinningException {
        try {
            int responseCode = httpsURLConnection.getResponseCode();
            f36177i.finer("HTTP response to update server: ".concat(String.valueOf(responseCode)));
            if (responseCode != 200) {
                throw new UpdaterException(ResultCode.ERROR_UPDATER_HTTP, "Obtained return code [" + responseCode + "] accessing update service.");
            }
            d dVarA = d.a(v.a(httpsURLConnection.getInputStream(), (String) null), this.f36178a);
            if (c(dVarA, httpsURLConnection)) {
                httpsURLConnection.disconnect();
                return dVarA;
            }
            httpsURLConnection.disconnect();
            throw new UpdaterException(ResultCode.ERROR_UPDATER_INVALIDATED, "Update server becomes invalid in this catalog.");
        } catch (IOException e5) {
            throw new UpdaterException(ResultCode.ERROR_UPDATER_IO, androidx.camera.core.impl.a.d(e5, new StringBuilder("Error accessing the update server: ")), e5);
        }
    }
}

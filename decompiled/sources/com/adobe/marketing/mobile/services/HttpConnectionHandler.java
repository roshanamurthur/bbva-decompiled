package com.adobe.marketing.mobile.services;

import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes2.dex */
class HttpConnectionHandler {
    private static final String TAG = "HttpConnectionHandler";
    protected Command command = Command.GET;
    protected final HttpsURLConnection httpsUrlConnection;

    public enum Command {
        GET(false),
        POST(true);

        private boolean doOutputSetting;

        Command(boolean z10) {
            this.doOutputSetting = z10;
        }

        public boolean isDoOutput() {
            return this.doOutputSetting;
        }
    }

    public HttpConnectionHandler(URL url) throws IOException {
        this.httpsUrlConnection = (HttpsURLConnection) url.openConnection();
    }

    public HttpConnecting connect(byte[] bArr) {
        LoggingMode loggingMode = LoggingMode.DEBUG;
        String str = TAG;
        Object[] objArr = new Object[2];
        objArr[0] = this.httpsUrlConnection.getURL() == null ? "" : this.httpsUrlConnection.getURL().toString();
        objArr[1] = this.command.toString();
        MobileCore.log(loggingMode, str, String.format("Connecting to URL %s (%s)", objArr));
        Command command = this.command;
        Command command2 = Command.POST;
        if (command == command2 && bArr != null) {
            this.httpsUrlConnection.setFixedLengthStreamingMode(bArr.length);
        }
        try {
            this.httpsUrlConnection.connect();
            if (this.command == command2 && bArr != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.httpsUrlConnection.getOutputStream());
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            }
        } catch (SocketTimeoutException e5) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Connection failure, socket timeout (%s)", e5));
        } catch (IOException e7) {
            LoggingMode loggingMode2 = LoggingMode.WARNING;
            String str2 = TAG;
            Object[] objArr2 = new Object[1];
            objArr2[0] = e7.getLocalizedMessage() != null ? e7.getLocalizedMessage() : e7.getMessage();
            MobileCore.log(loggingMode2, str2, String.format("Connection failure (%s)", objArr2));
        } catch (Error e10) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Connection failure (%s)", e10));
        } catch (Exception e11) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Connection failure (%s)", e11));
        }
        return new HttpConnection(this.httpsUrlConnection);
    }

    public boolean setCommand(HttpMethod httpMethod) {
        if (httpMethod == null) {
            return false;
        }
        try {
            Command commandValueOf = Command.valueOf(httpMethod.name());
            this.httpsUrlConnection.setRequestMethod(commandValueOf.name());
            this.httpsUrlConnection.setDoOutput(commandValueOf.isDoOutput());
            this.httpsUrlConnection.setUseCaches(false);
            this.command = commandValueOf;
            return true;
        } catch (Error e5) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Failed to set http command (%s)!", e5));
            return false;
        } catch (IllegalArgumentException e7) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("%s command is not supported (%s)!", httpMethod.toString(), e7));
            return false;
        } catch (IllegalStateException e10) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Cannot set command after connect (%s)!", e10));
            return false;
        } catch (ProtocolException e11) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("%s is not a valid HTTP command (%s)!", httpMethod.toString(), e11));
            return false;
        } catch (Exception e12) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Failed to set http command (%s)!", e12));
            return false;
        }
    }

    public void setConnectTimeout(int i10) {
        try {
            this.httpsUrlConnection.setConnectTimeout(i10);
        } catch (Error e5) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Failed to set connection timeout (%s)!", e5));
        } catch (IllegalArgumentException e7) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format(i10 + " is not valid timeout value (%s)", e7));
        } catch (Exception e10) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Failed to set connection timeout (%s)!", e10));
        }
    }

    public void setReadTimeout(int i10) {
        try {
            this.httpsUrlConnection.setReadTimeout(i10);
        } catch (Error e5) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Failed to set read timeout (%s)!", e5));
        } catch (IllegalArgumentException e7) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format(i10 + " is not valid timeout value (%s)", e7));
        } catch (Exception e10) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Failed to set read timeout (%s)!", e10));
        }
    }

    public void setRequestProperty(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                this.httpsUrlConnection.setRequestProperty(entry.getKey(), entry.getValue());
            } catch (Error e5) {
                MobileCore.log(LoggingMode.WARNING, TAG, String.format("Failed to set request property (%s)!", e5));
            } catch (IllegalStateException e7) {
                MobileCore.log(LoggingMode.WARNING, TAG, String.format("Cannot set header field after connect (%s)!", e7));
                return;
            } catch (Exception e10) {
                MobileCore.log(LoggingMode.WARNING, TAG, String.format("Failed to set request property (%s)!", e10));
            }
        }
    }
}

package com.vierge.pinpadsdk.script;

import android.os.AsyncTask;
import androidx.databinding.e;
import com.vierge.pinpadsdk.PinPadSdk;
import com.vierge.pinpadsdk.utils.Logs;
import java.lang.reflect.Array;
import mx.openpay.library.data.util.CommandConstants;

/* JADX INFO: loaded from: classes6.dex */
public class ScriptProtocol {
    public static final int inC12Failed = 4;
    public static final int inC12Successful = 3;
    public static final int inC25Failed = 2;
    public static final int inC25Successful = 1;
    public static final int inNull = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PinPadSdk f67579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f67582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f67583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f67584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f67585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f67586h;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f67591n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ScriptProtocolInterface f67592o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f67587i = 249;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f67590l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f67593p = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f67589k = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[][] f67588j = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 7, 5);

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Thread.currentThread().getName();
                Logs.write("Tengo que esperar por 10 segundos ... ");
                Thread.sleep(2000L);
                Logs.write("Ya termine los 10 segundos.");
                ScriptProtocol.this._runNextCommand();
            } catch (InterruptedException e5) {
                Logs.write("InterruptedException : " + e5.getLocalizedMessage());
            }
        }
    }

    public ScriptProtocol(ScriptProtocolInterface scriptProtocolInterface, PinPadSdk pinPadSdk, String str, String str2) {
        this.m = false;
        this.f67591n = false;
        this.f67579a = pinPadSdk;
        for (int i10 = 0; i10 < this.f67588j.length; i10++) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f67588j[i10];
                if (i11 < iArr.length) {
                    iArr[i11] = 6;
                    i11++;
                }
            }
        }
        this.f67592o = scriptProtocolInterface;
        this.f67580b = "";
        this.f67581c = "";
        this.f67582d = "";
        this.f67583e = 0;
        this.f67584f = 0;
        this.f67586h = "01";
        this.f67585g = "01";
        if (str.length() > this.f67587i) {
            int length = str2.length();
            int i12 = this.f67587i;
            if (length > i12) {
                this.f67586h = NumberOfScript.scriptFirstPart;
                this.f67585g = NumberOfScript.scriptFirstPart;
                this.f67581c = str.substring(0, i12);
                this.f67582d = str2.substring(0, this.f67587i);
                str.substring(this.f67587i + 1, str.length() - 1);
                this.f67580b = e.c(str2, 1, this.f67587i + 1);
                this.f67583e = 0;
                int[][] iArr2 = this.f67588j;
                int[] iArr3 = iArr2[0];
                iArr3[0] = 0;
                iArr3[1] = 2;
                iArr2[2][1] = 4;
                iArr2[4][3] = 1;
                iArr2[1][1] = 3;
                iArr2[3][1] = 5;
                iArr2[5][3] = 6;
                this.f67591n = true;
                return;
            }
        }
        if (str.length() > 0) {
            int length2 = str2.length();
            int i13 = this.f67587i;
            if (length2 > i13) {
                this.f67586h = "01";
                this.f67585g = NumberOfScript.scriptFirstPart;
                this.f67581c = str;
                this.f67582d = str2.substring(0, i13);
                this.f67580b = e.c(str2, 1, this.f67587i + 1);
                this.f67583e = 0;
                int[][] iArr4 = this.f67588j;
                iArr4[0][0] = 0;
                int[] iArr5 = iArr4[4];
                iArr5[3] = 4;
                iArr5[1] = 1;
                iArr4[1][1] = 3;
                iArr4[3][1] = 4;
                iArr4[5][3] = 6;
                this.f67591n = true;
                return;
            }
        }
        if (str.length() > this.f67587i && str2.length() > 0) {
            this.f67586h = NumberOfScript.scriptFirstPart;
            this.f67585g = "01";
            this.f67581c = str.substring(0, this.f67587i);
            str.substring(this.f67587i + 1, str.length() - 1);
            this.f67582d = str2;
            this.f67583e = 0;
            int[][] iArr6 = this.f67588j;
            int[] iArr7 = iArr6[0];
            iArr7[0] = 0;
            iArr7[1] = 2;
            iArr6[2][1] = 4;
            iArr6[4][3] = 1;
            iArr6[1][1] = 5;
            iArr6[5][3] = 6;
            this.f67591n = true;
            return;
        }
        if (str.length() > 0 && str2.length() > 0) {
            this.f67586h = "01";
            this.f67585g = "01";
            this.f67580b = "";
            this.f67581c = str;
            this.f67582d = str2;
            this.f67583e = 0;
            int[][] iArr8 = this.f67588j;
            int[] iArr9 = iArr8[0];
            iArr9[0] = 0;
            iArr9[1] = 4;
            iArr8[4][3] = 1;
            iArr8[1][1] = 5;
            iArr8[5][3] = 6;
            this.f67591n = true;
            return;
        }
        if (str2.length() > this.f67587i && str.length() == 0) {
            this.f67585g = NumberOfScript.scriptFirstPart;
            this.f67582d = str2.substring(0, this.f67587i);
            this.f67580b = e.c(str2, 1, this.f67587i + 1);
            this.f67583e = 1;
            int[][] iArr10 = this.f67588j;
            iArr10[0][0] = 1;
            iArr10[1][1] = 3;
            iArr10[3][1] = 5;
            iArr10[5][3] = 6;
            this.f67591n = true;
            return;
        }
        if (str.length() > this.f67587i && str2.length() == 0) {
            this.f67586h = NumberOfScript.scriptFirstPart;
            this.f67581c = str.substring(0, this.f67587i);
            str.substring(this.f67587i + 1, str.length() - 1);
            this.f67583e = 0;
            int[][] iArr11 = this.f67588j;
            int[] iArr12 = iArr11[0];
            iArr12[0] = 0;
            iArr12[1] = 2;
            iArr11[2][1] = 4;
            iArr11[4][3] = 6;
            this.m = true;
            return;
        }
        if (str.length() == 0 && str2.length() > 0) {
            this.f67585g = "01";
            this.f67580b = "";
            this.f67581c = "";
            this.f67582d = str2;
            this.f67583e = 1;
            int[][] iArr13 = this.f67588j;
            int[] iArr14 = iArr13[1];
            iArr14[0] = 1;
            iArr14[1] = 5;
            iArr13[5][3] = 6;
            this.f67591n = true;
            return;
        }
        if (str2.length() != 0 || str.length() <= 0) {
            if (str.length() == 0 && str2.length() == 0) {
                this.f67588j[0][0] = 6;
                return;
            } else {
                this.f67588j[0][0] = 6;
                return;
            }
        }
        this.f67586h = "01";
        this.f67580b = "";
        this.f67581c = str;
        this.f67582d = "";
        this.f67583e = 0;
        int[][] iArr15 = this.f67588j;
        int[] iArr16 = iArr15[0];
        iArr16[0] = 0;
        iArr16[1] = 4;
        iArr15[4][3] = 6;
        this.m = true;
    }

    public void _runNextCommand() {
        String str;
        byte[] bArrExecuteCommand = {6};
        int i10 = this.f67588j[this.f67583e][this.f67584f];
        this.f67583e = i10;
        switch (i10) {
            case 0:
                str = "state Sending71";
                break;
            case 1:
                str = "state Sending72";
                break;
            case 2:
                str = "state Sending71SecondPart";
                break;
            case 3:
                str = "state Sending72SecondPart";
                break;
            case 4:
                str = "state SendingC12para71";
                break;
            case 5:
                str = "state SendingC12para72";
                break;
            case 6:
                str = "state End";
                break;
            default:
                str = "Unknown";
                break;
        }
        Logs.write(str);
        int i11 = this.f67583e;
        if (6 == i11) {
            this.f67589k = false;
            return;
        }
        String str2 = this.f67581c;
        PinPadSdk pinPadSdk = this.f67579a;
        if (i11 == 0) {
            bArrExecuteCommand = pinPadSdk.executeCommand(CommandConstants.COMMAND_C25, new String[]{TypeScript.script71, "1", this.f67586h, str2}, true);
        } else if (i11 == 2) {
            bArrExecuteCommand = pinPadSdk.executeCommand(CommandConstants.COMMAND_C25, new String[]{TypeScript.script71, "1", "91", str2}, true);
        } else if (i11 == 1) {
            bArrExecuteCommand = pinPadSdk.executeCommand(CommandConstants.COMMAND_C25, new String[]{"72", "0", this.f67585g, this.f67582d}, true);
        } else if (i11 == 3) {
            bArrExecuteCommand = pinPadSdk.executeCommand(CommandConstants.COMMAND_C25, new String[]{"72", "1", "91", this.f67580b}, true);
        } else if (i11 == 4) {
            bArrExecuteCommand = pinPadSdk.executeCommand("C12", new String[]{TypeScript.script71}, true);
            if (this.m) {
                this.f67590l = true;
            }
        } else if (i11 == 5) {
            bArrExecuteCommand = pinPadSdk.executeCommand("C12", new String[]{"72"}, true);
            if (this.f67591n) {
                this.f67590l = true;
            }
        } else {
            this.f67589k = false;
        }
        if (bArrExecuteCommand != null) {
            this.f67592o.write(bArrExecuteCommand);
        }
    }

    public void input(int i10) {
        this.f67584f = i10;
    }

    public boolean isSendOkResponse() {
        return this.f67590l;
    }

    public void runNextCommand() {
        if (this.f67589k) {
            AsyncTask.execute(this.f67593p);
        }
    }
}

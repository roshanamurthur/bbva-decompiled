package com.vierge.pinpadsdk.q7Protocol;

import android.os.Environment;
import androidx.camera.core.processing.f;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import com.vierge.pinpadsdk.utils.Binary;
import com.vierge.pinpadsdk.utils.Logs;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import mx.openpay.library.data.util.CommandConstants;

/* JADX INFO: loaded from: classes6.dex */
public class Q7Protocol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IQ7ProtocolSend f67572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IQ7ProtocolResults f67573c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f67575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f67576f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<ArrayList<Byte>> f67574d = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f67577g = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Thread.currentThread().getName();
                Logs.write("Tengo que esperar por 10 segundos ... ");
                Thread.sleep(10000L);
                Logs.write("... ya termine los 10 segundos.");
                Q7Protocol q7Protocol = Q7Protocol.this;
                Thread thread = q7Protocol.f67575e;
                if (thread != null) {
                    thread.interrupt();
                    q7Protocol.f67575e = null;
                }
                q7Protocol.f67576f = false;
                q7Protocol.f67573c.iq7rFailureTimeOut();
            } catch (InterruptedException e5) {
                Logs.write("InterruptedException : " + e5.getLocalizedMessage());
            }
        }
    }

    public Q7Protocol(IQ7ProtocolResults iQ7ProtocolResults, IQ7ProtocolSend iQ7ProtocolSend, String str) {
        this.f67576f = false;
        this.f67571a = f.d("/", str);
        this.f67576f = true;
        this.f67572b = iQ7ProtocolSend;
        this.f67573c = iQ7ProtocolResults;
    }

    public final void a() {
        if (this.f67574d.size() <= 0) {
            Thread thread = this.f67575e;
            if (thread != null) {
                thread.interrupt();
                this.f67575e = null;
                return;
            }
            return;
        }
        ArrayList<Byte> arrayList = this.f67574d.get(0);
        ArrayList arrayList2 = new ArrayList();
        char[] charArray = CommandConstants.COMMAND_Q7.toCharArray();
        ArrayList arrayList3 = new ArrayList();
        for (int iA = 0; iA < charArray.length; iA = androidx.room.a.a((byte) charArray[iA], arrayList3, iA, 1)) {
        }
        arrayList2.addAll(arrayList3);
        arrayList2.addAll(Binary.IntegerToArrayBinary(Integer.valueOf(arrayList.size()), 2));
        arrayList2.addAll(arrayList);
        arrayList2.add(0, (byte) 2);
        arrayList2.add((byte) 3);
        arrayList2.add(Byte.valueOf(MessageUtils.checkSum((ArrayList<Byte>) arrayList2)));
        byte[] bArr = new byte[arrayList2.size()];
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            bArr[i10] = ((Byte) arrayList2.get(i10)).byteValue();
        }
        this.f67574d.remove(0);
        this.f67572b.write(bArr);
        if (this.f67575e == null) {
            Thread thread2 = new Thread(this.f67577g, "timer");
            this.f67575e = thread2;
            thread2.start();
        }
    }

    public boolean inputData(short[] sArr) {
        boolean z10 = this.f67576f;
        if (!z10) {
            return z10;
        }
        procesResponse(sArr);
        return this.f67576f;
    }

    public void procesResponse(short[] sArr) {
        Thread thread = this.f67575e;
        if (thread != null) {
            thread.interrupt();
            this.f67575e = null;
        }
        int length = sArr.length;
        IQ7ProtocolResults iQ7ProtocolResults = this.f67573c;
        if (length == 1) {
            Logs.write(String.format("Recibi un carater de control: %x", Short.valueOf(sArr[0])));
            if (sArr[0] != 6) {
                this.f67576f = false;
                iQ7ProtocolResults.iq7rFailureEOT();
                Thread thread2 = this.f67575e;
                if (thread2 != null) {
                    thread2.interrupt();
                    this.f67575e = null;
                    return;
                }
                return;
            }
            return;
        }
        if (sArr.length > 1) {
            this.f67572b.write(new byte[]{6});
            if (this.f67575e == null) {
                Thread thread3 = new Thread(this.f67577g, "timer");
                this.f67575e = thread3;
                thread3.start();
            }
            ArrayList arrayList = new ArrayList();
            int iA = 0;
            while (iA < sArr.length) {
                iA = androidx.room.a.a((byte) sArr[iA], arrayList, iA, 1);
            }
            if (((Byte) arrayList.get(0)).byteValue() == 6) {
                arrayList.remove(0);
            }
            if (((Byte) arrayList.get(0)).byteValue() == 2) {
                arrayList.remove(0);
            }
            int i10 = Integer.parseInt(String.format("%c%c", arrayList.get(2), arrayList.get(3)));
            if (i10 == 0) {
                if (this.f67574d.size() == 0) {
                    iQ7ProtocolResults.iq7rSucess();
                    this.f67576f = false;
                }
                a();
                return;
            }
            this.f67576f = false;
            iQ7ProtocolResults.iq7rFailureAnOtherState(i10);
            Thread thread4 = this.f67575e;
            if (thread4 != null) {
                thread4.interrupt();
                this.f67575e = null;
            }
        }
    }

    public void readData() throws IOException {
        File file = new File(Environment.getExternalStorageDirectory(), this.f67571a);
        this.f67574d = new ArrayList<>();
        ArrayList<Byte> arrayList = new ArrayList<>();
        int length = (int) file.length();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        byte[] bArr = new byte[length];
        int i10 = 0;
        bufferedInputStream.read(bArr, 0, length);
        do {
            arrayList.add(Byte.valueOf(bArr[i10]));
            if (arrayList.size() == 900) {
                this.f67574d.add(arrayList);
                arrayList = new ArrayList<>();
            }
            i10++;
        } while (i10 < length);
        this.f67574d.add(arrayList);
        this.f67574d.add(new ArrayList<>());
        bufferedInputStream.close();
    }

    public void star() {
        a();
    }
}

package com.fido.android.framework.tm.core.prov;

import android.content.Context;
import android.util.Base64;
import com.bbva.ethermobilesdk.plugin.command.hmac.HmacCommand;
import com.fido.android.framework.tm.core.inf.ICryptoModule;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.CryptoProviderHelper;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class CryptoModule implements ICryptoModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f43537a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f43539c;

    public CryptoModule(String str, Context context) {
        this.f43538b = str;
        this.f43539c = context;
    }

    public static ByteArrayOutputStream a(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) {
        if (bArr == null) {
            return byteArrayOutputStream;
        }
        if (byteArrayOutputStream == null) {
            byteArrayOutputStream = new ByteArrayOutputStream();
        }
        for (int i10 : bArr) {
            byteArrayOutputStream.write(i10);
        }
        return byteArrayOutputStream;
    }

    public static byte[] c(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2 == null || bArr == null) {
            throw new IllegalArgumentException("Invalid argument");
        }
        try {
            Cipher cipherInstance = CryptoProviderHelper.getCipherInstance("AES/CBC/PKCS5Padding");
            cipherInstance.init(i10, new SecretKeySpec(bArr2, 0, bArr2.length, "AES"), new IvParameterSpec(bArr3));
            return cipherInstance.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            throw new AsmException(Outcome.FAILURE, "Failed to process AESCipher.");
        }
    }

    public static byte[] d(ArrayList arrayList) throws NoSuchAlgorithmException, NoSuchProviderException {
        MessageDigest messageDigestInstance = CryptoProviderHelper.getMessageDigestInstance("SHA-256");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            if (bArr != null) {
                messageDigestInstance.update(bArr);
            }
        }
        return messageDigestInstance.digest();
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        Logger.i("CryptoModule", "hmacSha256");
        try {
            Mac macInstance = CryptoProviderHelper.getMacInstance("HmacSHA256");
            macInstance.init(new SecretKeySpec(bArr, macInstance.getAlgorithm()));
            return macInstance.doFinal(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException e5) {
            throw new AsmException(Outcome.FAILURE, e5.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[SYNTHETIC] */
    public final ArrayList<byte[]> b(byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStreamOpenFileOutput;
        FileInputStream fileInputStream;
        byte[] bArrDecode;
        Context context = this.f43539c;
        char[] cArr = new char[26];
        for (int i10 = 0; i10 < 26; i10++) {
            cArr[i10] = (char) (((i10 * i10) % 26) + 97);
        }
        ArrayList<byte[]> arrayList = new ArrayList<>();
        Logger.i("CryptoModule", "getKey");
        if (this.f43537a == null) {
            String strSubstring = this.f43538b;
            if (strSubstring != null) {
                String str = File.separator;
                if (strSubstring.contains(str)) {
                    strSubstring = strSubstring.substring(strSubstring.lastIndexOf(str) + 1);
                }
            }
            String str2 = strSubstring + ".dat";
            Logger.i("CryptoModule", "createDatFilesWithKeys");
            FileOutputStream fileOutputStream = null;
            try {
                File file = new File(context.getFilesDir(), str2);
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr2 = new byte[(int) file.length()];
                        fileInputStream.read(bArr2);
                        bArrDecode = Base64.decode(bArr2, 2);
                        try {
                            fileInputStream.close();
                        } catch (IOException e5) {
                            Logger.e("CryptoModule", "Failed to close input stream", e5);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e7) {
                                Logger.e("CryptoModule", "Failed to close output stream", e7);
                            }
                        }
                        if (fileInputStream != null) {
                            throw th;
                        }
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (IOException e10) {
                            Logger.e("CryptoModule", "Failed to close input stream", e10);
                            throw th;
                        }
                    }
                } else {
                    Logger.i("CryptoModule", "getRandomKey");
                    byte[] bArr3 = new byte[100];
                    new SecureRandom().nextBytes(bArr3);
                    fileOutputStreamOpenFileOutput = context.openFileOutput(str2, 32768);
                    try {
                        fileOutputStreamOpenFileOutput.write(Base64.encode(bArr3, 2));
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException e11) {
                            Logger.e("CryptoModule", "Failed to close output stream", e11);
                        }
                        bArrDecode = bArr3;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStreamOpenFileOutput;
                        fileInputStream = null;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (fileInputStream != null) {
                            throw th;
                        }
                        fileInputStream.close();
                        throw th;
                    }
                }
                this.f43537a = bArrDecode;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStreamOpenFileOutput = null;
            }
        }
        arrayList.add(this.f43537a);
        arrayList.add("android_id".concat(new String(cArr)).getBytes(Charsets.utf8Charset));
        arrayList.add(bArr);
        return arrayList;
    }

    @Override // com.fido.android.framework.tm.core.inf.ICryptoModule
    public byte[] decryptData(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length <= 48) {
            throw new AsmException(Outcome.FAILURE, "decryptData: Invalid argument");
        }
        try {
            ArrayList<byte[]> arrayListB = b(bArr2);
            Charset charset = Charsets.utf8Charset;
            arrayListB.add("enc".getBytes(charset));
            byte[] bArrD = d(arrayListB);
            arrayListB.add(HmacCommand.ID.getBytes(charset));
            byte[] bArrD2 = d(arrayListB);
            byte[] bArr3 = new byte[32];
            System.arraycopy(bArr, 0, bArr3, 0, 32);
            byte[] bArr4 = new byte[16];
            System.arraycopy(bArr, 32, bArr4, 0, 16);
            int length = bArr.length - 48;
            byte[] bArr5 = new byte[length];
            System.arraycopy(bArr, 48, bArr5, 0, length);
            if (Arrays.equals(bArr3, e(bArrD2, bArr5))) {
                return c(2, bArr5, bArrD, bArr4);
            }
            throw new AsmException(Outcome.FAILURE, "Corrupted ciphertext");
        } catch (IOException | NoSuchAlgorithmException | NoSuchProviderException unused) {
            throw new AsmException(Outcome.FAILURE, "encryptData. Failed to get DB Key");
        }
    }

    @Override // com.fido.android.framework.tm.core.inf.ICryptoModule
    public byte[] encryptData(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new AsmException(Outcome.FAILURE, "encryptData: Invalid argument");
        }
        try {
            ArrayList<byte[]> arrayListB = b(bArr2);
            Charset charset = Charsets.utf8Charset;
            arrayListB.add("enc".getBytes(charset));
            byte[] bArrD = d(arrayListB);
            arrayListB.add(HmacCommand.ID.getBytes(charset));
            byte[] bArrD2 = d(arrayListB);
            byte[] bArr3 = new byte[16];
            new SecureRandom().nextBytes(bArr3);
            byte[] bArrC = c(1, bArr, bArrD, bArr3);
            return a(bArrC, a(bArr3, a(e(bArrD2, bArrC), null))).toByteArray();
        } catch (IOException | NoSuchAlgorithmException | NoSuchProviderException unused) {
            throw new AsmException(Outcome.FAILURE, "Failed to get DB Key.");
        }
    }
}

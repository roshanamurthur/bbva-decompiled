package com.viergegroup.sdk.taptophone.vierge.database;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.d.c.BuildConfig;
import com.d.c.setInjectedTransactionParameters;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.SdkTapOnPhoneVierge;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class DbHelper extends SQLiteOpenHelper {
    public static final String DATABASE_PATH;
    public static final int bOD = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f67780r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f67781s0 = 0;
    public static final byte[] setInjectedTransactionParameters = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f67782t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f67783u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SQLiteDatabase f67784p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Context f67785q0;

    static {
        b();
        l();
        Context context = SdkTapOnPhoneVierge.getContext();
        byte[] bArr = setInjectedTransactionParameters;
        Object[] objArr = new Object[1];
        c(bArr[33], (byte) (-bArr[48]), bArr[13], objArr);
        DATABASE_PATH = context.getDatabasePath((String) objArr[0]).getPath();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DbHelper() {
        Context context = SdkTapOnPhoneVierge.getContext();
        byte[] bArr = setInjectedTransactionParameters;
        Object[] objArr = new Object[1];
        c(bArr[33], (byte) (-bArr[48]), bArr[13], objArr);
        super(context, (String) objArr[0], (SQLiteDatabase.CursorFactory) null, 1);
        this.f67785q0 = SdkTapOnPhoneVierge.getContext();
    }

    public static void b() {
        setInjectedTransactionParameters = new byte[]{59, 67, 45, 86, -14, 9, -15, 2, 5, 4, 53, -54, -13, 0, -7, Constants.CVR_B1b41_1110_ONLINE_PIN, -10, -7, 69, -69, 12, -15, 68, -20, -51, -1, 13, Constants.CVR_B2b8765_1111_APP_DISABLED, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -21, -14, 12, -7, 1, -14, -18, -8, 22, -14, Constants.CVR_B2b8765_1111_APP_DISABLED, 27, -28, MessageUtils.MESSAGE_30_RS, -25, -8, 0, 8, 32, -31, 51, -55, 1, -2, 10, -10};
        bOD = 179;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r0 = r6 + 4
            int r8 = r8 * 14
            int r8 = r8 + 83
            int r7 = r7 + 4
            byte[] r1 = com.viergegroup.sdk.taptophone.vierge.database.DbHelper.setInjectedTransactionParameters
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L1b
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L35
        L1b:
            r3 = r2
        L1c:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L35:
            int r6 = -r6
            int r9 = r9 + r6
            int r6 = r8 + 1
            int r8 = r9 + (-1)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.viergegroup.sdk.taptophone.vierge.database.DbHelper.c(int, int, int, java.lang.Object[]):void");
    }

    public static void l() {
        f67780r0 = 1742637574;
        f67781s0 = -2133690332;
    }

    public synchronized void closeDataBase() throws SQLException {
        try {
            SQLiteDatabase sQLiteDatabase = this.f67784p0;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            super.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void createDataBase() throws IOException, SQLException {
        try {
            if (new File(DATABASE_PATH).exists()) {
                openDataBase();
                SQLiteDatabase sQLiteDatabase = this.f67784p0;
                onUpgrade(sQLiteDatabase, sQLiteDatabase.getVersion(), 1);
                return;
            }
        } catch (SQLiteException e5) {
            Objects.requireNonNull(e5.getMessage());
        }
        getReadableDatabase();
        try {
            close();
            e();
        } catch (IOException unused) {
            throw new Error("Error copying database");
        }
    }

    public final void e() throws Throwable {
        try {
            AssetManager assets = this.f67785q0.getAssets();
            byte[] bArr = setInjectedTransactionParameters;
            Object[] objArr = new Object[1];
            c(bArr[33], (byte) (-bArr[48]), bArr[13], objArr);
            String str = (String) objArr[0];
            int i10 = f67782t0 + 13;
            f67783u0 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr2 = {str};
                Object[] objArr3 = new Object[1];
                c(bArr[7], bArr[13], bArr[33], objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b10 = bArr[13];
                Object[] objArr4 = new Object[1];
                c(b10, (byte) (b10 | 48), bArr[7], objArr4);
                InputStream inputStream = (InputStream) cls.getMethod((String) objArr4[0], String.class).invoke(assets, objArr2);
                inputStream.skip(5L);
                BuildConfig buildConfig = new BuildConfig(new setInjectedTransactionParameters(inputStream, (-1360577108) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), f67780r0, (short) (3 - TextUtils.lastIndexOf("", '0', 0)), f67781s0, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1440899434));
                OutputStream outputStreamNewOutputStream = Files.newOutputStream(Paths.get(DATABASE_PATH, new String[0]), new OpenOption[0]);
                try {
                    byte[] bArr2 = new byte[GoogleTapAndPay.REQUEST_CREATE_WALLET];
                    while (true) {
                        int i12 = buildConfig.read(bArr2);
                        if (i12 <= 0) {
                            outputStreamNewOutputStream.flush();
                            outputStreamNewOutputStream.close();
                            int i13 = f67783u0 + 27;
                            f67782t0 = i13 % 128;
                            int i14 = i13 % 2;
                            buildConfig.close();
                            return;
                        }
                        outputStreamNewOutputStream.write(bArr2, 0, i12);
                        int i15 = f67783u0 + 45;
                        f67782t0 = i15 % 128;
                        int i16 = i15 % 2;
                        e.getMessage();
                    }
                } catch (Throwable th2) {
                    if (outputStreamNewOutputStream != null) {
                        try {
                            outputStreamNewOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                Throwable cause = th4.getCause();
                if (cause == null) {
                    throw th4;
                }
                throw cause;
            }
        } catch (IOException e5) {
            e5.getMessage();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            closeDataBase();
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public void openDataBase() throws SQLException {
        this.f67784p0 = SQLiteDatabase.openDatabase(DATABASE_PATH, null, 0);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }
}

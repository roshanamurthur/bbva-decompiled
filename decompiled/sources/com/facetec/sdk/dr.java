package com.facetec.sdk;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.noknok.android.client.asm.authenticator.KSUtils;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class dr {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static /* synthetic */ boolean f41338l = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NfcAdapter f41339a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IsoDep f41341c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference<Activity> f41343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f41344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f41345g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f41347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f41348j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Exception f41340b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private dt f41342d = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f41346h = "";

    public interface a {
        void c();

        void d(dt dtVar, String str);
    }

    public static class c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f41349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long f41350d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static byte[] f41351f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f41352g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f41353h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f41354i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static short[] f41355j;
        private static int m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f41357b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f41358e;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            f41352g = 0;
            m = 1;
            f41350d = -4582019530300211402L;
            f41349c = 850983589;
            f41353h = 315160257;
            f41354i = -291234705;
            f41351f = new byte[]{-116, -124, 116, -116, 110, 20, 89, 44, 28, -21, -28, 27, -27, 19, -14, 16, -28, -42, 44, 28, MessageUtils.MESSAGE_30_RS, -27, -48, 90, -22, MessageUtils.MESSAGE_26_SUB, -104, -37, 33, Constants.CVR_B1b41_1110_ONLINE_PIN, -18, -41, -56, 118, -56, MessageUtils.MESSAGE_30_RS, -63, -52, 99, -123, -87, -123, -128, 93, 11, 24, 11, 23, 101, 100, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -107, 110, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -104, 123, -28, -25, 114, -113, 0, 117, 84, 70, 66, UtilitiesSDKConstants.SRP_LABEL_ENC, 58, 76, 124, 78, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 41, 13, -39, -27, 92, -39, 44, 16, -39, 45, MessageUtils.MESSAGE_21_NAK, 33, MessageUtils.MESSAGE_30_RS, 39, -56, -89, -47, -52, -27, -4, -100, -61, -26, -118, 45, -108, -107, -38, -119, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -119, -113, -119, -40, -18, -41, -7, -41, -24, ByteSourceJsonBootstrapper.UTF8_BOM_1, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -21, -38, -21, -15, -21, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, Constants.CVR_B1b41_1110_ONLINE_PIN, -95, Constants.CVR_B1b41_1110_ONLINE_PIN, 10, 16, 91, Base64.padSymbol, 46, 120, 42, 40, 45, -43, MessageUtils.MESSAGE_30_RS, MessageUtils.MESSAGE_30_RS, -85, 90, 29, -35, 19, 44, 62, 0, 44, -21, 86, 32, 6, 60, 24, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 22, 32, 3, -76, -108, -26, 79, -104, 72, 67, 67, -10, -25, -36, -112, -110, -82, -33, -107, -20, -100, -25, -109, 81, ByteSourceJsonBootstrapper.UTF8_BOM_1, 122, -20, -30, 117, -30, -69, 56, -20, -24, -10, 126, -24, 127, 41, 49, -18, -72, 49, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -21, 41, 15, 68, 114, 16, 68, -71, 60, 11, 70, 19, -71, 49, 9, 0, 67, -124, 28, 12, 120, -47, 24, -56, 99, Constants.CVR_B2b65_CLEAR_BITS, -115, -24, -22, -58, 41, -1, 4, -12, 1, -19, -85, -96, -94, -54, 99, -103, -81, -44, -92, -47, -91, 99, 25, 103, 10, -83, 34, 108, 53, 101, 58, 102, 88, -69, 114, KSUtils.PLAIN_BUFFER, 127, ComputeCcCommandApdu.EXPECTED_P1, -116, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 115, -100, 102, 24, Constants.CVR_B1b85_0101_MOBILE_APP, 109, 115, 88, -86, 29, 122, 72, GenerateAcResponseApdu.DDA_HEADER, UtilitiesSDKConstants.SRP_LABEL_MAC, 78, 2, 0, 124, 76, 20, -69, -75, 12, 122, 75, -86, 28, -70, 114, -108, -51, 124, 16, -56, 46, 98, Constants.CVR_B1b85_0110_TERMINAL, 28, 47, 25, -34, 110, -41, 99, -91, -46, 39, -111, 54, -97, -101, -108, 35, ByteSourceJsonBootstrapper.UTF8_BOM_1, -35, -111, -97, -21, -38, -108, 45, -99, 34, -98, Constants.CVR_B1b85_0101_MOBILE_APP, -40, 115, -34, 115, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 27, 46, -33, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 39, -75, 45, 37, -38, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -74, -27, -5, 35, -110, -22, 85, 92, 75, 92, Constants.CVR_B1b85_0101_MOBILE_APP, -108, -5, -87, -79, -51, -6, 118, 56, -96, UtilitiesSDKConstants.SRP_LABEL_ENC, -124, -77, -36, 35, -86, -124, -106, -9, -39, -83, 37, -98, -19, -53, -123, 39, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90, -90};
        }

        /* JADX WARN: Code duplicated, block: B:152:0x1886 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:153:0x1888  */
        /* JADX WARN: Code duplicated, block: B:155:0x1894 A[Catch: all -> 0x0542, TRY_ENTER, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:157:0x18af  */
        /* JADX WARN: Code duplicated, block: B:158:0x18b0 A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:163:0x19ae  */
        /* JADX WARN: Code duplicated, block: B:166:0x19ca  */
        /* JADX WARN: Code duplicated, block: B:167:0x19cb A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:171:0x1abc  */
        /* JADX WARN: Code duplicated, block: B:174:0x1ac2  */
        /* JADX WARN: Code duplicated, block: B:177:0x1b2e  */
        /* JADX WARN: Code duplicated, block: B:178:0x1b2f A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:182:0x1c0b  */
        /* JADX WARN: Code duplicated, block: B:183:0x1c0d  */
        /* JADX WARN: Code duplicated, block: B:187:0x1c28  */
        /* JADX WARN: Code duplicated, block: B:321:0x28c8  */
        /* JADX WARN: Code duplicated, block: B:323:0x28ec  */
        /* JADX WARN: Code duplicated, block: B:326:0x291a  */
        /* JADX WARN: Code duplicated, block: B:327:0x291b A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:330:0x2965  */
        /* JADX WARN: Code duplicated, block: B:332:0x29cc  */
        /* JADX WARN: Code duplicated, block: B:334:0x29d8  */
        /* JADX WARN: Code duplicated, block: B:337:0x29e2 A[LOOP:2: B:331:0x29ca->B:337:0x29e2, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:343:0x2c9d  */
        /* JADX WARN: Code duplicated, block: B:346:0x2d04  */
        /* JADX WARN: Code duplicated, block: B:347:0x2d05 A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:352:0x2dfa A[LOOP:3: B:341:0x2c99->B:352:0x2dfa, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:353:0x2e04 A[EDGE_INSN: B:353:0x2e04->B:354:0x2e05 BREAK  A[LOOP:2: B:331:0x29ca->B:337:0x29e2]] */
        /* JADX WARN: Code duplicated, block: B:355:0x2e07  */
        /* JADX WARN: Code duplicated, block: B:357:0x2e2b  */
        /* JADX WARN: Code duplicated, block: B:363:0x2e92  */
        /* JADX WARN: Code duplicated, block: B:366:0x2eac A[Catch: all -> 0x2ebf, IOException -> 0x2ed0, TRY_ENTER, TRY_LEAVE, TryCatch #20 {IOException -> 0x2ed0, all -> 0x2ebf, blocks: (B:360:0x2e8b, B:366:0x2eac), top: B:633:0x2e8b }] */
        /* JADX WARN: Code duplicated, block: B:372:0x2eb8  */
        /* JADX WARN: Code duplicated, block: B:373:0x2ebc A[LOOP:5: B:364:0x2ea9->B:373:0x2ebc, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:387:0x2ee0  */
        /* JADX WARN: Code duplicated, block: B:389:0x2ee6 A[EDGE_INSN: B:389:0x2ee6->B:438:0x3095 BREAK  A[LOOP:6: B:393:0x2f5d->B:437:0x3091]] */
        /* JADX WARN: Code duplicated, block: B:390:0x2ee9  */
        /* JADX WARN: Code duplicated, block: B:392:0x2f5b  */
        /* JADX WARN: Code duplicated, block: B:395:0x2f60  */
        /* JADX WARN: Code duplicated, block: B:397:0x2f71  */
        /* JADX WARN: Code duplicated, block: B:400:0x2f75  */
        /* JADX WARN: Code duplicated, block: B:402:0x2f78  */
        /* JADX WARN: Code duplicated, block: B:404:0x2f7c  */
        /* JADX WARN: Code duplicated, block: B:439:0x3097  */
        /* JADX WARN: Code duplicated, block: B:441:0x30b9  */
        /* JADX WARN: Code duplicated, block: B:444:0x3102  */
        /* JADX WARN: Code duplicated, block: B:445:0x3104 A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:449:0x3204  */
        /* JADX WARN: Code duplicated, block: B:450:0x3208  */
        /* JADX WARN: Code duplicated, block: B:453:0x320f  */
        /* JADX WARN: Code duplicated, block: B:455:0x3232  */
        /* JADX WARN: Code duplicated, block: B:458:0x323f  */
        /* JADX WARN: Code duplicated, block: B:459:0x3241 A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:463:0x3303  */
        /* JADX WARN: Code duplicated, block: B:464:0x3314  */
        /* JADX WARN: Code duplicated, block: B:467:0x331b  */
        /* JADX WARN: Code duplicated, block: B:469:0x334a  */
        /* JADX WARN: Code duplicated, block: B:472:0x3361  */
        /* JADX WARN: Code duplicated, block: B:473:0x3362 A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:477:0x3432  */
        /* JADX WARN: Code duplicated, block: B:479:0x3455  */
        /* JADX WARN: Code duplicated, block: B:482:0x3463  */
        /* JADX WARN: Code duplicated, block: B:483:0x3465 A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:487:0x3552  */
        /* JADX WARN: Code duplicated, block: B:489:0x3576  */
        /* JADX WARN: Code duplicated, block: B:492:0x3583  */
        /* JADX WARN: Code duplicated, block: B:493:0x3585 A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:497:0x3665  */
        /* JADX WARN: Code duplicated, block: B:499:0x3689  */
        /* JADX WARN: Code duplicated, block: B:502:0x3697  */
        /* JADX WARN: Code duplicated, block: B:503:0x3699 A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:507:0x3796  */
        /* JADX WARN: Code duplicated, block: B:509:0x37ba  */
        /* JADX WARN: Code duplicated, block: B:512:0x3839  */
        /* JADX WARN: Code duplicated, block: B:513:0x383a A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:517:0x3933  */
        /* JADX WARN: Code duplicated, block: B:519:0x3957  */
        /* JADX WARN: Code duplicated, block: B:522:0x39b7  */
        /* JADX WARN: Code duplicated, block: B:523:0x39b8 A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:527:0x3ab1  */
        /* JADX WARN: Code duplicated, block: B:529:0x3ad5  */
        /* JADX WARN: Code duplicated, block: B:532:0x3ae2  */
        /* JADX WARN: Code duplicated, block: B:533:0x3ae4 A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:537:0x3bbe  */
        /* JADX WARN: Code duplicated, block: B:539:0x3be2  */
        /* JADX WARN: Code duplicated, block: B:542:0x3bf0  */
        /* JADX WARN: Code duplicated, block: B:543:0x3bf2 A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:547:0x3cb9  */
        /* JADX WARN: Code duplicated, block: B:549:0x3cea  */
        /* JADX WARN: Code duplicated, block: B:552:0x3cf7  */
        /* JADX WARN: Code duplicated, block: B:553:0x3cf9 A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:557:0x3dda  */
        /* JADX WARN: Code duplicated, block: B:559:0x3dfe  */
        /* JADX WARN: Code duplicated, block: B:562:0x3e0b  */
        /* JADX WARN: Code duplicated, block: B:563:0x3e0d A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:567:0x3ef4  */
        /* JADX WARN: Code duplicated, block: B:568:0x3ef7  */
        /* JADX WARN: Code duplicated, block: B:570:0x3efa  */
        /* JADX WARN: Code duplicated, block: B:573:0x3f2c  */
        /* JADX WARN: Code duplicated, block: B:574:0x3f2d A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:577:0x3f78 A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:579:0x3fa7  */
        /* JADX WARN: Code duplicated, block: B:580:0x3fa8 A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:615:0x2ec2 A[EXC_TOP_SPLITTER, PHI: r5
          0x2ec2: PHI (r5v350 java.io.BufferedInputStream) = (r5v346 java.io.BufferedInputStream), (r5v648 java.io.BufferedInputStream) binds: [B:384:0x2ed0, B:362:0x2e90] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:619:0x3080 A[EXC_TOP_SPLITTER, PHI: r9
          0x3080: PHI (r9v120 java.io.BufferedInputStream) = (r9v119 java.io.BufferedInputStream), (r9v121 java.io.BufferedInputStream) binds: [B:435:0x308e, B:413:0x304b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:642:0x29ec A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:643:0x29e5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:644:0x2e04 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:645:0x2e04 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:646:0x2df3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:647:0x2eb2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:648:? A[LOOP:4: B:633:0x2e8b->B:648:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:649:0x2ee6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:650:0x2ee6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:651:0x2ee6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:653:0x3091 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:73:0x076f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:74:0x0771  */
        /* JADX WARN: Code duplicated, block: B:77:0x078d  */
        /* JADX WARN: Code duplicated, block: B:78:0x078e A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:82:0x0879 A[PHI: r14
          0x0879: PHI (r14v40 java.util.Map) = (r14v39 java.util.Map), (r14v39 java.util.Map), (r14v39 java.util.Map), (r14v42 java.util.Map) binds: [B:81:0x0877, B:72:0x076d, B:61:0x065f, B:48:0x053f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:84:0x087f  */
        /* JADX WARN: Code duplicated, block: B:87:0x08e7  */
        /* JADX WARN: Code duplicated, block: B:88:0x08e8 A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:93:0x09c1  */
        /* JADX WARN: Code duplicated, block: B:96:0x0a29  */
        /* JADX WARN: Code duplicated, block: B:97:0x0a2a A[Catch: all -> 0x0542, TryCatch #2 {all -> 0x0542, blocks: (B:3:0x000f, B:7:0x0061, B:13:0x014d, B:17:0x0167, B:18:0x01a0, B:22:0x0223, B:26:0x027d, B:30:0x0368, B:34:0x03ba, B:36:0x03d7, B:40:0x0426, B:42:0x042f, B:46:0x048a, B:85:0x08d6, B:89:0x0930, B:107:0x1362, B:111:0x13b3, B:114:0x147f, B:118:0x14df, B:122:0x159d, B:126:0x15ee, B:128:0x160b, B:132:0x165f, B:136:0x1674, B:140:0x16d5, B:175:0x1b1b, B:179:0x1b6e, B:178:0x1b2f, B:139:0x1690, B:145:0x1772, B:149:0x17d0, B:148:0x178e, B:155:0x1894, B:159:0x18ef, B:158:0x18b0, B:164:0x19af, B:168:0x1a0f, B:167:0x19cb, B:131:0x161f, B:125:0x15af, B:117:0x1493, B:190:0x1c9e, B:194:0x1cf4, B:196:0x1dee, B:200:0x1e42, B:216:0x2005, B:220:0x2059, B:222:0x2148, B:226:0x219b, B:239:0x23eb, B:243:0x2445, B:324:0x2907, B:328:0x295a, B:344:0x2cf1, B:348:0x2d44, B:442:0x30d9, B:446:0x3154, B:456:0x3235, B:460:0x3279, B:470:0x334c, B:474:0x33a7, B:480:0x3459, B:484:0x34a2, B:490:0x3579, B:494:0x35c2, B:500:0x368d, B:504:0x36d2, B:510:0x3811, B:514:0x388a, B:520:0x39a6, B:524:0x3a00, B:530:0x3ad8, B:534:0x3b22, B:540:0x3be6, B:544:0x3c2d, B:550:0x3ced, B:554:0x3d3e, B:560:0x3e01, B:564:0x3e50, B:571:0x3f1b, B:575:0x3f70, B:574:0x3f2d, B:577:0x3f78, B:581:0x4001, B:580:0x3fa8, B:563:0x3e0d, B:553:0x3cf9, B:543:0x3bf2, B:533:0x3ae4, B:523:0x39b8, B:513:0x383a, B:503:0x3699, B:493:0x3585, B:483:0x3465, B:473:0x3362, B:459:0x3241, B:445:0x3104, B:347:0x2d05, B:327:0x291b, B:242:0x2400, B:225:0x215a, B:219:0x2017, B:199:0x1e00, B:193:0x1cb3, B:110:0x1374, B:88:0x08e8, B:94:0x0a18, B:98:0x0a64, B:97:0x0a2a, B:55:0x054a, B:59:0x05a9, B:66:0x0667, B:70:0x06c3, B:69:0x0683, B:75:0x0772, B:79:0x07d0, B:78:0x078e, B:58:0x0566, B:45:0x044c, B:39:0x03e9, B:33:0x037a, B:25:0x0237, B:6:0x0022), top: B:608:0x000f }] */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x0aba, code lost:
        
            if (r1.equals((java.lang.String) r6[0]) != false) goto L101;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x0abc, code lost:
        
            r1 = com.facetec.sdk.dr.c.f41352g + 61;
            r2 = r1 % 128;
            com.facetec.sdk.dr.c.m = r2;
            r1 = r1 % 2;
            r2 = r2 + 57;
            com.facetec.sdk.dr.c.f41352g = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0aef, code lost:
        
            return new java.lang.Object[]{new int[]{0}, new int[]{260}, new int[]{317375655}};
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x09bd, code lost:
        
            if (((r1 & r2) | (r1 ^ r2)) == 1) goto L101;
         */
        /* JADX WARN: Multi-variable search skipped. Vars limit reached: 6370 (expected less than 5000) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v497, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r1v815, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r1v827, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r2v497, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r5v326, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r6v229, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r6v485, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r7v125, types: [java.lang.Class[]] */
        /* JADX WARN: Type inference failed for: r7v188, types: [java.lang.Class[]] */
        /* JADX WARN: Type inference failed for: r7v202, types: [java.lang.Class[]] */
        /* JADX WARN: Type inference failed for: r7v328, types: [java.lang.Class[]] */
        /* JADX WARN: Type inference failed for: r7v337, types: [java.lang.Class[]] */
        /* JADX WARN: Type inference failed for: r9v124, types: [java.lang.Class[]] */
        /* JADX WARN: Type inference failed for: r9v218, types: [java.lang.Class[]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object[] e$6581038f(java.lang.Object r61) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 16548
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.dr.c.e$6581038f(java.lang.Object):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{46, -89, -2, 105};
            $$b = 143;
        }

        public static void init$1() {
            $$d = new byte[]{114, 0, 67, KSUtils.PLAIN_BUFFER};
            $$e = 69;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void k(byte r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 2
                int r0 = 1 - r6
                int r7 = 101 - r7
                int r8 = r8 * 3
                int r8 = 4 - r8
                byte[] r1 = com.facetec.sdk.dr.c.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L17
                r3 = r7
                r4 = r2
                r7 = r6
                goto L2c
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r1[r8]
                r5 = r7
                r7 = r6
                r6 = r5
            L2c:
                int r3 = -r3
                int r6 = r6 + r3
                int r8 = r8 + 1
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.dr.c.k(byte, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:45:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:46:0x01bb  */
        private static void l(String str, int i10, Object[] objArr) throws Throwable {
            char[] charArray;
            Throwable cause;
            int i11 = 2;
            if (str != null) {
                charArray = str.toCharArray();
                int i12 = $11 + 11;
                $10 = i12 % 128;
                int i13 = i12 % 2;
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            gw gwVar = new gw();
            gwVar.f41836e = i10;
            int length = cArr.length;
            long[] jArr = new long[length];
            gwVar.f41835a = 0;
            while (true) {
                int i14 = gwVar.f41835a;
                if (i14 >= cArr.length) {
                    break;
                }
                int i15 = $11 + 59;
                $10 = i15 % 128;
                int i16 = i15 % i11;
                char c10 = cArr[i14];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[i11] = gwVar;
                    objArr2[1] = gwVar;
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = bp.f40694x;
                    Object method = map.get(346539884);
                    if (method == null) {
                        method = ((Class) bp.a(24 - ExpandableListView.getPackedPositionType(0L), AndroidCharacter.getMirror('0') + 197, (char) (ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("r", Integer.TYPE, Object.class, Object.class);
                        map.put(346539884, method);
                    }
                    jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f41350d ^ (-4932774504156859221L));
                    Object[] objArr3 = {gwVar, gwVar};
                    Object method2 = map.get(593077425);
                    if (method2 == null) {
                        method2 = ((Class) bp.a(23 - TextUtils.indexOf("", "", 0), View.getDefaultSize(0, 0) + 150, (char) Color.alpha(0))).getMethod("q", Object.class, Object.class);
                        map.put(593077425, method2);
                    }
                    ((Method) method2).invoke(null, objArr3);
                    i11 = 2;
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            char[] cArr2 = new char[length];
            gwVar.f41835a = 0;
            while (true) {
                int i17 = gwVar.f41835a;
                if (i17 >= cArr.length) {
                    objArr[0] = new String(cArr2);
                    return;
                }
                int i18 = $11 + 7;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr2[i17] = (char) jArr[i17];
                    Object[] objArr4 = {gwVar, gwVar};
                    Map map2 = bp.f40694x;
                    Object method3 = map2.get(593077425);
                    if (method3 == null) {
                        method3 = ((Class) bp.a(View.MeasureSpec.getSize(0) + 23, 150 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("q", Object.class, Object.class);
                        map2.put(593077425, method3);
                    }
                    ((Method) method3).invoke(null, objArr4);
                    throw null;
                }
                cArr2[i17] = (char) jArr[i17];
                Object[] objArr5 = {gwVar, gwVar};
                Map map3 = bp.f40694x;
                Object method4 = map3.get(593077425);
                if (method4 == null) {
                    method4 = ((Class) bp.a((Process.myPid() >> 22) + 23, 198 - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getTouchSlop() >> 8))).getMethod("q", Object.class, Object.class);
                    map3.put(593077425, method4);
                }
                ((Method) method4).invoke(null, objArr5);
            }
        }

        private static void n(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
            int i13;
            boolean z10;
            gy gyVar = new gy();
            StringBuilder sb2 = new StringBuilder();
            int i14 = 2;
            try {
                int i15 = 1;
                Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(f41353h)};
                int i16 = 0;
                Map map = bp.f40694x;
                Object method = map.get(-131541546);
                if (method == null) {
                    Class cls = (Class) bp.a(24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1624 - TextUtils.getOffsetAfter("", 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                    byte b11 = (byte) ($$e & 3);
                    byte b12 = $$d[1];
                    Object[] objArr3 = new Object[1];
                    o(b11, b12, b12, objArr3);
                    String str = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str, cls2, cls2);
                    map.put(-131541546, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                int i17 = iIntValue == -1 ? 1 : 0;
                if (i17 != 0) {
                    int i18 = $11 + 7;
                    int i19 = i18 % 128;
                    $10 = i19;
                    int i20 = i18 % 2;
                    byte[] bArr = f41351f;
                    if (bArr != null) {
                        int i21 = i19 + 59;
                        $11 = i21 % 128;
                        int i22 = i21 % 2;
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i23 = 0;
                        while (i23 < length) {
                            int i24 = $10 + 89;
                            $11 = i24 % 128;
                            if (i24 % i14 == 0) {
                                Object[] objArr4 = new Object[i15];
                                objArr4[i16] = Integer.valueOf(bArr[i23]);
                                Map map2 = bp.f40694x;
                                Object method2 = map2.get(1703225588);
                                if (method2 == null) {
                                    Class cls3 = (Class) bp.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, 1167 - Drawable.resolveOpacity(i16, i16), (char) (45987 - TextUtils.indexOf((CharSequence) "", '0', i16, i16)));
                                    byte b13 = $$d[1];
                                    Object[] objArr5 = new Object[1];
                                    o((byte) i14, b13, b13, objArr5);
                                    method2 = cls3.getMethod((String) objArr5[0], Integer.TYPE);
                                    map2.put(1703225588, method2);
                                }
                                bArr2[i23] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                            } else {
                                length = length;
                                Object[] objArr6 = {Integer.valueOf(bArr[i23])};
                                Map map3 = bp.f40694x;
                                Object method3 = map3.get(1703225588);
                                if (method3 == null) {
                                    Class cls4 = (Class) bp.a(Drawable.resolveOpacity(0, 0) + 24, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1167, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 45988));
                                    byte b14 = $$d[1];
                                    Object[] objArr7 = new Object[1];
                                    o((byte) 2, b14, b14, objArr7);
                                    method3 = cls4.getMethod((String) objArr7[0], Integer.TYPE);
                                    map3.put(1703225588, method3);
                                }
                                bArr2[i23] = ((Byte) ((Method) method3).invoke(null, objArr6)).byteValue();
                                i23++;
                            }
                            length = length;
                            i14 = 2;
                            i15 = 1;
                            i16 = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = f41351f;
                        Object[] objArr8 = {Integer.valueOf(i11), Integer.valueOf(f41349c)};
                        Map map4 = bp.f40694x;
                        Object method4 = map4.get(-131541546);
                        if (method4 == null) {
                            Class cls5 = (Class) bp.a(24 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1623 - Process.getGidForName(""), (char) TextUtils.getCapsMode("", 0, 0));
                            byte b15 = (byte) ($$e & 3);
                            byte b16 = $$d[1];
                            Object[] objArr9 = new Object[1];
                            o(b15, b16, b16, objArr9);
                            String str2 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str2, cls6, cls6);
                            map4.put(-131541546, method4);
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method4).invoke(null, objArr8)).intValue()]) ^ 8685730852850169510L)) + ((int) (((long) f41353h) ^ 8685730852850169510L)));
                    } else {
                        iIntValue = (short) (((short) (((long) f41355j[i11 + ((int) (((long) f41349c) ^ 8685730852850169510L))]) ^ 8685730852850169510L)) + ((int) (((long) f41353h) ^ 8685730852850169510L)));
                    }
                }
                if (iIntValue > 0) {
                    gyVar.f41841b = ((i11 + iIntValue) - 2) + ((int) (((long) f41349c) ^ 8685730852850169510L)) + i17;
                    Object[] objArr10 = {gyVar, Integer.valueOf(i12), Integer.valueOf(f41354i), sb2};
                    Map map5 = bp.f40694x;
                    Object method5 = map5.get(-1555392445);
                    if (method5 == null) {
                        Class cls7 = (Class) bp.a(23 - (ViewConfiguration.getLongPressTimeout() >> 16), 1483 - (ViewConfiguration.getEdgeSlop() >> 16), (char) TextUtils.indexOf("", "", 0));
                        byte b17 = $$d[1];
                        byte b18 = b17;
                        Object[] objArr11 = new Object[1];
                        o(b17, b18, b18, objArr11);
                        String str3 = (String) objArr11[0];
                        Class<?> cls8 = Integer.TYPE;
                        method5 = cls7.getMethod(str3, Object.class, cls8, cls8, Object.class);
                        map5.put(-1555392445, method5);
                    }
                    ((StringBuilder) ((Method) method5).invoke(null, objArr10)).append(gyVar.f41843e);
                    gyVar.f41842d = gyVar.f41843e;
                    byte[] bArr4 = f41351f;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i25 = 0;
                        while (i25 < length2) {
                            int i26 = $10 + 13;
                            $11 = i26 % 128;
                            if (i26 % 2 == 0) {
                                bArr5[i25] = (byte) (((long) bArr4[i25]) / 8685730852850169510L);
                            } else {
                                bArr5[i25] = (byte) (((long) bArr4[i25]) ^ 8685730852850169510L);
                                i25++;
                            }
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        i13 = 1;
                        z10 = true;
                    } else {
                        i13 = 1;
                        z10 = false;
                    }
                    while (true) {
                        gyVar.f41840a = i13;
                        if (gyVar.f41840a >= iIntValue) {
                            break;
                        }
                        if (z10) {
                            byte[] bArr6 = f41351f;
                            int i27 = gyVar.f41841b;
                            gyVar.f41841b = i27 - 1;
                            gyVar.f41843e = (char) (gyVar.f41842d + (((byte) (((byte) (((long) bArr6[i27]) ^ 8685730852850169510L)) + s4)) ^ b10));
                        } else {
                            short[] sArr = f41355j;
                            int i28 = gyVar.f41841b;
                            gyVar.f41841b = i28 - 1;
                            gyVar.f41843e = (char) (gyVar.f41842d + (((short) (((short) (((long) sArr[i28]) ^ 8685730852850169510L)) + s4)) ^ b10));
                        }
                        sb2.append(gyVar.f41843e);
                        gyVar.f41842d = gyVar.f41843e;
                        i13 = gyVar.f41840a + 1;
                    }
                }
                objArr[0] = sb2.toString();
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0033). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void o(short r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 2
                int r7 = 70 - r7
                byte[] r0 = com.facetec.sdk.dr.c.$$d
                int r8 = r8 * 2
                int r8 = r8 + 4
                int r9 = r9 * 4
                int r9 = 1 - r9
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L1a
                r3 = r1
                r5 = r2
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r8
                goto L33
            L1a:
                r3 = r2
            L1b:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                r10 = r6
            L33:
                int r7 = r7 + r8
                int r8 = r9 + 1
                r9 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r5
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.dr.c.o(short, short, short, java.lang.Object[]):void");
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONObject f41359b;

        public d(JSONObject jSONObject) {
            this.f41359b = jSONObject;
        }
    }

    private dr(NfcAdapter nfcAdapter, Activity activity, boolean z10) {
        this.f41339a = nfcAdapter;
        this.f41343e = new WeakReference<>(activity);
        this.f41345g = z10;
    }

    public static boolean a(Activity activity) {
        NfcAdapter nfcAdapterCc_;
        return ContextCompat.checkSelfPermission(activity, "android.permission.NFC") == 0 && (nfcAdapterCc_ = cc_(activity)) != null && nfcAdapterCc_.isEnabled();
    }

    private static NfcAdapter cc_(Activity activity) {
        NfcManager nfcManager = (NfcManager) activity.getSystemService("nfc");
        if (nfcManager == null) {
            return null;
        }
        return nfcManager.getDefaultAdapter();
    }

    public final boolean cd_(Intent intent, final a aVar) {
        if (!"android.nfc.action.TECH_DISCOVERED".equals(intent.getAction())) {
            return false;
        }
        this.f41341c = IsoDep.get((Tag) intent.getExtras().getParcelable("android.nfc.extra.TAG"));
        new Thread(new Runnable() { // from class: com.facetec.sdk.v7
            @Override // java.lang.Runnable
            public final void run() {
                this.f42927p0.d(aVar);
            }
        }).start();
        return true;
    }

    public final void e() {
        Activity activity = this.f41343e.get();
        if (activity != null) {
            this.f41339a.disableForegroundDispatch(activity);
        }
    }

    public final native String nativeStartReading(String str, String str2, String str3, String str4, boolean z10);

    public final native String nativeStartReadingWithKey(String str, String str2, boolean z10);

    public final native void nativeUpdateErrorHistory(String str, String str2);

    public final byte[] sendCommand(byte[] bArr) {
        this.f41340b = null;
        try {
            if (!this.f41341c.isConnected()) {
                this.f41341c.connect();
            }
            return this.f41341c.transceive(bArr);
        } catch (IOException e5) {
            this.f41340b = e5;
            e5.printStackTrace();
            return null;
        }
    }

    public final void setNativeError(int i10, String str) {
        this.f41346h = str;
        if (i10 == 1) {
            this.f41342d = dt.Unknown;
            return;
        }
        if (i10 == 2) {
            this.f41342d = dt.InvalidMrzKey;
            return;
        }
        if (i10 == 3) {
            this.f41342d = dt.ResponseError;
            return;
        }
        if (i10 == 4) {
            this.f41342d = dt.UnknownRetry;
        } else if (i10 == 5) {
            this.f41342d = dt.IncompatibleDoc;
        } else {
            if (!f41338l) {
                throw new AssertionError();
            }
            this.f41342d = dt.Unknown;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(a aVar, dt dtVar) {
        aVar.d(dtVar, this.f41346h);
    }

    public static boolean c(Activity activity) {
        return ContextCompat.checkSelfPermission(activity, "android.permission.NFC") == 0 && cc_(activity) != null;
    }

    @Nullable
    public static dr d(Activity activity, boolean z10) {
        NfcAdapter nfcAdapterCc_ = cc_(activity);
        if (nfcAdapterCc_ == null) {
            return null;
        }
        return new dr(nfcAdapterCc_, activity, z10);
    }

    public final boolean d(Class<?> cls, String str) {
        Activity activity = this.f41343e.get();
        if (activity == null) {
            return false;
        }
        this.f41344f = str;
        Intent intent = new Intent(activity, cls);
        intent.addFlags(PKIFailureInfo.duplicateCertReq);
        this.f41339a.enableForegroundDispatch(activity, PendingIntent.getActivity(activity, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728), null, new String[][]{new String[]{"android.nfc.tech.IsoDep"}});
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(a aVar) {
        dt dtVar;
        String strNativeStartReading;
        Activity activity = this.f41343e.get();
        if (activity == null) {
            return;
        }
        this.f41340b = null;
        this.f41342d = null;
        this.f41346h = "";
        int i10 = 1;
        try {
            String str = this.f41344f;
            if (str != null && !str.isEmpty()) {
                strNativeStartReading = nativeStartReadingWithKey(this.f41344f, this.f41348j, this.f41345g);
            } else {
                c cVar = this.f41347i;
                strNativeStartReading = nativeStartReading(cVar.f41357b, cVar.f41356a, cVar.f41358e, this.f41348j, this.f41345g);
            }
            if (strNativeStartReading != null) {
                activity.runOnUiThread(new p5(aVar, new d(new JSONObject(strNativeStartReading)), i10));
                return;
            }
            if (this.f41340b != null) {
                dtVar = dt.ConnectionError;
            } else {
                dtVar = this.f41342d;
                if (dtVar == null) {
                    dtVar = dt.Unknown;
                }
            }
            String str2 = "Unknown";
            switch (dt.AnonymousClass3.f41367b[dtVar.ordinal()]) {
                case 2:
                    str2 = "InvalidMrzKey";
                    break;
                case 3:
                    str2 = "ResponseError";
                    break;
                case 4:
                    str2 = "ConnectionError";
                    break;
                case 5:
                    str2 = "UnknownRetry";
                    break;
                case 6:
                    str2 = "IncompatibleDoc";
                    break;
            }
            nativeUpdateErrorHistory(str2, this.f41346h);
            activity.runOnUiThread(new androidx.room.b(this, aVar, i10, dtVar));
        } catch (Throwable unused) {
            dtVar = dt.Unknown;
        }
    }
}

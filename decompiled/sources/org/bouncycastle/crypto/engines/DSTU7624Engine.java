package org.bouncycastle.crypto.engines;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.noknok.android.client.asm.authenticator.KSUtils;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import kotlin.io.encoding.Base64;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class DSTU7624Engine implements BlockCipher {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f88381h = {-88, 67, Constants.STATE_ERROR, 6, 107, 117, 108, 89, 113, -33, -121, -107, 23, Constants.CVR_B2b8765_1111_APP_DISABLED, -40, 9, 109, -13, 29, -53, -55, 77, 44, -81, 121, -32, -105, -3, Constants.FCI_TEMPLATE, 75, 69, 57, 62, -35, -93, 79, -76, -74, -102, Constants.CVR_B1b41_1110_ONLINE_PIN, 31, ByteSourceJsonBootstrapper.UTF8_BOM_3, MessageUtils.MESSAGE_21_NAK, -31, 73, -46, -109, -58, -110, 114, -98, Constants.DIRECTORY_ENTRY, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, -69, -95, -36, -14, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 55, 66, -28, 122, 50, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, 90, -106, 22, 35, 43, -62, 101, 102, 15, -68, -87, 71, 65, 52, 72, -4, -73, GenerateAcResponseApdu.DDA_HEADER, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, MessageUtils.MESSAGE_30_RS, 34, 51, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 40, 54, -57, UtilitiesSDKConstants.SRP_LABEL_MAC, 59, ComputeCcCommandApdu.EXPECTED_P1, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -70, -11, 20, -97, 8, 85, -101, 76, -2, Constants.CVR_B1b85_0110_TERMINAL, 92, -38, 24, 70, -51, 125, 33, UtilitiesSDKConstants.SRP_LABEL_ENC, 63, 27, -119, -1, -21, -124, 105, 58, -99, -41, -45, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 103, 64, -75, -34, 93, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, -96, -59, 2, -90, 116, 45, 11, -94, 118, -77, -66, -50, -67, -82, -23, -118, 49, 28, -20, -15, -103, -108, -86, -10, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 47, ByteSourceJsonBootstrapper.UTF8_BOM_1, -24, -116, 53, 3, -44, 127, -5, 5, -63, 94, -112, 32, Base64.padSymbol, -126, -9, -22, 10, 13, 126, -8, Constants.CVR_B1b85_0101_MOBILE_APP, MessageUtils.MESSAGE_26_SUB, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, 16, -48, -39, 19, 12, MessageUtils.MESSAGE_18_DC2, 41, 81, -71, Constants.CVR_B2b65_CLEAR_BITS, -42, 115, -115, KSUtils.PLAIN_BUFFER, 84, Constants.CVR_B2b87_11_RFU, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, -128};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f88382i = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, -42, UtilitiesSDKConstants.SRP_LABEL_MAC, -46, -112, 23, -8, 66, MessageUtils.MESSAGE_21_NAK, 86, -76, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, -115, 49, -10, 100, 88, -98, -12, 34, -86, 117, 15, 2, -79, -33, 109, 115, 77, 124, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 46, -9, 8, 93, 68, 62, -97, 20, -56, -82, 84, 16, -40, -68, MessageUtils.MESSAGE_26_SUB, 107, 105, -13, -67, 51, -85, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, ComputeCcCommandApdu.EXPECTED_P1, 91, -52, 60, 25, -95, KSUtils.PLAIN_BUFFER, 73, 123, -39, Constants.FCI_TEMPLATE, 55, Constants.CVR_B1b85_0110_TERMINAL, -54, -25, 43, 72, -3, -106, 69, -4, 65, MessageUtils.MESSAGE_18_DC2, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, Constants.STATE_ERROR, 42, -38, -55, 0, 126, -94, 85, ByteSourceJsonBootstrapper.UTF8_BOM_3, 17, -43, -100, Constants.CVR_B2b65_CLEAR_BITS, Constants.CVR_B1b41_1110_ONLINE_PIN, 10, Base64.padSymbol, 81, 125, -109, 27, -2, -60, 71, 9, -122, 11, -113, -99, GenerateAcResponseApdu.DDA_HEADER, 7, -71, UtilitiesSDKConstants.SRP_LABEL_ENC, -104, 24, 50, 113, 75, ByteSourceJsonBootstrapper.UTF8_BOM_1, 59, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -96, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, -128, MessageUtils.MESSAGE_30_RS, 56, -31, -72, -88, -32, 12, 35, 118, 29, 37, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -45, -123, -30, 82, -14, -126, Constants.CVR_B1b85_0101_MOBILE_APP, 122, 47, 116, 83, -77, Constants.DIRECTORY_ENTRY, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, 52, -5, -37, 89, -74, -62, 1, Constants.CVR_B2b8765_1111_APP_DISABLED, 90, -19, -89, 102, 33, 127, -118, 39, -57, Constants.CVR_B2b87_11_RFU, 41, -41};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f88383j = {-109, -39, -102, -75, -104, 34, 69, -4, -70, GenerateAcResponseApdu.DDA_HEADER, -33, 2, -97, -36, 81, 89, 74, 23, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 22, -31, 73, 60, Constants.CVR_B2b87_11_RFU, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, Constants.CVR_B1b41_1110_ONLINE_PIN, 65, 76, -34, UtilitiesSDKConstants.SRP_LABEL_MAC, -112, 37, -91, -41, 3, 17, 0, -61, 46, -110, ByteSourceJsonBootstrapper.UTF8_BOM_1, 78, MessageUtils.MESSAGE_18_DC2, -99, 125, -53, 53, 16, -43, 79, -98, 77, -87, 85, -58, -48, 123, 24, -105, -45, 54, -26, 72, 86, KSUtils.PLAIN_BUFFER, -113, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -52, -100, -71, -30, -84, -72, 47, MessageUtils.MESSAGE_21_NAK, -92, 124, -38, 56, MessageUtils.MESSAGE_30_RS, 11, 5, -42, 20, 110, 108, 126, 102, -3, -79, -27, Constants.CVR_B1b85_0110_TERMINAL, -81, 94, 51, -121, -55, Constants.CVR_B2b8765_1111_APP_DISABLED, 93, 109, 63, -120, -115, -57, -9, 29, -23, -20, -19, -128, 41, 39, Constants.CVR_B2b65_CLEAR_BITS, -103, -88, Constants.CVR_B1b85_0101_MOBILE_APP, 15, 55, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 40, 48, -107, -46, 62, 91, 64, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, -77, 105, 87, 31, 7, 28, -118, -68, 32, -21, -50, ComputeCcCommandApdu.EXPECTED_P1, -85, -18, 49, -94, 115, -7, -54, 58, MessageUtils.MESSAGE_26_SUB, -5, 13, -63, -2, -6, -14, Constants.FCI_TEMPLATE, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, 25, -119, 50, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, UtilitiesSDKConstants.SRP_LABEL_ENC, -22, 75, 100, -124, -126, 107, -11, 121, ByteSourceJsonBootstrapper.UTF8_BOM_3, 1, Constants.STATE_ERROR, 117, 99, 27, 35, Base64.padSymbol, 104, 42, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, 127, -59, -89, -25, Constants.DIRECTORY_ENTRY, 90, 6, 70, 68, 66, 4, -96, -37, 57, -122, 84, -86, -116, 52, 33, -117, -8, 12, 116, 103};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f88384k = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -77, 84, MessageUtils.MESSAGE_30_RS, 25, 31, 34, 3, 70, Base64.padSymbol, 45, 74, 83, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 19, -118, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, 22, 60, 102, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, MessageUtils.MESSAGE_26_SUB, 58, -46, -31, -33, -75, 56, 110, Constants.CVR_B1b41_1110_ONLINE_PIN, -27, -12, -7, -122, -23, 79, -42, -123, 35, Constants.CVR_B2b65_CLEAR_BITS, 50, -103, 49, 20, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, 24, -60, 44, 113, 114, 68, MessageUtils.MESSAGE_21_NAK, -3, 55, -66, Constants.STATE_ERROR, -86, -101, -120, -40, -85, -119, -100, -6, Constants.CVR_B1b85_0110_TERMINAL, -22, -68, 98, 12, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, 52, 126, 16, -15, 123, -113, 99, -96, 5, -102, 67, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 33, ByteSourceJsonBootstrapper.UTF8_BOM_3, 39, 9, -61, -97, -74, -41, 41, -62, -21, Constants.CVR_B2b87_11_RFU, -92, -117, -116, 29, -5, -1, -63, UtilitiesSDKConstants.SRP_LABEL_MAC, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, -28, -39, -71, -48, 66, -57, 108, -112, 0, ComputeCcCommandApdu.EXPECTED_P1, Constants.FCI_TEMPLATE, Constants.CVR_B1b85_0101_MOBILE_APP, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, 15, 10, 6, -26, 43, -106, -93, 28, -81, GenerateAcResponseApdu.DDA_HEADER, MessageUtils.MESSAGE_18_DC2, -124, 57, -25, UtilitiesSDKConstants.SRP_LABEL_ENC, -126, -9, -2, -99, -121, 92, KSUtils.PLAIN_BUFFER, 53, -34, -76, -91, -4, -128, ByteSourceJsonBootstrapper.UTF8_BOM_1, -53, -69, 107, 118, -70, 90, 125, 120, 11, -107, -29, -83, 116, -104, 59, 54, 100, 109, -36, Constants.CVR_B2b8765_1111_APP_DISABLED, 89, -87, 76, 23, 127, -111, -72, -55, 87, 27, -32, Constants.DIRECTORY_ENTRY};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f88385l = {-92, -94, -87, -59, 78, -55, 3, -39, 126, 15, -46, -83, -25, -45, 39, 91, -29, -95, -24, -26, 124, 42, 85, 12, -122, 57, -41, -115, -72, MessageUtils.MESSAGE_18_DC2, Constants.FCI_TEMPLATE, 40, -51, -118, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 86, 114, -7, ByteSourceJsonBootstrapper.UTF8_BOM_3, 79, 115, -23, -9, 87, 22, -84, Constants.CVR_B1b85_0101_MOBILE_APP, Constants.CVR_B2b87_11_RFU, -99, -73, 71, 113, Constants.CVR_B1b85_0110_TERMINAL, -60, 116, 67, 108, 31, -109, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -36, -50, 32, -116, -103, Constants.STATE_ERROR, 68, 1, -11, MessageUtils.MESSAGE_30_RS, -121, 94, Constants.DIRECTORY_ENTRY, 44, 75, 29, KSUtils.PLAIN_BUFFER, MessageUtils.MESSAGE_21_NAK, -12, 35, -42, -22, -31, 103, -15, 127, -2, -38, 60, 7, 83, GenerateAcResponseApdu.DDA_HEADER, -124, -100, -53, 2, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 51, -35, 53, -30, 89, 90, -104, -91, -110, 100, 4, 6, 16, 77, 28, -105, 8, 49, -18, -85, 5, -81, 121, -96, 24, 70, 109, -4, -119, -44, -57, -1, Constants.CVR_B2b8765_1111_APP_DISABLED, Constants.CVR_B2b65_CLEAR_BITS, 66, -111, -8, 104, 10, 101, ComputeCcCommandApdu.EXPECTED_P1, -74, -3, -61, ByteSourceJsonBootstrapper.UTF8_BOM_1, 120, 76, -52, -98, 48, 46, -68, 11, 84, MessageUtils.MESSAGE_26_SUB, -90, -69, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -128, 72, -108, 50, 125, -89, 63, -82, 34, Base64.padSymbol, 102, -86, -10, 0, 93, -67, 74, -32, 59, -76, 23, -117, -97, 118, UtilitiesSDKConstants.SRP_LABEL_ENC, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -102, 37, 99, -37, -21, 122, 62, 92, -77, -79, 41, -14, -54, 88, 110, -40, -88, 47, 117, -33, 20, -5, 19, 73, -120, UtilitiesSDKConstants.SRP_LABEL_MAC, -20, -28, 52, 45, -106, -58, 58, -19, -107, Constants.CVR_B1b41_1110_ONLINE_PIN, -27, -123, 107, 64, 33, -101, 9, 25, 43, 82, -34, 69, -93, -6, 81, -62, -75, -47, -112, -71, -13, 55, -63, 13, -70, 65, 17, 56, 123, -66, -48, -43, 105, 54, -56, 98, 27, -126, -113};
    public static final byte[] m = {GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, -14, 42, -21, -23, ByteSourceJsonBootstrapper.UTF8_BOM_3, 123, -100, 52, -106, -115, -104, -71, 105, -116, 41, Base64.padSymbol, -120, 104, 6, 57, 17, 76, Constants.CVR_B1b41_1110_ONLINE_PIN, -96, 86, 64, -110, MessageUtils.MESSAGE_21_NAK, -68, -77, -36, Constants.FCI_TEMPLATE, -8, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -70, -66, -67, 49, -5, -61, -2, -128, Constants.DIRECTORY_ENTRY, -31, 122, 50, -46, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 32, -95, 69, -20, -39, MessageUtils.MESSAGE_26_SUB, 93, -76, -40, 9, -91, 85, ComputeCcCommandApdu.EXPECTED_P1, 55, 118, -87, 103, 16, 23, 54, 101, -79, -107, 98, 89, 116, -93, Constants.CVR_B1b85_0101_MOBILE_APP, 47, 75, -56, -48, -113, -51, -44, 60, -122, MessageUtils.MESSAGE_18_DC2, 29, 35, ByteSourceJsonBootstrapper.UTF8_BOM_1, -12, 83, 25, 53, -26, 127, 94, -42, 121, 81, 34, 20, -9, MessageUtils.MESSAGE_30_RS, 74, 66, -101, 65, 115, 45, -63, 92, -90, -94, -32, 46, -45, 40, -69, -55, -82, GenerateAcResponseApdu.DDA_HEADER, -47, 90, 48, -112, -124, -7, UtilitiesSDKConstants.SRP_LABEL_MAC, 88, Constants.CVR_B2b65_CLEAR_BITS, 126, -59, -53, -105, -28, 22, 108, -6, UtilitiesSDKConstants.SRP_LABEL_ENC, 109, 31, 82, -103, 13, 78, 3, -111, -62, 77, 100, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -97, -35, -60, 73, -118, -102, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 56, -89, 87, -123, -57, 124, 125, -25, -10, -73, -84, 39, 70, -34, -33, 59, -41, -98, 43, 11, -43, 19, 117, Constants.CVR_B2b8765_1111_APP_DISABLED, 114, -74, -99, 27, 1, 63, 68, -27, -121, -3, 7, -15, -85, -108, 24, -22, -4, 58, -126, Constants.STATE_ERROR, 5, 84, -37, 0, -117, -29, 72, 12, -54, 120, -119, 10, -1, 62, 91, KSUtils.PLAIN_BUFFER, -18, 113, -30, -38, 44, -72, -75, -52, 110, -88, 107, -83, Constants.CVR_B1b85_0110_TERMINAL, -58, 8, 4, 2, -24, -11, 79, -92, -13, Constants.CVR_B2b87_11_RFU, -50, 67, 37, 28, 33, 51, 15, -81, 71, -19, 102, 99, -109, -86};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f88386n = {69, -44, 11, 67, -15, 114, -19, -92, -62, 56, -26, 113, -3, -74, 58, -107, Constants.CVR_B1b85_0101_MOBILE_APP, 68, 75, -30, 116, 107, MessageUtils.MESSAGE_30_RS, 17, 90, -58, -76, -40, -91, -118, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -93, -88, -6, 5, -39, -105, 64, -55, -112, -104, -113, -36, MessageUtils.MESSAGE_18_DC2, 49, 44, 71, GenerateAcResponseApdu.DDA_HEADER, -103, -82, -56, 127, -7, 79, 93, -106, Constants.FCI_TEMPLATE, -12, -77, 57, 33, -38, -100, -123, -98, 59, Constants.CVR_B2b8765_1111_APP_DISABLED, ByteSourceJsonBootstrapper.UTF8_BOM_3, ByteSourceJsonBootstrapper.UTF8_BOM_1, 6, -18, -27, Constants.STATE_ERROR, 32, 16, -52, 60, 84, 74, 82, -108, Constants.CVR_B1b41_1110_ONLINE_PIN, Constants.CVR_B2b87_11_RFU, 40, -10, 86, Constants.CVR_B1b85_0110_TERMINAL, -94, -29, 15, -20, -99, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 126, -43, 124, -21, 24, -41, -51, -35, 120, -1, -37, -95, 9, -48, 118, -124, 117, -69, 29, MessageUtils.MESSAGE_26_SUB, 47, UtilitiesSDKConstants.SRP_LABEL_ENC, -2, -42, 52, 99, 53, -46, 42, 89, 109, 77, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -25, ComputeCcCommandApdu.EXPECTED_P1, Constants.DIRECTORY_ENTRY, Constants.CVR_B2b65_CLEAR_BITS, -97, -50, 39, -11, -128, -122, -57, -90, -5, -8, -121, -85, 98, 63, -33, 72, 0, 20, -102, -67, 91, 4, -110, 2, 37, 101, 76, 83, 12, -14, 41, -81, 23, 108, 65, 48, -23, -109, 85, -9, -84, 104, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -60, 125, -54, 122, 62, -96, 55, 3, -63, 54, 105, 102, 8, 22, -89, -68, -59, -45, 34, -73, 19, 70, 50, -24, 87, -120, 43, KSUtils.PLAIN_BUFFER, UtilitiesSDKConstants.SRP_LABEL_MAC, 78, 100, 28, -86, -111, 88, 46, -101, 92, 27, 81, 115, 66, 35, 1, 110, -13, 13, -66, Base64.padSymbol, 10, 45, 31, 103, 51, 25, 123, 94, -22, -34, -117, -53, -87, -116, -115, -83, 73, -126, -28, -70, -61, MessageUtils.MESSAGE_21_NAK, -47, -32, -119, -4, -79, -71, -75, 7, 121, -72, -31};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f88387o = {UtilitiesSDKConstants.SRP_LABEL_MAC, -74, 35, 17, -89, -120, -59, -90, 57, -113, -60, -24, 115, 34, 67, -61, -126, 39, -51, 24, 81, 98, 45, -9, 92, Constants.CVR_B1b41_1110_ONLINE_PIN, 59, -3, -54, -101, 13, 15, 121, -116, 16, 76, 116, 28, 10, ComputeCcCommandApdu.EXPECTED_P1, 124, -108, 7, -57, 94, 20, -95, 33, 87, Constants.CVR_B1b85_0101_MOBILE_APP, 78, -87, -128, -39, ByteSourceJsonBootstrapper.UTF8_BOM_1, 100, 65, Constants.CVR_B2b65_CLEAR_BITS, 60, -18, 46, 19, 41, -70, 52, 90, -82, -118, Constants.DIRECTORY_ENTRY, 51, MessageUtils.MESSAGE_18_DC2, -71, 85, -88, MessageUtils.MESSAGE_21_NAK, 5, -10, 3, 6, 73, -75, 37, 9, 22, 12, 42, 56, -4, 32, -12, -27, 127, -41, 49, 43, 102, Constants.FCI_TEMPLATE, -1, 114, -122, Constants.CVR_B2b8765_1111_APP_DISABLED, -93, 47, 120, 0, -68, -52, -30, UtilitiesSDKConstants.SRP_LABEL_ENC, -15, 66, -76, 48, Constants.STATE_ERROR, Constants.CVR_B1b85_0110_TERMINAL, 4, -20, -91, -29, -117, -25, 29, ByteSourceJsonBootstrapper.UTF8_BOM_3, -124, 123, -26, KSUtils.PLAIN_BUFFER, -8, -34, -40, -46, 23, -50, 75, 71, -42, 105, 108, 25, -103, -102, 1, -77, -123, -79, -7, 89, -62, 55, -23, -56, -96, -19, 79, -119, 104, 109, -43, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -111, -121, 88, -67, -55, -104, -36, 117, Constants.CVR_B2b87_11_RFU, 118, -11, 103, 107, 126, -21, 82, -53, -47, 91, -97, 11, -37, 64, -110, MessageUtils.MESSAGE_26_SUB, -6, -84, -28, -31, 113, 31, 101, -115, -105, -98, -107, -112, 93, -73, -63, -81, 84, -5, 2, -32, 53, -69, 58, 77, -83, 44, Base64.padSymbol, 86, 8, 27, 74, -109, GenerateAcResponseApdu.DDA_HEADER, -85, -72, 122, -14, 125, -38, 63, -2, 62, -66, -22, -86, 68, -58, -48, 54, 72, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -106, Constants.RESP_MSG_TEMPLATE_FORMAT_2, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 83, -33, -13, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 40, 50, 69, MessageUtils.MESSAGE_30_RS, -92, -45, -94, 70, 110, -100, -35, 99, -44, -99};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f88388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f88389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[][] f88390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f88391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f88394g;

    public DSTU7624Engine(int i10) throws IllegalArgumentException {
        if (i10 != 128 && i10 != 256 && i10 != 512) {
            throw new IllegalArgumentException("unsupported block length: only 128/256/512 are allowed");
        }
        int i11 = i10 >>> 6;
        this.f88391d = i11;
        this.f88388a = new long[i11];
    }

    public static long a(long j10) {
        long jD = d(j10);
        long jE = e(8, j10) ^ j10;
        long jE2 = (jE ^ e(16, jE)) ^ e(48, j10);
        long j11 = (j10 ^ jE2) ^ jD;
        return ((e(32, (((j11 & 4629771061636907072L) >>> 6) * 29) ^ (((4557430888798830399L & j11) << 2) ^ ((((-9187201950435737472L) & j11) >>> 6) * 29))) ^ jE2) ^ e(40, jD)) ^ e(48, jD);
    }

    public static long b(long j10) {
        long jE = e(8, j10) ^ j10;
        long jE2 = (jE ^ e(32, jE)) ^ e(48, j10);
        long j11 = jE2 ^ j10;
        long jE3 = e(48, j10);
        long jE4 = e(56, j10);
        long jD = d(j11 ^ jE4) ^ e(56, j11);
        long jD2 = d(e(40, d(jD) ^ j10) ^ (e(16, j11) ^ j10)) ^ (j11 ^ jE3);
        return d(e(40, ((j10 ^ e(32, j11)) ^ jE4) ^ d(((jE3 ^ (e(24, j10) ^ j11)) ^ jE4) ^ d(d(jD2) ^ e(16, jE2))))) ^ jE2;
    }

    public static long d(long j10) {
        return (((j10 & (-9187201950435737472L)) >>> 7) * 29) ^ ((9187201950435737471L & j10) << 1);
    }

    public static long e(int i10, long j10) {
        return (j10 << (-i10)) | (j10 >>> i10);
    }

    public final void c() {
        for (int i10 = 0; i10 < this.f88391d; i10++) {
            long[] jArr = this.f88388a;
            jArr[i10] = a(jArr[i10]);
        }
    }

    public final void f() {
        int i10 = this.f88391d;
        if (i10 == 2) {
            long[] jArr = this.f88388a;
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = (-4294967296L) & (j10 ^ j11);
            jArr[0] = j10 ^ j12;
            jArr[1] = j12 ^ j11;
            return;
        }
        if (i10 == 4) {
            long[] jArr2 = this.f88388a;
            long j13 = jArr2[0];
            long j14 = jArr2[1];
            long j15 = jArr2[2];
            long j16 = jArr2[3];
            long j17 = (j13 ^ j15) & (-4294967296L);
            long j18 = j13 ^ j17;
            long j19 = j15 ^ j17;
            long j20 = (j14 ^ j16) & 281474976645120L;
            long j21 = j14 ^ j20;
            long j22 = j16 ^ j20;
            long j23 = (j18 ^ j21) & (-281470681808896L);
            long j24 = (j19 ^ j22) & (-281470681808896L);
            jArr2[0] = j18 ^ j23;
            jArr2[1] = j21 ^ j23;
            jArr2[2] = j19 ^ j24;
            jArr2[3] = j22 ^ j24;
            return;
        }
        if (i10 != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        }
        long[] jArr3 = this.f88388a;
        long j25 = jArr3[0];
        long j26 = jArr3[1];
        long j27 = jArr3[2];
        long j28 = jArr3[3];
        long j29 = jArr3[4];
        long j30 = jArr3[5];
        long j31 = jArr3[6];
        long j32 = jArr3[7];
        long j33 = (j25 ^ j29) & (-4294967296L);
        long j34 = j25 ^ j33;
        long j35 = j29 ^ j33;
        long j36 = (j26 ^ j30) & 72057594021150720L;
        long j37 = j26 ^ j36;
        long j38 = j30 ^ j36;
        long j39 = (j27 ^ j31) & 281474976645120L;
        long j40 = j27 ^ j39;
        long j41 = j31 ^ j39;
        long j42 = (j28 ^ j32) & 1099511627520L;
        long j43 = j28 ^ j42;
        long j44 = j32 ^ j42;
        long j45 = (j34 ^ j40) & (-281470681808896L);
        long j46 = j34 ^ j45;
        long j47 = j40 ^ j45;
        long j48 = (j37 ^ j43) & 72056494543077120L;
        long j49 = j37 ^ j48;
        long j50 = j43 ^ j48;
        long j51 = (j35 ^ j41) & (-281470681808896L);
        long j52 = j35 ^ j51;
        long j53 = j41 ^ j51;
        long j54 = (j38 ^ j44) & 72056494543077120L;
        long j55 = j38 ^ j54;
        long j56 = j44 ^ j54;
        long j57 = (j46 ^ j49) & (-71777214294589696L);
        long j58 = j46 ^ j57;
        long j59 = j49 ^ j57;
        long j60 = (j47 ^ j50) & (-71777214294589696L);
        long j61 = j47 ^ j60;
        long j62 = j50 ^ j60;
        long j63 = (j52 ^ j55) & (-71777214294589696L);
        long j64 = j52 ^ j63;
        long j65 = j55 ^ j63;
        long j66 = (j53 ^ j56) & (-71777214294589696L);
        jArr3[0] = j58;
        jArr3[1] = j59;
        jArr3[2] = j61;
        jArr3[3] = j62;
        jArr3[4] = j64;
        jArr3[5] = j65;
        jArr3[6] = j53 ^ j66;
        jArr3[7] = j56 ^ j66;
    }

    public final void g() {
        for (int i10 = 0; i10 < this.f88391d; i10++) {
            long[] jArr = this.f88388a;
            long j10 = jArr[i10];
            int i11 = (int) j10;
            int i12 = (int) (j10 >>> 32);
            byte[] bArr = f88381h;
            byte b10 = bArr[i11 & 255];
            byte[] bArr2 = f88382i;
            byte b11 = bArr2[(i11 >>> 8) & 255];
            byte[] bArr3 = f88383j;
            byte b12 = bArr3[(i11 >>> 16) & 255];
            byte[] bArr4 = f88384k;
            int i13 = (bArr4[i11 >>> 24] << 24) | (b10 & 255) | ((b11 & 255) << 8) | ((b12 & 255) << 16);
            byte b13 = bArr[i12 & 255];
            byte b14 = bArr2[(i12 >>> 8) & 255];
            byte b15 = bArr3[(i12 >>> 16) & 255];
            jArr[i10] = (((long) i13) & 4294967295L) | (((long) ((bArr4[i12 >>> 24] << 24) | (((b13 & 255) | ((b14 & 255) << 8)) | ((b15 & 255) << 16)))) << 32);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DSTU7624";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f88391d << 3;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0069 A[EDGE_INSN: B:103:0x0069->B:30:0x0069 BREAK  A[LOOP:0: B:27:0x005d->B:29:0x0062], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x00a9 A[EDGE_INSN: B:104:0x00a9->B:40:0x00a9 BREAK  A[LOOP:1: B:37:0x009a->B:39:0x009f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00c2 A[EDGE_INSN: B:105:0x00c2->B:44:0x00c2 BREAK  A[LOOP:2: B:41:0x00b3->B:43:0x00b8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x00db A[EDGE_INSN: B:106:0x00db->B:48:0x00db BREAK  A[LOOP:3: B:45:0x00cc->B:47:0x00d1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x01b8 A[EDGE_INSN: B:107:0x01b8->B:80:0x01b8 BREAK  A[LOOP:4: B:49:0x00fa->B:98:0x027f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01b8 A[EDGE_INSN: B:108:0x01b8->B:80:0x01b8 BREAK  A[LOOP:4: B:49:0x00fa->B:98:0x027f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0062 A[LOOP:0: B:27:0x005d->B:29:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x009f A[LOOP:1: B:37:0x009a->B:39:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8 A[LOOP:2: B:41:0x00b3->B:43:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1 A[LOOP:3: B:45:0x00cc->B:47:0x00d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00fd A[LOOP:5: B:50:0x00fb->B:51:0x00fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0108 A[LOOP:6: B:53:0x0106->B:54:0x0108, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0121 A[LOOP:7: B:56:0x011f->B:57:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x013a A[LOOP:8: B:59:0x0138->B:60:0x013a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0155  */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x015f A[LOOP:9: B:67:0x015d->B:68:0x015f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x016a A[LOOP:10: B:70:0x0168->B:71:0x016a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:11: B:73:0x0183->B:74:0x0185, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x019e A[LOOP:12: B:76:0x019c->B:77:0x019e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:91:0x022e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0256  */
    /* JADX WARN: Code duplicated, block: B:97:0x0276 A[LOOP:14: B:96:0x0274->B:97:0x0276, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0285  */
    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        int i10;
        int i11;
        long[][] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long[] jArr5;
        long[] jArr6;
        int i12;
        int i13;
        long[] jArr7;
        int i14;
        long[] jArr8;
        int i15;
        long[] jArr9;
        int i16;
        long[] jArr10;
        long[] jArr11;
        long j10;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        long[] jArr12;
        long[] jArr13;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Invalid parameter passed to DSTU7624Engine init");
        }
        this.f88394g = z10;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int length = key.length << 3;
        int i28 = this.f88391d;
        int i29 = i28 << 6;
        if (length != 128 && length != 256 && length != 512) {
            throw new IllegalArgumentException("unsupported key length: only 128/256/512 are allowed");
        }
        if (length != i29 && length != i29 * 2) {
            throw new IllegalArgumentException("Unsupported key length");
        }
        if (length == 128) {
            i10 = 10;
        } else {
            if (length != 256) {
                if (length == 512) {
                    i10 = 18;
                }
                this.f88392e = length >>> 6;
                this.f88390c = new long[this.f88393f + 1][];
                i11 = 0;
                while (true) {
                    jArr = this.f88390c;
                    if (i11 < jArr.length) {
                        break;
                    }
                    jArr[i11] = new long[i28];
                    i11++;
                }
                jArr2 = new long[this.f88392e];
                this.f88389b = jArr2;
                if (key.length == (length >>> 3)) {
                    throw new IllegalArgumentException("Invalid key parameter passed to DSTU7624Engine init");
                }
                Pack.littleEndianToLong(key, 0, jArr2);
                jArr3 = new long[i28];
                jArr4 = this.f88389b;
                jArr5 = new long[i28];
                jArr6 = new long[i28];
                long[] jArr14 = new long[i28];
                this.f88388a = jArr14;
                long j11 = jArr14[0];
                i12 = this.f88392e;
                jArr14[0] = j11 + ((long) (i28 + i12 + 1));
                System.arraycopy(jArr4, 0, jArr5, 0, i28);
                if (i28 == i12) {
                    System.arraycopy(jArr4, 0, jArr6, 0, i28);
                } else {
                    System.arraycopy(jArr4, i28, jArr6, 0, i28);
                }
                i13 = 0;
                while (true) {
                    jArr7 = this.f88388a;
                    if (i13 < jArr7.length) {
                        break;
                    }
                    jArr7[i13] = jArr7[i13] + jArr5[i13];
                    i13++;
                }
                g();
                f();
                c();
                i14 = 0;
                while (true) {
                    jArr8 = this.f88388a;
                    if (i14 < jArr8.length) {
                        break;
                    }
                    jArr8[i14] = jArr8[i14] ^ jArr6[i14];
                    i14++;
                }
                g();
                f();
                c();
                i15 = 0;
                while (true) {
                    jArr9 = this.f88388a;
                    if (i15 < jArr9.length) {
                        break;
                    }
                    jArr9[i15] = jArr9[i15] + jArr5[i15];
                    i15++;
                }
                g();
                f();
                c();
                System.arraycopy(this.f88388a, 0, jArr3, 0, i28);
                long[] jArr15 = this.f88389b;
                i16 = this.f88392e;
                jArr10 = new long[i16];
                jArr11 = new long[i28];
                System.arraycopy(jArr15, 0, jArr10, 0, i16);
                j10 = 281479271743489L;
                i17 = 0;
                while (true) {
                    for (i18 = 0; i18 < i28; i18++) {
                        jArr11[i18] = jArr3[i18] + j10;
                    }
                    for (i19 = 0; i19 < i28; i19++) {
                        this.f88388a[i19] = jArr10[i19] + jArr11[i19];
                    }
                    g();
                    f();
                    c();
                    for (i20 = 0; i20 < i28; i20++) {
                        long[] jArr16 = this.f88388a;
                        jArr16[i20] = jArr16[i20] ^ jArr11[i20];
                    }
                    g();
                    f();
                    c();
                    for (i21 = 0; i21 < i28; i21++) {
                        long[] jArr17 = this.f88388a;
                        jArr17[i21] = jArr17[i21] + jArr11[i21];
                    }
                    System.arraycopy(this.f88388a, 0, this.f88390c[i17], 0, i28);
                    if (this.f88393f != i17) {
                        break;
                    }
                    if (i28 != this.f88392e) {
                        i17 += 2;
                        j10 <<= 1;
                        for (i24 = 0; i24 < i28; i24++) {
                            jArr11[i24] = jArr3[i24] + j10;
                        }
                        for (i25 = 0; i25 < i28; i25++) {
                            this.f88388a[i25] = jArr10[i28 + i25] + jArr11[i25];
                        }
                        g();
                        f();
                        c();
                        for (i26 = 0; i26 < i28; i26++) {
                            long[] jArr18 = this.f88388a;
                            jArr18[i26] = jArr18[i26] ^ jArr11[i26];
                        }
                        g();
                        f();
                        c();
                        for (i27 = 0; i27 < i28; i27++) {
                            long[] jArr19 = this.f88388a;
                            jArr19[i27] = jArr19[i27] + jArr11[i27];
                        }
                        System.arraycopy(this.f88388a, 0, this.f88390c[i17], 0, i28);
                        if (this.f88393f == i17) {
                            break;
                        }
                    }
                    i17 += 2;
                    j10 <<= 1;
                    long j12 = jArr10[0];
                    for (i23 = 1; i23 < i16; i23++) {
                        jArr10[i23 - 1] = jArr10[i23];
                    }
                    jArr10[i16 - 1] = j12;
                }
                for (i22 = 1; i22 < this.f88393f; i22 += 2) {
                    long[][] jArr20 = this.f88390c;
                    jArr12 = jArr20[i22 - 1];
                    jArr13 = jArr20[i22];
                    if (i28 != 2) {
                        long j13 = jArr12[0];
                        long j14 = jArr12[1];
                        jArr13[0] = (j13 >>> 56) | (j14 << 8);
                        jArr13[1] = (j13 << 8) | (j14 >>> 56);
                    } else if (i28 != 4) {
                        long j15 = jArr12[0];
                        long j16 = jArr12[1];
                        long j17 = jArr12[2];
                        long j18 = jArr12[3];
                        jArr13[0] = (j16 >>> 24) | (j17 << 40);
                        jArr13[1] = (j17 >>> 24) | (j18 << 40);
                        jArr13[2] = (j18 >>> 24) | (j15 << 40);
                        jArr13[3] = (j15 >>> 24) | (j16 << 40);
                    } else {
                        if (i28 == 8) {
                            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
                        }
                        long j19 = jArr12[0];
                        long j20 = jArr12[1];
                        long j21 = jArr12[2];
                        long j22 = jArr12[3];
                        long j23 = jArr12[4];
                        long j24 = jArr12[5];
                        long j25 = jArr12[6];
                        long j26 = jArr12[7];
                        jArr13[0] = (j21 >>> 24) | (j22 << 40);
                        jArr13[1] = (j22 >>> 24) | (j23 << 40);
                        jArr13[2] = (j23 >>> 24) | (j24 << 40);
                        jArr13[3] = (j24 >>> 24) | (j25 << 40);
                        jArr13[4] = (j25 >>> 24) | (j26 << 40);
                        jArr13[5] = (j26 >>> 24) | (j19 << 40);
                        jArr13[6] = (j19 >>> 24) | (j20 << 40);
                        jArr13[7] = (j20 >>> 24) | (j21 << 40);
                    }
                }
            }
            i10 = 14;
        }
        this.f88393f = i10;
        this.f88392e = length >>> 6;
        this.f88390c = new long[this.f88393f + 1][];
        i11 = 0;
        while (true) {
            jArr = this.f88390c;
            if (i11 < jArr.length) {
                break;
                break;
            } else {
                jArr[i11] = new long[i28];
                i11++;
            }
        }
        jArr2 = new long[this.f88392e];
        this.f88389b = jArr2;
        if (key.length == (length >>> 3)) {
            throw new IllegalArgumentException("Invalid key parameter passed to DSTU7624Engine init");
        }
        Pack.littleEndianToLong(key, 0, jArr2);
        jArr3 = new long[i28];
        jArr4 = this.f88389b;
        jArr5 = new long[i28];
        jArr6 = new long[i28];
        long[] jArr110 = new long[i28];
        this.f88388a = jArr110;
        long j110 = jArr110[0];
        i12 = this.f88392e;
        jArr110[0] = j110 + ((long) (i28 + i12 + 1));
        System.arraycopy(jArr4, 0, jArr5, 0, i28);
        if (i28 == i12) {
            System.arraycopy(jArr4, 0, jArr6, 0, i28);
        } else {
            System.arraycopy(jArr4, i28, jArr6, 0, i28);
        }
        i13 = 0;
        while (true) {
            jArr7 = this.f88388a;
            if (i13 < jArr7.length) {
                break;
                break;
            } else {
                jArr7[i13] = jArr7[i13] + jArr5[i13];
                i13++;
            }
        }
        g();
        f();
        c();
        i14 = 0;
        while (true) {
            jArr8 = this.f88388a;
            if (i14 < jArr8.length) {
                break;
                break;
            } else {
                jArr8[i14] = jArr8[i14] ^ jArr6[i14];
                i14++;
            }
        }
        g();
        f();
        c();
        i15 = 0;
        while (true) {
            jArr9 = this.f88388a;
            if (i15 < jArr9.length) {
                break;
                break;
            } else {
                jArr9[i15] = jArr9[i15] + jArr5[i15];
                i15++;
            }
        }
        g();
        f();
        c();
        System.arraycopy(this.f88388a, 0, jArr3, 0, i28);
        long[] jArr111 = this.f88389b;
        i16 = this.f88392e;
        jArr10 = new long[i16];
        jArr11 = new long[i28];
        System.arraycopy(jArr111, 0, jArr10, 0, i16);
        j10 = 281479271743489L;
        i17 = 0;
        while (true) {
            while (i18 < i28) {
                jArr11[i18] = jArr3[i18] + j10;
            }
            while (i19 < i28) {
                this.f88388a[i19] = jArr10[i19] + jArr11[i19];
            }
            g();
            f();
            c();
            while (i20 < i28) {
                long[] jArr112 = this.f88388a;
                jArr112[i20] = jArr112[i20] ^ jArr11[i20];
            }
            g();
            f();
            c();
            while (i21 < i28) {
                long[] jArr113 = this.f88388a;
                jArr113[i21] = jArr113[i21] + jArr11[i21];
            }
            System.arraycopy(this.f88388a, 0, this.f88390c[i17], 0, i28);
            if (this.f88393f != i17) {
                break;
                break;
            }
            if (i28 != this.f88392e) {
                i17 += 2;
                j10 <<= 1;
                while (i24 < i28) {
                    jArr11[i24] = jArr3[i24] + j10;
                }
                while (i25 < i28) {
                    this.f88388a[i25] = jArr10[i28 + i25] + jArr11[i25];
                }
                g();
                f();
                c();
                while (i26 < i28) {
                    long[] jArr114 = this.f88388a;
                    jArr114[i26] = jArr114[i26] ^ jArr11[i26];
                }
                g();
                f();
                c();
                while (i27 < i28) {
                    long[] jArr115 = this.f88388a;
                    jArr115[i27] = jArr115[i27] + jArr11[i27];
                }
                System.arraycopy(this.f88388a, 0, this.f88390c[i17], 0, i28);
                if (this.f88393f == i17) {
                    break;
                    break;
                }
            }
            i17 += 2;
            j10 <<= 1;
            long j111 = jArr10[0];
            while (i23 < i16) {
                jArr10[i23 - 1] = jArr10[i23];
            }
            jArr10[i16 - 1] = j111;
        }
        while (i22 < this.f88393f) {
            long[][] jArr21 = this.f88390c;
            jArr12 = jArr21[i22 - 1];
            jArr13 = jArr21[i22];
            if (i28 != 2) {
                long j112 = jArr12[0];
                long j113 = jArr12[1];
                jArr13[0] = (j112 >>> 56) | (j113 << 8);
                jArr13[1] = (j112 << 8) | (j113 >>> 56);
            } else if (i28 != 4) {
                long j114 = jArr12[0];
                long j115 = jArr12[1];
                long j116 = jArr12[2];
                long j117 = jArr12[3];
                jArr13[0] = (j115 >>> 24) | (j116 << 40);
                jArr13[1] = (j116 >>> 24) | (j117 << 40);
                jArr13[2] = (j117 >>> 24) | (j114 << 40);
                jArr13[3] = (j114 >>> 24) | (j115 << 40);
            } else {
                if (i28 == 8) {
                    throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
                }
                long j118 = jArr12[0];
                long j27 = jArr12[1];
                long j28 = jArr12[2];
                long j29 = jArr12[3];
                long j210 = jArr12[4];
                long j211 = jArr12[5];
                long j212 = jArr12[6];
                long j213 = jArr12[7];
                jArr13[0] = (j28 >>> 24) | (j29 << 40);
                jArr13[1] = (j29 >>> 24) | (j210 << 40);
                jArr13[2] = (j210 >>> 24) | (j211 << 40);
                jArr13[3] = (j211 >>> 24) | (j212 << 40);
                jArr13[4] = (j212 >>> 24) | (j213 << 40);
                jArr13[5] = (j213 >>> 24) | (j118 << 40);
                jArr13[6] = (j118 >>> 24) | (j27 << 40);
                jArr13[7] = (j27 >>> 24) | (j28 << 40);
            }
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        long j10;
        long j11;
        long jA;
        long jA2;
        int i12;
        int i13;
        if (this.f88389b == null) {
            throw new IllegalStateException("DSTU7624Engine not initialised");
        }
        if (getBlockSize() + i10 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (getBlockSize() + i11 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        boolean z10 = this.f88394g;
        int i14 = this.f88391d;
        int i15 = 8;
        char c10 = ' ';
        int i16 = 2;
        if (!z10) {
            byte[] bArr3 = f88387o;
            byte[] bArr4 = f88386n;
            byte[] bArr5 = m;
            byte[] bArr6 = f88385l;
            if (i14 != 2) {
                Pack.littleEndianToLong(bArr, i10, this.f88388a);
                long[] jArr = this.f88390c[this.f88393f];
                for (int i17 = 0; i17 < this.f88391d; i17++) {
                    long[] jArr2 = this.f88388a;
                    jArr2[i17] = jArr2[i17] - jArr[i17];
                }
                int i18 = this.f88393f;
                while (true) {
                    for (int i19 = 0; i19 < i14; i19++) {
                        long[] jArr3 = this.f88388a;
                        jArr3[i19] = b(jArr3[i19]);
                    }
                    if (i14 == i16) {
                        long[] jArr4 = this.f88388a;
                        long j12 = jArr4[0];
                        long j13 = jArr4[1];
                        long j14 = (j12 ^ j13) & (-4294967296L);
                        jArr4[0] = j12 ^ j14;
                        jArr4[1] = j13 ^ j14;
                    } else if (i14 == 4) {
                        long[] jArr5 = this.f88388a;
                        long j15 = jArr5[0];
                        long j16 = jArr5[1];
                        long j17 = jArr5[i16];
                        long j18 = jArr5[3];
                        long j19 = (j15 ^ j16) & (-281470681808896L);
                        long j20 = j15 ^ j19;
                        long j21 = j16 ^ j19;
                        long j22 = (j17 ^ j18) & (-281470681808896L);
                        long j23 = j17 ^ j22;
                        long j24 = j18 ^ j22;
                        long j25 = (j20 ^ j23) & (-4294967296L);
                        long j26 = j20 ^ j25;
                        long j27 = j23 ^ j25;
                        long j28 = (j21 ^ j24) & 281474976645120L;
                        jArr5[0] = j26;
                        jArr5[1] = j21 ^ j28;
                        jArr5[i16] = j27;
                        jArr5[3] = j24 ^ j28;
                    } else {
                        if (i14 != i15) {
                            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
                        }
                        long[] jArr6 = this.f88388a;
                        long j29 = jArr6[0];
                        long j30 = jArr6[1];
                        long j31 = jArr6[i16];
                        long j32 = jArr6[3];
                        long j33 = jArr6[4];
                        long j34 = jArr6[5];
                        long j35 = jArr6[6];
                        long j36 = jArr6[7];
                        long j37 = (j29 ^ j30) & (-71777214294589696L);
                        long j38 = j29 ^ j37;
                        long j39 = j30 ^ j37;
                        long j40 = (j31 ^ j32) & (-71777214294589696L);
                        long j41 = j31 ^ j40;
                        long j42 = j32 ^ j40;
                        long j43 = (j33 ^ j34) & (-71777214294589696L);
                        long j44 = j33 ^ j43;
                        long j45 = j34 ^ j43;
                        long j46 = (j35 ^ j36) & (-71777214294589696L);
                        long j47 = j35 ^ j46;
                        long j48 = j36 ^ j46;
                        long j49 = (j38 ^ j41) & (-281470681808896L);
                        long j50 = j38 ^ j49;
                        long j51 = j41 ^ j49;
                        long j52 = (j39 ^ j42) & 72056494543077120L;
                        long j53 = j39 ^ j52;
                        long j54 = j42 ^ j52;
                        long j55 = (j44 ^ j47) & (-281470681808896L);
                        long j56 = j44 ^ j55;
                        long j57 = j47 ^ j55;
                        long j58 = (j45 ^ j48) & 72056494543077120L;
                        long j59 = j45 ^ j58;
                        long j60 = j48 ^ j58;
                        long j61 = (j50 ^ j56) & (-4294967296L);
                        long j62 = j50 ^ j61;
                        long j63 = j56 ^ j61;
                        long j64 = (j53 ^ j59) & 72057594021150720L;
                        long j65 = (j51 ^ j57) & 281474976645120L;
                        long j66 = j51 ^ j65;
                        long j67 = j57 ^ j65;
                        long j68 = (j54 ^ j60) & 1099511627520L;
                        jArr6[0] = j62;
                        jArr6[1] = j53 ^ j64;
                        jArr6[i16] = j66;
                        jArr6[3] = j54 ^ j68;
                        jArr6[4] = j63;
                        jArr6[5] = j59 ^ j64;
                        jArr6[6] = j67;
                        jArr6[7] = j60 ^ j68;
                    }
                    int i20 = 0;
                    while (i20 < i14) {
                        long[] jArr7 = this.f88388a;
                        byte[] bArr7 = bArr6;
                        long j69 = jArr7[i20];
                        int i21 = (int) j69;
                        int i22 = (int) (j69 >>> c10);
                        byte b10 = bArr7[i21 & 255];
                        byte b11 = bArr5[(i21 >>> 8) & 255];
                        int i23 = ((bArr4[(i21 >>> 16) & 255] & 255) << 16) | ((b11 & 255) << 8) | (b10 & 255) | (bArr3[i21 >>> 24] << 24);
                        jArr7[i20] = (((long) ((((bArr7[i22 & 255] & 255) | ((bArr5[(i22 >>> 8) & 255] & 255) << 8)) | ((bArr4[(i22 >>> 16) & 255] & 255) << 16)) | (bArr3[i22 >>> 24] << 24))) << 32) | (((long) i23) & 4294967295L);
                        i20++;
                        i14 = i14;
                        bArr3 = bArr3;
                        bArr6 = bArr7;
                        c10 = ' ';
                    }
                    int i24 = i14;
                    byte[] bArr8 = bArr6;
                    byte[] bArr9 = bArr3;
                    i18--;
                    if (i18 == 0) {
                        long[] jArr8 = this.f88390c[0];
                        for (int i25 = 0; i25 < this.f88391d; i25++) {
                            long[] jArr9 = this.f88388a;
                            jArr9[i25] = jArr9[i25] - jArr8[i25];
                        }
                        Pack.longToLittleEndian(this.f88388a, bArr2, i11);
                    } else {
                        long[] jArr10 = this.f88390c[i18];
                        for (int i26 = 0; i26 < this.f88391d; i26++) {
                            long[] jArr11 = this.f88388a;
                            jArr11[i26] = jArr11[i26] ^ jArr10[i26];
                        }
                        i14 = i24;
                        bArr3 = bArr9;
                        bArr6 = bArr8;
                        i15 = 8;
                        c10 = ' ';
                        i16 = 2;
                    }
                }
            } else {
                long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i10);
                long jLittleEndianToLong2 = Pack.littleEndianToLong(bArr, i10 + 8);
                long[][] jArr12 = this.f88390c;
                int i27 = this.f88393f;
                long[] jArr13 = jArr12[i27];
                long j70 = jLittleEndianToLong - jArr13[0];
                long j71 = jLittleEndianToLong2 - jArr13[1];
                while (true) {
                    long jB = b(j70);
                    long jB2 = b(j71);
                    int i28 = (int) jB;
                    int i29 = (int) (jB >>> 32);
                    int i30 = (int) jB2;
                    int i31 = (int) (jB2 >>> 32);
                    int i32 = (bArr6[i28 & 255] & 255) | ((bArr5[(i28 >>> 8) & 255] & 255) << 8) | ((bArr4[(i28 >>> 16) & 255] & 255) << 16) | (bArr3[i28 >>> 24] << 24);
                    j10 = (((long) ((bArr3[i31 >>> 24] << 24) | (((bArr6[i31 & 255] & 255) | ((bArr5[(i31 >>> 8) & 255] & 255) << 8)) | ((bArr4[(i31 >>> 16) & 255] & 255) << 16)))) << 32) | (((long) i32) & 4294967295L);
                    int i33 = (bArr3[i30 >>> 24] << 24) | (bArr6[i30 & 255] & 255) | ((bArr5[(i30 >>> 8) & 255] & 255) << 8) | ((bArr4[(i30 >>> 16) & 255] & 255) << 16);
                    j11 = (((long) ((bArr3[i29 >>> 24] << 24) | (((bArr6[i29 & 255] & 255) | ((bArr5[(i29 >>> 8) & 255] & 255) << 8)) | ((bArr4[(i29 >>> 16) & 255] & 255) << 16)))) << 32) | (((long) i33) & 4294967295L);
                    i27--;
                    if (i27 == 0) {
                        break;
                    }
                    long[] jArr14 = this.f88390c[i27];
                    long j72 = j10 ^ jArr14[0];
                    j71 = j11 ^ jArr14[1];
                    j70 = j72;
                }
                long[] jArr15 = this.f88390c[0];
                long j73 = j10 - jArr15[0];
                long j74 = j11 - jArr15[1];
                Pack.longToLittleEndian(j73, bArr2, i11);
                Pack.longToLittleEndian(j74, bArr2, i11 + 8);
            }
        } else if (i14 != 2) {
            Pack.littleEndianToLong(bArr, i10, this.f88388a);
            long[] jArr16 = this.f88390c[0];
            for (int i34 = 0; i34 < this.f88391d; i34++) {
                long[] jArr17 = this.f88388a;
                jArr17[i34] = jArr17[i34] + jArr16[i34];
            }
            int i35 = 0;
            while (true) {
                g();
                f();
                c();
                i35++;
                i13 = this.f88393f;
                if (i35 == i13) {
                    break;
                }
                long[] jArr18 = this.f88390c[i35];
                for (int i36 = 0; i36 < this.f88391d; i36++) {
                    long[] jArr19 = this.f88388a;
                    jArr19[i36] = jArr19[i36] ^ jArr18[i36];
                }
            }
            long[] jArr20 = this.f88390c[i13];
            for (int i37 = 0; i37 < this.f88391d; i37++) {
                long[] jArr21 = this.f88388a;
                jArr21[i37] = jArr21[i37] + jArr20[i37];
            }
            Pack.longToLittleEndian(this.f88388a, bArr2, i11);
        } else {
            long jLittleEndianToLong3 = Pack.littleEndianToLong(bArr, i10);
            long jLittleEndianToLong4 = Pack.littleEndianToLong(bArr, i10 + 8);
            long[] jArr22 = this.f88390c[0];
            long j75 = jLittleEndianToLong3 + jArr22[0];
            long j76 = jLittleEndianToLong4 + jArr22[1];
            int i38 = 0;
            while (true) {
                int i39 = (int) j75;
                int i40 = (int) (j75 >>> 32);
                int i41 = (int) j76;
                int i42 = (int) (j76 >>> 32);
                byte[] bArr10 = f88381h;
                byte b12 = bArr10[i39 & 255];
                byte[] bArr11 = f88382i;
                byte b13 = bArr11[(i39 >>> 8) & 255];
                byte[] bArr12 = f88383j;
                byte b14 = bArr12[(i39 >>> 16) & 255];
                byte[] bArr13 = f88384k;
                long j77 = (((long) (((b13 & 255) << 8) | (b12 & 255) | ((b14 & 255) << 16) | (bArr13[i39 >>> 24] << 24))) & 4294967295L) | (((long) ((bArr13[i42 >>> 24] << 24) | (((bArr10[i42 & 255] & 255) | ((bArr11[(i42 >>> 8) & 255] & 255) << 8)) | ((bArr12[(i42 >>> 16) & 255] & 255) << 16)))) << 32);
                int i43 = (bArr10[i41 & 255] & 255) | ((bArr11[(i41 >>> 8) & 255] & 255) << 8) | ((bArr12[(i41 >>> 16) & 255] & 255) << 16) | (bArr13[i41 >>> 24] << 24);
                long j78 = (((long) ((((bArr10[i40 & 255] & 255) | ((bArr11[(i40 >>> 8) & 255] & 255) << 8)) | ((bArr12[(i40 >>> 16) & 255] & 255) << 16)) | (bArr13[i40 >>> 24] << 24))) << 32) | (((long) i43) & 4294967295L);
                jA = a(j77);
                jA2 = a(j78);
                i38++;
                i12 = this.f88393f;
                if (i38 == i12) {
                    break;
                }
                long[] jArr23 = this.f88390c[i38];
                j75 = jA ^ jArr23[0];
                j76 = jA2 ^ jArr23[1];
            }
            long[] jArr24 = this.f88390c[i12];
            long j79 = jA + jArr24[0];
            long j80 = jA2 + jArr24[1];
            Pack.longToLittleEndian(j79, bArr2, i11);
            Pack.longToLittleEndian(j80, bArr2, i11 + 8);
        }
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.f88388a, 0L);
    }
}

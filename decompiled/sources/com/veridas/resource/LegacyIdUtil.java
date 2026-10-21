package com.veridas.resource;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import bk.q;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.budiyev.android.codescanner.BarcodeUtils;
import com.esotericsoftware.asm.Opcodes;
import com.mastercard.sonic.StatusCode;
import com.veridas.detect.ImageAnalysisKt;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LegacyIdUtil.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/veridas/resource/LegacyIdUtil;", "", "()V", "legacyIdToDocumentIdMap", "", "", "", "getDocumentIdFromLegacyId", "legacyId", "getLegacyIdFromDocumentId", "documentId", "(Ljava/lang/String;)Ljava/lang/Integer;", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLegacyIdUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyIdUtil.kt\ncom/veridas/resource/LegacyIdUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,368:1\n288#2,2:369\n*S KotlinDebug\n*F\n+ 1 LegacyIdUtil.kt\ncom/veridas/resource/LegacyIdUtil\n*L\n20#1:369,2\n*E\n"})
public final class LegacyIdUtil {

    @NotNull
    public static final LegacyIdUtil INSTANCE = new LegacyIdUtil();

    @NotNull
    private static final Map<Integer, String> legacyIdToDocumentIdMap = q.mapOf(TuplesKt.to(1, "ES_IDCard_2006"), TuplesKt.to(2, "ES_IDCard_2015"), TuplesKt.to(3, "ES_ResidencePermit_2011"), TuplesKt.to(10, "ES_ResidencePermit_2010"), TuplesKt.to(11, VDConstantDefinition.PASSPORT), TuplesKt.to(13, "AR_IDCard_2009"), TuplesKt.to(14, "AR_IDCard_2012"), TuplesKt.to(20, "PE_IDCard_2013"), TuplesKt.to(21, "PE_IDCard_2007"), TuplesKt.to(22, "CO_IDCard_2000"), TuplesKt.to(23, "CO_ResidencePermit_2016"), TuplesKt.to(24, "PE_IDCard_2020"), TuplesKt.to(30, "CL_IDCard_2002"), TuplesKt.to(31, "CL_IDCard_2013"), TuplesKt.to(40, "VE_IDCard_2011"), TuplesKt.to(50, "PY_IDCard_2007"), TuplesKt.to(51, "PY_IDCard_2009"), TuplesKt.to(60, "PT_IDCard_2015"), TuplesKt.to(61, "PT_DrivingLicense_2013"), TuplesKt.to(70, "DE_IDCard_2007"), TuplesKt.to(71, "DE_IDCard_2010"), TuplesKt.to(72, "DE_DrivingLicense_2004"), TuplesKt.to(73, "DE_DrivingLicense_2013"), TuplesKt.to(80, "BE_IDCard_2008"), TuplesKt.to(81, "BE_IDCard_2010"), TuplesKt.to(82, "BE_DrivingLicense_2010"), TuplesKt.to(83, "BE_DrivingLicense_2013"), TuplesKt.to(90, "FI_IDCard_2011"), TuplesKt.to(91, "FI_IDCard_2017"), TuplesKt.to(92, "FI_DrivingLicense_2010"), TuplesKt.to(93, "FI_DrivingLicense_1992"), TuplesKt.to(94, "FI_DrivingLicense_2013"), TuplesKt.to(100, "FR_IDCard_1994"), TuplesKt.to(101, "FR_DrivingLicense_2013"), TuplesKt.to(102, "FR_IDCard_2021"), TuplesKt.to(110, "NL_IDCard_2011"), TuplesKt.to(111, "NL_IDCard_2014"), TuplesKt.to(112, "NL_DrivingLicense_2013"), TuplesKt.to(113, "NL_DrivingLicense_2014"), TuplesKt.to(114, "NL_DrivingLicense_2006"), TuplesKt.to(120, "IT_IDCard_2004"), TuplesKt.to(121, "IT_IDCard_2016"), TuplesKt.to(122, "IT_DrivingLicense_2000"), TuplesKt.to(123, "IT_DrivingLicense_2013"), TuplesKt.to(124, "IT_IDCard_2017"), TuplesKt.to(130, "CH_IDCard_2003"), TuplesKt.to(131, "CH_DrivingLicense_2003"), TuplesKt.to(140, "AT_IDCard_2002"), TuplesKt.to(141, "AT_DrivingLicense_2006"), TuplesKt.to(142, "AT_DrivingLicense_2014"), TuplesKt.to(143, "AT_IDCard_2010"), TuplesKt.to(144, "AT_DrivingLicense_2004"), TuplesKt.to(145, "AT_ResidencePermit_2011"), TuplesKt.to(146, "AT_ResidencePermit_2005"), TuplesKt.to(150, "PL_IDCard_2001"), TuplesKt.to(151, "PL_IDCard_2015"), TuplesKt.to(152, "PL_DrivingLicense_1999"), TuplesKt.to(153, "PL_DrivingLicense_2013"), TuplesKt.to(154, "PL_DrivingLicense_2004"), TuplesKt.to(160, "RO_IDCard_2009"), TuplesKt.to(161, "RO_DrivingLicense_2013"), TuplesKt.to(170, "SE_IDCard_2012"), TuplesKt.to(171, "SE_DrivingLicense_2016"), TuplesKt.to(180, "BG_IDCard_2006"), TuplesKt.to(181, "BG_IDCard_2010"), TuplesKt.to(182, "BG_DrivingLicense_2013"), TuplesKt.to(183, "BG_DrivingLicense_2002"), TuplesKt.to(190, "HR_IDCard_2003"), TuplesKt.to(Integer.valueOf(Opcodes.ATHROW), "HR_IDCard_2015"), TuplesKt.to(192, "HR_DrivingLicense_2013"), TuplesKt.to(200, "HU_IDCard_2000"), TuplesKt.to(201, "HU_IDCard_2015"), TuplesKt.to(202, "HU_DrivingLicense_2013"), TuplesKt.to(Integer.valueOf(ErrorCodes.ERR_CRY_IO_PROPERTIES), "GB_DrivingLicense_2015"), TuplesKt.to(211, "GB_DrivingLicense_2007"), TuplesKt.to(Integer.valueOf(ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE), "GB_DrivingLicense_1998"), TuplesKt.to(Integer.valueOf(ErrorCodes.ERR_CRY_BAD_PIN_SIZE), "GB_DrivingLicense_2014"), TuplesKt.to(225, "GB_DrivingLicense-PL_2015"), TuplesKt.to(223, "GB_DrivingLicense-PL_2007"), TuplesKt.to(222, "GB_DrivingLicense-PL_1998"), TuplesKt.to(224, "GB_DrivingLicense-PL_2014"), TuplesKt.to(220, "IE_Passport_2015"), TuplesKt.to(221, "IE_DrivingLicense_2013"), TuplesKt.to(Integer.valueOf(ImageAnalysisKt.OVER_EXPOSED_THRESHOLD), "DK_DrivingLicense_1997"), TuplesKt.to(231, "DK_DrivingLicense_2013"), TuplesKt.to(240, "IS_DrivingLicense_2001"), TuplesKt.to(241, "IS_DrivingLicense_2013"), TuplesKt.to(250, "NO_DrivingLicense_1998"), TuplesKt.to(251, "NO_DrivingLicense_2007"), TuplesKt.to(252, "NO_DrivingLicense_2013"), TuplesKt.to(260, "CZ_IDCard_2003"), TuplesKt.to(261, "CZ_IDCard_2014"), TuplesKt.to(262, "CZ_DrivingLicense_2013"), TuplesKt.to(Integer.valueOf(BarcodeUtils.ROTATION_270), "SK_IDCard_2015"), TuplesKt.to(271, "SK_DrivingLicense_2008"), TuplesKt.to(272, "SK_DrivingLicense_2013"), TuplesKt.to(280, "UA_IDCard_2016"), TuplesKt.to(290, "CY_IDCard_2008"), TuplesKt.to(291, "CY_IDCard_2015"), TuplesKt.to(292, "CY_DrivingLicense_2015"), TuplesKt.to(300, "SI_IDCard_1998"), TuplesKt.to(301, "SI_DrivingLicense_2013"), TuplesKt.to(302, "SI_DrivingLicense_2009"), TuplesKt.to(311, "GR_DrivingLicense_2013"), TuplesKt.to(320, "ES_DrivingLicense_2013"), TuplesKt.to(321, "ES_IDCard_2015"), TuplesKt.to(322, "ES_IDCard_2006"), TuplesKt.to(323, "ES_ResidencePermit_2010"), TuplesKt.to(324, "ES_ResidencePermit_2011"), TuplesKt.to(325, "ES_DrivingLicense_2004"), TuplesKt.to(326, "ES_ResidencePermit_2020"), TuplesKt.to(330, "EE_IDCard_2011"), TuplesKt.to(331, "EE_DrivingLicense_2004"), TuplesKt.to(332, "EE_DrivingLicense_2013"), TuplesKt.to(340, "LV_IDCard_2012"), TuplesKt.to(Integer.valueOf(ResultCode.ERROR_CONN_SSL_GENERIC), "LT_IDCard_2002"), TuplesKt.to(Integer.valueOf(ResultCode.ERROR_CONN_SSL_INIT), "LT_IDCard_2009"), TuplesKt.to(360, "BA_IDCard_2003"), TuplesKt.to(361, "BA_IDCard_2013"), TuplesKt.to(370, "ME_IDCard_2008"), TuplesKt.to(380, "LI_IDCard_1995"), TuplesKt.to(381, "LI_IDCard_2009"), TuplesKt.to(382, "LI_DrivingLicense_2003"), TuplesKt.to(390, "AL_IDCard_2009"), TuplesKt.to(400, "MD_IDCard_2015"), TuplesKt.to(410, "MK_IDCard_2007"), TuplesKt.to(Integer.valueOf(TypedValues.CycleType.TYPE_EASING), "RS_IDCard_2008"), TuplesKt.to(Integer.valueOf(LoginHelperConstants.MAINTENANCE_RESPONSE_CODE), "MC_IDCard_2009"), TuplesKt.to(440, "LU_IDCard_2014"), TuplesKt.to(441, "LU_DrivingLicense_2013"), TuplesKt.to(450, "MT_IDCard_2002"), TuplesKt.to(451, "MT_IDCard_2014"), TuplesKt.to(452, "MT_DrivingLicense_2003"), TuplesKt.to(453, "MT_DrivingLicense_2013"), TuplesKt.to(460, "LV_DrivingLicense_2004"), TuplesKt.to(461, "LV_DrivingLicense_2013"), TuplesKt.to(470, "LT_DrivingLicense_2016"), TuplesKt.to(471, "LT_DrivingLicense_2007"), TuplesKt.to(480, "BY_DrivingLicense_2010"), TuplesKt.to(490, "AD_DrivingLicense_1990"), TuplesKt.to(500, "US-SC_DrivingLicense_2018"), TuplesKt.to(501, "US-SC_DrivingLicense_2011"), TuplesKt.to(Integer.valueOf(TypedValues.PositionType.TYPE_POSITION_TYPE), "US-LA_DrivingLicense_2016"), TuplesKt.to(511, "US-LA_DrivingLicense_2011"), TuplesKt.to(511, "US-LA_DrivingLicense_2011"), TuplesKt.to(520, "US-AR_DrivingLicense_2016"), TuplesKt.to(Integer.valueOf(ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY), "US-AR_DrivingLicense_2018"), TuplesKt.to(530, "US-GA_DrivingLicense_2012"), TuplesKt.to(531, "US-GA_DrivingLicense_2007"), TuplesKt.to(540, "US-NC_DrivingLicense_2017"), TuplesKt.to(541, "US-NC_DrivingLicense_2007"), TuplesKt.to(550, "US-CO_DrivingLicense_2016"), TuplesKt.to(551, "US-CO_DrivingLicense_2011"), TuplesKt.to(560, "US-AZ_DrivingLicense_2016"), TuplesKt.to(561, "US-AZ_DrivingLicense_2004"), TuplesKt.to(562, "US-AZ_DrivingLicense_1996"), TuplesKt.to(563, "US-AZ_DrivingLicense_1990"), TuplesKt.to(570, "US-MS_DrivingLicense_2017"), TuplesKt.to(571, "US-MS_DrivingLicense_2001"), TuplesKt.to(580, "US-AL_DrivingLicense_2013"), TuplesKt.to(581, "US-AL_IDCard_2013"), TuplesKt.to(590, "US-KS_DrivingLicense_2017"), TuplesKt.to(591, "US-KS_DrivingLicense_2004"), TuplesKt.to(600, "US-OK_DrivingLicense_2018"), TuplesKt.to(Integer.valueOf(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS), "US-TX_DrivingLicense_2016"), TuplesKt.to(Integer.valueOf(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE), "US-TX_IDCard_2016"), TuplesKt.to(620, "US-NM_DrivingLicense_2014"), TuplesKt.to(620, "US-NM_DrivingLicense_2014"), TuplesKt.to(630, "US-CA_DrivingLicense_2018"), TuplesKt.to(640, "US-NV_DrivingLicense_2014"), TuplesKt.to(650, "US-FL_DrivingLicense_2017"), TuplesKt.to(670, "US-CT_DrivingLicense_2017"), TuplesKt.to(690, "US-HI_DrivingLicense_2012"), TuplesKt.to(691, "US-HI_DrivingLicense_2018"), TuplesKt.to(760, "US-ME_DrivingLicense_2011"), TuplesKt.to(710, "US-IL_DrivingLicense_2016"), TuplesKt.to(711, "US-IL_DrivingLicense_2007"), TuplesKt.to(720, "US-ID_DrivingLicense_2010"), TuplesKt.to(Integer.valueOf(com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes.BLUETOOTH_PERMISSION), "US-ID_DrivingLicense_2017"), TuplesKt.to(Integer.valueOf(com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes.STORAGE_PERMISSION), "US-ID_DrivingLicense_2004"), TuplesKt.to(770, "US-MD_DrivingLicense_2016"), TuplesKt.to(771, "US-MD_DrivingLicense_2013"), TuplesKt.to(780, "US-MI_DrivingLicense_2017"), TuplesKt.to(730, "US-TN_DrivingLicense_2012"), TuplesKt.to(731, "US-TN_DrivingLicense_2003"), TuplesKt.to(740, "US-DC_DrivingLicense_2017"), TuplesKt.to(790, "US-MA_DrivingLicense_2018"), TuplesKt.to(791, "US-MA_DrivingLicense_2010"), TuplesKt.to(750, "US-AK_DrivingLicense_2014"), TuplesKt.to(751, "US-AK_DrivingLicense_2018"), TuplesKt.to(752, "US-AK_DrivingLicense_2005"), TuplesKt.to(810, "US-IN_DrivingLicense_2010"), TuplesKt.to(811, "US-IN_DrivingLicense_2017"), TuplesKt.to(830, "US-NE_DrivingLicense_2013"), TuplesKt.to(850, "US-NH_DrivingLicense_2017"), TuplesKt.to(851, "US-NH_DrivingLicense_2006"), TuplesKt.to(860, "US-NY_DrivingLicense_2008"), TuplesKt.to(860, "US-NY_DrivingLicense_2008"), TuplesKt.to(880, "US-OH_DrivingLicense_2018"), TuplesKt.to(881, "US-OH_DrivingLicense_2014"), TuplesKt.to(882, "US-OH_DrivingLicense_2013"), TuplesKt.to(890, "US-WV_DrivingLicense_2013"), TuplesKt.to(891, "US-WV_DrivingLicense_2005"), TuplesKt.to(Integer.valueOf(TypedValues.Custom.TYPE_INT), "US-UT_DrivingLicense_2016"), TuplesKt.to(901, "US-UT_DrivingLicense_2006"), TuplesKt.to(Integer.valueOf(TypedValues.Custom.TYPE_INT), "US-UT_DrivingLicense_2016"), TuplesKt.to(901, "US-UT_DrivingLicense_2006"), TuplesKt.to(902, "MX_IDCard_2008"), TuplesKt.to(903, "MX_IDCard_2019"), TuplesKt.to(904, "MX_ResidencePermit_2010"), TuplesKt.to(Integer.valueOf(StatusCode.ERROR_WHILE_PLAYING_HAPTICS), "AR_IDCard_2009"), TuplesKt.to(911, "AR_IDCard_2012"), TuplesKt.to(921, "US-SD_DrivingLicense_2010"), TuplesKt.to(930, "US-WI_DrivingLicense_2015"), TuplesKt.to(931, "US-WI_DrivingLicense_2005"), TuplesKt.to(940, "US-PA_DrivingLicense_2017"), TuplesKt.to(941, "US-PA_DrivingLicense_2011"), TuplesKt.to(950, "US-VT_DrivingLicense_2014"), TuplesKt.to(951, "US-VT_DrivingLicense_2018"), TuplesKt.to(960, "US-VA_IDCard_2018"), TuplesKt.to(960, "US-VA_IDCard_2018"), TuplesKt.to(970, "US-WY_DrivingLicense_2014"), TuplesKt.to(1000, "US-RI_DrivingLicense_2018"), TuplesKt.to(Integer.valueOf(PointerIconCompat.TYPE_ALIAS), "US-WA_DrivingLicense_2017"), TuplesKt.to(Integer.valueOf(PointerIconCompat.TYPE_COPY), "US-WA_DrivingLicense_2019"), TuplesKt.to(Integer.valueOf(PointerIconCompat.TYPE_NO_DROP), "US-WA_DrivingLicense_2010"), TuplesKt.to(Integer.valueOf(PointerIconCompat.TYPE_GRAB), "US-MO_DrivingLicense_2012"), TuplesKt.to(Integer.valueOf(PointerIconCompat.TYPE_GRABBING), "US-MO_DrivingLicense_2004"), TuplesKt.to(1030, "US-MT_DrivingLicense_2000"), TuplesKt.to(1031, "US-MT_DrivingLicense_2008"), TuplesKt.to(1040, "GT_IDCard_2009"), TuplesKt.to(1120, "AU-WA_DrivingLicense_2014"), TuplesKt.to(1130, "AU-TAS_DrivingLicense_2015"), TuplesKt.to(1140, "AU-QLD_DrivingLicense_2016"), TuplesKt.to(1150, "AU-QLD_DrivingLicense_2011"), TuplesKt.to(1160, "AU-NT_DrivingLicense_2006"), TuplesKt.to(1170, "AU-NSW_DrivingLicense_2013"), TuplesKt.to(1180, "AU-SA_DrivingLicense_2014"), TuplesKt.to(1190, "AU-VIC_DrivingLicense_2009"), TuplesKt.to(1200, "AU-ACT_DrivingLicense_2011"), TuplesKt.to(Integer.valueOf(ReturnCode.ERR_CRY_DES_GENERATION), "AU-WA_DrivingLicense_2011"), TuplesKt.to(1220, "CA-AB_DrivingLicense_2009"), TuplesKt.to(Integer.valueOf(ReturnCode.ERR_CRY_MAC_BAD_ALG_RSA), "CA-AB_IDCard_2018"), TuplesKt.to(1250, "CA-QC_DrivingLicense_2015"), TuplesKt.to(1260, "CA-SK_DrivingLicense_2016"), TuplesKt.to(Integer.valueOf(ReturnCode.ERR_CRY_ENC_INVALID_KEY), "CA-SK_IDCard_2014"), TuplesKt.to(1270, "CA-YT_DrivingLicense_2010"), TuplesKt.to(1280, "CA-PE_DrivingLicense_2017"), TuplesKt.to(1290, "CA-ON_DrivingLicense_2007"), TuplesKt.to(1291, "CA-ON_IDCard_2011"), TuplesKt.to(Integer.valueOf(ReturnCode.ERR_CONFIG), "CA-NU_DrivingLicense_2009"), TuplesKt.to(Integer.valueOf(ReturnCode.ERR_CONFIG_VERIFY_SIGN_IO_ERROR), "CA-MB_DrivingLicense_2014"), TuplesKt.to(1360, "CA-NS_DrivingLicense_2017"), TuplesKt.to(10307, "CA-NB_DrivingLicense_2017"), TuplesKt.to(1341, "UY_IDCard_1999"), TuplesKt.to(1340, "UY_IDCard_2015"), TuplesKt.to(1350, "TR_IDCard_2016"), TuplesKt.to(1390, "RU_DrivingLicense_2011"), TuplesKt.to(1380, "US-CT_DrivingLicense_2009"), TuplesKt.to(1410, "US-KS_DrivingLicense_2012"), TuplesKt.to(1420, "US-DE_DrivingLicense_2010"), TuplesKt.to(1430, "US-IA_DrivingLicense_2013"), TuplesKt.to(1431, "US-IA_DrivingLicense_2018"), TuplesKt.to(1440, "US-FL_DrivingLicense_2010"), TuplesKt.to(1450, "US-CA_DrivingLicense_2008"), TuplesKt.to(1460, "US-RI_DrivingLicense_2008"), TuplesKt.to(1470, "US-WI_DrivingLicense_2012"), TuplesKt.to(1481, "US-MN_DrivingLicense_2004"), TuplesKt.to(1480, "US-MN_DrivingLicense_2018"), TuplesKt.to(1490, "PL_IDCard_2019"), TuplesKt.to(1500, "NZ_DrivingLicense_2007"), TuplesKt.to(1510, "SE_DrivingLicense_2013"), TuplesKt.to(1520, "PT_DrivingLicense_1999"), TuplesKt.to(1530, "CA-NT_DrivingLicense_2005"), TuplesKt.to(1540, "CA-NL_DrivingLicense_2017"), TuplesKt.to(1540, "CA-NL_DrivingLicense_2017"), TuplesKt.to(1550, "CA-BC_DrivingLicense_2013"), TuplesKt.to(1551, "CA-BC_IDCard_2009"), TuplesKt.to(1552, "CA-BC_IDCard_2013"), TuplesKt.to(1560, "CN_IDCard_2004"), TuplesKt.to(1581, "BR_DrivingLicense_2017"), TuplesKt.to(1580, "BR_DrivingLicense_2019"), TuplesKt.to(1582, "BR_IDCard_2014"), TuplesKt.to(1570, "US-DE_DrivingLicense_2018"), TuplesKt.to(1592, "US-KY_DrivingLicense_2019"), TuplesKt.to(1593, "US-KY_DrivingLicense_2012"), TuplesKt.to(Integer.valueOf(ReturnCode.ERR_STORE_PUTTING_DATA), "US-NJ_DrivingLicense_2011"), TuplesKt.to(1612, "US-ND_DrivingLicense_2018"), TuplesKt.to(1613, "US-ND_DrivingLicense_2006"), TuplesKt.to(1612, "US-ND_DrivingLicense_2018"), TuplesKt.to(1613, "US-ND_DrivingLicense_2006"), TuplesKt.to(Integer.valueOf(ReturnCode.ERR_HTTP), "PA_IDCard_2010"), TuplesKt.to(Integer.valueOf(ReturnCode.ERR_HTTP_KEY_NOT_FOUND), "MY_IDCard_2012"), TuplesKt.to(1702, "DO_IDCard_1998"), TuplesKt.to(1703, "DO_IDCard_2014"), TuplesKt.to(1614, "US_IDCard-MilitaryRS_1993"), TuplesKt.to(1615, "US_IDCard-MilitaryRT_1993"), TuplesKt.to(1616, "US_IDCard-MilitaryRR_1993"), TuplesKt.to(1704, "PH_DrivingLicense_2017"), TuplesKt.to(1706, "PH_IDCard_2011"), TuplesKt.to(1707, "PH_IDCard_2015"), TuplesKt.to(1708, "PH_IDCard_2016"), TuplesKt.to(1709, "PH_IDCard-PO_2016"), TuplesKt.to(1724, "US_ResidencePermit_2017"), TuplesKt.to(1726, "IT_HealthCard_2004"), TuplesKt.to(1723, "CO_IDCard_2020"), TuplesKt.to(1724, "US_ResidencePermit_2017"), TuplesKt.to(1730, "NO_IDCard_2020"), TuplesKt.to(1731, "ES_IDCard_2021"), TuplesKt.to(1750, "ES_ResidencePermit_2007"), TuplesKt.to(1752, "AT_ResidencePermit_2020"), TuplesKt.to(1732, "RU_IDCard_2007"), TuplesKt.to(1758, "AT_IDCard_2021"), TuplesKt.to(1759, "GB_DrivingLicense_2021"), TuplesKt.to(1760, "DE_IDCard_2021"), TuplesKt.to(1761, "FI_IDCard_2021"), TuplesKt.to(1762, "CY_IDCard_2021"), TuplesKt.to(1763, "PT_ResidencePermit_2017"), TuplesKt.to(1764, "PT_ResidencePermit_2019"), TuplesKt.to(1766, "MX_ProfessionalCard_2008"), TuplesKt.to(1767, "AD_ResidencePermit_2018"), TuplesKt.to(1768, "FR_DrivingLicense_2006"), TuplesKt.to(25, "PE_ResidencePermit_2017"), TuplesKt.to(1767, "AD_ResidencePermit_2018"), TuplesKt.to(1769, "EC_IDCard_2009"), TuplesKt.to(1770, "AM_IDCard_2012"), TuplesKt.to(1772, "ZA_IDCard_2013"), TuplesKt.to(1771, "ZA_DrivingLicense_2004"), TuplesKt.to(1773, "GB_DrivingLicense_2022"), TuplesKt.to(1774, "GB_DrivingLicense_2012"), TuplesKt.to(1775, "PT_ResidencePermit_2020"), TuplesKt.to(1776, "IT_HealthCard_2022"), TuplesKt.to(1777, "GB_ResidencePermit_2015"), TuplesKt.to(1780, "GB_ResidencePermit_2021"), TuplesKt.to(9000, "XX_XX_XXXX"), TuplesKt.to(9001, VDConstantDefinition.PASSPORT));

    private LegacyIdUtil() {
    }

    @JvmStatic
    @Nullable
    public static final String getDocumentIdFromLegacyId(int legacyId) {
        return legacyIdToDocumentIdMap.get(Integer.valueOf(legacyId));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v4 java.lang.Object, still in use, count: 2, list:
          (r1v4 java.lang.Object) from 0x0067: PHI (r1 I:??) = (r1v1 java.lang.Object), (r1v4 java.lang.Object) binds: [B:24:0x0066, B:32:0x0067] A[DONT_GENERATE, DONT_INLINE]
          (r1v4 java.lang.Object) from 0x0059: CHECK_CAST (java.util.Map$Entry) (r1v4 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer getLegacyIdFromDocumentId(@org.jetbrains.annotations.NotNull java.lang.String r4) {
        /*
            java.lang.String r0 = "documentId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.hashCode()
            switch(r0) {
                case -1915195732: goto L39;
                case -1915195731: goto L2a;
                case -778038361: goto L1c;
                case -778038331: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L41
        Ld:
            java.lang.String r0 = "ES_IDCard_2015"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L16
            goto L41
        L16:
            r4 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L7a
        L1c:
            java.lang.String r0 = "ES_IDCard_2006"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L41
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L7a
        L2a:
            java.lang.String r0 = "ES_ResidencePermit_2011"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L33
            goto L41
        L33:
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L7a
        L39:
            java.lang.String r0 = "ES_ResidencePermit_2010"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L74
        L41:
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.veridas.resource.LegacyIdUtil.legacyIdToDocumentIdMap
            java.util.Set r0 = r0.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L4d:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()
            r3 = r1
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L4d
            goto L67
        L66:
            r1 = r2
        L67:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto L72
            java.lang.Object r4 = r1.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            goto L7a
        L72:
            r4 = r2
            goto L7a
        L74:
            r4 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L7a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veridas.resource.LegacyIdUtil.getLegacyIdFromDocumentId(java.lang.String):java.lang.Integer");
    }
}

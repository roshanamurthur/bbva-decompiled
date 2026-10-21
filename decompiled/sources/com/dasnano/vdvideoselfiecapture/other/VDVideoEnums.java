package com.dasnano.vdvideoselfiecapture.other;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.budiyev.android.codescanner.BarcodeUtils;
import com.esotericsoftware.asm.Opcodes;
import com.veridas.detect.ImageAnalysisKt;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class VDVideoEnums {

    @Keep
    public enum VDVideoDocumentType {
        VDVIDEO_ERROR_DOCUMENT(0),
        VDVIDEO_SPAIN_DNI_20(1),
        VDVIDEO_SPAIN_DNI_30(2),
        VDVIDEO_SPAIN_NIE_2011(3),
        VDVIDEO_MEXICO_IFE_B(4),
        VDVIDEO_MEXICO_IFE_C(5),
        VDVIDEO_MEXICO_IFE_E(7),
        VDVIDEO_SPAIN_NIE_2010(10),
        VDVIDEO_PASSPORT(11),
        VDVIDEO_MALAYSIA_2001(12),
        VDVIDEO_ARGENTINA_2009(13),
        VDVIDEO_ARGENTINA_2012(14),
        VDVIDEO_PERU_2013(20),
        VDVIDEO_PE_IDCARD_2007(21),
        VDVIDEO_CO_IDCARD_2000(22),
        VDVIDEO_CL_IDCARD_2002(30),
        VDVIDEO_CL_IDCARD_2013(31),
        VDVIDEO_VE_IDCARD_2011(40),
        VDVIDEO_PY_IDCARD_2007(50),
        VDVIDEO_PY_IDCARD_2009(51),
        VDVIDEO_PT_IDCARD_2015(60),
        VDVIDEO_DE_IDCARD_2007(70),
        VDVIDEO_DE_IDCARD_2010(71),
        VDVIDEO_BE_IDCARD_2008(80),
        VDVIDEO_BE_IDCARD_2010(81),
        VDVIDEO_FI_IDCARD_2011(90),
        VDVIDEO_FI_IDCARD_2017(91),
        VDVIDEO_FR_IDCARD_1994(100),
        VDVIDEO_NL_IDCARD_2011(110),
        VDVIDEO_NL_IDCARD_2014(111),
        VDVIDEO_IT_IDCARD_2004(120),
        VDVIDEO_IT_IDCARD_2016(121),
        VDVIDEO_CH_IDCARD_2003(130),
        VDVIDEO_AT_IDCARD_2002(140),
        VDVIDEO_AT_IDCARD_2010(143),
        VDVIDEO_AT_IDCARD_2014(143),
        VDVIDEO_AT_DRIVINGLICENSE_2004(144),
        VDVIDEO_AT_DRIVINGLICENSE_2006(141),
        VDVIDEO_AT_DRIVINGLICENSE_2014(142),
        VDVIDEO_PL_IDCARD_2001(150),
        VDVIDEO_PL_IDCARD_2015(151),
        VDVIDEO_RO_IDCARD_2009(160),
        VDVIDEO_SE_IDCARD_2012(170),
        VDVIDEO_BG_IDCARD_2006(180),
        VDVIDEO_BG_IDCARD_2010(181),
        VDVIDEO_HR_IDCARD_2003(190),
        VDVIDEO_HR_IDCARD_2015(Opcodes.ATHROW),
        VDVIDEO_HU_IDCARD_2000(200),
        VDVIDEO_HU_IDCARD_2015(201),
        VDVIDEO_GB_DRIVINGLICENSE_2015(ErrorCodes.ERR_CRY_IO_PROPERTIES),
        VDVIDEO_IE_PASSPORT_2015(220),
        VDVIDEO_DK_DRIVINGLICENSE_1997(ImageAnalysisKt.OVER_EXPOSED_THRESHOLD),
        VDVIDEO_DK_DRIVINGLICENSE_2013(231),
        VDVIDEO_IS_DRIVINGLICENSE_2001(240),
        VDVIDEO_IS_DRIVINGLICENSE_2013(241),
        VDVIDEO_NO_DRIVINGLICENSE_1998(250),
        VDVIDEO_NO_DRIVINGLICENSE_2007(251),
        VDVIDEO_NO_DRIVINGLICENSE_2013(252),
        VDVIDEO_CZ_IDCARD_2003(260),
        VDVIDEO_CZ_IDCARD_2014(261),
        VDVIDEO_SK_IDCARD_2015(BarcodeUtils.ROTATION_270),
        VDVIDEO_UA_IDCARD_2016(280),
        VDVIDEO_CY_IDCARD_2008(290),
        VDVIDEO_CY_IDCARD_2015(291),
        VDVIDEO_SI_IDCARD_1998(300),
        VDVIDEO_ES_DRIVINGLICENSE_2013(320),
        VDVIDEO_CY_DrivingLicense_2015(292),
        VDVIDEO_HU_DrivingLicense_2013(202),
        VDVIDEO_ME_IDCard_2008(370),
        VDVIDEO_RO_DrivingLicense_2013(161),
        VDVIDEO_MD_IDCard_2015(400),
        VDVIDEO_US_DrivingLicense_2016_NM(620),
        VDVIDEO_DE_DrivingLicense_2013(73),
        VDVIDEO_DE_DrivingLicense_2004(72),
        VDVIDEO_US_DrivingLicense_2016_AZ(560),
        VDVIDEO_BA_IDCard_2013(361),
        VDVIDEO_BA_IDCard_2003(360),
        VDVIDEO_FR_DrivingLicense_2013(101),
        VDVIDEO_BG_DrivingLicense_2002(183),
        VDVIDEO_BG_DrivingLicense_2013(182),
        VDVIDEO_US_DrivingLicense_2018_CA(630),
        VDVIDEO_FI_DrivingLicense_2013(94),
        VDVIDEO_FI_DrivingLicense_1992(93),
        VDVIDEO_FI_DrivingLicense_2010(92),
        VDVIDEO_RS_IDCard_2008(TypedValues.CycleType.TYPE_EASING),
        VDVIDEO_US_DrivingLicense_2012_GA(530),
        VDVIDEO_SK_DrivingLicense_2013(272),
        VDVIDEO_SK_DrivingLicense_2008(271),
        VDVIDEO_US_DrivingLicense_2016_AR(520),
        VDVIDEO_CH_DrivingLicense_2003(131),
        VDVIDEO_MC_IDCard_2009(LoginHelperConstants.MAINTENANCE_RESPONSE_CODE),
        VDVIDEO_GR_DrivingLicense_2013(311),
        VDVIDEO_HR_DrivingLicense_2013(192),
        VDVIDEO_US_DrivingLicense_2017_KS(590),
        VDVIDEO_AL_IDCard_2009(390),
        VDVIDEO_LI_DrivingLicense_2003(382),
        VDVIDEO_US_DrivingLicense_2010_DE(660),
        VDVIDEO_PT_DrivingLicense_2013(61),
        VDVIDEO_SE_DrivingLicense_2016(171),
        VDVIDEO_GB_DrivingLicense_2007(211),
        VDVIDEO_GB_DrivingLicense_1998(ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE),
        VDVIDEO_CZ_DrivingLicense_2013(262),
        VDVIDEO_NL_DrivingLicense_2013(112),
        VDVIDEO_NL_DrivingLicense_2014(113),
        VDVIDEO_NL_DrivingLicense_2006(114),
        VDVIDEO_US_DrivingLicense_2011_CT(670),
        VDVIDEO_AD_DrivingLicense_1990(490),
        VDVIDEO_US_DrivingLicense_2014_NV(640),
        VDVIDEO_US_DrivingLicense_2016_CO(550),
        VDVIDEO_US_DrivingLicense_2018_SC(500),
        VDVIDEO_US_DrivingLicense_2016_LA(TypedValues.PositionType.TYPE_POSITION_TYPE),
        VDVIDEO_PL_DrivingLicense_1999(152),
        VDVIDEO_PL_DrivingLicense_2013(153),
        VDVIDEO_PL_DrivingLicense_2004(154),
        VDVIDEO_US_DrivingLicense_2017_MS(570),
        VDVIDEO_LV_IDCard_2012(340),
        VDVIDEO_LV_DrivingLicense_2004(460),
        VDVIDEO_LV_DrivingLicense_2013(461),
        VDVIDEO_LU_IDCard_2014(440),
        VDVIDEO_LU_DrivingLicense_2013(441),
        VDVIDEO_IE_DrivingLicense_2013(221),
        VDVIDEO_US_DrivingLicense_2017_NC(540),
        VDVIDEO_US_DrivingLicense_2016_TX(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS),
        VDVIDEO_US_DrivingLicense_2017_FL(650),
        VDVIDEO_MT_IDCard_2002(450),
        VDVIDEO_MT_IDCard_2014(451),
        VDVIDEO_MT_DrivingLicense_2003(452),
        VDVIDEO_MT_DrivingLicense_2013(453),
        VDVIDEO_MK_IDCard_2007(410),
        VDVIDEO_BY_DrivingLicense_2010(480),
        VDVIDEO_BE_DrivingLicense_2010(82),
        VDVIDEO_BE_DrivingLicense_2013(83),
        VDVIDEO_LT_IDCard_2002(ResultCode.ERROR_CONN_SSL_GENERIC),
        VDVIDEO_LT_IDCard_2009(ResultCode.ERROR_CONN_SSL_INIT),
        VDVIDEO_LT_DrivingLicense_2016(470),
        VDVIDEO_LT_DrivingLicense_2007(471),
        VDVIDEO_US_DrivingLicense_2018_OK(600),
        VDVIDEO_SI_DrivingLicense_2013(301),
        VDVIDEO_SI_DrivingLicense_2009(302),
        VDVIDEO_IT_DrivingLicense_2000(122),
        VDVIDEO_IT_DrivingLicense_2013(123),
        VDVIDEO_EE_IDCard_2011(330),
        VDVIDEO_EE_DrivingLicense_2004(331),
        VDVIDEO_EE_DrivingLicense_2013(332),
        VDVIDEO_US_DrivingLicense_2013_AL(580),
        VDVIDEO_LI_IDCard_1995(380),
        VDVIDEO_LI_IDCard_2009(381),
        VDVIDEO_PT_RESIDENCEPERMIT_2020(1775),
        VDVIDEO_IT_HEALTHCARD_2022(1776),
        VDVIDEO_GB_RESIDENCEPERMIT_2015(1777),
        VDVIDEO_GB_RESIDENCEPERMIT_2021(1780),
        VDVIDEO_XX_XX_XXXX(9000),
        VDVIDEO_XX(9002);

        private int mValue;
        public static final VDVideoDocumentType[] values = values();
        private static final Map<Integer, VDVideoDocumentType> intToTypeMap = new HashMap();

        static {
            for (VDVideoDocumentType vDVideoDocumentType : values()) {
                intToTypeMap.put(Integer.valueOf(vDVideoDocumentType.mValue), vDVideoDocumentType);
            }
        }

        VDVideoDocumentType(int i10) {
            this.mValue = i10;
        }

        public static VDVideoDocumentType fromInt(int i10) {
            VDVideoDocumentType vDVideoDocumentType = intToTypeMap.get(Integer.valueOf(i10));
            return vDVideoDocumentType == null ? VDVIDEO_ERROR_DOCUMENT : vDVideoDocumentType;
        }

        public int getOrdinal() {
            return this.mValue;
        }
    }

    public static VDVideoDocumentType fromInteger(int i10) {
        return VDVideoDocumentType.fromInt(i10);
    }
}

package com.bbva.ethermobilesdk.token.ocra;

import com.bbva.ethermobilesdk.token.model.EtherTokenError;
import com.bbva.ethermobilesdk.token.model.EtherTokenErrorType;
import com.bbva.ethermobilesdk.token.model.OcraSuite;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.k;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OcraParser.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/token/ocra/OcraParser;", "", "", "raw", "Lcom/bbva/ethermobilesdk/token/model/OcraSuite;", "parse", "<init>", "()V", "Companion", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOcraParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcraParser.kt\ncom/bbva/ethermobilesdk/token/ocra/OcraParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,104:1\n1#2:105\n1282#3,2:106\n1282#3,2:108\n1282#3,2:110\n*S KotlinDebug\n*F\n+ 1 OcraParser.kt\ncom/bbva/ethermobilesdk/token/ocra/OcraParser\n*L\n54#1:106,2\n64#1:108,2\n85#1:110,2\n*E\n"})
public final class OcraParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Regex f30123a = new Regex("(OCRA-[0-9]{1,2}:HOTP-[a-zA-Z0-9]+-[0-9]{1,2}:[cC-]*[a-zA-Z0-9]+-T[0-9]{1,2}[HMS])");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Regex f30124b = new Regex("T([0-9]{1,2})[HMS]");

    @NotNull
    public final OcraSuite parse(@NotNull String raw) throws EtherTokenError {
        MatchGroupCollection groups;
        String strSubstring;
        OtpFunction otpFunction;
        boolean z10;
        OtpChallengeType otpChallengeType;
        OtpTimeUnit otpTimeUnit;
        MatchGroupCollection groups2;
        MatchGroup matchGroup;
        String strSubstring2;
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(raw, "raw");
        MatchResult matchResultFind$default = Regex.find$default(f30123a, raw, 0, 2, null);
        if (matchResultFind$default != null && (groups = matchResultFind$default.getGroups()) != null) {
            if (groups.size() != 2) {
                groups = null;
            }
            if (groups != null) {
                int i10 = 1;
                MatchGroup matchGroup2 = groups.get(1);
                if (matchGroup2 != null && (strSubstring = StringsKt__StringsKt.substring(raw, matchGroup2.getRange())) != null) {
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) strSubstring, new String[]{DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER}, false, 0, 6, (Object) null);
                    if (listSplit$default.size() != 3) {
                        throw new EtherTokenError(EtherTokenErrorType.INVALID_OCRA_SUITE, null, 2, null);
                    }
                    String str = (String) listSplit$default.get(0);
                    OtpFunction[] otpFunctionArrValues = OtpFunction.values();
                    int length = otpFunctionArrValues.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            otpFunction = null;
                            break;
                        }
                        OtpFunction otpFunction2 = otpFunctionArrValues[i11];
                        if (l.startsWith$default((String) listSplit$default.get(1), otpFunction2.getValue(), false, 2, null)) {
                            otpFunction = otpFunction2;
                            break;
                        }
                        i11++;
                    }
                    if (otpFunction == null) {
                        throw new EtherTokenError(EtherTokenErrorType.INVALID_OCRA_SUITE, null, 2, null);
                    }
                    Integer intOrNull2 = k.toIntOrNull(StringsKt__StringsKt.removePrefix((String) listSplit$default.get(1), (CharSequence) (otpFunction.getValue() + Constant.DASH_STRING)));
                    if (intOrNull2 == null) {
                        throw new EtherTokenError(EtherTokenErrorType.INVALID_OCRA_SUITE, null, 2, null);
                    }
                    OtpLength otpLength = new OtpLength(intOrNull2.intValue());
                    List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(2), new String[]{Constant.DASH_STRING}, false, 0, 6, (Object) null);
                    if (listSplit$default2.size() < 2) {
                        throw new EtherTokenError(EtherTokenErrorType.INVALID_OCRA_SUITE, null, 2, null);
                    }
                    if (l.startsWith$default((String) listSplit$default2.get(0), "C", false, 2, null)) {
                        listSplit$default2 = CollectionsKt___CollectionsKt.drop(listSplit$default2, 1);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    OtpChallengeType[] otpChallengeTypeArrValues = OtpChallengeType.values();
                    int length2 = otpChallengeTypeArrValues.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length2) {
                            otpChallengeType = null;
                            break;
                        }
                        otpChallengeType = otpChallengeTypeArrValues[i12];
                        if (l.startsWith$default((String) listSplit$default2.get(0), otpChallengeType.name(), false, 2, null)) {
                            break;
                        }
                        i12++;
                    }
                    if (otpChallengeType == null) {
                        throw new EtherTokenError(EtherTokenErrorType.INVALID_OCRA_SUITE, null, 2, null);
                    }
                    Integer intOrNull3 = k.toIntOrNull(StringsKt__StringsKt.removePrefix((String) listSplit$default2.get(0), (CharSequence) otpChallengeType.name()));
                    if (intOrNull3 == null) {
                        throw new EtherTokenError(EtherTokenErrorType.INVALID_OCRA_SUITE, null, 2, null);
                    }
                    int iIntValue = intOrNull3.intValue();
                    OtpTimeUnit[] otpTimeUnitArrValues = OtpTimeUnit.values();
                    int length3 = otpTimeUnitArrValues.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length3) {
                            otpTimeUnit = null;
                            break;
                        }
                        otpTimeUnit = otpTimeUnitArrValues[i13];
                        if (l.endsWith$default((String) listSplit$default2.get(i10), otpTimeUnit.name(), false, 2, null)) {
                            break;
                        }
                        i13++;
                        i10 = 1;
                    }
                    if (otpTimeUnit == null) {
                        throw new EtherTokenError(EtherTokenErrorType.INVALID_OCRA_SUITE, null, 2, null);
                    }
                    MatchResult matchResultFind$default2 = Regex.find$default(f30124b, (CharSequence) listSplit$default2.get(1), 0, 2, null);
                    if (matchResultFind$default2 != null && (groups2 = matchResultFind$default2.getGroups()) != null) {
                        if (groups2.size() != 2) {
                            groups2 = null;
                        }
                        if (groups2 != null && (matchGroup = groups2.get(1)) != null && (strSubstring2 = StringsKt__StringsKt.substring((String) listSplit$default2.get(1), matchGroup.getRange())) != null && (intOrNull = k.toIntOrNull(strSubstring2)) != null) {
                            return new OcraSuite(str, otpFunction, otpLength, new OtpTimeStep(intOrNull.intValue(), otpTimeUnit), otpChallengeType, iIntValue, z10);
                        }
                    }
                    throw new EtherTokenError(EtherTokenErrorType.INVALID_OCRA_SUITE, null, 2, null);
                }
            }
        }
        throw new EtherTokenError(EtherTokenErrorType.INVALID_OCRA_SUITE, null, 2, null);
    }
}

package com.vierge.pinpadsdk.params;

import com.google.gson.Gson;
import com.mypinpad.tsdk.isolation.y2;
import com.vierge.pinpadsdk.error.ERROR_CODE;
import com.vierge.pinpadsdk.utils.Utils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class Param {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f67568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67569b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67570a;

        static {
            int[] iArr = new int[PARAM_FORMAT.values().length];
            f67570a = iArr;
            try {
                iArr[PARAM_FORMAT.ALFA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67570a[PARAM_FORMAT.NUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67570a[PARAM_FORMAT.ALFANUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67570a[PARAM_FORMAT.FILEAPK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67570a[PARAM_FORMAT.BINARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67570a[PARAM_FORMAT.BOLEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67570a[PARAM_FORMAT.HEXADECIMAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f67570a[PARAM_FORMAT.TAG.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public Param(String str, String str2) {
        new Gson();
        this.f67569b = str2;
        this.f67568a = str;
    }

    public String getParamName() {
        return this.f67569b;
    }

    public String getRawValue() {
        return this.f67568a;
    }

    public void isNullParam() throws ExceptionParam {
        if (this.f67568a == null) {
            throw new ExceptionParam(ERROR_CODE.ParameterError, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    public void isValidFormat(PARAM_FORMAT param_format) throws ExceptionParam {
        Pattern patternCompile;
        byte[] bArrHexStrToAsciiArray;
        isNullParam();
        int[] iArr = a.f67570a;
        switch (iArr[param_format.ordinal()]) {
            case 1:
                patternCompile = Pattern.compile("[a-zA-Z]+$");
                if (!patternCompile.matcher(this.f67568a).matches()) {
                    throw new ExceptionParam(ERROR_CODE.InvalidParameterFormat, this);
                }
                if (iArr[param_format.ordinal()] != 8) {
                    return;
                }
                bArrHexStrToAsciiArray = Utils.hexStrToAsciiArray(this.f67568a);
                if (bArrHexStrToAsciiArray.length > 1 || bArrHexStrToAsciiArray[1] + 1 != bArrHexStrToAsciiArray.length - 1) {
                    throw new ExceptionParam(ERROR_CODE.InvalidParameterFormat, this);
                }
                return;
            case 2:
                patternCompile = Pattern.compile("[0-9]+$");
                if (!patternCompile.matcher(this.f67568a).matches()) {
                    throw new ExceptionParam(ERROR_CODE.InvalidParameterFormat, this);
                }
                if (iArr[param_format.ordinal()] != 8) {
                    return;
                }
                bArrHexStrToAsciiArray = Utils.hexStrToAsciiArray(this.f67568a);
                if (bArrHexStrToAsciiArray.length > 1) {
                    break;
                }
                throw new ExceptionParam(ERROR_CODE.InvalidParameterFormat, this);
            case 3:
                patternCompile = Pattern.compile("^[A-Za-z0-9]+$");
                if (!patternCompile.matcher(this.f67568a).matches()) {
                    throw new ExceptionParam(ERROR_CODE.InvalidParameterFormat, this);
                }
                if (iArr[param_format.ordinal()] != 8) {
                    return;
                }
                bArrHexStrToAsciiArray = Utils.hexStrToAsciiArray(this.f67568a);
                if (bArrHexStrToAsciiArray.length > 1) {
                    break;
                }
                throw new ExceptionParam(ERROR_CODE.InvalidParameterFormat, this);
            case 4:
                patternCompile = Pattern.compile("(.*\\.apk)");
                if (!patternCompile.matcher(this.f67568a).matches()) {
                    throw new ExceptionParam(ERROR_CODE.InvalidParameterFormat, this);
                }
                if (iArr[param_format.ordinal()] != 8) {
                    return;
                }
                bArrHexStrToAsciiArray = Utils.hexStrToAsciiArray(this.f67568a);
                if (bArrHexStrToAsciiArray.length > 1) {
                    break;
                }
                throw new ExceptionParam(ERROR_CODE.InvalidParameterFormat, this);
            case 5:
                patternCompile = Pattern.compile("[0-1]+$");
                if (!patternCompile.matcher(this.f67568a).matches()) {
                    throw new ExceptionParam(ERROR_CODE.InvalidParameterFormat, this);
                }
                if (iArr[param_format.ordinal()] != 8) {
                    return;
                }
                bArrHexStrToAsciiArray = Utils.hexStrToAsciiArray(this.f67568a);
                if (bArrHexStrToAsciiArray.length > 1) {
                    break;
                }
                throw new ExceptionParam(ERROR_CODE.InvalidParameterFormat, this);
            case 6:
                try {
                    Boolean.parseBoolean(this.f67568a);
                    break;
                } catch (Exception unused) {
                    throw new ExceptionParam(ERROR_CODE.InvalidParameterFormat, this);
                }
            case 7:
            case 8:
                patternCompile = Pattern.compile("^[0-9A-F]*$");
                if (!patternCompile.matcher(this.f67568a).matches()) {
                    throw new ExceptionParam(ERROR_CODE.InvalidParameterFormat, this);
                }
                if (iArr[param_format.ordinal()] != 8) {
                    return;
                }
                bArrHexStrToAsciiArray = Utils.hexStrToAsciiArray(this.f67568a);
                if (bArrHexStrToAsciiArray.length > 1) {
                    break;
                }
                throw new ExceptionParam(ERROR_CODE.InvalidParameterFormat, this);
            default:
                patternCompile = null;
                if (!patternCompile.matcher(this.f67568a).matches()) {
                    throw new ExceptionParam(ERROR_CODE.InvalidParameterFormat, this);
                }
                if (iArr[param_format.ordinal()] != 8) {
                    return;
                }
                bArrHexStrToAsciiArray = Utils.hexStrToAsciiArray(this.f67568a);
                if (bArrHexStrToAsciiArray.length > 1) {
                    break;
                }
                throw new ExceptionParam(ERROR_CODE.InvalidParameterFormat, this);
        }
    }

    public void isValidLen(int[] iArr) throws ExceptionParam {
        for (int i10 : iArr) {
            if (getRawValue().length() == i10) {
                throw new ExceptionParam(ERROR_CODE.InvalidParameterLength, this);
            }
        }
    }

    public void isValidMaxLen(int i10) throws ExceptionParam {
        if (getRawValue().length() > i10) {
            throw new ExceptionParam(ERROR_CODE.InvalidParameterLength, this);
        }
    }

    public void leftPadding(char c10, int i10) throws ExceptionParam {
        if (this.f67568a.length() > i10) {
            throw new ExceptionParam(ERROR_CODE.InvalidParameterLength, this);
        }
        while (this.f67568a.length() < i10) {
            this.f67568a = c10 + this.f67568a;
        }
    }

    public void rightPadding(char c10, int i10) throws ExceptionParam {
        if (this.f67568a.length() > i10) {
            throw new ExceptionParam(ERROR_CODE.InvalidParameterLength, this);
        }
        while (this.f67568a.length() < i10) {
            this.f67568a = y2.b(new StringBuilder(), this.f67568a, c10);
        }
    }
}

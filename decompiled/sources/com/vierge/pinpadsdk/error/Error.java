package com.vierge.pinpadsdk.error;

import androidx.camera.core.processing.f;
import com.vierge.pinpadsdk.params.Param;

/* JADX INFO: loaded from: classes6.dex */
public class Error {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67536a;

        static {
            int[] iArr = new int[ERROR_CODE.values().length];
            f67536a = iArr;
            try {
                iArr[ERROR_CODE.ErrorWhileReadingFile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67536a[ERROR_CODE.ErrorBothScriptsCannotBeEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67536a[ERROR_CODE.ParameterError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67536a[ERROR_CODE.InvalidParameterLength.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67536a[ERROR_CODE.InvalidParameterFormat.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public Error(String str, ERROR_CODE error_code, String str2) {
        error_code.getValue();
    }

    public static String getDescription(ERROR_CODE error_code) {
        int i10 = a.f67536a[error_code.ordinal()];
        if (i10 == 1) {
            return "Error while reading file";
        }
        if (i10 == 2) {
            return "Both scripts cannot be empty";
        }
        if (i10 == 3) {
            return "Parameter error";
        }
        if (i10 != 4) {
            return i10 != 5 ? "Canceled or other error" : "Invalid parameter format";
        }
        return "Invalid parameter length";
    }

    public static String getDescription(ERROR_CODE error_code, Param param) {
        StringBuilder sbE = f.e(getDescription(error_code), " in param: ");
        sbE.append(param.getParamName());
        return sbE.toString();
    }
}

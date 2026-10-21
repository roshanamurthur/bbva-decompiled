package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.a;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.Arrays;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public class KeyParser {
    public static void main(String[] strArr) {
        parseAttributes("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    public static TypedBundle parseAttributes(String str) {
        TypedBundle typedBundle = new TypedBundle();
        try {
            CLObject cLObject = CLParser.parse(str);
            int size = cLObject.size();
            for (int i10 = 0; i10 < size; i10++) {
                CLKey cLKey = (CLKey) cLObject.get(i10);
                String strContent = cLKey.content();
                CLElement value = cLKey.getValue();
                int iA = a.a(strContent);
                if (iA == -1) {
                    System.err.println("unknown type " + strContent);
                } else {
                    int iB = a.b(iA);
                    if (iB == 1) {
                        typedBundle.add(iA, cLObject.getBoolean(i10));
                    } else if (iB == 2) {
                        typedBundle.add(iA, value.getInt());
                        System.out.println("parse " + strContent + " INT_MASK > " + value.getInt());
                    } else if (iB == 4) {
                        typedBundle.add(iA, value.getFloat());
                        System.out.println("parse " + strContent + " FLOAT_MASK > " + value.getFloat());
                    } else if (iB == 8) {
                        typedBundle.add(iA, value.content());
                        System.out.println("parse " + strContent + " STRING_MASK > " + value.content());
                    }
                }
            }
        } catch (CLParsingException e5) {
            System.err.println(e5.toString() + RootService.LINE_BREAK + Arrays.toString(e5.getStackTrace()).replace(Constant.BRACKET_OPEN, "   at ").replace(",", "\n   at").replace(Constant.BRACKET_CLOSE, ""));
        }
        return typedBundle;
    }
}

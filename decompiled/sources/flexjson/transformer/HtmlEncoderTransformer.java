package flexjson.transformer;

import androidx.appcompat.app.i;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.esotericsoftware.asm.Opcodes;
import com.veridas.detect.ImageAnalysisKt;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class HtmlEncoderTransformer extends AbstractTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f68524a = new HashMap();

    public HtmlEncoderTransformer() {
        HashMap map = f68524a;
        if (map.isEmpty()) {
            i.f(34, map, "&quot;", 38, "&amp;");
            i.f(60, map, "&lt;", 62, "&gt;");
            i.f(160, map, "&nbsp;", 169, "&copy;");
            i.f(174, map, "&reg;", 192, "&Agrave;");
            i.f(Opcodes.INSTANCEOF, map, "&Aacute;", Opcodes.MONITORENTER, "&Acirc;");
            i.f(Opcodes.MONITOREXIT, map, "&Atilde;", 196, "&Auml;");
            i.f(Opcodes.MULTIANEWARRAY, map, "&Aring;", Opcodes.IFNULL, "&AElig;");
            i.f(Opcodes.IFNONNULL, map, "&Ccedil;", 200, "&Egrave;");
            i.f(201, map, "&Eacute;", 202, "&Ecirc;");
            i.f(203, map, "&Euml;", 204, "&Igrave;");
            i.f(205, map, "&Iacute;", 206, "&Icirc;");
            i.f(207, map, "&Iuml;", ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, "&ETH;");
            i.f(ErrorCodes.ERR_CRY_BAD_PROTO, map, "&Ntilde;", ErrorCodes.ERR_CRY_IO_PROPERTIES, "&Ograve;");
            i.f(211, map, "&Oacute;", ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, "&Ocirc;");
            i.f(ErrorCodes.ERR_CRY_BAD_PIN_SIZE, map, "&Otilde;", ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, "&Ouml;");
            i.f(216, map, "&Oslash;", 217, "&Ugrave;");
            i.f(218, map, "&Uacute;", 219, "&Ucirc;");
            i.f(220, map, "&Uuml;", 221, "&Yacute;");
            i.f(222, map, "&THORN;", 223, "&szlig;");
            i.f(224, map, "&agrave;", 225, "&aacute;");
            i.f(226, map, "&acirc;", 227, "&atilde;");
            i.f(228, map, "&auml;", 229, "&aring;");
            i.f(ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, map, "&aelig;", 231, "&ccedil;");
            i.f(232, map, "&egrave;", 233, "&eacute;");
            i.f(234, map, "&ecirc;", 235, "&euml;");
            i.f(236, map, "&igrave;", 237, "&iacute;");
            i.f(238, map, "&icirc;", 239, "&iuml;");
            i.f(240, map, "&eth;", 241, "&ntilde;");
            i.f(242, map, "&ograve;", 243, "&oacute;");
            i.f(244, map, "&ocirc;", 245, "&otilde;");
            i.f(246, map, "&ouml;", 248, "&oslash;");
            i.f(249, map, "&ugrave;", 250, "&uacute;");
            i.f(251, map, "&ucirc;", 252, "&uuml;");
            i.f(253, map, "&yacute;", 254, "&thorn;");
            i.f(255, map, "&yuml;", 8364, "&euro;");
        }
    }

    @Override // flexjson.transformer.Transformer
    public void transform(Object obj) {
        if (obj == null) {
            getContext().write(AbstractJsonLexerKt.NULL);
            return;
        }
        String string = obj.toString();
        getContext().write("\"");
        for (int i10 = 0; i10 < string.length(); i10++) {
            char cCharAt = string.charAt(i10);
            HashMap map = f68524a;
            if (map.containsKey(Integer.valueOf(cCharAt))) {
                getContext().write((String) map.get(Integer.valueOf(cCharAt)));
            } else if (cCharAt > 128) {
                getContext().write("&#");
                getContext().write(String.valueOf((int) cCharAt));
                getContext().write(ReplenishLogic.ID_SEPARATOR);
            } else {
                getContext().write(String.valueOf(string.charAt(i10)));
            }
        }
        getContext().write("\"");
    }
}

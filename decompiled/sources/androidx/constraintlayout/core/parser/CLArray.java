package androidx.constraintlayout.core.parser;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        String json = toJSON();
        if (i11 > 0 || json.length() + i10 >= CLElement.sMaxLine) {
            sb2.append("[\n");
            boolean z10 = true;
            for (CLElement cLElement : this.f18962r0) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(",\n");
                }
                addIndent(sb2, CLElement.sBaseIndent + i10);
                sb2.append(cLElement.toFormattedJSON(CLElement.sBaseIndent + i10, i11 - 1));
            }
            sb2.append(RootService.LINE_BREAK);
            addIndent(sb2, i10);
            sb2.append(Constant.BRACKET_CLOSE);
        } else {
            sb2.append(json);
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb2 = new StringBuilder(getDebugName() + Constant.BRACKET_OPEN);
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f18962r0.size(); i10++) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(this.f18962r0.get(i10).toJSON());
        }
        return ((Object) sb2) + Constant.BRACKET_CLOSE;
    }
}

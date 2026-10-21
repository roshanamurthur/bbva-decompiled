package q;

import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;

/* JADX INFO: compiled from: CardViewApi21Impl.java */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class a {
    public static c a(b bVar) {
        return (c) ((CardView.a) bVar).f2343a;
    }

    public final void b(b bVar, float f6) {
        c cVarA = a(bVar);
        CardView.a aVar = (CardView.a) bVar;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (f6 != cVarA.f92732e || cVarA.f92733f != useCompatPadding || cVarA.f92734g != preventCornerOverlap) {
            cVarA.f92732e = f6;
            cVarA.f92733f = useCompatPadding;
            cVarA.f92734g = preventCornerOverlap;
            cVarA.b(null);
            cVarA.invalidateSelf();
        }
        c(bVar);
    }

    public final void c(b bVar) {
        CardView.a aVar = (CardView.a) bVar;
        if (!CardView.this.getUseCompatPadding()) {
            aVar.a(0, 0, 0, 0);
            return;
        }
        float f6 = a(bVar).f92732e;
        float f10 = a(bVar).f92728a;
        CardView cardView = CardView.this;
        int iCeil = (int) Math.ceil(d.a(f6, f10, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(d.b(f6, f10, cardView.getPreventCornerOverlap()));
        aVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }
}

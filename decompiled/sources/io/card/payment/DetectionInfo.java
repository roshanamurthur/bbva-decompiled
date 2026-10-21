package io.card.payment;

/* JADX INFO: loaded from: classes7.dex */
class DetectionInfo {
    public boolean bottomEdge;
    public boolean complete = false;
    public CreditCard detectedCard;
    public int expiry_month;
    public int expiry_year;
    public float focusScore;
    public boolean leftEdge;
    public int[] prediction;
    public boolean rightEdge;
    public boolean topEdge;

    public DetectionInfo() {
        int[] iArr = new int[16];
        this.prediction = iArr;
        iArr[0] = -1;
        iArr[15] = -1;
        this.detectedCard = new CreditCard();
    }

    public final CreditCard a() {
        int i10;
        String str = new String();
        for (int i11 = 0; i11 < 16 && (i10 = this.prediction[i11]) >= 0 && i10 < 10; i11++) {
            StringBuilder sbD = androidx.camera.core.impl.utils.c.d(str);
            sbD.append(String.valueOf(this.prediction[i11]));
            str = sbD.toString();
        }
        CreditCard creditCard = this.detectedCard;
        creditCard.cardNumber = str;
        creditCard.expiryMonth = this.expiry_month;
        creditCard.expiryYear = this.expiry_year;
        return creditCard;
    }
}

import{c as o}from"./7f3d7ca9.js";import{a as e,h as t,i as s,b as r}from"./952f98a9.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";class n extends(e(o)){static get is(){return"bbva-promotion-coupons-es-api-dm"}static get scopedElements(){const o=[r];return n.scopedElementsFromClasses(o)}async getPromotionCoupons(o){var e;await this.updateComplete;const t=this.shadowRoot.getElementById("promotionCoupons"),s=null===(e=this.localCustomProperties)||void 0===e?void 0:e.customerId;t.path=`salePromotions/V03/${o}/coupons?customerId=${s}`,t.generateRequest()}render(){return t`
      ${this.promotionCouponsDM}
    `}get promotionCouponsDM(){return t`
      <bbva-core-generic-dp
        id="promotionCoupons"
        requirestoken
        cross-domain
        host="${this.host}"
        method="GET"
        headers="${s(((o,e)=>{let t={};if(o.includes("ASO")){const o="x-dm-local-",e=window.sessionStorage;t=Object.keys(e).filter((e=>e.startsWith(o))).reduce(((t,s)=>(t[s.replace(o,"")]=e.getItem(s),t)),{})}return JSON.stringify({...e,...t})})(this.host,this.headers))}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
      >
      </bbva-core-generic-dp>
    `}async _handleLocalDMSuccess(o){const e=await this._responseMapping(o.detail.items);this.dispatchEvent(new CustomEvent("promotion-coupons-api-dm-fetch",{bubbles:!0,composed:!0,detail:e})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:e}))}_handleLocalDMError(o){this._handleError("promotion-coupons-api-dm-fetch-error",this.shadowRoot.querySelector("#promotionCoupons"))(o.detail)}_responseMapping(o){if(null==o||!o.length)return[];const e=[];return o[0].urls.forEach((function(o,t){let s="CODE",r="Discount code";"coupon_mobile"!==o.type.id&&"coupon"!==o.type.id||(s="QR",r="Discount Qr"),"coupon"!==o.type.id&&e.push({id:t,image:{id:t,name:o.type.id,url:o.url.href},couponType:{id:s,name:r},couponData:o.url.href})})),e}}customElements.define(n.is,n);export{n as BbvaPromotionCouponsEsApiDm};
